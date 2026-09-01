package dg;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class d extends m {
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
        return R.raw.photo_eraser;
    }

    @Override // dg.m
    public final float g() {
        return 0.35f;
    }

    @Override // dg.m
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
