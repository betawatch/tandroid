package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ik0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kk0 b;

    public /* synthetic */ ik0(kk0 kk0Var, int i7) {
        this.a = i7;
        this.b = kk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kk0 kk0Var = this.b;
                kk0Var.getClass();
                org.telegram.messenger.g0.h3(new ik0(kk0Var, 2));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new ik0(this.b, 3));
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
