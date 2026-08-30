package cg;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class b extends m {
    @Override // cg.m
    public final float a() {
        return 1.0f;
    }

    @Override // cg.m
    public final float d() {
        return 1.0f;
    }

    @Override // cg.m
    public final int e() {
        return R.raw.photo_blur;
    }

    @Override // cg.m
    public final float g() {
        return 0.35f;
    }

    @Override // cg.m
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
