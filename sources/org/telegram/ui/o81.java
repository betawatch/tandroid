package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
