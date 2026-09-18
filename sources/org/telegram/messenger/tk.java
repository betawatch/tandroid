package org.telegram.messenger;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final /* synthetic */ class tk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TopicsController b;
    public final /* synthetic */ long c;

    public /* synthetic */ tk(TopicsController topicsController, long j3, int i10) {
        this.a = i10;
        this.b = topicsController;
        this.c = j3;
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
