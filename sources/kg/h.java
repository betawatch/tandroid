package kg;

import android.content.Context;
import org.telegram.messenger.v2;
import org.telegram.ui.du0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h extends lg.q {
    public final /* synthetic */ int i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Context context, int i10, int i11, int i12) {
        super(context, i10, i11);
        this.i0 = i12;
    }

    @Override // lg.q
    public void h() {
        switch (this.i0) {
            case 4:
                boolean z10 = v2.a;
                break;
        }
    }

    @Override // lg.q
    public void n() {
        switch (this.i0) {
            case 5:
                break;
            default:
                super.n();
                break;
        }
    }

    @Override // lg.q, android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        switch (this.i0) {
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
                super.onAttachedToWindow();
                setPaused(false);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // lg.q, android.view.View
    public void onDetachedFromWindow() {
        switch (this.i0) {
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
                super.onDetachedFromWindow();
                setPaused(true);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(du0 du0Var, Context context, int i10, int i11, Context context2) {
        super(context, i10, i11);
        this.i0 = 4;
    }

    private final void p() {
    }
}
