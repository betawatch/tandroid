package ai;

import android.content.Context;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.fg1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class d7 extends zw0 {
    public final /* synthetic */ int K = 0;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(ok okVar, Context context, t00 t00Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, t00Var, 1, f6Var);
        this.L = okVar;
    }

    @Override // org.telegram.ui.Components.zw0
    public void e(boolean z10, boolean z11) {
        switch (this.K) {
            case 2:
                fg1 fg1Var = (fg1) this.L;
                super.e(z10, z11);
                if (!z11) {
                    fg1Var.n.a.animate().cancel();
                    fg1Var.n.a.setAlpha(z10 ? 0.0f : 1.0f);
                    break;
                } else {
                    fg1Var.n.a.animate().alpha(z10 ? 0.0f : 1.0f).start();
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
                super.onMeasure(i10, wl.d(j7Var.e, j7Var.n - j7Var.r.getPaddingTop(), TLObject.FLAG_30));
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
    public d7(fg1 fg1Var, Context context, t00 t00Var) {
        super(context, t00Var, 0, null);
        this.L = fg1Var;
    }
}
