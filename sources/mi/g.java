package mi;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.cb;
import org.telegram.ui.Cells.g0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ m c;
    public final /* synthetic */ View d;

    public /* synthetic */ g(m mVar, View view, float f7, int i10) {
        this.a = i10;
        this.c = mVar;
        this.d = view;
        this.b = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m mVar = this.c;
                float measuredHeight = ((mVar.G.getMeasuredHeight() - mVar.F.I9) - r2.Ra) / 2.0f;
                g0 g0Var = (g0) this.d;
                float measuredHeight2 = (measuredHeight - (g0Var.getMeasuredHeight() / 2.0f)) + mVar.F.I9;
                g0Var.setTranslationY(((((float) g0Var.getTop()) > measuredHeight2 ? measuredHeight2 - g0Var.getTop() : 0.0f) * floatValue) + ((1.0f - floatValue) * this.b));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m mVar2 = this.c;
                float measuredHeight3 = ((mVar2.G.getMeasuredHeight() - mVar2.F.I9) - r2.Ra) / 2.0f;
                cb cbVar = (cb) this.d;
                float measuredHeight4 = (measuredHeight3 - (cbVar.getMeasuredHeight() / 2.0f)) + mVar2.F.I9;
                cbVar.setTranslationY(((((float) cbVar.getTop()) > measuredHeight4 ? measuredHeight4 - cbVar.getTop() : 0.0f) * floatValue2) + ((1.0f - floatValue2) * this.b));
                break;
        }
    }
}
