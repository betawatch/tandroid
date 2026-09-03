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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ok0 extends FrameLayout {
    public boolean B;
    public mh.wa C;
    public final lk0 D;
    public boolean E;
    public float F;
    public ValueAnimator G;
    public final lk0 H;
    public float I;
    public float J;
    public boolean K;
    public boolean L;
    public final /* synthetic */ qk0 M;
    public final nk0 a;
    public final nk0 b;
    public final nk0 c;
    public final ImageReceiver d;
    public ng.q0 e;
    public fg.r1 f;
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
        this.M = qk0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.x = true;
        this.D = new lk0(this, 0);
        this.F = 1.0f;
        int i10 = 1;
        this.H = new lk0(this, i10);
        this.L = true;
        nk0 nk0Var = new nk0(this, context, 0);
        this.a = nk0Var;
        nk0 nk0Var2 = new nk0(this, context, i10);
        this.b = nk0Var2;
        nk0Var.getImageReceiver().setAutoRepeat(0);
        nk0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        nk0 nk0Var3 = new nk0(this, context, 2);
        this.c = nk0Var3;
        addView(nk0Var, k7.c6.e(34, 34, 17));
        addView(nk0Var3, k7.c6.e(34, 34, 17));
        addView(nk0Var2, k7.c6.e(34, 34, 17));
        if (qk0Var.J0 == 4) {
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

    public static void a(ok0 ok0Var, ng.q0 q0Var, int i10) {
        nk0 nk0Var = ok0Var.c;
        nk0 nk0Var2 = ok0Var.a;
        nk0 nk0Var3 = ok0Var.b;
        qk0 qk0Var = ok0Var.M;
        ok0Var.f(q0Var, false);
        ng.q0 q0Var2 = ok0Var.e;
        if (q0Var2 != null && q0Var2.equals(q0Var)) {
            ok0Var.y = i10;
            ok0Var.e(q0Var);
            return;
        }
        int i11 = qk0Var.G;
        org.telegram.ui.ActionBar.g6 g6Var = qk0Var.h0;
        int i12 = qk0Var.J0;
        boolean isPremium = UserConfig.getInstance(i11).isPremium();
        boolean z4 = (i12 == 3 && !isPremium) || (i12 == 5 && q0Var.d && !isPremium);
        ok0Var.E = z4;
        if (z4 && ok0Var.f == null) {
            fg.r1 r1Var = new fg.r1(ok0Var.getContext(), 1, null);
            ok0Var.f = r1Var;
            r1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ok0Var.f.setImageReceiver(nk0Var3.getImageReceiver());
            ok0Var.addView(ok0Var.f, k7.c6.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        fg.r1 r1Var2 = ok0Var.f;
        if (r1Var2 != null) {
            r1Var2.setVisibility(ok0Var.E ? 0 : 8);
        }
        ok0Var.d();
        ok0Var.e = q0Var;
        ok0Var.r = q0Var.a || (q0Var.f != null && ((qk0Var.q() || qk0Var.D0) && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)));
        if (i12 == 4 || ok0Var.e.b) {
            ok0Var.r = false;
        }
        ng.q0 q0Var3 = ok0Var.e;
        if (q0Var3.a || q0Var3.f != null) {
            ok0Var.e(q0Var);
            nk0Var.setAnimatedEmojiDrawable(null);
            if (nk0Var2.getImageReceiver().getLottieAnimation() != null) {
                nk0Var2.getImageReceiver().getLottieAnimation().L(0, false, false);
            }
            fg.r1 r1Var3 = ok0Var.f;
            if (r1Var3 != null) {
                r1Var3.setAnimatedEmojiDrawable(null);
            }
        } else {
            nk0Var.getImageReceiver().clearImage();
            nk0Var3.getImageReceiver().clearImage();
            l5 l5Var = new l5(4, qk0Var.G, ok0Var.e.g);
            l5 l5Var2 = new l5(3, qk0Var.G, ok0Var.e.g);
            if (i12 == 1 || i12 == 2 || i12 == 4) {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                l5Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
                l5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
            } else {
                int i13 = org.telegram.ui.ActionBar.k6.v6;
                int v02 = org.telegram.ui.ActionBar.k6.v0(i13, g6Var);
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                l5Var.setColorFilter(new PorterDuffColorFilter(v02, mode2));
                l5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i13, g6Var), mode2));
            }
            nk0Var.setAnimatedEmojiDrawable(l5Var);
            nk0Var3.setAnimatedEmojiDrawable(l5Var2);
            fg.r1 r1Var4 = ok0Var.f;
            if (r1Var4 != null) {
                r1Var4.setAnimatedEmojiDrawable(l5Var2);
            }
        }
        ok0Var.setFocusable(true);
        boolean z10 = ok0Var.r;
        ok0Var.s = z10;
        if (z10) {
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
        l5 l5Var = nk0Var.e;
        ImageReceiver imageReceiver = l5Var != null ? l5Var.k : nk0Var.a;
        if (imageReceiver == null || imageReceiver.getLottieAnimation() == null) {
            return;
        }
        qk0 qk0Var = this.M;
        if (qk0Var.u0 != null || this.K || !qk0Var.D0) {
            imageReceiver.getLottieAnimation().start();
        } else if (imageReceiver.getLottieAnimation().Y <= 2) {
            imageReceiver.getLottieAnimation().stop();
        }
    }

    public final void c(int i10) {
        if (!this.M.g0) {
            d();
            this.n = true;
            if (this.r) {
                return;
            }
            this.b.setVisibility(0);
            this.b.setScaleY(this.F * (this.w ? 0.76f : 1.0f));
            this.b.setScaleX(this.F * (this.w ? 0.76f : 1.0f));
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.D);
        if (!this.r) {
            if (this.n) {
                return;
            }
            this.F = 0.0f;
            this.b.setScaleX(0.0f);
            this.b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new k70(this, 9));
            this.G.setDuration(150L);
            this.G.setInterpolator(pr.h);
            this.G.setStartDelay((long) (i10 * this.M.c));
            this.G.start();
            this.n = true;
            return;
        }
        if (this.a.getImageReceiver().getLottieAnimation() == null || this.a.getImageReceiver().getLottieAnimation().w() || this.n) {
            if (this.a.getImageReceiver().getLottieAnimation() != null && this.n && !this.a.getImageReceiver().getLottieAnimation().i0 && !this.a.getImageReceiver().getLottieAnimation().w()) {
                this.a.getImageReceiver().getLottieAnimation().L(this.a.getImageReceiver().getLottieAnimation().e[0] - 1, false, false);
            }
            this.b.setScaleY(this.F * (this.w ? 0.76f : 1.0f));
            this.b.setScaleX(this.F * (this.w ? 0.76f : 1.0f));
            return;
        }
        this.n = true;
        if (i10 == 0) {
            this.B = false;
            this.a.getImageReceiver().getLottieAnimation().stop();
            this.a.getImageReceiver().getLottieAnimation().L(0, false, false);
            this.D.run();
            return;
        }
        this.B = true;
        this.a.getImageReceiver().getLottieAnimation().stop();
        this.a.getImageReceiver().getLottieAnimation().L(0, false, false);
        AndroidUtilities.runOnUIThread(this.D, i10);
    }

    public final void d() {
        boolean z4 = this.r;
        qk0 qk0Var = this.M;
        nk0 nk0Var = this.b;
        if (z4) {
            AndroidUtilities.cancelRunOnUIThread(this.D);
            nk0 nk0Var2 = this.a;
            if (nk0Var2.getImageReceiver().getLottieAnimation() != null && !nk0Var2.getImageReceiver().getLottieAnimation().w()) {
                nk0Var2.getImageReceiver().getLottieAnimation().stop();
                if (qk0Var.g0) {
                    nk0Var2.getImageReceiver().getLottieAnimation().L(0, false, true);
                } else {
                    nk0Var2.getImageReceiver().getLottieAnimation().L(nk0Var2.getImageReceiver().getLottieAnimation().e[0] - 1, false, true);
                }
            }
            nk0Var.setVisibility(4);
            nk0Var2.setVisibility(0);
            this.v = false;
            nk0Var.setScaleY(this.F * (this.w ? 0.76f : 1.0f));
            nk0Var.setScaleX(this.F * (this.w ? 0.76f : 1.0f));
        } else {
            nk0Var.animate().cancel();
            if (qk0Var.K0) {
                nk0Var.setScaleY(this.F * (this.w ? 0.76f : 1.0f));
                nk0Var.setScaleX(this.F * (this.w ? 0.76f : 1.0f));
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
        oh.z2 z2Var;
        if (this.w && this.x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            ng.q0 q0Var = this.e;
            qk0 qk0Var = this.M;
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, (q0Var == null || !q0Var.a) ? qk0Var.E0 : qk0Var.F0);
        }
        l5 l5Var = this.b.e;
        if (l5Var != null && (z2Var = l5Var.k) != null) {
            if (this.y == 0) {
                z2Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                z2Var.setRoundRadius(this.w ? AndroidUtilities.dp(6.0f) : 0);
            }
        }
        ng.q0 q0Var2 = this.e;
        if (q0Var2 != null && q0Var2.a && this.C != null && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            hj0 lottieAnimation = this.a.getImageReceiver().getLottieAnimation();
            this.C.j = (int) (r2.b.size() * ((lottieAnimation == null || (i10 = lottieAnimation.Y) <= 30) ? 0.0f : Utilities.clamp01((i10 - 30) / 30.0f)));
            this.C.g(rectF);
            this.C.d();
            this.C.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(ng.q0 q0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        qk0 qk0Var = this.M;
        int i10 = qk0Var.J0;
        nk0 nk0Var = this.a;
        nk0 nk0Var2 = this.b;
        if (q0Var != null && q0Var.a) {
            nk0Var.getImageReceiver().setImageBitmap(new hj0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            nk0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.C == null) {
                this.C = new mh.wa(1, SharedConfig.getDevicePerformanceClass() == 2 ? 45 : 18);
                return;
            }
            return;
        }
        if (i10 == 4 && q0Var != null && q0Var.f != null) {
            nk0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(q0Var.f));
            nk0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(q0Var.f));
            return;
        }
        ng.q0 q0Var2 = this.e;
        if (q0Var2.b) {
            TLRPC.Document effectDocument = MessagesController.getInstance(qk0Var.G).getEffectDocument(this.e.g);
            nk0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(effectDocument), "60_60_firstframe", null, null, this.r ? null : DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.k6.m6, 0.2f), 0L, "tgs", this.e, 0);
            return;
        }
        if (q0Var2.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(qk0Var.G).getReactionsMap().get(this.e.f);
            if (tL_availableReaction2 != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.k6.m6, 0.2f);
                if (!LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) || i10 == 4) {
                    tL_availableReaction = tL_availableReaction2;
                    if (SharedConfig.getDevicePerformanceClass() <= 0 || i10 == 4) {
                        nk0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                    } else {
                        nk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", q0Var, 0);
                        nk0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                    }
                } else {
                    tL_availableReaction = tL_availableReaction2;
                    nk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", q0Var, 0);
                    nk0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                }
                if (nk0Var.getImageReceiver().getLottieAnimation() != null) {
                    nk0Var.getImageReceiver().getLottieAnimation().L(0, false, true);
                }
                this.c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb, 0L, "tgs", q0Var, 0);
                ImageReceiver imageReceiver = this.d;
                imageReceiver.setAllowStartLottieAnimation(false);
                MediaDataController.getInstance(qk0Var.G).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), ng.m0.a());
            }
            fg.r1 r1Var = this.f;
            if (r1Var != null) {
                r1Var.setImageReceiver(nk0Var2.getImageReceiver());
            }
        }
    }

    public final void f(ng.q0 q0Var, boolean z4) {
        boolean z10 = this.w;
        boolean contains = this.M.a0.contains(q0Var);
        this.w = contains;
        if (contains != z10) {
            nk0 nk0Var = this.a;
            nk0 nk0Var2 = this.b;
            if (z4) {
                ViewPropertyAnimator duration = nk0Var2.animate().scaleX(this.F * (this.w ? 0.76f : 1.0f)).scaleY(this.F * (this.w ? 0.76f : 1.0f)).setDuration(240L);
                pr prVar = pr.h;
                duration.setInterpolator(prVar).start();
                nk0Var.animate().scaleX(this.F * (this.w ? 0.76f : 1.0f)).scaleY(this.F * (this.w ? 0.76f : 1.0f)).setDuration(240L).setInterpolator(prVar).start();
            } else {
                nk0Var2.setScaleX(this.F * (contains ? 0.76f : 1.0f));
                nk0Var2.setScaleY(this.F * (this.w ? 0.76f : 1.0f));
                nk0Var.setScaleX(this.F * (this.w ? 0.76f : 1.0f));
                nk0Var.setScaleY(this.F * (this.w ? 0.76f : 1.0f));
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
        ng.q0 q0Var = this.e;
        if (q0Var != null) {
            String str = q0Var.f;
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
        if (this.L) {
            qk0 qk0Var = this.M;
            if (qk0Var.N == null) {
                int action = motionEvent.getAction();
                lk0 lk0Var = this.H;
                int i11 = 1;
                if (action == 0) {
                    this.K = true;
                    this.I = motionEvent.getX();
                    this.J = motionEvent.getY();
                    if (this.h == 1.0f && !this.E && (i10 = qk0Var.J0) != 3 && i10 != 4 && i10 != 5 && ((pk0Var = qk0Var.d0) == null || pk0Var.g())) {
                        AndroidUtilities.runOnUIThread(lk0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.I - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.J - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.K && ((qk0Var.i0 == null || qk0Var.k0 > 0.8f) && qk0Var.d0 != null)) {
                    qk0Var.o0 = true;
                    if (System.currentTimeMillis() - qk0Var.p0 > 300) {
                        qk0Var.p0 = System.currentTimeMillis();
                        qk0Var.d0.o(this, this.e, qk0Var.k0 > 0.8f, false);
                    }
                }
                if (!qk0Var.o0 && qk0Var.i0 != null) {
                    qk0Var.l0 = 0.0f;
                    float f10 = qk0Var.k0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    qk0Var.N = ofFloat;
                    ofFloat.addUpdateListener(new ek0(qk0Var, f10));
                    qk0Var.N.addListener(new dk0(qk0Var, i11));
                    qk0Var.N.setDuration(150L);
                    qk0Var.N.setInterpolator(pr.f);
                    qk0Var.N.start();
                }
                AndroidUtilities.cancelRunOnUIThread(lk0Var);
                this.K = false;
                return true;
            }
        }
        return false;
    }
}
