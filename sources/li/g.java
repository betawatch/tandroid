package li;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.g0;
import org.telegram.ui.Cells.ya;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                float measuredHeight = ((mVar.G.getMeasuredHeight() - mVar.F.E9) - r2.Na) / 2.0f;
                g0 g0Var = (g0) this.d;
                float measuredHeight2 = (measuredHeight - (g0Var.getMeasuredHeight() / 2.0f)) + mVar.F.E9;
                g0Var.setTranslationY(((((float) g0Var.getTop()) > measuredHeight2 ? measuredHeight2 - g0Var.getTop() : 0.0f) * floatValue) + ((1.0f - floatValue) * this.b));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m mVar2 = this.c;
                float measuredHeight3 = ((mVar2.G.getMeasuredHeight() - mVar2.F.E9) - r2.Na) / 2.0f;
                ya yaVar = (ya) this.d;
                float measuredHeight4 = (measuredHeight3 - (yaVar.getMeasuredHeight() / 2.0f)) + mVar2.F.E9;
                yaVar.setTranslationY(((((float) yaVar.getTop()) > measuredHeight4 ? measuredHeight4 - yaVar.getTop() : 0.0f) * floatValue2) + ((1.0f - floatValue2) * this.b));
                break;
        }
    }
}
