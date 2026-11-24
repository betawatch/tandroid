// default package

import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gc7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ gc7(Object obj, int i, int i2, int i3, int i4, byte b) {
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
                ((ad7) obj).y1(i4, i3, i2, i);
                break;
            default:
                ((TextureViewRenderer) obj).lambda$onFrameResolutionChanged$0(i4, i3, i2, i);
                break;
        }
    }
}
