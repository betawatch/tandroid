// default package

import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
