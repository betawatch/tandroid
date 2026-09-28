package ai;

import android.content.Context;
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.kx0;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.v00;
import org.telegram.ui.wf1;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes4.dex */
public final class d7 extends kx0 {
    public final /* synthetic */ int K = 0;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(qk qkVar, Context context, v00 v00Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, v00Var, 1, d6Var);
        this.L = qkVar;
    }

    @Override // org.telegram.ui.Components.kx0
    public void e(boolean z10, boolean z11) {
        switch (this.K) {
            case 2:
                wf1 wf1Var = (wf1) this.L;
                super.e(z10, z11);
                if (!z11) {
                    wf1Var.n.a.animate().cancel();
                    wf1Var.n.a.setAlpha(z10 ? 0.0f : 1.0f);
                    break;
                } else {
                    wf1Var.n.a.animate().alpha(z10 ? 0.0f : 1.0f).start();
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
                return super.getTranslationY() - ((qk) this.L).M;
            default:
                return super.getTranslationY();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.K) {
            case 0:
                k7 k7Var = ((e7) this.L).d;
                super.onMeasure(i10, ok.c(k7Var.e, k7Var.n - k7Var.r.getPaddingTop(), TLObject.FLAG_30));
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
                super.setTranslationY(f7 + ((qk) this.L).M);
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
    public d7(wf1 wf1Var, Context context, v00 v00Var) {
        super(context, v00Var, 0, null);
        this.L = wf1Var;
    }
}
