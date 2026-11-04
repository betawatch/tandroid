package ci;

import android.content.Context;
import org.telegram.ui.ks0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ic extends wg.m {
    public final /* synthetic */ int j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ic(Context context, int i3, int i10, int i11) {
        super(context, i3, i10);
        this.j0 = i11;
    }

    @Override // wg.m
    public void h() {
        switch (this.j0) {
            case 2:
                boolean z10 = org.telegram.messenger.r2.a;
                break;
        }
    }

    @Override // wg.m
    public void n() {
        switch (this.j0) {
            case 0:
                break;
            default:
                super.n();
                break;
        }
    }

    @Override // wg.m, android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        switch (this.j0) {
            case 1:
                super.onAttachedToWindow();
                setPaused(false);
                break;
            case 2:
            default:
                super.onAttachedToWindow();
                break;
            case 3:
                super.onAttachedToWindow();
                setPaused(false);
                break;
            case 4:
                super.onAttachedToWindow();
                setPaused(false);
                break;
            case 5:
                super.onAttachedToWindow();
                setPaused(false);
                break;
        }
    }

    @Override // wg.m, android.view.View
    public void onDetachedFromWindow() {
        switch (this.j0) {
            case 1:
                super.onDetachedFromWindow();
                setPaused(true);
                break;
            case 2:
            default:
                super.onDetachedFromWindow();
                break;
            case 3:
                super.onDetachedFromWindow();
                setPaused(true);
                break;
            case 4:
                super.onDetachedFromWindow();
                setPaused(true);
                break;
            case 5:
                super.onDetachedFromWindow();
                setPaused(true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(ks0 ks0Var, Context context, int i3, int i10, Context context2) {
        super(context, i3, i10);
        this.j0 = 2;
    }

    private final void p() {
    }
}
