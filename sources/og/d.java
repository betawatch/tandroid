package og;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class d extends m {
    @Override // og.m
    public final float a() {
        return 1.0f;
    }

    @Override // og.m
    public final float d() {
        return 1.0f;
    }

    @Override // og.m
    public final int e() {
        return R.raw.photo_eraser;
    }

    @Override // og.m
    public final float g() {
        return 0.35f;
    }

    @Override // og.m
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
