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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class e5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int C = 0;
    public boolean B;
    public final OvershootInterpolator a;
    public final l0 b;
    public final w4 c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final x4 e;
    public final org.telegram.ui.ActionBar.g6 f;
    public final tg.b h;
    public AnimatorSet n;
    public boolean r;
    public f5[] s;
    public final View v;
    public boolean w;
    public String x;
    public b5 y;

    public e5(Context context, org.telegram.ui.ActionBar.g6 g6Var, x4 x4Var) {
        super(context);
        this.a = new OvershootInterpolator(1.02f);
        tg.b bVar = new tg.b();
        this.h = bVar;
        new Matrix();
        this.e = x4Var;
        this.f = g6Var;
        vg.i iVar = new vg.i(this);
        View view = new View(context);
        this.v = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, k7.c6.c(-1.0f, -1));
        int i10 = 2;
        l0 l0Var = new l0(this, context, i10);
        this.b = l0Var;
        addView(l0Var, k7.c6.c(-1.0f, -1));
        w4 w4Var = new w4(context, g6Var);
        this.c = w4Var;
        float dp = AndroidUtilities.dp(12.0f);
        hg.j1 j1Var = lf.q0.a;
        w4Var.setOutlineProvider(new lf.p0(0, dp));
        w4Var.setElevation(AndroidUtilities.dp(4.0f));
        w4Var.setClipToOutline(true);
        l0Var.addView(w4Var, k7.c6.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            w4Var.setOutlineSpotShadowColor(TLObject.FLAG_31);
            w4Var.setOutlineAmbientShadowColor(TLObject.FLAG_31);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, context, g6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        qg.b k10 = bVar.k();
        k10.n(null);
        iVar.d(actionBarPopupWindow$ActionBarPopupWindowLayout, this, new ng.w(i10, k10, actionBarPopupWindow$ActionBarPopupWindowLayout), false);
        k10.n(sg.b.j(g6Var));
        k10.o(AndroidUtilities.dp(8.0f));
        k10.h.e = true;
        k10.p(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(k10);
        l0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, k7.c6.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(z4 z4Var) {
        this.s = z4Var.i;
        boolean z4 = z4Var.c != null;
        w4 w4Var = this.c;
        w4Var.c = z4;
        w4Var.invalidate();
        this.x = z4Var.f;
        b5 b5Var = this.y;
        if (b5Var != null) {
            if (b5Var.g) {
                b5Var.g = false;
                b5Var.b.removeObserver(b5Var.a, b5Var.e);
            }
            this.y = null;
        }
        b5 b5Var2 = z4Var.j;
        if (b5Var2 != null) {
            this.y = b5Var2;
            hg.m0 m0Var = new hg.m0(4, this, z4Var);
            if (!b5Var2.g) {
                b5Var2.g = true;
                b5Var2.f = m0Var;
                b5Var2.b.addObserver(b5Var2.a, b5Var2.e);
                b5Var2.a();
            }
        }
        int i10 = UserConfig.selectedAccount;
        ImageLocation imageLocation = z4Var.c;
        String str = z4Var.e;
        ImageLocation imageLocation2 = z4Var.a;
        ImageLocation imageLocation3 = z4Var.b;
        String str2 = z4Var.d;
        BitmapDrawable bitmapDrawable = z4Var.g;
        Object obj = z4Var.h;
        org.telegram.ui.Components.p9 p9Var = (org.telegram.ui.Components.p9) w4Var.d;
        p9Var.getImageReceiver().setCurrentAccount(i10);
        p9Var.getImageReceiver().setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, bitmapDrawable, 0L, null, obj, 1);
        p9Var.d();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i11 = 0;
        while (true) {
            f5[] f5VarArr = this.s;
            if (i11 >= f5VarArr.length) {
                b(true);
                return;
            }
            f5 f5Var = f5VarArr[i11];
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(i11 == 0, i11 == this.s.length - 1, actionBarPopupWindow$ActionBarPopupWindowLayout2, f5Var.c, LocaleController.getString(f5Var.a, f5Var.b), false, this.f);
            c3.setTag(Integer.valueOf(i11));
            c3.setOnClickListener(new org.telegram.messenger.video.g(9, this, f5Var));
            i11++;
            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        }
    }

    public final void b(final boolean z4) {
        if (this.r == z4) {
            return;
        }
        this.r = z4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(z4 ? this.a : org.telegram.ui.Components.pr.h);
        final int i10 = 0;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.c5
            public final /* synthetic */ e5 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        e5 e5Var = this.b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = e5Var.d;
                        l0 l0Var = e5Var.b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z4) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = k7.o.a(floatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * floatValue) + 0.7f;
                        l0Var.setScaleX(f10);
                        l0Var.setScaleY(f10);
                        l0Var.setAlpha(a2);
                        float f11 = 1.0f - floatValue;
                        e5Var.c.setTranslationY(AndroidUtilities.dp(40.0f) * f11);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-AndroidUtilities.dp(70.0f)) * f11);
                        float f12 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f12);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f12);
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z4) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        e5 e5Var2 = this.b;
                        e5Var2.v.setAlpha(floatValue2);
                        e5Var2.invalidate();
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        final int i11 = 1;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.c5
            public final /* synthetic */ e5 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        e5 e5Var = this.b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = e5Var.d;
                        l0 l0Var = e5Var.b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z4) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = k7.o.a(floatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * floatValue) + 0.7f;
                        l0Var.setScaleX(f10);
                        l0Var.setScaleY(f10);
                        l0Var.setAlpha(a2);
                        float f11 = 1.0f - floatValue;
                        e5Var.c.setTranslationY(AndroidUtilities.dp(40.0f) * f11);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-AndroidUtilities.dp(70.0f)) * f11);
                        float f12 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f12);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f12);
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z4) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        e5 e5Var2 = this.b;
                        e5Var2.v.setAlpha(floatValue2);
                        e5Var2.invalidate();
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
        animatorSet2.setDuration(z4 ? 190L : 150L);
        this.n.playTogether(ofFloat, ofFloat2);
        this.n.addListener(new eg.u2(10, this, z4));
        this.n.start();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w4 w4Var = this.c;
        boolean z4 = w4Var.c;
        RadialProgress2 radialProgress2 = (RadialProgress2) w4Var.e;
        if (!z4 || TextUtils.isEmpty(this.x)) {
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
            AndroidUtilities.runOnUIThread(new tt0(this, 12));
        }
        ug.c.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
