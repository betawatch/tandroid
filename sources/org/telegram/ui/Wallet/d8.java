package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.es;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;
    public final /* synthetic */ KeyEvent.Callback g;

    public /* synthetic */ d8(KeyEvent.Callback callback, float f7, float f10, float f11, float f12, int i10, int i11) {
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
                i8 i8Var = (i8) this.g;
                i8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                es esVar = es.h;
                float interpolation = esVar.getInterpolation(floatValue);
                float interpolation2 = esVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                c6 c6Var = i8Var.c;
                float f7 = this.c;
                float f10 = this.b;
                c6Var.setAlpha(((f7 - f10) * interpolation2) + f10);
                TextView textView = i8Var.e;
                float f11 = this.e;
                float f12 = this.d;
                textView.setAlpha(((f11 - f12) * interpolation2) + f12);
                FrameLayout frameLayout = i8Var.d;
                frameLayout.getLayoutParams().width = Math.round(((i8Var.x - r3) * interpolation) + this.f);
                frameLayout.requestLayout();
                break;
            default:
                xh.k kVar = (xh.k) this.g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.x = floatValue2;
                float f13 = this.b;
                float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f13, floatValue2, f13);
                xh.j jVar = kVar.y;
                jVar.setScaleX(y3);
                jVar.setScaleY(y3);
                jVar.setTranslationX((1.0f - kVar.x) * this.c);
                jVar.setTranslationY((1.0f - kVar.x) * this.d);
                int i10 = (int) ((1.0f - kVar.x) * this.e);
                kVar.h.N(i10, i10);
                float a2 = w7.r.a((kVar.x * 2.0f) - 1.0f, 0.0f, 1.0f);
                kVar.c.setAlpha((int) (a2 * 255.0f));
                kVar.d.setAlpha(a2);
                kVar.e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = kVar.f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - kVar.x) * this.f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = kVar.w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (kVar.x * 255.0f));
                }
                kVar.n.setAlpha(a2);
                break;
        }
    }
}
