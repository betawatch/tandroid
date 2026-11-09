package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class gp {
    public final int a;
    public final int b;
    public final ArrayList c = new ArrayList();
    public final a0.h d = new a0.h();

    public gp(int i7, int i10) {
        this.a = i7;
        this.b = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0181 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gp b(int i7, String str) {
        int i10;
        int i11;
        int i12;
        fp fpVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int[] iArr;
        int indexOf;
        int i17;
        int indexOf2;
        String str2 = str;
        fp fpVar2 = null;
        if (str2 == null) {
            return null;
        }
        int i18 = 0;
        int i19 = 1;
        if (!str2.startsWith("@") || (indexOf2 = str2.indexOf("^")) < 0) {
            i10 = 0;
        } else {
            i10 = Utilities.z(str2.substring(1, indexOf2)).intValue();
            str2 = str2.substring(indexOf2 + 1);
        }
        gp gpVar = new gp(i7, i10);
        String[] split = str2.split(";");
        int i20 = 0;
        while (i20 < split.length) {
            String str3 = split[i20];
            if (str3 == null || str3.isEmpty() || str3.charAt(i18) != '#') {
                i11 = i18;
                i12 = i19;
            } else {
                boolean z9 = (str3.length() <= i19 || str3.charAt(i19) != 'H') ? i18 : i19;
                int i21 = z9 != 0 ? 2 : i19;
                if (str3.length() <= i21 || str3.charAt(i21) != '[' || (indexOf = str3.indexOf(93)) <= i21) {
                    i14 = i18;
                    i15 = i14;
                } else {
                    String substring = str3.substring(i21 + 1, indexOf);
                    if (substring.contains(",")) {
                        String[] split2 = substring.split(",");
                        i15 = Utilities.z(split2[i18]).intValue();
                        i17 = Utilities.z(split2[i19]).intValue();
                    } else {
                        i15 = Utilities.z(substring).intValue();
                        i17 = i18;
                    }
                    int i22 = indexOf + 1;
                    i14 = i17;
                    i21 = i22;
                }
                int indexOf3 = str3.indexOf(qs.H1);
                if (indexOf3 < 0) {
                    fpVar = fpVar2;
                    i11 = i18;
                    i13 = i19;
                } else {
                    try {
                        try {
                            fp fpVar3 = new fp();
                            i11 = i18;
                            try {
                                iArr = fpVar3.h;
                                i16 = i19;
                            } catch (Exception e10) {
                                e = e10;
                                i16 = i19;
                                boolean z10 = i16;
                                a8.g(e, z10);
                                i12 = z10;
                                fpVar = null;
                                i13 = i12;
                                if (fpVar != null) {
                                }
                                i20++;
                                i19 = i13;
                                i18 = i11;
                                fpVar2 = null;
                            }
                            try {
                                int[] iArr2 = fpVar3.g;
                                fpVar3.c = Utilities.z(str3.substring(i21, indexOf3)).intValue();
                                fpVar3.d = z9;
                                fpVar3.e = i15;
                                fpVar3.f = i14;
                                String[] split3 = str3.substring(indexOf3 + 1, str3.length() - 1).split("@");
                                String[] split4 = split3[i11].split(",");
                                int i23 = i11;
                                while (i23 < 6) {
                                    int i24 = i23 + 1;
                                    iArr2[i23] = split4.length >= i24 ? Utilities.z(split4[i23]).intValue() : iArr2[i11];
                                    i23 = i24;
                                }
                                if (split3.length >= 2) {
                                    String[] split5 = split3[i16].split(",");
                                    int i25 = i11;
                                    while (i25 < 6) {
                                        int i26 = i25 + 1;
                                        iArr[i25] = split5.length >= i26 ? Utilities.z(split5[i25]).intValue() : iArr[i11];
                                        i25 = i26;
                                    }
                                } else {
                                    for (int i27 = i11; i27 < 6; i27++) {
                                        iArr[i27] = iArr2[i27];
                                    }
                                }
                                fpVar = fpVar3;
                                i13 = i16;
                            } catch (Exception e11) {
                                e = e11;
                                boolean z102 = i16;
                                a8.g(e, z102);
                                i12 = z102;
                                fpVar = null;
                                i13 = i12;
                                if (fpVar != null) {
                                }
                                i20++;
                                i19 = i13;
                                i18 = i11;
                                fpVar2 = null;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            i11 = i18;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        i11 = i18;
                    }
                }
                if (fpVar != null) {
                    fpVar.b = (fpVar.c >= 7 || i7 != 0) ? i11 : i13;
                    if (!fpVar.d) {
                        gpVar.c.add(fpVar);
                    }
                    gpVar.d.k(fpVar, fpVar.c);
                }
                i20++;
                i19 = i13;
                i18 = i11;
                fpVar2 = null;
            }
            fpVar = null;
            i13 = i12;
            if (fpVar != null) {
            }
            i20++;
            i19 = i13;
            i18 = i11;
            fpVar2 = null;
        }
        return gpVar;
    }

    public static gp c(int i7, TLRPC.TL_help_peerColors tL_help_peerColors) {
        try {
            gp gpVar = new gp(i7, tL_help_peerColors.hash);
            for (int i10 = 0; i10 < tL_help_peerColors.colors.size(); i10++) {
                fp b10 = fp.b(tL_help_peerColors.colors.get(i10));
                if (b10 != null) {
                    b10.b = b10.c < 7 && i7 == 0;
                    if (!b10.d) {
                        gpVar.c.add(b10);
                    }
                    gpVar.d.k(b10, b10.c);
                }
            }
            return gpVar;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public final int a(int i7, boolean z9) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i10 >= arrayList.size()) {
                return i11;
            }
            fp fpVar = (fp) arrayList.get(i10);
            if (!fpVar.d && i7 >= fpVar.l(z9)) {
                i11++;
            }
            i10++;
        }
    }

    public final fp d(int i7) {
        return (fp) this.d.f(i7);
    }

    public final int e(boolean z9) {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i7 >= arrayList.size()) {
                return i10;
            }
            fp fpVar = (fp) arrayList.get(i7);
            if (!fpVar.d) {
                i10 = Math.max(i10, fpVar.l(z9));
            }
            i7++;
        }
    }

    public final int f() {
        int i7 = 0;
        int e10 = e(false);
        while (true) {
            ArrayList arrayList = this.c;
            if (i7 >= arrayList.size()) {
                return e10;
            }
            fp fpVar = (fp) arrayList.get(i7);
            if (!fpVar.d) {
                e10 = Math.min(e10, fpVar.e);
            }
            i7++;
        }
    }

    public final boolean g() {
        ArrayList arrayList;
        boolean z9 = true;
        int i7 = 0;
        boolean z10 = false;
        while (true) {
            arrayList = this.c;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (((fp) arrayList.get(i7)).e > 0) {
                z9 = false;
            }
            if (((fp) arrayList.get(i7)).c < 7) {
                z10 = true;
            }
            i7++;
        }
        int i10 = this.a;
        if (i10 == 1 && !z9) {
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    z9 = true;
                    break;
                }
                Object obj = arrayList.get(i11);
                i11++;
                if (((fp) obj).f > 0) {
                    z9 = false;
                    break;
                }
            }
        }
        return z9 || (i10 == 0 && !z10);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i7 = this.b;
        if (i7 != 0) {
            sb2.append("@");
            sb2.append(i7);
            sb2.append("^");
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i10 >= arrayList.size()) {
                return sb2.toString();
            }
            fp fpVar = (fp) arrayList.get(i10);
            if (i10 > 0) {
                sb2.append(";");
            }
            int[] iArr = fpVar.h;
            int[] iArr2 = fpVar.g;
            sb2.append("#");
            if (fpVar.d) {
                sb2.append("H");
            }
            if (fpVar.e != 0 || fpVar.f != 0) {
                sb2.append("[");
                sb2.append(fpVar.e);
                sb2.append(",");
                sb2.append(fpVar.f);
                sb2.append("]");
            }
            sb2.append(fpVar.c);
            sb2.append("{");
            sb2.append(iArr2[0]);
            if (iArr2[1] != iArr2[0]) {
                sb2.append(",");
                sb2.append(iArr2[1]);
                int i11 = iArr2[2];
                int i12 = iArr2[0];
                if (i11 != i12 || iArr2[3] != i12) {
                    sb2.append(",");
                    sb2.append(iArr2[2]);
                    sb2.append(",");
                    sb2.append(iArr2[3]);
                    int i13 = iArr2[4];
                    int i14 = iArr2[0];
                    if (i13 != i14 || iArr2[5] != i14) {
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
                    int i15 = iArr[2];
                    int i16 = iArr[0];
                    if (i15 != i16 || iArr[3] != i16) {
                        sb2.append(",");
                        sb2.append(iArr[2]);
                        sb2.append(",");
                        sb2.append(iArr[3]);
                        int i17 = iArr[4];
                        int i18 = iArr[0];
                        if (i17 != i18 || iArr[5] != i18) {
                            sb2.append(",");
                            sb2.append(iArr[4]);
                            sb2.append(",");
                            sb2.append(iArr[5]);
                        }
                    }
                }
            }
            sb2.append("}");
            i10++;
        }
    }
}
