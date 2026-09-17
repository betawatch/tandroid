package org.telegram.messenger.video;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoPlayerHolderBase b;

    public /* synthetic */ j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.a = i10;
        this.b = videoPlayerHolderBase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$new$13();
                break;
            case 1:
                this.b.lambda$start$1();
                break;
            case 2:
                this.b.lambda$new$14();
                break;
            case 3:
                this.b.lambda$play$6();
                break;
            case 4:
                this.b.lambda$pause$4();
                break;
            default:
                this.b.lambda$loopBack$9();
                break;
        }
    }
}
