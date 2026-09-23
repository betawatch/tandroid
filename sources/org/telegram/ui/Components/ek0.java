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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ek0 extends FrameLayout {
    public boolean E;
    public yh.i8 F;
    public final bk0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final bk0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final /* synthetic */ gk0 P;
    public final dk0 a;
    public final dk0 b;
    public final dk0 c;
    public final ImageReceiver d;
    public zg.p0 e;
    public rg.b1 f;
    public float h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek0(gk0 gk0Var, Context context) {
        super(context);
        this.P = gk0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.x = true;
        this.G = new bk0(this, 0);
        this.I = 1.0f;
        int i10 = 1;
        this.K = new bk0(this, i10);
        this.O = true;
        dk0 dk0Var = new dk0(this, context, 0);
        this.a = dk0Var;
        dk0 dk0Var2 = new dk0(this, context, i10);
        this.b = dk0Var2;
        dk0Var.getImageReceiver().setAutoRepeat(0);
        dk0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        dk0 dk0Var3 = new dk0(this, context, 2);
        this.c = dk0Var3;
        addView(dk0Var, w7.x5.e(34, 34, 17));
        addView(dk0Var3, w7.x5.e(34, 34, 17));
        addView(dk0Var2, w7.x5.e(34, 34, 17));
        if (gk0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        dk0Var.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        dk0Var2.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        dk0Var2.a.setAutoRepeat(0);
        dk0Var2.a.setAllowStartAnimation(false);
        dk0Var2.a.setAllowStartLottieAnimation(false);
        dk0Var3.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    public static void a(ek0 ek0Var, zg.p0 p0Var, int i10) {
        dk0 dk0Var = ek0Var.c;
        dk0 dk0Var2 = ek0Var.a;
        dk0 dk0Var3 = ek0Var.b;
        gk0 gk0Var = ek0Var.P;
        ek0Var.f(p0Var, false);
        zg.p0 p0Var2 = ek0Var.e;
        if (p0Var2 != null && p0Var2.equals(p0Var)) {
            ek0Var.y = i10;
            ek0Var.e(p0Var);
            return;
        }
        int i11 = gk0Var.J;
        org.telegram.ui.ActionBar.d6 d6Var = gk0Var.k0;
        int i12 = gk0Var.M0;
        boolean isPremium = UserConfig.getInstance(i11).isPremium();
        boolean z10 = (i12 == 3 && !isPremium) || (i12 == 5 && p0Var.d && !isPremium);
        ek0Var.H = z10;
        if (z10 && ek0Var.f == null) {
            rg.b1 b1Var = new rg.b1(ek0Var.getContext(), 1, null);
            ek0Var.f = b1Var;
            b1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ek0Var.f.setImageReceiver(dk0Var3.getImageReceiver());
            ek0Var.addView(ek0Var.f, w7.x5.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        rg.b1 b1Var2 = ek0Var.f;
        if (b1Var2 != null) {
            b1Var2.setVisibility(ek0Var.H ? 0 : 8);
        }
        ek0Var.d();
        ek0Var.e = p0Var;
        ek0Var.r = p0Var.a || (p0Var.f != null && ((gk0Var.q() || gk0Var.G0) && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)));
        if (i12 == 4 || ek0Var.e.b) {
            ek0Var.r = false;
        }
        zg.p0 p0Var3 = ek0Var.e;
        if (p0Var3.a || p0Var3.f != null) {
            ek0Var.e(p0Var);
            dk0Var.setAnimatedEmojiDrawable(null);
            if (dk0Var2.getImageReceiver().getLottieAnimation() != null) {
                dk0Var2.getImageReceiver().getLottieAnimation().N(0, false, false);
            }
            rg.b1 b1Var3 = ek0Var.f;
            if (b1Var3 != null) {
                b1Var3.setAnimatedEmojiDrawable(null);
            }
        } else {
            dk0Var.getImageReceiver().clearImage();
            dk0Var3.getImageReceiver().clearImage();
            q5 q5Var = new q5(4, gk0Var.J, ek0Var.e.g);
            q5 q5Var2 = new q5(3, gk0Var.J, ek0Var.e.g);
            if (i12 == 1 || i12 == 2 || i12 == 4) {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                q5Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
                q5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
            } else {
                int i13 = org.telegram.ui.ActionBar.h6.v6;
                int v02 = org.telegram.ui.ActionBar.h6.v0(i13, d6Var);
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                q5Var.setColorFilter(new PorterDuffColorFilter(v02, mode2));
                q5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i13, d6Var), mode2));
            }
            dk0Var.setAnimatedEmojiDrawable(q5Var);
            dk0Var3.setAnimatedEmojiDrawable(q5Var2);
            rg.b1 b1Var4 = ek0Var.f;
            if (b1Var4 != null) {
                b1Var4.setAnimatedEmojiDrawable(q5Var2);
            }
        }
        ek0Var.setFocusable(true);
        boolean z11 = ek0Var.r;
        ek0Var.s = z11;
        if (z11) {
            ek0Var.v = false;
            dk0Var2.setVisibility(0);
            dk0Var3.setVisibility(8);
        } else {
            dk0Var2.setVisibility(8);
            dk0Var3.setVisibility(0);
            ek0Var.v = true;
        }
        ViewGroup.LayoutParams layoutParams = dk0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = dk0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = dk0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = dk0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        dk0 dk0Var = this.b;
        q5 q5Var = dk0Var.e;
        ImageReceiver imageReceiver = q5Var != null ? q5Var.k : dk0Var.a;
        if (imageReceiver == null || imageReceiver.getLottieAnimation() == null) {
            return;
        }
        gk0 gk0Var = this.P;
        if (gk0Var.x0 != null || this.N || !gk0Var.G0) {
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
            ofFloat.addUpdateListener(new i70(this, 9));
            this.J.setDuration(150L);
            this.J.setInterpolator(rr.h);
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
        gk0 gk0Var = this.P;
        dk0 dk0Var = this.b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            dk0 dk0Var2 = this.a;
            if (dk0Var2.getImageReceiver().getLottieAnimation() != null && !dk0Var2.getImageReceiver().getLottieAnimation().y()) {
                dk0Var2.getImageReceiver().getLottieAnimation().stop();
                if (gk0Var.j0) {
                    dk0Var2.getImageReceiver().getLottieAnimation().N(0, false, true);
                } else {
                    dk0Var2.getImageReceiver().getLottieAnimation().N(dk0Var2.getImageReceiver().getLottieAnimation().e[0] - 1, false, true);
                }
            }
            dk0Var.setVisibility(4);
            dk0Var2.setVisibility(0);
            this.v = false;
            dk0Var.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
            dk0Var.setScaleX(this.I * (this.w ? 0.76f : 1.0f));
        } else {
            dk0Var.animate().cancel();
            if (gk0Var.N0) {
                dk0Var.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
                dk0Var.setScaleX(this.I * (this.w ? 0.76f : 1.0f));
            } else {
                dk0Var.setScaleY(0.0f);
                dk0Var.setScaleX(0.0f);
            }
        }
        this.n = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        ai.l4 l4Var;
        if (this.w && this.x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            zg.p0 p0Var = this.e;
            gk0 gk0Var = this.P;
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, (p0Var == null || !p0Var.a) ? gk0Var.H0 : gk0Var.I0);
        }
        q5 q5Var = this.b.e;
        if (q5Var != null && (l4Var = q5Var.k) != null) {
            if (this.y == 0) {
                l4Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                l4Var.setRoundRadius(this.w ? AndroidUtilities.dp(6.0f) : 0);
            }
        }
        zg.p0 p0Var2 = this.e;
        if (p0Var2 != null && p0Var2.a && this.F != null && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            yi0 lottieAnimation = this.a.getImageReceiver().getLottieAnimation();
            this.F.j = (int) (r2.b.size() * ((lottieAnimation == null || (i10 = lottieAnimation.a0) <= 30) ? 0.0f : Utilities.clamp01((i10 - 30) / 30.0f)));
            this.F.g(rectF);
            this.F.d();
            this.F.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(zg.p0 p0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        gk0 gk0Var = this.P;
        int i10 = gk0Var.M0;
        dk0 dk0Var = this.a;
        dk0 dk0Var2 = this.b;
        if (p0Var != null && p0Var.a) {
            dk0Var.getImageReceiver().setImageBitmap(new yi0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            dk0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                this.F = new yh.i8(1, SharedConfig.getDevicePerformanceClass() == 2 ? 45 : 18);
                return;
            }
            return;
        }
        if (i10 == 4 && p0Var != null && p0Var.f != null) {
            dk0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(p0Var.f));
            dk0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(p0Var.f));
            return;
        }
        zg.p0 p0Var2 = this.e;
        if (p0Var2.b) {
            TLRPC.Document effectDocument = MessagesController.getInstance(gk0Var.J).getEffectDocument(this.e.g);
            dk0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(effectDocument), "60_60_firstframe", null, null, this.r ? null : DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.h6.m6, 0.2f), 0L, "tgs", this.e, 0);
            return;
        }
        if (p0Var2.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(gk0Var.J).getReactionsMap().get(this.e.f);
            if (tL_availableReaction2 != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.h6.m6, 0.2f);
                if (!LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) || i10 == 4) {
                    tL_availableReaction = tL_availableReaction2;
                    if (SharedConfig.getDevicePerformanceClass() <= 0 || i10 == 4) {
                        dk0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                    } else {
                        dk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", p0Var, 0);
                        dk0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                    }
                } else {
                    tL_availableReaction = tL_availableReaction2;
                    dk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", p0Var, 0);
                    dk0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                }
                if (dk0Var.getImageReceiver().getLottieAnimation() != null) {
                    dk0Var.getImageReceiver().getLottieAnimation().N(0, false, true);
                }
                this.c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb, 0L, "tgs", p0Var, 0);
                ImageReceiver imageReceiver = this.d;
                imageReceiver.setAllowStartLottieAnimation(false);
                MediaDataController.getInstance(gk0Var.J).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.l0.a());
            }
            rg.b1 b1Var = this.f;
            if (b1Var != null) {
                b1Var.setImageReceiver(dk0Var2.getImageReceiver());
            }
        }
    }

    public final void f(zg.p0 p0Var, boolean z10) {
        boolean z11 = this.w;
        boolean contains = this.P.d0.contains(p0Var);
        this.w = contains;
        if (contains != z11) {
            dk0 dk0Var = this.a;
            dk0 dk0Var2 = this.b;
            if (z10) {
                ViewPropertyAnimator duration = dk0Var2.animate().scaleX(this.I * (this.w ? 0.76f : 1.0f)).scaleY(this.I * (this.w ? 0.76f : 1.0f)).setDuration(240L);
                rr rrVar = rr.h;
                duration.setInterpolator(rrVar).start();
                dk0Var.animate().scaleX(this.I * (this.w ? 0.76f : 1.0f)).scaleY(this.I * (this.w ? 0.76f : 1.0f)).setDuration(240L).setInterpolator(rrVar).start();
            } else {
                dk0Var2.setScaleX(this.I * (contains ? 0.76f : 1.0f));
                dk0Var2.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
                dk0Var.setScaleX(this.I * (this.w ? 0.76f : 1.0f));
                dk0Var.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
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
        zg.p0 p0Var = this.e;
        if (p0Var != null) {
            String str = p0Var.f;
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
        fk0 fk0Var;
        if (this.O) {
            gk0 gk0Var = this.P;
            if (gk0Var.Q == null) {
                int action = motionEvent.getAction();
                bk0 bk0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = gk0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((fk0Var = gk0Var.g0) == null || fk0Var.j())) {
                        AndroidUtilities.runOnUIThread(bk0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                int i11 = 2;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((gk0Var.l0 == null || gk0Var.n0 > 0.8f) && gk0Var.g0 != null)) {
                    gk0Var.r0 = true;
                    if (System.currentTimeMillis() - gk0Var.s0 > 300) {
                        gk0Var.s0 = System.currentTimeMillis();
                        gk0Var.g0.h(this, this.e, gk0Var.n0 > 0.8f, false);
                    }
                }
                if (!gk0Var.r0 && gk0Var.l0 != null) {
                    gk0Var.o0 = 0.0f;
                    float f7 = gk0Var.n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    gk0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new uj0(gk0Var, f7));
                    gk0Var.Q.addListener(new ci.u5(gk0Var, i11));
                    gk0Var.Q.setDuration(150L);
                    gk0Var.Q.setInterpolator(rr.f);
                    gk0Var.Q.start();
                }
                AndroidUtilities.cancelRunOnUIThread(bk0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
