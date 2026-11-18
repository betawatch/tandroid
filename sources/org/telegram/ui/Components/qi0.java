package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class qi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti0 b;

    public /* synthetic */ qi0(ti0 ti0Var, int i7) {
        this.a = i7;
        this.b = ti0Var;
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
                ti0 ti0Var = this.b;
                vi0 vi0Var = ti0Var.Q;
                try {
                    ti0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                vi0Var.n0 = vi0Var.U.indexOf(ti0Var.e);
                vi0Var.m0 = ti0Var.e;
                vi0Var.invalidate();
                break;
        }
    }
}
