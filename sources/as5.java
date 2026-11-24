// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class as5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yy2 b;
    public final /* synthetic */ String c;

    public /* synthetic */ as5(yy2 yy2Var, String str, byte b) {
        this.a = b;
        this.b = yy2Var;
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
                Utilities.g.c(new as5(this.b, this.c, b));
                break;
            default:
                yy2 yy2Var = this.b;
                String str = this.c;
                bs5 bs5Var = (bs5) yy2Var.c;
                String lowerCase = str.trim().toLowerCase();
                if (!lowerCase.isEmpty()) {
                    ?? r5 = 0;
                    String S0 = jb6.D0().S0(lowerCase, true, false);
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
                    while (i2 < bs5Var.n.w.size()) {
                        yv2 yv2Var = (yv2) bs5Var.n.w.get(i2);
                        String lowerCase2 = bw2.m(r5, yv2Var.i, yv2Var.j).toLowerCase();
                        String S02 = jb6.D0().S0(lowerCase2, true, r5);
                        if (lowerCase2.equals(S02)) {
                            S02 = null;
                        }
                        int i3 = r5;
                        int i4 = i3;
                        while (true) {
                            if (i3 < i) {
                                String str2 = strArr[i3];
                                if (lowerCase2.startsWith(str2) || hg9.s(" ", str2, lowerCase2) || (S02 != null && (S02.startsWith(str2) || hg9.s(" ", str2, S02)))) {
                                    i4 = 1;
                                }
                                if (i4 != 0) {
                                    arrayList2.add(gm.r0(yv2Var.i, yv2Var.j, str2));
                                    arrayList.add(yv2Var);
                                } else {
                                    i3++;
                                }
                            }
                        }
                        i2++;
                        r5 = 0;
                    }
                    gm.c3(new if4(bs5Var, arrayList, arrayList2, (byte) 26));
                    break;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    bs5Var.getClass();
                    gm.c3(new if4(bs5Var, arrayList3, arrayList4, (byte) 26));
                    break;
                }
                break;
        }
    }
}
