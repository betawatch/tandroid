package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t5 b;

    public /* synthetic */ s5(t5 t5Var, int i7) {
        this.a = i7;
        this.b = t5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new s5(this.b, 1));
                break;
            default:
                this.b.a();
                break;
        }
    }
}
