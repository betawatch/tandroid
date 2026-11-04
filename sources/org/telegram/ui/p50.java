package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kg.m1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ p50(kg.m1 m1Var, String str, int i3) {
        this.a = i3;
        this.b = m1Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.g.c(new p50(this.b, this.c, 1));
                break;
            default:
                kg.m1 m1Var = this.b;
                String str = this.c;
                q50 q50Var = (q50) m1Var.c;
                String lowerCase = str.trim().toLowerCase();
                if (!lowerCase.isEmpty()) {
                    boolean z10 = true;
                    String S0 = org.telegram.messenger.bd.E0().S0(lowerCase, true, false);
                    if (lowerCase.equals(S0) || S0.isEmpty()) {
                        S0 = null;
                    }
                    int i3 = (S0 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i3];
                    strArr[0] = lowerCase;
                    if (S0 != null) {
                        strArr[1] = S0;
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int i10 = 0;
                    while (i10 < q50Var.n.w.size()) {
                        org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) q50Var.n.w.get(i10);
                        String lowerCase2 = org.telegram.messenger.g5.m(0, d5Var.i, d5Var.j).toLowerCase();
                        String S02 = org.telegram.messenger.bd.E0().S0(lowerCase2, z10, false);
                        if (lowerCase2.equals(S02)) {
                            S02 = null;
                        }
                        int i11 = 0;
                        boolean z11 = false;
                        while (true) {
                            if (i11 < i3) {
                                String str2 = strArr[i11];
                                if (lowerCase2.startsWith(str2) || k2.p1.z(" ", str2, lowerCase2) || (S02 != null && (S02.startsWith(str2) || k2.p1.z(" ", str2, S02)))) {
                                    z11 = true;
                                }
                                if (z11) {
                                    arrayList2.add(org.telegram.messenger.g0.r0(d5Var.i, d5Var.j, str2));
                                    arrayList.add(d5Var);
                                } else {
                                    i11++;
                                }
                            }
                        }
                        i10++;
                        z10 = true;
                    }
                    org.telegram.messenger.g0.h3(new pp(q50Var, arrayList, arrayList2, 12));
                    break;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    q50Var.getClass();
                    org.telegram.messenger.g0.h3(new pp(q50Var, arrayList3, arrayList4, 12));
                    break;
                }
                break;
        }
    }
}
