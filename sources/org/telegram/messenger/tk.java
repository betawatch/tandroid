package org.telegram.messenger;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
