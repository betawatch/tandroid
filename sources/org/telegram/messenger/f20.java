package org.telegram.messenger;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class f20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoEncodingService b;

    public /* synthetic */ f20(VideoEncodingService videoEncodingService, int i7) {
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
                jf jfVar = MediaController.B().b0;
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
