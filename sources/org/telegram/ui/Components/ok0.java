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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class ok0 extends FrameLayout {
    public boolean E;
    public yh.i8 F;
    public final lk0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final lk0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final /* synthetic */ qk0 P;
    public final nk0 a;
    public final nk0 b;
    public final nk0 c;
    public final ImageReceiver d;
    public zg.o0 e;
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
    public ok0(qk0 qk0Var, Context context) {
        super(context);
        this.P = qk0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.x = true;
        this.G = new lk0(this, 0);
        this.I = 1.0f;
        int i10 = 1;
        this.K = new lk0(this, i10);
        this.O = true;
        nk0 nk0Var = new nk0(this, context, 0);
        this.a = nk0Var;
        nk0 nk0Var2 = new nk0(this, context, i10);
        this.b = nk0Var2;
        nk0Var.getImageReceiver().setAutoRepeat(0);
        nk0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        nk0 nk0Var3 = new nk0(this, context, 2);
        this.c = nk0Var3;
        addView(nk0Var, w7.y5.e(34, 34, 17));
        addView(nk0Var3, w7.y5.e(34, 34, 17));
        addView(nk0Var2, w7.y5.e(34, 34, 17));
        if (qk0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        nk0Var.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        nk0Var2.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        nk0Var2.a.setAutoRepeat(0);
        nk0Var2.a.setAllowStartAnimation(false);
        nk0Var2.a.setAllowStartLottieAnimation(false);
        nk0Var3.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    public static void a(ok0 ok0Var, zg.o0 o0Var, int i10) {
        nk0 nk0Var = ok0Var.c;
        nk0 nk0Var2 = ok0Var.a;
        nk0 nk0Var3 = ok0Var.b;
        qk0 qk0Var = ok0Var.P;
        ok0Var.f(o0Var, false);
        zg.o0 o0Var2 = ok0Var.e;
        if (o0Var2 != null && o0Var2.equals(o0Var)) {
            ok0Var.y = i10;
            ok0Var.e(o0Var);
            return;
        }
        int i11 = qk0Var.J;
        org.telegram.ui.ActionBar.e6 e6Var = qk0Var.k0;
        int i12 = qk0Var.M0;
        boolean isPremium = UserConfig.getInstance(i11).isPremium();
        boolean z10 = (i12 == 3 && !isPremium) || (i12 == 5 && o0Var.d && !isPremium);
        ok0Var.H = z10;
        if (z10 && ok0Var.f == null) {
            rg.b1 b1Var = new rg.b1(ok0Var.getContext(), 1, null);
            ok0Var.f = b1Var;
            b1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ok0Var.f.setImageReceiver(nk0Var3.getImageReceiver());
            ok0Var.addView(ok0Var.f, w7.y5.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        rg.b1 b1Var2 = ok0Var.f;
        if (b1Var2 != null) {
            b1Var2.setVisibility(ok0Var.H ? 0 : 8);
        }
        ok0Var.d();
        ok0Var.e = o0Var;
        ok0Var.r = o0Var.a || (o0Var.f != null && ((qk0Var.q() || qk0Var.G0) && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)));
        if (i12 == 4 || ok0Var.e.b) {
            ok0Var.r = false;
        }
        zg.o0 o0Var3 = ok0Var.e;
        if (o0Var3.a || o0Var3.f != null) {
            ok0Var.e(o0Var);
            nk0Var.setAnimatedEmojiDrawable(null);
            if (nk0Var2.getImageReceiver().getLottieAnimation() != null) {
                nk0Var2.getImageReceiver().getLottieAnimation().N(0, false, false);
            }
            rg.b1 b1Var3 = ok0Var.f;
            if (b1Var3 != null) {
                b1Var3.setAnimatedEmojiDrawable(null);
            }
        } else {
            nk0Var.getImageReceiver().clearImage();
            nk0Var3.getImageReceiver().clearImage();
            q5 q5Var = new q5(4, qk0Var.J, ok0Var.e.g);
            q5 q5Var2 = new q5(3, qk0Var.J, ok0Var.e.g);
            if (i12 == 1 || i12 == 2 || i12 == 4) {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                q5Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
                q5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
            } else {
                int i13 = org.telegram.ui.ActionBar.j6.v6;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i13, e6Var);
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                q5Var.setColorFilter(new PorterDuffColorFilter(v02, mode2));
                q5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i13, e6Var), mode2));
            }
            nk0Var.setAnimatedEmojiDrawable(q5Var);
            nk0Var3.setAnimatedEmojiDrawable(q5Var2);
            rg.b1 b1Var4 = ok0Var.f;
            if (b1Var4 != null) {
                b1Var4.setAnimatedEmojiDrawable(q5Var2);
            }
        }
        ok0Var.setFocusable(true);
        boolean z11 = ok0Var.r;
        ok0Var.s = z11;
        if (z11) {
            ok0Var.v = false;
            nk0Var2.setVisibility(0);
            nk0Var3.setVisibility(8);
        } else {
            nk0Var2.setVisibility(8);
            nk0Var3.setVisibility(0);
            ok0Var.v = true;
        }
        ViewGroup.LayoutParams layoutParams = nk0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = nk0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = nk0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = nk0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        nk0 nk0Var = this.b;
        q5 q5Var = nk0Var.e;
        ImageReceiver imageReceiver = q5Var != null ? q5Var.k : nk0Var.a;
        if (imageReceiver == null || imageReceiver.getLottieAnimation() == null) {
            return;
        }
        qk0 qk0Var = this.P;
        if (qk0Var.x0 != null || this.N || !qk0Var.G0) {
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
            ofFloat.addUpdateListener(new q70(this, 9));
            this.J.setDuration(150L);
            this.J.setInterpolator(qr.h);
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
        qk0 qk0Var = this.P;
        nk0 nk0Var = this.b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            nk0 nk0Var2 = this.a;
            if (nk0Var2.getImageReceiver().getLottieAnimation() != null && !nk0Var2.getImageReceiver().getLottieAnimation().y()) {
                nk0Var2.getImageReceiver().getLottieAnimation().stop();
                if (qk0Var.j0) {
                    nk0Var2.getImageReceiver().getLottieAnimation().N(0, false, true);
                } else {
                    nk0Var2.getImageReceiver().getLottieAnimation().N(nk0Var2.getImageReceiver().getLottieAnimation().e[0] - 1, false, true);
                }
            }
            nk0Var.setVisibility(4);
            nk0Var2.setVisibility(0);
            this.v = false;
            nk0Var.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
            nk0Var.setScaleX(this.I * (this.w ? 0.76f : 1.0f));
        } else {
            nk0Var.animate().cancel();
            if (qk0Var.N0) {
                nk0Var.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
                nk0Var.setScaleX(this.I * (this.w ? 0.76f : 1.0f));
            } else {
                nk0Var.setScaleY(0.0f);
                nk0Var.setScaleX(0.0f);
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
            zg.o0 o0Var = this.e;
            qk0 qk0Var = this.P;
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, (o0Var == null || !o0Var.a) ? qk0Var.H0 : qk0Var.I0);
        }
        q5 q5Var = this.b.e;
        if (q5Var != null && (l4Var = q5Var.k) != null) {
            if (this.y == 0) {
                l4Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                l4Var.setRoundRadius(this.w ? AndroidUtilities.dp(6.0f) : 0);
            }
        }
        zg.o0 o0Var2 = this.e;
        if (o0Var2 != null && o0Var2.a && this.F != null && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            ij0 lottieAnimation = this.a.getImageReceiver().getLottieAnimation();
            this.F.j = (int) (r2.b.size() * ((lottieAnimation == null || (i10 = lottieAnimation.a0) <= 30) ? 0.0f : Utilities.clamp01((i10 - 30) / 30.0f)));
            this.F.g(rectF);
            this.F.d();
            this.F.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(zg.o0 o0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        qk0 qk0Var = this.P;
        int i10 = qk0Var.M0;
        nk0 nk0Var = this.a;
        nk0 nk0Var2 = this.b;
        if (o0Var != null && o0Var.a) {
            nk0Var.getImageReceiver().setImageBitmap(new ij0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            nk0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                this.F = new yh.i8(1, SharedConfig.getDevicePerformanceClass() == 2 ? 45 : 18);
                return;
            }
            return;
        }
        if (i10 == 4 && o0Var != null && o0Var.f != null) {
            nk0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(o0Var.f));
            nk0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(o0Var.f));
            return;
        }
        zg.o0 o0Var2 = this.e;
        if (o0Var2.b) {
            TLRPC.Document effectDocument = MessagesController.getInstance(qk0Var.J).getEffectDocument(this.e.g);
            nk0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(effectDocument), "60_60_firstframe", null, null, this.r ? null : DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.j6.m6, 0.2f), 0L, "tgs", this.e, 0);
            return;
        }
        if (o0Var2.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(qk0Var.J).getReactionsMap().get(this.e.f);
            if (tL_availableReaction2 != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.j6.m6, 0.2f);
                if (!LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) || i10 == 4) {
                    tL_availableReaction = tL_availableReaction2;
                    if (SharedConfig.getDevicePerformanceClass() <= 0 || i10 == 4) {
                        nk0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                    } else {
                        nk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", o0Var, 0);
                        nk0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                    }
                } else {
                    tL_availableReaction = tL_availableReaction2;
                    nk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", o0Var, 0);
                    nk0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                }
                if (nk0Var.getImageReceiver().getLottieAnimation() != null) {
                    nk0Var.getImageReceiver().getLottieAnimation().N(0, false, true);
                }
                this.c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb, 0L, "tgs", o0Var, 0);
                ImageReceiver imageReceiver = this.d;
                imageReceiver.setAllowStartLottieAnimation(false);
                MediaDataController.getInstance(qk0Var.J).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.k0.a());
            }
            rg.b1 b1Var = this.f;
            if (b1Var != null) {
                b1Var.setImageReceiver(nk0Var2.getImageReceiver());
            }
        }
    }

    public final void f(zg.o0 o0Var, boolean z10) {
        boolean z11 = this.w;
        boolean contains = this.P.d0.contains(o0Var);
        this.w = contains;
        if (contains != z11) {
            nk0 nk0Var = this.a;
            nk0 nk0Var2 = this.b;
            if (z10) {
                ViewPropertyAnimator duration = nk0Var2.animate().scaleX(this.I * (this.w ? 0.76f : 1.0f)).scaleY(this.I * (this.w ? 0.76f : 1.0f)).setDuration(240L);
                qr qrVar = qr.h;
                duration.setInterpolator(qrVar).start();
                nk0Var.animate().scaleX(this.I * (this.w ? 0.76f : 1.0f)).scaleY(this.I * (this.w ? 0.76f : 1.0f)).setDuration(240L).setInterpolator(qrVar).start();
            } else {
                nk0Var2.setScaleX(this.I * (contains ? 0.76f : 1.0f));
                nk0Var2.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
                nk0Var.setScaleX(this.I * (this.w ? 0.76f : 1.0f));
                nk0Var.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
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
        zg.o0 o0Var = this.e;
        if (o0Var != null) {
            String str = o0Var.f;
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
        pk0 pk0Var;
        if (this.O) {
            qk0 qk0Var = this.P;
            if (qk0Var.Q == null) {
                int action = motionEvent.getAction();
                lk0 lk0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = qk0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((pk0Var = qk0Var.g0) == null || pk0Var.j())) {
                        AndroidUtilities.runOnUIThread(lk0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                int i11 = 2;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((qk0Var.l0 == null || qk0Var.n0 > 0.8f) && qk0Var.g0 != null)) {
                    qk0Var.r0 = true;
                    if (System.currentTimeMillis() - qk0Var.s0 > 300) {
                        qk0Var.s0 = System.currentTimeMillis();
                        qk0Var.g0.h(this, this.e, qk0Var.n0 > 0.8f, false);
                    }
                }
                if (!qk0Var.r0 && qk0Var.l0 != null) {
                    qk0Var.o0 = 0.0f;
                    float f7 = qk0Var.n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    qk0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new ek0(qk0Var, f7));
                    qk0Var.Q.addListener(new ci.v5(qk0Var, i11));
                    qk0Var.Q.setDuration(150L);
                    qk0Var.Q.setInterpolator(qr.f);
                    qk0Var.Q.start();
                }
                AndroidUtilities.cancelRunOnUIThread(lk0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
