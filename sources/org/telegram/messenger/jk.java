package org.telegram.messenger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class jk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TopicsController b;
    public final /* synthetic */ long c;

    public /* synthetic */ jk(TopicsController topicsController, long j10, int i9) {
        this.a = i9;
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
