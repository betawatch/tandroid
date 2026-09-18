package org.telegram.tgnet;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConnectionsManager b;
    public final /* synthetic */ int c;

    public /* synthetic */ a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.a = i11;
        this.b = connectionsManager;
        this.c = i10;
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
