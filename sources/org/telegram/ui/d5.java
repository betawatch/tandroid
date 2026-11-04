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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class d5 extends FrameLayout implements org.telegram.messenger.cs {
    public static final /* synthetic */ int G = 0;
    public a5 E;
    public boolean F;
    public final OvershootInterpolator a;
    public final l0 b;
    public final v4 c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final w4 e;
    public final org.telegram.ui.ActionBar.e6 f;
    public final si.b h;
    public AnimatorSet n;
    public boolean r;
    public e5[] s;
    public final View w;
    public boolean x;
    public String y;

    public d5(Context context, org.telegram.ui.ActionBar.e6 e6Var, w4 w4Var) {
        super(context);
        this.a = new OvershootInterpolator(1.02f);
        si.b bVar = new si.b();
        this.h = bVar;
        eh.c cVar = new eh.c(bVar, bVar, bVar);
        new Matrix();
        this.e = w4Var;
        this.f = e6Var;
        cVar.h = new kh.k(this);
        cVar.i = this;
        View view = new View(context);
        this.w = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, b8.mf.c(-1.0f, -1));
        l0 l0Var = new l0(2, context, this);
        this.b = l0Var;
        addView(l0Var, b8.mf.c(-1.0f, -1));
        v4 v4Var = new v4(context, e6Var);
        this.c = v4Var;
        float L = org.telegram.messenger.g0.L(12.0f);
        cg.p0 p0Var = cg.t0.a;
        v4Var.setOutlineProvider(new cg.r0(0, L));
        v4Var.setElevation(org.telegram.messenger.g0.L(4.0f));
        v4Var.setClipToOutline(true);
        l0Var.addView(v4Var, b8.mf.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            v4Var.setOutlineSpotShadowColor(TLObject.FLAG_31);
            v4Var.setOutlineAmbientShadowColor(TLObject.FLAG_31);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, context, e6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        gh.g c2 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c2.p(b8.cd.k(e6Var));
        c2.q(org.telegram.messenger.g0.L(8.0f));
        c2.R.e = true;
        c2.r(org.telegram.messenger.g0.L(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c2);
        l0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, b8.mf.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(y4 y4Var) {
        this.s = y4Var.i;
        boolean z10 = y4Var.c != null;
        v4 v4Var = this.c;
        v4Var.c = z10;
        v4Var.invalidate();
        this.y = y4Var.f;
        a5 a5Var = this.E;
        if (a5Var != null) {
            if (a5Var.g) {
                a5Var.g = false;
                a5Var.b.n(a5Var.a, a5Var.e);
            }
            this.E = null;
        }
        a5 a5Var2 = y4Var.j;
        if (a5Var2 != null) {
            this.E = a5Var2;
            ci.i7 i7Var = new ci.i7(3, this, y4Var);
            if (!a5Var2.g) {
                a5Var2.g = true;
                a5Var2.f = i7Var;
                a5Var2.b.b(a5Var2.a, a5Var2.e);
                a5Var2.a();
            }
        }
        int i3 = org.telegram.messenger.h10.t0;
        org.telegram.messenger.ac acVar = y4Var.c;
        String str = y4Var.e;
        org.telegram.messenger.ac acVar2 = y4Var.a;
        org.telegram.messenger.ac acVar3 = y4Var.b;
        String str2 = y4Var.d;
        BitmapDrawable bitmapDrawable = y4Var.g;
        Object obj = y4Var.h;
        org.telegram.ui.Components.k9 k9Var = (org.telegram.ui.Components.k9) v4Var.d;
        k9Var.getImageReceiver().d = i3;
        k9Var.getImageReceiver().u0(acVar, str, acVar2, null, acVar3, str2, bitmapDrawable, 0L, null, obj, 1);
        k9Var.d();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i10 = 0;
        while (true) {
            e5[] e5VarArr = this.s;
            if (i10 >= e5VarArr.length) {
                b(true);
                return;
            }
            e5 e5Var = e5VarArr[i10];
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.y0 c2 = org.telegram.ui.ActionBar.q0.c(i10 == 0, i10 == this.s.length - 1, actionBarPopupWindow$ActionBarPopupWindowLayout2, e5Var.c, org.telegram.messenger.bd.M0(e5Var.b, e5Var.a), false, this.f);
            c2.setTag(Integer.valueOf(i10));
            c2.setOnClickListener(new org.telegram.messenger.video.g(9, this, e5Var));
            i10++;
            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        }
    }

    public final void b(final boolean z10) {
        if (this.r == z10) {
            return;
        }
        this.r = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(z10 ? this.a : org.telegram.ui.Components.xq.h);
        final int i3 = 0;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.b5
            public final /* synthetic */ d5 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        d5 d5Var = this.b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = d5Var.d;
                        l0 l0Var = d5Var.b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a10 = b8.be.a(floatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * floatValue) + 0.7f;
                        l0Var.setScaleX(f10);
                        l0Var.setScaleY(f10);
                        l0Var.setAlpha(a10);
                        float f11 = 1.0f - floatValue;
                        d5Var.c.setTranslationY(org.telegram.messenger.g0.L(40.0f) * f11);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-org.telegram.messenger.g0.L(70.0f)) * f11);
                        float f12 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f12);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f12);
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        d5 d5Var2 = this.b;
                        d5Var2.w.setAlpha(floatValue2);
                        d5Var2.invalidate();
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        final int i10 = 1;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.b5
            public final /* synthetic */ d5 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        d5 d5Var = this.b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = d5Var.d;
                        l0 l0Var = d5Var.b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a10 = b8.be.a(floatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * floatValue) + 0.7f;
                        l0Var.setScaleX(f10);
                        l0Var.setScaleY(f10);
                        l0Var.setAlpha(a10);
                        float f11 = 1.0f - floatValue;
                        d5Var.c.setTranslationY(org.telegram.messenger.g0.L(40.0f) * f11);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-org.telegram.messenger.g0.L(70.0f)) * f11);
                        float f12 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f12);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f12);
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        d5 d5Var2 = this.b;
                        d5Var2.w.setAlpha(floatValue2);
                        d5Var2.invalidate();
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
        this.n.addListener(new dh.x(20, this, z10));
        this.n.start();
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        v4 v4Var = this.c;
        boolean z10 = v4Var.c;
        RadialProgress2 radialProgress2 = (RadialProgress2) v4Var.e;
        if (!z10 || TextUtils.isEmpty(this.y)) {
            return;
        }
        if (i3 == org.telegram.messenger.hs.Y1) {
            if (TextUtils.equals((String) objArr[0], this.y)) {
                radialProgress2.p(true, 1.0f);
            }
        } else if (i3 == org.telegram.messenger.hs.X1 && TextUtils.equals((String) objArr[0], this.y)) {
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
        org.telegram.messenger.hs.f(org.telegram.messenger.h10.t0).c(this, org.telegram.messenger.hs.Y1);
        org.telegram.messenger.hs.f(org.telegram.messenger.h10.t0).c(this, org.telegram.messenger.hs.X1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.f(org.telegram.messenger.h10.t0).n(this, org.telegram.messenger.hs.Y1);
        org.telegram.messenger.hs.f(org.telegram.messenger.h10.t0).n(this, org.telegram.messenger.hs.X1);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        if (i3 != 0 && i10 != 0 && this.r) {
            this.w.setBackground(null);
            org.telegram.messenger.g0.h3(new xp0(this, 12));
        }
        jh.d.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
