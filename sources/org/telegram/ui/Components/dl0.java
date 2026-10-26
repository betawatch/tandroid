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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class dl0 extends FrameLayout {
    public boolean E;
    public bi.td F;
    public final al0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final al0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final /* synthetic */ fl0 P;
    public final cl0 a;
    public final cl0 b;
    public final cl0 c;
    public final ImageReceiver d;
    public bh.x0 e;
    public tg.c1 f;
    public float h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl0(fl0 fl0Var, Context context) {
        super(context);
        this.P = fl0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.x = true;
        this.G = new al0(this, 0);
        this.I = 1.0f;
        int i10 = 1;
        this.K = new al0(this, i10);
        this.O = true;
        cl0 cl0Var = new cl0(this, context, 0);
        this.a = cl0Var;
        cl0 cl0Var2 = new cl0(this, context, i10);
        this.b = cl0Var2;
        cl0Var.getImageReceiver().setAutoRepeat(0);
        cl0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        cl0 cl0Var3 = new cl0(this, context, 2);
        this.c = cl0Var3;
        addView(cl0Var, gb1.i(34, 34, 17));
        addView(cl0Var3, gb1.i(34, 34, 17));
        addView(cl0Var2, gb1.i(34, 34, 17));
        if (fl0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        cl0Var.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        cl0Var2.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        cl0Var2.a.setAutoRepeat(0);
        cl0Var2.a.setAllowStartAnimation(false);
        cl0Var2.a.setAllowStartLottieAnimation(false);
        cl0Var3.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    public static void a(dl0 dl0Var, bh.x0 x0Var, int i10) {
        cl0 cl0Var = dl0Var.c;
        cl0 cl0Var2 = dl0Var.a;
        cl0 cl0Var3 = dl0Var.b;
        fl0 fl0Var = dl0Var.P;
        dl0Var.f(x0Var, false);
        bh.x0 x0Var2 = dl0Var.e;
        if (x0Var2 != null && x0Var2.equals(x0Var)) {
            dl0Var.y = i10;
            dl0Var.e(x0Var);
            return;
        }
        int i11 = fl0Var.J;
        org.telegram.ui.ActionBar.u6 u6Var = fl0Var.k0;
        int i12 = fl0Var.M0;
        boolean isPremium = UserConfig.getInstance(i11).isPremium();
        boolean z10 = (i12 == 3 && !isPremium) || (i12 == 5 && x0Var.d && !isPremium);
        dl0Var.H = z10;
        if (z10 && dl0Var.f == null) {
            tg.c1 c1Var = new tg.c1(dl0Var.getContext(), 1, null);
            dl0Var.f = c1Var;
            c1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            dl0Var.f.setImageReceiver(cl0Var3.getImageReceiver());
            dl0Var.addView(dl0Var.f, gb1.h(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        tg.c1 c1Var2 = dl0Var.f;
        if (c1Var2 != null) {
            c1Var2.setVisibility(dl0Var.H ? 0 : 8);
        }
        dl0Var.d();
        dl0Var.e = x0Var;
        dl0Var.r = x0Var.a || (x0Var.f != null && ((fl0Var.q() || fl0Var.G0) && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)));
        if (i12 == 4 || dl0Var.e.b) {
            dl0Var.r = false;
        }
        bh.x0 x0Var3 = dl0Var.e;
        if (x0Var3.a || x0Var3.f != null) {
            dl0Var.e(x0Var);
            cl0Var.setAnimatedEmojiDrawable(null);
            if (cl0Var2.getImageReceiver().getLottieAnimation() != null) {
                cl0Var2.getImageReceiver().getLottieAnimation().N(0, false, false);
            }
            tg.c1 c1Var3 = dl0Var.f;
            if (c1Var3 != null) {
                c1Var3.setAnimatedEmojiDrawable(null);
            }
        } else {
            cl0Var.getImageReceiver().clearImage();
            cl0Var3.getImageReceiver().clearImage();
            t5 t5Var = new t5(4, fl0Var.J, dl0Var.e.g);
            t5 t5Var2 = new t5(3, fl0Var.J, dl0Var.e.g);
            if (i12 == 1 || i12 == 2 || i12 == 4) {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                t5Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
                t5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
            } else {
                int i13 = org.telegram.ui.ActionBar.y6.v6;
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                org.telegram.ui.ActionBar.f7.y(dl0Var, t5Var, i13, u6Var, mode2);
                org.telegram.ui.ActionBar.f7.y(dl0Var, t5Var2, i13, u6Var, mode2);
            }
            cl0Var.setAnimatedEmojiDrawable(t5Var);
            cl0Var3.setAnimatedEmojiDrawable(t5Var2);
            tg.c1 c1Var4 = dl0Var.f;
            if (c1Var4 != null) {
                c1Var4.setAnimatedEmojiDrawable(t5Var2);
            }
        }
        dl0Var.setFocusable(true);
        boolean z11 = dl0Var.r;
        dl0Var.s = z11;
        if (z11) {
            dl0Var.v = false;
            cl0Var2.setVisibility(0);
            cl0Var3.setVisibility(8);
        } else {
            cl0Var2.setVisibility(8);
            cl0Var3.setVisibility(0);
            dl0Var.v = true;
        }
        ViewGroup.LayoutParams layoutParams = cl0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = cl0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = cl0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = cl0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        cl0 cl0Var = this.b;
        t5 t5Var = cl0Var.e;
        ImageReceiver imageReceiver = t5Var != null ? t5Var.k : cl0Var.a;
        if (imageReceiver == null || imageReceiver.getLottieAnimation() == null) {
            return;
        }
        fl0 fl0Var = this.P;
        if (fl0Var.x0 != null || this.N || !fl0Var.G0) {
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
            ofFloat.addUpdateListener(new e80(this, 10));
            this.J.setDuration(150L);
            this.J.setInterpolator(ds.h);
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
        fl0 fl0Var = this.P;
        cl0 cl0Var = this.b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            cl0 cl0Var2 = this.a;
            if (cl0Var2.getImageReceiver().getLottieAnimation() != null && !cl0Var2.getImageReceiver().getLottieAnimation().y()) {
                cl0Var2.getImageReceiver().getLottieAnimation().stop();
                if (fl0Var.j0) {
                    cl0Var2.getImageReceiver().getLottieAnimation().N(0, false, true);
                } else {
                    cl0Var2.getImageReceiver().getLottieAnimation().N(cl0Var2.getImageReceiver().getLottieAnimation().e[0] - 1, false, true);
                }
            }
            cl0Var.setVisibility(4);
            cl0Var2.setVisibility(0);
            this.v = false;
            cl0Var.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
            cl0Var.setScaleX(this.I * (this.w ? 0.76f : 1.0f));
        } else {
            cl0Var.animate().cancel();
            if (fl0Var.N0) {
                cl0Var.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
                cl0Var.setScaleX(this.I * (this.w ? 0.76f : 1.0f));
            } else {
                cl0Var.setScaleY(0.0f);
                cl0Var.setScaleX(0.0f);
            }
        }
        this.n = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        di.f3 f3Var;
        if (this.w && this.x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            bh.x0 x0Var = this.e;
            fl0 fl0Var = this.P;
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, (x0Var == null || !x0Var.a) ? fl0Var.H0 : fl0Var.I0);
        }
        t5 t5Var = this.b.e;
        if (t5Var != null && (f3Var = t5Var.k) != null) {
            if (this.y == 0) {
                f3Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                f3Var.setRoundRadius(this.w ? AndroidUtilities.dp(6.0f) : 0);
            }
        }
        bh.x0 x0Var2 = this.e;
        if (x0Var2 != null && x0Var2.a && this.F != null && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            xj0 lottieAnimation = this.a.getImageReceiver().getLottieAnimation();
            this.F.j = (int) (r2.b.size() * ((lottieAnimation == null || (i10 = lottieAnimation.a0) <= 30) ? 0.0f : Utilities.clamp01((i10 - 30) / 30.0f)));
            this.F.g(rectF);
            this.F.d();
            this.F.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(bh.x0 x0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        fl0 fl0Var = this.P;
        int i10 = fl0Var.M0;
        cl0 cl0Var = this.a;
        cl0 cl0Var2 = this.b;
        if (x0Var != null && x0Var.a) {
            cl0Var.getImageReceiver().setImageBitmap(new xj0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            cl0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                this.F = new bi.td(1, SharedConfig.getDevicePerformanceClass() == 2 ? 45 : 18);
                return;
            }
            return;
        }
        if (i10 == 4 && x0Var != null && x0Var.f != null) {
            cl0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(x0Var.f));
            cl0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(x0Var.f));
            return;
        }
        bh.x0 x0Var2 = this.e;
        if (x0Var2.b) {
            TLRPC.Document effectDocument = MessagesController.getInstance(fl0Var.J).getEffectDocument(this.e.g);
            cl0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(effectDocument), "60_60_firstframe", null, null, this.r ? null : DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.y6.m6, 0.2f), 0L, "tgs", this.e, 0);
            return;
        }
        if (x0Var2.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(fl0Var.J).getReactionsMap().get(this.e.f);
            if (tL_availableReaction2 != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.y6.m6, 0.2f);
                if (!LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) || i10 == 4) {
                    tL_availableReaction = tL_availableReaction2;
                    if (SharedConfig.getDevicePerformanceClass() <= 0 || i10 == 4) {
                        cl0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                    } else {
                        cl0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", x0Var, 0);
                        cl0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                    }
                } else {
                    tL_availableReaction = tL_availableReaction2;
                    cl0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", x0Var, 0);
                    cl0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                }
                if (cl0Var.getImageReceiver().getLottieAnimation() != null) {
                    cl0Var.getImageReceiver().getLottieAnimation().N(0, false, true);
                }
                this.c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb, 0L, "tgs", x0Var, 0);
                ImageReceiver imageReceiver = this.d;
                imageReceiver.setAllowStartLottieAnimation(false);
                MediaDataController.getInstance(fl0Var.J).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), bh.s0.a());
            }
            tg.c1 c1Var = this.f;
            if (c1Var != null) {
                c1Var.setImageReceiver(cl0Var2.getImageReceiver());
            }
        }
    }

    public final void f(bh.x0 x0Var, boolean z10) {
        boolean z11 = this.w;
        boolean contains = this.P.d0.contains(x0Var);
        this.w = contains;
        if (contains != z11) {
            cl0 cl0Var = this.a;
            cl0 cl0Var2 = this.b;
            if (z10) {
                ViewPropertyAnimator duration = cl0Var2.animate().scaleX(this.I * (this.w ? 0.76f : 1.0f)).scaleY(this.I * (this.w ? 0.76f : 1.0f)).setDuration(240L);
                ds dsVar = ds.h;
                duration.setInterpolator(dsVar).start();
                cl0Var.animate().scaleX(this.I * (this.w ? 0.76f : 1.0f)).scaleY(this.I * (this.w ? 0.76f : 1.0f)).setDuration(240L).setInterpolator(dsVar).start();
            } else {
                cl0Var2.setScaleX(this.I * (contains ? 0.76f : 1.0f));
                cl0Var2.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
                cl0Var.setScaleX(this.I * (this.w ? 0.76f : 1.0f));
                cl0Var.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
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
        bh.x0 x0Var = this.e;
        if (x0Var != null) {
            String str = x0Var.f;
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
        el0 el0Var;
        if (this.O) {
            fl0 fl0Var = this.P;
            if (fl0Var.Q == null) {
                int action = motionEvent.getAction();
                al0 al0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = fl0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((el0Var = fl0Var.g0) == null || el0Var.f())) {
                        AndroidUtilities.runOnUIThread(al0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                int i11 = 2;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((fl0Var.l0 == null || fl0Var.n0 > 0.8f) && fl0Var.g0 != null)) {
                    fl0Var.r0 = true;
                    if (System.currentTimeMillis() - fl0Var.s0 > 300) {
                        fl0Var.s0 = System.currentTimeMillis();
                        fl0Var.g0.p(this, this.e, fl0Var.n0 > 0.8f, false);
                    }
                }
                if (!fl0Var.r0 && fl0Var.l0 != null) {
                    fl0Var.o0 = 0.0f;
                    float f7 = fl0Var.n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    fl0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new tk0(fl0Var, f7));
                    fl0Var.Q.addListener(new fi.j5(fl0Var, i11));
                    fl0Var.Q.setDuration(150L);
                    fl0Var.Q.setInterpolator(ds.f);
                    fl0Var.Q.start();
                }
                AndroidUtilities.cancelRunOnUIThread(al0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
