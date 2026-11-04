package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import j$.util.Objects;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class sc extends gi.m {
    public boolean S0;
    public final ImageView T0;
    public boolean U0;
    public final ImageView V0;
    public final gi.l W0;
    public f60 X0;
    public final org.telegram.ui.ActionBar.s2 Y0;
    public final ImageView Z0;
    public gi.l3 a1;
    public int b1;
    public final int[] c1;
    public final gi.l3 d1;
    public final Runnable e1;
    public final RectF f1;
    public final Drawable g1;
    public final g6 h1;
    public final gc i1;
    public gh.g j1;
    public final u5 k1;
    public final u5 l1;
    public final u5 m1;
    public boolean n1;
    public boolean o1;
    public final vf p1;
    public boolean q1;
    public org.telegram.messenger.u10 r1;
    public boolean s1;

    public sc(Context context, FrameLayout frameLayout, qt0 qt0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.e6 e6Var, x9 x9Var, Runnable runnable) {
        super(context, frameLayout, qt0Var, frameLayout2, e6Var, x9Var);
        float f10;
        float f11;
        this.b1 = 0;
        this.c1 = new int[]{ConnectionsManager.DEFAULT_DATACENTER_ID, 3, 10, 30, 0};
        this.f1 = new RectF();
        g6 g6Var = new g6(false, false, false);
        this.h1 = g6Var;
        this.i1 = new gc(this);
        xq xqVar = xq.h;
        this.k1 = new u5(this, 0L, 350L, xqVar);
        this.l1 = new u5(this, 0L, 350L, xqVar);
        this.m1 = new u5(this, 0L, 350L, xqVar);
        this.p1 = new vf(this, 17);
        this.e1 = runnable;
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        g6Var.M = org.telegram.messenger.g0.q.x;
        g6Var.u(-1);
        boolean z10 = this instanceof org.telegram.ui.ro0;
        if (z10) {
            g6Var.t(org.telegram.messenger.bd.M0(2131748333, null), true, true);
            this.g1 = context.getResources().getDrawable(R.drawable.menu_link_below);
        } else {
            g6Var.t(org.telegram.messenger.bd.M0(2131748332, null), true, true);
            this.g1 = context.getResources().getDrawable(R.drawable.menu_link_above);
        }
        ImageView imageView = new ImageView(context);
        this.T0 = imageView;
        imageView.setImageResource(R.drawable.filled_add_photo);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, org.telegram.messenger.g0.L(18.0f)));
        C(false);
        int i3 = (z10 ? 48 : 80) | 3;
        float f12 = z10 ? 6.0f : 0.0f;
        if (z10) {
            f11 = 0.0f;
            f10 = 0.0f;
        } else {
            f10 = 6.0f;
            f11 = 0.0f;
        }
        float f13 = f11;
        addView(imageView, b8.mf.d(44, 44.0f, i3, 14.0f, f12, 0.0f, f10));
        ImageView imageView2 = new ImageView(context);
        this.V0 = imageView2;
        int i10 = 5;
        gi.l lVar = new gi.l(5);
        this.W0 = lVar;
        imageView2.setImageDrawable(lVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, org.telegram.messenger.g0.L(18.0f)));
        imageView2.setScaleType(scaleType);
        E(false, false);
        addView(imageView2, b8.mf.d(44, 44.0f, (z10 ? 48 : 80) | 5, 0.0f, z10 ? 6.0f : f13, 10.0f, z10 ? f13 : 6.0f));
        gi.l3 l3Var = new gi.l3(context, z10 ? 1 : 3);
        this.d1 = l3Var;
        l3Var.s(12.0f);
        l3Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(z10 ? 8.0f : f13), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(z10 ? f13 : 8.0f));
        l3Var.o(1.0f, -21.0f);
        l3Var.r(true);
        addView(l3Var, b8.mf.e(-1, 80, (z10 ? 48 : 80) | 5));
        ImageView imageView3 = new ImageView(context);
        this.Z0 = imageView3;
        org.telegram.ui.ActionBar.s2 s2Var = new org.telegram.ui.ActionBar.s2(context);
        this.Y0 = s2Var;
        imageView3.setImageDrawable(s2Var);
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1140850689, PorterDuff.Mode.MULTIPLY));
        imageView3.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, org.telegram.messenger.g0.L(16.0f)));
        addView(imageView3, b8.mf.d(44, 44.0f, 53, 8.0f, 0.0f, 8.0f, 0.0f));
        imageView3.setContentDescription(org.telegram.messenger.bd.M0(2131755006, null));
        b8.pf.a(imageView3);
        this.f.getEditText().addTextChangedListener(new bh.h(this, 14));
        imageView3.setVisibility(8);
        imageView3.setAlpha(f13);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        imageView3.setOnClickListener(new f0(this, i10));
        imageView2.setOnClickListener(new q2(i10, this, frameLayout));
    }

    public abstract void A();

    public abstract void B();

    public final void C(boolean z10) {
        this.S0 = z10;
        ImageView imageView = this.T0;
        imageView.animate().cancel();
        int i3 = 0;
        imageView.setVisibility(z10 ? 0 : 8);
        imageView.setAlpha(z10 ? 1.0f : 0.0f);
        imageView.setTranslationX(z10 ? 0.0f : org.telegram.messenger.g0.L(-8.0f));
        gi.g gVar = this.f;
        gVar.getEditText().setTranslationX(org.telegram.messenger.g0.W1(this.o0, getEditTextLeft() + org.telegram.messenger.g0.L(-26.0f), org.telegram.messenger.g0.L(2.0f)));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.getLayoutParams();
        if (this.S0 && this.U0) {
            i3 = 33;
        }
        marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(32 + i3);
        gVar.setLayoutParams(marginLayoutParams);
    }

    public final void D(boolean z10, boolean z11) {
        if (this.n1 == z10 && z11) {
            return;
        }
        this.n1 = z10;
        if (!z11) {
            this.l1.f(z10, true);
        }
        invalidate();
    }

    public final void E(boolean z10, boolean z11) {
        this.U0 = z10;
        ImageView imageView = this.V0;
        imageView.animate().cancel();
        int i3 = 0;
        if (z11) {
            imageView.setVisibility(0);
            imageView.animate().alpha(z10 ? 1.0f : 0.0f).translationX(z10 ? 0.0f : org.telegram.messenger.g0.L(8.0f)).withEndAction(new rc(this, z10, 1)).start();
        } else {
            imageView.setVisibility(z10 ? 0 : 8);
            imageView.setAlpha(z10 ? 1.0f : 0.0f);
            imageView.setTranslationX(z10 ? 0.0f : org.telegram.messenger.g0.L(8.0f));
        }
        gi.g gVar = this.f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.getLayoutParams();
        if (this.S0 && this.U0) {
            i3 = 33;
        }
        marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(32 + i3);
        gVar.setLayoutParams(marginLayoutParams);
    }

    public final void F(boolean z10) {
        if (this.s1 == z10) {
            return;
        }
        if (z10) {
            org.telegram.messenger.hp.s1(this.V).R1().b();
        }
        this.s1 = z10;
        ImageView imageView = this.Z0;
        imageView.setVisibility(0);
        imageView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setInterpolator(xq.h).setDuration(420L).withEndAction(new rc(this, z10, 0)).start();
        if (!z10) {
            gi.l3 l3Var = this.a1;
            if (l3Var != null) {
                l3Var.f(true);
                this.a1 = null;
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.s2 s2Var = this.Y0;
        Objects.requireNonNull(s2Var);
        imageView.postDelayed(new h0(s2Var, 1), 220L);
        gi.l3 l3Var2 = this.a1;
        if (l3Var2 != null) {
            l3Var2.f(true);
            this.a1 = null;
        }
        if (org.telegram.messenger.hp.e1().getInt("aihintshown", 0) < 3) {
            gi.l3 l3Var3 = new gi.l3(getContext(), 3);
            this.a1 = l3Var3;
            l3Var3.r(true);
            this.a1.u(org.telegram.messenger.bd.M0(2131754992, null));
            this.a1.p(1.0f, ((-imageView.getWidth()) / 2.0f) + org.telegram.messenger.g0.L(4.0f));
            addView(this.a1, b8.mf.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
            gi.l3 l3Var4 = this.a1;
            l3Var4.r0 = new org.telegram.ui.lo(10, this, l3Var3);
            l3Var4.d = 4000L;
            l3Var4.w();
            org.telegram.messenger.hp.e1().edit().putInt("aihintshown", org.telegram.messenger.hp.e1().getInt("aihintshown", 0) + 1).apply();
        }
    }

    public abstract boolean G();

    public final void H(org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = e6Var;
        this.h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.U5, false), PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(16.0f);
        int i3 = org.telegram.ui.ActionBar.k6.ng;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        xp xpVar = this.n;
        xpVar.a = L2;
        xpVar.invalidateSelf();
        this.W0.e(-1, org.telegram.ui.ActionBar.k6.w0(i3, e6Var), -1);
    }

    @Override // gi.m
    public final int a() {
        return 0;
    }

    @Override // gi.m
    public final void c(boolean z10) {
        int i3 = (z10 || !this.U0) ? 8 : 0;
        ImageView imageView = this.V0;
        imageView.setVisibility(i3);
        int i10 = (z10 || !this.S0) ? 8 : 0;
        ImageView imageView2 = this.T0;
        imageView2.setVisibility(i10);
        if (z10) {
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
        }
    }

    @Override // gi.m
    public final void d(boolean z10) {
        if (!z10) {
            this.V0.setVisibility(this.U0 ? 0 : 8);
            this.T0.setVisibility(this.S0 ? 0 : 8);
        }
        gi.l3 l3Var = this.d1;
        if (l3Var != null) {
            l3Var.f(true);
        }
    }

    @Override // gi.m, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        RectF rectF = this.A0;
        ImageView imageView = this.Z0;
        if (imageView != null) {
            imageView.setTranslationX(-org.telegram.messenger.g0.L((1.0f - this.o0) * 4.0f));
            boolean z10 = this instanceof org.telegram.ui.ro0;
            imageView.setTranslationY((Utilities.l((-this.k1.e(false, this.f.getEditText().getLineCount())) + 4.0f) * org.telegram.messenger.g0.L(3.0f) * (z10 ? 1 : -1)) + (z10 ? rectF.bottom - org.telegram.messenger.g0.L(44.0f) : rectF.top));
        }
        float f11 = this.l1.f(this.n1, true ^ G());
        float d = this.m1.d(this.o1);
        if (f11 > 0.0f) {
            float a10 = this.i1.a(0.03f);
            int L = org.telegram.messenger.g0.L((1.0f - this.o0) * 4.0f);
            boolean z11 = this instanceof org.telegram.ui.ro0;
            g6 g6Var = this.h1;
            RectF rectF2 = this.f1;
            if (z11) {
                f10 = 1.0f;
                rectF2.set(org.telegram.messenger.g0.L(7.0f) + L, rectF.bottom + org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.camera.q.b(g6Var.c(), org.telegram.messenger.g0.L(11.0f), d, org.telegram.messenger.g0.L(44.0f) + L), rectF.bottom + org.telegram.messenger.g0.L(42.0f));
            } else {
                f10 = 1.0f;
                rectF2.set(org.telegram.messenger.g0.L(7.0f) + L, rectF.top - org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.camera.q.b(g6Var.c(), org.telegram.messenger.g0.L(11.0f), d, org.telegram.messenger.g0.L(44.0f) + L), rectF.top - org.telegram.messenger.g0.L(10.0f));
            }
            if (f11 < f10) {
                canvas.saveLayerAlpha(rectF2, (int) (f11 * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
            canvas.clipRect(rectF2);
            eh.c cVar = this.h0;
            if (cVar != null) {
                if (this.j1 == null) {
                    gh.g c2 = cVar.c(this, null, false);
                    c2.p(b8.cd.i(this.a));
                    c2.q(org.telegram.messenger.g0.L(5.0f));
                    c2.r(org.telegram.messenger.g0.L(16.0f));
                    this.j1 = c2;
                }
                Rect rect = org.telegram.messenger.g0.Q;
                rectF2.round(rect);
                rect.inset(-org.telegram.messenger.g0.L(5.0f), -org.telegram.messenger.g0.L(5.0f));
                this.j1.setBounds(rect);
                this.j1.draw(canvas);
            }
            int L2 = (int) (rectF2.left + org.telegram.messenger.g0.L(9.0f));
            int centerY = (int) (rectF2.centerY() - org.telegram.messenger.g0.L(10.0f));
            int L3 = (int) (rectF2.left + org.telegram.messenger.g0.L(29.0f));
            int centerY2 = (int) (rectF2.centerY() + org.telegram.messenger.g0.L(10.0f));
            Drawable drawable = this.g1;
            drawable.setBounds(L2, centerY, L3, centerY2);
            drawable.draw(canvas);
            g6Var.o(rectF2.left + org.telegram.messenger.g0.L(37.0f), rectF2.top, rectF2.right, rectF2.bottom);
            g6Var.B = (int) (d * 255.0f);
            g6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // gi.m, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        RectF rectF = this.f1;
        u5 u5Var = this.l1;
        gc gcVar = this.i1;
        if (action == 0) {
            gcVar.c(u5Var.c > 0.0f && rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2) {
            if (gcVar.i && (u5Var.c <= 0.0f || !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
                gcVar.c(false);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && gcVar.i) {
            if (motionEvent.getAction() == 1) {
                A();
                this.h1.t(org.telegram.messenger.bd.M0(this instanceof org.telegram.ui.ro0 ? 2131748333 : 2131748332, null), true, true);
            }
            gcVar.c(false);
            return true;
        }
        return gcVar.i || super.dispatchTouchEvent(motionEvent);
    }

    @Override // gi.m
    public final boolean f(View view) {
        return view != this.d1;
    }

    @Override // gi.m
    public int getCaptionDefaultLimit() {
        return org.telegram.messenger.hp.s1(this.V).T4;
    }

    @Override // gi.m
    public int getCaptionLimit() {
        return org.telegram.messenger.h10.i(this.V).q() ? getCaptionPremiumLimit() : getCaptionDefaultLimit();
    }

    @Override // gi.m
    public int getCaptionPremiumLimit() {
        return org.telegram.messenger.hp.s1(this.V).U4;
    }

    @Override // gi.m
    public int getEditTextHeight() {
        return super.getEditTextHeight();
    }

    @Override // gi.m
    public int getEditTextLeft() {
        if (this.S0) {
            return org.telegram.messenger.g0.L(31.0f);
        }
        return 0;
    }

    @Override // gi.m
    public int getEditTextStyle() {
        return 3;
    }

    @Override // gi.m
    public final void r(int i3) {
        this.d1.setTranslationY(((-Math.min(org.telegram.messenger.g0.L(34.0f), i3)) - org.telegram.messenger.g0.L(10.0f)) * (this instanceof org.telegram.ui.ro0 ? -1.0f : 1.0f));
    }

    @Override // gi.m
    public final void s(int i3, int i10) {
        CharSequence text = getText();
        F((i10 <= 2 || text == null || TextUtils.isEmpty(text.toString().trim())) ? false : true);
        if (this.s1) {
            if ((i3 < 3) != (i10 < 3)) {
                invalidate();
            }
        }
    }

    public void setIsVideo(boolean z10) {
        this.q1 = z10;
    }

    public void setOnAddPhotoClick(View.OnClickListener onClickListener) {
        this.T0.setOnClickListener(onClickListener);
    }

    public void setOnTimerChange(org.telegram.messenger.u10 u10Var) {
        this.r1 = u10Var;
    }

    @Override // gi.m
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
    }

    public void setTimer(int i3) {
        this.b1 = i3;
        this.W0.d(i3 == Integer.MAX_VALUE ? 1 : Math.max(1, i3), this.b1 > 0, true);
        gi.l3 l3Var = this.d1;
        if (l3Var != null) {
            l3Var.f(true);
        }
    }

    @Override // gi.m
    public final void t() {
        Runnable runnable = this.e1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // gi.m
    public void u(float f10) {
        float f11 = 1.0f - f10;
        this.V0.setAlpha(f11);
        this.T0.setAlpha(f11);
    }

    @Override // gi.m
    public void x(int i3) {
        boolean z10 = this.m0;
        super.x(i3);
        if (z10 || !this.M.c()) {
            return;
        }
        B();
    }

    public final void z() {
        boolean z10;
        vf vfVar = this.p1;
        org.telegram.messenger.g0.r(vfVar);
        if (org.telegram.messenger.hp.s1(this.V).e7.getInt("movecaptionhint", 0) >= 24) {
            boolean z11 = org.telegram.messenger.r2.a;
            z10 = false;
        } else {
            z10 = true;
        }
        this.o1 = z10;
        if (z10) {
            SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(this.V).e7;
            sharedPreferences.edit().putInt("movecaptionhint", sharedPreferences.getInt("movecaptionhint", 0) + 1).apply();
            invalidate();
            org.telegram.messenger.g0.i3(vfVar, 5000L);
        }
    }
}
