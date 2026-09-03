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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class g5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int C = 0;
    public boolean B;
    public final OvershootInterpolator a;
    public final n0 b;
    public final y4 c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final z4 e;
    public final org.telegram.ui.ActionBar.f6 f;
    public final sg.b h;
    public AnimatorSet n;
    public boolean r;
    public h5[] s;
    public final View v;
    public boolean w;
    public String x;
    public d5 y;

    public g5(Context context, org.telegram.ui.ActionBar.f6 f6Var, z4 z4Var) {
        super(context);
        this.a = new OvershootInterpolator(1.02f);
        sg.b bVar = new sg.b();
        this.h = bVar;
        new Matrix();
        this.e = z4Var;
        this.f = f6Var;
        ug.i iVar = new ug.i(this);
        View view = new View(context);
        this.v = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, k7.b6.c(-1.0f, -1));
        n0 n0Var = new n0(this, context, 2);
        this.b = n0Var;
        addView(n0Var, k7.b6.c(-1.0f, -1));
        y4 y4Var = new y4(context, f6Var);
        this.c = y4Var;
        float dp = AndroidUtilities.dp(12.0f);
        gg.j1 j1Var = kf.r0.a;
        y4Var.setOutlineProvider(new kf.q0(0, dp));
        y4Var.setElevation(AndroidUtilities.dp(4.0f));
        int i10 = 1;
        y4Var.setClipToOutline(true);
        n0Var.addView(y4Var, k7.b6.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            y4Var.setOutlineSpotShadowColor(TLObject.FLAG_31);
            y4Var.setOutlineAmbientShadowColor(TLObject.FLAG_31);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, context, f6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        pg.b k10 = bVar.k();
        k10.n(null);
        iVar.d(actionBarPopupWindow$ActionBarPopupWindowLayout, this, new mg.w(i10, k10, actionBarPopupWindow$ActionBarPopupWindowLayout), false);
        k10.n(rg.b.k(f6Var));
        k10.o(AndroidUtilities.dp(8.0f));
        k10.h.e = true;
        k10.p(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(k10);
        n0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, k7.b6.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(b5 b5Var) {
        this.s = b5Var.i;
        boolean z4 = b5Var.c != null;
        y4 y4Var = this.c;
        y4Var.c = z4;
        y4Var.invalidate();
        this.x = b5Var.f;
        d5 d5Var = this.y;
        if (d5Var != null) {
            if (d5Var.g) {
                d5Var.g = false;
                d5Var.b.removeObserver(d5Var.a, d5Var.e);
            }
            this.y = null;
        }
        d5 d5Var2 = b5Var.j;
        if (d5Var2 != null) {
            this.y = d5Var2;
            gg.m0 m0Var = new gg.m0(4, this, b5Var);
            if (!d5Var2.g) {
                d5Var2.g = true;
                d5Var2.f = m0Var;
                d5Var2.b.addObserver(d5Var2.a, d5Var2.e);
                d5Var2.a();
            }
        }
        int i10 = UserConfig.selectedAccount;
        ImageLocation imageLocation = b5Var.c;
        String str = b5Var.e;
        ImageLocation imageLocation2 = b5Var.a;
        ImageLocation imageLocation3 = b5Var.b;
        String str2 = b5Var.d;
        BitmapDrawable bitmapDrawable = b5Var.g;
        Object obj = b5Var.h;
        org.telegram.ui.Components.p9 p9Var = (org.telegram.ui.Components.p9) y4Var.d;
        p9Var.getImageReceiver().setCurrentAccount(i10);
        p9Var.getImageReceiver().setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, bitmapDrawable, 0L, null, obj, 1);
        p9Var.d();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i11 = 0;
        while (true) {
            h5[] h5VarArr = this.s;
            if (i11 >= h5VarArr.length) {
                b(true);
                return;
            }
            h5 h5Var = h5VarArr[i11];
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(i11 == 0, i11 == this.s.length - 1, actionBarPopupWindow$ActionBarPopupWindowLayout2, h5Var.c, LocaleController.getString(h5Var.a, h5Var.b), false, this.f);
            c3.setTag(Integer.valueOf(i11));
            c3.setOnClickListener(new org.telegram.messenger.video.g(9, this, h5Var));
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
        ofFloat.setInterpolator(z4 ? this.a : org.telegram.ui.Components.mr.h);
        final int i10 = 0;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.e5
            public final /* synthetic */ g5 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        g5 g5Var = this.b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = g5Var.d;
                        n0 n0Var = g5Var.b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z4) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = k7.n.a(floatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * floatValue) + 0.7f;
                        n0Var.setScaleX(f10);
                        n0Var.setScaleY(f10);
                        n0Var.setAlpha(a2);
                        float f11 = 1.0f - floatValue;
                        g5Var.c.setTranslationY(AndroidUtilities.dp(40.0f) * f11);
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
                        g5 g5Var2 = this.b;
                        g5Var2.v.setAlpha(floatValue2);
                        g5Var2.invalidate();
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        final int i11 = 1;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.e5
            public final /* synthetic */ g5 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        g5 g5Var = this.b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = g5Var.d;
                        n0 n0Var = g5Var.b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z4) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = k7.n.a(floatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * floatValue) + 0.7f;
                        n0Var.setScaleX(f10);
                        n0Var.setScaleY(f10);
                        n0Var.setAlpha(a2);
                        float f11 = 1.0f - floatValue;
                        g5Var.c.setTranslationY(AndroidUtilities.dp(40.0f) * f11);
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
                        g5 g5Var2 = this.b;
                        g5Var2.v.setAlpha(floatValue2);
                        g5Var2.invalidate();
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
        this.n.addListener(new dg.w2(12, this, z4));
        this.n.start();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        y4 y4Var = this.c;
        boolean z4 = y4Var.c;
        RadialProgress2 radialProgress2 = (RadialProgress2) y4Var.e;
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
            AndroidUtilities.runOnUIThread(new yt0(this, 12));
        }
        tg.c.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
