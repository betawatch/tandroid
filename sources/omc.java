// default package

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class omc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RendererCommon.ScalingType.values().length];
        a = iArr;
        try {
            iArr[RendererCommon.ScalingType.SCALE_ASPECT_FIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[RendererCommon.ScalingType.SCALE_ASPECT_FILL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[RendererCommon.ScalingType.SCALE_ASPECT_BALANCED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
