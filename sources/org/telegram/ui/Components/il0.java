package org.telegram.ui.Components;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class il0 extends FrameLayout {
    public boolean E;
    public yh.b8 F;
    public final fl0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final fl0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final /* synthetic */ kl0 P;
    public final hl0 a;
    public final hl0 b;
    public final hl0 c;
    public final ImageReceiver d;
    public zg.n0 e;
    public rg.c1 f;
    public float h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il0(kl0 kl0Var, Context context) {
        super(context);
        this.P = kl0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.x = true;
        this.G = new fl0(this, 0);
        this.I = 1.0f;
        int i10 = 1;
        this.K = new fl0(this, i10);
        this.O = true;
        hl0 hl0Var = new hl0(this, context, 0);
        this.a = hl0Var;
        hl0 hl0Var2 = new hl0(this, context, i10);
        this.b = hl0Var2;
        hl0Var.getImageReceiver().setAutoRepeat(0);
        hl0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        hl0 hl0Var3 = new hl0(this, context, 2);
        this.c = hl0Var3;
        addView(hl0Var, w7.x5.e(34, 34, 17));
        addView(hl0Var3, w7.x5.e(34, 34, 17));
        addView(hl0Var2, w7.x5.e(34, 34, 17));
        if (kl0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        hl0Var.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        hl0Var2.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        hl0Var2.a.setAutoRepeat(0);
        hl0Var2.a.setAllowStartAnimation(false);
        hl0Var2.a.setAllowStartLottieAnimation(false);
        hl0Var3.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    public static void a(il0 il0Var, zg.n0 n0Var, int i10) {
        hl0 hl0Var = il0Var.c;
        hl0 hl0Var2 = il0Var.a;
        hl0 hl0Var3 = il0Var.b;
        kl0 kl0Var = il0Var.P;
        il0Var.f(n0Var, false);
        zg.n0 n0Var2 = il0Var.e;
        if (n0Var2 != null && n0Var2.equals(n0Var)) {
            il0Var.y = i10;
            il0Var.e(n0Var);
            return;
        }
        int i11 = kl0Var.J;
        org.telegram.ui.ActionBar.e6 e6Var = kl0Var.k0;
        int i12 = kl0Var.M0;
        boolean isPremium = UserConfig.getInstance(i11).isPremium();
        boolean z10 = (i12 == 3 && !isPremium) || (i12 == 5 && n0Var.d && !isPremium);
        il0Var.H = z10;
        if (z10 && il0Var.f == null) {
            rg.c1 c1Var = new rg.c1(il0Var.getContext(), 1, null);
            il0Var.f = c1Var;
            c1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            il0Var.f.setImageReceiver(hl0Var3.getImageReceiver());
            il0Var.addView(il0Var.f, w7.x5.a(18.0f, 8.0f, 8.0f, 0.0f, 0.0f, 18, 17));
        }
        rg.c1 c1Var2 = il0Var.f;
        if (c1Var2 != null) {
            c1Var2.setVisibility(il0Var.H ? 0 : 8);
        }
        il0Var.d();
        il0Var.e = n0Var;
        il0Var.r = n0Var.a || (n0Var.f != null && ((kl0Var.q() || kl0Var.G0) && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)));
        if (i12 == 4 || il0Var.e.b) {
            il0Var.r = false;
        }
        zg.n0 n0Var3 = il0Var.e;
        if (n0Var3.a || n0Var3.f != null) {
            il0Var.e(n0Var);
            hl0Var.setAnimatedEmojiDrawable(null);
            if (hl0Var2.getImageReceiver().getLottieAnimation() != null) {
                hl0Var2.getImageReceiver().getLottieAnimation().N(0, false, false);
            }
            rg.c1 c1Var3 = il0Var.f;
            if (c1Var3 != null) {
                c1Var3.setAnimatedEmojiDrawable(null);
            }
        } else {
            hl0Var.getImageReceiver().clearImage();
            hl0Var3.getImageReceiver().clearImage();
            s5 s5Var = new s5(4, kl0Var.J, il0Var.e.g);
            s5 s5Var2 = new s5(3, kl0Var.J, il0Var.e.g);
            if (i12 == 1 || i12 == 2 || i12 == 4) {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                s5Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
                s5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
            } else {
                int i13 = org.telegram.ui.ActionBar.i6.v6;
                int w02 = org.telegram.ui.ActionBar.i6.w0(i13, e6Var);
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                s5Var.setColorFilter(new PorterDuffColorFilter(w02, mode2));
                s5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i13, e6Var), mode2));
            }
            hl0Var.setAnimatedEmojiDrawable(s5Var);
            hl0Var3.setAnimatedEmojiDrawable(s5Var2);
            rg.c1 c1Var4 = il0Var.f;
            if (c1Var4 != null) {
                c1Var4.setAnimatedEmojiDrawable(s5Var2);
            }
        }
        il0Var.setFocusable(true);
        boolean z11 = il0Var.r;
        il0Var.s = z11;
        if (z11) {
            il0Var.v = false;
            hl0Var2.setVisibility(0);
            hl0Var3.setVisibility(8);
        } else {
            hl0Var2.setVisibility(8);
            hl0Var3.setVisibility(0);
            il0Var.v = true;
        }
        ViewGroup.LayoutParams layoutParams = hl0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = hl0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = hl0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = hl0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        hl0 hl0Var = this.b;
        s5 s5Var = hl0Var.e;
        ImageReceiver imageReceiver = s5Var != null ? s5Var.k : hl0Var.a;
        if (imageReceiver == null || imageReceiver.getLottieAnimation() == null) {
            return;
        }
        kl0 kl0Var = this.P;
        if (kl0Var.x0 != null || this.N || !kl0Var.G0) {
            imageReceiver.getLottieAnimation().start();
        } else if (imageReceiver.getLottieAnimation().a0 <= 2) {
            imageReceiver.getLottieAnimation().stop();
        }
    }

    public final void c(int i10) {
        if (!this.P.j0) {
            d();
            this.n = true;
            if (this.r) {
                return;
            }
            this.b.setVisibility(0);
            this.b.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
            this.b.setScaleX(this.I * (this.w ? 0.76f : 1.0f));
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        if (!this.r) {
            if (this.n) {
                return;
            }
            this.I = 0.0f;
            this.b.setScaleX(0.0f);
            this.b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new j80(this, 10));
            this.J.setDuration(150L);
            this.J.setInterpolator(hs.h);
            this.J.setStartDelay((long) (i10 * this.P.c));
            this.J.start();
            this.n = true;
            return;
        }
        if (this.a.getImageReceiver().getLottieAnimation() == null || this.a.getImageReceiver().getLottieAnimation().y() || this.n) {
            if (this.a.getImageReceiver().getLottieAnimation() != null && this.n && !this.a.getImageReceiver().getLottieAnimation().k0 && !this.a.getImageReceiver().getLottieAnimation().y()) {
                this.a.getImageReceiver().getLottieAnimation().N(this.a.getImageReceiver().getLottieAnimation().e[0] - 1, false, false);
            }
            this.b.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
            this.b.setScaleX(this.I * (this.w ? 0.76f : 1.0f));
            return;
        }
        this.n = true;
        if (i10 == 0) {
            this.E = false;
            this.a.getImageReceiver().getLottieAnimation().stop();
            this.a.getImageReceiver().getLottieAnimation().N(0, false, false);
            this.G.run();
            return;
        }
        this.E = true;
        this.a.getImageReceiver().getLottieAnimation().stop();
        this.a.getImageReceiver().getLottieAnimation().N(0, false, false);
        AndroidUtilities.runOnUIThread(this.G, i10);
    }

    public final void d() {
        boolean z10 = this.r;
        kl0 kl0Var = this.P;
        hl0 hl0Var = this.b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            hl0 hl0Var2 = this.a;
            if (hl0Var2.getImageReceiver().getLottieAnimation() != null && !hl0Var2.getImageReceiver().getLottieAnimation().y()) {
                hl0Var2.getImageReceiver().getLottieAnimation().stop();
                if (kl0Var.j0) {
                    hl0Var2.getImageReceiver().getLottieAnimation().N(0, false, true);
                } else {
                    hl0Var2.getImageReceiver().getLottieAnimation().N(hl0Var2.getImageReceiver().getLottieAnimation().e[0] - 1, false, true);
                }
            }
            hl0Var.setVisibility(4);
            hl0Var2.setVisibility(0);
            this.v = false;
            hl0Var.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
            hl0Var.setScaleX(this.I * (this.w ? 0.76f : 1.0f));
        } else {
            hl0Var.animate().cancel();
            if (kl0Var.N0) {
                hl0Var.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
                hl0Var.setScaleX(this.I * (this.w ? 0.76f : 1.0f));
            } else {
                hl0Var.setScaleY(0.0f);
                hl0Var.setScaleX(0.0f);
            }
        }
        this.n = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        ai.m4 m4Var;
        if (this.w && this.x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            zg.n0 n0Var = this.e;
            kl0 kl0Var = this.P;
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, (n0Var == null || !n0Var.a) ? kl0Var.H0 : kl0Var.I0);
        }
        s5 s5Var = this.b.e;
        if (s5Var != null && (m4Var = s5Var.k) != null) {
            if (this.y == 0) {
                m4Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                m4Var.setRoundRadius(this.w ? AndroidUtilities.dp(6.0f) : 0);
            }
        }
        zg.n0 n0Var2 = this.e;
        if (n0Var2 != null && n0Var2.a && this.F != null && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            ck0 lottieAnimation = this.a.getImageReceiver().getLottieAnimation();
            this.F.j = (int) (r2.b.size() * ((lottieAnimation == null || (i10 = lottieAnimation.a0) <= 30) ? 0.0f : Utilities.clamp01((i10 - 30) / 30.0f)));
            this.F.g(rectF);
            this.F.d();
            this.F.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(zg.n0 n0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        kl0 kl0Var = this.P;
        int i10 = kl0Var.M0;
        hl0 hl0Var = this.a;
        hl0 hl0Var2 = this.b;
        if (n0Var != null && n0Var.a) {
            hl0Var.getImageReceiver().setImageBitmap(new ck0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            hl0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                this.F = new yh.b8(1, SharedConfig.getDevicePerformanceClass() == 2 ? 45 : 18);
                return;
            }
            return;
        }
        if (i10 == 4 && n0Var != null && n0Var.f != null) {
            hl0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(n0Var.f));
            hl0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(n0Var.f));
            return;
        }
        zg.n0 n0Var2 = this.e;
        if (n0Var2.b) {
            TLRPC.Document effectDocument = MessagesController.getInstance(kl0Var.J).getEffectDocument(this.e.g);
            hl0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(effectDocument), "60_60_firstframe", null, null, this.r ? null : DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.i6.m6, 0.2f), 0L, "tgs", this.e, 0);
            return;
        }
        if (n0Var2.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(kl0Var.J).getReactionsMap().get(this.e.f);
            if (tL_availableReaction2 != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.i6.m6, 0.2f);
                if (!LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) || i10 == 4) {
                    tL_availableReaction = tL_availableReaction2;
                    if (SharedConfig.getDevicePerformanceClass() <= 0 || i10 == 4) {
                        hl0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                    } else {
                        hl0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", n0Var, 0);
                        hl0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                    }
                } else {
                    tL_availableReaction = tL_availableReaction2;
                    hl0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", n0Var, 0);
                    hl0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                }
                if (hl0Var.getImageReceiver().getLottieAnimation() != null) {
                    hl0Var.getImageReceiver().getLottieAnimation().N(0, false, true);
                }
                this.c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb, 0L, "tgs", n0Var, 0);
                ImageReceiver imageReceiver = this.d;
                imageReceiver.setAllowStartLottieAnimation(false);
                MediaDataController.getInstance(kl0Var.J).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.j0.a());
            }
            rg.c1 c1Var = this.f;
            if (c1Var != null) {
                c1Var.setImageReceiver(hl0Var2.getImageReceiver());
            }
        }
    }

    public final void f(zg.n0 n0Var, boolean z10) {
        boolean z11 = this.w;
        boolean contains = this.P.d0.contains(n0Var);
        this.w = contains;
        if (contains != z11) {
            hl0 hl0Var = this.a;
            hl0 hl0Var2 = this.b;
            if (z10) {
                ViewPropertyAnimator duration = hl0Var2.animate().scaleX(this.I * (this.w ? 0.76f : 1.0f)).scaleY(this.I * (this.w ? 0.76f : 1.0f)).setDuration(240L);
                hs hsVar = hs.h;
                duration.setInterpolator(hsVar).start();
                hl0Var.animate().scaleX(this.I * (this.w ? 0.76f : 1.0f)).scaleY(this.I * (this.w ? 0.76f : 1.0f)).setDuration(240L).setInterpolator(hsVar).start();
            } else {
                hl0Var2.setScaleX(this.I * (contains ? 0.76f : 1.0f));
                hl0Var2.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
                hl0Var.setScaleX(this.I * (this.w ? 0.76f : 1.0f));
                hl0Var.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        this.d.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        zg.n0 n0Var = this.e;
        if (n0Var != null) {
            String str = n0Var.f;
            if (str != null) {
                accessibilityNodeInfo.setText(str);
                accessibilityNodeInfo.setEnabled(true);
            } else {
                accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrCustomEmoji));
                accessibilityNodeInfo.setEnabled(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        jl0 jl0Var;
        if (this.O) {
            kl0 kl0Var = this.P;
            if (kl0Var.Q == null) {
                int action = motionEvent.getAction();
                fl0 fl0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = kl0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((jl0Var = kl0Var.g0) == null || jl0Var.o())) {
                        AndroidUtilities.runOnUIThread(fl0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                int i11 = 2;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((kl0Var.l0 == null || kl0Var.n0 > 0.8f) && kl0Var.g0 != null)) {
                    kl0Var.r0 = true;
                    if (System.currentTimeMillis() - kl0Var.s0 > 300) {
                        kl0Var.s0 = System.currentTimeMillis();
                        kl0Var.g0.m(this, this.e, kl0Var.n0 > 0.8f, false);
                    }
                }
                if (!kl0Var.r0 && kl0Var.l0 != null) {
                    kl0Var.o0 = 0.0f;
                    float f7 = kl0Var.n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    kl0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new yk0(kl0Var, f7));
                    kl0Var.Q.addListener(new ci.t5(kl0Var, i11));
                    kl0Var.Q.setDuration(150L);
                    kl0Var.Q.setInterpolator(hs.f);
                    kl0Var.Q.start();
                }
                AndroidUtilities.cancelRunOnUIThread(fl0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
