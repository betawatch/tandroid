package ki;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.bb;
import org.telegram.ui.Cells.h0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class i implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ o c;
    public final /* synthetic */ View d;

    public /* synthetic */ i(o oVar, View view, float f7, int i10) {
        this.a = i10;
        this.c = oVar;
        this.d = view;
        this.b = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o oVar = this.c;
                float measuredHeight = ((oVar.G.getMeasuredHeight() - oVar.F.s9) - r2.Aa) / 2.0f;
                h0 h0Var = (h0) this.d;
                float measuredHeight2 = (measuredHeight - (h0Var.getMeasuredHeight() / 2.0f)) + oVar.F.s9;
                h0Var.setTranslationY(((((float) h0Var.getTop()) > measuredHeight2 ? measuredHeight2 - h0Var.getTop() : 0.0f) * floatValue) + ((1.0f - floatValue) * this.b));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o oVar2 = this.c;
                float measuredHeight3 = ((oVar2.G.getMeasuredHeight() - oVar2.F.s9) - r2.Aa) / 2.0f;
                bb bbVar = (bb) this.d;
                float measuredHeight4 = (measuredHeight3 - (bbVar.getMeasuredHeight() / 2.0f)) + oVar2.F.s9;
                bbVar.setTranslationY(((((float) bbVar.getTop()) > measuredHeight4 ? measuredHeight4 - bbVar.getTop() : 0.0f) * floatValue2) + ((1.0f - floatValue2) * this.b));
                break;
        }
    }
}
