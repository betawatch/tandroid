package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class lp {
    public final int a;
    public final int b;
    public final ArrayList c = new ArrayList();
    public final a0.h d = new a0.h();

    public lp(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0181 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static lp b(int i10, String str) {
        int i11;
        int i12;
        int i13;
        kp kpVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int[] iArr;
        int indexOf;
        int i18;
        int indexOf2;
        String str2 = str;
        kp kpVar2 = null;
        if (str2 == null) {
            return null;
        }
        int i19 = 0;
        int i20 = 1;
        if (!str2.startsWith("@") || (indexOf2 = str2.indexOf("^")) < 0) {
            i11 = 0;
        } else {
            i11 = Utilities.z(str2.substring(1, indexOf2)).intValue();
            str2 = str2.substring(indexOf2 + 1);
        }
        lp lpVar = new lp(i10, i11);
        String[] split = str2.split(";");
        int i21 = 0;
        while (i21 < split.length) {
            String str3 = split[i21];
            if (str3 == null || str3.isEmpty() || str3.charAt(i19) != '#') {
                i12 = i19;
                i13 = i20;
            } else {
                boolean z10 = (str3.length() <= i20 || str3.charAt(i20) != 'H') ? i19 : i20;
                int i22 = z10 != 0 ? 2 : i20;
                if (str3.length() <= i22 || str3.charAt(i22) != '[' || (indexOf = str3.indexOf(93)) <= i22) {
                    i15 = i19;
                    i16 = i15;
                } else {
                    String substring = str3.substring(i22 + 1, indexOf);
                    if (substring.contains(",")) {
                        String[] split2 = substring.split(",");
                        i16 = Utilities.z(split2[i19]).intValue();
                        i18 = Utilities.z(split2[i20]).intValue();
                    } else {
                        i16 = Utilities.z(substring).intValue();
                        i18 = i19;
                    }
                    int i23 = indexOf + 1;
                    i15 = i18;
                    i22 = i23;
                }
                int indexOf3 = str3.indexOf(zs.H1);
                if (indexOf3 < 0) {
                    kpVar = kpVar2;
                    i12 = i19;
                    i14 = i20;
                } else {
                    try {
                        try {
                            kp kpVar3 = new kp();
                            i12 = i19;
                            try {
                                iArr = kpVar3.h;
                                i17 = i20;
                            } catch (Exception e) {
                                e = e;
                                i17 = i20;
                                boolean z11 = i17;
                                f8.g(e, z11);
                                i13 = z11;
                                kpVar = null;
                                i14 = i13;
                                if (kpVar != null) {
                                }
                                i21++;
                                i20 = i14;
                                i19 = i12;
                                kpVar2 = null;
                            }
                            try {
                                int[] iArr2 = kpVar3.g;
                                kpVar3.c = Utilities.z(str3.substring(i22, indexOf3)).intValue();
                                kpVar3.d = z10;
                                kpVar3.e = i16;
                                kpVar3.f = i15;
                                String[] split3 = str3.substring(indexOf3 + 1, str3.length() - 1).split("@");
                                String[] split4 = split3[i12].split(",");
                                int i24 = i12;
                                while (i24 < 6) {
                                    int i25 = i24 + 1;
                                    iArr2[i24] = split4.length >= i25 ? Utilities.z(split4[i24]).intValue() : iArr2[i12];
                                    i24 = i25;
                                }
                                if (split3.length >= 2) {
                                    String[] split5 = split3[i17].split(",");
                                    int i26 = i12;
                                    while (i26 < 6) {
                                        int i27 = i26 + 1;
                                        iArr[i26] = split5.length >= i27 ? Utilities.z(split5[i26]).intValue() : iArr[i12];
                                        i26 = i27;
                                    }
                                } else {
                                    for (int i28 = i12; i28 < 6; i28++) {
                                        iArr[i28] = iArr2[i28];
                                    }
                                }
                                kpVar = kpVar3;
                                i14 = i17;
                            } catch (Exception e7) {
                                e = e7;
                                boolean z112 = i17;
                                f8.g(e, z112);
                                i13 = z112;
                                kpVar = null;
                                i14 = i13;
                                if (kpVar != null) {
                                }
                                i21++;
                                i20 = i14;
                                i19 = i12;
                                kpVar2 = null;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            i12 = i19;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        i12 = i19;
                    }
                }
                if (kpVar != null) {
                    kpVar.b = (kpVar.c >= 7 || i10 != 0) ? i12 : i14;
                    if (!kpVar.d) {
                        lpVar.c.add(kpVar);
                    }
                    lpVar.d.k(kpVar, kpVar.c);
                }
                i21++;
                i20 = i14;
                i19 = i12;
                kpVar2 = null;
            }
            kpVar = null;
            i14 = i13;
            if (kpVar != null) {
            }
            i21++;
            i20 = i14;
            i19 = i12;
            kpVar2 = null;
        }
        return lpVar;
    }

    public static lp c(int i10, TLRPC.TL_help_peerColors tL_help_peerColors) {
        try {
            lp lpVar = new lp(i10, tL_help_peerColors.hash);
            for (int i11 = 0; i11 < tL_help_peerColors.colors.size(); i11++) {
                kp b10 = kp.b(tL_help_peerColors.colors.get(i11));
                if (b10 != null) {
                    b10.b = b10.c < 7 && i10 == 0;
                    if (!b10.d) {
                        lpVar.c.add(b10);
                    }
                    lpVar.d.k(b10, b10.c);
                }
            }
            return lpVar;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public final int a(int i10, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i11 >= arrayList.size()) {
                return i12;
            }
            kp kpVar = (kp) arrayList.get(i11);
            if (!kpVar.d && i10 >= kpVar.l(z10)) {
                i12++;
            }
            i11++;
        }
    }

    public final kp d(int i10) {
        return (kp) this.d.f(i10);
    }

    public final int e(boolean z10) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i10 >= arrayList.size()) {
                return i11;
            }
            kp kpVar = (kp) arrayList.get(i10);
            if (!kpVar.d) {
                i11 = Math.max(i11, kpVar.l(z10));
            }
            i10++;
        }
    }

    public final int f() {
        int i10 = 0;
        int e = e(false);
        while (true) {
            ArrayList arrayList = this.c;
            if (i10 >= arrayList.size()) {
                return e;
            }
            kp kpVar = (kp) arrayList.get(i10);
            if (!kpVar.d) {
                e = Math.min(e, kpVar.e);
            }
            i10++;
        }
    }

    public final boolean g() {
        ArrayList arrayList;
        boolean z10 = true;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            arrayList = this.c;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (((kp) arrayList.get(i10)).e > 0) {
                z10 = false;
            }
            if (((kp) arrayList.get(i10)).c < 7) {
                z11 = true;
            }
            i10++;
        }
        int i11 = this.a;
        if (i11 == 1 && !z10) {
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    z10 = true;
                    break;
                }
                Object obj = arrayList.get(i12);
                i12++;
                if (((kp) obj).f > 0) {
                    z10 = false;
                    break;
                }
            }
        }
        return z10 || (i11 == 0 && !z11);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.b;
        if (i10 != 0) {
            sb2.append("@");
            sb2.append(i10);
            sb2.append("^");
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i11 >= arrayList.size()) {
                return sb2.toString();
            }
            kp kpVar = (kp) arrayList.get(i11);
            if (i11 > 0) {
                sb2.append(";");
            }
            int[] iArr = kpVar.h;
            int[] iArr2 = kpVar.g;
            sb2.append("#");
            if (kpVar.d) {
                sb2.append("H");
            }
            if (kpVar.e != 0 || kpVar.f != 0) {
                sb2.append("[");
                sb2.append(kpVar.e);
                sb2.append(",");
                sb2.append(kpVar.f);
                sb2.append("]");
            }
            sb2.append(kpVar.c);
            sb2.append("{");
            sb2.append(iArr2[0]);
            if (iArr2[1] != iArr2[0]) {
                sb2.append(",");
                sb2.append(iArr2[1]);
                int i12 = iArr2[2];
                int i13 = iArr2[0];
                if (i12 != i13 || iArr2[3] != i13) {
                    sb2.append(",");
                    sb2.append(iArr2[2]);
                    sb2.append(",");
                    sb2.append(iArr2[3]);
                    int i14 = iArr2[4];
                    int i15 = iArr2[0];
                    if (i14 != i15 || iArr2[5] != i15) {
                        sb2.append(",");
                        sb2.append(iArr2[4]);
                        sb2.append(",");
                        sb2.append(iArr2[5]);
                    }
                }
            }
            if (iArr[0] != iArr2[0] || iArr[1] != iArr2[1] || iArr[2] != iArr2[2]) {
                sb2.append("@");
                sb2.append(iArr[0]);
                if (iArr[1] != iArr[0]) {
                    sb2.append(",");
                    sb2.append(iArr[1]);
                    int i16 = iArr[2];
                    int i17 = iArr[0];
                    if (i16 != i17 || iArr[3] != i17) {
                        sb2.append(",");
                        sb2.append(iArr[2]);
                        sb2.append(",");
                        sb2.append(iArr[3]);
                        int i18 = iArr[4];
                        int i19 = iArr[0];
                        if (i18 != i19 || iArr[5] != i19) {
                            sb2.append(",");
                            sb2.append(iArr[4]);
                            sb2.append(",");
                            sb2.append(iArr[5]);
                        }
                    }
                }
            }
            sb2.append("}");
            i11++;
        }
    }
}
