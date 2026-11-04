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
import b8.mf;
import gi.i8;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.ui.s51;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i4 {
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
    public final /* synthetic */ k4 Q;
    public final Context a;
    public final View b;
    public final PopupWindow c;
    public final int d;
    public final int e;
    public final RelativeLayout f;
    public final s51 g;
    public final g4 h;
    public final FrameLayout i;
    public final View j;
    public final c4 k;
    public final TextView l;
    public final Drawable m;
    public final Drawable n;
    public final AnimatedVectorDrawable o;
    public final AnimatedVectorDrawable p;
    public final h4 q;
    public final f4 r;
    public final Interpolator s;
    public final Interpolator t;
    public final Interpolator u;
    public final AnimatorSet v;
    public final AnimatorSet w;
    public final AnimatorSet x;
    public final AnimationSet y;
    public final AnimationSet z;

    public i4(k4 k4Var, Context context, View view) {
        float f10;
        int i3;
        int i10;
        RelativeLayout relativeLayout;
        int w02;
        this.Q = k4Var;
        new mi.b0(this, 16);
        this.F = true;
        this.L = new androidx.mediarouter.app.w(this, 8);
        this.P = -4;
        this.b = view;
        this.a = context;
        e6 e6Var = k4Var.n;
        int i11 = k4Var.i;
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int L = org.telegram.messenger.g0.L(20.0f);
        marginLayoutParams.rightMargin = L;
        marginLayoutParams.topMargin = L;
        marginLayoutParams.leftMargin = L;
        marginLayoutParams.bottomMargin = L;
        relativeLayout2.setLayoutParams(marginLayoutParams);
        relativeLayout2.setElevation(org.telegram.messenger.g0.L(1.0f));
        relativeLayout2.setFocusable(true);
        relativeLayout2.setFocusableInTouchMode(true);
        eh.c cVar = k4Var.o;
        if (cVar != null) {
            gh.g c2 = cVar.c(relativeLayout2, null, true);
            hh.e eVar = new hh.e(e6Var);
            f10 = 1.0f;
            eVar.e = new i8(13);
            eVar.f(687865855, 687865855);
            eVar.e(352321535, 352321535);
            float N = org.telegram.messenger.g0.N(0.6666667f);
            float N2 = org.telegram.messenger.g0.N(0.6666667f);
            eVar.f = N;
            eVar.h = N2;
            c2.p(eVar);
            c2.r(org.telegram.messenger.g0.L(12.0f));
            relativeLayout2.setBackground(c2);
        } else {
            f10 = 1.0f;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float L2 = org.telegram.messenger.g0.L(12.0f);
            gradientDrawable.setCornerRadii(new float[]{L2, L2, L2, L2, L2, L2, L2, L2});
            if (i11 == 0) {
                i3 = k6.h5;
            } else {
                if (i11 == 2) {
                    gradientDrawable.setColor(-115203550);
                } else if (i11 == 1) {
                    i3 = k6.d6;
                }
                i3 = -1;
            }
            if (i3 >= 0) {
                gradientDrawable.setColor(-1);
            }
            relativeLayout2.setBackground(gradientDrawable);
            if (i3 >= 0) {
                r6.y(relativeLayout2, gradientDrawable, i3, e6Var, PorterDuff.Mode.SRC_IN);
            }
        }
        relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        relativeLayout2.setClipToOutline(true);
        this.f = relativeLayout2;
        gi.y4 y4Var = new gi.y4(relativeLayout2.getContext(), 2);
        PopupWindow popupWindow = new PopupWindow(y4Var);
        popupWindow.setClippingEnabled(false);
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setSplitTouchEnabled(true);
        relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        y4Var.addView(relativeLayout2);
        this.c = popupWindow;
        this.d = org.telegram.messenger.g0.L(16.0f);
        this.e = org.telegram.messenger.g0.L(8.0f);
        this.E = org.telegram.messenger.g0.L(48.0f);
        int L3 = org.telegram.messenger.g0.L(8.0f);
        this.r = new f4();
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
        c4 c4Var = new c4(this, context);
        this.k = c4Var;
        c4Var.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(48.0f)));
        c4Var.setPaddingRelative(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        c4Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        c4Var.setImageDrawable(mutate2);
        TextView textView = new TextView(context);
        this.l = textView;
        textView.setText(bd.M0(2131753756, null));
        textView.setTextSize(1, 16.0f);
        textView.setAlpha(0.0f);
        View view2 = new View(context);
        this.j = view2;
        if (i11 == 0) {
            int i12 = k6.j5;
            w02 = k6.w0(i12, e6Var);
            relativeLayout = relativeLayout2;
            int i13 = k6.i6;
            i10 = L3;
            org.telegram.ui.Cells.y h02 = k6.h0(k6.w0(i13, e6Var), 1, -1);
            n6 N3 = r6.N(i13);
            c4Var.setBackground(h02);
            r6.k(c4Var, h02, null, N3, e6Var);
            org.telegram.ui.Cells.y h03 = k6.h0(k6.w0(i13, e6Var), 2, -1);
            n6 N4 = r6.N(i13);
            frameLayout.setBackground(h03);
            r6.k(frameLayout, h03, null, N4, e6Var);
            r6.j(view2, r6.L(0.4f, i12), e6Var);
        } else {
            i10 = L3;
            relativeLayout = relativeLayout2;
            if (i11 == 2) {
                c4Var.setBackground(k6.h0(553648127, 1, -1));
                frameLayout.setBackground(k6.h0(553648127, 2, -1));
                view2.setBackgroundColor(553648127);
                w02 = -328966;
            } else {
                w02 = k6.w0(k6.G6, e6Var);
                int i14 = k6.i6;
                org.telegram.ui.Cells.y h04 = k6.h0(k6.w0(i14, e6Var), 1, -1);
                n6 N5 = r6.N(i14);
                c4Var.setBackground(h04);
                r6.k(c4Var, h04, null, N5, e6Var);
                org.telegram.ui.Cells.y h05 = k6.h0(k6.w0(i14, e6Var), 2, -1);
                n6 N6 = r6.N(i14);
                frameLayout.setBackground(h05);
                r6.k(frameLayout, h05, null, N6, e6Var);
                r6.i(k6.d7, view2, e6Var);
            }
        }
        int i15 = w02;
        mutate2.setTint(i15);
        mutate.setTint(i15);
        animatedVectorDrawable.setTint(i15);
        animatedVectorDrawable2.setTint(i15);
        textView.setTextColor(i15);
        if (i11 != 2) {
            int i16 = i11 == 0 ? k6.j5 : k6.G6;
            r6.V(textView, i16, e6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            r6.y(c4Var, mutate2, i16, e6Var, mode);
            r6.y(c4Var, mutate, i16, e6Var, mode);
            r6.y(c4Var, animatedVectorDrawable, i16, e6Var, mode);
            r6.y(c4Var, animatedVectorDrawable2, i16, e6Var, mode);
        }
        c4Var.setOnClickListener(new x3(this, 2));
        frameLayout.addView(c4Var, mf.e(-2, -2, 19));
        frameLayout.addView(textView, mf.d(-1, -2.0f, 19, 56.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.addView(view2, mf.a(-1.0f, f10 / org.telegram.messenger.g0.p, 55));
        c4Var.measure(0, 0);
        this.H = new Size(c4Var.getMeasuredWidth(), c4Var.getMeasuredHeight());
        this.g = new s51(10, context, this);
        h4 h4Var = new h4();
        h4Var.e = this;
        h4Var.d = context;
        h4Var.a = i10;
        int L4 = org.telegram.messenger.g0.L(18.0f);
        h4Var.b = L4;
        LinearLayout b10 = k4.b(this.Q, context, null, true, false, false);
        b10.setPadding(L4, 0, L4, 0);
        h4Var.c = b10;
        this.q = h4Var;
        final g4 g4Var = new g4(this);
        g4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        g4Var.setDivider(null);
        g4Var.setDividerHeight(0);
        b4 b4Var = new b4(this, context);
        g4Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(2.0f));
        g4Var.setClipToPadding(false);
        g4Var.setAdapter((ListAdapter) b4Var);
        g4Var.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: org.telegram.ui.ActionBar.y3
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view3, int i17, long j10) {
                i4 i4Var = i4.this;
                i4Var.getClass();
                MenuItem menuItem = (MenuItem) g4Var.getAdapter().getItem(i17);
                k4 k4Var2 = i4Var.Q;
                if (k4Var2.j == null || !k4.r.contains(Integer.valueOf(menuItem.getItemId()))) {
                    MenuItem.OnMenuItemClickListener onMenuItemClickListener = i4Var.K;
                    if (onMenuItemClickListener != null) {
                        onMenuItemClickListener.onMenuItemClick(menuItem);
                        return;
                    }
                    return;
                }
                int i18 = -i4Var.P;
                i4Var.P = i18;
                org.telegram.messenger.g0.G3(i18, view3, null);
                org.telegram.messenger.p2.E.a();
                k4Var2.j.run();
            }
        });
        this.h = g4Var;
        androidx.mediarouter.app.g0 g0Var = new androidx.mediarouter.app.g0(this, 2);
        AnimationSet animationSet = new AnimationSet(true);
        this.y = animationSet;
        animationSet.setAnimationListener(g0Var);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.z = animationSet2;
        animationSet2.setAnimationListener(g0Var);
        AnimatorSet animatorSet = new AnimatorSet();
        RelativeLayout relativeLayout3 = relativeLayout;
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout3, (Property<RelativeLayout, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        this.v = animatorSet;
        this.w = k4.a(relativeLayout3, hs.g2, new e4(this, 0));
        this.x = k4.a(relativeLayout3, 0, new e4(this, 1));
    }

    public static void a(i4 i4Var) {
        FrameLayout frameLayout = i4Var.i;
        RelativeLayout relativeLayout = i4Var.f;
        if (i4Var.M) {
            i4Var.g.setY(relativeLayout.getHeight() - i4Var.J.getHeight());
            frameLayout.setY(relativeLayout.getHeight() - frameLayout.getHeight());
            i4Var.h.setY(relativeLayout.getHeight() - i4Var.I.getHeight());
        }
    }

    public static boolean b(i4 i4Var) {
        AnimationSet animationSet = i4Var.z;
        AnimationSet animationSet2 = i4Var.y;
        return (animationSet2.hasStarted() && !animationSet2.hasEnded()) || (animationSet.hasStarted() && !animationSet.hasEnded());
    }

    public static void l(View view, int i3, int i10) {
        view.setMinimumWidth(i3);
        view.setMinimumHeight(i10);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(0, 0);
        }
        layoutParams.width = i3;
        layoutParams.height = i10;
        view.setLayoutParams(layoutParams);
    }

    public static void m(View view, Size size) {
        l(view, size.getWidth(), size.getHeight());
    }

    public final int c(int i3) {
        int max = Math.max(2, i3);
        g4 g4Var = this.h;
        int min = Math.min(4, Math.min(max, g4Var.getCount()));
        int count = g4Var.getCount();
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
        int i3 = this.O;
        return i3 < 150 ? Math.max(hs.e3, 0) : i3 > 300 ? hs.X4 : hs.Z3;
    }

    public final boolean f() {
        return (this.F || this.G) ? false : true;
    }

    public final void g() {
        boolean z10 = this.N;
        Interpolator interpolator = this.t;
        g4 g4Var = this.h;
        s51 s51Var = this.g;
        f4 f4Var = this.r;
        Interpolator interpolator2 = this.s;
        FrameLayout frameLayout = this.i;
        RelativeLayout relativeLayout = this.f;
        c4 c4Var = this.k;
        if (z10) {
            AnimatedVectorDrawable animatedVectorDrawable = this.p;
            c4Var.setImageDrawable(animatedVectorDrawable);
            animatedVectorDrawable.start();
            int width = this.J.getWidth();
            int width2 = relativeLayout.getWidth();
            float x10 = relativeLayout.getX();
            z3 z3Var = new z3(this, width, width2, x10, relativeLayout.getWidth() + x10, 3);
            int i3 = 0;
            z3 z3Var2 = new z3(this, this.J.getHeight(), relativeLayout.getHeight(), relativeLayout.getY() + relativeLayout.getHeight(), i3);
            float x11 = frameLayout.getX();
            a4 a4Var = new a4(this, x11, (width2 + x11) - c4Var.getWidth(), width2, i3);
            z3Var.setInterpolator(interpolator2);
            z3Var.setDuration(e());
            z3Var2.setInterpolator(f4Var);
            z3Var2.setDuration(e());
            a4Var.setInterpolator(interpolator2);
            a4Var.setDuration(e());
            AnimationSet animationSet = this.z;
            animationSet.getAnimations().clear();
            animationSet.addAnimation(z3Var);
            animationSet.addAnimation(z3Var2);
            animationSet.addAnimation(a4Var);
            relativeLayout.startAnimation(animationSet);
            this.N = false;
            n();
            s51Var.animate().alpha(1.0f).withLayer().setInterpolator(this.u).setDuration(100L).start();
            g4Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(150L).start();
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable2 = this.o;
        c4Var.setImageDrawable(animatedVectorDrawable2);
        animatedVectorDrawable2.start();
        int width3 = this.I.getWidth();
        int height = this.I.getHeight();
        int width4 = relativeLayout.getWidth();
        int height2 = relativeLayout.getHeight();
        float y9 = relativeLayout.getY();
        float x12 = relativeLayout.getX();
        z3 z3Var3 = new z3(this, width3, width4, x12, x12 + relativeLayout.getWidth(), 1);
        z3 z3Var4 = new z3(this, height, height2, y9, 2);
        float x13 = frameLayout.getX();
        a4 a4Var2 = new a4(this, x13, c4Var.getWidth() + (x13 - width3), width4, 1);
        z3Var3.setInterpolator(f4Var);
        z3Var3.setDuration(e());
        z3Var4.setInterpolator(interpolator2);
        z3Var4.setDuration(e());
        a4Var2.setInterpolator(interpolator2);
        a4Var2.setDuration(e());
        AnimationSet animationSet2 = this.y;
        animationSet2.getAnimations().clear();
        animationSet2.addAnimation(z3Var3);
        animationSet2.addAnimation(z3Var4);
        animationSet2.addAnimation(a4Var2);
        relativeLayout.startAnimation(animationSet2);
        this.N = true;
        n();
        s51Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(250L).start();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.width = g4Var.getWidth();
        frameLayout.setLayoutParams(layoutParams);
        g4Var.setAlpha(1.0f);
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
        int i3 = rect.top;
        int i10 = rect2.top;
        int i11 = i3 - i10;
        int i12 = rect2.bottom;
        int i13 = rect.bottom;
        int i14 = i12 - i13;
        int i15 = this.e;
        int i16 = i15 * 2;
        int i17 = this.E;
        int i18 = i17 + i16;
        if (this.I != null) {
            int c2 = c(2) + i16;
            int i19 = (rect2.bottom - rect.top) + i18;
            int i20 = (rect.bottom - rect2.top) + i18;
            if (i11 >= c2) {
                o(i11 - i16);
                i13 = rect.top - popupWindow.getHeight();
                this.M = true;
            } else if (i11 >= i18 && i19 >= c2) {
                o(i19 - i16);
                i13 = rect.top - i18;
                this.M = false;
            } else if (i14 >= c2) {
                o(i14 - i16);
                i13 = rect.bottom;
                this.M = false;
            } else if (i14 < i18 || rect2.height() < c2) {
                o(rect2.height() - i16);
                i13 = rect2.top;
                this.M = false;
            } else {
                o(i20 - i16);
                i13 = (rect.bottom + i18) - popupWindow.getHeight();
                this.M = true;
            }
        } else if (i11 >= i18) {
            i13 = i3 - i18;
        } else if (i14 < i18) {
            i13 = i14 >= i17 ? i13 - i15 : Math.max(i10, i3 - i18);
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
        g4 g4Var = this.h;
        g4Var.awakenScrollBars();
        boolean z10 = this.N;
        PopupWindow popupWindow = this.c;
        c4 c4Var = this.k;
        int i3 = this.d;
        Size size = this.H;
        int i10 = this.e;
        s51 s51Var = this.g;
        RelativeLayout relativeLayout = this.f;
        if (z10) {
            m(relativeLayout, this.I);
            s51Var.setAlpha(0.0f);
            s51Var.setVisibility(4);
            g4Var.setAlpha(1.0f);
            g4Var.setVisibility(0);
            c4Var.setImageDrawable(this.m);
            frameLayout.setContentDescription(bd.M0(2131754839, null));
            relativeLayout.setX((popupWindow.getWidth() - r3.getWidth()) - i3);
            s51Var.setX(-relativeLayout.getX());
            frameLayout.setX(0.0f);
            g4Var.setX(0.0f);
            if (this.M) {
                relativeLayout.setY(i10);
                s51Var.setY(r3.getHeight() - relativeLayout.getHeight());
                frameLayout.setY(r3.getHeight() - size.getHeight());
                g4Var.setY(0.0f);
                return;
            }
            relativeLayout.setY(i10);
            s51Var.setY(0.0f);
            frameLayout.setY(0.0f);
            g4Var.setY(size.getHeight());
            return;
        }
        m(relativeLayout, this.J);
        s51Var.setAlpha(1.0f);
        s51Var.setVisibility(0);
        g4Var.setAlpha(0.0f);
        g4Var.setVisibility(4);
        c4Var.setImageDrawable(this.n);
        frameLayout.setContentDescription(bd.M0(2131754839, null));
        if (this.I == null) {
            relativeLayout.setX(i3);
            relativeLayout.setY(i10);
            s51Var.setX(0.0f);
            s51Var.setY(0.0f);
            return;
        }
        relativeLayout.setX((popupWindow.getWidth() - r3.getWidth()) - i3);
        s51Var.setX(0.0f);
        frameLayout.setX(r3.getWidth() - size.getWidth());
        g4Var.setX(r3.getWidth() - this.I.getWidth());
        if (this.M) {
            relativeLayout.setY((this.I.getHeight() + i10) - r3.getHeight());
            s51Var.setY(0.0f);
            frameLayout.setY(0.0f);
            g4Var.setY(r3.getHeight() - this.I.getHeight());
            return;
        }
        relativeLayout.setY(i10);
        s51Var.setY(0.0f);
        frameLayout.setY(0.0f);
        g4Var.setY(size.getHeight());
    }

    public final void n() {
        boolean z10 = this.N;
        c4 c4Var = this.k;
        FrameLayout frameLayout = this.i;
        if (z10) {
            frameLayout.setClickable(true);
            frameLayout.setOnClickListener(new x3(this, 0));
            c4Var.setClickable(false);
            c4Var.setOnClickListener(null);
            return;
        }
        frameLayout.setClickable(false);
        frameLayout.setOnClickListener(null);
        c4Var.setClickable(true);
        c4Var.setOnClickListener(new x3(this, 1));
    }

    public final void o(int i3) {
        if (this.I != null) {
            int c2 = c((i3 - this.H.getHeight()) / this.E);
            if (this.I.getHeight() != c2) {
                this.I = new Size(this.I.getWidth(), c2);
            }
            m(this.h, this.I);
            boolean z10 = this.N;
            RelativeLayout relativeLayout = this.f;
            if (z10) {
                m(relativeLayout, this.I);
                if (this.M) {
                    float height = this.I.getHeight() - c2;
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
        int i3;
        Size size = this.J;
        int i10 = 0;
        if (size != null) {
            i10 = Math.max(0, size.getWidth());
            i3 = Math.max(0, this.J.getHeight());
        } else {
            i3 = 0;
        }
        Size size2 = this.I;
        if (size2 != null) {
            i10 = Math.max(i10, size2.getWidth());
            i3 = Math.max(i3, this.I.getHeight());
        }
        int i11 = (this.d * 2) + i10;
        PopupWindow popupWindow = this.c;
        popupWindow.setWidth(i11);
        popupWindow.setHeight((this.e * 2) + i3);
        Size size3 = this.J;
        if (size3 == null || this.I == null) {
            return;
        }
        int width = size3.getWidth() - this.I.getWidth();
        int height = this.I.getHeight() - this.J.getHeight();
        this.O = (int) (Math.sqrt((height * height) + (width * width)) / this.f.getContext().getResources().getDisplayMetrics().density);
    }
}
