package org.telegram.ui.Components.voip;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ z(a0 a0Var, int i7) {
        this.a = i7;
        this.b = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a0.a(this.b);
                break;
            default:
                a0 a0Var = this.b;
                if (a0Var.y) {
                    a0Var.h();
                    a0Var.post(new z(a0Var, 0));
                    break;
                }
                break;
        }
    }
}
