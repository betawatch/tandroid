package org.telegram.messenger;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class qk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TopicsController b;
    public final /* synthetic */ long c;

    public /* synthetic */ qk(TopicsController topicsController, long j10, int i10) {
        this.a = i10;
        this.b = topicsController;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$loadTopics$6(this.c);
                break;
            default:
                this.b.lambda$processTopics$8(this.c);
                break;
        }
    }
}
