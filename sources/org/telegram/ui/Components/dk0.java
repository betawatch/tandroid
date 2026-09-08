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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class dk0 extends FrameLayout {
    public boolean E;
    public zh.h8 F;
    public final ak0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final ak0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final /* synthetic */ fk0 P;
    public final ck0 a;
    public final ck0 b;
    public final ck0 c;
    public final ImageReceiver d;
    public ah.j1 e;
    public sg.e1 f;
    public float h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk0(fk0 fk0Var, Context context) {
        super(context);
        this.P = fk0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.x = true;
        this.G = new ak0(this, 0);
        this.I = 1.0f;
        int i10 = 1;
        this.K = new ak0(this, i10);
        this.O = true;
        ck0 ck0Var = new ck0(this, context, 0);
        this.a = ck0Var;
        ck0 ck0Var2 = new ck0(this, context, i10);
        this.b = ck0Var2;
        ck0Var.getImageReceiver().setAutoRepeat(0);
        ck0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        ck0 ck0Var3 = new ck0(this, context, 2);
        this.c = ck0Var3;
        addView(ck0Var, w7.x5.e(34, 34, 17));
        addView(ck0Var3, w7.x5.e(34, 34, 17));
        addView(ck0Var2, w7.x5.e(34, 34, 17));
        if (fk0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        ck0Var.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        ck0Var2.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        ck0Var2.a.setAutoRepeat(0);
        ck0Var2.a.setAllowStartAnimation(false);
        ck0Var2.a.setAllowStartLottieAnimation(false);
        ck0Var3.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    public static void a(dk0 dk0Var, ah.j1 j1Var, int i10) {
        ck0 ck0Var = dk0Var.c;
        ck0 ck0Var2 = dk0Var.a;
        ck0 ck0Var3 = dk0Var.b;
        fk0 fk0Var = dk0Var.P;
        dk0Var.f(j1Var, false);
        ah.j1 j1Var2 = dk0Var.e;
        if (j1Var2 != null && j1Var2.equals(j1Var)) {
            dk0Var.y = i10;
            dk0Var.e(j1Var);
            return;
        }
        int i11 = fk0Var.J;
        org.telegram.ui.ActionBar.f6 f6Var = fk0Var.k0;
        int i12 = fk0Var.M0;
        boolean isPremium = UserConfig.getInstance(i11).isPremium();
        boolean z10 = (i12 == 3 && !isPremium) || (i12 == 5 && j1Var.d && !isPremium);
        dk0Var.H = z10;
        if (z10 && dk0Var.f == null) {
            sg.e1 e1Var = new sg.e1(dk0Var.getContext(), 1, null);
            dk0Var.f = e1Var;
            e1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            dk0Var.f.setImageReceiver(ck0Var3.getImageReceiver());
            dk0Var.addView(dk0Var.f, w7.x5.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        sg.e1 e1Var2 = dk0Var.f;
        if (e1Var2 != null) {
            e1Var2.setVisibility(dk0Var.H ? 0 : 8);
        }
        dk0Var.d();
        dk0Var.e = j1Var;
        dk0Var.r = j1Var.a || (j1Var.f != null && ((fk0Var.q() || fk0Var.G0) && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)));
        if (i12 == 4 || dk0Var.e.b) {
            dk0Var.r = false;
        }
        ah.j1 j1Var3 = dk0Var.e;
        if (j1Var3.a || j1Var3.f != null) {
            dk0Var.e(j1Var);
            ck0Var.setAnimatedEmojiDrawable(null);
            if (ck0Var2.getImageReceiver().getLottieAnimation() != null) {
                ck0Var2.getImageReceiver().getLottieAnimation().L(0, false, false);
            }
            sg.e1 e1Var3 = dk0Var.f;
            if (e1Var3 != null) {
                e1Var3.setAnimatedEmojiDrawable(null);
            }
        } else {
            ck0Var.getImageReceiver().clearImage();
            ck0Var3.getImageReceiver().clearImage();
            q5 q5Var = new q5(4, fk0Var.J, dk0Var.e.g);
            q5 q5Var2 = new q5(3, fk0Var.J, dk0Var.e.g);
            if (i12 == 1 || i12 == 2 || i12 == 4) {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                q5Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
                q5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
            } else {
                int i13 = org.telegram.ui.ActionBar.j6.v6;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                q5Var.setColorFilter(new PorterDuffColorFilter(v02, mode2));
                q5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i13, f6Var), mode2));
            }
            ck0Var.setAnimatedEmojiDrawable(q5Var);
            ck0Var3.setAnimatedEmojiDrawable(q5Var2);
            sg.e1 e1Var4 = dk0Var.f;
            if (e1Var4 != null) {
                e1Var4.setAnimatedEmojiDrawable(q5Var2);
            }
        }
        dk0Var.setFocusable(true);
        boolean z11 = dk0Var.r;
        dk0Var.s = z11;
        if (z11) {
            dk0Var.v = false;
            ck0Var2.setVisibility(0);
            ck0Var3.setVisibility(8);
        } else {
            ck0Var2.setVisibility(8);
            ck0Var3.setVisibility(0);
            dk0Var.v = true;
        }
        ViewGroup.LayoutParams layoutParams = ck0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = ck0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = ck0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = ck0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        ck0 ck0Var = this.b;
        q5 q5Var = ck0Var.e;
        ImageReceiver imageReceiver = q5Var != null ? q5Var.k : ck0Var.a;
        if (imageReceiver == null || imageReceiver.getLottieAnimation() == null) {
            return;
        }
        fk0 fk0Var = this.P;
        if (fk0Var.x0 != null || this.N || !fk0Var.G0) {
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
            ofFloat.addUpdateListener(new h70(this, 9));
            this.J.setDuration(150L);
            this.J.setInterpolator(pr.h);
            this.J.setStartDelay((long) (i10 * this.P.c));
            this.J.start();
            this.n = true;
            return;
        }
        if (this.a.getImageReceiver().getLottieAnimation() == null || this.a.getImageReceiver().getLottieAnimation().w() || this.n) {
            if (this.a.getImageReceiver().getLottieAnimation() != null && this.n && !this.a.getImageReceiver().getLottieAnimation().l0 && !this.a.getImageReceiver().getLottieAnimation().w()) {
                this.a.getImageReceiver().getLottieAnimation().L(this.a.getImageReceiver().getLottieAnimation().e[0] - 1, false, false);
            }
            this.b.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
            this.b.setScaleX(this.I * (this.w ? 0.76f : 1.0f));
            return;
        }
        this.n = true;
        if (i10 == 0) {
            this.E = false;
            this.a.getImageReceiver().getLottieAnimation().stop();
            this.a.getImageReceiver().getLottieAnimation().L(0, false, false);
            this.G.run();
            return;
        }
        this.E = true;
        this.a.getImageReceiver().getLottieAnimation().stop();
        this.a.getImageReceiver().getLottieAnimation().L(0, false, false);
        AndroidUtilities.runOnUIThread(this.G, i10);
    }

    public final void d() {
        boolean z10 = this.r;
        fk0 fk0Var = this.P;
        ck0 ck0Var = this.b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            ck0 ck0Var2 = this.a;
            if (ck0Var2.getImageReceiver().getLottieAnimation() != null && !ck0Var2.getImageReceiver().getLottieAnimation().w()) {
                ck0Var2.getImageReceiver().getLottieAnimation().stop();
                if (fk0Var.j0) {
                    ck0Var2.getImageReceiver().getLottieAnimation().L(0, false, true);
                } else {
                    ck0Var2.getImageReceiver().getLottieAnimation().L(ck0Var2.getImageReceiver().getLottieAnimation().e[0] - 1, false, true);
                }
            }
            ck0Var.setVisibility(4);
            ck0Var2.setVisibility(0);
            this.v = false;
            ck0Var.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
            ck0Var.setScaleX(this.I * (this.w ? 0.76f : 1.0f));
        } else {
            ck0Var.animate().cancel();
            if (fk0Var.N0) {
                ck0Var.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
                ck0Var.setScaleX(this.I * (this.w ? 0.76f : 1.0f));
            } else {
                ck0Var.setScaleY(0.0f);
                ck0Var.setScaleX(0.0f);
            }
        }
        this.n = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        bi.y3 y3Var;
        if (this.w && this.x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            ah.j1 j1Var = this.e;
            fk0 fk0Var = this.P;
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, (j1Var == null || !j1Var.a) ? fk0Var.H0 : fk0Var.I0);
        }
        q5 q5Var = this.b.e;
        if (q5Var != null && (y3Var = q5Var.k) != null) {
            if (this.y == 0) {
                y3Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                y3Var.setRoundRadius(this.w ? AndroidUtilities.dp(6.0f) : 0);
            }
        }
        ah.j1 j1Var2 = this.e;
        if (j1Var2 != null && j1Var2.a && this.F != null && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            xi0 lottieAnimation = this.a.getImageReceiver().getLottieAnimation();
            this.F.j = (int) (r2.b.size() * ((lottieAnimation == null || (i10 = lottieAnimation.b0) <= 30) ? 0.0f : Utilities.clamp01((i10 - 30) / 30.0f)));
            this.F.g(rectF);
            this.F.d();
            this.F.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(ah.j1 j1Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        fk0 fk0Var = this.P;
        int i10 = fk0Var.M0;
        ck0 ck0Var = this.a;
        ck0 ck0Var2 = this.b;
        if (j1Var != null && j1Var.a) {
            ck0Var.getImageReceiver().setImageBitmap(new xi0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            ck0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                this.F = new zh.h8(1, SharedConfig.getDevicePerformanceClass() == 2 ? 45 : 18);
                return;
            }
            return;
        }
        if (i10 == 4 && j1Var != null && j1Var.f != null) {
            ck0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(j1Var.f));
            ck0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(j1Var.f));
            return;
        }
        ah.j1 j1Var2 = this.e;
        if (j1Var2.b) {
            TLRPC.Document effectDocument = MessagesController.getInstance(fk0Var.J).getEffectDocument(this.e.g);
            ck0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(effectDocument), "60_60_firstframe", null, null, this.r ? null : DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.j6.m6, 0.2f), 0L, "tgs", this.e, 0);
            return;
        }
        if (j1Var2.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(fk0Var.J).getReactionsMap().get(this.e.f);
            if (tL_availableReaction2 != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.j6.m6, 0.2f);
                if (!LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) || i10 == 4) {
                    tL_availableReaction = tL_availableReaction2;
                    if (SharedConfig.getDevicePerformanceClass() <= 0 || i10 == 4) {
                        ck0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                    } else {
                        ck0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", j1Var, 0);
                        ck0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                    }
                } else {
                    tL_availableReaction = tL_availableReaction2;
                    ck0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", j1Var, 0);
                    ck0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                }
                if (ck0Var.getImageReceiver().getLottieAnimation() != null) {
                    ck0Var.getImageReceiver().getLottieAnimation().L(0, false, true);
                }
                this.c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb, 0L, "tgs", j1Var, 0);
                ImageReceiver imageReceiver = this.d;
                imageReceiver.setAllowStartLottieAnimation(false);
                MediaDataController.getInstance(fk0Var.J).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), ah.e1.a());
            }
            sg.e1 e1Var = this.f;
            if (e1Var != null) {
                e1Var.setImageReceiver(ck0Var2.getImageReceiver());
            }
        }
    }

    public final void f(ah.j1 j1Var, boolean z10) {
        boolean z11 = this.w;
        boolean contains = this.P.d0.contains(j1Var);
        this.w = contains;
        if (contains != z11) {
            ck0 ck0Var = this.a;
            ck0 ck0Var2 = this.b;
            if (z10) {
                ViewPropertyAnimator duration = ck0Var2.animate().scaleX(this.I * (this.w ? 0.76f : 1.0f)).scaleY(this.I * (this.w ? 0.76f : 1.0f)).setDuration(240L);
                pr prVar = pr.h;
                duration.setInterpolator(prVar).start();
                ck0Var.animate().scaleX(this.I * (this.w ? 0.76f : 1.0f)).scaleY(this.I * (this.w ? 0.76f : 1.0f)).setDuration(240L).setInterpolator(prVar).start();
            } else {
                ck0Var2.setScaleX(this.I * (contains ? 0.76f : 1.0f));
                ck0Var2.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
                ck0Var.setScaleX(this.I * (this.w ? 0.76f : 1.0f));
                ck0Var.setScaleY(this.I * (this.w ? 0.76f : 1.0f));
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
        ah.j1 j1Var = this.e;
        if (j1Var != null) {
            String str = j1Var.f;
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
        ek0 ek0Var;
        if (this.O) {
            fk0 fk0Var = this.P;
            if (fk0Var.Q == null) {
                int action = motionEvent.getAction();
                ak0 ak0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = fk0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((ek0Var = fk0Var.g0) == null || ek0Var.n())) {
                        AndroidUtilities.runOnUIThread(ak0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                int i11 = 2;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((fk0Var.l0 == null || fk0Var.n0 > 0.8f) && fk0Var.g0 != null)) {
                    fk0Var.r0 = true;
                    if (System.currentTimeMillis() - fk0Var.s0 > 300) {
                        fk0Var.s0 = System.currentTimeMillis();
                        fk0Var.g0.B(this, this.e, fk0Var.n0 > 0.8f, false);
                    }
                }
                if (!fk0Var.r0 && fk0Var.l0 != null) {
                    fk0Var.o0 = 0.0f;
                    float f7 = fk0Var.n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    fk0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new tj0(fk0Var, f7));
                    fk0Var.Q.addListener(new di.v5(fk0Var, i11));
                    fk0Var.Q.setDuration(150L);
                    fk0Var.Q.setInterpolator(pr.f);
                    fk0Var.Q.start();
                }
                AndroidUtilities.cancelRunOnUIThread(ak0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
