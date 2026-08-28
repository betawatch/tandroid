package dg;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q extends ag.j {
    public final /* synthetic */ int U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Context context, int i9, int i10, int i11) {
        super(context, i9, i10);
        this.U = i11;
    }

    @Override // ag.j
    public void k() {
        switch (this.U) {
            case 1:
                break;
            default:
                super.k();
                break;
        }
    }

    @Override // ag.j, android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        switch (this.U) {
            case 0:
                super.onAttachedToWindow();
                setPaused(false);
                break;
            case 1:
            default:
                super.onAttachedToWindow();
                break;
            case 2:
                super.onAttachedToWindow();
                setPaused(false);
                break;
            case 3:
                super.onAttachedToWindow();
                setPaused(false);
                break;
            case 4:
                super.onAttachedToWindow();
                setPaused(false);
                break;
        }
    }

    @Override // ag.j, android.view.View
    public void onDetachedFromWindow() {
        switch (this.U) {
            case 0:
                super.onDetachedFromWindow();
                setPaused(true);
                break;
            case 1:
            default:
                super.onDetachedFromWindow();
                break;
            case 2:
                super.onDetachedFromWindow();
                setPaused(true);
                break;
            case 3:
                super.onDetachedFromWindow();
                setPaused(true);
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
