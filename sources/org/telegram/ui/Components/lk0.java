package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nk0 b;

    public /* synthetic */ lk0(nk0 nk0Var, int i3) {
        this.a = i3;
        this.b = nk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nk0 nk0Var = this.b;
                nk0Var.getClass();
                org.telegram.messenger.g0.h3(new lk0(nk0Var, 2));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new lk0(this.b, 3));
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
