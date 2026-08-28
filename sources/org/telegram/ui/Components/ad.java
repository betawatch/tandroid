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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class ad extends kh.m {
    public boolean O0;
    public final ImageView P0;
    public boolean Q0;
    public final ImageView R0;
    public final kh.l S0;
    public x60 T0;
    public final i0 U0;
    public final ImageView V0;
    public kh.x3 W0;
    public int X0;
    public final int[] Y0;
    public final kh.x3 Z0;
    public final Runnable a1;
    public final RectF b1;
    public final Drawable c1;
    public final i6 d1;
    public final pc e1;
    public kg.d f1;
    public final y5 g1;
    public final y5 h1;
    public final y5 i1;
    public boolean j1;
    public boolean k1;
    public final fg l1;
    public boolean m1;
    public Utilities.Callback n1;
    public boolean o1;

    public ad(Context context, FrameLayout frameLayout, xu0 xu0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.b6 b6Var, ba baVar, Runnable runnable) {
        super(context, frameLayout, xu0Var, frameLayout2, b6Var, baVar);
        this.X0 = 0;
        this.Y0 = new int[]{ConnectionsManager.DEFAULT_DATACENTER_ID, 3, 10, 30, 0};
        this.b1 = new RectF();
        i6 i6Var = new i6(false, false, false, false);
        this.d1 = i6Var;
        this.e1 = new pc(this);
        gr grVar = gr.h;
        this.g1 = new y5(this, 0L, 350L, grVar);
        this.h1 = new y5(this, 0L, 350L, grVar);
        this.i1 = new y5(this, 0L, 350L, grVar);
        this.l1 = new fg(this, 17);
        this.a1 = runnable;
        i6Var.t(AndroidUtilities.dp(14.0f));
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var.r(-1);
        boolean z10 = this instanceof org.telegram.ui.zr0;
        if (z10) {
            i6Var.q(LocaleController.getString(R.string.MoveCaptionDown), true, true);
            this.c1 = context.getResources().getDrawable(R.drawable.menu_link_below);
        } else {
            i6Var.q(LocaleController.getString(R.string.MoveCaptionUp), true, true);
            this.c1 = context.getResources().getDrawable(R.drawable.menu_link_above);
        }
        ImageView imageView = new ImageView(context);
        this.P0 = imageView;
        imageView.setImageResource(R.drawable.filled_add_photo);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        C(false);
        addView(imageView, g7.e6.d(44, 44.0f, (z10 ? 48 : 80) | 3, 14.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        ImageView imageView2 = new ImageView(context);
        this.R0 = imageView2;
        kh.l lVar = new kh.l(5);
        this.S0 = lVar;
        imageView2.setImageDrawable(lVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.f6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        imageView2.setScaleType(scaleType);
        E(false, false);
        addView(imageView2, g7.e6.d(44, 44.0f, (z10 ? 48 : 80) | 5, 0.0f, z10 ? 6.0f : 0.0f, 10.0f, z10 ? 0.0f : 6.0f));
        kh.x3 x3Var = new kh.x3(context, z10 ? 1 : 3);
        this.Z0 = x3Var;
        x3Var.r(12.0f);
        x3Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(z10 ? 8.0f : 0.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(z10 ? 0.0f : 8.0f));
        x3Var.m(1.0f, -21.0f);
        x3Var.q(true);
        addView(x3Var, g7.e6.e(-1, 80, (z10 ? 48 : 80) | 5));
        ImageView imageView3 = new ImageView(context);
        this.V0 = imageView3;
        i0 i0Var = new i0(context);
        this.U0 = i0Var;
        imageView3.setImageDrawable(i0Var);
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1140850689, PorterDuff.Mode.MULTIPLY));
        imageView3.setBackground(org.telegram.ui.ActionBar.f6.f0(1090519039, 1, AndroidUtilities.dp(16.0f)));
        addView(imageView3, g7.e6.d(44, 44.0f, 53, 8.0f, 0.0f, 8.0f, 0.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        g7.g6.a(imageView3);
        this.f.getEditText().addTextChangedListener(new bh.f(this, 6));
        imageView3.setVisibility(8);
        imageView3.setAlpha(0.0f);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        imageView3.setOnClickListener(new f0(this, 7));
        imageView2.setOnClickListener(new s2(8, this, frameLayout));
    }

    public abstract void A();

    public abstract void B();

    public final void C(boolean z10) {
        this.O0 = z10;
        ImageView imageView = this.P0;
        imageView.animate().cancel();
        int i9 = 0;
        imageView.setVisibility(z10 ? 0 : 8);
        imageView.setAlpha(z10 ? 1.0f : 0.0f);
        imageView.setTranslationX(z10 ? 0.0f : AndroidUtilities.dp(-8.0f));
        kh.g gVar = this.f;
        gVar.getEditText().setTranslationX(AndroidUtilities.lerp(getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), this.k0));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.getLayoutParams();
        if (this.O0 && this.Q0) {
            i9 = 33;
        }
        marginLayoutParams.rightMargin = AndroidUtilities.dp(32 + i9);
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
        int i9 = 0;
        if (z11) {
            imageView.setVisibility(0);
            imageView.animate().alpha(z10 ? 1.0f : 0.0f).translationX(z10 ? 0.0f : AndroidUtilities.dp(8.0f)).withEndAction(new zc(this, z10, 1)).start();
        } else {
            imageView.setVisibility(z10 ? 0 : 8);
            imageView.setAlpha(z10 ? 1.0f : 0.0f);
            imageView.setTranslationX(z10 ? 0.0f : AndroidUtilities.dp(8.0f));
        }
        kh.g gVar = this.f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.getLayoutParams();
        if (this.O0 && this.Q0) {
            i9 = 33;
        }
        marginLayoutParams.rightMargin = AndroidUtilities.dp(32 + i9);
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
        imageView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setInterpolator(gr.h).setDuration(420L).withEndAction(new zc(this, z10, 0)).start();
        if (!z10) {
            kh.x3 x3Var = this.W0;
            if (x3Var != null) {
                x3Var.e(true);
                this.W0 = null;
                return;
            }
            return;
        }
        i0 i0Var = this.U0;
        Objects.requireNonNull(i0Var);
        imageView.postDelayed(new h0(i0Var, 1), 220L);
        kh.x3 x3Var2 = this.W0;
        if (x3Var2 != null) {
            x3Var2.e(true);
            this.W0 = null;
        }
        if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
            kh.x3 x3Var3 = new kh.x3(getContext(), 3);
            this.W0 = x3Var3;
            x3Var3.q(true);
            this.W0.t(LocaleController.getString(R.string.AIEditorHint));
            this.W0.n(1.0f, ((-imageView.getWidth()) / 2.0f) + AndroidUtilities.dp(4.0f));
            addView(this.W0, g7.e6.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
            kh.x3 x3Var4 = this.W0;
            x3Var4.h0 = new org.telegram.ui.wq(7, this, x3Var3);
            x3Var4.d = 4000L;
            x3Var4.v();
            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
        }
    }

    public abstract boolean G();

    public final void H(org.telegram.ui.ActionBar.b6 b6Var) {
        this.a = b6Var;
        this.h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.U5, false), PorterDuff.Mode.SRC_IN));
        int dp = AndroidUtilities.dp(16.0f);
        int i9 = org.telegram.ui.ActionBar.f6.zf;
        ShapeDrawable K = org.telegram.ui.ActionBar.f6.K(dp, org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        fq fqVar = this.n;
        fqVar.a = K;
        fqVar.invalidateSelf();
        this.S0.e(-1, org.telegram.ui.ActionBar.f6.v0(i9, b6Var), -1);
    }

    @Override // kh.m
    public final int a() {
        return 0;
    }

    @Override // kh.m
    public final void c(boolean z10) {
        int i9 = (z10 || !this.Q0) ? 8 : 0;
        ImageView imageView = this.R0;
        imageView.setVisibility(i9);
        int i10 = (z10 || !this.O0) ? 8 : 0;
        ImageView imageView2 = this.P0;
        imageView2.setVisibility(i10);
        if (z10) {
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
        }
    }

    @Override // kh.m
    public final void d(boolean z10) {
        if (!z10) {
            this.R0.setVisibility(this.Q0 ? 0 : 8);
            this.P0.setVisibility(this.O0 ? 0 : 8);
        }
        kh.x3 x3Var = this.Z0;
        if (x3Var != null) {
            x3Var.e(true);
        }
    }

    @Override // kh.m, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        RectF rectF = this.w0;
        ImageView imageView = this.V0;
        if (imageView != null) {
            imageView.setTranslationX(-AndroidUtilities.dp((1.0f - this.k0) * 4.0f));
            boolean z10 = this instanceof org.telegram.ui.zr0;
            imageView.setTranslationY((Utilities.clamp01((-this.g1.d(this.f.getEditText().getLineCount(), false)) + 4.0f) * AndroidUtilities.dp(3.0f) * (z10 ? 1 : -1)) + (z10 ? rectF.bottom - AndroidUtilities.dp(44.0f) : rectF.top));
        }
        float f11 = this.h1.f(this.j1, true ^ G());
        float e10 = this.i1.e(this.k1);
        if (f11 > 0.0f) {
            float a2 = this.e1.a(0.03f);
            int dp = AndroidUtilities.dp((1.0f - this.k0) * 4.0f);
            boolean z11 = this instanceof org.telegram.ui.zr0;
            i6 i6Var = this.d1;
            RectF rectF2 = this.b1;
            if (z11) {
                f10 = 1.0f;
                rectF2.set(AndroidUtilities.dp(7.0f) + dp, rectF.bottom + AndroidUtilities.dp(10.0f), ((i6Var.d() + AndroidUtilities.dp(11.0f)) * e10) + AndroidUtilities.dp(44.0f) + dp, rectF.bottom + AndroidUtilities.dp(42.0f));
            } else {
                f10 = 1.0f;
                rectF2.set(AndroidUtilities.dp(7.0f) + dp, rectF.top - AndroidUtilities.dp(42.0f), ((i6Var.d() + AndroidUtilities.dp(11.0f)) * e10) + AndroidUtilities.dp(44.0f) + dp, rectF.top - AndroidUtilities.dp(10.0f));
            }
            if (f11 < f10) {
                canvas.saveLayerAlpha(rectF2, (int) (f11 * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.scale(a2, a2, rectF2.centerX(), rectF2.centerY());
            canvas.clipRect(rectF2);
            AndroidUtilities.dpf2(16.0f);
            ig.a aVar = this.d0;
            if (aVar != null) {
                if (this.f1 == null) {
                    kg.d c10 = aVar.c(this, null, false);
                    c10.n(mg.c.i(this.a));
                    c10.o(AndroidUtilities.dp(5.0f));
                    c10.p(AndroidUtilities.dp(16.0f));
                    this.f1 = c10;
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
            i6Var.l(rectF2.left + AndroidUtilities.dp(37.0f), rectF2.top, rectF2.right, rectF2.bottom);
            i6Var.w = (int) (e10 * 255.0f);
            i6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // kh.m, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        RectF rectF = this.b1;
        y5 y5Var = this.h1;
        pc pcVar = this.e1;
        if (action == 0) {
            pcVar.c(y5Var.c > 0.0f && rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2) {
            if (pcVar.h && (y5Var.c <= 0.0f || !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
                pcVar.c(false);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && pcVar.h) {
            if (motionEvent.getAction() == 1) {
                A();
                this.d1.q(LocaleController.getString(this instanceof org.telegram.ui.zr0 ? R.string.MoveCaptionDown : R.string.MoveCaptionUp), true, true);
            }
            pcVar.c(false);
            return true;
        }
        return pcVar.h || super.dispatchTouchEvent(motionEvent);
    }

    @Override // kh.m
    public final boolean f(View view) {
        return view != this.Z0;
    }

    @Override // kh.m
    public int getCaptionDefaultLimit() {
        return MessagesController.getInstance(this.Q).captionLengthLimitDefault;
    }

    @Override // kh.m
    public int getCaptionLimit() {
        return UserConfig.getInstance(this.Q).isPremium() ? getCaptionPremiumLimit() : getCaptionDefaultLimit();
    }

    @Override // kh.m
    public int getCaptionPremiumLimit() {
        return MessagesController.getInstance(this.Q).captionLengthLimitPremium;
    }

    @Override // kh.m
    public int getEditTextHeight() {
        return super.getEditTextHeight();
    }

    @Override // kh.m
    public int getEditTextLeft() {
        if (this.O0) {
            return AndroidUtilities.dp(31.0f);
        }
        return 0;
    }

    @Override // kh.m
    public int getEditTextStyle() {
        return 3;
    }

    @Override // kh.m
    public final void r(int i9) {
        this.Z0.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), i9)) - AndroidUtilities.dp(10.0f)) * (this instanceof org.telegram.ui.zr0 ? -1.0f : 1.0f));
    }

    @Override // kh.m
    public final void s(int i9, int i10) {
        CharSequence text = getText();
        F((i10 <= 2 || text == null || TextUtils.isEmpty(text.toString().trim())) ? false : true);
        if (this.o1) {
            if ((i9 < 3) != (i10 < 3)) {
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

    @Override // kh.m
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
    }

    public void setTimer(int i9) {
        this.X0 = i9;
        this.S0.d(i9 == Integer.MAX_VALUE ? 1 : Math.max(1, i9), this.X0 > 0, true);
        kh.x3 x3Var = this.Z0;
        if (x3Var != null) {
            x3Var.e(true);
        }
    }

    @Override // kh.m
    public final void t() {
        Runnable runnable = this.a1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // kh.m
    public void u(float f10) {
        float f11 = 1.0f - f10;
        this.R0.setAlpha(f11);
        this.P0.setAlpha(f11);
    }

    @Override // kh.m
    public void x(int i9) {
        boolean z10 = this.i0;
        super.x(i9);
        if (z10 || !this.H.c()) {
            return;
        }
        B();
    }

    public final void z() {
        fg fgVar = this.l1;
        AndroidUtilities.cancelRunOnUIThread(fgVar);
        boolean shouldShowMoveCaptionHint = MessagesController.getInstance(this.Q).shouldShowMoveCaptionHint();
        this.k1 = shouldShowMoveCaptionHint;
        if (shouldShowMoveCaptionHint) {
            MessagesController.getInstance(this.Q).incrementMoveCaptionHint();
            invalidate();
            AndroidUtilities.runOnUIThread(fgVar, 5000L);
        }
    }
}
