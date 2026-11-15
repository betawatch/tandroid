package di;

import android.content.Context;
import org.telegram.ui.rs0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class yb extends vg.m {
    public final /* synthetic */ int j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yb(Context context, int i7, int i10, int i11) {
        super(context, i7, i10);
        this.j0 = i11;
    }

    @Override // vg.m
    public void h() {
        switch (this.j0) {
            case 2:
                boolean z10 = org.telegram.messenger.r2.a;
                break;
        }
    }

    @Override // vg.m
    public void n() {
        switch (this.j0) {
            case 0:
                break;
            default:
                super.n();
                break;
        }
    }

    @Override // vg.m, android.view.TextureView, android.view.View
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

    @Override // vg.m, android.view.View
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
    public yb(rs0 rs0Var, Context context, int i7, int i10, Context context2) {
        super(context, i7, i10);
        this.j0 = 2;
    }

    private final void p() {
    }
}
