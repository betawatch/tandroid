package ji;

import bi.o6;
import j$.util.Comparator$-CC;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.ToIntFunction;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class k6 {
    public final TL_iv.pageBlockTable a;
    public int b;
    public int c;
    public TL_iv.pageTableCell[][] d;
    public int[][] e;
    public int[][] f;
    public final ArrayList g = new ArrayList();

    public k6(TL_iv.pageBlockTable pageblocktable) {
        this.a = pageblocktable;
        i();
    }

    public static void c(TL_iv.pageTableCell pagetablecell, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        if (str == null) {
            str = "";
        }
        textplain.text = str;
        pagetablecell.text = textplain;
        int i10 = pagetablecell.flags;
        int i11 = i10 | 128;
        pagetablecell.flags = i11;
        pagetablecell.flags = pagetablecell.colspan > 1 ? i10 | 130 : i11 & (-3);
        pagetablecell.flags = pagetablecell.rowspan > 1 ? pagetablecell.flags | 4 : pagetablecell.flags & (-5);
    }

    public static void d(TL_iv.pageTableCell pagetablecell, CharSequence charSequence) {
        pagetablecell.text = i6.f(charSequence);
        int i10 = pagetablecell.flags;
        int i11 = i10 | 128;
        pagetablecell.flags = i11;
        pagetablecell.flags = pagetablecell.colspan > 1 ? i10 | 130 : i11 & (-3);
        pagetablecell.flags = pagetablecell.rowspan > 1 ? pagetablecell.flags | 4 : pagetablecell.flags & (-5);
    }

    public static int[][] e(int[][] iArr, int i10) {
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iArr.length, i10);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int[] iArr3 = iArr[i11];
            int length = iArr3.length;
            System.arraycopy(iArr3, 0, iArr2[i11], 0, length);
            while (length < i10) {
                iArr2[i11][length] = -1;
                length++;
            }
        }
        return iArr2;
    }

    public static TL_iv.pageTableCell f() {
        TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
        c(pagetablecell, "");
        return pagetablecell;
    }

    public static String g(TL_iv.pageTableCell pagetablecell) {
        TL_iv.RichText richText;
        return (pagetablecell == null || (richText = pagetablecell.text) == null) ? "" : i6.l(richText);
    }

    public static CharSequence h(TL_iv.pageTableCell pagetablecell) {
        TL_iv.RichText richText;
        return (pagetablecell == null || (richText = pagetablecell.text) == null) ? "" : i6.r(richText, null, true);
    }

    public static void k(TL_iv.pageTableCell pagetablecell, int i10) {
        if (pagetablecell == null) {
            return;
        }
        boolean z10 = i10 == 1;
        pagetablecell.align_center = z10;
        boolean z11 = i10 == 2;
        pagetablecell.align_right = z11;
        int i11 = pagetablecell.flags;
        pagetablecell.flags = z10 ? i11 | 8 : i11 & (-9);
        int i12 = pagetablecell.flags;
        pagetablecell.flags = z11 ? i12 | 16 : i12 & (-17);
    }

    public static void l(TL_iv.pageTableCell pagetablecell, boolean z10) {
        if (pagetablecell == null) {
            return;
        }
        pagetablecell.header = z10;
        pagetablecell.flags = z10 ? pagetablecell.flags | 1 : pagetablecell.flags & (-2);
    }

    public static void m(TL_iv.pageTableCell pagetablecell, int i10) {
        if (pagetablecell == null) {
            return;
        }
        boolean z10 = i10 == 1;
        pagetablecell.valign_middle = z10;
        boolean z11 = i10 == 2;
        pagetablecell.valign_bottom = z11;
        int i11 = pagetablecell.flags;
        pagetablecell.flags = z10 ? i11 | 32 : i11 & (-33);
        int i12 = pagetablecell.flags;
        pagetablecell.flags = z11 ? i12 | 64 : i12 & (-65);
    }

    public static int n(TL_iv.pageTableCell pagetablecell) {
        int i10 = pagetablecell.colspan;
        if (i10 != 0) {
            return i10;
        }
        return 1;
    }

    public static int o(TL_iv.pageTableCell pagetablecell) {
        int i10 = pagetablecell.rowspan;
        if (i10 != 0) {
            return i10;
        }
        return 1;
    }

    public final int a(TL_iv.pageTableCell pagetablecell) {
        for (int i10 = 0; i10 < this.b; i10++) {
            for (int i11 = 0; i11 < this.c; i11++) {
                if (this.d[i10][i11] == pagetablecell) {
                    return this.f[i10][i11];
                }
            }
        }
        return -1;
    }

    public final int b(TL_iv.pageTableCell pagetablecell) {
        for (int i10 = 0; i10 < this.b; i10++) {
            for (int i11 = 0; i11 < this.c; i11++) {
                if (this.d[i10][i11] == pagetablecell) {
                    return this.e[i10][i11];
                }
            }
        }
        return -1;
    }

    public final void i() {
        int i10;
        int i11;
        TL_iv.pageTableCell pagetablecell;
        int i12;
        int i13;
        TL_iv.pageBlockTable pageblocktable = this.a;
        ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
        this.b = arrayList == null ? 0 : arrayList.size();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = this.b;
            if (i14 >= i10) {
                break;
            }
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i14);
            int i16 = 0;
            for (int i17 = 0; i17 < pagetablerow.cells.size(); i17++) {
                i16 += n(pagetablerow.cells.get(i17));
            }
            if (i16 > i15) {
                i15 = i16;
            }
            i14++;
        }
        TL_iv.pageTableCell[][] pagetablecellArr = (TL_iv.pageTableCell[][]) Array.newInstance((Class<?>) TL_iv.pageTableCell.class, Math.max(i10, 1), Math.max(i15, 1));
        int[] iArr = {Math.max(this.b, 1), Math.max(i15, 1)};
        Class cls = Integer.TYPE;
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) cls, iArr);
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) cls, Math.max(this.b, 1), Math.max(i15, 1));
        for (int i18 = 0; i18 < iArr2.length; i18++) {
            for (int i19 = 0; i19 < iArr2[0].length; i19++) {
                iArr2[i18][i19] = -1;
                iArr3[i18][i19] = -1;
            }
        }
        int i20 = 0;
        int i21 = 0;
        while (true) {
            i11 = this.b;
            if (i20 >= i11) {
                break;
            }
            TL_iv.pageTableRow pagetablerow2 = pageblocktable.rows.get(i20);
            int i22 = 0;
            int i23 = 0;
            while (i22 < pagetablerow2.cells.size()) {
                TL_iv.pageTableCell pagetablecell2 = pagetablerow2.cells.get(i22);
                int n10 = n(pagetablecell2);
                int i24 = pagetablecell2.rowspan;
                if (i24 == 0) {
                    i24 = 1;
                }
                while (i23 < i15 && pagetablecellArr[i20][i23] != null) {
                    i23++;
                }
                int i25 = i23 + n10;
                if (i25 > i15) {
                    i15 = Math.max(i25, i15 * 2);
                    pagetablecell = pagetablecell2;
                    i12 = i24;
                    TL_iv.pageTableCell[][] pagetablecellArr2 = (TL_iv.pageTableCell[][]) Array.newInstance((Class<?>) TL_iv.pageTableCell.class, pagetablecellArr.length, i15);
                    int i26 = 0;
                    while (i26 < pagetablecellArr.length) {
                        TL_iv.pageTableCell[] pagetablecellArr3 = pagetablecellArr[i26];
                        int i27 = i26;
                        System.arraycopy(pagetablecellArr3, 0, pagetablecellArr2[i27], 0, pagetablecellArr3.length);
                        i26 = i27 + 1;
                        pagetablecellArr = pagetablecellArr;
                        i20 = i20;
                    }
                    i13 = i20;
                    iArr2 = e(iArr2, i15);
                    iArr3 = e(iArr3, i15);
                    pagetablecellArr = pagetablecellArr2;
                } else {
                    pagetablecell = pagetablecell2;
                    i12 = i24;
                    i13 = i20;
                }
                for (int i28 = i13; i28 < i13 + i12 && i28 < this.b; i28++) {
                    for (int i29 = i23; i29 < i25; i29++) {
                        pagetablecellArr[i28][i29] = pagetablecell;
                        iArr2[i28][i29] = i13;
                        iArr3[i28][i29] = i23;
                    }
                }
                if (i25 > i21) {
                    i21 = i25;
                }
                i22++;
                i23 = i25;
                i20 = i13;
            }
            i20++;
        }
        this.c = i21;
        this.d = (TL_iv.pageTableCell[][]) Array.newInstance((Class<?>) TL_iv.pageTableCell.class, Math.max(i11, 1), Math.max(this.c, 1));
        this.e = (int[][]) Array.newInstance((Class<?>) cls, Math.max(this.b, 1), Math.max(this.c, 1));
        this.f = (int[][]) Array.newInstance((Class<?>) cls, Math.max(this.b, 1), Math.max(this.c, 1));
        for (int i30 = 0; i30 < this.b; i30++) {
            for (int i31 = 0; i31 < this.c; i31++) {
                TL_iv.pageTableCell[][] pagetablecellArr4 = this.d;
                pagetablecellArr4[i30][i31] = pagetablecellArr[i30][i31];
                this.e[i30][i31] = iArr2[i30][i31];
                this.f[i30][i31] = iArr3[i30][i31];
                if (pagetablecellArr4[i30][i31] == null) {
                    TL_iv.pageTableCell f7 = f();
                    this.d[i30][i31] = f7;
                    this.e[i30][i31] = i30;
                    this.f[i30][i31] = i31;
                    pageblocktable.rows.get(i30).cells.add(f7);
                }
            }
        }
        ArrayList arrayList2 = this.g;
        arrayList2.clear();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i32 = 0; i32 < this.b; i32++) {
            int i33 = 0;
            while (true) {
                int i34 = this.c;
                if (i33 < i34) {
                    if (i32 >= 0 && i33 >= 0 && i32 < this.b && i33 < i34 && this.e[i32][i33] == i32 && this.f[i32][i33] == i33 && linkedHashSet.add(this.d[i32][i33])) {
                        arrayList2.add(this.d[i32][i33]);
                    }
                    i33++;
                }
            }
        }
    }

    public final void j(final IdentityHashMap identityHashMap, int i10) {
        TL_iv.pageBlockTable pageblocktable = this.a;
        pageblocktable.rows.clear();
        for (int i11 = 0; i11 < i10; i11++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : identityHashMap.entrySet()) {
                if (((int[]) entry.getValue())[0] == i11) {
                    arrayList.add((TL_iv.pageTableCell) entry.getKey());
                }
            }
            Collections.sort(arrayList, Comparator$-CC.comparingInt(new ToIntFunction() { // from class: ji.j6
                @Override // java.util.function.ToIntFunction
                public final int applyAsInt(Object obj) {
                    return ((int[]) identityHashMap.get((TL_iv.pageTableCell) obj))[1];
                }
            }));
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                int[] iArr = (int[]) identityHashMap.get(pagetablecell);
                int i13 = iArr[2];
                if (i13 <= 1) {
                    i13 = 0;
                }
                pagetablecell.rowspan = i13;
                int i14 = iArr[3];
                if (i14 <= 1) {
                    i14 = 0;
                }
                pagetablecell.colspan = i14;
                pagetablecell.flags = i13 != 0 ? pagetablecell.flags | 4 : pagetablecell.flags & (-5);
                pagetablecell.flags = i14 != 0 ? pagetablecell.flags | 2 : pagetablecell.flags & (-3);
                pagetablerow.cells.add(pagetablecell);
            }
            pageblocktable.rows.add(pagetablerow);
        }
    }

    public final boolean p(TL_iv.pageTableCell pagetablecell) {
        int b10 = b(pagetablecell);
        int a2 = a(pagetablecell);
        if (b10 >= 0 && a2 >= 0) {
            int i10 = pagetablecell.rowspan;
            if (i10 == 0) {
                i10 = 1;
            }
            int i11 = pagetablecell.colspan;
            if (i11 == 0) {
                i11 = 1;
            }
            if (i10 > 1 || i11 > 1) {
                pagetablecell.rowspan = 0;
                pagetablecell.colspan = 0;
                pagetablecell.flags &= -7;
                for (int i12 = b10; i12 < b10 + i10 && i12 < this.b; i12++) {
                    TL_iv.pageTableRow pagetablerow = this.a.rows.get(i12);
                    ArrayList arrayList = new ArrayList();
                    ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size) {
                        TL_iv.pageTableCell pagetablecell2 = arrayList2.get(i13);
                        i13++;
                        TL_iv.pageTableCell pagetablecell3 = pagetablecell2;
                        arrayList.add(new Object[]{pagetablecell3, Integer.valueOf(a(pagetablecell3))});
                    }
                    for (int i14 = a2; i14 < a2 + i11; i14++) {
                        if (i12 != b10 || i14 != a2) {
                            TL_iv.pageTableCell pagetablecell4 = new TL_iv.pageTableCell();
                            pagetablecell4.header = pagetablecell.header;
                            pagetablecell4.align_center = pagetablecell.align_center;
                            pagetablecell4.align_right = pagetablecell.align_right;
                            pagetablecell4.valign_middle = pagetablecell.valign_middle;
                            pagetablecell4.valign_bottom = pagetablecell.valign_bottom;
                            c(pagetablecell4, "");
                            arrayList.add(new Object[]{pagetablecell4, Integer.valueOf(i14)});
                        }
                    }
                    Collections.sort(arrayList, Comparator$-CC.comparingInt(new o6(3)));
                    pagetablerow.cells.clear();
                    int size2 = arrayList.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj = arrayList.get(i15);
                        i15++;
                        pagetablerow.cells.add((TL_iv.pageTableCell) ((Object[]) obj)[0]);
                    }
                }
                i();
                return true;
            }
        }
        return false;
    }
}
