package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;
    public final /* synthetic */ KeyEvent.Callback g;

    public /* synthetic */ i9(KeyEvent.Callback callback, float f7, float f10, float f11, float f12, int i10, int i11) {
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
                n9 n9Var = (n9) this.g;
                n9Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bs bsVar = bs.h;
                float interpolation = bsVar.getInterpolation(floatValue);
                float interpolation2 = bsVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                s6 s6Var = n9Var.c;
                float f7 = this.c;
                float f10 = this.b;
                s6Var.setAlpha(((f7 - f10) * interpolation2) + f10);
                TextView textView = n9Var.e;
                float f11 = this.e;
                float f12 = this.d;
                textView.setAlpha(((f11 - f12) * interpolation2) + f12);
                FrameLayout frameLayout = n9Var.d;
                frameLayout.getLayoutParams().width = Math.round(((n9Var.x - r3) * interpolation) + this.f);
                frameLayout.requestLayout();
                break;
            default:
                xh.j jVar = (xh.j) this.g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar.x = floatValue2;
                float f13 = this.b;
                float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f13, floatValue2, f13);
                xh.i iVar = jVar.y;
                iVar.setScaleX(y3);
                iVar.setScaleY(y3);
                iVar.setTranslationX((1.0f - jVar.x) * this.c);
                iVar.setTranslationY((1.0f - jVar.x) * this.d);
                int i10 = (int) ((1.0f - jVar.x) * this.e);
                jVar.h.N(i10, i10);
                float a2 = w7.r.a((jVar.x * 2.0f) - 1.0f, 0.0f, 1.0f);
                jVar.c.setAlpha((int) (a2 * 255.0f));
                jVar.d.setAlpha(a2);
                jVar.e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = jVar.f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - jVar.x) * this.f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = jVar.w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (jVar.x * 255.0f));
                }
                jVar.n.setAlpha(a2);
                break;
        }
    }
}
