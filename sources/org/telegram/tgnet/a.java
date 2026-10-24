package org.telegram.tgnet;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
