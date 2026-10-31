package oh;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import c3.i0;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Wallet.a7;
import org.telegram.ui.Wallet.q9;
import w7.u;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;
    public final /* synthetic */ KeyEvent.Callback g;

    public /* synthetic */ k(KeyEvent.Callback callback, float f7, float f10, float f11, float f12, int i10, int i11) {
        this.a = i11;
        this.g = callback;
        this.b = f7;
        this.c = f10;
        this.d = f11;
        this.e = f12;
        this.f = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                p pVar = (p) this.g;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.y = floatValue;
                float f7 = this.b;
                float z10 = i0.z(1.0f, f7, floatValue, f7);
                o oVar = pVar.D;
                oVar.setScaleX(z10);
                oVar.setScaleY(z10);
                oVar.setTranslationX((1.0f - pVar.y) * this.c);
                oVar.setTranslationY((1.0f - pVar.y) * this.d);
                int i10 = (int) ((1.0f - pVar.y) * this.e);
                pVar.h.N(i10, i10);
                float a2 = u.a((pVar.y * 2.0f) - 1.0f, 0.0f, 1.0f);
                pVar.c.setAlpha((int) (a2 * 255.0f));
                pVar.d.setAlpha(a2);
                pVar.e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = pVar.f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - pVar.y) * this.f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = pVar.x;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (pVar.y * 255.0f));
                }
                pVar.n.setAlpha(a2);
                break;
            default:
                q9 q9Var = (q9) this.g;
                q9Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gr grVar = gr.h;
                float interpolation = grVar.getInterpolation(floatValue2);
                float interpolation2 = grVar.getInterpolation(Math.min(1.0f, (floatValue2 * 320.0f) / 120.0f));
                a7 a7Var = q9Var.d;
                float f10 = this.c;
                float f11 = this.b;
                a7Var.setAlpha(((f10 - f11) * interpolation2) + f11);
                TextView textView = q9Var.f;
                float f12 = this.e;
                float f13 = this.d;
                textView.setAlpha(((f12 - f13) * interpolation2) + f13);
                FrameLayout frameLayout = q9Var.e;
                frameLayout.getLayoutParams().width = Math.round(((q9Var.D - r3) * interpolation) + this.f);
                frameLayout.requestLayout();
                break;
        }
    }
}
