package org.telegram.ui.ActionBar;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.Property;
import android.util.Size;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.ub1;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class u4 {
    public final Rect A = new Rect();
    public final Point B = new Point();
    public final int[] C = new int[2];
    public final Region D = new Region();
    public final int E;
    public boolean F;
    public boolean G;
    public final Size H;
    public Size I;
    public Size J;
    public MenuItem.OnMenuItemClickListener K;
    public final p4 L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public final /* synthetic */ w4 Q;
    public final Context a;
    public final View b;
    public final PopupWindow c;
    public final int d;
    public final int e;
    public final RelativeLayout f;
    public final ub1 g;
    public final t4 h;
    public final FrameLayout i;
    public final View j;
    public final q4 k;
    public final TextView l;
    public final Drawable m;
    public final Drawable n;
    public final AnimatedVectorDrawable o;
    public final AnimatedVectorDrawable p;
    public final com.google.firebase.messaging.p q;
    public final s4 r;
    public final Interpolator s;
    public final Interpolator t;
    public final Interpolator u;
    public final AnimatorSet v;
    public final AnimatorSet w;
    public final AnimatorSet x;
    public final AnimationSet y;
    public final AnimationSet z;

    public u4(w4 w4Var, Context context, View view) {
        float f7;
        int i10;
        RelativeLayout relativeLayout;
        int v02;
        this.Q = w4Var;
        new v2(this, 3);
        this.F = true;
        this.L = new p4(this);
        this.P = -4;
        this.b = view;
        this.a = context;
        d6 d6Var = w4Var.n;
        int i11 = w4Var.i;
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int dp = AndroidUtilities.dp(20.0f);
        marginLayoutParams.rightMargin = dp;
        marginLayoutParams.topMargin = dp;
        marginLayoutParams.leftMargin = dp;
        marginLayoutParams.bottomMargin = dp;
        relativeLayout2.setLayoutParams(marginLayoutParams);
        relativeLayout2.setElevation(AndroidUtilities.dp(1.0f));
        relativeLayout2.setFocusable(true);
        relativeLayout2.setFocusableInTouchMode(true);
        ah.c cVar = w4Var.o;
        int i12 = 6;
        if (cVar != null) {
            ch.d c10 = cVar.c(relativeLayout2, null, true);
            dh.e eVar = new dh.e(d6Var);
            f7 = 1.0f;
            eVar.e = new d2.c(i12);
            eVar.f(687865855, 687865855);
            eVar.e(352321535, 352321535);
            float dpf2 = AndroidUtilities.dpf2(0.6666667f);
            float dpf22 = AndroidUtilities.dpf2(0.6666667f);
            eVar.f = dpf2;
            eVar.h = dpf22;
            c10.o(eVar);
            c10.q(AndroidUtilities.dp(12.0f));
            relativeLayout2.setBackground(c10);
        } else {
            f7 = 1.0f;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float dp2 = AndroidUtilities.dp(12.0f);
            gradientDrawable.setCornerRadii(new float[]{dp2, dp2, dp2, dp2, dp2, dp2, dp2, dp2});
            if (i11 == 0) {
                gradientDrawable.setColor(h6.v0(h6.h5, d6Var));
            } else if (i11 == 2) {
                gradientDrawable.setColor(-115203550);
            } else if (i11 == 1) {
                gradientDrawable.setColor(h6.v0(h6.d6, d6Var));
            }
            relativeLayout2.setBackground(gradientDrawable);
        }
        relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        relativeLayout2.setClipToOutline(true);
        this.f = relativeLayout2;
        ci.w5 w5Var = new ci.w5(relativeLayout2.getContext(), 2);
        PopupWindow popupWindow = new PopupWindow(w5Var);
        popupWindow.setClippingEnabled(false);
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setSplitTouchEnabled(true);
        relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        w5Var.addView(relativeLayout2);
        this.c = popupWindow;
        this.d = AndroidUtilities.dp(16.0f);
        this.e = AndroidUtilities.dp(8.0f);
        this.E = AndroidUtilities.dp(48.0f);
        int dp3 = AndroidUtilities.dp(8.0f);
        this.r = new s4();
        this.s = AnimationUtils.loadInterpolator(context, R.interpolator.fast_out_slow_in);
        this.t = AnimationUtils.loadInterpolator(context, R.interpolator.linear_out_slow_in);
        this.u = AnimationUtils.loadInterpolator(context, R.interpolator.fast_out_linear_in);
        Drawable mutate = context.getDrawable(org.telegram.messenger.R.drawable.ft_avd_tooverflow).mutate();
        this.m = mutate;
        mutate.setAutoMirrored(true);
        Drawable mutate2 = context.getDrawable(org.telegram.messenger.R.drawable.ft_avd_toarrow).mutate();
        this.n = mutate2;
        mutate2.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) context.getDrawable(org.telegram.messenger.R.drawable.ft_avd_toarrow_animation).mutate();
        this.o = animatedVectorDrawable;
        animatedVectorDrawable.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) context.getDrawable(org.telegram.messenger.R.drawable.ft_avd_tooverflow_animation).mutate();
        this.p = animatedVectorDrawable2;
        animatedVectorDrawable2.setAutoMirrored(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.i = frameLayout;
        q4 q4Var = new q4(this, context);
        this.k = q4Var;
        q4Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(48.0f)));
        q4Var.setPaddingRelative(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        q4Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        q4Var.setImageDrawable(mutate2);
        TextView textView = new TextView(context);
        this.l = textView;
        textView.setText(LocaleController.getString(org.telegram.messenger.R.string.Back));
        textView.setTextSize(1, 16.0f);
        textView.setAlpha(0.0f);
        View view2 = new View(context);
        this.j = view2;
        if (i11 == 0) {
            int i13 = h6.j5;
            int v03 = h6.v0(i13, d6Var);
            int i14 = h6.i6;
            relativeLayout = relativeLayout2;
            i10 = dp3;
            q4Var.setBackground(h6.f0(h6.v0(i14, d6Var), 1, -1));
            frameLayout.setBackground(h6.f0(h6.v0(i14, d6Var), 2, -1));
            view2.setBackgroundColor(h6.l1(0.4f, h6.v0(i13, d6Var)));
            v02 = v03;
        } else {
            i10 = dp3;
            relativeLayout = relativeLayout2;
            if (i11 == 2) {
                q4Var.setBackground(h6.f0(553648127, 1, -1));
                frameLayout.setBackground(h6.f0(553648127, 2, -1));
                view2.setBackgroundColor(553648127);
                v02 = -328966;
            } else {
                v02 = h6.v0(h6.G6, d6Var);
                int i15 = h6.i6;
                q4Var.setBackground(h6.f0(h6.v0(i15, d6Var), 1, -1));
                frameLayout.setBackground(h6.f0(h6.v0(i15, d6Var), 2, -1));
                view2.setBackgroundColor(h6.v0(h6.d7, d6Var));
            }
        }
        mutate2.setTint(v02);
        mutate.setTint(v02);
        animatedVectorDrawable.setTint(v02);
        animatedVectorDrawable2.setTint(v02);
        textView.setTextColor(v02);
        q4Var.setOnClickListener(new k4(this, 2));
        frameLayout.addView(q4Var, w7.x5.e(-2, -2, 19));
        frameLayout.addView(textView, w7.x5.d(-1, -2.0f, 19, 56.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.addView(view2, w7.x5.a(-1.0f, f7 / AndroidUtilities.density, 55));
        q4Var.measure(0, 0);
        this.H = new Size(q4Var.getMeasuredWidth(), q4Var.getMeasuredHeight());
        this.g = new ub1(this, context, 4);
        com.google.firebase.messaging.p pVar = new com.google.firebase.messaging.p();
        pVar.e = this;
        pVar.c = context;
        pVar.a = i10;
        int dp4 = AndroidUtilities.dp(18.0f);
        pVar.b = dp4;
        LinearLayout b10 = w4.b(this.Q, context, null, true, false, false);
        b10.setPadding(dp4, 0, dp4, 0);
        pVar.d = b10;
        this.q = pVar;
        final t4 t4Var = new t4(this);
        t4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        t4Var.setDivider(null);
        t4Var.setDividerHeight(0);
        o4 o4Var = new o4(this, context);
        t4Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(2.0f));
        t4Var.setClipToPadding(false);
        t4Var.setAdapter((ListAdapter) o4Var);
        t4Var.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: org.telegram.ui.ActionBar.l4
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view3, int i16, long j3) {
                u4 u4Var = u4.this;
                u4Var.getClass();
                MenuItem menuItem = (MenuItem) t4Var.getAdapter().getItem(i16);
                w4 w4Var2 = u4Var.Q;
                if (w4Var2.j == null || !w4.r.contains(Integer.valueOf(menuItem.getItemId()))) {
                    MenuItem.OnMenuItemClickListener onMenuItemClickListener = u4Var.K;
                    if (onMenuItemClickListener != null) {
                        onMenuItemClickListener.onMenuItemClick(menuItem);
                        return;
                    }
                    return;
                }
                int i17 = -u4Var.P;
                u4Var.P = i17;
                AndroidUtilities.shakeViewSpring(view3, i17);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                w4Var2.j.run();
            }
        });
        this.h = t4Var;
        int i16 = 1;
        d2 d2Var = new d2(this, i16);
        AnimationSet animationSet = new AnimationSet(true);
        this.y = animationSet;
        animationSet.setAnimationListener(d2Var);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.z = animationSet2;
        animationSet2.setAnimationListener(d2Var);
        AnimatorSet animatorSet = new AnimatorSet();
        RelativeLayout relativeLayout3 = relativeLayout;
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout3, (Property<RelativeLayout, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        this.v = animatorSet;
        this.w = w4.a(relativeLayout3, ImageReceiver.DEFAULT_CROSSFADE_DURATION, new r4(this, 0));
        this.x = w4.a(relativeLayout3, 0, new r4(this, i16));
    }

    public static void a(u4 u4Var) {
        FrameLayout frameLayout = u4Var.i;
        RelativeLayout relativeLayout = u4Var.f;
        if (u4Var.M) {
            u4Var.g.setY(relativeLayout.getHeight() - u4Var.J.getHeight());
            frameLayout.setY(relativeLayout.getHeight() - frameLayout.getHeight());
            u4Var.h.setY(relativeLayout.getHeight() - u4Var.I.getHeight());
        }
    }

    public static boolean b(u4 u4Var) {
        AnimationSet animationSet = u4Var.z;
        AnimationSet animationSet2 = u4Var.y;
        return (animationSet2.hasStarted() && !animationSet2.hasEnded()) || (animationSet.hasStarted() && !animationSet.hasEnded());
    }

    public static void l(View view, int i10, int i11) {
        view.setMinimumWidth(i10);
        view.setMinimumHeight(i11);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(0, 0);
        }
        layoutParams.width = i10;
        layoutParams.height = i11;
        view.setLayoutParams(layoutParams);
    }

    public static void m(View view, Size size) {
        l(view, size.getWidth(), size.getHeight());
    }

    public final int c(int i10) {
        int max = Math.max(2, i10);
        t4 t4Var = this.h;
        int min = Math.min(4, Math.min(max, t4Var.getCount()));
        int count = t4Var.getCount();
        int i11 = this.E;
        return this.H.getHeight() + (min * i11) + (min < count ? (int) (i11 * 0.5f) : 0);
    }

    public final void d() {
        this.f.clearAnimation();
        this.g.animate().cancel();
        this.h.animate().cancel();
        this.o.stop();
        this.p.stop();
    }

    public final int e() {
        int i10 = this.O;
        if (i10 < 150) {
            return Math.max(200, 0);
        }
        if (i10 > 300) {
            return 300;
        }
        return MediaDataController.MAX_LINKS_COUNT;
    }

    public final boolean f() {
        return (this.F || this.G) ? false : true;
    }

    public final void g() {
        boolean z10 = this.N;
        Interpolator interpolator = this.t;
        t4 t4Var = this.h;
        ub1 ub1Var = this.g;
        s4 s4Var = this.r;
        Interpolator interpolator2 = this.s;
        FrameLayout frameLayout = this.i;
        RelativeLayout relativeLayout = this.f;
        q4 q4Var = this.k;
        if (z10) {
            AnimatedVectorDrawable animatedVectorDrawable = this.p;
            q4Var.setImageDrawable(animatedVectorDrawable);
            animatedVectorDrawable.start();
            int width = this.J.getWidth();
            int width2 = relativeLayout.getWidth();
            float x10 = relativeLayout.getX();
            m4 m4Var = new m4(this, width, width2, x10, relativeLayout.getWidth() + x10, 3);
            int i10 = 0;
            m4 m4Var2 = new m4(this, this.J.getHeight(), relativeLayout.getHeight(), relativeLayout.getY() + relativeLayout.getHeight(), i10);
            float x11 = frameLayout.getX();
            n4 n4Var = new n4(this, x11, (width2 + x11) - q4Var.getWidth(), width2, i10);
            m4Var.setInterpolator(interpolator2);
            m4Var.setDuration(e());
            m4Var2.setInterpolator(s4Var);
            m4Var2.setDuration(e());
            n4Var.setInterpolator(interpolator2);
            n4Var.setDuration(e());
            AnimationSet animationSet = this.z;
            animationSet.getAnimations().clear();
            animationSet.addAnimation(m4Var);
            animationSet.addAnimation(m4Var2);
            animationSet.addAnimation(n4Var);
            relativeLayout.startAnimation(animationSet);
            this.N = false;
            n();
            ub1Var.animate().alpha(1.0f).withLayer().setInterpolator(this.u).setDuration(100L).start();
            t4Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(150L).start();
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable2 = this.o;
        q4Var.setImageDrawable(animatedVectorDrawable2);
        animatedVectorDrawable2.start();
        int width3 = this.I.getWidth();
        int height = this.I.getHeight();
        int width4 = relativeLayout.getWidth();
        int height2 = relativeLayout.getHeight();
        float y3 = relativeLayout.getY();
        float x12 = relativeLayout.getX();
        m4 m4Var3 = new m4(this, width3, width4, x12, x12 + relativeLayout.getWidth(), 1);
        m4 m4Var4 = new m4(this, height, height2, y3, 2);
        float x13 = frameLayout.getX();
        n4 n4Var2 = new n4(this, x13, q4Var.getWidth() + (x13 - width3), width4, 1);
        m4Var3.setInterpolator(s4Var);
        m4Var3.setDuration(e());
        m4Var4.setInterpolator(interpolator2);
        m4Var4.setDuration(e());
        n4Var2.setInterpolator(interpolator2);
        n4Var2.setDuration(e());
        AnimationSet animationSet2 = this.y;
        animationSet2.getAnimations().clear();
        animationSet2.addAnimation(m4Var3);
        animationSet2.addAnimation(m4Var4);
        animationSet2.addAnimation(n4Var2);
        relativeLayout.startAnimation(animationSet2);
        this.N = true;
        n();
        ub1Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(250L).start();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.width = t4Var.getWidth();
        frameLayout.setLayoutParams(layoutParams);
        t4Var.setAlpha(1.0f);
    }

    public final void h() {
        RelativeLayout relativeLayout = this.f;
        relativeLayout.removeAllViews();
        if (this.I != null) {
            relativeLayout.addView(this.h);
        }
        relativeLayout.addView(this.g);
        if (this.I != null) {
            relativeLayout.addView(this.i);
        }
        k();
        j();
    }

    public final void i(Rect rect) {
        View view = this.b;
        Rect rect2 = this.A;
        view.getWindowVisibleDisplayFrame(rect2);
        int centerX = rect.centerX();
        PopupWindow popupWindow = this.c;
        int min = Math.min(centerX - (popupWindow.getWidth() / 2), rect2.right - popupWindow.getWidth());
        int i10 = rect.top;
        int i11 = rect2.top;
        int i12 = i10 - i11;
        int i13 = rect2.bottom;
        int i14 = rect.bottom;
        int i15 = i13 - i14;
        int i16 = this.e;
        int i17 = i16 * 2;
        int i18 = this.E;
        int i19 = i18 + i17;
        if (this.I != null) {
            int c10 = c(2) + i17;
            int i20 = (rect2.bottom - rect.top) + i19;
            int i21 = (rect.bottom - rect2.top) + i19;
            if (i12 >= c10) {
                o(i12 - i17);
                i14 = rect.top - popupWindow.getHeight();
                this.M = true;
            } else if (i12 >= i19 && i20 >= c10) {
                o(i20 - i17);
                i14 = rect.top - i19;
                this.M = false;
            } else if (i15 >= c10) {
                o(i15 - i17);
                i14 = rect.bottom;
                this.M = false;
            } else if (i15 < i19 || rect2.height() < c10) {
                o(rect2.height() - i17);
                i14 = rect2.top;
                this.M = false;
            } else {
                o(i21 - i17);
                i14 = (rect.bottom + i19) - popupWindow.getHeight();
                this.M = true;
            }
        } else if (i12 >= i19) {
            i14 = i10 - i19;
        } else if (i15 < i19) {
            i14 = i15 >= i18 ? i14 - i16 : Math.max(i11, i10 - i19);
        }
        View rootView = view.getRootView();
        int[] iArr = this.C;
        rootView.getLocationOnScreen(iArr);
        int i22 = iArr[0];
        int i23 = iArr[1];
        view.getRootView().getLocationInWindow(iArr);
        this.B.set(Math.max(0, min - (i22 - iArr[0])), Math.max(0, i14 - (i23 - iArr[1])));
    }

    public final void j() {
        int width;
        int height;
        if (this.N) {
            width = this.I.getWidth();
            height = this.I.getHeight();
        } else {
            width = this.J.getWidth();
            height = this.J.getHeight();
        }
        RelativeLayout relativeLayout = this.f;
        this.D.set((int) relativeLayout.getX(), (int) relativeLayout.getY(), ((int) relativeLayout.getX()) + width, ((int) relativeLayout.getY()) + height);
    }

    public final void k() {
        FrameLayout frameLayout = this.i;
        frameLayout.setEnabled(true);
        t4 t4Var = this.h;
        t4Var.awakenScrollBars();
        boolean z10 = this.N;
        PopupWindow popupWindow = this.c;
        q4 q4Var = this.k;
        int i10 = this.d;
        Size size = this.H;
        int i11 = this.e;
        ub1 ub1Var = this.g;
        RelativeLayout relativeLayout = this.f;
        if (z10) {
            m(relativeLayout, this.I);
            ub1Var.setAlpha(0.0f);
            ub1Var.setVisibility(4);
            t4Var.setAlpha(1.0f);
            t4Var.setVisibility(0);
            q4Var.setImageDrawable(this.m);
            frameLayout.setContentDescription(LocaleController.getString(org.telegram.messenger.R.string.AccDescrMoreOptions));
            relativeLayout.setX((popupWindow.getWidth() - r2.getWidth()) - i10);
            ub1Var.setX(-relativeLayout.getX());
            frameLayout.setX(0.0f);
            t4Var.setX(0.0f);
            if (this.M) {
                relativeLayout.setY(i11);
                ub1Var.setY(r2.getHeight() - relativeLayout.getHeight());
                frameLayout.setY(r2.getHeight() - size.getHeight());
                t4Var.setY(0.0f);
                return;
            }
            relativeLayout.setY(i11);
            ub1Var.setY(0.0f);
            frameLayout.setY(0.0f);
            t4Var.setY(size.getHeight());
            return;
        }
        m(relativeLayout, this.J);
        ub1Var.setAlpha(1.0f);
        ub1Var.setVisibility(0);
        t4Var.setAlpha(0.0f);
        t4Var.setVisibility(4);
        q4Var.setImageDrawable(this.n);
        frameLayout.setContentDescription(LocaleController.getString(org.telegram.messenger.R.string.AccDescrMoreOptions));
        if (this.I == null) {
            relativeLayout.setX(i10);
            relativeLayout.setY(i11);
            ub1Var.setX(0.0f);
            ub1Var.setY(0.0f);
            return;
        }
        relativeLayout.setX((popupWindow.getWidth() - r2.getWidth()) - i10);
        ub1Var.setX(0.0f);
        frameLayout.setX(r2.getWidth() - size.getWidth());
        t4Var.setX(r2.getWidth() - this.I.getWidth());
        if (this.M) {
            relativeLayout.setY((this.I.getHeight() + i11) - r2.getHeight());
            ub1Var.setY(0.0f);
            frameLayout.setY(0.0f);
            t4Var.setY(r2.getHeight() - this.I.getHeight());
            return;
        }
        relativeLayout.setY(i11);
        ub1Var.setY(0.0f);
        frameLayout.setY(0.0f);
        t4Var.setY(size.getHeight());
    }

    public final void n() {
        boolean z10 = this.N;
        q4 q4Var = this.k;
        FrameLayout frameLayout = this.i;
        if (z10) {
            frameLayout.setClickable(true);
            frameLayout.setOnClickListener(new k4(this, 0));
            q4Var.setClickable(false);
            q4Var.setOnClickListener(null);
            return;
        }
        frameLayout.setClickable(false);
        frameLayout.setOnClickListener(null);
        q4Var.setClickable(true);
        q4Var.setOnClickListener(new k4(this, 1));
    }

    public final void o(int i10) {
        if (this.I != null) {
            int c10 = c((i10 - this.H.getHeight()) / this.E);
            if (this.I.getHeight() != c10) {
                this.I = new Size(this.I.getWidth(), c10);
            }
            m(this.h, this.I);
            boolean z10 = this.N;
            RelativeLayout relativeLayout = this.f;
            if (z10) {
                m(relativeLayout, this.I);
                if (this.M) {
                    float height = this.I.getHeight() - c10;
                    relativeLayout.setY(relativeLayout.getY() + height);
                    FrameLayout frameLayout = this.i;
                    frameLayout.setY(frameLayout.getY() - height);
                }
            } else {
                m(relativeLayout, this.J);
            }
            p();
        }
    }

    public final void p() {
        int i10;
        Size size = this.J;
        int i11 = 0;
        if (size != null) {
            i11 = Math.max(0, size.getWidth());
            i10 = Math.max(0, this.J.getHeight());
        } else {
            i10 = 0;
        }
        Size size2 = this.I;
        if (size2 != null) {
            i11 = Math.max(i11, size2.getWidth());
            i10 = Math.max(i10, this.I.getHeight());
        }
        int i12 = (this.d * 2) + i11;
        PopupWindow popupWindow = this.c;
        popupWindow.setWidth(i12);
        popupWindow.setHeight((this.e * 2) + i10);
        Size size3 = this.J;
        if (size3 == null || this.I == null) {
            return;
        }
        int width = size3.getWidth() - this.I.getWidth();
        int height = this.I.getHeight() - this.J.getHeight();
        this.O = (int) (Math.sqrt((height * height) + (width * width)) / this.f.getContext().getResources().getDisplayMetrics().density);
    }
}
