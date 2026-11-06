package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;

    public /* synthetic */ kd0(r3 r3Var, int i7) {
        this.a = i7;
        this.b = r3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new kd0(this.b, 1));
                break;
            default:
                this.b.a("CANCELLED");
                break;
        }
    }
}
