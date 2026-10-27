package bi;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class qd extends ug.n {
    public final /* synthetic */ int i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qd(Context context, int i10, int i11, int i12) {
        super(context, i10, i11);
        this.i0 = i12;
    }

    @Override // ug.n
    public void n() {
        switch (this.i0) {
            case 0:
                break;
            default:
                super.n();
                break;
        }
    }

    @Override // ug.n, android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        switch (this.i0) {
            case 1:
                super.onAttachedToWindow();
                setPaused(false);
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
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // ug.n, android.view.View
    public void onDetachedFromWindow() {
        switch (this.i0) {
            case 1:
                super.onDetachedFromWindow();
                setPaused(true);
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
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    private final void p() {
    }
}
