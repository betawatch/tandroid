package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class xo {
    public final int a;
    public final int b;
    public final ArrayList c = new ArrayList();
    public final a0.h d = new a0.h();

    public xo(int i3, int i10) {
        this.a = i3;
        this.b = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0181 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xo b(int i3, String str) {
        int i10;
        int i11;
        int i12;
        wo woVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int[] iArr;
        int indexOf;
        int i17;
        int indexOf2;
        String str2 = str;
        wo woVar2 = null;
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
        xo xoVar = new xo(i3, i10);
        String[] split = str2.split(";");
        int i20 = 0;
        while (i20 < split.length) {
            String str3 = split[i20];
            if (str3 == null || str3.isEmpty() || str3.charAt(i18) != '#') {
                i11 = i18;
                i12 = i19;
            } else {
                boolean z10 = (str3.length() <= i19 || str3.charAt(i19) != 'H') ? i18 : i19;
                int i21 = z10 != 0 ? 2 : i19;
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
                int indexOf3 = str3.indexOf(hs.H1);
                if (indexOf3 < 0) {
                    woVar = woVar2;
                    i11 = i18;
                    i13 = i19;
                } else {
                    try {
                        try {
                            wo woVar3 = new wo();
                            i11 = i18;
                            try {
                                iArr = woVar3.h;
                                i16 = i19;
                            } catch (Exception e10) {
                                e = e10;
                                i16 = i19;
                                boolean z11 = i16;
                                a8.g(e, z11);
                                i12 = z11;
                                woVar = null;
                                i13 = i12;
                                if (woVar != null) {
                                }
                                i20++;
                                i19 = i13;
                                i18 = i11;
                                woVar2 = null;
                            }
                            try {
                                int[] iArr2 = woVar3.g;
                                woVar3.c = Utilities.z(str3.substring(i21, indexOf3)).intValue();
                                woVar3.d = z10;
                                woVar3.e = i15;
                                woVar3.f = i14;
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
                                woVar = woVar3;
                                i13 = i16;
                            } catch (Exception e11) {
                                e = e11;
                                boolean z112 = i16;
                                a8.g(e, z112);
                                i12 = z112;
                                woVar = null;
                                i13 = i12;
                                if (woVar != null) {
                                }
                                i20++;
                                i19 = i13;
                                i18 = i11;
                                woVar2 = null;
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
                if (woVar != null) {
                    woVar.b = (woVar.c >= 7 || i3 != 0) ? i11 : i13;
                    if (!woVar.d) {
                        xoVar.c.add(woVar);
                    }
                    xoVar.d.k(woVar, woVar.c);
                }
                i20++;
                i19 = i13;
                i18 = i11;
                woVar2 = null;
            }
            woVar = null;
            i13 = i12;
            if (woVar != null) {
            }
            i20++;
            i19 = i13;
            i18 = i11;
            woVar2 = null;
        }
        return xoVar;
    }

    public static xo c(int i3, TLRPC.TL_help_peerColors tL_help_peerColors) {
        try {
            xo xoVar = new xo(i3, tL_help_peerColors.hash);
            for (int i10 = 0; i10 < tL_help_peerColors.colors.size(); i10++) {
                wo b10 = wo.b(tL_help_peerColors.colors.get(i10));
                if (b10 != null) {
                    b10.b = b10.c < 7 && i3 == 0;
                    if (!b10.d) {
                        xoVar.c.add(b10);
                    }
                    xoVar.d.k(b10, b10.c);
                }
            }
            return xoVar;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public final int a(int i3, boolean z10) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i10 >= arrayList.size()) {
                return i11;
            }
            wo woVar = (wo) arrayList.get(i10);
            if (!woVar.d && i3 >= woVar.l(z10)) {
                i11++;
            }
            i10++;
        }
    }

    public final wo d(int i3) {
        return (wo) this.d.f(i3);
    }

    public final int e(boolean z10) {
        int i3 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i3 >= arrayList.size()) {
                return i10;
            }
            wo woVar = (wo) arrayList.get(i3);
            if (!woVar.d) {
                i10 = Math.max(i10, woVar.l(z10));
            }
            i3++;
        }
    }

    public final int f() {
        int i3 = 0;
        int e10 = e(false);
        while (true) {
            ArrayList arrayList = this.c;
            if (i3 >= arrayList.size()) {
                return e10;
            }
            wo woVar = (wo) arrayList.get(i3);
            if (!woVar.d) {
                e10 = Math.min(e10, woVar.e);
            }
            i3++;
        }
    }

    public final boolean g() {
        ArrayList arrayList;
        boolean z10 = true;
        int i3 = 0;
        boolean z11 = false;
        while (true) {
            arrayList = this.c;
            if (i3 >= arrayList.size()) {
                break;
            }
            if (((wo) arrayList.get(i3)).e > 0) {
                z10 = false;
            }
            if (((wo) arrayList.get(i3)).c < 7) {
                z11 = true;
            }
            i3++;
        }
        int i10 = this.a;
        if (i10 == 1 && !z10) {
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    z10 = true;
                    break;
                }
                Object obj = arrayList.get(i11);
                i11++;
                if (((wo) obj).f > 0) {
                    z10 = false;
                    break;
                }
            }
        }
        return z10 || (i10 == 0 && !z11);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i3 = this.b;
        if (i3 != 0) {
            sb2.append("@");
            sb2.append(i3);
            sb2.append("^");
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i10 >= arrayList.size()) {
                return sb2.toString();
            }
            wo woVar = (wo) arrayList.get(i10);
            if (i10 > 0) {
                sb2.append(";");
            }
            int[] iArr = woVar.h;
            int[] iArr2 = woVar.g;
            sb2.append("#");
            if (woVar.d) {
                sb2.append("H");
            }
            if (woVar.e != 0 || woVar.f != 0) {
                sb2.append("[");
                sb2.append(woVar.e);
                sb2.append(",");
                sb2.append(woVar.f);
                sb2.append("]");
            }
            sb2.append(woVar.c);
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
