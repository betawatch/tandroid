// default package

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class g01 extends m01 {
    @Override // m01
    public final float a() {
        return 1.0f;
    }

    @Override // m01
    public final float c() {
        return 1.0f;
    }

    @Override // m01
    public final int d() {
        return R.raw.photo_blur;
    }

    @Override // m01
    public final float f() {
        return 0.35f;
    }

    @Override // m01
    public final String h(int i) {
        if (i == 0) {
            return "blitWithMaskBlurer";
        }
        if (i == 1) {
            return "compositeWithMaskBlurer";
        }
        if (i != 2) {
            return null;
        }
        return "brush";
    }
}
