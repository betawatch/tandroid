package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class q6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s6 b;

    public /* synthetic */ q6(s6 s6Var, int i7) {
        this.a = i7;
        this.b = s6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.performClick();
                break;
            default:
                s6 s6Var = this.b;
                s6Var.h.invalidate();
                s6Var.n.invalidate();
                s6Var.e.invalidate();
                break;
        }
    }
}
