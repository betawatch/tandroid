// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ds5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iy2 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ds5(iy2 iy2Var, String str, byte b) {
        this.a = b;
        this.b = iy2Var;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = 1;
        switch (this.a) {
            case 0:
                Utilities.g.c(new ds5(this.b, this.c, b));
                break;
            default:
                iy2 iy2Var = this.b;
                String str = this.c;
                es5 es5Var = (es5) iy2Var.c;
                String lowerCase = str.trim().toLowerCase();
                if (!lowerCase.isEmpty()) {
                    ?? r5 = 0;
                    String S0 = ob6.D0().S0(lowerCase, true, false);
                    if (lowerCase.equals(S0) || S0.isEmpty()) {
                        S0 = null;
                    }
                    int i = (S0 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i];
                    strArr[0] = lowerCase;
                    if (S0 != null) {
                        strArr[1] = S0;
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int i2 = 0;
                    while (i2 < es5Var.n.w.size()) {
                        iv2 iv2Var = (iv2) es5Var.n.w.get(i2);
                        String lowerCase2 = lv2.m(r5, iv2Var.i, iv2Var.j).toLowerCase();
                        String S02 = ob6.D0().S0(lowerCase2, true, r5);
                        if (lowerCase2.equals(S02)) {
                            S02 = null;
                        }
                        int i3 = r5;
                        int i4 = i3;
                        while (true) {
                            if (i3 < i) {
                                String str2 = strArr[i3];
                                if (lowerCase2.startsWith(str2) || uh9.t(" ", str2, lowerCase2) || (S02 != null && (S02.startsWith(str2) || uh9.t(" ", str2, S02)))) {
                                    i4 = 1;
                                }
                                if (i4 != 0) {
                                    arrayList2.add(hl.r0(iv2Var.i, iv2Var.j, str2));
                                    arrayList.add(iv2Var);
                                } else {
                                    i3++;
                                }
                            }
                        }
                        i2++;
                        r5 = 0;
                    }
                    hl.c3(new re4(es5Var, arrayList, arrayList2, (byte) 29));
                    break;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    es5Var.getClass();
                    hl.c3(new re4(es5Var, arrayList3, arrayList4, (byte) 29));
                    break;
                }
                break;
        }
    }
}
