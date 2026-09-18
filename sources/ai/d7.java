package ai;

import android.content.Context;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.kx0;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.t00;
import org.telegram.ui.dg1;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class d7 extends kx0 {
    public final /* synthetic */ int K = 0;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(ok okVar, Context context, t00 t00Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, t00Var, 1, e6Var);
        this.L = okVar;
    }

    @Override // org.telegram.ui.Components.kx0
    public void e(boolean z10, boolean z11) {
        switch (this.K) {
            case 2:
                dg1 dg1Var = (dg1) this.L;
                super.e(z10, z11);
                if (!z11) {
                    dg1Var.n.a.animate().cancel();
                    dg1Var.n.a.setAlpha(z10 ? 0.0f : 1.0f);
                    break;
                } else {
                    dg1Var.n.a.animate().alpha(z10 ? 0.0f : 1.0f).start();
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
                return super.getTranslationY() - ((ok) this.L).M;
            default:
                return super.getTranslationY();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.K) {
            case 0:
                j7 j7Var = ((e7) this.L).d;
                super.onMeasure(i10, wh.y(j7Var.e, j7Var.n - j7Var.r.getPaddingTop(), TLObject.FLAG_30));
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
                super.setTranslationY(f7 + ((ok) this.L).M);
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
    public d7(dg1 dg1Var, Context context, t00 t00Var) {
        super(context, t00Var, 0, null);
        this.L = dg1Var;
    }
}
