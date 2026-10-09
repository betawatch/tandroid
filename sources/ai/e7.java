package ai;

import android.content.Context;
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ay0;
import org.telegram.ui.Components.j10;
import org.telegram.ui.Components.sk;
import org.telegram.ui.fg1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class e7 extends ay0 {
    public final /* synthetic */ int K = 0;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(sk skVar, Context context, j10 j10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, j10Var, 1, e6Var);
        this.L = skVar;
    }

    @Override // org.telegram.ui.Components.ay0
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
                return super.getTranslationY() - ((sk) this.L).M;
            default:
                return super.getTranslationY();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.K) {
            case 0:
                l7 l7Var = ((f7) this.L).d;
                super.onMeasure(i10, bi.c(l7Var.e, l7Var.n - l7Var.r.getPaddingTop(), TLObject.FLAG_30));
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
                super.setTranslationY(f7 + ((sk) this.L).M);
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(int i10, d dVar, f7 f7Var, Context context) {
        super(context, null, i10, dVar);
        this.L = f7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(fg1 fg1Var, Context context, j10 j10Var) {
        super(context, j10Var, 0, null);
        this.L = fg1Var;
    }
}
