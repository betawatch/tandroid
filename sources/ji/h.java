package ji;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.bb;
import org.telegram.ui.Cells.h0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ n c;
    public final /* synthetic */ View d;

    public /* synthetic */ h(n nVar, View view, float f7, int i10) {
        this.a = i10;
        this.c = nVar;
        this.d = view;
        this.b = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar = this.c;
                float measuredHeight = ((nVar.G.getMeasuredHeight() - nVar.F.s9) - r2.Aa) / 2.0f;
                h0 h0Var = (h0) this.d;
                float measuredHeight2 = (measuredHeight - (h0Var.getMeasuredHeight() / 2.0f)) + nVar.F.s9;
                h0Var.setTranslationY(((((float) h0Var.getTop()) > measuredHeight2 ? measuredHeight2 - h0Var.getTop() : 0.0f) * floatValue) + ((1.0f - floatValue) * this.b));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar2 = this.c;
                float measuredHeight3 = ((nVar2.G.getMeasuredHeight() - nVar2.F.s9) - r2.Aa) / 2.0f;
                bb bbVar = (bb) this.d;
                float measuredHeight4 = (measuredHeight3 - (bbVar.getMeasuredHeight() / 2.0f)) + nVar2.F.s9;
                bbVar.setTranslationY(((((float) bbVar.getTop()) > measuredHeight4 ? measuredHeight4 - bbVar.getTop() : 0.0f) * floatValue2) + ((1.0f - floatValue2) * this.b));
                break;
        }
    }
}
