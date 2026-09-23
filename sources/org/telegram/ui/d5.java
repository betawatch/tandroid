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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public abstract class d5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int F = 0;
    public boolean E;
    public final OvershootInterpolator a;
    public final k0 b;
    public final v4 c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final w4 e;
    public final org.telegram.ui.ActionBar.d6 f;
    public final fh.b h;
    public AnimatorSet n;
    public boolean r;
    public e5[] s;
    public final View v;
    public boolean w;
    public String x;
    public a5 y;

    public d5(Context context, org.telegram.ui.ActionBar.d6 d6Var, w4 w4Var) {
        super(context);
        this.a = new OvershootInterpolator(1.02f);
        fh.b bVar = new fh.b();
        this.h = bVar;
        ah.c cVar = new ah.c(bVar);
        new Matrix();
        this.e = w4Var;
        this.f = d6Var;
        cVar.f = new hh.k(this);
        cVar.g = this;
        View view = new View(context);
        this.v = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, w7.x5.c(-1.0f, -1));
        k0 k0Var = new k0(this, context, 2);
        this.b = k0Var;
        addView(k0Var, w7.x5.c(-1.0f, -1));
        v4 v4Var = new v4(context, d6Var);
        this.c = v4Var;
        float dp = AndroidUtilities.dp(12.0f);
        ai.k2 k2Var = yf.i0.a;
        v4Var.setOutlineProvider(new yf.h0(0, dp));
        v4Var.setElevation(AndroidUtilities.dp(4.0f));
        v4Var.setClipToOutline(true);
        k0Var.addView(v4Var, w7.x5.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            v4Var.setOutlineSpotShadowColor(TLObject.FLAG_31);
            v4Var.setOutlineAmbientShadowColor(TLObject.FLAG_31);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, context, d6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        ch.d c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.o(eh.b.k(d6Var));
        c10.p(AndroidUtilities.dp(8.0f));
        c10.j.e = true;
        c10.q(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        k0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.x5.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(y4 y4Var) {
        this.s = y4Var.i;
        boolean z10 = y4Var.c != null;
        v4 v4Var = this.c;
        v4Var.c = z10;
        v4Var.invalidate();
        this.x = y4Var.f;
        a5 a5Var = this.y;
        if (a5Var != null) {
            if (a5Var.g) {
                a5Var.g = false;
                a5Var.b.removeObserver(a5Var.a, a5Var.e);
            }
            this.y = null;
        }
        a5 a5Var2 = y4Var.j;
        if (a5Var2 != null) {
            this.y = a5Var2;
            ci.k5 k5Var = new ci.k5(1, this, y4Var);
            if (!a5Var2.g) {
                a5Var2.g = true;
                a5Var2.f = k5Var;
                a5Var2.b.addObserver(a5Var2.a, a5Var2.e);
                a5Var2.a();
            }
        }
        int i10 = UserConfig.selectedAccount;
        ImageLocation imageLocation = y4Var.c;
        String str = y4Var.e;
        ImageLocation imageLocation2 = y4Var.a;
        ImageLocation imageLocation3 = y4Var.b;
        String str2 = y4Var.d;
        BitmapDrawable bitmapDrawable = y4Var.g;
        Object obj = y4Var.h;
        org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) v4Var.d;
        w9Var.getImageReceiver().setCurrentAccount(i10);
        w9Var.getImageReceiver().setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, bitmapDrawable, 0L, null, obj, 1);
        w9Var.d();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i11 = 0;
        while (true) {
            e5[] e5VarArr = this.s;
            if (i11 >= e5VarArr.length) {
                b(true);
                return;
            }
            e5 e5Var = e5VarArr[i11];
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(i11 == 0, i11 == this.s.length - 1, actionBarPopupWindow$ActionBarPopupWindowLayout2, e5Var.c, LocaleController.getString(e5Var.a, e5Var.b), false, this.f);
            c10.setTag(Integer.valueOf(i11));
            c10.setOnClickListener(new ai.f2(24, this, e5Var));
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
        ofFloat.setInterpolator(z10 ? this.a : org.telegram.ui.Components.rr.h);
        final int i10 = 0;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.b5
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
                        k0 k0Var = d5Var.b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = w7.p.a(floatValue, 0.0f, 1.0f);
                        float f7 = (0.3f * floatValue) + 0.7f;
                        k0Var.setScaleX(f7);
                        k0Var.setScaleY(f7);
                        k0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        d5Var.c.setTranslationY(AndroidUtilities.dp(40.0f) * f10);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-AndroidUtilities.dp(70.0f)) * f10);
                        float f11 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f11);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f11);
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        d5 d5Var2 = this.b;
                        d5Var2.v.setAlpha(floatValue2);
                        d5Var2.invalidate();
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        final int i11 = 1;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.b5
            public final /* synthetic */ d5 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        d5 d5Var = this.b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = d5Var.d;
                        k0 k0Var = d5Var.b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = w7.p.a(floatValue, 0.0f, 1.0f);
                        float f7 = (0.3f * floatValue) + 0.7f;
                        k0Var.setScaleX(f7);
                        k0Var.setScaleY(f7);
                        k0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        d5Var.c.setTranslationY(AndroidUtilities.dp(40.0f) * f10);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-AndroidUtilities.dp(70.0f)) * f10);
                        float f11 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f11);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f11);
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        d5 d5Var2 = this.b;
                        d5Var2.v.setAlpha(floatValue2);
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
        this.n.addListener(new ai.n(20, this, z10));
        this.n.start();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v4 v4Var = this.c;
        boolean z10 = v4Var.c;
        RadialProgress2 radialProgress2 = (RadialProgress2) v4Var.e;
        if (!z10 || TextUtils.isEmpty(this.x)) {
            return;
        }
        if (i10 == NotificationCenter.fileLoaded) {
            if (TextUtils.equals((String) objArr[0], this.x)) {
                radialProgress2.o(1.0f, true);
            }
        } else if (i10 == NotificationCenter.fileLoadProgressChanged && TextUtils.equals((String) objArr[0], this.x)) {
            radialProgress2.o(Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue()), true);
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
        NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.fileLoadProgressChanged);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.fileLoadProgressChanged);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (i10 != 0 && i11 != 0 && this.r) {
            this.v.setBackground(null);
            AndroidUtilities.runOnUIThread(new fu0(this, 12));
        }
        gh.d.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
