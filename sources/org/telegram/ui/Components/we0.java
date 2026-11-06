package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class we0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ze0 b;

    public /* synthetic */ we0(ze0 ze0Var, int i7) {
        this.a = i7;
        this.b = ze0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(true);
                break;
            default:
                this.b.d();
                break;
        }
    }
}
