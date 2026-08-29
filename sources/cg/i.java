package cg;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class i extends dg.i {
    public final /* synthetic */ int U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Context context, int i10, int i11, int i12) {
        super(context, i10, i11);
        this.U = i12;
    }

    @Override // dg.i
    public void k() {
        switch (this.U) {
            case 3:
                break;
            default:
                super.k();
                break;
        }
    }

    @Override // dg.i, android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        switch (this.U) {
            case 0:
                super.onAttachedToWindow();
                setPaused(false);
                break;
            case 1:
                super.onAttachedToWindow();
                setPaused(false);
                break;
            case 2:
                super.onAttachedToWindow();
                setPaused(false);
                break;
            case 3:
            default:
                super.onAttachedToWindow();
                break;
            case 4:
                super.onAttachedToWindow();
                setPaused(false);
                break;
        }
    }

    @Override // dg.i, android.view.View
    public void onDetachedFromWindow() {
        switch (this.U) {
            case 0:
                super.onDetachedFromWindow();
                setPaused(true);
                break;
            case 1:
                super.onDetachedFromWindow();
                setPaused(true);
                break;
            case 2:
                super.onDetachedFromWindow();
                setPaused(true);
                break;
            case 3:
            default:
                super.onDetachedFromWindow();
                break;
            case 4:
                super.onDetachedFromWindow();
                setPaused(true);
                break;
        }
    }

    private final void l() {
    }
}
