// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class cq5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ox2 b;
    public final /* synthetic */ String c;

    public /* synthetic */ cq5(ox2 ox2Var, String str, byte b) {
        this.a = b;
        this.b = ox2Var;
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
                Utilities.g.c(new cq5(this.b, this.c, b));
                break;
            default:
                ox2 ox2Var = this.b;
                String str = this.c;
                dq5 dq5Var = (dq5) ox2Var.c;
                String lowerCase = str.trim().toLowerCase();
                if (!lowerCase.isEmpty()) {
                    ?? r5 = 0;
                    String S0 = k96.D0().S0(lowerCase, true, false);
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
                    while (i2 < dq5Var.n.w.size()) {
                        nu2 nu2Var = (nu2) dq5Var.n.w.get(i2);
                        String lowerCase2 = qu2.m(r5, nu2Var.i, nu2Var.j).toLowerCase();
                        String S02 = k96.D0().S0(lowerCase2, true, r5);
                        if (lowerCase2.equals(S02)) {
                            S02 = null;
                        }
                        int i3 = r5;
                        int i4 = i3;
                        while (true) {
                            if (i3 < i) {
                                String str2 = strArr[i3];
                                if (lowerCase2.startsWith(str2) || de9.t(" ", str2, lowerCase2) || (S02 != null && (S02.startsWith(str2) || de9.t(" ", str2, S02)))) {
                                    i4 = 1;
                                }
                                if (i4 != 0) {
                                    arrayList2.add(gl.r0(nu2Var.i, nu2Var.j, str2));
                                    arrayList.add(nu2Var);
                                } else {
                                    i3++;
                                }
                            }
                        }
                        i2++;
                        r5 = 0;
                    }
                    gl.c3(new jf4(dq5Var, arrayList, arrayList2, (byte) 24));
                    break;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    dq5Var.getClass();
                    gl.c3(new jf4(dq5Var, arrayList3, arrayList4, (byte) 24));
                    break;
                }
                break;
        }
    }
}
