package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.be;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class g9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;
    public final /* synthetic */ KeyEvent.Callback g;

    public /* synthetic */ g9(KeyEvent.Callback callback, float f10, float f11, float f12, float f13, int i3, int i10) {
        this.a = i10;
        this.g = callback;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
        this.f = i3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l9 l9Var = (l9) this.g;
                l9Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xq xqVar = xq.h;
                float interpolation = xqVar.getInterpolation(floatValue);
                float interpolation2 = xqVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                u6 u6Var = l9Var.d;
                float f10 = this.c;
                float f11 = this.b;
                u6Var.setAlpha(((f10 - f11) * interpolation2) + f11);
                TextView textView = l9Var.f;
                float f12 = this.e;
                float f13 = this.d;
                textView.setAlpha(((f12 - f13) * interpolation2) + f13);
                FrameLayout frameLayout = l9Var.e;
                frameLayout.getLayoutParams().width = Math.round(((l9Var.E - r3) * interpolation) + this.f);
                frameLayout.requestLayout();
                break;
            default:
                zh.j jVar = (zh.j) this.g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar.y = floatValue2;
                float f14 = this.b;
                float y9 = com.google.android.recaptcha.internal.a.y(1.0f, f14, floatValue2, f14);
                zh.i iVar = jVar.E;
                iVar.setScaleX(y9);
                iVar.setScaleY(y9);
                iVar.setTranslationX((1.0f - jVar.y) * this.c);
                iVar.setTranslationY((1.0f - jVar.y) * this.d);
                int i3 = (int) ((1.0f - jVar.y) * this.e);
                jVar.h.N(i3, i3);
                float a10 = be.a((jVar.y * 2.0f) - 1.0f, 0.0f, 1.0f);
                jVar.c.setAlpha((int) (a10 * 255.0f));
                jVar.d.setAlpha(a10);
                jVar.e.setAlpha(a10);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = jVar.f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - jVar.y) * this.f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a10);
                BitmapDrawable bitmapDrawable = jVar.x;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (jVar.y * 255.0f));
                }
                jVar.n.setAlpha(a10);
                break;
        }
    }
}
