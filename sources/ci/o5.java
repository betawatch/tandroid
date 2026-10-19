package ci;

import android.content.Context;
import org.telegram.messenger.kk;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.re1;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class o5 extends sx0 {
    public final /* synthetic */ int K = 0;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(nk nkVar, Context context, b10 b10Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, b10Var, 1, d6Var);
        this.L = nkVar;
    }

    @Override // org.telegram.ui.Components.sx0
    public void e(boolean z10, boolean z11) {
        switch (this.K) {
            case 2:
                re1 re1Var = (re1) this.L;
                super.e(z10, z11);
                if (!z11) {
                    re1Var.n.a.animate().cancel();
                    re1Var.n.a.setAlpha(z10 ? 0.0f : 1.0f);
                    break;
                } else {
                    re1Var.n.a.animate().alpha(z10 ? 0.0f : 1.0f).start();
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
                return super.getTranslationY() - ((nk) this.L).M;
            default:
                return super.getTranslationY();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.K) {
            case 0:
                u5 u5Var = ((p5) this.L).d;
                super.onMeasure(i10, kk.c(u5Var.e, u5Var.n - u5Var.r.getPaddingTop(), TLObject.FLAG_30));
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
                super.setTranslationY(f7 + ((nk) this.L).M);
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(int i10, Context context, b bVar, p5 p5Var) {
        super(context, null, i10, bVar);
        this.L = p5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(re1 re1Var, Context context, b10 b10Var) {
        super(context, b10Var, 0, null);
        this.L = re1Var;
    }
}
