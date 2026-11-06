package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.z5 b;

    public /* synthetic */ e11(org.telegram.ui.Cells.z5 z5Var, int i7) {
        this.a = i7;
        this.b = z5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.K3(((i01) this.b.Z1).h);
                break;
            default:
                this.b.requestFocus();
                break;
        }
    }
}
