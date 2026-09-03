package dg;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class b extends m {
    @Override // dg.m
    public final float a() {
        return 1.0f;
    }

    @Override // dg.m
    public final float d() {
        return 1.0f;
    }

    @Override // dg.m
    public final int e() {
        return R.raw.photo_blur;
    }

    @Override // dg.m
    public final float g() {
        return 0.35f;
    }

    @Override // dg.m
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
