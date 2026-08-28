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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class b5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int B = 0;
    public boolean A;
    public final OvershootInterpolator a;
    public final m0 b;
    public final t4 c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final u4 e;
    public final org.telegram.ui.ActionBar.b6 f;
    public final ng.b h;
    public AnimatorSet n;
    public boolean r;
    public c5[] s;
    public final View v;
    public boolean w;
    public String x;
    public y4 y;

    public b5(Context context, org.telegram.ui.ActionBar.b6 b6Var, u4 u4Var) {
        super(context);
        this.a = new OvershootInterpolator(1.02f);
        ng.b bVar = new ng.b();
        this.h = bVar;
        new Matrix();
        this.e = u4Var;
        this.f = b6Var;
        pg.i iVar = new pg.i(this);
        View view = new View(context);
        this.v = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, g7.e6.c(-1.0f, -1));
        m0 m0Var = new m0(this, context, 2);
        this.b = m0Var;
        addView(m0Var, g7.e6.c(-1.0f, -1));
        t4 t4Var = new t4(context, b6Var);
        this.c = t4Var;
        float dp = AndroidUtilities.dp(12.0f);
        bg.q1 q1Var = ff.r0.a;
        t4Var.setOutlineProvider(new ff.q0(0, dp));
        t4Var.setElevation(AndroidUtilities.dp(4.0f));
        t4Var.setClipToOutline(true);
        m0Var.addView(t4Var, g7.e6.e(0, 0, 1));
        int i9 = 28;
        if (Build.VERSION.SDK_INT >= 28) {
            t4Var.setOutlineSpotShadowColor(TLObject.FLAG_31);
            t4Var.setOutlineAmbientShadowColor(TLObject.FLAG_31);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, context, b6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        kg.d y10 = bVar.y();
        y10.n(null);
        iVar.d(actionBarPopupWindow$ActionBarPopupWindowLayout, this, new b5.d(i9, y10, actionBarPopupWindow$ActionBarPopupWindowLayout), false);
        y10.n(mg.c.j(b6Var));
        y10.o(AndroidUtilities.dp(8.0f));
        y10.h.e = true;
        y10.p(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(y10);
        m0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, g7.e6.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(w4 w4Var) {
        this.s = w4Var.i;
        boolean z10 = w4Var.c != null;
        t4 t4Var = this.c;
        t4Var.c = z10;
        t4Var.invalidate();
        this.x = w4Var.f;
        y4 y4Var = this.y;
        if (y4Var != null) {
            if (y4Var.g) {
                y4Var.g = false;
                y4Var.b.removeObserver(y4Var.a, y4Var.e);
            }
            this.y = null;
        }
        y4 y4Var2 = w4Var.j;
        if (y4Var2 != null) {
            this.y = y4Var2;
            bg.r0 r0Var = new bg.r0(5, this, w4Var);
            if (!y4Var2.g) {
                y4Var2.g = true;
                y4Var2.f = r0Var;
                y4Var2.b.addObserver(y4Var2.a, y4Var2.e);
                y4Var2.a();
            }
        }
        int i9 = UserConfig.selectedAccount;
        ImageLocation imageLocation = w4Var.c;
        String str = w4Var.e;
        ImageLocation imageLocation2 = w4Var.a;
        ImageLocation imageLocation3 = w4Var.b;
        String str2 = w4Var.d;
        BitmapDrawable bitmapDrawable = w4Var.g;
        Object obj = w4Var.h;
        org.telegram.ui.Components.o9 o9Var = (org.telegram.ui.Components.o9) t4Var.d;
        o9Var.getImageReceiver().setCurrentAccount(i9);
        o9Var.getImageReceiver().setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, bitmapDrawable, 0L, null, obj, 1);
        o9Var.d();
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
            org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(i10 == 0, i10 == this.s.length - 1, actionBarPopupWindow$ActionBarPopupWindowLayout2, c5Var.c, LocaleController.getString(c5Var.a, c5Var.b), false, this.f);
            c10.setTag(Integer.valueOf(i10));
            c10.setOnClickListener(new mh.k3(11, this, c5Var));
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
        ofFloat.setInterpolator(z10 ? this.a : org.telegram.ui.Components.gr.h);
        final int i9 = 0;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.z4
            public final /* synthetic */ b5 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i9) {
                    case 0:
                        b5 b5Var = this.b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b5Var.d;
                        m0 m0Var = b5Var.b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = g7.n.a(floatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * floatValue) + 0.7f;
                        m0Var.setScaleX(f10);
                        m0Var.setScaleY(f10);
                        m0Var.setAlpha(a2);
                        float f11 = 1.0f - floatValue;
                        b5Var.c.setTranslationY(AndroidUtilities.dp(40.0f) * f11);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-AndroidUtilities.dp(70.0f)) * f11);
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
                        b5Var2.v.setAlpha(floatValue2);
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
                        m0 m0Var = b5Var.b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = g7.n.a(floatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * floatValue) + 0.7f;
                        m0Var.setScaleX(f10);
                        m0Var.setScaleY(f10);
                        m0Var.setAlpha(a2);
                        float f11 = 1.0f - floatValue;
                        b5Var.c.setTranslationY(AndroidUtilities.dp(40.0f) * f11);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-AndroidUtilities.dp(70.0f)) * f11);
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
                        b5Var2.v.setAlpha(floatValue2);
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
        this.n.addListener(new hg.b0(20, this, z10));
        this.n.start();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        t4 t4Var = this.c;
        boolean z10 = t4Var.c;
        RadialProgress2 radialProgress2 = (RadialProgress2) t4Var.e;
        if (!z10 || TextUtils.isEmpty(this.x)) {
            return;
        }
        if (i9 == NotificationCenter.fileLoaded) {
            if (TextUtils.equals((String) objArr[0], this.x)) {
                radialProgress2.o(1.0f, true);
            }
        } else if (i9 == NotificationCenter.fileLoadProgressChanged && TextUtils.equals((String) objArr[0], this.x)) {
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
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        if (i9 != 0 && i10 != 0 && this.r) {
            this.v.setBackground(null);
            AndroidUtilities.runOnUIThread(new kt0(this, 12));
        }
        og.d.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
