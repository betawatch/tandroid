package cg;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class e extends m {
    @Override // cg.m
    public final float a() {
        return 0.7f;
    }

    @Override // cg.m
    public final int c() {
        return -13318311;
    }

    @Override // cg.m
    public final float d() {
        return 0.5f;
    }

    @Override // cg.m
    public final int e() {
        return R.raw.photo_neon;
    }

    @Override // cg.m
    public final float g() {
        return 0.2f;
    }

    @Override // cg.m
    public final float h() {
        return 1.45f;
    }

    @Override // cg.m
    public final String i(int i10) {
        if (i10 == 0) {
            return "blitWithMaskLight";
        }
        if (i10 == 1) {
            return "compositeWithMaskLight";
        }
        if (i10 != 2) {
            return null;
        }
        return "brushLight";
    }

    @Override // cg.m
    public final float k() {
        return 0.07f;
    }

    @Override // cg.m
    public final int l() {
        return R.drawable.paint_neon_brush;
    }
}
