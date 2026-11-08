package org.telegram.messenger;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class k20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoEncodingService b;

    public /* synthetic */ k20(VideoEncodingService videoEncodingService, int i7) {
        this.a = i7;
        this.b = videoEncodingService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        VideoEncodingService videoEncodingService = this.b;
        switch (i7) {
            case 0:
                VideoEncodingService videoEncodingService2 = VideoEncodingService.e;
                videoEncodingService.getClass();
                lf lfVar = MediaController.B().a0;
                if (lfVar == null) {
                    videoEncodingService.stopSelf();
                    break;
                } else {
                    videoEncodingService.a(lfVar);
                    break;
                }
            default:
                VideoEncodingService videoEncodingService3 = VideoEncodingService.e;
                videoEncodingService.b();
                break;
        }
    }
}
