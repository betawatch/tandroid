package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ck0 b;

    public /* synthetic */ bk0(ck0 ck0Var, int i10) {
        this.a = i10;
        this.b = ck0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ck0 ck0Var = this.b;
                ck0Var.getClass();
                try {
                    yf.e eVar = ck0Var.B0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(ck0Var.z0);
                break;
            case 1:
                ck0 ck0Var2 = this.b;
                ck0Var2.P = null;
                ck0Var2.p();
                break;
            case 2:
                ck0.h(this.b);
                break;
            case 3:
                ck0.e(this.b);
                break;
            case 4:
                ck0.d(this.b);
                break;
            case 5:
                ck0.f(this.b);
                break;
            default:
                this.b.m();
                break;
        }
    }
}
