package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p90 b;

    public /* synthetic */ k90(p90 p90Var, int i7) {
        this.a = i7;
        this.b = p90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            default:
                this.b.c();
                break;
        }
    }
}
