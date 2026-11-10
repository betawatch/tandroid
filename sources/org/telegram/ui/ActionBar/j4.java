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
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.ui.e61;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class j4 {
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
    public final /* synthetic */ l4 Q;
    public final Context a;
    public final View b;
    public final PopupWindow c;
    public final int d;
    public final int e;
    public final RelativeLayout f;
    public final e61 g;
    public final i4 h;
    public final FrameLayout i;
    public final View j;
    public final f4 k;
    public final TextView l;
    public final Drawable m;
    public final Drawable n;
    public final AnimatedVectorDrawable o;
    public final AnimatedVectorDrawable p;
    public final ab.v q;
    public final h4 r;
    public final Interpolator s;
    public final Interpolator t;
    public final Interpolator u;
    public final AnimatorSet v;
    public final AnimatorSet w;
    public final AnimatorSet x;
    public final AnimationSet y;
    public final AnimationSet z;

    public j4(l4 l4Var, Context context, View view) {
        float f10;
        int i7;
        int i10;
        RelativeLayout relativeLayout;
        int w02;
        this.Q = l4Var;
        new m.f3(this, 17);
        this.F = true;
        this.L = new androidx.mediarouter.app.w(this, 8);
        this.P = -4;
        this.b = view;
        this.a = context;
        h6 h6Var = l4Var.n;
        int i11 = l4Var.i;
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
        dh.c cVar = l4Var.o;
        if (cVar != null) {
            fh.g c10 = cVar.c(relativeLayout2, null, true);
            gh.e eVar = new gh.e(h6Var);
            f10 = 1.0f;
            eVar.e = new g2.c(13);
            eVar.f(687865855, 687865855);
            eVar.e(352321535, 352321535);
            float N = org.telegram.messenger.g0.N(0.6666667f);
            float N2 = org.telegram.messenger.g0.N(0.6666667f);
            eVar.f = N;
            eVar.h = N2;
            c10.p(eVar);
            c10.r(org.telegram.messenger.g0.L(12.0f));
            relativeLayout2.setBackground(c10);
        } else {
            f10 = 1.0f;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float L2 = org.telegram.messenger.g0.L(12.0f);
            gradientDrawable.setCornerRadii(new float[]{L2, L2, L2, L2, L2, L2, L2, L2});
            if (i11 == 0) {
                i7 = m6.h5;
            } else {
                if (i11 == 2) {
                    gradientDrawable.setColor(-115203550);
                } else if (i11 == 1) {
                    i7 = m6.d6;
                }
                i7 = -1;
            }
            if (i7 >= 0) {
                gradientDrawable.setColor(-1);
            }
            relativeLayout2.setBackground(gradientDrawable);
            if (i7 >= 0) {
                t6.x(relativeLayout2, gradientDrawable, i7, h6Var, PorterDuff.Mode.SRC_IN);
            }
        }
        relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        relativeLayout2.setClipToOutline(true);
        this.f = relativeLayout2;
        fi.a5 a5Var = new fi.a5(relativeLayout2.getContext(), 2);
        PopupWindow popupWindow = new PopupWindow(a5Var);
        popupWindow.setClippingEnabled(false);
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setSplitTouchEnabled(true);
        relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        a5Var.addView(relativeLayout2);
        this.c = popupWindow;
        this.d = org.telegram.messenger.g0.L(16.0f);
        this.e = org.telegram.messenger.g0.L(8.0f);
        this.E = org.telegram.messenger.g0.L(48.0f);
        int L3 = org.telegram.messenger.g0.L(8.0f);
        this.r = new h4();
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
        f4 f4Var = new f4(this, context);
        this.k = f4Var;
        f4Var.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(48.0f)));
        f4Var.setPaddingRelative(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        f4Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        f4Var.setImageDrawable(mutate2);
        TextView textView = new TextView(context);
        this.l = textView;
        textView.setText(id.M0(2131753756, null));
        textView.setTextSize(1, 16.0f);
        textView.setAlpha(0.0f);
        View view2 = new View(context);
        this.j = view2;
        if (i11 == 0) {
            int i12 = m6.j5;
            w02 = m6.w0(i12, h6Var);
            relativeLayout = relativeLayout2;
            int i13 = m6.i6;
            i10 = L3;
            org.telegram.ui.Cells.y h02 = m6.h0(m6.w0(i13, h6Var), 1, -1);
            p6 M = t6.M(i13);
            f4Var.setBackground(h02);
            t6.j(f4Var, h02, null, M, h6Var);
            org.telegram.ui.Cells.y h03 = m6.h0(m6.w0(i13, h6Var), 2, -1);
            p6 M2 = t6.M(i13);
            frameLayout.setBackground(h03);
            t6.j(frameLayout, h03, null, M2, h6Var);
            t6.i(view2, t6.K(0.4f, i12), h6Var);
        } else {
            i10 = L3;
            relativeLayout = relativeLayout2;
            if (i11 == 2) {
                f4Var.setBackground(m6.h0(553648127, 1, -1));
                frameLayout.setBackground(m6.h0(553648127, 2, -1));
                view2.setBackgroundColor(553648127);
                w02 = -328966;
            } else {
                w02 = m6.w0(m6.G6, h6Var);
                int i14 = m6.i6;
                org.telegram.ui.Cells.y h04 = m6.h0(m6.w0(i14, h6Var), 1, -1);
                p6 M3 = t6.M(i14);
                f4Var.setBackground(h04);
                t6.j(f4Var, h04, null, M3, h6Var);
                org.telegram.ui.Cells.y h05 = m6.h0(m6.w0(i14, h6Var), 2, -1);
                p6 M4 = t6.M(i14);
                frameLayout.setBackground(h05);
                t6.j(frameLayout, h05, null, M4, h6Var);
                t6.h(m6.d7, view2, h6Var);
            }
        }
        int i15 = w02;
        mutate2.setTint(i15);
        mutate.setTint(i15);
        animatedVectorDrawable.setTint(i15);
        animatedVectorDrawable2.setTint(i15);
        textView.setTextColor(i15);
        if (i11 != 2) {
            int i16 = i11 == 0 ? m6.j5 : m6.G6;
            t6.U(textView, i16, h6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            t6.x(f4Var, mutate2, i16, h6Var, mode);
            t6.x(f4Var, mutate, i16, h6Var, mode);
            t6.x(f4Var, animatedVectorDrawable, i16, h6Var, mode);
            t6.x(f4Var, animatedVectorDrawable2, i16, h6Var, mode);
        }
        f4Var.setOnClickListener(new a4(this, 2));
        frameLayout.addView(f4Var, ha.e(-2, -2, 19));
        frameLayout.addView(textView, ha.d(-1, -2.0f, 19, 56.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.addView(view2, ha.a(-1.0f, f10 / org.telegram.messenger.g0.p, 55));
        f4Var.measure(0, 0);
        this.H = new Size(f4Var.getMeasuredWidth(), f4Var.getMeasuredHeight());
        this.g = new e61(9, context, this);
        ab.v vVar = new ab.v();
        vVar.e = this;
        vVar.c = context;
        vVar.a = i10;
        int L4 = org.telegram.messenger.g0.L(18.0f);
        vVar.b = L4;
        LinearLayout b10 = l4.b(this.Q, context, null, true, false, false);
        b10.setPadding(L4, 0, L4, 0);
        vVar.d = b10;
        this.q = vVar;
        final i4 i4Var = new i4(this);
        i4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        i4Var.setDivider(null);
        i4Var.setDividerHeight(0);
        e4 e4Var = new e4(this, context);
        i4Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(2.0f));
        i4Var.setClipToPadding(false);
        i4Var.setAdapter((ListAdapter) e4Var);
        i4Var.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: org.telegram.ui.ActionBar.b4
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view3, int i17, long j3) {
                j4 j4Var = j4.this;
                j4Var.getClass();
                MenuItem menuItem = (MenuItem) i4Var.getAdapter().getItem(i17);
                l4 l4Var2 = j4Var.Q;
                if (l4Var2.j == null || !l4.r.contains(Integer.valueOf(menuItem.getItemId()))) {
                    MenuItem.OnMenuItemClickListener onMenuItemClickListener = j4Var.K;
                    if (onMenuItemClickListener != null) {
                        onMenuItemClickListener.onMenuItemClick(menuItem);
                        return;
                    }
                    return;
                }
                int i18 = -j4Var.P;
                j4Var.P = i18;
                org.telegram.messenger.g0.G3(i18, view3, null);
                org.telegram.messenger.p2.D.a();
                l4Var2.j.run();
            }
        });
        this.h = i4Var;
        androidx.mediarouter.app.f0 f0Var = new androidx.mediarouter.app.f0(this, 2);
        AnimationSet animationSet = new AnimationSet(true);
        this.y = animationSet;
        animationSet.setAnimationListener(f0Var);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.z = animationSet2;
        animationSet2.setAnimationListener(f0Var);
        AnimatorSet animatorSet = new AnimatorSet();
        RelativeLayout relativeLayout3 = relativeLayout;
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout3, (Property<RelativeLayout, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        this.v = animatorSet;
        this.w = l4.a(relativeLayout3, qs.g2, new g4(this, 0));
        this.x = l4.a(relativeLayout3, 0, new g4(this, 1));
    }

    public static void a(j4 j4Var) {
        FrameLayout frameLayout = j4Var.i;
        RelativeLayout relativeLayout = j4Var.f;
        if (j4Var.M) {
            j4Var.g.setY(relativeLayout.getHeight() - j4Var.J.getHeight());
            frameLayout.setY(relativeLayout.getHeight() - frameLayout.getHeight());
            j4Var.h.setY(relativeLayout.getHeight() - j4Var.I.getHeight());
        }
    }

    public static boolean b(j4 j4Var) {
        AnimationSet animationSet = j4Var.z;
        AnimationSet animationSet2 = j4Var.y;
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
        i4 i4Var = this.h;
        int min = Math.min(4, Math.min(max, i4Var.getCount()));
        int count = i4Var.getCount();
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
        return i7 < 150 ? Math.max(qs.e3, 0) : i7 > 300 ? qs.X4 : qs.Z3;
    }

    public final boolean f() {
        return (this.F || this.G) ? false : true;
    }

    public final void g() {
        boolean z9 = this.N;
        Interpolator interpolator = this.t;
        i4 i4Var = this.h;
        e61 e61Var = this.g;
        h4 h4Var = this.r;
        Interpolator interpolator2 = this.s;
        FrameLayout frameLayout = this.i;
        RelativeLayout relativeLayout = this.f;
        f4 f4Var = this.k;
        if (z9) {
            AnimatedVectorDrawable animatedVectorDrawable = this.p;
            f4Var.setImageDrawable(animatedVectorDrawable);
            animatedVectorDrawable.start();
            int width = this.J.getWidth();
            int width2 = relativeLayout.getWidth();
            float x10 = relativeLayout.getX();
            c4 c4Var = new c4(this, width, width2, x10, relativeLayout.getWidth() + x10, 3);
            int i7 = 0;
            c4 c4Var2 = new c4(this, this.J.getHeight(), relativeLayout.getHeight(), relativeLayout.getY() + relativeLayout.getHeight(), i7);
            float x11 = frameLayout.getX();
            d4 d4Var = new d4(this, x11, (width2 + x11) - f4Var.getWidth(), width2, i7);
            c4Var.setInterpolator(interpolator2);
            c4Var.setDuration(e());
            c4Var2.setInterpolator(h4Var);
            c4Var2.setDuration(e());
            d4Var.setInterpolator(interpolator2);
            d4Var.setDuration(e());
            AnimationSet animationSet = this.z;
            animationSet.getAnimations().clear();
            animationSet.addAnimation(c4Var);
            animationSet.addAnimation(c4Var2);
            animationSet.addAnimation(d4Var);
            relativeLayout.startAnimation(animationSet);
            this.N = false;
            n();
            e61Var.animate().alpha(1.0f).withLayer().setInterpolator(this.u).setDuration(100L).start();
            i4Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(150L).start();
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable2 = this.o;
        f4Var.setImageDrawable(animatedVectorDrawable2);
        animatedVectorDrawable2.start();
        int width3 = this.I.getWidth();
        int height = this.I.getHeight();
        int width4 = relativeLayout.getWidth();
        int height2 = relativeLayout.getHeight();
        float y10 = relativeLayout.getY();
        float x12 = relativeLayout.getX();
        c4 c4Var3 = new c4(this, width3, width4, x12, x12 + relativeLayout.getWidth(), 1);
        c4 c4Var4 = new c4(this, height, height2, y10, 2);
        float x13 = frameLayout.getX();
        d4 d4Var2 = new d4(this, x13, f4Var.getWidth() + (x13 - width3), width4, 1);
        c4Var3.setInterpolator(h4Var);
        c4Var3.setDuration(e());
        c4Var4.setInterpolator(interpolator2);
        c4Var4.setDuration(e());
        d4Var2.setInterpolator(interpolator2);
        d4Var2.setDuration(e());
        AnimationSet animationSet2 = this.y;
        animationSet2.getAnimations().clear();
        animationSet2.addAnimation(c4Var3);
        animationSet2.addAnimation(c4Var4);
        animationSet2.addAnimation(d4Var2);
        relativeLayout.startAnimation(animationSet2);
        this.N = true;
        n();
        e61Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(250L).start();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.width = i4Var.getWidth();
        frameLayout.setLayoutParams(layoutParams);
        i4Var.setAlpha(1.0f);
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
        i4 i4Var = this.h;
        i4Var.awakenScrollBars();
        boolean z9 = this.N;
        PopupWindow popupWindow = this.c;
        f4 f4Var = this.k;
        int i7 = this.d;
        Size size = this.H;
        int i10 = this.e;
        e61 e61Var = this.g;
        RelativeLayout relativeLayout = this.f;
        if (z9) {
            m(relativeLayout, this.I);
            e61Var.setAlpha(0.0f);
            e61Var.setVisibility(4);
            i4Var.setAlpha(1.0f);
            i4Var.setVisibility(0);
            f4Var.setImageDrawable(this.m);
            frameLayout.setContentDescription(id.M0(2131754839, null));
            relativeLayout.setX((popupWindow.getWidth() - r3.getWidth()) - i7);
            e61Var.setX(-relativeLayout.getX());
            frameLayout.setX(0.0f);
            i4Var.setX(0.0f);
            if (this.M) {
                relativeLayout.setY(i10);
                e61Var.setY(r3.getHeight() - relativeLayout.getHeight());
                frameLayout.setY(r3.getHeight() - size.getHeight());
                i4Var.setY(0.0f);
                return;
            }
            relativeLayout.setY(i10);
            e61Var.setY(0.0f);
            frameLayout.setY(0.0f);
            i4Var.setY(size.getHeight());
            return;
        }
        m(relativeLayout, this.J);
        e61Var.setAlpha(1.0f);
        e61Var.setVisibility(0);
        i4Var.setAlpha(0.0f);
        i4Var.setVisibility(4);
        f4Var.setImageDrawable(this.n);
        frameLayout.setContentDescription(id.M0(2131754839, null));
        if (this.I == null) {
            relativeLayout.setX(i7);
            relativeLayout.setY(i10);
            e61Var.setX(0.0f);
            e61Var.setY(0.0f);
            return;
        }
        relativeLayout.setX((popupWindow.getWidth() - r3.getWidth()) - i7);
        e61Var.setX(0.0f);
        frameLayout.setX(r3.getWidth() - size.getWidth());
        i4Var.setX(r3.getWidth() - this.I.getWidth());
        if (this.M) {
            relativeLayout.setY((this.I.getHeight() + i10) - r3.getHeight());
            e61Var.setY(0.0f);
            frameLayout.setY(0.0f);
            i4Var.setY(r3.getHeight() - this.I.getHeight());
            return;
        }
        relativeLayout.setY(i10);
        e61Var.setY(0.0f);
        frameLayout.setY(0.0f);
        i4Var.setY(size.getHeight());
    }

    public final void n() {
        boolean z9 = this.N;
        f4 f4Var = this.k;
        FrameLayout frameLayout = this.i;
        if (z9) {
            frameLayout.setClickable(true);
            frameLayout.setOnClickListener(new a4(this, 0));
            f4Var.setClickable(false);
            f4Var.setOnClickListener(null);
            return;
        }
        frameLayout.setClickable(false);
        frameLayout.setOnClickListener(null);
        f4Var.setClickable(true);
        f4Var.setOnClickListener(new a4(this, 1));
    }

    public final void o(int i7) {
        if (this.I != null) {
            int c10 = c((i7 - this.H.getHeight()) / this.E);
            if (this.I.getHeight() != c10) {
                this.I = new Size(this.I.getWidth(), c10);
            }
            m(this.h, this.I);
            boolean z9 = this.N;
            RelativeLayout relativeLayout = this.f;
            if (z9) {
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
