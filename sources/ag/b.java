package ag;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b extends m {
    @Override // ag.m
    public final float a() {
        return 1.0f;
    }

    @Override // ag.m
    public final float d() {
        return 1.0f;
    }

    @Override // ag.m
    public final int e() {
        return R.raw.photo_blur;
    }

    @Override // ag.m
    public final float g() {
        return 0.35f;
    }

    @Override // ag.m
    public final String i(int i10) {
        if (i10 == 0) {
            return "blitWithMaskBlurer";
        }
        if (i10 == 1) {
            return "compositeWithMaskBlurer";
        }
        if (i10 != 2) {
            return null;
        }
        return "brush";
    }
}
