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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class nk0 extends FrameLayout {
    public boolean E;
    public xh.l8 F;
    public final kk0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final kk0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final /* synthetic */ pk0 P;
    public final mk0 a;
    public final mk0 b;
    public final mk0 c;
    public final ImageReceiver d;
    public yg.p0 e;
    public qg.e1 f;
    public float h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk0(pk0 pk0Var, Context context) {
        super(context);
        this.P = pk0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.x = true;
        this.G = new kk0(this, 0);
        this.I = 1.0f;
        int i10 = 1;
        this.K = new kk0(this, i10);
        this.O = true;
        mk0 mk0Var = new mk0(this, context, 0);
        this.a = mk0Var;
        mk0 mk0Var2 = new mk0(this, context, i10);
        this.b = mk0Var2;
        mk0Var.getImageReceiver().setAutoRepeat(0);
        mk0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        mk0 mk0Var3 = new mk0(this, context, 2);
        this.c = mk0Var3;
        addView(mk0Var, w7.a6.e(34, 34, 17));
        addView(mk0Var3, w7.a6.e(34, 34, 17));
        addView(mk0Var2, w7.a6.e(34, 34, 17));
        if (pk0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        mk0Var.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        mk0Var2.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        mk0Var2.a.setAutoRepeat(0);
        mk0Var2.a.setAllowStartAnimation(false);
        mk0Var2.a.setAllowStartLottieAnimation(false);
        mk0Var3.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    public static void a(nk0 nk0Var, yg.p0 p0Var, int i10) {
        mk0 mk0Var = nk0Var.c;
        mk0 mk0Var2 = nk0Var.a;
        mk0 mk0Var3 = nk0Var.b;
        pk0 pk0Var = nk0Var.P;
        nk0Var.f(p0Var, false);
        yg.p0 p0Var2 = nk0Var.e;
        if (p0Var2 != null && p0Var2.equals(p0Var)) {
            nk0Var.y = i10;
            nk0Var.e(p0Var);
            return;
        }
        int i11 = pk0Var.J;
        org.telegram.ui.ActionBar.f6 f6Var = pk0Var.k0;
        int i12 = pk0Var.M0;
        boolean isPremium = UserConfig.getInstance(i11).isPremium();
        boolean z10 = (i12 == 3 && !isPremium) || (i12 == 5 && p0Var.d && !isPremium);
        nk0Var.H = z10;
        if (z10 && nk0Var.f == null) {
            qg.e1 e1Var = new qg.e1(nk0Var.getContext(), 1, null);
            nk0Var.f = e1Var;
            e1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            nk0Var.f.setImageReceiver(mk0Var3.getImageReceiver());
            nk0Var.addView(nk0Var.f, w7.a6.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        qg.e1 e1Var2 = nk0Var.f;
        if (e1Var2 != null) {
            e1Var2.setVisibility(nk0Var.H ? 0 : 8);
        }
        nk0Var.d();
        nk0Var.e = p0Var;
        nk0Var.r = p0Var.a || (p0Var.f != null && ((pk0Var.q() || pk0Var.G0) && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)));
        if (i12 == 4 || nk0Var.e.b) {
            nk0Var.r = false;
        }
        yg.p0 p0Var3 = nk0Var.e;
        if (p0Var3.a || p0Var3.f != null) {
            nk0Var.e(p0Var);
            mk0Var.setAnimatedEmojiDrawable(null);
            if (mk0Var2.getImageReceiver().getLottieAnimation() != null) {
                mk0Var2.getImageReceiver().getLottieAnimation().N(0, false, false);
            }
            qg.e1 e1Var3 = nk0Var.f;
            if (e1Var3 != null) {
                e1Var3.setAnimatedEmojiDrawable(null);
            }
        } else {
            mk0Var.getImageReceiver().clearImage();
            mk0Var3.getImageReceiver().clearImage();
            p5 p5Var = new p5(4, pk0Var.J, nk0Var.e.g);
            p5 p5Var2 = new p5(3, pk0Var.J, nk0Var.e.g);
            if (i12 == 1 || i12 == 2 || i12 == 4) {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                p5Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
                p5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
            } else {
                int i13 = org.telegram.ui.ActionBar.j6.v6;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                p5Var.setColorFilter(new PorterDuffColorFilter(v02, mode2));
                p5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i13, f6Var), mode2));
            }
            mk0Var.setAnimatedEmojiDrawable(p5Var);
            mk0Var3.setAnimatedEmojiDrawable(p5Var2);
            qg.e1 e1Var4 = nk0Var.f;
            if (e1Var4 != null) {
                e1Var4.setAnimatedEmojiDrawable(p5Var2);
            }
        }
        nk0Var.setFocusable(true);
        boolean z11 = nk0Var.r;
        nk0Var.s = z11;
        if (z11) {
            nk0Var.v = false;
            mk0Var2.setVisibility(0);
            mk0Var3.setVisibility(8);
        } else {
            mk0Var2.setVisibility(8);
            mk0Var3.setVisibility(0);
            nk0Var.v = true;
        }
        ViewGroup.LayoutParams layoutParams = mk0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = mk0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = mk0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = mk0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        mk0 mk0Var = this.b;
        p5 p5Var = mk0Var.e;
        ImageReceiver imageReceiver = p5Var != null ? p5Var.k : mk0Var.a;
        if (imageReceiver == null || imageReceiver.getLottieAnimation() == null) {
            return;
        }
        pk0 pk0Var = this.P;
        if (pk0Var.x0 != null || this.N || !pk0Var.G0) {
            imageReceiver.getLottieAnimation().start();
        } else if (imageReceiver.getLottieAnimation().b0 <= 2) {
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
            ofFloat.addUpdateListener(new q70(this, 9));
            this.J.setDuration(150L);
            this.J.setInterpolator(wr.h);
            this.J.setStartDelay((long) (i10 * this.P.c));
            this.J.start();
            this.n = true;
            return;
        }
        if (this.a.getImageReceiver().getLottieAnimation() == null || this.a.getImageReceiver().getLottieAnimation().y() || this.n) {
            if (this.a.getImageReceiver().getLottieAnimation() != null && this.n && !this.a.getImageReceiver().getLottieAnimation().l0 && !this.a.getImageReceiver().getLottieAnimation().y()) {
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
        pk0 pk0Var = this.P;
        mk0 mk0Var = this.b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            mk0 mk0Var2 = this.a;
            if (mk0Var2.getImageReceiver().getLottieAnimation() != null && !mk0Var2.getImageReceiver().getLottieAnimation().y()) {
                mk0Var2.getImageReceiver().getLottieAnimation().stop();
                if (pk0Var.j0) {
                    mk0Var2.getImageReceiver().getLottieAnimation().N(0, false, true);
                } else {
                    mk0Var2.getImageReceiver().getLottieAnimation().N(mk0Var2.getImageReceiver().getLottieAnimation().e[0] - 1, false, true);
                }
            }
            mk0Var.setVisibility(4);
            mk0Var2.setVisibility(0);
            this.v = false;
            mk0Var.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
            mk0Var.setScaleX(this.I * (this.w ? 0.76f : 1.0f));
        } else {
            mk0Var.animate().cancel();
            if (pk0Var.N0) {
                mk0Var.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
                mk0Var.setScaleX(this.I * (this.w ? 0.76f : 1.0f));
            } else {
                mk0Var.setScaleY(0.0f);
                mk0Var.setScaleX(0.0f);
            }
        }
        this.n = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        gg.h1 h1Var;
        if (this.w && this.x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            yg.p0 p0Var = this.e;
            pk0 pk0Var = this.P;
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, (p0Var == null || !p0Var.a) ? pk0Var.H0 : pk0Var.I0);
        }
        p5 p5Var = this.b.e;
        if (p5Var != null && (h1Var = p5Var.k) != null) {
            if (this.y == 0) {
                h1Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                h1Var.setRoundRadius(this.w ? AndroidUtilities.dp(6.0f) : 0);
            }
        }
        yg.p0 p0Var2 = this.e;
        if (p0Var2 != null && p0Var2.a && this.F != null && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            hj0 lottieAnimation = this.a.getImageReceiver().getLottieAnimation();
            this.F.j = (int) (r2.b.size() * ((lottieAnimation == null || (i10 = lottieAnimation.b0) <= 30) ? 0.0f : Utilities.clamp01((i10 - 30) / 30.0f)));
            this.F.g(rectF);
            this.F.d();
            this.F.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(yg.p0 p0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        pk0 pk0Var = this.P;
        int i10 = pk0Var.M0;
        mk0 mk0Var = this.a;
        mk0 mk0Var2 = this.b;
        if (p0Var != null && p0Var.a) {
            mk0Var.getImageReceiver().setImageBitmap(new hj0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            mk0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                this.F = new xh.l8(1, SharedConfig.getDevicePerformanceClass() == 2 ? 45 : 18);
                return;
            }
            return;
        }
        if (i10 == 4 && p0Var != null && p0Var.f != null) {
            mk0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(p0Var.f));
            mk0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(p0Var.f));
            return;
        }
        yg.p0 p0Var2 = this.e;
        if (p0Var2.b) {
            TLRPC.Document effectDocument = MessagesController.getInstance(pk0Var.J).getEffectDocument(this.e.g);
            mk0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(effectDocument), "60_60_firstframe", null, null, this.r ? null : DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.j6.m6, 0.2f), 0L, "tgs", this.e, 0);
            return;
        }
        if (p0Var2.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(pk0Var.J).getReactionsMap().get(this.e.f);
            if (tL_availableReaction2 != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.j6.m6, 0.2f);
                if (!LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) || i10 == 4) {
                    tL_availableReaction = tL_availableReaction2;
                    if (SharedConfig.getDevicePerformanceClass() <= 0 || i10 == 4) {
                        mk0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                    } else {
                        mk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", p0Var, 0);
                        mk0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                    }
                } else {
                    tL_availableReaction = tL_availableReaction2;
                    mk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", p0Var, 0);
                    mk0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                }
                if (mk0Var.getImageReceiver().getLottieAnimation() != null) {
                    mk0Var.getImageReceiver().getLottieAnimation().N(0, false, true);
                }
                this.c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb, 0L, "tgs", p0Var, 0);
                ImageReceiver imageReceiver = this.d;
                imageReceiver.setAllowStartLottieAnimation(false);
                MediaDataController.getInstance(pk0Var.J).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), yg.l0.a());
            }
            qg.e1 e1Var = this.f;
            if (e1Var != null) {
                e1Var.setImageReceiver(mk0Var2.getImageReceiver());
            }
        }
    }

    public final void f(yg.p0 p0Var, boolean z10) {
        boolean z11 = this.w;
        boolean contains = this.P.d0.contains(p0Var);
        this.w = contains;
        if (contains != z11) {
            mk0 mk0Var = this.a;
            mk0 mk0Var2 = this.b;
            if (z10) {
                ViewPropertyAnimator duration = mk0Var2.animate().scaleX(this.I * (this.w ? 0.76f : 1.0f)).scaleY(this.I * (this.w ? 0.76f : 1.0f)).setDuration(240L);
                wr wrVar = wr.h;
                duration.setInterpolator(wrVar).start();
                mk0Var.animate().scaleX(this.I * (this.w ? 0.76f : 1.0f)).scaleY(this.I * (this.w ? 0.76f : 1.0f)).setDuration(240L).setInterpolator(wrVar).start();
            } else {
                mk0Var2.setScaleX(this.I * (contains ? 0.76f : 1.0f));
                mk0Var2.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
                mk0Var.setScaleX(this.I * (this.w ? 0.76f : 1.0f));
                mk0Var.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
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
        yg.p0 p0Var = this.e;
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
        ok0 ok0Var;
        if (this.O) {
            pk0 pk0Var = this.P;
            if (pk0Var.Q == null) {
                int action = motionEvent.getAction();
                kk0 kk0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = pk0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((ok0Var = pk0Var.g0) == null || ok0Var.j())) {
                        AndroidUtilities.runOnUIThread(kk0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                int i11 = 2;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((pk0Var.l0 == null || pk0Var.n0 > 0.8f) && pk0Var.g0 != null)) {
                    pk0Var.r0 = true;
                    if (System.currentTimeMillis() - pk0Var.s0 > 300) {
                        pk0Var.s0 = System.currentTimeMillis();
                        pk0Var.g0.l(this, this.e, pk0Var.n0 > 0.8f, false);
                    }
                }
                if (!pk0Var.r0 && pk0Var.l0 != null) {
                    pk0Var.o0 = 0.0f;
                    float f7 = pk0Var.n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    pk0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new dk0(pk0Var, f7));
                    pk0Var.Q.addListener(new bi.t6(pk0Var, i11));
                    pk0Var.Q.setDuration(150L);
                    pk0Var.Q.setInterpolator(wr.f);
                    pk0Var.Q.start();
                }
                AndroidUtilities.cancelRunOnUIThread(kk0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
