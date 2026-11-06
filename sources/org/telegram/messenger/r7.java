package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class r7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w7 b;

    public /* synthetic */ r7(w7 w7Var, int i7) {
        this.a = i7;
        this.b = w7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w7 w7Var = this.b;
                lg.f[] fVarArr = w7Var.c;
                lg.f[] fVarArr2 = w7Var.b;
                for (int i7 = 0; i7 < fVarArr2.length; i7++) {
                    if (((ArrayList) fVarArr2[i7].d).size() > 0 || ((ArrayList) fVarArr[i7].d).size() > 0) {
                        a8.b("download queue: dc" + (i7 + 1) + " account=" + w7Var.currentAccount + " small_operations=" + ((ArrayList) fVarArr2[i7].d).size() + " large_operations=" + ((ArrayList) fVarArr[i7].d).size());
                    }
                }
                if (r2.a) {
                    w7.J.a(w7Var.H);
                    w7.J.d(w7Var.H, 10000L);
                    break;
                }
                break;
            default:
                this.b.getNotificationCenter().k(qs.b5, new Object[0]);
                break;
        }
    }
}
