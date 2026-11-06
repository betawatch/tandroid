package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ int c;

    public /* synthetic */ dm(bn bnVar, int i7, int i10) {
        this.a = i10;
        this.b = bnVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.j0(this.c, null);
                break;
            case 1:
                this.b.g0(this.c);
                break;
            default:
                this.b.j0(this.c, null);
                break;
        }
    }
}
