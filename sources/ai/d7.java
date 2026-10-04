package ai;

import android.content.Context;
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.w00;
import org.telegram.ui.yf1;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class d7 extends tx0 {
    public final /* synthetic */ int K = 0;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(rk rkVar, Context context, w00 w00Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, w00Var, 1, d6Var);
        this.L = rkVar;
    }

    @Override // org.telegram.ui.Components.tx0
    public void e(boolean z10, boolean z11) {
        switch (this.K) {
            case 2:
                yf1 yf1Var = (yf1) this.L;
                super.e(z10, z11);
                if (!z11) {
                    yf1Var.n.a.animate().cancel();
                    yf1Var.n.a.setAlpha(z10 ? 0.0f : 1.0f);
                    break;
                } else {
                    yf1Var.n.a.animate().alpha(z10 ? 0.0f : 1.0f).start();
                    break;
                }
            default:
                super.e(z10, z11);
                break;
        }
    }

    @Override // android.view.View
    public float getTranslationY() {
        switch (this.K) {
            case 1:
                return super.getTranslationY() - ((rk) this.L).M;
            default:
                return super.getTranslationY();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.K) {
            case 0:
                k7 k7Var = ((e7) this.L).d;
                super.onMeasure(i10, ok.c(k7Var.e, k7Var.n - k7Var.r.getPaddingTop(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        switch (this.K) {
            case 1:
                super.setTranslationY(f7 + ((rk) this.L).M);
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(int i10, d dVar, e7 e7Var, Context context) {
        super(context, null, i10, dVar);
        this.L = e7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(yf1 yf1Var, Context context, w00 w00Var) {
        super(context, w00Var, 0, null);
        this.L = yf1Var;
    }
}
