package mi;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.f0;
import org.telegram.ui.Cells.ra;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ l c;
    public final /* synthetic */ View d;

    public /* synthetic */ h(l lVar, View view, float f10, int i7) {
        this.a = i7;
        this.c = lVar;
        this.d = view;
        this.b = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l lVar = this.c;
                float measuredHeight = ((lVar.G.getMeasuredHeight() - lVar.F.N9) - r2.Wa) / 2.0f;
                f0 f0Var = (f0) this.d;
                float measuredHeight2 = (measuredHeight - (f0Var.getMeasuredHeight() / 2.0f)) + lVar.F.N9;
                f0Var.setTranslationY(((((float) f0Var.getTop()) > measuredHeight2 ? measuredHeight2 - f0Var.getTop() : 0.0f) * floatValue) + ((1.0f - floatValue) * this.b));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l lVar2 = this.c;
                float measuredHeight3 = ((lVar2.G.getMeasuredHeight() - lVar2.F.N9) - r2.Wa) / 2.0f;
                ra raVar = (ra) this.d;
                float measuredHeight4 = (measuredHeight3 - (raVar.getMeasuredHeight() / 2.0f)) + lVar2.F.N9;
                raVar.setTranslationY(((((float) raVar.getTop()) > measuredHeight4 ? measuredHeight4 - raVar.getTop() : 0.0f) * floatValue2) + ((1.0f - floatValue2) * this.b));
                break;
        }
    }
}
