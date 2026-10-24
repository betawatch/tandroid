package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;
    public final /* synthetic */ KeyEvent.Callback g;

    public /* synthetic */ d9(KeyEvent.Callback callback, float f7, float f10, float f11, float f12, int i10, int i11) {
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
                i9 i9Var = (i9) this.g;
                i9Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bs bsVar = bs.h;
                float interpolation = bsVar.getInterpolation(floatValue);
                float interpolation2 = bsVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                m6 m6Var = i9Var.d;
                float f7 = this.c;
                float f10 = this.b;
                m6Var.setAlpha(((f7 - f10) * interpolation2) + f10);
                TextView textView = i9Var.f;
                float f11 = this.e;
                float f12 = this.d;
                textView.setAlpha(((f11 - f12) * interpolation2) + f12);
                FrameLayout frameLayout = i9Var.e;
                frameLayout.getLayoutParams().width = Math.round(((i9Var.y - r3) * interpolation) + this.f);
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
