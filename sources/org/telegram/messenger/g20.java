package org.telegram.messenger;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class g20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoEncodingService b;

    public /* synthetic */ g20(VideoEncodingService videoEncodingService, int i7) {
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
                kf kfVar = MediaController.B().b0;
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
