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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class nk0 extends FrameLayout {
    public boolean B;
    public lh.wa C;
    public final kk0 D;
    public boolean E;
    public float F;
    public ValueAnimator G;
    public final kk0 H;
    public float I;
    public float J;
    public boolean K;
    public boolean L;
    public final /* synthetic */ pk0 M;
    public final mk0 a;
    public final mk0 b;
    public final mk0 c;
    public final ImageReceiver d;
    public mg.q0 e;
    public eg.s1 f;
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
        this.M = pk0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.x = true;
        this.D = new kk0(this, 0);
        this.F = 1.0f;
        int i10 = 1;
        this.H = new kk0(this, i10);
        this.L = true;
        mk0 mk0Var = new mk0(this, context, 0);
        this.a = mk0Var;
        mk0 mk0Var2 = new mk0(this, context, i10);
        this.b = mk0Var2;
        mk0Var.getImageReceiver().setAutoRepeat(0);
        mk0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        mk0 mk0Var3 = new mk0(this, context, 2);
        this.c = mk0Var3;
        addView(mk0Var, k7.b6.e(34, 34, 17));
        addView(mk0Var3, k7.b6.e(34, 34, 17));
        addView(mk0Var2, k7.b6.e(34, 34, 17));
        if (pk0Var.J0 == 4) {
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

    public static void a(nk0 nk0Var, mg.q0 q0Var, int i10) {
        mk0 mk0Var = nk0Var.c;
        mk0 mk0Var2 = nk0Var.a;
        mk0 mk0Var3 = nk0Var.b;
        pk0 pk0Var = nk0Var.M;
        nk0Var.f(q0Var, false);
        mg.q0 q0Var2 = nk0Var.e;
        if (q0Var2 != null && q0Var2.equals(q0Var)) {
            nk0Var.y = i10;
            nk0Var.e(q0Var);
            return;
        }
        int i11 = pk0Var.G;
        org.telegram.ui.ActionBar.f6 f6Var = pk0Var.h0;
        int i12 = pk0Var.J0;
        boolean isPremium = UserConfig.getInstance(i11).isPremium();
        boolean z4 = (i12 == 3 && !isPremium) || (i12 == 5 && q0Var.d && !isPremium);
        nk0Var.E = z4;
        if (z4 && nk0Var.f == null) {
            eg.s1 s1Var = new eg.s1(nk0Var.getContext(), 1, null);
            nk0Var.f = s1Var;
            s1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            nk0Var.f.setImageReceiver(mk0Var3.getImageReceiver());
            nk0Var.addView(nk0Var.f, k7.b6.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        eg.s1 s1Var2 = nk0Var.f;
        if (s1Var2 != null) {
            s1Var2.setVisibility(nk0Var.E ? 0 : 8);
        }
        nk0Var.d();
        nk0Var.e = q0Var;
        nk0Var.r = q0Var.a || (q0Var.f != null && ((pk0Var.q() || pk0Var.D0) && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)));
        if (i12 == 4 || nk0Var.e.b) {
            nk0Var.r = false;
        }
        mg.q0 q0Var3 = nk0Var.e;
        if (q0Var3.a || q0Var3.f != null) {
            nk0Var.e(q0Var);
            mk0Var.setAnimatedEmojiDrawable(null);
            if (mk0Var2.getImageReceiver().getLottieAnimation() != null) {
                mk0Var2.getImageReceiver().getLottieAnimation().L(0, false, false);
            }
            eg.s1 s1Var3 = nk0Var.f;
            if (s1Var3 != null) {
                s1Var3.setAnimatedEmojiDrawable(null);
            }
        } else {
            mk0Var.getImageReceiver().clearImage();
            mk0Var3.getImageReceiver().clearImage();
            l5 l5Var = new l5(4, pk0Var.G, nk0Var.e.g);
            l5 l5Var2 = new l5(3, pk0Var.G, nk0Var.e.g);
            if (i12 == 1 || i12 == 2 || i12 == 4) {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                l5Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
                l5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
            } else {
                int i13 = org.telegram.ui.ActionBar.j6.v6;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                l5Var.setColorFilter(new PorterDuffColorFilter(v02, mode2));
                l5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i13, f6Var), mode2));
            }
            mk0Var.setAnimatedEmojiDrawable(l5Var);
            mk0Var3.setAnimatedEmojiDrawable(l5Var2);
            eg.s1 s1Var4 = nk0Var.f;
            if (s1Var4 != null) {
                s1Var4.setAnimatedEmojiDrawable(l5Var2);
            }
        }
        nk0Var.setFocusable(true);
        boolean z10 = nk0Var.r;
        nk0Var.s = z10;
        if (z10) {
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
        l5 l5Var = mk0Var.e;
        ImageReceiver imageReceiver = l5Var != null ? l5Var.k : mk0Var.a;
        if (imageReceiver == null || imageReceiver.getLottieAnimation() == null) {
            return;
        }
        pk0 pk0Var = this.M;
        if (pk0Var.u0 != null || this.K || !pk0Var.D0) {
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
            ofFloat.addUpdateListener(new j70(this, 9));
            this.G.setDuration(150L);
            this.G.setInterpolator(mr.h);
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
        pk0 pk0Var = this.M;
        mk0 mk0Var = this.b;
        if (z4) {
            AndroidUtilities.cancelRunOnUIThread(this.D);
            mk0 mk0Var2 = this.a;
            if (mk0Var2.getImageReceiver().getLottieAnimation() != null && !mk0Var2.getImageReceiver().getLottieAnimation().w()) {
                mk0Var2.getImageReceiver().getLottieAnimation().stop();
                if (pk0Var.g0) {
                    mk0Var2.getImageReceiver().getLottieAnimation().L(0, false, true);
                } else {
                    mk0Var2.getImageReceiver().getLottieAnimation().L(mk0Var2.getImageReceiver().getLottieAnimation().e[0] - 1, false, true);
                }
            }
            mk0Var.setVisibility(4);
            mk0Var2.setVisibility(0);
            this.v = false;
            mk0Var.setScaleY(this.F * (this.w ? 0.76f : 1.0f));
            mk0Var.setScaleX(this.F * (this.w ? 0.76f : 1.0f));
        } else {
            mk0Var.animate().cancel();
            if (pk0Var.K0) {
                mk0Var.setScaleY(this.F * (this.w ? 0.76f : 1.0f));
                mk0Var.setScaleX(this.F * (this.w ? 0.76f : 1.0f));
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
        nh.y2 y2Var;
        if (this.w && this.x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            mg.q0 q0Var = this.e;
            pk0 pk0Var = this.M;
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, (q0Var == null || !q0Var.a) ? pk0Var.E0 : pk0Var.F0);
        }
        l5 l5Var = this.b.e;
        if (l5Var != null && (y2Var = l5Var.k) != null) {
            if (this.y == 0) {
                y2Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                y2Var.setRoundRadius(this.w ? AndroidUtilities.dp(6.0f) : 0);
            }
        }
        mg.q0 q0Var2 = this.e;
        if (q0Var2 != null && q0Var2.a && this.C != null && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            gj0 lottieAnimation = this.a.getImageReceiver().getLottieAnimation();
            this.C.j = (int) (r2.b.size() * ((lottieAnimation == null || (i10 = lottieAnimation.Y) <= 30) ? 0.0f : Utilities.clamp01((i10 - 30) / 30.0f)));
            this.C.g(rectF);
            this.C.d();
            this.C.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(mg.q0 q0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        pk0 pk0Var = this.M;
        int i10 = pk0Var.J0;
        mk0 mk0Var = this.a;
        mk0 mk0Var2 = this.b;
        if (q0Var != null && q0Var.a) {
            mk0Var.getImageReceiver().setImageBitmap(new gj0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            mk0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.C == null) {
                this.C = new lh.wa(1, SharedConfig.getDevicePerformanceClass() == 2 ? 45 : 18);
                return;
            }
            return;
        }
        if (i10 == 4 && q0Var != null && q0Var.f != null) {
            mk0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(q0Var.f));
            mk0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(q0Var.f));
            return;
        }
        mg.q0 q0Var2 = this.e;
        if (q0Var2.b) {
            TLRPC.Document effectDocument = MessagesController.getInstance(pk0Var.G).getEffectDocument(this.e.g);
            mk0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(effectDocument), "60_60_firstframe", null, null, this.r ? null : DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.j6.m6, 0.2f), 0L, "tgs", this.e, 0);
            return;
        }
        if (q0Var2.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(pk0Var.G).getReactionsMap().get(this.e.f);
            if (tL_availableReaction2 != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.j6.m6, 0.2f);
                if (!LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) || i10 == 4) {
                    tL_availableReaction = tL_availableReaction2;
                    if (SharedConfig.getDevicePerformanceClass() <= 0 || i10 == 4) {
                        mk0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                    } else {
                        mk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", q0Var, 0);
                        mk0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                    }
                } else {
                    tL_availableReaction = tL_availableReaction2;
                    mk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", q0Var, 0);
                    mk0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                }
                if (mk0Var.getImageReceiver().getLottieAnimation() != null) {
                    mk0Var.getImageReceiver().getLottieAnimation().L(0, false, true);
                }
                this.c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb, 0L, "tgs", q0Var, 0);
                ImageReceiver imageReceiver = this.d;
                imageReceiver.setAllowStartLottieAnimation(false);
                MediaDataController.getInstance(pk0Var.G).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), mg.m0.a());
            }
            eg.s1 s1Var = this.f;
            if (s1Var != null) {
                s1Var.setImageReceiver(mk0Var2.getImageReceiver());
            }
        }
    }

    public final void f(mg.q0 q0Var, boolean z4) {
        boolean z10 = this.w;
        boolean contains = this.M.a0.contains(q0Var);
        this.w = contains;
        if (contains != z10) {
            mk0 mk0Var = this.a;
            mk0 mk0Var2 = this.b;
            if (z4) {
                ViewPropertyAnimator duration = mk0Var2.animate().scaleX(this.F * (this.w ? 0.76f : 1.0f)).scaleY(this.F * (this.w ? 0.76f : 1.0f)).setDuration(240L);
                mr mrVar = mr.h;
                duration.setInterpolator(mrVar).start();
                mk0Var.animate().scaleX(this.F * (this.w ? 0.76f : 1.0f)).scaleY(this.F * (this.w ? 0.76f : 1.0f)).setDuration(240L).setInterpolator(mrVar).start();
            } else {
                mk0Var2.setScaleX(this.F * (contains ? 0.76f : 1.0f));
                mk0Var2.setScaleY(this.F * (this.w ? 0.76f : 1.0f));
                mk0Var.setScaleX(this.F * (this.w ? 0.76f : 1.0f));
                mk0Var.setScaleY(this.F * (this.w ? 0.76f : 1.0f));
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
        mg.q0 q0Var = this.e;
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
        ok0 ok0Var;
        if (this.L) {
            pk0 pk0Var = this.M;
            if (pk0Var.N == null) {
                int action = motionEvent.getAction();
                kk0 kk0Var = this.H;
                int i11 = 1;
                if (action == 0) {
                    this.K = true;
                    this.I = motionEvent.getX();
                    this.J = motionEvent.getY();
                    if (this.h == 1.0f && !this.E && (i10 = pk0Var.J0) != 3 && i10 != 4 && i10 != 5 && ((ok0Var = pk0Var.d0) == null || ok0Var.i())) {
                        AndroidUtilities.runOnUIThread(kk0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.I - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.J - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.K && ((pk0Var.i0 == null || pk0Var.k0 > 0.8f) && pk0Var.d0 != null)) {
                    pk0Var.o0 = true;
                    if (System.currentTimeMillis() - pk0Var.p0 > 300) {
                        pk0Var.p0 = System.currentTimeMillis();
                        pk0Var.d0.j(this, this.e, pk0Var.k0 > 0.8f, false);
                    }
                }
                if (!pk0Var.o0 && pk0Var.i0 != null) {
                    pk0Var.l0 = 0.0f;
                    float f10 = pk0Var.k0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    pk0Var.N = ofFloat;
                    ofFloat.addUpdateListener(new dk0(pk0Var, f10));
                    pk0Var.N.addListener(new ck0(pk0Var, i11));
                    pk0Var.N.setDuration(150L);
                    pk0Var.N.setInterpolator(mr.f);
                    pk0Var.N.start();
                }
                AndroidUtilities.cancelRunOnUIThread(kk0Var);
                this.K = false;
                return true;
            }
        }
        return false;
    }
}
