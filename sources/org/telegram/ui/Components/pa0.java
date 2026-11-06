package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pa0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qa0 b;

    public /* synthetic */ pa0(qa0 qa0Var, int i7) {
        this.a = i7;
        this.b = qa0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.y();
                break;
            default:
                this.b.m(true);
                break;
        }
    }
}
