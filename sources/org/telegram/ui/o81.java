package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u81 b;

    public /* synthetic */ o81(u81 u81Var, int i7) {
        this.a = i7;
        this.b = u81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u81 u81Var = this.b;
                u81Var.getClass();
                new ug.w0((org.telegram.ui.ActionBar.f2) u81Var, 11, false).show();
                break;
            default:
                u81 u81Var2 = this.b;
                u81Var2.e.requestFocus();
                org.telegram.messenger.g0.K3(u81Var2.e);
                break;
        }
    }
}
