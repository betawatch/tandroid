package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class uk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wk0 b;

    public /* synthetic */ uk0(wk0 wk0Var, int i7) {
        this.a = i7;
        this.b = wk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wk0 wk0Var = this.b;
                wk0Var.getClass();
                org.telegram.messenger.g0.g3(new uk0(wk0Var, 2));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new uk0(this.b, 3));
                break;
            case 2:
                super/*android.app.Dialog*/.dismiss();
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
