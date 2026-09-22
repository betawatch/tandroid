package ai;

import android.content.Context;
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.eg1;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class d7 extends yw0 {
    public final /* synthetic */ int K = 0;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(ok okVar, Context context, t00 t00Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, t00Var, 1, e6Var);
        this.L = okVar;
    }

    @Override // org.telegram.ui.Components.yw0
    public void e(boolean z10, boolean z11) {
        switch (this.K) {
            case 2:
                eg1 eg1Var = (eg1) this.L;
                super.e(z10, z11);
                if (!z11) {
                    eg1Var.n.a.animate().cancel();
                    eg1Var.n.a.setAlpha(z10 ? 0.0f : 1.0f);
                    break;
                } else {
                    eg1Var.n.a.animate().alpha(z10 ? 0.0f : 1.0f).start();
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
                super.onMeasure(i10, vl.d(j7Var.e, j7Var.n - j7Var.r.getPaddingTop(), TLObject.FLAG_30));
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
    public d7(eg1 eg1Var, Context context, t00 t00Var) {
        super(context, t00Var, 0, null);
        this.L = eg1Var;
    }
}
