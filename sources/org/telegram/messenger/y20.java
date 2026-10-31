package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class y20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoEncodingService b;

    public /* synthetic */ y20(VideoEncodingService videoEncodingService, int i10) {
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
                jf jfVar = MediaController.B().a0;
                if (jfVar == null) {
                    videoEncodingService.stopSelf();
                    break;
                } else {
                    videoEncodingService.a(jfVar);
                    break;
                }
            default:
                VideoEncodingService videoEncodingService3 = VideoEncodingService.e;
                videoEncodingService.b();
                break;
        }
    }
}
