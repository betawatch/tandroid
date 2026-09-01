package dg;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
