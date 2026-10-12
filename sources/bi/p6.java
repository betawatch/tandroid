package bi;

import android.content.Context;
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.pk;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.lg1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class p6 extends wx0 {
    public final /* synthetic */ int K = 0;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(pk pkVar, Context context, f10 f10Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, f10Var, 1, c6Var);
        this.L = pkVar;
    }

    @Override // org.telegram.ui.Components.wx0
    public void e(boolean z10, boolean z11) {
        switch (this.K) {
            case 2:
                lg1 lg1Var = (lg1) this.L;
                super.e(z10, z11);
                if (!z11) {
                    lg1Var.n.a.animate().cancel();
                    lg1Var.n.a.setAlpha(z10 ? 0.0f : 1.0f);
                    break;
                } else {
                    lg1Var.n.a.animate().alpha(z10 ? 0.0f : 1.0f).start();
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
                return super.getTranslationY() - ((pk) this.L).M;
            default:
                return super.getTranslationY();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.K) {
            case 0:
                w6 w6Var = ((q6) this.L).d;
                super.onMeasure(i10, yh.z(w6Var.e, w6Var.n - w6Var.r.getPaddingTop(), TLObject.FLAG_30));
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
                super.setTranslationY(f7 + ((pk) this.L).M);
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(int i10, Context context, b bVar, q6 q6Var) {
        super(context, null, i10, bVar);
        this.L = q6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(lg1 lg1Var, Context context, f10 f10Var) {
        super(context, f10Var, 0, null);
        this.L = lg1Var;
    }
}
