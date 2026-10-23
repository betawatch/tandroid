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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public abstract class kd extends ei.m {
    public boolean S0;
    public final ImageView T0;
    public boolean U0;
    public final ImageView V0;
    public final ei.l W0;
    public i80 X0;
    public final i0 Y0;
    public final ImageView Z0;
    public ei.x3 a1;
    public int b1;
    public final int[] c1;
    public final ei.x3 d1;
    public final Runnable e1;
    public final RectF f1;
    public final Drawable g1;
    public final p6 h1;
    public final yc i1;
    public dh.d j1;
    public final f6 k1;
    public final f6 l1;
    public final f6 m1;
    public boolean n1;
    public boolean o1;
    public final pg p1;
    public boolean q1;
    public Utilities.Callback r1;
    public boolean s1;

    public kd(Context context, FrameLayout frameLayout, lw0 lw0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.d6 d6Var, ja jaVar, Runnable runnable) {
        super(context, frameLayout, lw0Var, frameLayout2, d6Var, jaVar);
        float f7;
        float f10;
        this.b1 = 0;
        this.c1 = new int[]{ConnectionsManager.DEFAULT_DATACENTER_ID, 3, 10, 30, 0};
        this.f1 = new RectF();
        p6 p6Var = new p6(false, false, false);
        this.h1 = p6Var;
        this.i1 = new yc(this);
        bs bsVar = bs.h;
        this.k1 = new f6(this, 0L, 350L, bsVar);
        this.l1 = new f6(this, 0L, 350L, bsVar);
        this.m1 = new f6(this, 0L, 350L, bsVar);
        this.p1 = new pg(this, 17);
        this.e1 = runnable;
        p6Var.w(AndroidUtilities.dp(14.0f));
        p6Var.M = AndroidUtilities.displaySize.x;
        p6Var.u(-1);
        boolean z10 = this instanceof org.telegram.ui.is0;
        if (z10) {
            p6Var.t(LocaleController.getString(R.string.MoveCaptionDown), true, true);
            this.g1 = context.getResources().getDrawable(R.drawable.menu_link_below);
        } else {
            p6Var.t(LocaleController.getString(R.string.MoveCaptionUp), true, true);
            this.g1 = context.getResources().getDrawable(R.drawable.menu_link_above);
        }
        ImageView imageView = new ImageView(context);
        this.T0 = imageView;
        imageView.setImageResource(R.drawable.filled_add_photo);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(1090519039, 1, AndroidUtilities.dp(18.0f)));
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
        addView(imageView, w7.z5.d(44, 44.0f, i10, 14.0f, f11, 0.0f, f7));
        ImageView imageView2 = new ImageView(context);
        this.V0 = imageView2;
        ei.l lVar = new ei.l(5);
        this.W0 = lVar;
        imageView2.setImageDrawable(lVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        imageView2.setScaleType(scaleType);
        E(false, false);
        addView(imageView2, w7.z5.d(44, 44.0f, (z10 ? 48 : 80) | 5, 0.0f, z10 ? 6.0f : f12, 10.0f, z10 ? f12 : 6.0f));
        ei.x3 x3Var = new ei.x3(context, z10 ? 1 : 3);
        this.d1 = x3Var;
        x3Var.q(12.0f);
        x3Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(z10 ? 8.0f : f12), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(z10 ? f12 : 8.0f));
        x3Var.l(1.0f, -21.0f);
        x3Var.p(true);
        addView(x3Var, w7.z5.e(-1, 80, (z10 ? 48 : 80) | 5));
        ImageView imageView3 = new ImageView(context);
        this.Z0 = imageView3;
        i0 i0Var = new i0(context);
        this.Y0 = i0Var;
        imageView3.setImageDrawable(i0Var);
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1140850689, PorterDuff.Mode.MULTIPLY));
        imageView3.setBackground(org.telegram.ui.ActionBar.h6.g0(1090519039, 1, AndroidUtilities.dp(16.0f)));
        addView(imageView3, w7.z5.d(44, 44.0f, 53, 8.0f, 0.0f, 8.0f, 0.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.b6.a(imageView3);
        this.f.getEditText().addTextChangedListener(new ai.u(this, 6));
        imageView3.setVisibility(8);
        imageView3.setAlpha(f12);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        imageView3.setOnClickListener(new f0(this, 6));
        imageView2.setOnClickListener(new ca(1, this, frameLayout));
    }

    public abstract void A();

    public abstract void B();

    public final void C(boolean z10) {
        this.S0 = z10;
        ImageView imageView = this.T0;
        imageView.animate().cancel();
        int i10 = 0;
        imageView.setVisibility(z10 ? 0 : 8);
        imageView.setAlpha(z10 ? 1.0f : 0.0f);
        imageView.setTranslationX(z10 ? 0.0f : AndroidUtilities.dp(-8.0f));
        ei.g gVar = this.f;
        gVar.getEditText().setTranslationX(AndroidUtilities.lerp(getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), this.o0));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.getLayoutParams();
        if (this.S0 && this.U0) {
            i10 = 33;
        }
        marginLayoutParams.rightMargin = AndroidUtilities.dp(32 + i10);
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
        int i10 = 0;
        if (z11) {
            imageView.setVisibility(0);
            imageView.animate().alpha(z10 ? 1.0f : 0.0f).translationX(z10 ? 0.0f : AndroidUtilities.dp(8.0f)).withEndAction(new jd(this, z10, 1)).start();
        } else {
            imageView.setVisibility(z10 ? 0 : 8);
            imageView.setAlpha(z10 ? 1.0f : 0.0f);
            imageView.setTranslationX(z10 ? 0.0f : AndroidUtilities.dp(8.0f));
        }
        ei.g gVar = this.f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.getLayoutParams();
        if (this.S0 && this.U0) {
            i10 = 33;
        }
        marginLayoutParams.rightMargin = AndroidUtilities.dp(32 + i10);
        gVar.setLayoutParams(marginLayoutParams);
    }

    public final void F(boolean z10) {
        if (this.s1 == z10) {
            return;
        }
        if (z10) {
            MessagesController.getInstance(this.U).getTonesController().load();
        }
        this.s1 = z10;
        ImageView imageView = this.Z0;
        imageView.setVisibility(0);
        imageView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setInterpolator(bs.h).setDuration(420L).withEndAction(new jd(this, z10, 0)).start();
        if (!z10) {
            ei.x3 x3Var = this.a1;
            if (x3Var != null) {
                x3Var.e(true);
                this.a1 = null;
                return;
            }
            return;
        }
        i0 i0Var = this.Y0;
        Objects.requireNonNull(i0Var);
        imageView.postDelayed(new h0(i0Var, 1), 220L);
        ei.x3 x3Var2 = this.a1;
        if (x3Var2 != null) {
            x3Var2.e(true);
            this.a1 = null;
        }
        if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
            ei.x3 x3Var3 = new ei.x3(getContext(), 3);
            this.a1 = x3Var3;
            x3Var3.p(true);
            this.a1.s(LocaleController.getString(R.string.AIEditorHint));
            this.a1.m(1.0f, ((-imageView.getWidth()) / 2.0f) + AndroidUtilities.dp(4.0f));
            addView(this.a1, w7.z5.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
            ei.x3 x3Var4 = this.a1;
            x3Var4.l0 = new org.telegram.ui.eh(28, this, x3Var3);
            x3Var4.d = 4000L;
            x3Var4.u();
            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
        }
    }

    public abstract boolean G();

    public final void H(org.telegram.ui.ActionBar.d6 d6Var) {
        this.a = d6Var;
        this.h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.U5, false), PorterDuff.Mode.SRC_IN));
        int dp = AndroidUtilities.dp(16.0f);
        int i10 = org.telegram.ui.ActionBar.h6.zf;
        ShapeDrawable K = org.telegram.ui.ActionBar.h6.K(dp, org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        zq zqVar = this.n;
        zqVar.a = K;
        zqVar.invalidateSelf();
        this.W0.e(-1, org.telegram.ui.ActionBar.h6.w0(i10, d6Var), -1);
    }

    @Override // ei.m
    public final int a() {
        return 0;
    }

    @Override // ei.m
    public final void c(boolean z10) {
        int i10 = (z10 || !this.U0) ? 8 : 0;
        ImageView imageView = this.V0;
        imageView.setVisibility(i10);
        int i11 = (z10 || !this.S0) ? 8 : 0;
        ImageView imageView2 = this.T0;
        imageView2.setVisibility(i11);
        if (z10) {
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
        }
    }

    @Override // ei.m
    public final void d(boolean z10) {
        if (!z10) {
            this.V0.setVisibility(this.U0 ? 0 : 8);
            this.T0.setVisibility(this.S0 ? 0 : 8);
        }
        ei.x3 x3Var = this.d1;
        if (x3Var != null) {
            x3Var.e(true);
        }
    }

    @Override // ei.m, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        RectF rectF = this.A0;
        ImageView imageView = this.Z0;
        if (imageView != null) {
            imageView.setTranslationX(-AndroidUtilities.dp((1.0f - this.o0) * 4.0f));
            boolean z10 = this instanceof org.telegram.ui.is0;
            imageView.setTranslationY((Utilities.clamp01((-this.k1.d(this.f.getEditText().getLineCount(), false)) + 4.0f) * AndroidUtilities.dp(3.0f) * (z10 ? 1 : -1)) + (z10 ? rectF.bottom - AndroidUtilities.dp(44.0f) : rectF.top));
        }
        float f10 = this.l1.f(this.n1, true ^ G());
        float e = this.m1.e(this.o1);
        if (f10 > 0.0f) {
            float a2 = this.i1.a(0.03f);
            int dp = AndroidUtilities.dp((1.0f - this.o0) * 4.0f);
            boolean z11 = this instanceof org.telegram.ui.is0;
            p6 p6Var = this.h1;
            RectF rectF2 = this.f1;
            if (z11) {
                f7 = 1.0f;
                rectF2.set(AndroidUtilities.dp(7.0f) + dp, rectF.bottom + AndroidUtilities.dp(10.0f), org.telegram.messenger.nk.b(p6Var.c(), AndroidUtilities.dp(11.0f), e, AndroidUtilities.dp(44.0f) + dp), rectF.bottom + AndroidUtilities.dp(42.0f));
            } else {
                f7 = 1.0f;
                rectF2.set(AndroidUtilities.dp(7.0f) + dp, rectF.top - AndroidUtilities.dp(42.0f), org.telegram.messenger.nk.b(p6Var.c(), AndroidUtilities.dp(11.0f), e, AndroidUtilities.dp(44.0f) + dp), rectF.top - AndroidUtilities.dp(10.0f));
            }
            if (f10 < f7) {
                canvas.saveLayerAlpha(rectF2, (int) (f10 * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.scale(a2, a2, rectF2.centerX(), rectF2.centerY());
            canvas.clipRect(rectF2);
            AndroidUtilities.dpf2(16.0f);
            bh.b bVar = this.h0;
            if (bVar != null) {
                if (this.j1 == null) {
                    dh.d c10 = bVar.c(this, null, false);
                    c10.o(fh.c.i(this.a));
                    c10.p(AndroidUtilities.dp(5.0f));
                    c10.q(AndroidUtilities.dp(16.0f));
                    this.j1 = c10;
                }
                Rect rect = AndroidUtilities.rectTmp2;
                rectF2.round(rect);
                rect.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
                this.j1.setBounds(rect);
                this.j1.draw(canvas);
            }
            int dp2 = (int) (rectF2.left + AndroidUtilities.dp(9.0f));
            int centerY = (int) (rectF2.centerY() - AndroidUtilities.dp(10.0f));
            int dp3 = (int) (rectF2.left + AndroidUtilities.dp(29.0f));
            int centerY2 = (int) (rectF2.centerY() + AndroidUtilities.dp(10.0f));
            Drawable drawable = this.g1;
            drawable.setBounds(dp2, centerY, dp3, centerY2);
            drawable.draw(canvas);
            p6Var.o(rectF2.left + AndroidUtilities.dp(37.0f), rectF2.top, rectF2.right, rectF2.bottom);
            p6Var.B = (int) (e * 255.0f);
            p6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // ei.m, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        RectF rectF = this.f1;
        f6 f6Var = this.l1;
        yc ycVar = this.i1;
        if (action == 0) {
            ycVar.c(f6Var.c > 0.0f && rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2) {
            if (ycVar.i && (f6Var.c <= 0.0f || !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
                ycVar.c(false);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && ycVar.i) {
            if (motionEvent.getAction() == 1) {
                A();
                this.h1.t(LocaleController.getString(this instanceof org.telegram.ui.is0 ? R.string.MoveCaptionDown : R.string.MoveCaptionUp), true, true);
            }
            ycVar.c(false);
            return true;
        }
        return ycVar.i || super.dispatchTouchEvent(motionEvent);
    }

    @Override // ei.m
    public final boolean f(View view) {
        return view != this.d1;
    }

    @Override // ei.m
    public int getCaptionDefaultLimit() {
        return MessagesController.getInstance(this.U).captionLengthLimitDefault;
    }

    @Override // ei.m
    public int getCaptionLimit() {
        return UserConfig.getInstance(this.U).isPremium() ? getCaptionPremiumLimit() : getCaptionDefaultLimit();
    }

    @Override // ei.m
    public int getCaptionPremiumLimit() {
        return MessagesController.getInstance(this.U).captionLengthLimitPremium;
    }

    @Override // ei.m
    public int getEditTextHeight() {
        return super.getEditTextHeight();
    }

    @Override // ei.m
    public int getEditTextLeft() {
        if (this.S0) {
            return AndroidUtilities.dp(31.0f);
        }
        return 0;
    }

    @Override // ei.m
    public int getEditTextStyle() {
        return 3;
    }

    @Override // ei.m
    public final void r(int i10) {
        this.d1.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), i10)) - AndroidUtilities.dp(10.0f)) * (this instanceof org.telegram.ui.is0 ? -1.0f : 1.0f));
    }

    @Override // ei.m
    public final void s(int i10, int i11) {
        CharSequence text = getText();
        F((i11 <= 2 || text == null || TextUtils.isEmpty(text.toString().trim())) ? false : true);
        if (this.s1) {
            if ((i10 < 3) != (i11 < 3)) {
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

    public void setOnTimerChange(Utilities.Callback<Integer> callback) {
        this.r1 = callback;
    }

    @Override // ei.m
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
    }

    public void setTimer(int i10) {
        this.b1 = i10;
        this.W0.d(i10 == Integer.MAX_VALUE ? 1 : Math.max(1, i10), this.b1 > 0, true);
        ei.x3 x3Var = this.d1;
        if (x3Var != null) {
            x3Var.e(true);
        }
    }

    @Override // ei.m
    public final void t() {
        Runnable runnable = this.e1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // ei.m
    public void u(float f7) {
        float f10 = 1.0f - f7;
        this.V0.setAlpha(f10);
        this.T0.setAlpha(f10);
    }

    @Override // ei.m
    public void x(int i10) {
        boolean z10 = this.m0;
        super.x(i10);
        if (z10 || !this.L.c()) {
            return;
        }
        B();
    }

    public final void z() {
        pg pgVar = this.p1;
        AndroidUtilities.cancelRunOnUIThread(pgVar);
        boolean shouldShowMoveCaptionHint = MessagesController.getInstance(this.U).shouldShowMoveCaptionHint();
        this.o1 = shouldShowMoveCaptionHint;
        if (shouldShowMoveCaptionHint) {
            MessagesController.getInstance(this.U).incrementMoveCaptionHint();
            invalidate();
            AndroidUtilities.runOnUIThread(pgVar, 5000L);
        }
    }
}
