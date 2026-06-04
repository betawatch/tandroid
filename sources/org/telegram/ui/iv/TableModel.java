package org.telegram.ui.iv;

import j$.util.Comparator$-CC;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.ToIntFunction;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_iv;

/* loaded from: classes3.dex */
public class TableModel {
    public int[][] anchorC;
    public int[][] anchorR;
    private final ArrayList anchorsRowMajor = new ArrayList();
    public final TL_iv.pageBlockTable block;
    public int colCount;
    public TL_iv.pageTableCell[][] grid;
    public int rowCount;

    public TableModel(TL_iv.pageBlockTable pageblocktable) {
        this.block = pageblocktable;
        rebuildFromBlock();
    }

    public void rebuildFromBlock() {
        int i;
        int i2;
        int i3;
        ArrayList<TL_iv.pageTableRow> arrayList = this.block.rows;
        this.rowCount = arrayList == null ? 0 : arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i = this.rowCount;
            if (i4 >= i) {
                break;
            }
            TL_iv.pageTableRow pagetablerow = this.block.rows.get(i4);
            int i6 = 0;
            for (int i7 = 0; i7 < pagetablerow.cells.size(); i7++) {
                i6 += spanCol(pagetablerow.cells.get(i7));
            }
            if (i6 > i5) {
                i5 = i6;
            }
            i4++;
        }
        TL_iv.pageTableCell[][] pagetablecellArr = (TL_iv.pageTableCell[][]) Array.newInstance((Class<?>) TL_iv.pageTableCell.class, Math.max(i, 1), Math.max(i5, 1));
        int[] iArr = {Math.max(this.rowCount, 1), Math.max(i5, 1)};
        Class cls = Integer.TYPE;
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) cls, iArr);
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) cls, Math.max(this.rowCount, 1), Math.max(i5, 1));
        int i8 = 0;
        while (true) {
            i2 = -1;
            if (i8 >= iArr2.length) {
                break;
            }
            for (int i9 = 0; i9 < iArr2[0].length; i9++) {
                iArr2[i8][i9] = -1;
                iArr3[i8][i9] = -1;
            }
            i8++;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i3 = this.rowCount;
            if (i10 >= i3) {
                break;
            }
            TL_iv.pageTableRow pagetablerow2 = this.block.rows.get(i10);
            int i12 = 0;
            int i13 = 0;
            while (i12 < pagetablerow2.cells.size()) {
                TL_iv.pageTableCell pagetablecell = pagetablerow2.cells.get(i12);
                int spanCol = spanCol(pagetablecell);
                int spanRow = spanRow(pagetablecell);
                while (i13 < i5 && pagetablecellArr[i10][i13] != null) {
                    i13++;
                }
                int i14 = i13 + spanCol;
                if (i14 > i5) {
                    i5 = Math.max(i14, i5 * 2);
                    pagetablecellArr = growCols(pagetablecellArr, i5);
                    iArr2 = growIntCols(iArr2, i5, i2);
                    iArr3 = growIntCols(iArr3, i5, i2);
                }
                for (int i15 = i10; i15 < i10 + spanRow && i15 < this.rowCount; i15++) {
                    for (int i16 = i13; i16 < i14; i16++) {
                        pagetablecellArr[i15][i16] = pagetablecell;
                        iArr2[i15][i16] = i10;
                        iArr3[i15][i16] = i13;
                    }
                }
                if (i14 > i11) {
                    i11 = i14;
                }
                i12++;
                i13 = i14;
                i2 = -1;
            }
            i10++;
            i2 = -1;
        }
        this.colCount = i11;
        this.grid = (TL_iv.pageTableCell[][]) Array.newInstance((Class<?>) TL_iv.pageTableCell.class, Math.max(i3, 1), Math.max(this.colCount, 1));
        int[] iArr4 = {Math.max(this.rowCount, 1), Math.max(this.colCount, 1)};
        Class cls2 = Integer.TYPE;
        this.anchorR = (int[][]) Array.newInstance((Class<?>) cls2, iArr4);
        this.anchorC = (int[][]) Array.newInstance((Class<?>) cls2, Math.max(this.rowCount, 1), Math.max(this.colCount, 1));
        for (int i17 = 0; i17 < this.rowCount; i17++) {
            for (int i18 = 0; i18 < this.colCount; i18++) {
                TL_iv.pageTableCell[][] pagetablecellArr2 = this.grid;
                pagetablecellArr2[i17][i18] = pagetablecellArr[i17][i18];
                this.anchorR[i17][i18] = iArr2[i17][i18];
                this.anchorC[i17][i18] = iArr3[i17][i18];
                if (pagetablecellArr2[i17][i18] == null) {
                    TL_iv.pageTableCell newEmptyCell = newEmptyCell();
                    this.grid[i17][i18] = newEmptyCell;
                    this.anchorR[i17][i18] = i17;
                    this.anchorC[i17][i18] = i18;
                    this.block.rows.get(i17).cells.add(newEmptyCell);
                }
            }
        }
        rebuildAnchorList();
    }

    public boolean isAnchor(int i, int i2) {
        return i >= 0 && i2 >= 0 && i < this.rowCount && i2 < this.colCount && this.anchorR[i][i2] == i && this.anchorC[i][i2] == i2;
    }

    public List anchors() {
        return this.anchorsRowMajor;
    }

    public int flatIndexOfAnchor(TL_iv.pageTableCell pagetablecell) {
        return this.anchorsRowMajor.indexOf(pagetablecell);
    }

    public int anchorRowOf(TL_iv.pageTableCell pagetablecell) {
        for (int i = 0; i < this.rowCount; i++) {
            for (int i2 = 0; i2 < this.colCount; i2++) {
                if (this.grid[i][i2] == pagetablecell) {
                    return this.anchorR[i][i2];
                }
            }
        }
        return -1;
    }

    public int anchorColOf(TL_iv.pageTableCell pagetablecell) {
        for (int i = 0; i < this.rowCount; i++) {
            for (int i2 = 0; i2 < this.colCount; i2++) {
                if (this.grid[i][i2] == pagetablecell) {
                    return this.anchorC[i][i2];
                }
            }
        }
        return -1;
    }

    public static int spanCol(TL_iv.pageTableCell pagetablecell) {
        int i = pagetablecell.colspan;
        if (i != 0) {
            return i;
        }
        return 1;
    }

    public static int spanRow(TL_iv.pageTableCell pagetablecell) {
        int i = pagetablecell.rowspan;
        if (i != 0) {
            return i;
        }
        return 1;
    }

    public static TL_iv.pageTableCell newEmptyCell() {
        TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
        applyPlainText(pagetablecell, "");
        return pagetablecell;
    }

    public static void setHeader(TL_iv.pageTableCell pagetablecell, boolean z) {
        if (pagetablecell == null) {
            return;
        }
        pagetablecell.header = z;
        pagetablecell.flags = z ? pagetablecell.flags | 1 : pagetablecell.flags & (-2);
    }

    public void addRow() {
        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
        pagetablerow.cells = new ArrayList<>();
        int max = Math.max(this.colCount, 1);
        for (int i = 0; i < max; i++) {
            pagetablerow.cells.add(newEmptyCell());
        }
        this.block.rows.add(pagetablerow);
        rebuildFromBlock();
    }

    public void addColumn() {
        if (this.block.rows.isEmpty()) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            ArrayList<TL_iv.pageTableCell> arrayList = new ArrayList<>();
            pagetablerow.cells = arrayList;
            arrayList.add(newEmptyCell());
            this.block.rows.add(pagetablerow);
        } else {
            Iterator<TL_iv.pageTableRow> it = this.block.rows.iterator();
            while (it.hasNext()) {
                TL_iv.pageTableRow next = it.next();
                if (next.cells == null) {
                    next.cells = new ArrayList<>();
                }
                next.cells.add(newEmptyCell());
            }
        }
        rebuildFromBlock();
    }

    public boolean mergeCells(Set set) {
        int anchorRowOf;
        if (set == null || set.size() < 2) {
            return false;
        }
        Iterator it = set.iterator();
        int i = -1;
        int i2 = -1;
        int i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i4 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        while (it.hasNext()) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
            int anchorRowOf2 = anchorRowOf(pagetablecell);
            int anchorColOf = anchorColOf(pagetablecell);
            int spanRow = spanRow(pagetablecell);
            int spanCol = spanCol(pagetablecell);
            i3 = Math.min(i3, anchorRowOf2);
            i4 = Math.min(i4, anchorColOf);
            i2 = Math.max(i2, (anchorRowOf2 + spanRow) - 1);
            i = Math.max(i, (anchorColOf + spanCol) - 1);
        }
        HashSet hashSet = new HashSet();
        for (int i5 = i3; i5 <= i2; i5++) {
            for (int i6 = i4; i6 <= i; i6++) {
                if (i5 < 0 || i6 < 0 || i5 >= this.rowCount || i6 >= this.colCount) {
                    return false;
                }
                hashSet.add(this.grid[i5][i6]);
            }
        }
        if (!hashSet.equals(new HashSet(set))) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList, new Comparator() { // from class: org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$mergeCells$0;
                lambda$mergeCells$0 = TableModel.this.lambda$mergeCells$0((TL_iv.pageTableCell) obj, (TL_iv.pageTableCell) obj2);
                return lambda$mergeCells$0;
            }
        });
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String readPlainText = readPlainText((TL_iv.pageTableCell) it2.next());
            if (!readPlainText.isEmpty()) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(readPlainText);
            }
        }
        TL_iv.pageTableCell pagetablecell2 = this.grid[i3][i4];
        int i7 = (i - i4) + 1;
        int i8 = (i2 - i3) + 1;
        if (i7 <= 1) {
            i7 = 0;
        }
        pagetablecell2.colspan = i7;
        int i9 = i8 > 1 ? i8 : 0;
        pagetablecell2.rowspan = i9;
        pagetablecell2.flags = i7 > 0 ? 2 | pagetablecell2.flags : pagetablecell2.flags & (-3);
        pagetablecell2.flags = i9 > 0 ? pagetablecell2.flags | 4 : pagetablecell2.flags & (-5);
        applyPlainText(pagetablecell2, sb.toString());
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) it3.next();
            if (pagetablecell3 != pagetablecell2 && (anchorRowOf = anchorRowOf(pagetablecell3)) >= 0 && anchorRowOf < this.block.rows.size()) {
                this.block.rows.get(anchorRowOf).cells.remove(pagetablecell3);
            }
        }
        rebuildFromBlock();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int lambda$mergeCells$0(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int anchorRowOf = anchorRowOf(pagetablecell);
        int anchorRowOf2 = anchorRowOf(pagetablecell2);
        if (anchorRowOf != anchorRowOf2) {
            return Integer.compare(anchorRowOf, anchorRowOf2);
        }
        return Integer.compare(anchorColOf(pagetablecell), anchorColOf(pagetablecell2));
    }

    public boolean unmergeCell(TL_iv.pageTableCell pagetablecell) {
        if (pagetablecell == null) {
            return false;
        }
        int anchorRowOf = anchorRowOf(pagetablecell);
        int anchorColOf = anchorColOf(pagetablecell);
        if (anchorRowOf < 0 || anchorColOf < 0) {
            return false;
        }
        int spanRow = spanRow(pagetablecell);
        int spanCol = spanCol(pagetablecell);
        if (spanRow <= 1 && spanCol <= 1) {
            return false;
        }
        pagetablecell.rowspan = 0;
        pagetablecell.colspan = 0;
        pagetablecell.flags &= -7;
        for (int i = anchorRowOf; i < anchorRowOf + spanRow && i < this.rowCount; i++) {
            TL_iv.pageTableRow pagetablerow = this.block.rows.get(i);
            ArrayList arrayList = new ArrayList();
            Iterator<TL_iv.pageTableCell> it = pagetablerow.cells.iterator();
            while (it.hasNext()) {
                TL_iv.pageTableCell next = it.next();
                arrayList.add(new Object[]{next, Integer.valueOf(anchorColOf(next))});
            }
            for (int i2 = anchorColOf; i2 < anchorColOf + spanCol; i2++) {
                if (i != anchorRowOf || i2 != anchorColOf) {
                    TL_iv.pageTableCell pagetablecell2 = new TL_iv.pageTableCell();
                    pagetablecell2.header = pagetablecell.header;
                    pagetablecell2.align_center = pagetablecell.align_center;
                    pagetablecell2.align_right = pagetablecell.align_right;
                    pagetablecell2.valign_middle = pagetablecell.valign_middle;
                    pagetablecell2.valign_bottom = pagetablecell.valign_bottom;
                    applyPlainText(pagetablecell2, "");
                    arrayList.add(new Object[]{pagetablecell2, Integer.valueOf(i2)});
                }
            }
            Collections.sort(arrayList, Comparator$-CC.comparingInt(new ToIntFunction() { // from class: org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda0
                @Override // java.util.function.ToIntFunction
                public final int applyAsInt(Object obj) {
                    int lambda$unmergeCell$1;
                    lambda$unmergeCell$1 = TableModel.lambda$unmergeCell$1((Object[]) obj);
                    return lambda$unmergeCell$1;
                }
            }));
            pagetablerow.cells.clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                pagetablerow.cells.add((TL_iv.pageTableCell) ((Object[]) it2.next())[0]);
            }
        }
        rebuildFromBlock();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$unmergeCell$1(Object[] objArr) {
        return ((Integer) objArr[1]).intValue();
    }

    public boolean deleteRows(Set set) {
        if (set == null || set.isEmpty()) {
            return false;
        }
        boolean[] zArr = new boolean[this.rowCount];
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (intValue >= 0 && intValue < this.rowCount) {
                zArr[intValue] = true;
            }
        }
        int[] iArr = new int[this.rowCount];
        int i = 0;
        for (int i2 = 0; i2 < this.rowCount; i2++) {
            iArr[i2] = i;
            if (!zArr[i2]) {
                i++;
            }
        }
        if (i == 0) {
            this.block.rows.clear();
            rebuildFromBlock();
            return true;
        }
        IdentityHashMap identityHashMap = new IdentityHashMap();
        Iterator it2 = this.anchorsRowMajor.iterator();
        while (it2.hasNext()) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
            int anchorRowOf = anchorRowOf(pagetablecell);
            int anchorColOf = anchorColOf(pagetablecell);
            int spanRow = spanRow(pagetablecell);
            int spanCol = spanCol(pagetablecell);
            int i3 = -1;
            int i4 = 0;
            for (int i5 = anchorRowOf; i5 < anchorRowOf + spanRow && i5 < this.rowCount; i5++) {
                if (!zArr[i5]) {
                    if (i3 < 0) {
                        i3 = i5;
                    }
                    i4++;
                }
            }
            if (i3 >= 0) {
                identityHashMap.put(pagetablecell, new int[]{iArr[i3], anchorColOf, i4, spanCol});
            }
        }
        rewriteBlockRows(identityHashMap, i);
        rebuildFromBlock();
        return true;
    }

    public boolean deleteColumns(Set set) {
        if (set == null || set.isEmpty()) {
            return false;
        }
        boolean[] zArr = new boolean[this.colCount];
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (intValue >= 0 && intValue < this.colCount) {
                zArr[intValue] = true;
            }
        }
        int[] iArr = new int[this.colCount];
        int i = 0;
        for (int i2 = 0; i2 < this.colCount; i2++) {
            iArr[i2] = i;
            if (!zArr[i2]) {
                i++;
            }
        }
        if (i == 0) {
            this.block.rows.clear();
            rebuildFromBlock();
            return true;
        }
        IdentityHashMap identityHashMap = new IdentityHashMap();
        Iterator it2 = this.anchorsRowMajor.iterator();
        while (it2.hasNext()) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
            int anchorRowOf = anchorRowOf(pagetablecell);
            int anchorColOf = anchorColOf(pagetablecell);
            int spanRow = spanRow(pagetablecell);
            int spanCol = spanCol(pagetablecell);
            int i3 = -1;
            int i4 = 0;
            for (int i5 = anchorColOf; i5 < anchorColOf + spanCol && i5 < this.colCount; i5++) {
                if (!zArr[i5]) {
                    if (i3 < 0) {
                        i3 = i5;
                    }
                    i4++;
                }
            }
            if (i3 >= 0) {
                identityHashMap.put(pagetablecell, new int[]{anchorRowOf, iArr[i3], spanRow, i4});
            }
        }
        rewriteBlockRows(identityHashMap, this.rowCount);
        rebuildFromBlock();
        return true;
    }

    private void rewriteBlockRows(final IdentityHashMap identityHashMap, int i) {
        this.block.rows.clear();
        for (int i2 = 0; i2 < i; i2++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : identityHashMap.entrySet()) {
                if (((int[]) entry.getValue())[0] == i2) {
                    arrayList.add((TL_iv.pageTableCell) entry.getKey());
                }
            }
            Collections.sort(arrayList, Comparator$-CC.comparingInt(new ToIntFunction() { // from class: org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda1
                @Override // java.util.function.ToIntFunction
                public final int applyAsInt(Object obj) {
                    int lambda$rewriteBlockRows$2;
                    lambda$rewriteBlockRows$2 = TableModel.lambda$rewriteBlockRows$2(identityHashMap, (TL_iv.pageTableCell) obj);
                    return lambda$rewriteBlockRows$2;
                }
            }));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
                int[] iArr = (int[]) identityHashMap.get(pagetablecell);
                int i3 = iArr[2];
                if (i3 <= 1) {
                    i3 = 0;
                }
                pagetablecell.rowspan = i3;
                int i4 = iArr[3];
                if (i4 <= 1) {
                    i4 = 0;
                }
                pagetablecell.colspan = i4;
                pagetablecell.flags = i3 != 0 ? pagetablecell.flags | 4 : pagetablecell.flags & (-5);
                pagetablecell.flags = i4 != 0 ? pagetablecell.flags | 2 : pagetablecell.flags & (-3);
                pagetablerow.cells.add(pagetablecell);
            }
            this.block.rows.add(pagetablerow);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$rewriteBlockRows$2(IdentityHashMap identityHashMap, TL_iv.pageTableCell pagetablecell) {
        return ((int[]) identityHashMap.get(pagetablecell))[1];
    }

    public static void normalizeForSend(TL_iv.pageBlockTable pageblocktable) {
        if (pageblocktable == null) {
            return;
        }
        if (pageblocktable.title == null) {
            pageblocktable.title = new TL_iv.textEmpty();
        }
        if (pageblocktable.rows == null) {
            return;
        }
        for (int i = 0; i < pageblocktable.rows.size(); i++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i);
            if (pagetablerow.cells != null) {
                for (int i2 = 0; i2 < pagetablerow.cells.size(); i2++) {
                    TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i2);
                    if (pagetablecell.text == null) {
                        applyPlainText(pagetablecell, "");
                    } else {
                        pagetablecell.flags |= 128;
                    }
                    pagetablecell.flags = pagetablecell.colspan > 1 ? pagetablecell.flags | 2 : pagetablecell.flags & (-3);
                    pagetablecell.flags = pagetablecell.rowspan > 1 ? pagetablecell.flags | 4 : pagetablecell.flags & (-5);
                }
            }
        }
    }

    public static String readPlainText(TL_iv.pageTableCell pagetablecell) {
        TL_iv.RichText richText;
        if (pagetablecell != null && (richText = pagetablecell.text) != null) {
            if (richText instanceof TL_iv.textPlain) {
                return ((TL_iv.textPlain) richText).text;
            }
            boolean z = richText instanceof TL_iv.textEmpty;
        }
        return "";
    }

    public static void applyPlainText(TL_iv.pageTableCell pagetablecell, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        if (str == null) {
            str = "";
        }
        textplain.text = str;
        pagetablecell.text = textplain;
        int i = pagetablecell.flags;
        int i2 = i | 128;
        pagetablecell.flags = i2;
        pagetablecell.flags = pagetablecell.colspan > 1 ? i | NotificationCenter.dialogIsTranslatable : i2 & (-3);
        pagetablecell.flags = pagetablecell.rowspan > 1 ? pagetablecell.flags | 4 : pagetablecell.flags & (-5);
    }

    private void rebuildAnchorList() {
        this.anchorsRowMajor.clear();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < this.rowCount; i++) {
            for (int i2 = 0; i2 < this.colCount; i2++) {
                if (isAnchor(i, i2) && linkedHashSet.add(this.grid[i][i2])) {
                    this.anchorsRowMajor.add(this.grid[i][i2]);
                }
            }
        }
    }

    private static TL_iv.pageTableCell[][] growCols(TL_iv.pageTableCell[][] pagetablecellArr, int i) {
        TL_iv.pageTableCell[][] pagetablecellArr2 = (TL_iv.pageTableCell[][]) Array.newInstance((Class<?>) TL_iv.pageTableCell.class, pagetablecellArr.length, i);
        for (int i2 = 0; i2 < pagetablecellArr.length; i2++) {
            TL_iv.pageTableCell[] pagetablecellArr3 = pagetablecellArr[i2];
            System.arraycopy(pagetablecellArr3, 0, pagetablecellArr2[i2], 0, pagetablecellArr3.length);
        }
        return pagetablecellArr2;
    }

    private static int[][] growIntCols(int[][] iArr, int i, int i2) {
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iArr.length, i);
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int[] iArr3 = iArr[i3];
            int length = iArr3.length;
            System.arraycopy(iArr3, 0, iArr2[i3], 0, length);
            while (length < i) {
                iArr2[i3][length] = i2;
                length++;
            }
        }
        return iArr2;
    }
}
