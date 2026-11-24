// default package

import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class je7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ je7(Object obj, int i, int i2, int i3, int i4, byte b) {
        this.a = b;
        this.f = obj;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.e;
        int i2 = this.d;
        int i3 = this.c;
        int i4 = this.b;
        Object obj = this.f;
        switch (b) {
            case 0:
                ((cf7) obj).y1(i4, i3, i2, i);
                break;
            default:
                ((TextureViewRenderer) obj).lambda$onFrameResolutionChanged$0(i4, i3, i2, i);
                break;
        }
    }
}
