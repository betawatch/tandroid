package org.telegram.messenger;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class z20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoEncodingService b;

    public /* synthetic */ z20(VideoEncodingService videoEncodingService, int i10) {
        this.a = i10;
        this.b = videoEncodingService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        VideoEncodingService videoEncodingService = this.b;
        switch (i10) {
            case 0:
                VideoEncodingService videoEncodingService2 = VideoEncodingService.e;
                videoEncodingService.getClass();
                kf kfVar = MediaController.B().a0;
                if (kfVar == null) {
                    videoEncodingService.stopSelf();
                    break;
                } else {
                    videoEncodingService.a(kfVar);
                    break;
                }
            default:
                VideoEncodingService videoEncodingService3 = VideoEncodingService.e;
                videoEncodingService.b();
                break;
        }
    }
}
