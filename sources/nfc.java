// default package

import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class nfc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VideoPlayerHolderBase b;
    public final /* synthetic */ float c;

    public /* synthetic */ nfc(VideoPlayerHolderBase videoPlayerHolderBase, float f, byte b) {
        this.a = b;
        this.b = videoPlayerHolderBase;
        this.c = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        float f = this.c;
        VideoPlayerHolderBase videoPlayerHolderBase = this.b;
        switch (b) {
            case 0:
                videoPlayerHolderBase.lambda$setSpeed$5(f);
                break;
            case 1:
                videoPlayerHolderBase.lambda$play$7(f);
                break;
            default:
                videoPlayerHolderBase.lambda$setVolume$10(f);
                break;
        }
    }
}
