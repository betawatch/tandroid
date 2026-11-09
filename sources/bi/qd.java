package bi;

import android.content.Context;
import org.telegram.ui.ws0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class qd extends vg.m {
    public final /* synthetic */ int i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qd(Context context, int i7, int i10, int i11) {
        super(context, i7, i10);
        this.i0 = i11;
    }

    @Override // vg.m
    public void h() {
        switch (this.i0) {
            case 2:
                boolean z9 = org.telegram.messenger.r2.a;
                break;
        }
    }

    @Override // vg.m
    public void n() {
        switch (this.i0) {
            case 0:
                break;
            default:
                super.n();
                break;
        }
    }

    @Override // vg.m, android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        switch (this.i0) {
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

    @Override // vg.m, android.view.View
    public void onDetachedFromWindow() {
        switch (this.i0) {
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
    public qd(ws0 ws0Var, Context context, int i7, int i10, Context context2) {
        super(context, i7, i10);
        this.i0 = 2;
    }

    private final void p() {
    }
}
