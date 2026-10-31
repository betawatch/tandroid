package ci;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.f0;
import org.telegram.ui.Cells.ra;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ o c;
    public final /* synthetic */ View d;

    public /* synthetic */ j(o oVar, View view, float f7, int i10) {
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
                float measuredHeight = ((oVar.G.getMeasuredHeight() - oVar.F.L9) - r2.Ua) / 2.0f;
                f0 f0Var = (f0) this.d;
                float measuredHeight2 = (measuredHeight - (f0Var.getMeasuredHeight() / 2.0f)) + oVar.F.L9;
                f0Var.setTranslationY(((((float) f0Var.getTop()) > measuredHeight2 ? measuredHeight2 - f0Var.getTop() : 0.0f) * floatValue) + ((1.0f - floatValue) * this.b));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o oVar2 = this.c;
                float measuredHeight3 = ((oVar2.G.getMeasuredHeight() - oVar2.F.L9) - r2.Ua) / 2.0f;
                ra raVar = (ra) this.d;
                float measuredHeight4 = (measuredHeight3 - (raVar.getMeasuredHeight() / 2.0f)) + oVar2.F.L9;
                raVar.setTranslationY(((((float) raVar.getTop()) > measuredHeight4 ? measuredHeight4 - raVar.getTop() : 0.0f) * floatValue2) + ((1.0f - floatValue2) * this.b));
                break;
        }
    }
}
