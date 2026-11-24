// default package

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
