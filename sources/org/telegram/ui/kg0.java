package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg0 b;

    public /* synthetic */ kg0(qg0 qg0Var, int i7) {
        this.a = i7;
        this.b = qg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                this.b.g1(true, false);
                break;
            default:
                this.b.g1(true, false);
                break;
        }
    }
}
