package bi;

import android.content.Context;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.eg1;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class m6 extends xw0 {
    public final /* synthetic */ int K = 0;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(ok okVar, Context context, t00 t00Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, t00Var, 1, f6Var);
        this.L = okVar;
    }

    @Override // org.telegram.ui.Components.xw0
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
                s6 s6Var = ((n6) this.L).d;
                super.onMeasure(i10, wl.d(s6Var.e, s6Var.n - s6Var.r.getPaddingTop(), TLObject.FLAG_30));
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
    public m6(int i10, Context context, b bVar, n6 n6Var) {
        super(context, null, i10, bVar);
        this.L = n6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(eg1 eg1Var, Context context, t00 t00Var) {
        super(context, t00Var, 0, null);
        this.L = eg1Var;
    }
}
