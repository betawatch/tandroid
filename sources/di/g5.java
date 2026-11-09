package di;

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.vj;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class g5 extends cv0 {
    public final /* synthetic */ int K = 0;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(vj vjVar, Context context, mz mzVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, mzVar, 1, g6Var);
        this.L = vjVar;
    }

    @Override // org.telegram.ui.Components.cv0
    public void e(boolean z9, boolean z10) {
        switch (this.K) {
            case 2:
                y91 y91Var = (y91) this.L;
                super.e(z9, z10);
                if (!z10) {
                    ((TextView) y91Var.n.d).animate().cancel();
                    ((TextView) y91Var.n.d).setAlpha(z9 ? 0.0f : 1.0f);
                    break;
                } else {
                    ((TextView) y91Var.n.d).animate().alpha(z9 ? 0.0f : 1.0f).start();
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
                l5 l5Var = ((h5) this.L).d;
                super.onMeasure(i7, org.telegram.messenger.camera.q.c(l5Var.e, l5Var.n - l5Var.r.getPaddingTop(), TLObject.FLAG_30));
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
    public g5(int i7, Context context, b bVar, h5 h5Var) {
        super(context, null, i7, bVar);
        this.L = h5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(y91 y91Var, Context context, mz mzVar) {
        super(context, mzVar, 0, null);
        this.L = y91Var;
    }
}
