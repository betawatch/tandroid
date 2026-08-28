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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sj0 extends FrameLayout {
    public boolean A;
    public gh.bb B;
    public final pj0 C;
    public boolean D;
    public float E;
    public ValueAnimator F;
    public final pj0 G;
    public float H;
    public float I;
    public boolean J;
    public boolean K;
    public final /* synthetic */ uj0 L;
    public final rj0 a;
    public final rj0 b;
    public final rj0 c;
    public final ImageReceiver d;
    public hg.r0 e;
    public zf.b1 f;
    public float h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj0(uj0 uj0Var, Context context) {
        super(context);
        this.L = uj0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.x = true;
        this.C = new pj0(this, 0);
        this.E = 1.0f;
        int i9 = 1;
        this.G = new pj0(this, i9);
        this.K = true;
        rj0 rj0Var = new rj0(this, context, 0);
        this.a = rj0Var;
        rj0 rj0Var2 = new rj0(this, context, i9);
        this.b = rj0Var2;
        rj0Var.getImageReceiver().setAutoRepeat(0);
        rj0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        rj0 rj0Var3 = new rj0(this, context, 2);
        this.c = rj0Var3;
        addView(rj0Var, g7.e6.e(34, 34, 17));
        addView(rj0Var3, g7.e6.e(34, 34, 17));
        addView(rj0Var2, g7.e6.e(34, 34, 17));
        if (uj0Var.I0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        rj0Var.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        rj0Var2.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        rj0Var2.a.setAutoRepeat(0);
        rj0Var2.a.setAllowStartAnimation(false);
        rj0Var2.a.setAllowStartLottieAnimation(false);
        rj0Var3.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    public static void a(sj0 sj0Var, hg.r0 r0Var, int i9) {
        rj0 rj0Var = sj0Var.c;
        rj0 rj0Var2 = sj0Var.a;
        rj0 rj0Var3 = sj0Var.b;
        uj0 uj0Var = sj0Var.L;
        sj0Var.f(r0Var, false);
        hg.r0 r0Var2 = sj0Var.e;
        if (r0Var2 != null && r0Var2.equals(r0Var)) {
            sj0Var.y = i9;
            sj0Var.e(r0Var);
            return;
        }
        int i10 = uj0Var.F;
        org.telegram.ui.ActionBar.b6 b6Var = uj0Var.g0;
        int i11 = uj0Var.I0;
        boolean isPremium = UserConfig.getInstance(i10).isPremium();
        boolean z10 = (i11 == 3 && !isPremium) || (i11 == 5 && r0Var.d && !isPremium);
        sj0Var.D = z10;
        if (z10 && sj0Var.f == null) {
            zf.b1 b1Var = new zf.b1(sj0Var.getContext(), 1, null);
            sj0Var.f = b1Var;
            b1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            sj0Var.f.setImageReceiver(rj0Var3.getImageReceiver());
            sj0Var.addView(sj0Var.f, g7.e6.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        zf.b1 b1Var2 = sj0Var.f;
        if (b1Var2 != null) {
            b1Var2.setVisibility(sj0Var.D ? 0 : 8);
        }
        sj0Var.d();
        sj0Var.e = r0Var;
        sj0Var.r = r0Var.a || (r0Var.f != null && ((uj0Var.q() || uj0Var.C0) && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)));
        if (i11 == 4 || sj0Var.e.b) {
            sj0Var.r = false;
        }
        hg.r0 r0Var3 = sj0Var.e;
        if (r0Var3.a || r0Var3.f != null) {
            sj0Var.e(r0Var);
            rj0Var.setAnimatedEmojiDrawable(null);
            if (rj0Var2.getImageReceiver().getLottieAnimation() != null) {
                rj0Var2.getImageReceiver().getLottieAnimation().L(0, false, false);
            }
            zf.b1 b1Var3 = sj0Var.f;
            if (b1Var3 != null) {
                b1Var3.setAnimatedEmojiDrawable(null);
            }
        } else {
            rj0Var.getImageReceiver().clearImage();
            rj0Var3.getImageReceiver().clearImage();
            k5 k5Var = new k5(4, uj0Var.F, sj0Var.e.g);
            k5 k5Var2 = new k5(3, uj0Var.F, sj0Var.e.g);
            if (i11 == 1 || i11 == 2 || i11 == 4) {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                k5Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
                k5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
            } else {
                int i12 = org.telegram.ui.ActionBar.f6.v6;
                int v02 = org.telegram.ui.ActionBar.f6.v0(i12, b6Var);
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                k5Var.setColorFilter(new PorterDuffColorFilter(v02, mode2));
                k5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i12, b6Var), mode2));
            }
            rj0Var.setAnimatedEmojiDrawable(k5Var);
            rj0Var3.setAnimatedEmojiDrawable(k5Var2);
            zf.b1 b1Var4 = sj0Var.f;
            if (b1Var4 != null) {
                b1Var4.setAnimatedEmojiDrawable(k5Var2);
            }
        }
        sj0Var.setFocusable(true);
        boolean z11 = sj0Var.r;
        sj0Var.s = z11;
        if (z11) {
            sj0Var.v = false;
            rj0Var2.setVisibility(0);
            rj0Var3.setVisibility(8);
        } else {
            rj0Var2.setVisibility(8);
            rj0Var3.setVisibility(0);
            sj0Var.v = true;
        }
        ViewGroup.LayoutParams layoutParams = rj0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = rj0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = rj0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = rj0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        rj0 rj0Var = this.b;
        k5 k5Var = rj0Var.e;
        ImageReceiver imageReceiver = k5Var != null ? k5Var.k : rj0Var.a;
        if (imageReceiver == null || imageReceiver.getLottieAnimation() == null) {
            return;
        }
        uj0 uj0Var = this.L;
        if (uj0Var.t0 != null || this.J || !uj0Var.C0) {
            imageReceiver.getLottieAnimation().start();
        } else if (imageReceiver.getLottieAnimation().X <= 2) {
            imageReceiver.getLottieAnimation().stop();
        }
    }

    public final void c(int i9) {
        if (!this.L.f0) {
            d();
            this.n = true;
            if (this.r) {
                return;
            }
            this.b.setVisibility(0);
            this.b.setScaleY(this.E * (this.w ? 0.76f : 1.0f));
            this.b.setScaleX(this.E * (this.w ? 0.76f : 1.0f));
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.C);
        if (!this.r) {
            if (this.n) {
                return;
            }
            this.E = 0.0f;
            this.b.setScaleX(0.0f);
            this.b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new q60(this, 9));
            this.F.setDuration(150L);
            this.F.setInterpolator(gr.h);
            this.F.setStartDelay((long) (i9 * this.L.c));
            this.F.start();
            this.n = true;
            return;
        }
        if (this.a.getImageReceiver().getLottieAnimation() == null || this.a.getImageReceiver().getLottieAnimation().w() || this.n) {
            if (this.a.getImageReceiver().getLottieAnimation() != null && this.n && !this.a.getImageReceiver().getLottieAnimation().h0 && !this.a.getImageReceiver().getLottieAnimation().w()) {
                this.a.getImageReceiver().getLottieAnimation().L(this.a.getImageReceiver().getLottieAnimation().e[0] - 1, false, false);
            }
            this.b.setScaleY(this.E * (this.w ? 0.76f : 1.0f));
            this.b.setScaleX(this.E * (this.w ? 0.76f : 1.0f));
            return;
        }
        this.n = true;
        if (i9 == 0) {
            this.A = false;
            this.a.getImageReceiver().getLottieAnimation().stop();
            this.a.getImageReceiver().getLottieAnimation().L(0, false, false);
            this.C.run();
            return;
        }
        this.A = true;
        this.a.getImageReceiver().getLottieAnimation().stop();
        this.a.getImageReceiver().getLottieAnimation().L(0, false, false);
        AndroidUtilities.runOnUIThread(this.C, i9);
    }

    public final void d() {
        boolean z10 = this.r;
        uj0 uj0Var = this.L;
        rj0 rj0Var = this.b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.C);
            rj0 rj0Var2 = this.a;
            if (rj0Var2.getImageReceiver().getLottieAnimation() != null && !rj0Var2.getImageReceiver().getLottieAnimation().w()) {
                rj0Var2.getImageReceiver().getLottieAnimation().stop();
                if (uj0Var.f0) {
                    rj0Var2.getImageReceiver().getLottieAnimation().L(0, false, true);
                } else {
                    rj0Var2.getImageReceiver().getLottieAnimation().L(rj0Var2.getImageReceiver().getLottieAnimation().e[0] - 1, false, true);
                }
            }
            rj0Var.setVisibility(4);
            rj0Var2.setVisibility(0);
            this.v = false;
            rj0Var.setScaleY(this.E * (this.w ? 0.76f : 1.0f));
            rj0Var.setScaleX(this.E * (this.w ? 0.76f : 1.0f));
        } else {
            rj0Var.animate().cancel();
            if (uj0Var.J0) {
                rj0Var.setScaleY(this.E * (this.w ? 0.76f : 1.0f));
                rj0Var.setScaleX(this.E * (this.w ? 0.76f : 1.0f));
            } else {
                rj0Var.setScaleY(0.0f);
                rj0Var.setScaleX(0.0f);
            }
        }
        this.n = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i9;
        ih.z2 z2Var;
        if (this.w && this.x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            hg.r0 r0Var = this.e;
            uj0 uj0Var = this.L;
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, (r0Var == null || !r0Var.a) ? uj0Var.D0 : uj0Var.E0);
        }
        k5 k5Var = this.b.e;
        if (k5Var != null && (z2Var = k5Var.k) != null) {
            if (this.y == 0) {
                z2Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                z2Var.setRoundRadius(this.w ? AndroidUtilities.dp(6.0f) : 0);
            }
        }
        hg.r0 r0Var2 = this.e;
        if (r0Var2 != null && r0Var2.a && this.B != null && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            mi0 lottieAnimation = this.a.getImageReceiver().getLottieAnimation();
            this.B.j = (int) (r2.b.size() * ((lottieAnimation == null || (i9 = lottieAnimation.X) <= 30) ? 0.0f : Utilities.clamp01((i9 - 30) / 30.0f)));
            this.B.g(rectF);
            this.B.d();
            this.B.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(hg.r0 r0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        uj0 uj0Var = this.L;
        int i9 = uj0Var.I0;
        rj0 rj0Var = this.a;
        rj0 rj0Var2 = this.b;
        if (r0Var != null && r0Var.a) {
            rj0Var.getImageReceiver().setImageBitmap(new mi0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), "star_reaction", AndroidUtilities.dp(30.0f)));
            rj0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.B == null) {
                this.B = new gh.bb(1, SharedConfig.getDevicePerformanceClass() == 2 ? 45 : 18);
                return;
            }
            return;
        }
        if (i9 == 4 && r0Var != null && r0Var.f != null) {
            rj0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(r0Var.f));
            rj0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(r0Var.f));
            return;
        }
        hg.r0 r0Var2 = this.e;
        if (r0Var2.b) {
            TLRPC.Document effectDocument = MessagesController.getInstance(uj0Var.F).getEffectDocument(this.e.g);
            rj0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(effectDocument), "60_60_firstframe", null, null, this.r ? null : DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.f6.m6, 0.2f), 0L, "tgs", this.e, 0);
            return;
        }
        if (r0Var2.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(uj0Var.F).getReactionsMap().get(this.e.f);
            if (tL_availableReaction2 != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.f6.m6, 0.2f);
                if (!LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) || i9 == 4) {
                    tL_availableReaction = tL_availableReaction2;
                    if (SharedConfig.getDevicePerformanceClass() <= 0 || i9 == 4) {
                        rj0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                    } else {
                        rj0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", r0Var, 0);
                        rj0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                    }
                } else {
                    tL_availableReaction = tL_availableReaction2;
                    rj0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", r0Var, 0);
                    rj0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, this.r ? null : svgThumb, 0L, "tgs", this.e, 0);
                }
                if (rj0Var.getImageReceiver().getLottieAnimation() != null) {
                    rj0Var.getImageReceiver().getLottieAnimation().L(0, false, true);
                }
                this.c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb, 0L, "tgs", r0Var, 0);
                ImageReceiver imageReceiver = this.d;
                imageReceiver.setAllowStartLottieAnimation(false);
                MediaDataController.getInstance(uj0Var.F).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), hg.n0.a());
            }
            zf.b1 b1Var = this.f;
            if (b1Var != null) {
                b1Var.setImageReceiver(rj0Var2.getImageReceiver());
            }
        }
    }

    public final void f(hg.r0 r0Var, boolean z10) {
        boolean z11 = this.w;
        boolean contains = this.L.W.contains(r0Var);
        this.w = contains;
        if (contains != z11) {
            rj0 rj0Var = this.a;
            rj0 rj0Var2 = this.b;
            if (z10) {
                ViewPropertyAnimator duration = rj0Var2.animate().scaleX(this.E * (this.w ? 0.76f : 1.0f)).scaleY(this.E * (this.w ? 0.76f : 1.0f)).setDuration(240L);
                gr grVar = gr.h;
                duration.setInterpolator(grVar).start();
                rj0Var.animate().scaleX(this.E * (this.w ? 0.76f : 1.0f)).scaleY(this.E * (this.w ? 0.76f : 1.0f)).setDuration(240L).setInterpolator(grVar).start();
            } else {
                rj0Var2.setScaleX(this.E * (contains ? 0.76f : 1.0f));
                rj0Var2.setScaleY(this.E * (this.w ? 0.76f : 1.0f));
                rj0Var.setScaleX(this.E * (this.w ? 0.76f : 1.0f));
                rj0Var.setScaleY(this.E * (this.w ? 0.76f : 1.0f));
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
        hg.r0 r0Var = this.e;
        if (r0Var != null) {
            String str = r0Var.f;
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
        int i9;
        tj0 tj0Var;
        if (this.K) {
            uj0 uj0Var = this.L;
            if (uj0Var.M == null) {
                int action = motionEvent.getAction();
                pj0 pj0Var = this.G;
                if (action == 0) {
                    this.J = true;
                    this.H = motionEvent.getX();
                    this.I = motionEvent.getY();
                    if (this.h == 1.0f && !this.D && (i9 = uj0Var.I0) != 3 && i9 != 4 && i9 != 5 && ((tj0Var = uj0Var.c0) == null || tj0Var.n())) {
                        AndroidUtilities.runOnUIThread(pj0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                int i10 = 2;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.H - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.I - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.J && ((uj0Var.h0 == null || uj0Var.j0 > 0.8f) && uj0Var.c0 != null)) {
                    uj0Var.n0 = true;
                    if (System.currentTimeMillis() - uj0Var.o0 > 300) {
                        uj0Var.o0 = System.currentTimeMillis();
                        uj0Var.c0.d(this, this.e, uj0Var.j0 > 0.8f, false);
                    }
                }
                if (!uj0Var.n0 && uj0Var.h0 != null) {
                    uj0Var.k0 = 0.0f;
                    float f10 = uj0Var.j0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    uj0Var.M = ofFloat;
                    ofFloat.addUpdateListener(new ij0(uj0Var, f10));
                    uj0Var.M.addListener(new kh.l5(uj0Var, i10));
                    uj0Var.M.setDuration(150L);
                    uj0Var.M.setInterpolator(gr.f);
                    uj0Var.M.start();
                }
                AndroidUtilities.cancelRunOnUIThread(pj0Var);
                this.J = false;
                return true;
            }
        }
        return false;
    }
}
