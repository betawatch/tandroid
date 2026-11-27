// default package

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
