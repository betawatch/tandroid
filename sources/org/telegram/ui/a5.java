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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class a5 extends FrameLayout implements org.telegram.messenger.us {
    public static final /* synthetic */ int F = 0;
    public x4 D;
    public boolean E;
    public final OvershootInterpolator a;
    public final l0 b;
    public final ig.s c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final t4 e;
    public final org.telegram.ui.ActionBar.p6 f;
    public final hi.b h;
    public AnimatorSet n;
    public boolean r;
    public b5[] s;
    public final View w;
    public boolean x;
    public String y;

    public a5(Context context, org.telegram.ui.ActionBar.p6 p6Var, t4 t4Var) {
        super(context);
        this.a = new OvershootInterpolator(1.02f);
        hi.b bVar = new hi.b();
        this.h = bVar;
        tg.b bVar2 = new tg.b(bVar);
        new Matrix();
        this.e = t4Var;
        this.f = p6Var;
        bVar2.f = new zg.h(this);
        bVar2.g = this;
        View view = new View(context);
        this.w = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, w7.b6.c(-1.0f, -1));
        l0 l0Var = new l0(this, context, 2);
        this.b = l0Var;
        addView(l0Var, w7.b6.c(-1.0f, -1));
        ig.s sVar = new ig.s(context, p6Var);
        this.c = sVar;
        float L = org.telegram.messenger.i0.L(12.0f);
        bi.d2 d2Var = rf.e0.a;
        sVar.setOutlineProvider(new rf.c0(0, L));
        sVar.setElevation(org.telegram.messenger.i0.L(4.0f));
        sVar.setClipToOutline(true);
        l0Var.addView(sVar, w7.b6.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            sVar.setOutlineSpotShadowColor(TLObject.FLAG_31);
            sVar.setOutlineAmbientShadowColor(TLObject.FLAG_31);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, context, p6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        vg.f c10 = bVar2.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.o(w7.b9.k(p6Var));
        c10.p(org.telegram.messenger.i0.L(8.0f));
        c10.M.e = true;
        c10.q(org.telegram.messenger.i0.L(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        l0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.b6.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(v4 v4Var) {
        this.s = v4Var.i;
        boolean z10 = v4Var.c != null;
        ig.s sVar = this.c;
        sVar.b = z10;
        sVar.invalidate();
        this.y = v4Var.f;
        x4 x4Var = this.D;
        if (x4Var != null) {
            if (x4Var.g) {
                x4Var.g = false;
                x4Var.b.n(x4Var.a, x4Var.e);
            }
            this.D = null;
        }
        x4 x4Var2 = v4Var.j;
        if (x4Var2 != null) {
            this.D = x4Var2;
            mg.f0 f0Var = new mg.f0(2, this, v4Var);
            if (!x4Var2.g) {
                x4Var2.g = true;
                x4Var2.f = f0Var;
                x4Var2.b.b(x4Var2.a, x4Var2.e);
                x4Var2.a();
            }
        }
        int i10 = org.telegram.messenger.d20.s0;
        org.telegram.messenger.ic icVar = v4Var.c;
        String str = v4Var.e;
        org.telegram.messenger.ic icVar2 = v4Var.a;
        org.telegram.messenger.ic icVar3 = v4Var.b;
        String str2 = v4Var.d;
        BitmapDrawable bitmapDrawable = v4Var.g;
        Object obj = v4Var.h;
        org.telegram.ui.Components.g9 g9Var = (org.telegram.ui.Components.g9) sVar.d;
        g9Var.getImageReceiver().d = i10;
        g9Var.getImageReceiver().u0(icVar, str, icVar2, null, icVar3, str2, bitmapDrawable, 0L, null, obj, 1);
        g9Var.d();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i11 = 0;
        while (true) {
            b5[] b5VarArr = this.s;
            if (i11 >= b5VarArr.length) {
                b(true);
                return;
            }
            b5 b5Var = b5VarArr[i11];
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.b1 c10 = org.telegram.ui.ActionBar.t0.c(i11 == 0, i11 == this.s.length - 1, actionBarPopupWindow$ActionBarPopupWindowLayout2, b5Var.c, org.telegram.messenger.cd.L0(b5Var.b, b5Var.a), false, this.f);
            c10.setTag(Integer.valueOf(i11));
            c10.setOnClickListener(new ag.t0(25, this, b5Var));
            i11++;
            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        }
    }

    public final void b(final boolean z10) {
        if (this.r == z10) {
            return;
        }
        this.r = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(z10 ? this.a : org.telegram.ui.Components.gr.h);
        final int i10 = 0;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.y4
            public final /* synthetic */ a5 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        a5 a5Var = this.b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = a5Var.d;
                        l0 l0Var = a5Var.b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = w7.u.a(floatValue, 0.0f, 1.0f);
                        float f7 = (0.3f * floatValue) + 0.7f;
                        l0Var.setScaleX(f7);
                        l0Var.setScaleY(f7);
                        l0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        a5Var.c.setTranslationY(org.telegram.messenger.i0.L(40.0f) * f10);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-org.telegram.messenger.i0.L(70.0f)) * f10);
                        float f11 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f11);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f11);
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        a5 a5Var2 = this.b;
                        a5Var2.w.setAlpha(floatValue2);
                        a5Var2.invalidate();
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        final int i11 = 1;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.y4
            public final /* synthetic */ a5 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        a5 a5Var = this.b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = a5Var.d;
                        l0 l0Var = a5Var.b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = w7.u.a(floatValue, 0.0f, 1.0f);
                        float f7 = (0.3f * floatValue) + 0.7f;
                        l0Var.setScaleX(f7);
                        l0Var.setScaleY(f7);
                        l0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        a5Var.c.setTranslationY(org.telegram.messenger.i0.L(40.0f) * f10);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-org.telegram.messenger.i0.L(70.0f)) * f10);
                        float f11 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f11);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f11);
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        a5 a5Var2 = this.b;
                        a5Var2.w.setAlpha(floatValue2);
                        a5Var2.invalidate();
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
        animatorSet2.setDuration(z10 ? 190L : 150L);
        this.n.playTogether(ofFloat, ofFloat2);
        this.n.addListener(new eg.m(6, this, z10));
        this.n.start();
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ig.s sVar = this.c;
        boolean z10 = sVar.b;
        RadialProgress2 radialProgress2 = (RadialProgress2) sVar.e;
        if (!z10 || TextUtils.isEmpty(this.y)) {
            return;
        }
        if (i10 == org.telegram.messenger.zs.Y1) {
            if (TextUtils.equals((String) objArr[0], this.y)) {
                radialProgress2.p(true, 1.0f);
            }
        } else if (i10 == org.telegram.messenger.zs.X1 && TextUtils.equals((String) objArr[0], this.y)) {
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
        org.telegram.messenger.zs.f(org.telegram.messenger.d20.s0).c(this, org.telegram.messenger.zs.Y1);
        org.telegram.messenger.zs.f(org.telegram.messenger.d20.s0).c(this, org.telegram.messenger.zs.X1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.f(org.telegram.messenger.d20.s0).n(this, org.telegram.messenger.zs.Y1);
        org.telegram.messenger.zs.f(org.telegram.messenger.d20.s0).n(this, org.telegram.messenger.zs.X1);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (i10 != 0 && i11 != 0 && this.r) {
            this.w.setBackground(null);
            org.telegram.messenger.i0.g3(new rr0(this, 12));
        }
        yg.d.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
