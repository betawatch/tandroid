// default package

import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class obc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VideoPlayerHolderBase b;
    public final /* synthetic */ float c;

    public /* synthetic */ obc(VideoPlayerHolderBase videoPlayerHolderBase, float f, byte b) {
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
