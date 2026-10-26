package di;

import android.content.Context;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.af1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class n5 extends ey0 {
    public final /* synthetic */ int K = 0;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(nk nkVar, Context context, c10 c10Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, c10Var, 1, u6Var);
        this.L = nkVar;
    }

    @Override // org.telegram.ui.Components.ey0
    public void e(boolean z10, boolean z11) {
        switch (this.K) {
            case 2:
                af1 af1Var = (af1) this.L;
                super.e(z10, z11);
                if (!z11) {
                    af1Var.n.a.animate().cancel();
                    af1Var.n.a.setAlpha(z10 ? 0.0f : 1.0f);
                    break;
                } else {
                    af1Var.n.a.animate().alpha(z10 ? 0.0f : 1.0f).start();
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
                super.onMeasure(i10, vh.x(t5Var.e, t5Var.n - t5Var.r.getPaddingTop(), TLObject.FLAG_30));
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
    public n5(af1 af1Var, Context context, c10 c10Var) {
        super(context, c10Var, 0, null);
        this.L = af1Var;
    }
}
