package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public abstract class b5 extends FrameLayout implements org.telegram.messenger.ls {
    public static final /* synthetic */ int F = 0;
    public y4 D;
    public boolean E;
    public final OvershootInterpolator a;
    public final k0 b;
    public final t4 c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final u4 e;
    public final org.telegram.ui.ActionBar.f6 f;
    public final ri.b h;
    public AnimatorSet n;
    public boolean r;
    public c5[] s;
    public final View w;
    public boolean x;
    public String y;

    public b5(Context context, org.telegram.ui.ActionBar.f6 f6Var, u4 u4Var) {
        super(context);
        this.a = new OvershootInterpolator(1.02f);
        ri.b bVar = new ri.b();
        this.h = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        new Matrix();
        this.e = u4Var;
        this.f = f6Var;
        cVar.h = new jh.k(this);
        cVar.i = this;
        View view = new View(context);
        this.w = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, c8.ha.c(-1.0f, -1));
        k0 k0Var = new k0(2, context, this);
        this.b = k0Var;
        addView(k0Var, c8.ha.c(-1.0f, -1));
        t4 t4Var = new t4(context, f6Var);
        this.c = t4Var;
        float L = org.telegram.messenger.g0.L(12.0f);
        bg.q0 q0Var = bg.u0.a;
        t4Var.setOutlineProvider(new bg.s0(0, L));
        t4Var.setElevation(org.telegram.messenger.g0.L(4.0f));
        t4Var.setClipToOutline(true);
        k0Var.addView(t4Var, c8.ha.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            t4Var.setOutlineSpotShadowColor(TLObject.FLAG_31);
            t4Var.setOutlineAmbientShadowColor(TLObject.FLAG_31);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, context, f6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        fh.g c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.p(c8.g0.k(f6Var));
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.Q.e = true;
        c10.r(org.telegram.messenger.g0.L(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        k0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.ha.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(w4 w4Var) {
        this.s = w4Var.i;
        boolean z9 = w4Var.c != null;
        t4 t4Var = this.c;
        t4Var.c = z9;
        t4Var.invalidate();
        this.y = w4Var.f;
        y4 y4Var = this.D;
        if (y4Var != null) {
            if (y4Var.g) {
                y4Var.g = false;
                y4Var.b.n(y4Var.a, y4Var.e);
            }
            this.D = null;
        }
        y4 y4Var2 = w4Var.j;
        if (y4Var2 != null) {
            this.D = y4Var2;
            bi.h8 h8Var = new bi.h8(3, this, w4Var);
            if (!y4Var2.g) {
                y4Var2.g = true;
                y4Var2.f = h8Var;
                y4Var2.b.b(y4Var2.a, y4Var2.e);
                y4Var2.a();
            }
        }
        int i7 = org.telegram.messenger.p10.s0;
        org.telegram.messenger.hc hcVar = w4Var.c;
        String str = w4Var.e;
        org.telegram.messenger.hc hcVar2 = w4Var.a;
        org.telegram.messenger.hc hcVar3 = w4Var.b;
        String str2 = w4Var.d;
        BitmapDrawable bitmapDrawable = w4Var.g;
        Object obj = w4Var.h;
        org.telegram.ui.Components.l9 l9Var = (org.telegram.ui.Components.l9) t4Var.d;
        l9Var.getImageReceiver().d = i7;
        l9Var.getImageReceiver().u0(hcVar, str, hcVar2, null, hcVar3, str2, bitmapDrawable, 0L, null, obj, 1);
        l9Var.d();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i10 = 0;
        while (true) {
            c5[] c5VarArr = this.s;
            if (i10 >= c5VarArr.length) {
                b(true);
                return;
            }
            c5 c5Var = c5VarArr[i10];
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(i10 == 0, i10 == this.s.length - 1, actionBarPopupWindow$ActionBarPopupWindowLayout2, c5Var.c, org.telegram.messenger.hd.M0(c5Var.b, c5Var.a), false, this.f);
            c10.setTag(Integer.valueOf(i10));
            c10.setOnClickListener(new org.telegram.ui.ActionBar.l1(3, this, c5Var));
            i10++;
            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        }
    }

    public final void b(final boolean z9) {
        if (this.r == z9) {
            return;
        }
        this.r = z9;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(z9 ? this.a : org.telegram.ui.Components.xq.h);
        final int i7 = 0;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.z4
            public final /* synthetic */ b5 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i7) {
                    case 0:
                        b5 b5Var = this.b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b5Var.d;
                        k0 k0Var = b5Var.b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z9) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a10 = c8.j9.a(floatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * floatValue) + 0.7f;
                        k0Var.setScaleX(f10);
                        k0Var.setScaleY(f10);
                        k0Var.setAlpha(a10);
                        float f11 = 1.0f - floatValue;
                        b5Var.c.setTranslationY(org.telegram.messenger.g0.L(40.0f) * f11);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-org.telegram.messenger.g0.L(70.0f)) * f11);
                        float f12 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f12);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f12);
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z9) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        b5 b5Var2 = this.b;
                        b5Var2.w.setAlpha(floatValue2);
                        b5Var2.invalidate();
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        final int i10 = 1;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.z4
            public final /* synthetic */ b5 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        b5 b5Var = this.b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b5Var.d;
                        k0 k0Var = b5Var.b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z9) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a10 = c8.j9.a(floatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * floatValue) + 0.7f;
                        k0Var.setScaleX(f10);
                        k0Var.setScaleY(f10);
                        k0Var.setAlpha(a10);
                        float f11 = 1.0f - floatValue;
                        b5Var.c.setTranslationY(org.telegram.messenger.g0.L(40.0f) * f11);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-org.telegram.messenger.g0.L(70.0f)) * f11);
                        float f12 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f12);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f12);
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z9) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        b5 b5Var2 = this.b;
                        b5Var2.w.setAlpha(floatValue2);
                        b5Var2.invalidate();
                        break;
                }
            }
        });
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.n = animatorSet2;
        animatorSet2.setDuration(z9 ? 190L : 150L);
        this.n.playTogether(ofFloat, ofFloat2);
        this.n.addListener(new ch.y(20, this, z9));
        this.n.start();
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        t4 t4Var = this.c;
        boolean z9 = t4Var.c;
        RadialProgress2 radialProgress2 = (RadialProgress2) t4Var.e;
        if (!z9 || TextUtils.isEmpty(this.y)) {
            return;
        }
        if (i7 == org.telegram.messenger.qs.Y1) {
            if (TextUtils.equals((String) objArr[0], this.y)) {
                radialProgress2.p(true, 1.0f);
            }
        } else if (i7 == org.telegram.messenger.qs.X1 && TextUtils.equals((String) objArr[0], this.y)) {
            radialProgress2.p(true, Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() != 4 && keyEvent.getKeyCode() != 111) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (getKeyDispatcherState() == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
            if (keyDispatcherState2 != null) {
                keyDispatcherState2.startTracking(keyEvent, this);
            }
            return true;
        }
        if (keyEvent.getAction() != 1 || (keyDispatcherState = getKeyDispatcherState()) == null || !keyDispatcherState.isTracking(keyEvent) || keyEvent.isCanceled()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b(false);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.f(org.telegram.messenger.p10.s0).c(this, org.telegram.messenger.qs.Y1);
        org.telegram.messenger.qs.f(org.telegram.messenger.p10.s0).c(this, org.telegram.messenger.qs.X1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(org.telegram.messenger.p10.s0).n(this, org.telegram.messenger.qs.Y1);
        org.telegram.messenger.qs.f(org.telegram.messenger.p10.s0).n(this, org.telegram.messenger.qs.X1);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        if (i7 != 0 && i10 != 0 && this.r) {
            this.w.setBackground(null);
            org.telegram.messenger.g0.h3(new gq0(this, 12));
        }
        ih.d.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
