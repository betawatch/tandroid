package org.telegram.ui.ActionBar;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
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
import c8.ma;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.ui.d61;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class k4 {
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
    public final androidx.mediarouter.app.w L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public final /* synthetic */ m4 Q;
    public final Context a;
    public final View b;
    public final PopupWindow c;
    public final int d;
    public final int e;
    public final RelativeLayout f;
    public final d61 g;
    public final j4 h;
    public final FrameLayout i;
    public final View j;
    public final g4 k;
    public final TextView l;
    public final Drawable m;
    public final Drawable n;
    public final AnimatedVectorDrawable o;
    public final AnimatedVectorDrawable p;
    public final ab.v q;
    public final i4 r;
    public final Interpolator s;
    public final Interpolator t;
    public final Interpolator u;
    public final AnimatorSet v;
    public final AnimatorSet w;
    public final AnimatorSet x;
    public final AnimationSet y;
    public final AnimationSet z;

    public k4(m4 m4Var, Context context, View view) {
        float f10;
        int i7;
        int i10;
        int w02;
        this.Q = m4Var;
        new j6.o(this, 20);
        this.F = true;
        this.L = new androidx.mediarouter.app.w(this, 8);
        this.P = -4;
        this.b = view;
        this.a = context;
        i6 i6Var = m4Var.n;
        int i11 = m4Var.i;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int L = org.telegram.messenger.g0.L(20.0f);
        marginLayoutParams.rightMargin = L;
        marginLayoutParams.topMargin = L;
        marginLayoutParams.leftMargin = L;
        marginLayoutParams.bottomMargin = L;
        relativeLayout.setLayoutParams(marginLayoutParams);
        relativeLayout.setElevation(org.telegram.messenger.g0.L(1.0f));
        relativeLayout.setFocusable(true);
        relativeLayout.setFocusableInTouchMode(true);
        dh.c cVar = m4Var.o;
        if (cVar != null) {
            fh.g c10 = cVar.c(relativeLayout, null, true);
            gh.e eVar = new gh.e(i6Var);
            f10 = 1.0f;
            eVar.e = new g0.e(16);
            eVar.f(687865855, 687865855);
            eVar.e(352321535, 352321535);
            float N = org.telegram.messenger.g0.N(0.6666667f);
            float N2 = org.telegram.messenger.g0.N(0.6666667f);
            eVar.f = N;
            eVar.h = N2;
            c10.p(eVar);
            c10.r(org.telegram.messenger.g0.L(12.0f));
            relativeLayout.setBackground(c10);
        } else {
            f10 = 1.0f;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float L2 = org.telegram.messenger.g0.L(12.0f);
            gradientDrawable.setCornerRadii(new float[]{L2, L2, L2, L2, L2, L2, L2, L2});
            if (i11 == 0) {
                i7 = n6.h5;
            } else {
                if (i11 == 2) {
                    gradientDrawable.setColor(-115203550);
                } else if (i11 == 1) {
                    i7 = n6.d6;
                }
                i7 = -1;
            }
            if (i7 >= 0) {
                gradientDrawable.setColor(-1);
            }
            relativeLayout.setBackground(gradientDrawable);
            if (i7 >= 0) {
                u6.x(relativeLayout, gradientDrawable, i7, i6Var, PorterDuff.Mode.SRC_IN);
            }
        }
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        relativeLayout.setClipToOutline(true);
        this.f = relativeLayout;
        hi.x4 x4Var = new hi.x4(relativeLayout.getContext(), 2);
        PopupWindow popupWindow = new PopupWindow(x4Var);
        popupWindow.setClippingEnabled(false);
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setSplitTouchEnabled(true);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        x4Var.addView(relativeLayout);
        this.c = popupWindow;
        this.d = org.telegram.messenger.g0.L(16.0f);
        this.e = org.telegram.messenger.g0.L(8.0f);
        this.E = org.telegram.messenger.g0.L(48.0f);
        int L3 = org.telegram.messenger.g0.L(8.0f);
        this.r = new i4();
        this.s = AnimationUtils.loadInterpolator(context, R.interpolator.fast_out_slow_in);
        this.t = AnimationUtils.loadInterpolator(context, R.interpolator.linear_out_slow_in);
        this.u = AnimationUtils.loadInterpolator(context, R.interpolator.fast_out_linear_in);
        Drawable mutate = context.getDrawable(org.telegram.messenger.beta.R.drawable.ft_avd_tooverflow).mutate();
        this.m = mutate;
        mutate.setAutoMirrored(true);
        Drawable mutate2 = context.getDrawable(org.telegram.messenger.beta.R.drawable.ft_avd_toarrow).mutate();
        this.n = mutate2;
        mutate2.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) context.getDrawable(org.telegram.messenger.beta.R.drawable.ft_avd_toarrow_animation).mutate();
        this.o = animatedVectorDrawable;
        animatedVectorDrawable.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) context.getDrawable(org.telegram.messenger.beta.R.drawable.ft_avd_tooverflow_animation).mutate();
        this.p = animatedVectorDrawable2;
        animatedVectorDrawable2.setAutoMirrored(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.i = frameLayout;
        g4 g4Var = new g4(this, context);
        this.k = g4Var;
        g4Var.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(48.0f)));
        g4Var.setPaddingRelative(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        g4Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        g4Var.setImageDrawable(mutate2);
        TextView textView = new TextView(context);
        this.l = textView;
        n10.l(16.0f, 2131753754, 1, textView, null);
        textView.setAlpha(0.0f);
        View view2 = new View(context);
        this.j = view2;
        if (i11 == 0) {
            int i12 = n6.j5;
            int w03 = n6.w0(i12, i6Var);
            int i13 = n6.i6;
            i10 = L3;
            org.telegram.ui.Cells.y h02 = n6.h0(n6.w0(i13, i6Var), 1, -1);
            q6 M = u6.M(i13);
            g4Var.setBackground(h02);
            u6.j(g4Var, h02, null, M, i6Var);
            org.telegram.ui.Cells.y h03 = n6.h0(n6.w0(i13, i6Var), 2, -1);
            q6 M2 = u6.M(i13);
            frameLayout.setBackground(h03);
            u6.j(frameLayout, h03, null, M2, i6Var);
            u6.i(view2, u6.K(0.4f, i12), i6Var);
            w02 = w03;
        } else {
            i10 = L3;
            if (i11 == 2) {
                g4Var.setBackground(n6.h0(553648127, 1, -1));
                frameLayout.setBackground(n6.h0(553648127, 2, -1));
                view2.setBackgroundColor(553648127);
                w02 = -328966;
            } else {
                w02 = n6.w0(n6.G6, i6Var);
                int i14 = n6.i6;
                org.telegram.ui.Cells.y h04 = n6.h0(n6.w0(i14, i6Var), 1, -1);
                q6 M3 = u6.M(i14);
                g4Var.setBackground(h04);
                u6.j(g4Var, h04, null, M3, i6Var);
                org.telegram.ui.Cells.y h05 = n6.h0(n6.w0(i14, i6Var), 2, -1);
                q6 M4 = u6.M(i14);
                frameLayout.setBackground(h05);
                u6.j(frameLayout, h05, null, M4, i6Var);
                u6.h(n6.d7, view2, i6Var);
            }
        }
        mutate2.setTint(w02);
        mutate.setTint(w02);
        animatedVectorDrawable.setTint(w02);
        animatedVectorDrawable2.setTint(w02);
        textView.setTextColor(w02);
        if (i11 != 2) {
            int i15 = i11 == 0 ? n6.j5 : n6.G6;
            u6.U(textView, i15, i6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            u6.x(g4Var, mutate2, i15, i6Var, mode);
            u6.x(g4Var, mutate, i15, i6Var, mode);
            u6.x(g4Var, animatedVectorDrawable, i15, i6Var, mode);
            u6.x(g4Var, animatedVectorDrawable2, i15, i6Var, mode);
        }
        g4Var.setOnClickListener(new b4(this, 2));
        frameLayout.addView(g4Var, ma.e(-2, -2, 19));
        frameLayout.addView(textView, ma.d(-1, -2.0f, 19, 56.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.addView(view2, ma.a(-1.0f, f10 / org.telegram.messenger.g0.p, 55));
        g4Var.measure(0, 0);
        this.H = new Size(g4Var.getMeasuredWidth(), g4Var.getMeasuredHeight());
        this.g = new d61(9, context, this);
        ab.v vVar = new ab.v();
        vVar.e = this;
        vVar.c = context;
        vVar.a = i10;
        int L4 = org.telegram.messenger.g0.L(18.0f);
        vVar.b = L4;
        LinearLayout b10 = m4.b(this.Q, context, null, true, false, false);
        b10.setPadding(L4, 0, L4, 0);
        vVar.d = b10;
        this.q = vVar;
        final j4 j4Var = new j4(this);
        j4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        j4Var.setDivider(null);
        j4Var.setDividerHeight(0);
        f4 f4Var = new f4(this, context);
        j4Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(2.0f));
        j4Var.setClipToPadding(false);
        j4Var.setAdapter((ListAdapter) f4Var);
        j4Var.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: org.telegram.ui.ActionBar.c4
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view3, int i16, long j3) {
                k4 k4Var = k4.this;
                k4Var.getClass();
                MenuItem menuItem = (MenuItem) j4Var.getAdapter().getItem(i16);
                m4 m4Var2 = k4Var.Q;
                if (m4Var2.j == null || !m4.r.contains(Integer.valueOf(menuItem.getItemId()))) {
                    MenuItem.OnMenuItemClickListener onMenuItemClickListener = k4Var.K;
                    if (onMenuItemClickListener != null) {
                        onMenuItemClickListener.onMenuItemClick(menuItem);
                        return;
                    }
                    return;
                }
                int i17 = -k4Var.P;
                k4Var.P = i17;
                org.telegram.messenger.g0.E3(i17, view3, null);
                org.telegram.messenger.q2.E.a();
                m4Var2.j.run();
            }
        });
        this.h = j4Var;
        androidx.mediarouter.app.f0 f0Var = new androidx.mediarouter.app.f0(this, 2);
        AnimationSet animationSet = new AnimationSet(true);
        this.y = animationSet;
        animationSet.setAnimationListener(f0Var);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.z = animationSet2;
        animationSet2.setAnimationListener(f0Var);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, (Property<RelativeLayout, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        this.v = animatorSet;
        this.w = m4.a(relativeLayout, ks.g2, new h4(this, 0));
        this.x = m4.a(relativeLayout, 0, new h4(this, 1));
    }

    public static void a(k4 k4Var) {
        FrameLayout frameLayout = k4Var.i;
        RelativeLayout relativeLayout = k4Var.f;
        if (k4Var.M) {
            k4Var.g.setY(relativeLayout.getHeight() - k4Var.J.getHeight());
            frameLayout.setY(relativeLayout.getHeight() - frameLayout.getHeight());
            k4Var.h.setY(relativeLayout.getHeight() - k4Var.I.getHeight());
        }
    }

    public static boolean b(k4 k4Var) {
        AnimationSet animationSet = k4Var.z;
        AnimationSet animationSet2 = k4Var.y;
        return (animationSet2.hasStarted() && !animationSet2.hasEnded()) || (animationSet.hasStarted() && !animationSet.hasEnded());
    }

    public static void l(View view, int i7, int i10) {
        view.setMinimumWidth(i7);
        view.setMinimumHeight(i10);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(0, 0);
        }
        layoutParams.width = i7;
        layoutParams.height = i10;
        view.setLayoutParams(layoutParams);
    }

    public static void m(View view, Size size) {
        l(view, size.getWidth(), size.getHeight());
    }

    public final int c(int i7) {
        int max = Math.max(2, i7);
        j4 j4Var = this.h;
        int min = Math.min(4, Math.min(max, j4Var.getCount()));
        int count = j4Var.getCount();
        int i10 = this.E;
        return this.H.getHeight() + (min * i10) + (min < count ? (int) (i10 * 0.5f) : 0);
    }

    public final void d() {
        this.f.clearAnimation();
        this.g.animate().cancel();
        this.h.animate().cancel();
        this.o.stop();
        this.p.stop();
    }

    public final int e() {
        int i7 = this.O;
        return i7 < 150 ? Math.max(ks.e3, 0) : i7 > 300 ? ks.X4 : ks.Z3;
    }

    public final boolean f() {
        return (this.F || this.G) ? false : true;
    }

    public final void g() {
        boolean z10 = this.N;
        Interpolator interpolator = this.t;
        j4 j4Var = this.h;
        d61 d61Var = this.g;
        i4 i4Var = this.r;
        Interpolator interpolator2 = this.s;
        FrameLayout frameLayout = this.i;
        RelativeLayout relativeLayout = this.f;
        g4 g4Var = this.k;
        if (z10) {
            AnimatedVectorDrawable animatedVectorDrawable = this.p;
            g4Var.setImageDrawable(animatedVectorDrawable);
            animatedVectorDrawable.start();
            int width = this.J.getWidth();
            int width2 = relativeLayout.getWidth();
            float x10 = relativeLayout.getX();
            d4 d4Var = new d4(this, width, width2, x10, relativeLayout.getWidth() + x10, 3);
            int i7 = 0;
            d4 d4Var2 = new d4(this, this.J.getHeight(), relativeLayout.getHeight(), relativeLayout.getY() + relativeLayout.getHeight(), i7);
            float x11 = frameLayout.getX();
            e4 e4Var = new e4(this, x11, (width2 + x11) - g4Var.getWidth(), width2, i7);
            d4Var.setInterpolator(interpolator2);
            d4Var.setDuration(e());
            d4Var2.setInterpolator(i4Var);
            d4Var2.setDuration(e());
            e4Var.setInterpolator(interpolator2);
            e4Var.setDuration(e());
            AnimationSet animationSet = this.z;
            animationSet.getAnimations().clear();
            animationSet.addAnimation(d4Var);
            animationSet.addAnimation(d4Var2);
            animationSet.addAnimation(e4Var);
            relativeLayout.startAnimation(animationSet);
            this.N = false;
            n();
            d61Var.animate().alpha(1.0f).withLayer().setInterpolator(this.u).setDuration(100L).start();
            j4Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(150L).start();
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable2 = this.o;
        g4Var.setImageDrawable(animatedVectorDrawable2);
        animatedVectorDrawable2.start();
        int width3 = this.I.getWidth();
        int height = this.I.getHeight();
        int width4 = relativeLayout.getWidth();
        int height2 = relativeLayout.getHeight();
        float y10 = relativeLayout.getY();
        float x12 = relativeLayout.getX();
        d4 d4Var3 = new d4(this, width3, width4, x12, x12 + relativeLayout.getWidth(), 1);
        d4 d4Var4 = new d4(this, height, height2, y10, 2);
        float x13 = frameLayout.getX();
        e4 e4Var2 = new e4(this, x13, g4Var.getWidth() + (x13 - width3), width4, 1);
        d4Var3.setInterpolator(i4Var);
        d4Var3.setDuration(e());
        d4Var4.setInterpolator(interpolator2);
        d4Var4.setDuration(e());
        e4Var2.setInterpolator(interpolator2);
        e4Var2.setDuration(e());
        AnimationSet animationSet2 = this.y;
        animationSet2.getAnimations().clear();
        animationSet2.addAnimation(d4Var3);
        animationSet2.addAnimation(d4Var4);
        animationSet2.addAnimation(e4Var2);
        relativeLayout.startAnimation(animationSet2);
        this.N = true;
        n();
        d61Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(250L).start();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.width = j4Var.getWidth();
        frameLayout.setLayoutParams(layoutParams);
        j4Var.setAlpha(1.0f);
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
        int i7 = rect.top;
        int i10 = rect2.top;
        int i11 = i7 - i10;
        int i12 = rect2.bottom;
        int i13 = rect.bottom;
        int i14 = i12 - i13;
        int i15 = this.e;
        int i16 = i15 * 2;
        int i17 = this.E;
        int i18 = i17 + i16;
        if (this.I != null) {
            int c10 = c(2) + i16;
            int i19 = (rect2.bottom - rect.top) + i18;
            int i20 = (rect.bottom - rect2.top) + i18;
            if (i11 >= c10) {
                o(i11 - i16);
                i13 = rect.top - popupWindow.getHeight();
                this.M = true;
            } else if (i11 >= i18 && i19 >= c10) {
                o(i19 - i16);
                i13 = rect.top - i18;
                this.M = false;
            } else if (i14 >= c10) {
                o(i14 - i16);
                i13 = rect.bottom;
                this.M = false;
            } else if (i14 < i18 || rect2.height() < c10) {
                o(rect2.height() - i16);
                i13 = rect2.top;
                this.M = false;
            } else {
                o(i20 - i16);
                i13 = (rect.bottom + i18) - popupWindow.getHeight();
                this.M = true;
            }
        } else if (i11 >= i18) {
            i13 = i7 - i18;
        } else if (i14 < i18) {
            i13 = i14 >= i17 ? i13 - i15 : Math.max(i10, i7 - i18);
        }
        View rootView = view.getRootView();
        int[] iArr = this.C;
        rootView.getLocationOnScreen(iArr);
        int i21 = iArr[0];
        int i22 = iArr[1];
        view.getRootView().getLocationInWindow(iArr);
        this.B.set(Math.max(0, min - (i21 - iArr[0])), Math.max(0, i13 - (i22 - iArr[1])));
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
        j4 j4Var = this.h;
        j4Var.awakenScrollBars();
        boolean z10 = this.N;
        PopupWindow popupWindow = this.c;
        g4 g4Var = this.k;
        int i7 = this.d;
        Size size = this.H;
        int i10 = this.e;
        d61 d61Var = this.g;
        RelativeLayout relativeLayout = this.f;
        if (z10) {
            m(relativeLayout, this.I);
            d61Var.setAlpha(0.0f);
            d61Var.setVisibility(4);
            j4Var.setAlpha(1.0f);
            j4Var.setVisibility(0);
            g4Var.setImageDrawable(this.m);
            frameLayout.setContentDescription(gd.M0(2131754839, null));
            relativeLayout.setX((popupWindow.getWidth() - r3.getWidth()) - i7);
            d61Var.setX(-relativeLayout.getX());
            frameLayout.setX(0.0f);
            j4Var.setX(0.0f);
            if (this.M) {
                relativeLayout.setY(i10);
                d61Var.setY(r3.getHeight() - relativeLayout.getHeight());
                frameLayout.setY(r3.getHeight() - size.getHeight());
                j4Var.setY(0.0f);
                return;
            }
            relativeLayout.setY(i10);
            d61Var.setY(0.0f);
            frameLayout.setY(0.0f);
            j4Var.setY(size.getHeight());
            return;
        }
        m(relativeLayout, this.J);
        d61Var.setAlpha(1.0f);
        d61Var.setVisibility(0);
        j4Var.setAlpha(0.0f);
        j4Var.setVisibility(4);
        g4Var.setImageDrawable(this.n);
        frameLayout.setContentDescription(gd.M0(2131754839, null));
        if (this.I == null) {
            relativeLayout.setX(i7);
            relativeLayout.setY(i10);
            d61Var.setX(0.0f);
            d61Var.setY(0.0f);
            return;
        }
        relativeLayout.setX((popupWindow.getWidth() - r3.getWidth()) - i7);
        d61Var.setX(0.0f);
        frameLayout.setX(r3.getWidth() - size.getWidth());
        j4Var.setX(r3.getWidth() - this.I.getWidth());
        if (this.M) {
            relativeLayout.setY((this.I.getHeight() + i10) - r3.getHeight());
            d61Var.setY(0.0f);
            frameLayout.setY(0.0f);
            j4Var.setY(r3.getHeight() - this.I.getHeight());
            return;
        }
        relativeLayout.setY(i10);
        d61Var.setY(0.0f);
        frameLayout.setY(0.0f);
        j4Var.setY(size.getHeight());
    }

    public final void n() {
        boolean z10 = this.N;
        g4 g4Var = this.k;
        FrameLayout frameLayout = this.i;
        if (z10) {
            frameLayout.setClickable(true);
            frameLayout.setOnClickListener(new b4(this, 0));
            g4Var.setClickable(false);
            g4Var.setOnClickListener(null);
            return;
        }
        frameLayout.setClickable(false);
        frameLayout.setOnClickListener(null);
        g4Var.setClickable(true);
        g4Var.setOnClickListener(new b4(this, 1));
    }

    public final void o(int i7) {
        if (this.I != null) {
            int c10 = c((i7 - this.H.getHeight()) / this.E);
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
        int i7;
        Size size = this.J;
        int i10 = 0;
        if (size != null) {
            i10 = Math.max(0, size.getWidth());
            i7 = Math.max(0, this.J.getHeight());
        } else {
            i7 = 0;
        }
        Size size2 = this.I;
        if (size2 != null) {
            i10 = Math.max(i10, size2.getWidth());
            i7 = Math.max(i7, this.I.getHeight());
        }
        int i11 = (this.d * 2) + i10;
        PopupWindow popupWindow = this.c;
        popupWindow.setWidth(i11);
        popupWindow.setHeight((this.e * 2) + i7);
        Size size3 = this.J;
        if (size3 == null || this.I == null) {
            return;
        }
        int width = size3.getWidth() - this.I.getWidth();
        int height = this.I.getHeight() - this.J.getHeight();
        this.O = (int) (Math.sqrt((height * height) + (width * width)) / this.f.getContext().getResources().getDisplayMetrics().density);
    }
}
