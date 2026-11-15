package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class mk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ok0 b;

    public /* synthetic */ mk0(ok0 ok0Var, int i7) {
        this.a = i7;
        this.b = ok0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ok0 ok0Var = this.b;
                ok0Var.getClass();
                org.telegram.messenger.g0.h3(new mk0(ok0Var, 2));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new mk0(this.b, 3));
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
