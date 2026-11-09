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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class uc extends fi.m {
    public boolean R0;
    public final ImageView S0;
    public boolean T0;
    public final ImageView U0;
    public final fi.l V0;
    public l60 W0;
    public final org.telegram.ui.ActionBar.u2 X0;
    public final ImageView Y0;
    public fi.m3 Z0;
    public int a1;
    public final int[] b1;
    public final fi.m3 c1;
    public final Runnable d1;
    public final RectF e1;
    public final Drawable f1;
    public final i6 g1;
    public final ic h1;
    public fh.g i1;
    public final w5 j1;
    public final w5 k1;
    public final w5 l1;
    public boolean m1;
    public boolean n1;
    public final xf o1;
    public boolean p1;
    public org.telegram.messenger.c20 q1;
    public boolean r1;

    public uc(Context context, FrameLayout frameLayout, tt0 tt0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.g6 g6Var, y9 y9Var, Runnable runnable) {
        super(context, frameLayout, tt0Var, frameLayout2, g6Var, y9Var);
        float f10;
        float f11;
        this.a1 = 0;
        this.b1 = new int[]{ConnectionsManager.DEFAULT_DATACENTER_ID, 3, 10, 30, 0};
        this.e1 = new RectF();
        i6 i6Var = new i6(false, false, false);
        this.g1 = i6Var;
        this.h1 = new ic(this);
        xq xqVar = xq.h;
        this.j1 = new w5(this, 0L, 350L, xqVar);
        this.k1 = new w5(this, 0L, 350L, xqVar);
        this.l1 = new w5(this, 0L, 350L, xqVar);
        this.o1 = new xf(this, 17);
        this.d1 = runnable;
        i6Var.w(org.telegram.messenger.g0.L(14.0f));
        i6Var.M = org.telegram.messenger.g0.q.x;
        i6Var.u(-1);
        boolean z9 = this instanceof org.telegram.ui.cp0;
        if (z9) {
            i6Var.t(org.telegram.messenger.id.M0(2131748325, null), true, true);
            this.f1 = context.getResources().getDrawable(R.drawable.menu_link_below);
        } else {
            i6Var.t(org.telegram.messenger.id.M0(2131748324, null), true, true);
            this.f1 = context.getResources().getDrawable(R.drawable.menu_link_above);
        }
        ImageView imageView = new ImageView(context);
        this.S0 = imageView;
        imageView.setImageResource(R.drawable.filled_add_photo);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.l6.h0(1090519039, 1, org.telegram.messenger.g0.L(18.0f)));
        C(false);
        int i7 = (z9 ? 48 : 80) | 3;
        float f12 = z9 ? 6.0f : 0.0f;
        if (z9) {
            f11 = 0.0f;
            f10 = 0.0f;
        } else {
            f10 = 6.0f;
            f11 = 0.0f;
        }
        float f13 = f11;
        addView(imageView, c8.ha.d(44, 44.0f, i7, 14.0f, f12, 0.0f, f10));
        ImageView imageView2 = new ImageView(context);
        this.U0 = imageView2;
        int i10 = 5;
        fi.l lVar = new fi.l(5);
        this.V0 = lVar;
        imageView2.setImageDrawable(lVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.l6.h0(1090519039, 1, org.telegram.messenger.g0.L(18.0f)));
        imageView2.setScaleType(scaleType);
        E(false, false);
        addView(imageView2, c8.ha.d(44, 44.0f, (z9 ? 48 : 80) | 5, 0.0f, z9 ? 6.0f : f13, 10.0f, z9 ? f13 : 6.0f));
        fi.m3 m3Var = new fi.m3(context, z9 ? 1 : 3);
        this.c1 = m3Var;
        m3Var.s(12.0f);
        m3Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(z9 ? 8.0f : f13), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(z9 ? f13 : 8.0f));
        m3Var.o(1.0f, -21.0f);
        m3Var.r(true);
        addView(m3Var, c8.ha.e(-1, 80, (z9 ? 48 : 80) | 5));
        ImageView imageView3 = new ImageView(context);
        this.Y0 = imageView3;
        org.telegram.ui.ActionBar.u2 u2Var = new org.telegram.ui.ActionBar.u2(context);
        this.X0 = u2Var;
        imageView3.setImageDrawable(u2Var);
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1140850689, PorterDuff.Mode.MULTIPLY));
        imageView3.setBackground(org.telegram.ui.ActionBar.l6.h0(1090519039, 1, org.telegram.messenger.g0.L(16.0f)));
        addView(imageView3, c8.ha.d(44, 44.0f, 53, 8.0f, 0.0f, 8.0f, 0.0f));
        imageView3.setContentDescription(org.telegram.messenger.id.M0(2131755006, null));
        c8.ka.a(imageView3);
        this.f.getEditText().addTextChangedListener(new ah.j(this, 14));
        imageView3.setVisibility(8);
        imageView3.setAlpha(f13);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        imageView3.setOnClickListener(new h0(this, i10));
        imageView2.setOnClickListener(new org.telegram.ui.ActionBar.l1(29, this, frameLayout));
    }

    public abstract void A();

    public abstract void B();

    public final void C(boolean z9) {
        this.R0 = z9;
        ImageView imageView = this.S0;
        imageView.animate().cancel();
        int i7 = 0;
        imageView.setVisibility(z9 ? 0 : 8);
        imageView.setAlpha(z9 ? 1.0f : 0.0f);
        imageView.setTranslationX(z9 ? 0.0f : org.telegram.messenger.g0.L(-8.0f));
        fi.g gVar = this.f;
        gVar.getEditText().setTranslationX(org.telegram.messenger.g0.W1(this.n0, getEditTextLeft() + org.telegram.messenger.g0.L(-26.0f), org.telegram.messenger.g0.L(2.0f)));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.getLayoutParams();
        if (this.R0 && this.T0) {
            i7 = 33;
        }
        marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(32 + i7);
        gVar.setLayoutParams(marginLayoutParams);
    }

    public final void D(boolean z9, boolean z10) {
        if (this.m1 == z9 && z10) {
            return;
        }
        this.m1 = z9;
        if (!z10) {
            this.k1.f(z9, true);
        }
        invalidate();
    }

    public final void E(boolean z9, boolean z10) {
        this.T0 = z9;
        ImageView imageView = this.U0;
        imageView.animate().cancel();
        int i7 = 0;
        if (z10) {
            imageView.setVisibility(0);
            imageView.animate().alpha(z9 ? 1.0f : 0.0f).translationX(z9 ? 0.0f : org.telegram.messenger.g0.L(8.0f)).withEndAction(new tc(this, z9, 1)).start();
        } else {
            imageView.setVisibility(z9 ? 0 : 8);
            imageView.setAlpha(z9 ? 1.0f : 0.0f);
            imageView.setTranslationX(z9 ? 0.0f : org.telegram.messenger.g0.L(8.0f));
        }
        fi.g gVar = this.f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.getLayoutParams();
        if (this.R0 && this.T0) {
            i7 = 33;
        }
        marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(32 + i7);
        gVar.setLayoutParams(marginLayoutParams);
    }

    public final void F(boolean z9) {
        if (this.r1 == z9) {
            return;
        }
        if (z9) {
            org.telegram.messenger.qp.s1(this.U).R1().b();
        }
        this.r1 = z9;
        ImageView imageView = this.Y0;
        imageView.setVisibility(0);
        imageView.animate().alpha(z9 ? 1.0f : 0.0f).scaleX(z9 ? 1.0f : 0.6f).scaleY(z9 ? 1.0f : 0.6f).setInterpolator(xq.h).setDuration(420L).withEndAction(new tc(this, z9, 0)).start();
        if (!z9) {
            fi.m3 m3Var = this.Z0;
            if (m3Var != null) {
                m3Var.f(true);
                this.Z0 = null;
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.u2 u2Var = this.X0;
        Objects.requireNonNull(u2Var);
        imageView.postDelayed(new j0(u2Var, 1), 220L);
        fi.m3 m3Var2 = this.Z0;
        if (m3Var2 != null) {
            m3Var2.f(true);
            this.Z0 = null;
        }
        if (org.telegram.messenger.qp.e1().getInt("aihintshown", 0) < 3) {
            fi.m3 m3Var3 = new fi.m3(getContext(), 3);
            this.Z0 = m3Var3;
            m3Var3.r(true);
            this.Z0.u(org.telegram.messenger.id.M0(2131754992, null));
            this.Z0.p(1.0f, ((-imageView.getWidth()) / 2.0f) + org.telegram.messenger.g0.L(4.0f));
            addView(this.Z0, c8.ha.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
            fi.m3 m3Var4 = this.Z0;
            m3Var4.q0 = new f(5, this, m3Var3);
            m3Var4.d = 4000L;
            m3Var4.w();
            org.telegram.messenger.qp.e1().edit().putInt("aihintshown", org.telegram.messenger.qp.e1().getInt("aihintshown", 0) + 1).apply();
        }
    }

    public abstract boolean G();

    public final void H(org.telegram.ui.ActionBar.g6 g6Var) {
        this.a = g6Var;
        this.h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.U5, false), PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(16.0f);
        int i7 = org.telegram.ui.ActionBar.l6.ng;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.l6.L(L, org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        xp xpVar = this.n;
        xpVar.a = L2;
        xpVar.invalidateSelf();
        this.V0.e(-1, org.telegram.ui.ActionBar.l6.w0(i7, g6Var), -1);
    }

    @Override // fi.m
    public final int a() {
        return 0;
    }

    @Override // fi.m
    public final void c(boolean z9) {
        int i7 = (z9 || !this.T0) ? 8 : 0;
        ImageView imageView = this.U0;
        imageView.setVisibility(i7);
        int i10 = (z9 || !this.R0) ? 8 : 0;
        ImageView imageView2 = this.S0;
        imageView2.setVisibility(i10);
        if (z9) {
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
        }
    }

    @Override // fi.m
    public final void d(boolean z9) {
        if (!z9) {
            this.U0.setVisibility(this.T0 ? 0 : 8);
            this.S0.setVisibility(this.R0 ? 0 : 8);
        }
        fi.m3 m3Var = this.c1;
        if (m3Var != null) {
            m3Var.f(true);
        }
    }

    @Override // fi.m, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        RectF rectF = this.z0;
        ImageView imageView = this.Y0;
        if (imageView != null) {
            imageView.setTranslationX(-org.telegram.messenger.g0.L((1.0f - this.n0) * 4.0f));
            boolean z9 = this instanceof org.telegram.ui.cp0;
            imageView.setTranslationY((Utilities.l((-this.j1.e(false, this.f.getEditText().getLineCount())) + 4.0f) * org.telegram.messenger.g0.L(3.0f) * (z9 ? 1 : -1)) + (z9 ? rectF.bottom - org.telegram.messenger.g0.L(44.0f) : rectF.top));
        }
        float f11 = this.k1.f(this.m1, true ^ G());
        float d = this.l1.d(this.n1);
        if (f11 > 0.0f) {
            float a10 = this.h1.a(0.03f);
            int L = org.telegram.messenger.g0.L((1.0f - this.n0) * 4.0f);
            boolean z10 = this instanceof org.telegram.ui.cp0;
            i6 i6Var = this.g1;
            RectF rectF2 = this.e1;
            if (z10) {
                f10 = 1.0f;
                rectF2.set(org.telegram.messenger.g0.L(7.0f) + L, rectF.bottom + org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.camera.q.b(i6Var.c(), org.telegram.messenger.g0.L(11.0f), d, org.telegram.messenger.g0.L(44.0f) + L), rectF.bottom + org.telegram.messenger.g0.L(42.0f));
            } else {
                f10 = 1.0f;
                rectF2.set(org.telegram.messenger.g0.L(7.0f) + L, rectF.top - org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.camera.q.b(i6Var.c(), org.telegram.messenger.g0.L(11.0f), d, org.telegram.messenger.g0.L(44.0f) + L), rectF.top - org.telegram.messenger.g0.L(10.0f));
            }
            if (f11 < f10) {
                canvas.saveLayerAlpha(rectF2, (int) (f11 * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
            canvas.clipRect(rectF2);
            dh.c cVar = this.g0;
            if (cVar != null) {
                if (this.i1 == null) {
                    fh.g c10 = cVar.c(this, null, false);
                    c10.p(c8.g0.i(this.a));
                    c10.q(org.telegram.messenger.g0.L(5.0f));
                    c10.r(org.telegram.messenger.g0.L(16.0f));
                    this.i1 = c10;
                }
                Rect rect = org.telegram.messenger.g0.Q;
                rectF2.round(rect);
                rect.inset(-org.telegram.messenger.g0.L(5.0f), -org.telegram.messenger.g0.L(5.0f));
                this.i1.setBounds(rect);
                this.i1.draw(canvas);
            }
            int L2 = (int) (rectF2.left + org.telegram.messenger.g0.L(9.0f));
            int centerY = (int) (rectF2.centerY() - org.telegram.messenger.g0.L(10.0f));
            int L3 = (int) (rectF2.left + org.telegram.messenger.g0.L(29.0f));
            int centerY2 = (int) (rectF2.centerY() + org.telegram.messenger.g0.L(10.0f));
            Drawable drawable = this.f1;
            drawable.setBounds(L2, centerY, L3, centerY2);
            drawable.draw(canvas);
            i6Var.o(rectF2.left + org.telegram.messenger.g0.L(37.0f), rectF2.top, rectF2.right, rectF2.bottom);
            i6Var.B = (int) (d * 255.0f);
            i6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // fi.m, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        RectF rectF = this.e1;
        w5 w5Var = this.k1;
        ic icVar = this.h1;
        if (action == 0) {
            icVar.c(w5Var.c > 0.0f && rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2) {
            if (icVar.i && (w5Var.c <= 0.0f || !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
                icVar.c(false);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && icVar.i) {
            if (motionEvent.getAction() == 1) {
                A();
                this.g1.t(org.telegram.messenger.id.M0(this instanceof org.telegram.ui.cp0 ? 2131748325 : 2131748324, null), true, true);
            }
            icVar.c(false);
            return true;
        }
        return icVar.i || super.dispatchTouchEvent(motionEvent);
    }

    @Override // fi.m
    public final boolean f(View view) {
        return view != this.c1;
    }

    @Override // fi.m
    public int getCaptionDefaultLimit() {
        return org.telegram.messenger.qp.s1(this.U).T4;
    }

    @Override // fi.m
    public int getCaptionLimit() {
        return org.telegram.messenger.p10.i(this.U).q() ? getCaptionPremiumLimit() : getCaptionDefaultLimit();
    }

    @Override // fi.m
    public int getCaptionPremiumLimit() {
        return org.telegram.messenger.qp.s1(this.U).U4;
    }

    @Override // fi.m
    public int getEditTextHeight() {
        return super.getEditTextHeight();
    }

    @Override // fi.m
    public int getEditTextLeft() {
        if (this.R0) {
            return org.telegram.messenger.g0.L(31.0f);
        }
        return 0;
    }

    @Override // fi.m
    public int getEditTextStyle() {
        return 3;
    }

    @Override // fi.m
    public final void r(int i7) {
        this.c1.setTranslationY(((-Math.min(org.telegram.messenger.g0.L(34.0f), i7)) - org.telegram.messenger.g0.L(10.0f)) * (this instanceof org.telegram.ui.cp0 ? -1.0f : 1.0f));
    }

    @Override // fi.m
    public final void s(int i7, int i10) {
        CharSequence text = getText();
        F((i10 <= 2 || text == null || TextUtils.isEmpty(text.toString().trim())) ? false : true);
        if (this.r1) {
            if ((i7 < 3) != (i10 < 3)) {
                invalidate();
            }
        }
    }

    public void setIsVideo(boolean z9) {
        this.p1 = z9;
    }

    public void setOnAddPhotoClick(View.OnClickListener onClickListener) {
        this.S0.setOnClickListener(onClickListener);
    }

    public void setOnTimerChange(org.telegram.messenger.c20 c20Var) {
        this.q1 = c20Var;
    }

    @Override // fi.m
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
    }

    public void setTimer(int i7) {
        this.a1 = i7;
        this.V0.d(i7 == Integer.MAX_VALUE ? 1 : Math.max(1, i7), this.a1 > 0, true);
        fi.m3 m3Var = this.c1;
        if (m3Var != null) {
            m3Var.f(true);
        }
    }

    @Override // fi.m
    public final void t() {
        Runnable runnable = this.d1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // fi.m
    public void u(float f10) {
        float f11 = 1.0f - f10;
        this.U0.setAlpha(f11);
        this.S0.setAlpha(f11);
    }

    @Override // fi.m
    public void x(int i7) {
        boolean z9 = this.l0;
        super.x(i7);
        if (z9 || !this.L.c()) {
            return;
        }
        B();
    }

    public final void z() {
        boolean z9;
        xf xfVar = this.o1;
        org.telegram.messenger.g0.r(xfVar);
        if (org.telegram.messenger.qp.s1(this.U).e7.getInt("movecaptionhint", 0) >= 24) {
            boolean z10 = org.telegram.messenger.r2.a;
            z9 = false;
        } else {
            z9 = true;
        }
        this.n1 = z9;
        if (z9) {
            SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(this.U).e7;
            sharedPreferences.edit().putInt("movecaptionhint", sharedPreferences.getInt("movecaptionhint", 0) + 1).apply();
            invalidate();
            org.telegram.messenger.g0.i3(xfVar, 5000L);
        }
    }
}
