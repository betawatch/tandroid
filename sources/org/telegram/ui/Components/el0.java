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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class el0 extends FrameLayout {
    public boolean E;
    public zh.b8 F;
    public final bl0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final bl0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final /* synthetic */ gl0 P;
    public final dl0 a;
    public final dl0 b;
    public final dl0 c;
    public final ImageReceiver d;
    public ah.i1 e;
    public sg.c1 f;
    public float h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el0(gl0 gl0Var, Context context) {
        super(context);
        this.P = gl0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.x = true;
        this.G = new bl0(this, 0);
        this.I = 1.0f;
        int i10 = 1;
        this.K = new bl0(this, i10);
        this.O = true;
        dl0 dl0Var = new dl0(this, context, 0);
        this.a = dl0Var;
        dl0 dl0Var2 = new dl0(this, context, i10);
        this.b = dl0Var2;
        dl0Var.getImageReceiver().setAutoRepeat(0);
        dl0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        dl0 dl0Var3 = new dl0(this, context, 2);
        this.c = dl0Var3;
        addView(dl0Var, w7.z5.e(34, 34, 17));
        addView(dl0Var3, w7.z5.e(34, 34, 17));
        addView(dl0Var2, w7.z5.e(34, 34, 17));
        if (gl0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        dl0Var.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        dl0Var2.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        dl0Var2.a.setAutoRepeat(0);
        dl0Var2.a.setAllowStartAnimation(false);
        dl0Var2.a.setAllowStartLottieAnimation(false);
        dl0Var3.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    public static void a(el0 el0Var, ah.i1 i1Var, int i10) {
        dl0 dl0Var = el0Var.c;
        dl0 dl0Var2 = el0Var.a;
        dl0 dl0Var3 = el0Var.b;
        gl0 gl0Var = el0Var.P;
        el0Var.f(i1Var, false);
        ah.i1 i1Var2 = el0Var.e;
        if (i1Var2 != null && i1Var2.equals(i1Var)) {
            el0Var.y = i10;
            el0Var.e(i1Var);
            return;
        }
        int i11 = gl0Var.J;
        org.telegram.ui.ActionBar.c6 c6Var = gl0Var.k0;
        int i12 = gl0Var.M0;
        boolean isPremium = UserConfig.getInstance(i11).isPremium();
        boolean z10 = (i12 == 3 && !isPremium) || (i12 == 5 && i1Var.d && !isPremium);
        el0Var.H = z10;
        if (z10 && el0Var.f == null) {
            sg.c1 c1Var = new sg.c1(el0Var.getContext(), 1, null);
            el0Var.f = c1Var;
            c1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            el0Var.f.setImageReceiver(dl0Var3.getImageReceiver());
            el0Var.addView(el0Var.f, w7.z5.a(18.0f, 8.0f, 8.0f, 0.0f, 0.0f, 18, 17));
        }
        sg.c1 c1Var2 = el0Var.f;
        if (c1Var2 != null) {
            c1Var2.setVisibility(el0Var.H ? 0 : 8);
        }
        el0Var.d();
        el0Var.e = i1Var;
        el0Var.r = i1Var.a || (i1Var.f != null && ((gl0Var.q() || gl0Var.G0) && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)));
        if (i12 == 4 || el0Var.e.b) {
            el0Var.r = false;
        }
        ah.i1 i1Var3 = el0Var.e;
        if (i1Var3.a || i1Var3.f != null) {
            el0Var.e(i1Var);
            dl0Var.setAnimatedEmojiDrawable(null);
            if (dl0Var2.getImageReceiver().getLottieAnimation() != null) {
                dl0Var2.getImageReceiver().getLottieAnimation().N(0, false, false);
            }
            sg.c1 c1Var3 = el0Var.f;
            if (c1Var3 != null) {
                c1Var3.setAnimatedEmojiDrawable(null);
            }
        } else {
            dl0Var.getImageReceiver().clearImage();
            dl0Var3.getImageReceiver().clearImage();
            s5 s5Var = new s5(4, gl0Var.J, el0Var.e.g);
            s5 s5Var2 = new s5(3, gl0Var.J, el0Var.e.g);
            if (i12 == 1 || i12 == 2 || i12 == 4) {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                s5Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
                s5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
            } else {
                int i13 = org.telegram.ui.ActionBar.g6.v6;
                int w02 = org.telegram.ui.ActionBar.g6.w0(i13, c6Var);
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                s5Var.setColorFilter(new PorterDuffColorFilter(w02, mode2));
                s5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i13, c6Var), mode2));
            }
            dl0Var.setAnimatedEmojiDrawable(s5Var);
            dl0Var3.setAnimatedEmojiDrawable(s5Var2);
            sg.c1 c1Var4 = el0Var.f;
            if (c1Var4 != null) {
                c1Var4.setAnimatedEmojiDrawable(s5Var2);
            }
        }
        el0Var.setFocusable(true);
        boolean z11 = el0Var.r;
        el0Var.s = z11;
        if (z11) {
            el0Var.v = false;
            dl0Var2.setVisibility(0);
            dl0Var3.setVisibility(8);
        } else {
            dl0Var2.setVisibility(8);
            dl0Var3.setVisibility(0);
            el0Var.v = true;
        }
        ViewGroup.LayoutParams layoutParams = dl0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = dl0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = dl0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = dl0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        dl0 dl0Var = this.b;
        s5 s5Var = dl0Var.e;
        ImageReceiver imageReceiver = s5Var != null ? s5Var.k : dl0Var.a;
        if (imageReceiver == null || imageReceiver.getLottieAnimation() == null) {
            return;
        }
        gl0 gl0Var = this.P;
        if (gl0Var.x0 != null || this.N || !gl0Var.G0) {
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
            ofFloat.addUpdateListener(new f80(this, 10));
            this.J.setDuration(150L);
            this.J.setInterpolator(es.h);
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
        gl0 gl0Var = this.P;
        dl0 dl0Var = this.b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            dl0 dl0Var2 = this.a;
            if (dl0Var2.getImageReceiver().getLottieAnimation() != null && !dl0Var2.getImageReceiver().getLottieAnimation().y()) {
                dl0Var2.getImageReceiver().getLottieAnimation().stop();
                if (gl0Var.j0) {
                    dl0Var2.getImageReceiver().getLottieAnimation().N(0, false, true);
                } else {
                    dl0Var2.getImageReceiver().getLottieAnimation().N(dl0Var2.getImageReceiver().getLottieAnimation().e[0] - 1, false, true);
                }
            }
            dl0Var.setVisibility(4);
            dl0Var2.setVisibility(0);
            this.v = false;
            dl0Var.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
            dl0Var.setScaleX(this.I * (this.w ? 0.76f : 1.0f));
        } else {
            dl0Var.animate().cancel();
            if (gl0Var.N0) {
                dl0Var.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
                dl0Var.setScaleX(this.I * (this.w ? 0.76f : 1.0f));
            } else {
                dl0Var.setScaleY(0.0f);
                dl0Var.setScaleX(0.0f);
            }
        }
        this.n = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        bi.b4 b4Var;
        if (this.w && this.x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            ah.i1 i1Var = this.e;
            gl0 gl0Var = this.P;
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, (i1Var == null || !i1Var.a) ? gl0Var.H0 : gl0Var.I0);
        }
        s5 s5Var = this.b.e;
        if (s5Var != null && (b4Var = s5Var.k) != null) {
            if (this.y == 0) {
                b4Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                b4Var.setRoundRadius(this.w ? AndroidUtilities.dp(6.0f) : 0);
            }
        }
        ah.i1 i1Var2 = this.e;
        if (i1Var2 != null && i1Var2.a && this.F != null && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            yj0 lottieAnimation = this.a.getImageReceiver().getLottieAnimation();
            this.F.j = (int) (r2.b.size() * ((lottieAnimation == null || (i10 = lottieAnimation.a0) <= 30) ? 0.0f : Utilities.clamp01((i10 - 30) / 30.0f)));
            this.F.g(rectF);
            this.F.d();
            this.F.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(ah.i1 i1Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        gl0 gl0Var = this.P;
        int i10 = gl0Var.M0;
        dl0 dl0Var = this.a;
        dl0 dl0Var2 = this.b;
        if (i1Var != null && i1Var.a) {
            dl0Var.getImageReceiver().setImageBitmap(new yj0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            dl0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                this.F = new zh.b8(1, SharedConfig.getDevicePerformanceClass() == 2 ? 45 : 18);
                return;
            }
            return;
        }
        if (i10 == 4 && i1Var != null && i1Var.f != null) {
            dl0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(i1Var.f));
            dl0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(i1Var.f));
            return;
        }
        ah.i1 i1Var2 = this.e;
        if (i1Var2.b) {
            TLRPC.Document effectDocument = MessagesController.getInstance(gl0Var.J).getEffectDocument(this.e.g);
            dl0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(effectDocument), "60_60_firstframe", null, null, this.r ? null : DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.g6.m6, 0.2f), 0L, "tgs", this.e, 0);
            return;
        }
        if (i1Var2.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(gl0Var.J).getReactionsMap().get(this.e.f);
            if (tL_availableReaction2 != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.g6.m6, 0.2f);
                if (!LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) || i10 == 4) {
                    tL_availableReaction = tL_availableReaction2;
                    if (SharedConfig.getDevicePerformanceClass() <= 0 || i10 == 4) {
                        dl0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                    } else {
                        dl0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", i1Var, 0);
                        dl0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                    }
                } else {
                    tL_availableReaction = tL_availableReaction2;
                    dl0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", i1Var, 0);
                    dl0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                }
                if (dl0Var.getImageReceiver().getLottieAnimation() != null) {
                    dl0Var.getImageReceiver().getLottieAnimation().N(0, false, true);
                }
                this.c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb, 0L, "tgs", i1Var, 0);
                ImageReceiver imageReceiver = this.d;
                imageReceiver.setAllowStartLottieAnimation(false);
                MediaDataController.getInstance(gl0Var.J).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), ah.d1.a());
            }
            sg.c1 c1Var = this.f;
            if (c1Var != null) {
                c1Var.setImageReceiver(dl0Var2.getImageReceiver());
            }
        }
    }

    public final void f(ah.i1 i1Var, boolean z10) {
        boolean z11 = this.w;
        boolean contains = this.P.d0.contains(i1Var);
        this.w = contains;
        if (contains != z11) {
            dl0 dl0Var = this.a;
            dl0 dl0Var2 = this.b;
            if (z10) {
                ViewPropertyAnimator duration = dl0Var2.animate().scaleX(this.I * (this.w ? 0.76f : 1.0f)).scaleY(this.I * (this.w ? 0.76f : 1.0f)).setDuration(240L);
                es esVar = es.h;
                duration.setInterpolator(esVar).start();
                dl0Var.animate().scaleX(this.I * (this.w ? 0.76f : 1.0f)).scaleY(this.I * (this.w ? 0.76f : 1.0f)).setDuration(240L).setInterpolator(esVar).start();
            } else {
                dl0Var2.setScaleX(this.I * (contains ? 0.76f : 1.0f));
                dl0Var2.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
                dl0Var.setScaleX(this.I * (this.w ? 0.76f : 1.0f));
                dl0Var.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
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
        ah.i1 i1Var = this.e;
        if (i1Var != null) {
            String str = i1Var.f;
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
        fl0 fl0Var;
        if (this.O) {
            gl0 gl0Var = this.P;
            if (gl0Var.Q == null) {
                int action = motionEvent.getAction();
                bl0 bl0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = gl0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((fl0Var = gl0Var.g0) == null || fl0Var.j())) {
                        AndroidUtilities.runOnUIThread(bl0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                int i11 = 2;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((gl0Var.l0 == null || gl0Var.n0 > 0.8f) && gl0Var.g0 != null)) {
                    gl0Var.r0 = true;
                    if (System.currentTimeMillis() - gl0Var.s0 > 300) {
                        gl0Var.s0 = System.currentTimeMillis();
                        gl0Var.g0.n(this, this.e, gl0Var.n0 > 0.8f, false);
                    }
                }
                if (!gl0Var.r0 && gl0Var.l0 != null) {
                    gl0Var.o0 = 0.0f;
                    float f7 = gl0Var.n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    gl0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new uk0(gl0Var, f7));
                    gl0Var.Q.addListener(new di.t5(gl0Var, i11));
                    gl0Var.Q.setDuration(150L);
                    gl0Var.Q.setInterpolator(es.f);
                    gl0Var.Q.start();
                }
                AndroidUtilities.cancelRunOnUIThread(bl0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
