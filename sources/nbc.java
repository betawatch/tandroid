// default package

import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class nbc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VideoPlayerHolderBase b;

    public /* synthetic */ nbc(VideoPlayerHolderBase videoPlayerHolderBase, byte b) {
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
