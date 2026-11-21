package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ml0 b;

    public /* synthetic */ nk0(ml0 ml0Var, int i7) {
        this.a = i7;
        this.b = ml0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.z0();
                break;
            case 1:
                ml0 ml0Var = this.b;
                ml0Var.getMessagesController().o7 = null;
                if (ml0Var.g1 == 3 && !ml0Var.isFinishing()) {
                    ml0Var.g1 = 4;
                    ll0 ll0Var = ml0Var.a1;
                    if (ll0Var != null) {
                        ll0Var.d(4);
                    }
                    ml0Var.finishFragment();
                    break;
                } else if (ml0Var.g1 == 1 && !ml0Var.isFinishing()) {
                    ml0Var.finishFragment();
                    break;
                }
                break;
            case 2:
                ml0 ml0Var2 = this.b;
                if (ml0Var2.e0 != null) {
                    ml0Var2.C0();
                    ml0Var2.e0 = null;
                    break;
                }
                break;
            default:
                ml0 ml0Var3 = this.b;
                ml0Var3.f[0].requestFocus();
                org.telegram.messenger.g0.I3(ml0Var3.f[0]);
                break;
        }
    }
}
