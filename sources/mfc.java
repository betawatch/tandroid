// default package

import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class mfc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VideoPlayerHolderBase b;

    public /* synthetic */ mfc(VideoPlayerHolderBase videoPlayerHolderBase, byte b) {
        this.a = b;
        this.b = videoPlayerHolderBase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        VideoPlayerHolderBase videoPlayerHolderBase = this.b;
        switch (b) {
            case 0:
                videoPlayerHolderBase.lambda$new$13();
                break;
            case 1:
                videoPlayerHolderBase.lambda$start$1();
                break;
            case 2:
                videoPlayerHolderBase.lambda$new$14();
                break;
            case 3:
                videoPlayerHolderBase.lambda$play$6();
                break;
            case 4:
                videoPlayerHolderBase.lambda$pause$4();
                break;
            default:
                videoPlayerHolderBase.lambda$loopBack$9();
                break;
        }
    }
}
