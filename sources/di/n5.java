package di;

import android.content.Context;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.cf1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class n5 extends fy0 {
    public final /* synthetic */ int K = 0;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(nk nkVar, Context context, c10 c10Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, c10Var, 1, u6Var);
        this.L = nkVar;
    }

    @Override // org.telegram.ui.Components.fy0
    public void e(boolean z10, boolean z11) {
        switch (this.K) {
            case 2:
                cf1 cf1Var = (cf1) this.L;
                super.e(z10, z11);
                if (!z11) {
                    cf1Var.n.a.animate().cancel();
                    cf1Var.n.a.setAlpha(z10 ? 0.0f : 1.0f);
                    break;
                } else {
                    cf1Var.n.a.animate().alpha(z10 ? 0.0f : 1.0f).start();
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
                t5 t5Var = ((o5) this.L).d;
                super.onMeasure(i10, wh.x(t5Var.e, t5Var.n - t5Var.r.getPaddingTop(), TLObject.FLAG_30));
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
    public n5(int i10, Context context, b bVar, o5 o5Var) {
        super(context, null, i10, bVar);
        this.L = o5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(cf1 cf1Var, Context context, c10 c10Var) {
        super(context, c10Var, 0, null);
        this.L = cf1Var;
    }
}
