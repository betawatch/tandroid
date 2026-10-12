package ki;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.i0;
import org.telegram.ui.Cells.za;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                float measuredHeight = ((nVar.G.getMeasuredHeight() - nVar.F.s9) - r2.Ba) / 2.0f;
                i0 i0Var = (i0) this.d;
                float measuredHeight2 = (measuredHeight - (i0Var.getMeasuredHeight() / 2.0f)) + nVar.F.s9;
                i0Var.setTranslationY(((((float) i0Var.getTop()) > measuredHeight2 ? measuredHeight2 - i0Var.getTop() : 0.0f) * floatValue) + ((1.0f - floatValue) * this.b));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar2 = this.c;
                float measuredHeight3 = ((nVar2.G.getMeasuredHeight() - nVar2.F.s9) - r2.Ba) / 2.0f;
                za zaVar = (za) this.d;
                float measuredHeight4 = (measuredHeight3 - (zaVar.getMeasuredHeight() / 2.0f)) + nVar2.F.s9;
                zaVar.setTranslationY(((((float) zaVar.getTop()) > measuredHeight4 ? measuredHeight4 - zaVar.getTop() : 0.0f) * floatValue2) + ((1.0f - floatValue2) * this.b));
                break;
        }
    }
}
