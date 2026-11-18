package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class x9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;
    public final /* synthetic */ KeyEvent.Callback g;

    public /* synthetic */ x9(KeyEvent.Callback callback, float f10, float f11, float f12, float f13, int i7, int i10) {
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
                ca caVar = (ca) this.g;
                caVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lr lrVar = lr.h;
                float interpolation = lrVar.getInterpolation(floatValue);
                float interpolation2 = lrVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                m7 m7Var = caVar.d;
                float f10 = this.c;
                float f11 = this.b;
                m7Var.setAlpha(((f10 - f11) * interpolation2) + f11);
                TextView textView = caVar.f;
                float f12 = this.e;
                float f13 = this.d;
                textView.setAlpha(((f12 - f13) * interpolation2) + f13);
                FrameLayout frameLayout = caVar.e;
                frameLayout.getLayoutParams().width = Math.round(((caVar.E - r3) * interpolation) + this.f);
                frameLayout.requestLayout();
                break;
            default:
                zh.k kVar = (zh.k) this.g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.y = floatValue2;
                float f14 = this.b;
                float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f14, floatValue2, f14);
                zh.j jVar = kVar.E;
                jVar.setScaleX(z10);
                jVar.setScaleY(z10);
                jVar.setTranslationX((1.0f - kVar.y) * this.c);
                jVar.setTranslationY((1.0f - kVar.y) * this.d);
                int i7 = (int) ((1.0f - kVar.y) * this.e);
                kVar.h.N(i7, i7);
                float a10 = c8.l9.a((kVar.y * 2.0f) - 1.0f, 0.0f, 1.0f);
                kVar.c.setAlpha((int) (a10 * 255.0f));
                kVar.d.setAlpha(a10);
                kVar.e.setAlpha(a10);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = kVar.f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - kVar.y) * this.f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a10);
                BitmapDrawable bitmapDrawable = kVar.x;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (kVar.y * 255.0f));
                }
                kVar.n.setAlpha(a10);
                break;
        }
    }
}
