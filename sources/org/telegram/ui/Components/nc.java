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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class nc extends vh.k {
    public boolean R0;
    public final ImageView S0;
    public boolean T0;
    public final ImageView U0;
    public final vh.j V0;
    public z60 W0;
    public final org.telegram.ui.ActionBar.y2 X0;
    public final ImageView Y0;
    public vh.p2 Z0;
    public int a1;
    public final int[] b1;
    public final vh.p2 c1;
    public final Runnable d1;
    public final RectF e1;
    public final Drawable f1;
    public final e6 g1;
    public final dc h1;
    public vg.f i1;
    public final t5 j1;
    public final t5 k1;
    public final t5 l1;
    public boolean m1;
    public boolean n1;
    public final tf o1;
    public boolean p1;
    public org.telegram.messenger.q20 q1;
    public boolean r1;

    public nc(Context context, FrameLayout frameLayout, uu0 uu0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.p6 p6Var, s9 s9Var, Runnable runnable) {
        super(context, frameLayout, uu0Var, frameLayout2, p6Var, s9Var);
        float f7;
        float f10;
        this.a1 = 0;
        this.b1 = new int[]{ConnectionsManager.DEFAULT_DATACENTER_ID, 3, 10, 30, 0};
        this.e1 = new RectF();
        e6 e6Var = new e6(false, false, false);
        this.g1 = e6Var;
        this.h1 = new dc(this);
        gr grVar = gr.h;
        this.j1 = new t5(this, 0L, 350L, grVar);
        this.k1 = new t5(this, 0L, 350L, grVar);
        this.l1 = new t5(this, 0L, 350L, grVar);
        this.o1 = new tf(this, 18);
        this.d1 = runnable;
        e6Var.w(org.telegram.messenger.i0.L(14.0f));
        e6Var.M = org.telegram.messenger.i0.q.x;
        e6Var.u(-1);
        boolean z10 = this instanceof org.telegram.ui.kq0;
        if (z10) {
            e6Var.t(org.telegram.messenger.cd.L0(2131748340, null), true, true);
            this.f1 = context.getResources().getDrawable(R.drawable.menu_link_below);
        } else {
            e6Var.t(org.telegram.messenger.cd.L0(2131748339, null), true, true);
            this.f1 = context.getResources().getDrawable(R.drawable.menu_link_above);
        }
        ImageView imageView = new ImageView(context);
        this.S0 = imageView;
        imageView.setImageResource(R.drawable.filled_add_photo);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.t6.h0(1090519039, 1, org.telegram.messenger.i0.L(18.0f)));
        C(false);
        int i10 = (z10 ? 48 : 80) | 3;
        float f11 = z10 ? 6.0f : 0.0f;
        if (z10) {
            f10 = 0.0f;
            f7 = 0.0f;
        } else {
            f7 = 6.0f;
            f10 = 0.0f;
        }
        float f12 = f10;
        addView(imageView, w7.b6.d(44, 44.0f, i10, 14.0f, f11, 0.0f, f7));
        ImageView imageView2 = new ImageView(context);
        this.U0 = imageView2;
        int i11 = 5;
        vh.j jVar = new vh.j(5);
        this.V0 = jVar;
        imageView2.setImageDrawable(jVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.t6.h0(1090519039, 1, org.telegram.messenger.i0.L(18.0f)));
        imageView2.setScaleType(scaleType);
        E(false, false);
        addView(imageView2, w7.b6.d(44, 44.0f, (z10 ? 48 : 80) | 5, 0.0f, z10 ? 6.0f : f12, 10.0f, z10 ? f12 : 6.0f));
        vh.p2 p2Var = new vh.p2(context, z10 ? 1 : 3);
        this.c1 = p2Var;
        p2Var.q(12.0f);
        p2Var.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(z10 ? 8.0f : f12), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(z10 ? f12 : 8.0f));
        p2Var.l(1.0f, -21.0f);
        p2Var.p(true);
        addView(p2Var, w7.b6.e(-1, 80, (z10 ? 48 : 80) | 5));
        ImageView imageView3 = new ImageView(context);
        this.Y0 = imageView3;
        org.telegram.ui.ActionBar.y2 y2Var = new org.telegram.ui.ActionBar.y2(context);
        this.X0 = y2Var;
        imageView3.setImageDrawable(y2Var);
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1140850689, PorterDuff.Mode.MULTIPLY));
        imageView3.setBackground(org.telegram.ui.ActionBar.t6.h0(1090519039, 1, org.telegram.messenger.i0.L(16.0f)));
        addView(imageView3, w7.b6.d(44, 44.0f, 53, 8.0f, 0.0f, 8.0f, 0.0f));
        imageView3.setContentDescription(org.telegram.messenger.cd.L0(2131755006, null));
        w7.e6.a(imageView3);
        this.f.getEditText().addTextChangedListener(new ag.a1(this, 9));
        imageView3.setVisibility(8);
        imageView3.setAlpha(f12);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        imageView3.setOnClickListener(new h0(this, i11));
        imageView2.setOnClickListener(new org.telegram.ui.ud(21, this, frameLayout));
    }

    public abstract void A();

    public abstract void B();

    public final void C(boolean z10) {
        this.R0 = z10;
        ImageView imageView = this.S0;
        imageView.animate().cancel();
        int i10 = 0;
        imageView.setVisibility(z10 ? 0 : 8);
        imageView.setAlpha(z10 ? 1.0f : 0.0f);
        imageView.setTranslationX(z10 ? 0.0f : org.telegram.messenger.i0.L(-8.0f));
        vh.f fVar = this.f;
        fVar.getEditText().setTranslationX(org.telegram.messenger.i0.W1(this.n0, getEditTextLeft() + org.telegram.messenger.i0.L(-26.0f), org.telegram.messenger.i0.L(2.0f)));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fVar.getLayoutParams();
        if (this.R0 && this.T0) {
            i10 = 33;
        }
        marginLayoutParams.rightMargin = org.telegram.messenger.i0.L(32 + i10);
        fVar.setLayoutParams(marginLayoutParams);
    }

    public final void D(boolean z10, boolean z11) {
        if (this.m1 == z10 && z11) {
            return;
        }
        this.m1 = z10;
        if (!z11) {
            this.k1.f(z10, true);
        }
        invalidate();
    }

    public final void E(boolean z10, boolean z11) {
        this.T0 = z10;
        ImageView imageView = this.U0;
        imageView.animate().cancel();
        int i10 = 0;
        if (z11) {
            imageView.setVisibility(0);
            imageView.animate().alpha(z10 ? 1.0f : 0.0f).translationX(z10 ? 0.0f : org.telegram.messenger.i0.L(8.0f)).withEndAction(new mc(this, z10, 1)).start();
        } else {
            imageView.setVisibility(z10 ? 0 : 8);
            imageView.setAlpha(z10 ? 1.0f : 0.0f);
            imageView.setTranslationX(z10 ? 0.0f : org.telegram.messenger.i0.L(8.0f));
        }
        vh.f fVar = this.f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fVar.getLayoutParams();
        if (this.R0 && this.T0) {
            i10 = 33;
        }
        marginLayoutParams.rightMargin = org.telegram.messenger.i0.L(32 + i10);
        fVar.setLayoutParams(marginLayoutParams);
    }

    public final void F(boolean z10) {
        if (this.r1 == z10) {
            return;
        }
        if (z10) {
            org.telegram.messenger.vp.r1(this.U).Q1().b();
        }
        this.r1 = z10;
        ImageView imageView = this.Y0;
        imageView.setVisibility(0);
        imageView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setInterpolator(gr.h).setDuration(420L).withEndAction(new mc(this, z10, 0)).start();
        if (!z10) {
            vh.p2 p2Var = this.Z0;
            if (p2Var != null) {
                p2Var.e(true);
                this.Z0 = null;
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.y2 y2Var = this.X0;
        Objects.requireNonNull(y2Var);
        imageView.postDelayed(new j0(y2Var, 1), 220L);
        vh.p2 p2Var2 = this.Z0;
        if (p2Var2 != null) {
            p2Var2.e(true);
            this.Z0 = null;
        }
        if (org.telegram.messenger.vp.d1().getInt("aihintshown", 0) < 3) {
            vh.p2 p2Var3 = new vh.p2(getContext(), 3);
            this.Z0 = p2Var3;
            p2Var3.p(true);
            this.Z0.s(org.telegram.messenger.cd.L0(2131754992, null));
            this.Z0.m(1.0f, ((-imageView.getWidth()) / 2.0f) + org.telegram.messenger.i0.L(4.0f));
            addView(this.Z0, w7.b6.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
            vh.p2 p2Var4 = this.Z0;
            p2Var4.l0 = new org.telegram.ui.zg(29, this, p2Var3);
            p2Var4.d = 4000L;
            p2Var4.u();
            org.telegram.messenger.vp.d1().edit().putInt("aihintshown", org.telegram.messenger.vp.d1().getInt("aihintshown", 0) + 1).apply();
        }
    }

    public abstract boolean G();

    public final void H(org.telegram.ui.ActionBar.p6 p6Var) {
        this.a = p6Var;
        this.h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.U5, false), PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.i0.L(16.0f);
        int i10 = org.telegram.ui.ActionBar.t6.ng;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        eq eqVar = this.n;
        eqVar.a = L2;
        eqVar.invalidateSelf();
        this.V0.e(-1, org.telegram.ui.ActionBar.t6.w0(i10, p6Var), -1);
    }

    @Override // vh.k
    public final int a() {
        return 0;
    }

    @Override // vh.k
    public final void c(boolean z10) {
        int i10 = (z10 || !this.T0) ? 8 : 0;
        ImageView imageView = this.U0;
        imageView.setVisibility(i10);
        int i11 = (z10 || !this.R0) ? 8 : 0;
        ImageView imageView2 = this.S0;
        imageView2.setVisibility(i11);
        if (z10) {
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
        }
    }

    @Override // vh.k
    public final void d(boolean z10) {
        if (!z10) {
            this.U0.setVisibility(this.T0 ? 0 : 8);
            this.S0.setVisibility(this.R0 ? 0 : 8);
        }
        vh.p2 p2Var = this.c1;
        if (p2Var != null) {
            p2Var.e(true);
        }
    }

    @Override // vh.k, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        RectF rectF = this.z0;
        ImageView imageView = this.Y0;
        if (imageView != null) {
            imageView.setTranslationX(-org.telegram.messenger.i0.L((1.0f - this.n0) * 4.0f));
            boolean z10 = this instanceof org.telegram.ui.kq0;
            imageView.setTranslationY((Utilities.l((-this.j1.e(false, this.f.getEditText().getLineCount())) + 4.0f) * org.telegram.messenger.i0.L(3.0f) * (z10 ? 1 : -1)) + (z10 ? rectF.bottom - org.telegram.messenger.i0.L(44.0f) : rectF.top));
        }
        float f10 = this.k1.f(this.m1, true ^ G());
        float d = this.l1.d(this.n1);
        if (f10 > 0.0f) {
            float a2 = this.h1.a(0.03f);
            int L = org.telegram.messenger.i0.L((1.0f - this.n0) * 4.0f);
            boolean z11 = this instanceof org.telegram.ui.kq0;
            e6 e6Var = this.g1;
            RectF rectF2 = this.e1;
            if (z11) {
                f7 = 1.0f;
                rectF2.set(org.telegram.messenger.i0.L(7.0f) + L, rectF.bottom + org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.z20.b(e6Var.c(), org.telegram.messenger.i0.L(11.0f), d, org.telegram.messenger.i0.L(44.0f) + L), rectF.bottom + org.telegram.messenger.i0.L(42.0f));
            } else {
                f7 = 1.0f;
                rectF2.set(org.telegram.messenger.i0.L(7.0f) + L, rectF.top - org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.z20.b(e6Var.c(), org.telegram.messenger.i0.L(11.0f), d, org.telegram.messenger.i0.L(44.0f) + L), rectF.top - org.telegram.messenger.i0.L(10.0f));
            }
            if (f10 < f7) {
                canvas.saveLayerAlpha(rectF2, (int) (f10 * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.scale(a2, a2, rectF2.centerX(), rectF2.centerY());
            canvas.clipRect(rectF2);
            tg.b bVar = this.g0;
            if (bVar != null) {
                if (this.i1 == null) {
                    vg.f c10 = bVar.c(this, null, false);
                    c10.o(w7.b9.i(this.a));
                    c10.p(org.telegram.messenger.i0.L(5.0f));
                    c10.q(org.telegram.messenger.i0.L(16.0f));
                    this.i1 = c10;
                }
                Rect rect = org.telegram.messenger.i0.Q;
                rectF2.round(rect);
                rect.inset(-org.telegram.messenger.i0.L(5.0f), -org.telegram.messenger.i0.L(5.0f));
                this.i1.setBounds(rect);
                this.i1.draw(canvas);
            }
            int L2 = (int) (rectF2.left + org.telegram.messenger.i0.L(9.0f));
            int centerY = (int) (rectF2.centerY() - org.telegram.messenger.i0.L(10.0f));
            int L3 = (int) (rectF2.left + org.telegram.messenger.i0.L(29.0f));
            int centerY2 = (int) (rectF2.centerY() + org.telegram.messenger.i0.L(10.0f));
            Drawable drawable = this.f1;
            drawable.setBounds(L2, centerY, L3, centerY2);
            drawable.draw(canvas);
            e6Var.o(rectF2.left + org.telegram.messenger.i0.L(37.0f), rectF2.top, rectF2.right, rectF2.bottom);
            e6Var.B = (int) (d * 255.0f);
            e6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // vh.k, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        RectF rectF = this.e1;
        t5 t5Var = this.k1;
        dc dcVar = this.h1;
        if (action == 0) {
            dcVar.c(t5Var.c > 0.0f && rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2) {
            if (dcVar.i && (t5Var.c <= 0.0f || !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
                dcVar.c(false);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && dcVar.i) {
            if (motionEvent.getAction() == 1) {
                A();
                this.g1.t(org.telegram.messenger.cd.L0(this instanceof org.telegram.ui.kq0 ? 2131748340 : 2131748339, null), true, true);
            }
            dcVar.c(false);
            return true;
        }
        return dcVar.i || super.dispatchTouchEvent(motionEvent);
    }

    @Override // vh.k
    public final boolean f(View view) {
        return view != this.c1;
    }

    @Override // vh.k
    public int getCaptionDefaultLimit() {
        return org.telegram.messenger.vp.r1(this.U).U4;
    }

    @Override // vh.k
    public int getCaptionLimit() {
        return org.telegram.messenger.d20.i(this.U).q() ? getCaptionPremiumLimit() : getCaptionDefaultLimit();
    }

    @Override // vh.k
    public int getCaptionPremiumLimit() {
        return org.telegram.messenger.vp.r1(this.U).V4;
    }

    @Override // vh.k
    public int getEditTextHeight() {
        return super.getEditTextHeight();
    }

    @Override // vh.k
    public int getEditTextLeft() {
        if (this.R0) {
            return org.telegram.messenger.i0.L(31.0f);
        }
        return 0;
    }

    @Override // vh.k
    public int getEditTextStyle() {
        return 3;
    }

    @Override // vh.k
    public final void r(int i10) {
        this.c1.setTranslationY(((-Math.min(org.telegram.messenger.i0.L(34.0f), i10)) - org.telegram.messenger.i0.L(10.0f)) * (this instanceof org.telegram.ui.kq0 ? -1.0f : 1.0f));
    }

    @Override // vh.k
    public final void s(int i10, int i11) {
        CharSequence text = getText();
        F((i11 <= 2 || text == null || TextUtils.isEmpty(text.toString().trim())) ? false : true);
        if (this.r1) {
            if ((i10 < 3) != (i11 < 3)) {
                invalidate();
            }
        }
    }

    public void setIsVideo(boolean z10) {
        this.p1 = z10;
    }

    public void setOnAddPhotoClick(View.OnClickListener onClickListener) {
        this.S0.setOnClickListener(onClickListener);
    }

    public void setOnTimerChange(org.telegram.messenger.q20 q20Var) {
        this.q1 = q20Var;
    }

    @Override // vh.k
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
    }

    public void setTimer(int i10) {
        this.a1 = i10;
        this.V0.d(i10 == Integer.MAX_VALUE ? 1 : Math.max(1, i10), this.a1 > 0, true);
        vh.p2 p2Var = this.c1;
        if (p2Var != null) {
            p2Var.e(true);
        }
    }

    @Override // vh.k
    public final void t() {
        Runnable runnable = this.d1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // vh.k
    public void u(float f7) {
        float f10 = 1.0f - f7;
        this.U0.setAlpha(f10);
        this.S0.setAlpha(f10);
    }

    @Override // vh.k
    public void x(int i10) {
        boolean z10 = this.l0;
        super.x(i10);
        if (z10 || !this.L.c()) {
            return;
        }
        B();
    }

    public final void z() {
        boolean z10;
        tf tfVar = this.o1;
        org.telegram.messenger.i0.r(tfVar);
        if (org.telegram.messenger.vp.r1(this.U).f7.getInt("movecaptionhint", 0) >= 24) {
            boolean z11 = org.telegram.messenger.v2.a;
            z10 = false;
        } else {
            z10 = true;
        }
        this.n1 = z10;
        if (z10) {
            SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(this.U).f7;
            sharedPreferences.edit().putInt("movecaptionhint", sharedPreferences.getInt("movecaptionhint", 0) + 1).apply();
            invalidate();
            org.telegram.messenger.i0.h3(tfVar, 5000L);
        }
    }
}
