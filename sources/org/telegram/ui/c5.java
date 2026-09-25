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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public abstract class c5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int F = 0;
    public boolean E;
    public final OvershootInterpolator a;
    public final k0 b;
    public final u4 c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final v4 e;
    public final org.telegram.ui.ActionBar.d6 f;
    public final fh.b h;
    public AnimatorSet n;
    public boolean r;
    public d5[] s;
    public final View v;
    public boolean w;
    public String x;
    public z4 y;

    public c5(Context context, org.telegram.ui.ActionBar.d6 d6Var, v4 v4Var) {
        super(context);
        this.a = new OvershootInterpolator(1.02f);
        fh.b bVar = new fh.b();
        this.h = bVar;
        ah.c cVar = new ah.c(bVar);
        new Matrix();
        this.e = v4Var;
        this.f = d6Var;
        cVar.f = new hh.k(this);
        cVar.g = this;
        View view = new View(context);
        this.v = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, w7.y5.c(-1.0f, -1));
        k0 k0Var = new k0(this, context, 2);
        this.b = k0Var;
        addView(k0Var, w7.y5.c(-1.0f, -1));
        u4 u4Var = new u4(context, d6Var);
        this.c = u4Var;
        float dp = AndroidUtilities.dp(12.0f);
        ai.k2 k2Var = yf.i0.a;
        u4Var.setOutlineProvider(new yf.h0(0, dp));
        u4Var.setElevation(AndroidUtilities.dp(4.0f));
        u4Var.setClipToOutline(true);
        k0Var.addView(u4Var, w7.y5.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            u4Var.setOutlineSpotShadowColor(TLObject.FLAG_31);
            u4Var.setOutlineAmbientShadowColor(TLObject.FLAG_31);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, context, d6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        ch.d c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.o(eh.b.k(d6Var));
        c10.p(AndroidUtilities.dp(8.0f));
        c10.j.e = true;
        c10.q(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        k0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.y5.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(x4 x4Var) {
        this.s = x4Var.i;
        boolean z10 = x4Var.c != null;
        u4 u4Var = this.c;
        u4Var.c = z10;
        u4Var.invalidate();
        this.x = x4Var.f;
        z4 z4Var = this.y;
        if (z4Var != null) {
            if (z4Var.g) {
                z4Var.g = false;
                z4Var.b.removeObserver(z4Var.a, z4Var.e);
            }
            this.y = null;
        }
        z4 z4Var2 = x4Var.j;
        if (z4Var2 != null) {
            this.y = z4Var2;
            ci.k5 k5Var = new ci.k5(1, this, x4Var);
            if (!z4Var2.g) {
                z4Var2.g = true;
                z4Var2.f = k5Var;
                z4Var2.b.addObserver(z4Var2.a, z4Var2.e);
                z4Var2.a();
            }
        }
        int i10 = UserConfig.selectedAccount;
        ImageLocation imageLocation = x4Var.c;
        String str = x4Var.e;
        ImageLocation imageLocation2 = x4Var.a;
        ImageLocation imageLocation3 = x4Var.b;
        String str2 = x4Var.d;
        BitmapDrawable bitmapDrawable = x4Var.g;
        Object obj = x4Var.h;
        org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) u4Var.d;
        w9Var.getImageReceiver().setCurrentAccount(i10);
        w9Var.getImageReceiver().setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, bitmapDrawable, 0L, null, obj, 1);
        w9Var.d();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i11 = 0;
        while (true) {
            d5[] d5VarArr = this.s;
            if (i11 >= d5VarArr.length) {
                b(true);
                return;
            }
            d5 d5Var = d5VarArr[i11];
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(i11 == 0, i11 == this.s.length - 1, actionBarPopupWindow$ActionBarPopupWindowLayout2, d5Var.c, LocaleController.getString(d5Var.a, d5Var.b), false, this.f);
            c10.setTag(Integer.valueOf(i11));
            c10.setOnClickListener(new ai.f2(24, this, d5Var));
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
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.a5
            public final /* synthetic */ c5 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        c5 c5Var = this.b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c5Var.d;
                        k0 k0Var = c5Var.b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = w7.q.a(floatValue, 0.0f, 1.0f);
                        float f7 = (0.3f * floatValue) + 0.7f;
                        k0Var.setScaleX(f7);
                        k0Var.setScaleY(f7);
                        k0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        c5Var.c.setTranslationY(AndroidUtilities.dp(40.0f) * f10);
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
                        c5 c5Var2 = this.b;
                        c5Var2.v.setAlpha(floatValue2);
                        c5Var2.invalidate();
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        final int i11 = 1;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.a5
            public final /* synthetic */ c5 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        c5 c5Var = this.b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c5Var.d;
                        k0 k0Var = c5Var.b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = w7.q.a(floatValue, 0.0f, 1.0f);
                        float f7 = (0.3f * floatValue) + 0.7f;
                        k0Var.setScaleX(f7);
                        k0Var.setScaleY(f7);
                        k0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        c5Var.c.setTranslationY(AndroidUtilities.dp(40.0f) * f10);
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
                        c5 c5Var2 = this.b;
                        c5Var2.v.setAlpha(floatValue2);
                        c5Var2.invalidate();
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
        u4 u4Var = this.c;
        boolean z10 = u4Var.c;
        RadialProgress2 radialProgress2 = (RadialProgress2) u4Var.e;
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
            AndroidUtilities.runOnUIThread(new eu0(this, 12));
        }
        gh.d.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
