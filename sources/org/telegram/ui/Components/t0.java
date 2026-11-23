package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.v2 b;

    public /* synthetic */ t0(org.telegram.ui.ActionBar.v2 v2Var, int i7) {
        this.a = i7;
        this.b = v2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.invalidateSelf();
                break;
            default:
                org.telegram.ui.ActionBar.v2 v2Var = this.b;
                ((d6) v2Var.d).e(true, 0.0f);
                v2Var.invalidateSelf();
                break;
        }
    }
}
