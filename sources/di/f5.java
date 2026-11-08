package di;

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.vj;
import org.telegram.ui.w91;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class f5 extends av0 {
    public final /* synthetic */ int K = 0;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(vj vjVar, Context context, mz mzVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, mzVar, 1, f6Var);
        this.L = vjVar;
    }

    @Override // org.telegram.ui.Components.av0
    public void e(boolean z9, boolean z10) {
        switch (this.K) {
            case 2:
                w91 w91Var = (w91) this.L;
                super.e(z9, z10);
                if (!z10) {
                    ((TextView) w91Var.n.d).animate().cancel();
                    ((TextView) w91Var.n.d).setAlpha(z9 ? 0.0f : 1.0f);
                    break;
                } else {
                    ((TextView) w91Var.n.d).animate().alpha(z9 ? 0.0f : 1.0f).start();
                    break;
                }
            default:
                super.e(z9, z10);
                break;
        }
    }

    @Override // android.view.View
    public float getTranslationY() {
        switch (this.K) {
            case 1:
                return super.getTranslationY() - ((vj) this.L).M;
            default:
                return super.getTranslationY();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.K) {
            case 0:
                k5 k5Var = ((g5) this.L).d;
                super.onMeasure(i7, org.telegram.messenger.camera.q.c(k5Var.e, k5Var.n - k5Var.r.getPaddingTop(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.K) {
            case 1:
                super.setTranslationY(f10 + ((vj) this.L).M);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(int i7, Context context, b bVar, g5 g5Var) {
        super(context, null, i7, bVar);
        this.L = g5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(w91 w91Var, Context context, mz mzVar) {
        super(context, mzVar, 0, null);
        this.L = w91Var;
    }
}
