package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class hi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ki0 b;

    public /* synthetic */ hi0(ki0 ki0Var, int i7) {
        this.a = i7;
        this.b = ki0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if (this.b.a.getImageReceiver().B() != null && !this.b.a.getImageReceiver().B().l0 && !this.b.a.getImageReceiver().B().y()) {
                    this.b.a.getImageReceiver().B().start();
                }
                this.b.F = false;
                break;
            default:
                ki0 ki0Var = this.b;
                mi0 mi0Var = ki0Var.Q;
                try {
                    ki0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                mi0Var.n0 = mi0Var.U.indexOf(ki0Var.e);
                mi0Var.m0 = ki0Var.e;
                mi0Var.invalidate();
                break;
        }
    }
}
