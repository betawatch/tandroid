package org.telegram.tgnet;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConnectionsManager b;
    public final /* synthetic */ int c;

    public /* synthetic */ a(ConnectionsManager connectionsManager, int i7, int i10) {
        this.a = i10;
        this.b = connectionsManager;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$failNotRunningRequest$1(this.c);
                break;
            default:
                this.b.lambda$cancelRequestsForGuid$11(this.c);
                break;
        }
    }
}
