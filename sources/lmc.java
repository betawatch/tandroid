// default package

import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class lmc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[VideoFrame.TextureBuffer.Type.values().length];
        a = iArr;
        try {
            iArr[VideoFrame.TextureBuffer.Type.OES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[VideoFrame.TextureBuffer.Type.RGB.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
