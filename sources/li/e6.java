package li;

import j$.util.Comparator$-CC;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.ToIntFunction;
import org.telegram.messenger.qs;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class e6 {
    public final TL_iv.pageBlockTable a;
    public int b;
    public int c;
    public TL_iv.pageTableCell[][] d;
    public int[][] e;
    public int[][] f;
    public final ArrayList g = new ArrayList();

    public e6(TL_iv.pageBlockTable pageblocktable) {
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
        int i7 = pagetablecell.flags;
        int i10 = i7 | 128;
        pagetablecell.flags = i10;
        pagetablecell.flags = pagetablecell.colspan > 1 ? i7 | qs.O1 : i10 & (-3);
        pagetablecell.flags = pagetablecell.rowspan > 1 ? pagetablecell.flags | 4 : pagetablecell.flags & (-5);
    }

    public static void d(TL_iv.pageTableCell pagetablecell, CharSequence charSequence) {
        pagetablecell.text = c6.f(charSequence);
        int i7 = pagetablecell.flags;
        int i10 = i7 | 128;
        pagetablecell.flags = i10;
        pagetablecell.flags = pagetablecell.colspan > 1 ? i7 | qs.O1 : i10 & (-3);
        pagetablecell.flags = pagetablecell.rowspan > 1 ? pagetablecell.flags | 4 : pagetablecell.flags & (-5);
    }

    public static int[][] e(int[][] iArr, int i7) {
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iArr.length, i7);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int[] iArr3 = iArr[i10];
            int length = iArr3.length;
            System.arraycopy(iArr3, 0, iArr2[i10], 0, length);
            while (length < i7) {
                iArr2[i10][length] = -1;
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
        return (pagetablecell == null || (richText = pagetablecell.text) == null) ? "" : c6.l(richText);
    }

    public static CharSequence h(TL_iv.pageTableCell pagetablecell) {
        TL_iv.RichText richText;
        return (pagetablecell == null || (richText = pagetablecell.text) == null) ? "" : c6.r(richText, null, true);
    }

    public static void k(TL_iv.pageTableCell pagetablecell, int i7) {
        if (pagetablecell == null) {
            return;
        }
        boolean z9 = i7 == 1;
        pagetablecell.align_center = z9;
        boolean z10 = i7 == 2;
        pagetablecell.align_right = z10;
        int i10 = pagetablecell.flags;
        pagetablecell.flags = z9 ? i10 | 8 : i10 & (-9);
        int i11 = pagetablecell.flags;
        pagetablecell.flags = z10 ? i11 | 16 : i11 & (-17);
    }

    public static void l(TL_iv.pageTableCell pagetablecell, boolean z9) {
        if (pagetablecell == null) {
            return;
        }
        pagetablecell.header = z9;
        pagetablecell.flags = z9 ? pagetablecell.flags | 1 : pagetablecell.flags & (-2);
    }

    public static void m(TL_iv.pageTableCell pagetablecell, int i7) {
        if (pagetablecell == null) {
            return;
        }
        boolean z9 = i7 == 1;
        pagetablecell.valign_middle = z9;
        boolean z10 = i7 == 2;
        pagetablecell.valign_bottom = z10;
        int i10 = pagetablecell.flags;
        pagetablecell.flags = z9 ? i10 | 32 : i10 & (-33);
        int i11 = pagetablecell.flags;
        pagetablecell.flags = z10 ? i11 | 64 : i11 & (-65);
    }

    public static int n(TL_iv.pageTableCell pagetablecell) {
        int i7 = pagetablecell.colspan;
        if (i7 != 0) {
            return i7;
        }
        return 1;
    }

    public static int o(TL_iv.pageTableCell pagetablecell) {
        int i7 = pagetablecell.rowspan;
        if (i7 != 0) {
            return i7;
        }
        return 1;
    }

    public final int a(TL_iv.pageTableCell pagetablecell) {
        for (int i7 = 0; i7 < this.b; i7++) {
            for (int i10 = 0; i10 < this.c; i10++) {
                if (this.d[i7][i10] == pagetablecell) {
                    return this.f[i7][i10];
                }
            }
        }
        return -1;
    }

    public final int b(TL_iv.pageTableCell pagetablecell) {
        for (int i7 = 0; i7 < this.b; i7++) {
            for (int i10 = 0; i10 < this.c; i10++) {
                if (this.d[i7][i10] == pagetablecell) {
                    return this.e[i7][i10];
                }
            }
        }
        return -1;
    }

    public final void i() {
        int i7;
        int i10;
        TL_iv.pageTableCell pagetablecell;
        int i11;
        int i12;
        TL_iv.pageBlockTable pageblocktable = this.a;
        ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
        int i13 = 0;
        this.b = arrayList == null ? 0 : arrayList.size();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i7 = this.b;
            if (i14 >= i7) {
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
        int i18 = 1;
        TL_iv.pageTableCell[][] pagetablecellArr = (TL_iv.pageTableCell[][]) Array.newInstance((Class<?>) TL_iv.pageTableCell.class, Math.max(i7, 1), Math.max(i15, 1));
        int[] iArr = {Math.max(this.b, 1), Math.max(i15, 1)};
        Class cls = Integer.TYPE;
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) cls, iArr);
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) cls, Math.max(this.b, 1), Math.max(i15, 1));
        for (int i19 = 0; i19 < iArr2.length; i19++) {
            for (int i20 = 0; i20 < iArr2[0].length; i20++) {
                iArr2[i19][i20] = -1;
                iArr3[i19][i20] = -1;
            }
        }
        int i21 = 0;
        int i22 = 0;
        while (true) {
            i10 = this.b;
            if (i21 >= i10) {
                break;
            }
            TL_iv.pageTableRow pagetablerow2 = pageblocktable.rows.get(i21);
            int i23 = i18;
            int i24 = i13;
            int i25 = i24;
            while (i24 < pagetablerow2.cells.size()) {
                TL_iv.pageTableCell pagetablecell2 = pagetablerow2.cells.get(i24);
                int n10 = n(pagetablecell2);
                int i26 = i13;
                int i27 = pagetablecell2.rowspan;
                if (i27 == 0) {
                    i27 = i23;
                }
                while (i25 < i15 && pagetablecellArr[i21][i25] != null) {
                    i25++;
                }
                int i28 = i25 + n10;
                if (i28 > i15) {
                    i15 = Math.max(i28, i15 * 2);
                    pagetablecell = pagetablecell2;
                    int length = pagetablecellArr.length;
                    i11 = i27;
                    int[] iArr4 = new int[2];
                    iArr4[i23] = i15;
                    iArr4[i26] = length;
                    TL_iv.pageTableCell[][] pagetablecellArr2 = (TL_iv.pageTableCell[][]) Array.newInstance((Class<?>) TL_iv.pageTableCell.class, iArr4);
                    int i29 = i26;
                    while (i29 < pagetablecellArr.length) {
                        TL_iv.pageTableCell[] pagetablecellArr3 = pagetablecellArr[i29];
                        int i30 = i29;
                        int i31 = i21;
                        int i32 = i26;
                        System.arraycopy(pagetablecellArr3, i32, pagetablecellArr2[i30], i32, pagetablecellArr3.length);
                        i29 = i30 + 1;
                        pagetablecellArr = pagetablecellArr;
                        i21 = i31;
                        i26 = 0;
                    }
                    i12 = i21;
                    iArr2 = e(iArr2, i15);
                    iArr3 = e(iArr3, i15);
                    pagetablecellArr = pagetablecellArr2;
                } else {
                    pagetablecell = pagetablecell2;
                    i11 = i27;
                    i12 = i21;
                }
                for (int i33 = i12; i33 < i12 + i11 && i33 < this.b; i33++) {
                    for (int i34 = i25; i34 < i28; i34++) {
                        pagetablecellArr[i33][i34] = pagetablecell;
                        iArr2[i33][i34] = i12;
                        iArr3[i33][i34] = i25;
                    }
                }
                if (i28 > i22) {
                    i22 = i28;
                }
                i24++;
                i25 = i28;
                i21 = i12;
                i13 = 0;
            }
            i21++;
            i18 = i23;
            i13 = 0;
        }
        this.c = i22;
        int max = Math.max(i10, i18);
        int[] iArr5 = new int[2];
        iArr5[i18] = Math.max(this.c, i18);
        iArr5[0] = max;
        this.d = (TL_iv.pageTableCell[][]) Array.newInstance((Class<?>) TL_iv.pageTableCell.class, iArr5);
        int max2 = Math.max(this.b, i18);
        int[] iArr6 = new int[2];
        iArr6[i18] = Math.max(this.c, i18);
        iArr6[0] = max2;
        this.e = (int[][]) Array.newInstance((Class<?>) cls, iArr6);
        int max3 = Math.max(this.b, i18);
        int[] iArr7 = new int[2];
        iArr7[i18] = Math.max(this.c, i18);
        iArr7[0] = max3;
        this.f = (int[][]) Array.newInstance((Class<?>) cls, iArr7);
        for (int i35 = 0; i35 < this.b; i35++) {
            for (int i36 = 0; i36 < this.c; i36++) {
                TL_iv.pageTableCell[][] pagetablecellArr4 = this.d;
                pagetablecellArr4[i35][i36] = pagetablecellArr[i35][i36];
                this.e[i35][i36] = iArr2[i35][i36];
                this.f[i35][i36] = iArr3[i35][i36];
                if (pagetablecellArr4[i35][i36] == null) {
                    TL_iv.pageTableCell f10 = f();
                    this.d[i35][i36] = f10;
                    this.e[i35][i36] = i35;
                    this.f[i35][i36] = i36;
                    pageblocktable.rows.get(i35).cells.add(f10);
                }
            }
        }
        ArrayList arrayList2 = this.g;
        arrayList2.clear();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i37 = 0; i37 < this.b; i37++) {
            int i38 = 0;
            while (true) {
                int i39 = this.c;
                if (i38 < i39) {
                    if (i37 >= 0 && i38 >= 0 && i37 < this.b && i38 < i39 && this.e[i37][i38] == i37 && this.f[i37][i38] == i38 && linkedHashSet.add(this.d[i37][i38])) {
                        arrayList2.add(this.d[i37][i38]);
                    }
                    i38++;
                }
            }
        }
    }

    public final void j(final IdentityHashMap identityHashMap, int i7) {
        TL_iv.pageBlockTable pageblocktable = this.a;
        pageblocktable.rows.clear();
        for (int i10 = 0; i10 < i7; i10++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : identityHashMap.entrySet()) {
                if (((int[]) entry.getValue())[0] == i10) {
                    arrayList.add((TL_iv.pageTableCell) entry.getKey());
                }
            }
            Collections.sort(arrayList, Comparator$-CC.comparingInt(new ToIntFunction() { // from class: li.d6
                @Override // java.util.function.ToIntFunction
                public final int applyAsInt(Object obj) {
                    return ((int[]) identityHashMap.get((TL_iv.pageTableCell) obj))[1];
                }
            }));
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                int[] iArr = (int[]) identityHashMap.get(pagetablecell);
                int i12 = iArr[2];
                if (i12 <= 1) {
                    i12 = 0;
                }
                pagetablecell.rowspan = i12;
                int i13 = iArr[3];
                if (i13 <= 1) {
                    i13 = 0;
                }
                pagetablecell.colspan = i13;
                pagetablecell.flags = i12 != 0 ? pagetablecell.flags | 4 : pagetablecell.flags & (-5);
                pagetablecell.flags = i13 != 0 ? pagetablecell.flags | 2 : pagetablecell.flags & (-3);
                pagetablerow.cells.add(pagetablecell);
            }
            pageblocktable.rows.add(pagetablerow);
        }
    }

    public final boolean p(TL_iv.pageTableCell pagetablecell) {
        int b10 = b(pagetablecell);
        int a10 = a(pagetablecell);
        if (b10 >= 0 && a10 >= 0) {
            int i7 = pagetablecell.rowspan;
            if (i7 == 0) {
                i7 = 1;
            }
            int i10 = pagetablecell.colspan;
            if (i10 == 0) {
                i10 = 1;
            }
            if (i7 > 1 || i10 > 1) {
                pagetablecell.rowspan = 0;
                pagetablecell.colspan = 0;
                pagetablecell.flags &= -7;
                for (int i11 = b10; i11 < b10 + i7 && i11 < this.b; i11++) {
                    TL_iv.pageTableRow pagetablerow = this.a.rows.get(i11);
                    ArrayList arrayList = new ArrayList();
                    ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        TL_iv.pageTableCell pagetablecell2 = arrayList2.get(i12);
                        i12++;
                        TL_iv.pageTableCell pagetablecell3 = pagetablecell2;
                        arrayList.add(new Object[]{pagetablecell3, Integer.valueOf(a(pagetablecell3))});
                    }
                    for (int i13 = a10; i13 < a10 + i10; i13++) {
                        if (i11 != b10 || i13 != a10) {
                            TL_iv.pageTableCell pagetablecell4 = new TL_iv.pageTableCell();
                            pagetablecell4.header = pagetablecell.header;
                            pagetablecell4.align_center = pagetablecell.align_center;
                            pagetablecell4.align_right = pagetablecell.align_right;
                            pagetablecell4.valign_middle = pagetablecell.valign_middle;
                            pagetablecell4.valign_bottom = pagetablecell.valign_bottom;
                            c(pagetablecell4, "");
                            arrayList.add(new Object[]{pagetablecell4, Integer.valueOf(i13)});
                        }
                    }
                    Collections.sort(arrayList, Comparator$-CC.comparingInt(new bg.d(10)));
                    pagetablerow.cells.clear();
                    int size2 = arrayList.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj = arrayList.get(i14);
                        i14++;
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
