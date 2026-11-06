package org.telegram.messenger;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class tc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ng b;
    public final /* synthetic */ dd c;

    public /* synthetic */ tc(ng ngVar, dd ddVar, int i7) {
        this.a = i7;
        this.b = ngVar;
        this.c = ddVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.run();
                this.c.a();
                break;
            default:
                this.b.run();
                this.c.a();
                break;
        }
    }
}
