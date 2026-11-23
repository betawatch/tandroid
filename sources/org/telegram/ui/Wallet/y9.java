package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class y9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;
    public final /* synthetic */ KeyEvent.Callback g;

    public /* synthetic */ y9(KeyEvent.Callback callback, float f10, float f11, float f12, float f13, int i7, int i10) {
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
                da daVar = (da) this.g;
                daVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kr krVar = kr.h;
                float interpolation = krVar.getInterpolation(floatValue);
                float interpolation2 = krVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                n7 n7Var = daVar.d;
                float f10 = this.c;
                float f11 = this.b;
                n7Var.setAlpha(((f10 - f11) * interpolation2) + f11);
                TextView textView = daVar.f;
                float f12 = this.e;
                float f13 = this.d;
                textView.setAlpha(((f12 - f13) * interpolation2) + f13);
                FrameLayout frameLayout = daVar.e;
                frameLayout.getLayoutParams().width = Math.round(((daVar.E - r3) * interpolation) + this.f);
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
                float a10 = c8.m9.a((kVar.y * 2.0f) - 1.0f, 0.0f, 1.0f);
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
