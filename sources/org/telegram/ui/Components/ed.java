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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class ed extends nh.m {
    public boolean O0;
    public final ImageView P0;
    public boolean Q0;
    public final ImageView R0;
    public final nh.l S0;
    public j70 T0;
    public final k0 U0;
    public final ImageView V0;
    public nh.t3 W0;
    public int X0;
    public final int[] Y0;
    public final nh.t3 Z0;
    public final Runnable a1;
    public final RectF b1;
    public final Drawable c1;
    public final n6 d1;
    public final uc e1;
    public ng.d f1;
    public final d6 g1;
    public final d6 h1;
    public final d6 i1;
    public boolean j1;
    public boolean k1;
    public final ig l1;
    public boolean m1;
    public Utilities.Callback n1;
    public boolean o1;

    public ed(Context context, FrameLayout frameLayout, hv0 hv0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.c6 c6Var, ga gaVar, Runnable runnable) {
        super(context, frameLayout, hv0Var, frameLayout2, c6Var, gaVar);
        this.X0 = 0;
        this.Y0 = new int[]{ConnectionsManager.DEFAULT_DATACENTER_ID, 3, 10, 30, 0};
        this.b1 = new RectF();
        n6 n6Var = new n6(false, false, false, false);
        this.d1 = n6Var;
        this.e1 = new uc(this);
        jr jrVar = jr.h;
        this.g1 = new d6(this, 0L, 350L, jrVar);
        this.h1 = new d6(this, 0L, 350L, jrVar);
        this.i1 = new d6(this, 0L, 350L, jrVar);
        this.l1 = new ig(this, 17);
        this.a1 = runnable;
        n6Var.t(AndroidUtilities.dp(14.0f));
        n6Var.G = AndroidUtilities.displaySize.x;
        n6Var.r(-1);
        boolean z10 = this instanceof org.telegram.ui.yr0;
        if (z10) {
            n6Var.q(LocaleController.getString(R.string.MoveCaptionDown), true, true);
            this.c1 = context.getResources().getDrawable(R.drawable.menu_link_below);
        } else {
            n6Var.q(LocaleController.getString(R.string.MoveCaptionUp), true, true);
            this.c1 = context.getResources().getDrawable(R.drawable.menu_link_above);
        }
        ImageView imageView = new ImageView(context);
        this.P0 = imageView;
        imageView.setImageResource(R.drawable.filled_add_photo);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        C(false);
        addView(imageView, i7.f6.d(44, 44.0f, (z10 ? 48 : 80) | 3, 14.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        ImageView imageView2 = new ImageView(context);
        this.R0 = imageView2;
        nh.l lVar = new nh.l(5);
        this.S0 = lVar;
        imageView2.setImageDrawable(lVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        imageView2.setScaleType(scaleType);
        E(false, false);
        addView(imageView2, i7.f6.d(44, 44.0f, (z10 ? 48 : 80) | 5, 0.0f, z10 ? 6.0f : 0.0f, 10.0f, z10 ? 0.0f : 6.0f));
        nh.t3 t3Var = new nh.t3(context, z10 ? 1 : 3);
        this.Z0 = t3Var;
        t3Var.r(12.0f);
        t3Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(z10 ? 8.0f : 0.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(z10 ? 0.0f : 8.0f));
        t3Var.m(1.0f, -21.0f);
        t3Var.q(true);
        addView(t3Var, i7.f6.e(-1, 80, (z10 ? 48 : 80) | 5));
        ImageView imageView3 = new ImageView(context);
        this.V0 = imageView3;
        k0 k0Var = new k0(context);
        this.U0 = k0Var;
        imageView3.setImageDrawable(k0Var);
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1140850689, PorterDuff.Mode.MULTIPLY));
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, AndroidUtilities.dp(16.0f)));
        addView(imageView3, i7.f6.d(44, 44.0f, 53, 8.0f, 0.0f, 8.0f, 0.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        i7.h6.a(imageView3);
        this.f.getEditText().addTextChangedListener(new bh.c(this, 6));
        imageView3.setVisibility(8);
        imageView3.setAlpha(0.0f);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        imageView3.setOnClickListener(new h0(this, 7));
        imageView2.setOnClickListener(new t2(9, this, frameLayout));
    }

    public abstract void A();

    public abstract void B();

    public final void C(boolean z10) {
        this.O0 = z10;
        ImageView imageView = this.P0;
        imageView.animate().cancel();
        int i10 = 0;
        imageView.setVisibility(z10 ? 0 : 8);
        imageView.setAlpha(z10 ? 1.0f : 0.0f);
        imageView.setTranslationX(z10 ? 0.0f : AndroidUtilities.dp(-8.0f));
        nh.g gVar = this.f;
        gVar.getEditText().setTranslationX(AndroidUtilities.lerp(getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), this.k0));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.getLayoutParams();
        if (this.O0 && this.Q0) {
            i10 = 33;
        }
        marginLayoutParams.rightMargin = AndroidUtilities.dp(32 + i10);
        gVar.setLayoutParams(marginLayoutParams);
    }

    public final void D(boolean z10, boolean z11) {
        if (this.j1 == z10 && z11) {
            return;
        }
        this.j1 = z10;
        if (!z11) {
            this.h1.f(z10, true);
        }
        invalidate();
    }

    public final void E(boolean z10, boolean z11) {
        this.Q0 = z10;
        ImageView imageView = this.R0;
        imageView.animate().cancel();
        int i10 = 0;
        if (z11) {
            imageView.setVisibility(0);
            imageView.animate().alpha(z10 ? 1.0f : 0.0f).translationX(z10 ? 0.0f : AndroidUtilities.dp(8.0f)).withEndAction(new dd(this, z10, 1)).start();
        } else {
            imageView.setVisibility(z10 ? 0 : 8);
            imageView.setAlpha(z10 ? 1.0f : 0.0f);
            imageView.setTranslationX(z10 ? 0.0f : AndroidUtilities.dp(8.0f));
        }
        nh.g gVar = this.f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.getLayoutParams();
        if (this.O0 && this.Q0) {
            i10 = 33;
        }
        marginLayoutParams.rightMargin = AndroidUtilities.dp(32 + i10);
        gVar.setLayoutParams(marginLayoutParams);
    }

    public final void F(boolean z10) {
        if (this.o1 == z10) {
            return;
        }
        if (z10) {
            MessagesController.getInstance(this.Q).getTonesController().load();
        }
        this.o1 = z10;
        ImageView imageView = this.V0;
        imageView.setVisibility(0);
        imageView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setInterpolator(jr.h).setDuration(420L).withEndAction(new dd(this, z10, 0)).start();
        if (!z10) {
            nh.t3 t3Var = this.W0;
            if (t3Var != null) {
                t3Var.e(true);
                this.W0 = null;
                return;
            }
            return;
        }
        k0 k0Var = this.U0;
        Objects.requireNonNull(k0Var);
        imageView.postDelayed(new j0(k0Var, 1), 220L);
        nh.t3 t3Var2 = this.W0;
        if (t3Var2 != null) {
            t3Var2.e(true);
            this.W0 = null;
        }
        if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
            nh.t3 t3Var3 = new nh.t3(getContext(), 3);
            this.W0 = t3Var3;
            t3Var3.q(true);
            this.W0.t(LocaleController.getString(R.string.AIEditorHint));
            this.W0.n(1.0f, ((-imageView.getWidth()) / 2.0f) + AndroidUtilities.dp(4.0f));
            addView(this.W0, i7.f6.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
            nh.t3 t3Var4 = this.W0;
            t3Var4.h0 = new z2(4, this, t3Var3);
            t3Var4.d = 4000L;
            t3Var4.v();
            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
        }
    }

    public abstract boolean G();

    public final void H(org.telegram.ui.ActionBar.c6 c6Var) {
        this.a = c6Var;
        this.h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.U5, false), PorterDuff.Mode.SRC_IN));
        int dp = AndroidUtilities.dp(16.0f);
        int i10 = org.telegram.ui.ActionBar.g6.zf;
        ShapeDrawable K = org.telegram.ui.ActionBar.g6.K(dp, org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        jq jqVar = this.n;
        jqVar.a = K;
        jqVar.invalidateSelf();
        this.S0.e(-1, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), -1);
    }

    @Override // nh.m
    public final int a() {
        return 0;
    }

    @Override // nh.m
    public final void c(boolean z10) {
        int i10 = (z10 || !this.Q0) ? 8 : 0;
        ImageView imageView = this.R0;
        imageView.setVisibility(i10);
        int i11 = (z10 || !this.O0) ? 8 : 0;
        ImageView imageView2 = this.P0;
        imageView2.setVisibility(i11);
        if (z10) {
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
        }
    }

    @Override // nh.m
    public final void d(boolean z10) {
        if (!z10) {
            this.R0.setVisibility(this.Q0 ? 0 : 8);
            this.P0.setVisibility(this.O0 ? 0 : 8);
        }
        nh.t3 t3Var = this.Z0;
        if (t3Var != null) {
            t3Var.e(true);
        }
    }

    @Override // nh.m, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        super.dispatchDraw(canvas);
        RectF rectF = this.w0;
        ImageView imageView = this.V0;
        if (imageView != null) {
            imageView.setTranslationX(-AndroidUtilities.dp((1.0f - this.k0) * 4.0f));
            boolean z10 = this instanceof org.telegram.ui.yr0;
            imageView.setTranslationY((Utilities.clamp01((-this.g1.d(this.f.getEditText().getLineCount(), false)) + 4.0f) * AndroidUtilities.dp(3.0f) * (z10 ? 1 : -1)) + (z10 ? rectF.bottom - AndroidUtilities.dp(44.0f) : rectF.top));
        }
        float f10 = this.h1.f(this.j1, true ^ G());
        float e10 = this.i1.e(this.k1);
        if (f10 > 0.0f) {
            float a2 = this.e1.a(0.03f);
            int dp = AndroidUtilities.dp((1.0f - this.k0) * 4.0f);
            boolean z11 = this instanceof org.telegram.ui.yr0;
            n6 n6Var = this.d1;
            RectF rectF2 = this.b1;
            if (z11) {
                f9 = 1.0f;
                rectF2.set(AndroidUtilities.dp(7.0f) + dp, rectF.bottom + AndroidUtilities.dp(10.0f), ((n6Var.d() + AndroidUtilities.dp(11.0f)) * e10) + AndroidUtilities.dp(44.0f) + dp, rectF.bottom + AndroidUtilities.dp(42.0f));
            } else {
                f9 = 1.0f;
                rectF2.set(AndroidUtilities.dp(7.0f) + dp, rectF.top - AndroidUtilities.dp(42.0f), ((n6Var.d() + AndroidUtilities.dp(11.0f)) * e10) + AndroidUtilities.dp(44.0f) + dp, rectF.top - AndroidUtilities.dp(10.0f));
            }
            if (f10 < f9) {
                canvas.saveLayerAlpha(rectF2, (int) (f10 * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.scale(a2, a2, rectF2.centerX(), rectF2.centerY());
            canvas.clipRect(rectF2);
            AndroidUtilities.dpf2(16.0f);
            lg.a aVar = this.d0;
            if (aVar != null) {
                if (this.f1 == null) {
                    ng.d c3 = aVar.c(this, null, false);
                    c3.n(pg.a.i(this.a));
                    c3.o(AndroidUtilities.dp(5.0f));
                    c3.p(AndroidUtilities.dp(16.0f));
                    this.f1 = c3;
                }
                Rect rect = AndroidUtilities.rectTmp2;
                rectF2.round(rect);
                rect.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
                this.f1.setBounds(rect);
                this.f1.draw(canvas);
            }
            int dp2 = (int) (rectF2.left + AndroidUtilities.dp(9.0f));
            int centerY = (int) (rectF2.centerY() - AndroidUtilities.dp(10.0f));
            int dp3 = (int) (rectF2.left + AndroidUtilities.dp(29.0f));
            int centerY2 = (int) (rectF2.centerY() + AndroidUtilities.dp(10.0f));
            Drawable drawable = this.c1;
            drawable.setBounds(dp2, centerY, dp3, centerY2);
            drawable.draw(canvas);
            n6Var.l(rectF2.left + AndroidUtilities.dp(37.0f), rectF2.top, rectF2.right, rectF2.bottom);
            n6Var.w = (int) (e10 * 255.0f);
            n6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // nh.m, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        RectF rectF = this.b1;
        d6 d6Var = this.h1;
        uc ucVar = this.e1;
        if (action == 0) {
            ucVar.c(d6Var.c > 0.0f && rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2) {
            if (ucVar.h && (d6Var.c <= 0.0f || !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
                ucVar.c(false);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && ucVar.h) {
            if (motionEvent.getAction() == 1) {
                A();
                this.d1.q(LocaleController.getString(this instanceof org.telegram.ui.yr0 ? R.string.MoveCaptionDown : R.string.MoveCaptionUp), true, true);
            }
            ucVar.c(false);
            return true;
        }
        return ucVar.h || super.dispatchTouchEvent(motionEvent);
    }

    @Override // nh.m
    public final boolean f(View view) {
        return view != this.Z0;
    }

    @Override // nh.m
    public int getCaptionDefaultLimit() {
        return MessagesController.getInstance(this.Q).captionLengthLimitDefault;
    }

    @Override // nh.m
    public int getCaptionLimit() {
        return UserConfig.getInstance(this.Q).isPremium() ? getCaptionPremiumLimit() : getCaptionDefaultLimit();
    }

    @Override // nh.m
    public int getCaptionPremiumLimit() {
        return MessagesController.getInstance(this.Q).captionLengthLimitPremium;
    }

    @Override // nh.m
    public int getEditTextHeight() {
        return super.getEditTextHeight();
    }

    @Override // nh.m
    public int getEditTextLeft() {
        if (this.O0) {
            return AndroidUtilities.dp(31.0f);
        }
        return 0;
    }

    @Override // nh.m
    public int getEditTextStyle() {
        return 3;
    }

    @Override // nh.m
    public final void r(int i10) {
        this.Z0.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), i10)) - AndroidUtilities.dp(10.0f)) * (this instanceof org.telegram.ui.yr0 ? -1.0f : 1.0f));
    }

    @Override // nh.m
    public final void s(int i10, int i11) {
        CharSequence text = getText();
        F((i11 <= 2 || text == null || TextUtils.isEmpty(text.toString().trim())) ? false : true);
        if (this.o1) {
            if ((i10 < 3) != (i11 < 3)) {
                invalidate();
            }
        }
    }

    public void setIsVideo(boolean z10) {
        this.m1 = z10;
    }

    public void setOnAddPhotoClick(View.OnClickListener onClickListener) {
        this.P0.setOnClickListener(onClickListener);
    }

    public void setOnTimerChange(Utilities.Callback<Integer> callback) {
        this.n1 = callback;
    }

    @Override // nh.m
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
    }

    public void setTimer(int i10) {
        this.X0 = i10;
        this.S0.d(i10 == Integer.MAX_VALUE ? 1 : Math.max(1, i10), this.X0 > 0, true);
        nh.t3 t3Var = this.Z0;
        if (t3Var != null) {
            t3Var.e(true);
        }
    }

    @Override // nh.m
    public final void t() {
        Runnable runnable = this.a1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // nh.m
    public void u(float f9) {
        float f10 = 1.0f - f9;
        this.R0.setAlpha(f10);
        this.P0.setAlpha(f10);
    }

    @Override // nh.m
    public void x(int i10) {
        boolean z10 = this.i0;
        super.x(i10);
        if (z10 || !this.H.c()) {
            return;
        }
        B();
    }

    public final void z() {
        ig igVar = this.l1;
        AndroidUtilities.cancelRunOnUIThread(igVar);
        boolean shouldShowMoveCaptionHint = MessagesController.getInstance(this.Q).shouldShowMoveCaptionHint();
        this.k1 = shouldShowMoveCaptionHint;
        if (shouldShowMoveCaptionHint) {
            MessagesController.getInstance(this.Q).incrementMoveCaptionHint();
            invalidate();
            AndroidUtilities.runOnUIThread(igVar, 5000L);
        }
    }
}
