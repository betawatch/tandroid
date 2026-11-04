package ei;

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.m91;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f5 extends zu0 {
    public final /* synthetic */ int L = 0;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(uj ujVar, Context context, iz izVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, izVar, 1, e6Var);
        this.M = ujVar;
    }

    @Override // org.telegram.ui.Components.zu0
    public void e(boolean z10, boolean z11) {
        switch (this.L) {
            case 2:
                m91 m91Var = (m91) this.M;
                super.e(z10, z11);
                if (!z11) {
                    ((TextView) m91Var.n.d).animate().cancel();
                    ((TextView) m91Var.n.d).setAlpha(z10 ? 0.0f : 1.0f);
                    break;
                } else {
                    ((TextView) m91Var.n.d).animate().alpha(z10 ? 0.0f : 1.0f).start();
                    break;
                }
            default:
                super.e(z10, z11);
                break;
        }
    }

    @Override // android.view.View
    public float getTranslationY() {
        switch (this.L) {
            case 1:
                return super.getTranslationY() - ((uj) this.M).N;
            default:
                return super.getTranslationY();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.L) {
            case 0:
                k5 k5Var = ((g5) this.M).d;
                super.onMeasure(i3, org.telegram.messenger.camera.q.c(k5Var.e, k5Var.n - k5Var.r.getPaddingTop(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.L) {
            case 1:
                super.setTranslationY(f10 + ((uj) this.M).N);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(int i3, Context context, b bVar, g5 g5Var) {
        super(context, null, i3, bVar);
        this.M = g5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(m91 m91Var, Context context, iz izVar) {
        super(context, izVar, 0, null);
        this.M = m91Var;
    }
}
