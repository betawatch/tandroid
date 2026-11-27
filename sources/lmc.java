// default package

import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
