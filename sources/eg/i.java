package eg;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class i extends fg.i {
    public final /* synthetic */ int V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Context context, int i10, int i11, int i12) {
        super(context, i10, i11);
        this.V = i12;
    }

    @Override // fg.i
    public void k() {
        switch (this.V) {
            case 3:
                break;
            default:
                super.k();
                break;
        }
    }

    @Override // fg.i, android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        switch (this.V) {
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

    @Override // fg.i, android.view.View
    public void onDetachedFromWindow() {
        switch (this.V) {
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
