package org.telegram.ui.Components;

import android.content.Context;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class bd extends qh.k {
    public boolean P0;
    public final ImageView Q0;
    public boolean R0;
    public final ImageView S0;
    public final qh.j T0;
    public q70 U0;
    public final j0 V0;
    public final ImageView W0;
    public qh.f3 X0;
    public int Y0;
    public final int[] Z0;
    public final qh.f3 a1;
    public final Runnable b1;
    public final RectF c1;
    public final Drawable d1;
    public final j6 e1;
    public final rc f1;
    public qg.b g1;
    public final z5 h1;
    public final z5 i1;
    public final z5 j1;
    public boolean k1;
    public boolean l1;
    public final fg m1;
    public boolean n1;
    public Utilities.Callback o1;
    public boolean p1;

    public bd(Context context, FrameLayout frameLayout, qv0 qv0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.g6 g6Var, ba baVar, Runnable runnable) {
        super(context, frameLayout, qv0Var, frameLayout2, g6Var, baVar);
        this.Y0 = 0;
        this.Z0 = new int[]{ConnectionsManager.DEFAULT_DATACENTER_ID, 3, 10, 30, 0};
        this.c1 = new RectF();
        j6 j6Var = new j6(false, false, false, false);
        this.e1 = j6Var;
        this.f1 = new rc(this);
        pr prVar = pr.h;
        this.h1 = new z5(this, 0L, 350L, prVar);
        this.i1 = new z5(this, 0L, 350L, prVar);
        this.j1 = new z5(this, 0L, 350L, prVar);
        this.m1 = new fg(this, 17);
        this.b1 = runnable;
        j6Var.t(AndroidUtilities.dp(14.0f));
        j6Var.G = AndroidUtilities.displaySize.x;
        j6Var.r(-1);
        boolean z4 = this instanceof org.telegram.ui.is0;
        if (z4) {
            j6Var.q(LocaleController.getString(R.string.MoveCaptionDown), true, true);
            this.d1 = context.getResources().getDrawable(R.drawable.menu_link_below);
        } else {
            j6Var.q(LocaleController.getString(R.string.MoveCaptionUp), true, true);
            this.d1 = context.getResources().getDrawable(R.drawable.menu_link_above);
        }
        ImageView imageView = new ImageView(context);
        this.Q0 = imageView;
        imageView.setImageResource(R.drawable.filled_add_photo);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        C(false);
        addView(imageView, k7.c6.d(44, 44.0f, (z4 ? 48 : 80) | 3, 14.0f, z4 ? 6.0f : 0.0f, 0.0f, z4 ? 0.0f : 6.0f));
        ImageView imageView2 = new ImageView(context);
        this.S0 = imageView2;
        qh.j jVar = new qh.j(5);
        this.T0 = jVar;
        imageView2.setImageDrawable(jVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        imageView2.setScaleType(scaleType);
        E(false, false);
        addView(imageView2, k7.c6.d(44, 44.0f, (z4 ? 48 : 80) | 5, 0.0f, z4 ? 6.0f : 0.0f, 10.0f, z4 ? 0.0f : 6.0f));
        qh.f3 f3Var = new qh.f3(context, z4 ? 1 : 3);
        this.a1 = f3Var;
        f3Var.r(12.0f);
        f3Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(z4 ? 8.0f : 0.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(z4 ? 0.0f : 8.0f));
        f3Var.m(1.0f, -21.0f);
        f3Var.q(true);
        addView(f3Var, k7.c6.e(-1, 80, (z4 ? 48 : 80) | 5));
        ImageView imageView3 = new ImageView(context);
        this.W0 = imageView3;
        j0 j0Var = new j0(context);
        this.V0 = j0Var;
        imageView3.setImageDrawable(j0Var);
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1140850689, PorterDuff.Mode.MULTIPLY));
        imageView3.setBackground(org.telegram.ui.ActionBar.k6.f0(1090519039, 1, AndroidUtilities.dp(16.0f)));
        addView(imageView3, k7.c6.d(44, 44.0f, 53, 8.0f, 0.0f, 8.0f, 0.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        k7.e6.a(imageView3);
        this.f.getEditText().addTextChangedListener(new eh.c(this, 5));
        imageView3.setVisibility(8);
        imageView3.setAlpha(0.0f);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        imageView3.setOnClickListener(new g0(this, 7));
        imageView2.setOnClickListener(new w2(6, this, frameLayout));
    }

    public abstract void A();

    public abstract void B();

    public final void C(boolean z4) {
        this.P0 = z4;
        ImageView imageView = this.Q0;
        imageView.animate().cancel();
        int i10 = 0;
        imageView.setVisibility(z4 ? 0 : 8);
        imageView.setAlpha(z4 ? 1.0f : 0.0f);
        imageView.setTranslationX(z4 ? 0.0f : AndroidUtilities.dp(-8.0f));
        qh.f fVar = this.f;
        fVar.getEditText().setTranslationX(AndroidUtilities.lerp(getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), this.l0));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fVar.getLayoutParams();
        if (this.P0 && this.R0) {
            i10 = 33;
        }
        marginLayoutParams.rightMargin = AndroidUtilities.dp(32 + i10);
        fVar.setLayoutParams(marginLayoutParams);
    }

    public final void D(boolean z4, boolean z10) {
        if (this.k1 == z4 && z10) {
            return;
        }
        this.k1 = z4;
        if (!z10) {
            this.i1.f(z4, true);
        }
        invalidate();
    }

    public final void E(boolean z4, boolean z10) {
        this.R0 = z4;
        ImageView imageView = this.S0;
        imageView.animate().cancel();
        int i10 = 0;
        if (z10) {
            imageView.setVisibility(0);
            imageView.animate().alpha(z4 ? 1.0f : 0.0f).translationX(z4 ? 0.0f : AndroidUtilities.dp(8.0f)).withEndAction(new ad(this, z4, 1)).start();
        } else {
            imageView.setVisibility(z4 ? 0 : 8);
            imageView.setAlpha(z4 ? 1.0f : 0.0f);
            imageView.setTranslationX(z4 ? 0.0f : AndroidUtilities.dp(8.0f));
        }
        qh.f fVar = this.f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fVar.getLayoutParams();
        if (this.P0 && this.R0) {
            i10 = 33;
        }
        marginLayoutParams.rightMargin = AndroidUtilities.dp(32 + i10);
        fVar.setLayoutParams(marginLayoutParams);
    }

    public final void F(boolean z4) {
        if (this.p1 == z4) {
            return;
        }
        if (z4) {
            MessagesController.getInstance(this.R).getTonesController().load();
        }
        this.p1 = z4;
        ImageView imageView = this.W0;
        imageView.setVisibility(0);
        imageView.animate().alpha(z4 ? 1.0f : 0.0f).scaleX(z4 ? 1.0f : 0.6f).scaleY(z4 ? 1.0f : 0.6f).setInterpolator(pr.h).setDuration(420L).withEndAction(new ad(this, z4, 0)).start();
        if (!z4) {
            qh.f3 f3Var = this.X0;
            if (f3Var != null) {
                f3Var.e(true);
                this.X0 = null;
                return;
            }
            return;
        }
        j0 j0Var = this.V0;
        Objects.requireNonNull(j0Var);
        imageView.postDelayed(new i0(j0Var, 1), 220L);
        qh.f3 f3Var2 = this.X0;
        if (f3Var2 != null) {
            f3Var2.e(true);
            this.X0 = null;
        }
        if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
            qh.f3 f3Var3 = new qh.f3(getContext(), 3);
            this.X0 = f3Var3;
            f3Var3.q(true);
            this.X0.t(LocaleController.getString(R.string.AIEditorHint));
            this.X0.n(1.0f, ((-imageView.getWidth()) / 2.0f) + AndroidUtilities.dp(4.0f));
            addView(this.X0, k7.c6.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
            qh.f3 f3Var4 = this.X0;
            f3Var4.i0 = new org.telegram.ui.mp(12, this, f3Var3);
            f3Var4.d = 4000L;
            f3Var4.v();
            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
        }
    }

    public abstract boolean G();

    public final void H(org.telegram.ui.ActionBar.g6 g6Var) {
        this.a = g6Var;
        this.h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.U5, false), PorterDuff.Mode.SRC_IN));
        int dp = AndroidUtilities.dp(16.0f);
        int i10 = org.telegram.ui.ActionBar.k6.zf;
        ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(dp, org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        pq pqVar = this.n;
        pqVar.a = K;
        pqVar.invalidateSelf();
        this.T0.e(-1, org.telegram.ui.ActionBar.k6.v0(i10, g6Var), -1);
    }

    @Override // qh.k
    public final int a() {
        return 0;
    }

    @Override // qh.k
    public final void c(boolean z4) {
        int i10 = (z4 || !this.R0) ? 8 : 0;
        ImageView imageView = this.S0;
        imageView.setVisibility(i10);
        int i11 = (z4 || !this.P0) ? 8 : 0;
        ImageView imageView2 = this.Q0;
        imageView2.setVisibility(i11);
        if (z4) {
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
        }
    }

    @Override // qh.k
    public final void d(boolean z4) {
        if (!z4) {
            this.S0.setVisibility(this.R0 ? 0 : 8);
            this.Q0.setVisibility(this.P0 ? 0 : 8);
        }
        qh.f3 f3Var = this.a1;
        if (f3Var != null) {
            f3Var.e(true);
        }
    }

    @Override // qh.k, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        RectF rectF = this.x0;
        ImageView imageView = this.W0;
        if (imageView != null) {
            imageView.setTranslationX(-AndroidUtilities.dp((1.0f - this.l0) * 4.0f));
            boolean z4 = this instanceof org.telegram.ui.is0;
            imageView.setTranslationY((Utilities.clamp01((-this.h1.d(this.f.getEditText().getLineCount(), false)) + 4.0f) * AndroidUtilities.dp(3.0f) * (z4 ? 1 : -1)) + (z4 ? rectF.bottom - AndroidUtilities.dp(44.0f) : rectF.top));
        }
        float f11 = this.i1.f(this.k1, true ^ G());
        float e6 = this.j1.e(this.l1);
        if (f11 > 0.0f) {
            float a2 = this.f1.a(0.03f);
            int dp = AndroidUtilities.dp((1.0f - this.l0) * 4.0f);
            boolean z10 = this instanceof org.telegram.ui.is0;
            j6 j6Var = this.e1;
            RectF rectF2 = this.c1;
            if (z10) {
                f10 = 1.0f;
                rectF2.set(AndroidUtilities.dp(7.0f) + dp, rectF.bottom + AndroidUtilities.dp(10.0f), ((j6Var.d() + AndroidUtilities.dp(11.0f)) * e6) + AndroidUtilities.dp(44.0f) + dp, rectF.bottom + AndroidUtilities.dp(42.0f));
            } else {
                f10 = 1.0f;
                rectF2.set(AndroidUtilities.dp(7.0f) + dp, rectF.top - AndroidUtilities.dp(42.0f), ((j6Var.d() + AndroidUtilities.dp(11.0f)) * e6) + AndroidUtilities.dp(44.0f) + dp, rectF.top - AndroidUtilities.dp(10.0f));
            }
            if (f11 < f10) {
                canvas.saveLayerAlpha(rectF2, (int) (f11 * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.scale(a2, a2, rectF2.centerX(), rectF2.centerY());
            canvas.clipRect(rectF2);
            AndroidUtilities.dpf2(16.0f);
            og.a aVar = this.e0;
            if (aVar != null) {
                if (this.g1 == null) {
                    qg.b c3 = aVar.c(this, null, false);
                    c3.n(sg.b.i(this.a));
                    c3.o(AndroidUtilities.dp(5.0f));
                    c3.p(AndroidUtilities.dp(16.0f));
                    this.g1 = c3;
                }
                Rect rect = AndroidUtilities.rectTmp2;
                rectF2.round(rect);
                rect.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
                this.g1.setBounds(rect);
                this.g1.draw(canvas);
            }
            int dp2 = (int) (rectF2.left + AndroidUtilities.dp(9.0f));
            int centerY = (int) (rectF2.centerY() - AndroidUtilities.dp(10.0f));
            int dp3 = (int) (rectF2.left + AndroidUtilities.dp(29.0f));
            int centerY2 = (int) (rectF2.centerY() + AndroidUtilities.dp(10.0f));
            Drawable drawable = this.d1;
            drawable.setBounds(dp2, centerY, dp3, centerY2);
            drawable.draw(canvas);
            j6Var.l(rectF2.left + AndroidUtilities.dp(37.0f), rectF2.top, rectF2.right, rectF2.bottom);
            j6Var.w = (int) (e6 * 255.0f);
            j6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // qh.k, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        RectF rectF = this.c1;
        z5 z5Var = this.i1;
        rc rcVar = this.f1;
        if (action == 0) {
            rcVar.c(z5Var.c > 0.0f && rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2) {
            if (rcVar.h && (z5Var.c <= 0.0f || !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
                rcVar.c(false);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && rcVar.h) {
            if (motionEvent.getAction() == 1) {
                A();
                this.e1.q(LocaleController.getString(this instanceof org.telegram.ui.is0 ? R.string.MoveCaptionDown : R.string.MoveCaptionUp), true, true);
            }
            rcVar.c(false);
            return true;
        }
        return rcVar.h || super.dispatchTouchEvent(motionEvent);
    }

    @Override // qh.k
    public final boolean f(View view) {
        return view != this.a1;
    }

    @Override // qh.k
    public int getCaptionDefaultLimit() {
        return MessagesController.getInstance(this.R).captionLengthLimitDefault;
    }

    @Override // qh.k
    public int getCaptionLimit() {
        return UserConfig.getInstance(this.R).isPremium() ? getCaptionPremiumLimit() : getCaptionDefaultLimit();
    }

    @Override // qh.k
    public int getCaptionPremiumLimit() {
        return MessagesController.getInstance(this.R).captionLengthLimitPremium;
    }

    @Override // qh.k
    public int getEditTextHeight() {
        return super.getEditTextHeight();
    }

    @Override // qh.k
    public int getEditTextLeft() {
        if (this.P0) {
            return AndroidUtilities.dp(31.0f);
        }
        return 0;
    }

    @Override // qh.k
    public int getEditTextStyle() {
        return 3;
    }

    @Override // qh.k
    public final void r(int i10) {
        this.a1.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), i10)) - AndroidUtilities.dp(10.0f)) * (this instanceof org.telegram.ui.is0 ? -1.0f : 1.0f));
    }

    @Override // qh.k
    public final void s(int i10, int i11) {
        CharSequence text = getText();
        F((i11 <= 2 || text == null || TextUtils.isEmpty(text.toString().trim())) ? false : true);
        if (this.p1) {
            if ((i10 < 3) != (i11 < 3)) {
                invalidate();
            }
        }
    }

    public void setIsVideo(boolean z4) {
        this.n1 = z4;
    }

    public void setOnAddPhotoClick(View.OnClickListener onClickListener) {
        this.Q0.setOnClickListener(onClickListener);
    }

    public void setOnTimerChange(Utilities.Callback<Integer> callback) {
        this.o1 = callback;
    }

    @Override // qh.k
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
    }

    public void setTimer(int i10) {
        this.Y0 = i10;
        this.T0.d(i10 == Integer.MAX_VALUE ? 1 : Math.max(1, i10), this.Y0 > 0, true);
        qh.f3 f3Var = this.a1;
        if (f3Var != null) {
            f3Var.e(true);
        }
    }

    @Override // qh.k
    public final void t() {
        Runnable runnable = this.b1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // qh.k
    public void u(float f10) {
        float f11 = 1.0f - f10;
        this.S0.setAlpha(f11);
        this.Q0.setAlpha(f11);
    }

    @Override // qh.k
    public void x(int i10) {
        boolean z4 = this.j0;
        super.x(i10);
        if (z4 || !this.I.c()) {
            return;
        }
        B();
    }

    public final void z() {
        fg fgVar = this.m1;
        AndroidUtilities.cancelRunOnUIThread(fgVar);
        boolean shouldShowMoveCaptionHint = MessagesController.getInstance(this.R).shouldShowMoveCaptionHint();
        this.l1 = shouldShowMoveCaptionHint;
        if (shouldShowMoveCaptionHint) {
            MessagesController.getInstance(this.R).incrementMoveCaptionHint();
            invalidate();
            AndroidUtilities.runOnUIThread(fgVar, 5000L);
        }
    }
}
