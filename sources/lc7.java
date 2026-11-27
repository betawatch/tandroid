// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class lc7 {
    public final boolean a;
    public final int b;
    public final ArrayList c = new ArrayList();
    public final zh6 d = new zh6();

    /* JADX WARN: Multi-variable type inference failed */
    public lc7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static lc7 b(int i, String str) {
        int i2;
        int i3;
        int i4;
        kc7 kc7Var;
        int i5;
        int i6;
        int i7;
        int i8;
        kc7 kc7Var2;
        int[] iArr;
        int indexOf;
        int i9;
        int indexOf2;
        String str2 = str;
        kc7 kc7Var3 = null;
        if (str2 == null) {
            return null;
        }
        int i10 = 0;
        int i11 = 1;
        if (!str2.startsWith("@") || (indexOf2 = str2.indexOf("^")) < 0) {
            i2 = 0;
        } else {
            i2 = Utilities.z(str2.substring(1, indexOf2)).intValue();
            str2 = str2.substring(indexOf2 + 1);
        }
        lc7 lc7Var = new lc7(i, i2);
        String[] split = str2.split(";");
        int i12 = 0;
        while (i12 < split.length) {
            String str3 = split[i12];
            if (str3 == null || str3.isEmpty() || str3.charAt(i10) != '#') {
                i3 = i10;
                i4 = i11;
            } else {
                boolean z = (str3.length() <= i11 || str3.charAt(i11) != 'H') ? i10 : i11;
                int i13 = z != 0 ? 2 : i11;
                if (str3.length() <= i13 || str3.charAt(i13) != '[' || (indexOf = str3.indexOf(93)) <= i13) {
                    i6 = i10;
                    i7 = i6;
                } else {
                    String substring = str3.substring(i13 + 1, indexOf);
                    if (substring.contains(",")) {
                        String[] split2 = substring.split(",");
                        i7 = Utilities.z(split2[i10]).intValue();
                        i9 = Utilities.z(split2[i11]).intValue();
                    } else {
                        i7 = Utilities.z(substring).intValue();
                        i9 = i10;
                    }
                    int i14 = indexOf + 1;
                    i6 = i9;
                    i13 = i14;
                }
                int indexOf3 = str3.indexOf(jn7.G1);
                if (indexOf3 < 0) {
                    kc7Var = kc7Var3;
                    i3 = i10;
                    i5 = i11;
                } else {
                    try {
                        kc7Var2 = new kc7();
                        i3 = i10;
                    } catch (Exception e) {
                        e = e;
                        i3 = i10;
                    }
                    try {
                        iArr = kc7Var2.h;
                        i8 = i11;
                    } catch (Exception e2) {
                        e = e2;
                        i8 = i11;
                        boolean z2 = i8;
                        cc4.g(e, z2);
                        i4 = z2;
                        kc7Var = null;
                        i5 = i4;
                        if (kc7Var != null) {
                        }
                        i12++;
                        i11 = i5;
                        i10 = i3;
                        kc7Var3 = null;
                    }
                    try {
                        int[] iArr2 = kc7Var2.g;
                        kc7Var2.c = Utilities.z(str3.substring(i13, indexOf3)).intValue();
                        kc7Var2.d = z;
                        kc7Var2.e = i7;
                        kc7Var2.f = i6;
                        String[] split3 = str3.substring(indexOf3 + 1, str3.length() - 1).split("@");
                        String[] split4 = split3[i3].split(",");
                        int i15 = i3;
                        while (i15 < 6) {
                            int i16 = i15 + 1;
                            iArr2[i15] = split4.length >= i16 ? Utilities.z(split4[i15]).intValue() : iArr2[i3];
                            i15 = i16;
                        }
                        if (split3.length >= 2) {
                            String[] split5 = split3[i8].split(",");
                            int i17 = i3;
                            while (i17 < 6) {
                                int i18 = i17 + 1;
                                iArr[i17] = split5.length >= i18 ? Utilities.z(split5[i17]).intValue() : iArr[i3];
                                i17 = i18;
                            }
                        } else {
                            for (int i19 = i3; i19 < 6; i19++) {
                                iArr[i19] = iArr2[i19];
                            }
                        }
                        kc7Var = kc7Var2;
                        i5 = i8;
                    } catch (Exception e3) {
                        e = e3;
                        boolean z22 = i8;
                        cc4.g(e, z22);
                        i4 = z22;
                        kc7Var = null;
                        i5 = i4;
                        if (kc7Var != null) {
                        }
                        i12++;
                        i11 = i5;
                        i10 = i3;
                        kc7Var3 = null;
                    }
                }
                if (kc7Var != null) {
                    kc7Var.b = (kc7Var.c >= 7 || i != 0) ? i3 : i5;
                    if (!kc7Var.d) {
                        lc7Var.c.add(kc7Var);
                    }
                    lc7Var.d.k(kc7Var.c, kc7Var);
                }
                i12++;
                i11 = i5;
                i10 = i3;
                kc7Var3 = null;
            }
            kc7Var = null;
            i5 = i4;
            if (kc7Var != null) {
            }
            i12++;
            i11 = i5;
            i10 = i3;
            kc7Var3 = null;
        }
        return lc7Var;
    }

    public static lc7 c(int i, TLRPC.TL_help_peerColors tL_help_peerColors) {
        try {
            lc7 lc7Var = new lc7(i, tL_help_peerColors.hash);
            for (int i2 = 0; i2 < tL_help_peerColors.colors.size(); i2++) {
                kc7 b = kc7.b(tL_help_peerColors.colors.get(i2));
                if (b != null) {
                    b.b = b.c < 7 && i == 0;
                    if (!b.d) {
                        lc7Var.c.add(b);
                    }
                    lc7Var.d.k(b.c, b);
                }
            }
            return lc7Var;
        } catch (Exception e) {
            cc4.g(e, true);
            return null;
        }
    }

    public final int a(int i, boolean z) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i2 >= arrayList.size()) {
                return i3;
            }
            kc7 kc7Var = (kc7) arrayList.get(i2);
            if (!kc7Var.d && i >= kc7Var.l(z)) {
                i3++;
            }
            i2++;
        }
    }

    public final kc7 d(int i) {
        return (kc7) this.d.f(i);
    }

    public final int e(boolean z) {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i >= arrayList.size()) {
                return i2;
            }
            kc7 kc7Var = (kc7) arrayList.get(i);
            if (!kc7Var.d) {
                i2 = Math.max(i2, kc7Var.l(z));
            }
            i++;
        }
    }

    public final int f() {
        int i = 0;
        int e = e(false);
        while (true) {
            ArrayList arrayList = this.c;
            if (i >= arrayList.size()) {
                return e;
            }
            kc7 kc7Var = (kc7) arrayList.get(i);
            if (!kc7Var.d) {
                e = Math.min(e, kc7Var.e);
            }
            i++;
        }
    }

    public final boolean g() {
        ArrayList arrayList;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        while (true) {
            arrayList = this.c;
            if (i >= arrayList.size()) {
                break;
            }
            if (((kc7) arrayList.get(i)).e > 0) {
                z = false;
            }
            if (((kc7) arrayList.get(i)).c < 7) {
                z2 = true;
            }
            i++;
        }
        boolean z3 = this.a;
        if (z3 && !z) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z = true;
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                if (((kc7) obj).f > 0) {
                    z = false;
                    break;
                }
            }
        }
        return z || !(z3 || z2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        if (i != 0) {
            sb.append("@");
            sb.append(i);
            sb.append("^");
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i2 >= arrayList.size()) {
                return sb.toString();
            }
            kc7 kc7Var = (kc7) arrayList.get(i2);
            if (i2 > 0) {
                sb.append(";");
            }
            int[] iArr = kc7Var.h;
            int[] iArr2 = kc7Var.g;
            sb.append("#");
            if (kc7Var.d) {
                sb.append("H");
            }
            if (kc7Var.e != 0 || kc7Var.f != 0) {
                sb.append("[");
                sb.append(kc7Var.e);
                sb.append(",");
                sb.append(kc7Var.f);
                sb.append("]");
            }
            sb.append(kc7Var.c);
            sb.append("{");
            sb.append(iArr2[0]);
            if (iArr2[1] != iArr2[0]) {
                sb.append(",");
                sb.append(iArr2[1]);
                int i3 = iArr2[2];
                int i4 = iArr2[0];
                if (i3 != i4 || iArr2[3] != i4) {
                    sb.append(",");
                    sb.append(iArr2[2]);
                    sb.append(",");
                    sb.append(iArr2[3]);
                    int i5 = iArr2[4];
                    int i6 = iArr2[0];
                    if (i5 != i6 || iArr2[5] != i6) {
                        sb.append(",");
                        sb.append(iArr2[4]);
                        sb.append(",");
                        sb.append(iArr2[5]);
                    }
                }
            }
            if (iArr[0] != iArr2[0] || iArr[1] != iArr2[1] || iArr[2] != iArr2[2]) {
                sb.append("@");
                sb.append(iArr[0]);
                if (iArr[1] != iArr[0]) {
                    sb.append(",");
                    sb.append(iArr[1]);
                    int i7 = iArr[2];
                    int i8 = iArr[0];
                    if (i7 != i8 || iArr[3] != i8) {
                        sb.append(",");
                        sb.append(iArr[2]);
                        sb.append(",");
                        sb.append(iArr[3]);
                        int i9 = iArr[4];
                        int i10 = iArr[0];
                        if (i9 != i10 || iArr[5] != i10) {
                            sb.append(",");
                            sb.append(iArr[4]);
                            sb.append(",");
                            sb.append(iArr[5]);
                        }
                    }
                }
            }
            sb.append("}");
            i2++;
        }
    }
}
