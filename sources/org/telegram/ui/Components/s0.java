package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.w2 b;

    public /* synthetic */ s0(org.telegram.ui.ActionBar.w2 w2Var, int i7) {
        this.a = i7;
        this.b = w2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.invalidateSelf();
                break;
            default:
                org.telegram.ui.ActionBar.w2 w2Var = this.b;
                ((c6) w2Var.d).e(true, 0.0f);
                w2Var.invalidateSelf();
                break;
        }
    }
}
