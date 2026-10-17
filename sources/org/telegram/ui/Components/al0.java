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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class al0 extends FrameLayout {
    public boolean E;
    public ai.ce F;
    public final xk0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final xk0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final /* synthetic */ cl0 P;
    public final zk0 a;
    public final zk0 b;
    public final zk0 c;
    public final ImageReceiver d;
    public ah.i1 e;
    public sg.b1 f;
    public float h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al0(cl0 cl0Var, Context context) {
        super(context);
        this.P = cl0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.x = true;
        this.G = new xk0(this, 0);
        this.I = 1.0f;
        int i10 = 1;
        this.K = new xk0(this, i10);
        this.O = true;
        zk0 zk0Var = new zk0(this, context, 0);
        this.a = zk0Var;
        zk0 zk0Var2 = new zk0(this, context, i10);
        this.b = zk0Var2;
        zk0Var.getImageReceiver().setAutoRepeat(0);
        zk0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        zk0 zk0Var3 = new zk0(this, context, 2);
        this.c = zk0Var3;
        addView(zk0Var, w7.z5.e(34, 34, 17));
        addView(zk0Var3, w7.z5.e(34, 34, 17));
        addView(zk0Var2, w7.z5.e(34, 34, 17));
        if (cl0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        zk0Var.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        zk0Var2.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        zk0Var2.a.setAutoRepeat(0);
        zk0Var2.a.setAllowStartAnimation(false);
        zk0Var2.a.setAllowStartLottieAnimation(false);
        zk0Var3.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    public static void a(al0 al0Var, ah.i1 i1Var, int i10) {
        zk0 zk0Var = al0Var.c;
        zk0 zk0Var2 = al0Var.a;
        zk0 zk0Var3 = al0Var.b;
        cl0 cl0Var = al0Var.P;
        al0Var.f(i1Var, false);
        ah.i1 i1Var2 = al0Var.e;
        if (i1Var2 != null && i1Var2.equals(i1Var)) {
            al0Var.y = i10;
            al0Var.e(i1Var);
            return;
        }
        int i11 = cl0Var.J;
        org.telegram.ui.ActionBar.d6 d6Var = cl0Var.k0;
        int i12 = cl0Var.M0;
        boolean isPremium = UserConfig.getInstance(i11).isPremium();
        boolean z10 = (i12 == 3 && !isPremium) || (i12 == 5 && i1Var.d && !isPremium);
        al0Var.H = z10;
        if (z10 && al0Var.f == null) {
            sg.b1 b1Var = new sg.b1(al0Var.getContext(), 1, null);
            al0Var.f = b1Var;
            b1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            al0Var.f.setImageReceiver(zk0Var3.getImageReceiver());
            al0Var.addView(al0Var.f, w7.z5.a(18.0f, 8.0f, 8.0f, 0.0f, 0.0f, 18, 17));
        }
        sg.b1 b1Var2 = al0Var.f;
        if (b1Var2 != null) {
            b1Var2.setVisibility(al0Var.H ? 0 : 8);
        }
        al0Var.d();
        al0Var.e = i1Var;
        al0Var.r = i1Var.a || (i1Var.f != null && ((cl0Var.q() || cl0Var.G0) && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)));
        if (i12 == 4 || al0Var.e.b) {
            al0Var.r = false;
        }
        ah.i1 i1Var3 = al0Var.e;
        if (i1Var3.a || i1Var3.f != null) {
            al0Var.e(i1Var);
            zk0Var.setAnimatedEmojiDrawable(null);
            if (zk0Var2.getImageReceiver().getLottieAnimation() != null) {
                zk0Var2.getImageReceiver().getLottieAnimation().N(0, false, false);
            }
            sg.b1 b1Var3 = al0Var.f;
            if (b1Var3 != null) {
                b1Var3.setAnimatedEmojiDrawable(null);
            }
        } else {
            zk0Var.getImageReceiver().clearImage();
            zk0Var3.getImageReceiver().clearImage();
            r5 r5Var = new r5(4, cl0Var.J, al0Var.e.g);
            r5 r5Var2 = new r5(3, cl0Var.J, al0Var.e.g);
            if (i12 == 1 || i12 == 2 || i12 == 4) {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                r5Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
                r5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
            } else {
                int i13 = org.telegram.ui.ActionBar.h6.v6;
                int w02 = org.telegram.ui.ActionBar.h6.w0(i13, d6Var);
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                r5Var.setColorFilter(new PorterDuffColorFilter(w02, mode2));
                r5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i13, d6Var), mode2));
            }
            zk0Var.setAnimatedEmojiDrawable(r5Var);
            zk0Var3.setAnimatedEmojiDrawable(r5Var2);
            sg.b1 b1Var4 = al0Var.f;
            if (b1Var4 != null) {
                b1Var4.setAnimatedEmojiDrawable(r5Var2);
            }
        }
        al0Var.setFocusable(true);
        boolean z11 = al0Var.r;
        al0Var.s = z11;
        if (z11) {
            al0Var.v = false;
            zk0Var2.setVisibility(0);
            zk0Var3.setVisibility(8);
        } else {
            zk0Var2.setVisibility(8);
            zk0Var3.setVisibility(0);
            al0Var.v = true;
        }
        ViewGroup.LayoutParams layoutParams = zk0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = zk0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = zk0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = zk0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        zk0 zk0Var = this.b;
        r5 r5Var = zk0Var.e;
        ImageReceiver imageReceiver = r5Var != null ? r5Var.k : zk0Var.a;
        if (imageReceiver == null || imageReceiver.getLottieAnimation() == null) {
            return;
        }
        cl0 cl0Var = this.P;
        if (cl0Var.x0 != null || this.N || !cl0Var.G0) {
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
            ofFloat.addUpdateListener(new b80(this, 10));
            this.J.setDuration(150L);
            this.J.setInterpolator(bs.h);
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
        cl0 cl0Var = this.P;
        zk0 zk0Var = this.b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            zk0 zk0Var2 = this.a;
            if (zk0Var2.getImageReceiver().getLottieAnimation() != null && !zk0Var2.getImageReceiver().getLottieAnimation().y()) {
                zk0Var2.getImageReceiver().getLottieAnimation().stop();
                if (cl0Var.j0) {
                    zk0Var2.getImageReceiver().getLottieAnimation().N(0, false, true);
                } else {
                    zk0Var2.getImageReceiver().getLottieAnimation().N(zk0Var2.getImageReceiver().getLottieAnimation().e[0] - 1, false, true);
                }
            }
            zk0Var.setVisibility(4);
            zk0Var2.setVisibility(0);
            this.v = false;
            zk0Var.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
            zk0Var.setScaleX(this.I * (this.w ? 0.76f : 1.0f));
        } else {
            zk0Var.animate().cancel();
            if (cl0Var.N0) {
                zk0Var.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
                zk0Var.setScaleX(this.I * (this.w ? 0.76f : 1.0f));
            } else {
                zk0Var.setScaleY(0.0f);
                zk0Var.setScaleX(0.0f);
            }
        }
        this.n = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        ci.g3 g3Var;
        if (this.w && this.x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            ah.i1 i1Var = this.e;
            cl0 cl0Var = this.P;
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, (i1Var == null || !i1Var.a) ? cl0Var.H0 : cl0Var.I0);
        }
        r5 r5Var = this.b.e;
        if (r5Var != null && (g3Var = r5Var.k) != null) {
            if (this.y == 0) {
                g3Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                g3Var.setRoundRadius(this.w ? AndroidUtilities.dp(6.0f) : 0);
            }
        }
        ah.i1 i1Var2 = this.e;
        if (i1Var2 != null && i1Var2.a && this.F != null && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            uj0 lottieAnimation = this.a.getImageReceiver().getLottieAnimation();
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
        cl0 cl0Var = this.P;
        int i10 = cl0Var.M0;
        zk0 zk0Var = this.a;
        zk0 zk0Var2 = this.b;
        if (i1Var != null && i1Var.a) {
            zk0Var.getImageReceiver().setImageBitmap(new uj0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            zk0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                this.F = new ai.ce(1, SharedConfig.getDevicePerformanceClass() == 2 ? 45 : 18);
                return;
            }
            return;
        }
        if (i10 == 4 && i1Var != null && i1Var.f != null) {
            zk0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(i1Var.f));
            zk0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(i1Var.f));
            return;
        }
        ah.i1 i1Var2 = this.e;
        if (i1Var2.b) {
            TLRPC.Document effectDocument = MessagesController.getInstance(cl0Var.J).getEffectDocument(this.e.g);
            zk0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(effectDocument), "60_60_firstframe", null, null, this.r ? null : DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.h6.m6, 0.2f), 0L, "tgs", this.e, 0);
            return;
        }
        if (i1Var2.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(cl0Var.J).getReactionsMap().get(this.e.f);
            if (tL_availableReaction2 != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.h6.m6, 0.2f);
                if (!LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) || i10 == 4) {
                    tL_availableReaction = tL_availableReaction2;
                    if (SharedConfig.getDevicePerformanceClass() <= 0 || i10 == 4) {
                        zk0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                    } else {
                        zk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", i1Var, 0);
                        zk0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                    }
                } else {
                    tL_availableReaction = tL_availableReaction2;
                    zk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", i1Var, 0);
                    zk0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                }
                if (zk0Var.getImageReceiver().getLottieAnimation() != null) {
                    zk0Var.getImageReceiver().getLottieAnimation().N(0, false, true);
                }
                this.c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb, 0L, "tgs", i1Var, 0);
                ImageReceiver imageReceiver = this.d;
                imageReceiver.setAllowStartLottieAnimation(false);
                MediaDataController.getInstance(cl0Var.J).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), ah.d1.a());
            }
            sg.b1 b1Var = this.f;
            if (b1Var != null) {
                b1Var.setImageReceiver(zk0Var2.getImageReceiver());
            }
        }
    }

    public final void f(ah.i1 i1Var, boolean z10) {
        boolean z11 = this.w;
        boolean contains = this.P.d0.contains(i1Var);
        this.w = contains;
        if (contains != z11) {
            zk0 zk0Var = this.a;
            zk0 zk0Var2 = this.b;
            if (z10) {
                ViewPropertyAnimator duration = zk0Var2.animate().scaleX(this.I * (this.w ? 0.76f : 1.0f)).scaleY(this.I * (this.w ? 0.76f : 1.0f)).setDuration(240L);
                bs bsVar = bs.h;
                duration.setInterpolator(bsVar).start();
                zk0Var.animate().scaleX(this.I * (this.w ? 0.76f : 1.0f)).scaleY(this.I * (this.w ? 0.76f : 1.0f)).setDuration(240L).setInterpolator(bsVar).start();
            } else {
                zk0Var2.setScaleX(this.I * (contains ? 0.76f : 1.0f));
                zk0Var2.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
                zk0Var.setScaleX(this.I * (this.w ? 0.76f : 1.0f));
                zk0Var.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
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
        bl0 bl0Var;
        if (this.O) {
            cl0 cl0Var = this.P;
            if (cl0Var.Q == null) {
                int action = motionEvent.getAction();
                xk0 xk0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = cl0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((bl0Var = cl0Var.g0) == null || bl0Var.j())) {
                        AndroidUtilities.runOnUIThread(xk0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                int i11 = 2;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((cl0Var.l0 == null || cl0Var.n0 > 0.8f) && cl0Var.g0 != null)) {
                    cl0Var.r0 = true;
                    if (System.currentTimeMillis() - cl0Var.s0 > 300) {
                        cl0Var.s0 = System.currentTimeMillis();
                        cl0Var.g0.l(this, this.e, cl0Var.n0 > 0.8f, false);
                    }
                }
                if (!cl0Var.r0 && cl0Var.l0 != null) {
                    cl0Var.o0 = 0.0f;
                    float f7 = cl0Var.n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    cl0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new qk0(cl0Var, f7));
                    cl0Var.Q.addListener(new ei.k5(cl0Var, i11));
                    cl0Var.Q.setDuration(150L);
                    cl0Var.Q.setInterpolator(bs.f);
                    cl0Var.Q.start();
                }
                AndroidUtilities.cancelRunOnUIThread(xk0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
