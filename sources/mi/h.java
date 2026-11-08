package mi;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.f0;
import org.telegram.ui.Cells.ra;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                float measuredHeight = ((lVar.G.getMeasuredHeight() - lVar.F.L9) - r2.Ua) / 2.0f;
                f0 f0Var = (f0) this.d;
                float measuredHeight2 = (measuredHeight - (f0Var.getMeasuredHeight() / 2.0f)) + lVar.F.L9;
                f0Var.setTranslationY(((((float) f0Var.getTop()) > measuredHeight2 ? measuredHeight2 - f0Var.getTop() : 0.0f) * floatValue) + ((1.0f - floatValue) * this.b));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l lVar2 = this.c;
                float measuredHeight3 = ((lVar2.G.getMeasuredHeight() - lVar2.F.L9) - r2.Ua) / 2.0f;
                ra raVar = (ra) this.d;
                float measuredHeight4 = (measuredHeight3 - (raVar.getMeasuredHeight() / 2.0f)) + lVar2.F.L9;
                raVar.setTranslationY(((((float) raVar.getTop()) > measuredHeight4 ? measuredHeight4 - raVar.getTop() : 0.0f) * floatValue2) + ((1.0f - floatValue2) * this.b));
                break;
        }
    }
}
