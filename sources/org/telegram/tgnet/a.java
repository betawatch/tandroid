package org.telegram.tgnet;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
