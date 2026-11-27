// default package

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
