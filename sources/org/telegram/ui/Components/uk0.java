package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
