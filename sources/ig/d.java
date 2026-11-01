package ig;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class d extends h {
    @Override // ig.h
    public final float a() {
        return 1.0f;
    }

    @Override // ig.h
    public final float d() {
        return 1.0f;
    }

    @Override // ig.h
    public final int e() {
        return R.raw.photo_eraser;
    }

    @Override // ig.h
    public final float g() {
        return 0.35f;
    }

    @Override // ig.h
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
