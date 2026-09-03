package cg;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class d extends m {
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
        return R.raw.photo_eraser;
    }

    @Override // cg.m
    public final float g() {
        return 0.35f;
    }

    @Override // cg.m
    public final String i(int i10) {
        if (i10 == 0) {
            return "blitWithMaskEraser";
        }
        if (i10 == 1) {
            return "compositeWithMaskEraser";
        }
        if (i10 != 2) {
            return null;
        }
        return "brush";
    }
}
