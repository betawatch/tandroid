package ji;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.cb;
import org.telegram.ui.Cells.h0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                cb cbVar = (cb) this.d;
                float measuredHeight4 = (measuredHeight3 - (cbVar.getMeasuredHeight() / 2.0f)) + nVar2.F.s9;
                cbVar.setTranslationY(((((float) cbVar.getTop()) > measuredHeight4 ? measuredHeight4 - cbVar.getTop() : 0.0f) * floatValue2) + ((1.0f - floatValue2) * this.b));
                break;
        }
    }
}
