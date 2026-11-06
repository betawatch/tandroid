package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;
    public final /* synthetic */ KeyEvent.Callback g;

    public /* synthetic */ h9(KeyEvent.Callback callback, float f10, float f11, float f12, float f13, int i7, int i10) {
        this.a = i10;
        this.g = callback;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
        this.f = i7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m9 m9Var = (m9) this.g;
                m9Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xq xqVar = xq.h;
                float interpolation = xqVar.getInterpolation(floatValue);
                float interpolation2 = xqVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                w6 w6Var = m9Var.d;
                float f10 = this.c;
                float f11 = this.b;
                w6Var.setAlpha(((f10 - f11) * interpolation2) + f11);
                TextView textView = m9Var.f;
                float f12 = this.e;
                float f13 = this.d;
                textView.setAlpha(((f12 - f13) * interpolation2) + f13);
                FrameLayout frameLayout = m9Var.e;
                frameLayout.getLayoutParams().width = Math.round(((m9Var.D - r3) * interpolation) + this.f);
                frameLayout.requestLayout();
                break;
            default:
                yh.l lVar = (yh.l) this.g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar.y = floatValue2;
                float f14 = this.b;
                float z9 = com.google.android.recaptcha.internal.a.z(1.0f, f14, floatValue2, f14);
                yh.k kVar = lVar.D;
                kVar.setScaleX(z9);
                kVar.setScaleY(z9);
                kVar.setTranslationX((1.0f - lVar.y) * this.c);
                kVar.setTranslationY((1.0f - lVar.y) * this.d);
                int i7 = (int) ((1.0f - lVar.y) * this.e);
                lVar.h.N(i7, i7);
                float a10 = c8.j9.a((lVar.y * 2.0f) - 1.0f, 0.0f, 1.0f);
                lVar.c.setAlpha((int) (a10 * 255.0f));
                lVar.d.setAlpha(a10);
                lVar.e.setAlpha(a10);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = lVar.f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - lVar.y) * this.f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a10);
                BitmapDrawable bitmapDrawable = lVar.x;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (lVar.y * 255.0f));
                }
                lVar.n.setAlpha(a10);
                break;
        }
    }
}
