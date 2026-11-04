package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class r7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w7 b;

    public /* synthetic */ r7(w7 w7Var, int i3) {
        this.a = i3;
        this.b = w7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w7 w7Var = this.b;
                mg.f[] fVarArr = w7Var.c;
                mg.f[] fVarArr2 = w7Var.b;
                for (int i3 = 0; i3 < fVarArr2.length; i3++) {
                    if (((ArrayList) fVarArr2[i3].d).size() > 0 || ((ArrayList) fVarArr[i3].d).size() > 0) {
                        a8.b("download queue: dc" + (i3 + 1) + " account=" + w7Var.currentAccount + " small_operations=" + ((ArrayList) fVarArr2[i3].d).size() + " large_operations=" + ((ArrayList) fVarArr[i3].d).size());
                    }
                }
                if (r2.a) {
                    w7.K.a(w7Var.I);
                    w7.K.e(w7Var.I, 10000L);
                    break;
                }
                break;
            default:
                this.b.getNotificationCenter().k(hs.b5, new Object[0]);
                break;
        }
    }
}
