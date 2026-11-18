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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class b5 extends FrameLayout implements org.telegram.messenger.fs {
    public static final /* synthetic */ int G = 0;
    public y4 E;
    public boolean F;
    public final OvershootInterpolator a;
    public final k0 b;
    public final t4 c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final u4 e;
    public final org.telegram.ui.ActionBar.i6 f;
    public final ui.b h;
    public AnimatorSet n;
    public boolean r;
    public c5[] s;
    public final View w;
    public boolean x;
    public String y;

    public b5(Context context, org.telegram.ui.ActionBar.i6 i6Var, u4 u4Var) {
        super(context);
        this.a = new OvershootInterpolator(1.02f);
        ui.b bVar = new ui.b();
        this.h = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        new Matrix();
        this.e = u4Var;
        this.f = i6Var;
        cVar.h = new jh.k(this);
        cVar.i = this;
        View view = new View(context);
        this.w = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, c8.ma.c(-1.0f, -1));
        k0 k0Var = new k0(2, context, this);
        this.b = k0Var;
        addView(k0Var, c8.ma.c(-1.0f, -1));
        t4 t4Var = new t4(context, i6Var);
        this.c = t4Var;
        float L = org.telegram.messenger.g0.L(12.0f);
        bg.q0 q0Var = bg.u0.a;
        t4Var.setOutlineProvider(new bg.s0(0, L));
        t4Var.setElevation(org.telegram.messenger.g0.L(4.0f));
        t4Var.setClipToOutline(true);
        k0Var.addView(t4Var, c8.ma.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            t4Var.setOutlineSpotShadowColor(TLObject.FLAG_31);
            t4Var.setOutlineAmbientShadowColor(TLObject.FLAG_31);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, context, i6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        fh.g c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.p(c8.i0.l(i6Var));
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.R.e = true;
        c10.r(org.telegram.messenger.g0.L(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        k0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.ma.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(w4 w4Var) {
        this.s = w4Var.i;
        boolean z10 = w4Var.c != null;
        t4 t4Var = this.c;
        t4Var.c = z10;
        t4Var.invalidate();
        this.y = w4Var.f;
        y4 y4Var = this.E;
        if (y4Var != null) {
            if (y4Var.g) {
                y4Var.g = false;
                y4Var.b.n(y4Var.a, y4Var.e);
            }
            this.E = null;
        }
        y4 y4Var2 = w4Var.j;
        if (y4Var2 != null) {
            this.E = y4Var2;
            di.d7 d7Var = new di.d7(3, this, w4Var);
            if (!y4Var2.g) {
                y4Var2.g = true;
                y4Var2.f = d7Var;
                y4Var2.b.b(y4Var2.a, y4Var2.e);
                y4Var2.a();
            }
        }
        int i7 = org.telegram.messenger.j10.t0;
        org.telegram.messenger.fc fcVar = w4Var.c;
        String str = w4Var.e;
        org.telegram.messenger.fc fcVar2 = w4Var.a;
        org.telegram.messenger.fc fcVar3 = w4Var.b;
        String str2 = w4Var.d;
        BitmapDrawable bitmapDrawable = w4Var.g;
        Object obj = w4Var.h;
        org.telegram.ui.Components.q9 q9Var = (org.telegram.ui.Components.q9) t4Var.d;
        q9Var.getImageReceiver().d = i7;
        q9Var.getImageReceiver().u0(fcVar, str, fcVar2, null, fcVar3, str2, bitmapDrawable, 0L, null, obj, 1);
        q9Var.d();
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
            org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(i10 == 0, i10 == this.s.length - 1, actionBarPopupWindow$ActionBarPopupWindowLayout2, c5Var.c, org.telegram.messenger.gd.M0(c5Var.b, c5Var.a), false, this.f);
            c10.setTag(Integer.valueOf(i10));
            c10.setOnClickListener(new ni.b(6, this, c5Var));
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
        ofFloat.setInterpolator(z10 ? this.a : org.telegram.ui.Components.lr.h);
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
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a10 = c8.l9.a(floatValue, 0.0f, 1.0f);
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
                        if (!z10) {
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
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a10 = c8.l9.a(floatValue, 0.0f, 1.0f);
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
                        if (!z10) {
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
        animatorSet2.setDuration(z10 ? 190L : 150L);
        this.n.playTogether(ofFloat, ofFloat2);
        this.n.addListener(new bi.e7(21, this, z10));
        this.n.start();
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        t4 t4Var = this.c;
        boolean z10 = t4Var.c;
        RadialProgress2 radialProgress2 = (RadialProgress2) t4Var.e;
        if (!z10 || TextUtils.isEmpty(this.y)) {
            return;
        }
        if (i7 == org.telegram.messenger.ks.Y1) {
            if (TextUtils.equals((String) objArr[0], this.y)) {
                radialProgress2.p(true, 1.0f);
            }
        } else if (i7 == org.telegram.messenger.ks.X1 && TextUtils.equals((String) objArr[0], this.y)) {
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
        org.telegram.messenger.ks.f(org.telegram.messenger.j10.t0).c(this, org.telegram.messenger.ks.Y1);
        org.telegram.messenger.ks.f(org.telegram.messenger.j10.t0).c(this, org.telegram.messenger.ks.X1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.f(org.telegram.messenger.j10.t0).n(this, org.telegram.messenger.ks.Y1);
        org.telegram.messenger.ks.f(org.telegram.messenger.j10.t0).n(this, org.telegram.messenger.ks.X1);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        if (i7 != 0 && i10 != 0 && this.r) {
            this.w.setBackground(null);
            org.telegram.messenger.g0.g3(new hq0(this, 12));
        }
        ih.d.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
