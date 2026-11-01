package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ml0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ol0 b;

    public /* synthetic */ ml0(ol0 ol0Var, int i10) {
        this.a = i10;
        this.b = ol0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ol0 ol0Var = this.b;
                ol0Var.getClass();
                org.telegram.messenger.i0.g3(new ml0(ol0Var, 2));
                break;
            case 1:
                org.telegram.messenger.i0.g3(new ml0(this.b, 3));
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
