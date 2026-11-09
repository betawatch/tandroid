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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class hi0 extends FrameLayout {
    public int D;
    public boolean E;
    public bi.ud F;
    public final ei0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final ei0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final /* synthetic */ ji0 P;
    public final gi0 a;
    public final gi0 b;
    public final gi0 c;
    public final ImageReceiver d;
    public ch.o0 e;
    public ug.z0 f;
    public float h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi0(ji0 ji0Var, Context context) {
        super(context);
        this.P = ji0Var;
        this.d = new ImageReceiver(null);
        this.h = 1.0f;
        this.y = true;
        this.G = new ei0(this, 0);
        this.I = 1.0f;
        int i7 = 1;
        this.K = new ei0(this, i7);
        this.O = true;
        gi0 gi0Var = new gi0(this, context, 0);
        this.a = gi0Var;
        gi0 gi0Var2 = new gi0(this, context, i7);
        this.b = gi0Var2;
        gi0Var.getImageReceiver().W(0);
        gi0Var.getImageReceiver().u0 = false;
        gi0 gi0Var3 = new gi0(this, context, 2);
        this.c = gi0Var3;
        addView(gi0Var, c8.ha.e(34, 34, 17));
        addView(gi0Var3, c8.ha.e(34, 34, 17));
        addView(gi0Var2, c8.ha.e(34, 34, 17));
        if (ji0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        gi0Var.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        gi0Var2.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        gi0Var2.a.W(0);
        ImageReceiver imageReceiver = gi0Var2.a;
        imageReceiver.t0 = false;
        imageReceiver.u0 = false;
        gi0Var3.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    public static void a(hi0 hi0Var, ch.o0 o0Var, int i7) {
        gi0 gi0Var = hi0Var.c;
        gi0 gi0Var2 = hi0Var.a;
        gi0 gi0Var3 = hi0Var.b;
        ji0 ji0Var = hi0Var.P;
        hi0Var.f(o0Var, false);
        ch.o0 o0Var2 = hi0Var.e;
        if (o0Var2 != null && o0Var2.equals(o0Var)) {
            hi0Var.D = i7;
            hi0Var.e(o0Var);
            return;
        }
        int i10 = ji0Var.J;
        org.telegram.ui.ActionBar.g6 g6Var = ji0Var.k0;
        int i11 = ji0Var.M0;
        boolean q10 = org.telegram.messenger.p10.i(i10).q();
        boolean z9 = (i11 == 3 && !q10) || (i11 == 5 && o0Var.d && !q10);
        hi0Var.H = z9;
        if (z9 && hi0Var.f == null) {
            ug.z0 z0Var = new ug.z0(1, hi0Var.getContext(), null);
            hi0Var.f = z0Var;
            z0Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            hi0Var.f.setImageReceiver(gi0Var3.getImageReceiver());
            hi0Var.addView(hi0Var.f, c8.ha.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        ug.z0 z0Var2 = hi0Var.f;
        if (z0Var2 != null) {
            z0Var2.setVisibility(hi0Var.H ? 0 : 8);
        }
        hi0Var.d();
        hi0Var.e = o0Var;
        hi0Var.r = o0Var.a || (o0Var.f != null && ((ji0Var.q() || ji0Var.G0) && org.telegram.messenger.sc.e(8200)));
        if (i11 == 4 || hi0Var.e.b) {
            hi0Var.r = false;
        }
        ch.o0 o0Var3 = hi0Var.e;
        if (o0Var3.a || o0Var3.f != null) {
            hi0Var.e(o0Var);
            gi0Var.setAnimatedEmojiDrawable(null);
            if (gi0Var2.getImageReceiver().B() != null) {
                gi0Var2.getImageReceiver().B().N(0, false, false);
            }
            ug.z0 z0Var3 = hi0Var.f;
            if (z0Var3 != null) {
                z0Var3.setAnimatedEmojiDrawable(null);
            }
        } else {
            gi0Var.getImageReceiver().f();
            gi0Var3.getImageReceiver().f();
            i5 i5Var = new i5(4, ji0Var.J, hi0Var.e.g);
            i5 i5Var2 = new i5(3, ji0Var.J, hi0Var.e.g);
            if (i11 == 1 || i11 == 2 || i11 == 4) {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                i5Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
                i5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
            } else {
                int i12 = org.telegram.ui.ActionBar.l6.v6;
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                org.telegram.ui.ActionBar.s6.x(hi0Var, i5Var, i12, g6Var, mode2);
                org.telegram.ui.ActionBar.s6.x(hi0Var, i5Var2, i12, g6Var, mode2);
            }
            gi0Var.setAnimatedEmojiDrawable(i5Var);
            gi0Var3.setAnimatedEmojiDrawable(i5Var2);
            ug.z0 z0Var4 = hi0Var.f;
            if (z0Var4 != null) {
                z0Var4.setAnimatedEmojiDrawable(i5Var2);
            }
        }
        hi0Var.setFocusable(true);
        boolean z10 = hi0Var.r;
        hi0Var.s = z10;
        if (z10) {
            hi0Var.w = false;
            gi0Var2.setVisibility(0);
            gi0Var3.setVisibility(8);
        } else {
            gi0Var2.setVisibility(8);
            gi0Var3.setVisibility(0);
            hi0Var.w = true;
        }
        ViewGroup.LayoutParams layoutParams = gi0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = gi0Var3.getLayoutParams();
        int L = org.telegram.messenger.g0.L(34.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        ViewGroup.LayoutParams layoutParams3 = gi0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = gi0Var2.getLayoutParams();
        int L2 = org.telegram.messenger.g0.L(34.0f);
        layoutParams4.height = L2;
        layoutParams3.width = L2;
    }

    public final void b() {
        gi0 gi0Var = this.b;
        i5 i5Var = gi0Var.e;
        ImageReceiver imageReceiver = i5Var != null ? i5Var.k : gi0Var.a;
        if (imageReceiver == null || imageReceiver.B() == null) {
            return;
        }
        ji0 ji0Var = this.P;
        if (ji0Var.x0 != null || this.N || !ji0Var.G0) {
            imageReceiver.B().start();
        } else if (imageReceiver.B().a0 <= 2) {
            imageReceiver.B().stop();
        }
    }

    public final void c(int i7) {
        if (!this.P.j0) {
            d();
            this.n = true;
            if (this.r) {
                return;
            }
            this.b.setVisibility(0);
            this.b.setScaleY(this.I * (this.x ? 0.76f : 1.0f));
            this.b.setScaleX(this.I * (this.x ? 0.76f : 1.0f));
            return;
        }
        org.telegram.messenger.g0.r(this.G);
        if (!this.r) {
            if (this.n) {
                return;
            }
            this.I = 0.0f;
            this.b.setScaleX(0.0f);
            this.b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new d60(this, 8));
            this.J.setDuration(150L);
            this.J.setInterpolator(xq.h);
            this.J.setStartDelay((long) (i7 * this.P.c));
            this.J.start();
            this.n = true;
            return;
        }
        if (this.a.getImageReceiver().B() == null || this.a.getImageReceiver().B().y() || this.n) {
            if (this.a.getImageReceiver().B() != null && this.n && !this.a.getImageReceiver().B().k0 && !this.a.getImageReceiver().B().y()) {
                this.a.getImageReceiver().B().N(this.a.getImageReceiver().B().e[0] - 1, false, false);
            }
            this.b.setScaleY(this.I * (this.x ? 0.76f : 1.0f));
            this.b.setScaleX(this.I * (this.x ? 0.76f : 1.0f));
            return;
        }
        this.n = true;
        if (i7 == 0) {
            this.E = false;
            this.a.getImageReceiver().B().stop();
            this.a.getImageReceiver().B().N(0, false, false);
            this.G.run();
            return;
        }
        this.E = true;
        this.a.getImageReceiver().B().stop();
        this.a.getImageReceiver().B().N(0, false, false);
        org.telegram.messenger.g0.i3(this.G, i7);
    }

    public final void d() {
        boolean z9 = this.r;
        ji0 ji0Var = this.P;
        gi0 gi0Var = this.b;
        if (z9) {
            org.telegram.messenger.g0.r(this.G);
            gi0 gi0Var2 = this.a;
            if (gi0Var2.getImageReceiver().B() != null && !gi0Var2.getImageReceiver().B().y()) {
                gi0Var2.getImageReceiver().B().stop();
                if (ji0Var.j0) {
                    gi0Var2.getImageReceiver().B().N(0, false, true);
                } else {
                    gi0Var2.getImageReceiver().B().N(gi0Var2.getImageReceiver().B().e[0] - 1, false, true);
                }
            }
            gi0Var.setVisibility(4);
            gi0Var2.setVisibility(0);
            this.w = false;
            gi0Var.setScaleY(this.I * (this.x ? 0.76f : 1.0f));
            gi0Var.setScaleX(this.I * (this.x ? 0.76f : 1.0f));
        } else {
            gi0Var.animate().cancel();
            if (ji0Var.N0) {
                gi0Var.setScaleY(this.I * (this.x ? 0.76f : 1.0f));
                gi0Var.setScaleX(this.I * (this.x ? 0.76f : 1.0f));
            } else {
                gi0Var.setScaleY(0.0f);
                gi0Var.setScaleX(0.0f);
            }
        }
        this.n = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        di.z2 z2Var;
        if (this.x && this.y) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - org.telegram.messenger.g0.L(1.0f);
            ch.o0 o0Var = this.e;
            ji0 ji0Var = this.P;
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, (o0Var == null || !o0Var.a) ? ji0Var.H0 : ji0Var.I0);
        }
        i5 i5Var = this.b.e;
        if (i5Var != null && (z2Var = i5Var.k) != null) {
            if (this.D == 0) {
                z2Var.K0(org.telegram.messenger.g0.L(6.0f), 0, 0, org.telegram.messenger.g0.L(6.0f));
            } else {
                z2Var.J0(this.x ? org.telegram.messenger.g0.L(6.0f) : 0);
            }
        }
        ch.o0 o0Var2 = this.e;
        if (o0Var2 != null && o0Var2.a && this.F != null && org.telegram.messenger.sc.e(8200) && org.telegram.messenger.sc.e(131072)) {
            RectF rectF = org.telegram.messenger.g0.P;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            ah0 B = this.a.getImageReceiver().B();
            this.F.j = (int) (r2.b.size() * ((B == null || (i7 = B.a0) <= 30) ? 0.0f : Utilities.l((i7 - 30) / 30.0f)));
            this.F.g(rectF);
            this.F.d();
            this.F.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    public final void e(ch.o0 o0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        gi0 gi0Var;
        org.telegram.messenger.rz rzVar;
        ?? r14;
        TLRPC.Document document;
        ji0 ji0Var = this.P;
        int i7 = ji0Var.M0;
        gi0 gi0Var2 = this.a;
        gi0 gi0Var3 = this.b;
        if (o0Var != null && o0Var.a) {
            gi0Var2.getImageReceiver().w0(new ah0(R.raw.star_reaction, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f)));
            gi0Var3.getImageReceiver().w0(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                this.F = new bi.ud(1, org.telegram.messenger.iz.o() == 2 ? 45 : 18);
                return;
            }
            return;
        }
        if (i7 == 4 && o0Var != null && o0Var.f != null) {
            gi0Var2.getImageReceiver().w0(org.telegram.messenger.i6.g(o0Var.f));
            gi0Var3.getImageReceiver().w0(org.telegram.messenger.i6.g(o0Var.f));
            return;
        }
        ch.o0 o0Var2 = this.e;
        if (o0Var2.b) {
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(ji0Var.J);
            long j3 = this.e.g;
            if (s12.h8 != null) {
                for (int i10 = 0; i10 < s12.h8.documents.size(); i10++) {
                    if (s12.h8.documents.get(i10).id == j3) {
                        document = s12.h8.documents.get(i10);
                        break;
                    }
                }
            }
            document = null;
            gi0Var3.getImageReceiver().r0(org.telegram.messenger.hc.b(document), "60_60_firstframe", null, null, this.r ? null : org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.l6.m6, 0.2f, null), 0L, "tgs", this.e, 0);
            return;
        }
        if (o0Var2.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(ji0Var.J).r.get(this.e.f);
            if (tL_availableReaction2 != null) {
                org.telegram.messenger.rz f10 = org.telegram.messenger.t5.f(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.l6.m6, 0.2f, null);
                if (!org.telegram.messenger.sc.e(8200) || i7 == 4) {
                    tL_availableReaction = tL_availableReaction2;
                    gi0Var = gi0Var2;
                    boolean z9 = false;
                    rzVar = f10;
                    if (org.telegram.messenger.iz.o() <= 0 || i7 == 4) {
                        gi0Var3.getImageReceiver().r0(org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : rzVar, 0L, "tgs", this.e, 0);
                        r14 = z9;
                    } else {
                        gi0Var.getImageReceiver().r0(org.telegram.messenger.hc.b(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, rzVar, 0L, "tgs", o0Var, 0);
                        gi0Var3.getImageReceiver().r0(org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : rzVar, 0L, "tgs", this.e, 0);
                        r14 = z9;
                    }
                } else {
                    rzVar = f10;
                    gi0Var = gi0Var2;
                    r14 = 0;
                    tL_availableReaction = tL_availableReaction2;
                    gi0Var2.getImageReceiver().r0(org.telegram.messenger.hc.b(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, rzVar, 0L, "tgs", o0Var, 0);
                    gi0Var3.getImageReceiver().r0(org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, this.r ? null : rzVar, 0L, "tgs", this.e, 0);
                }
                if (gi0Var.getImageReceiver().B() != null) {
                    gi0Var.getImageReceiver().B().N(r14, r14, true);
                }
                this.c.getImageReceiver().r0(org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, rzVar, 0L, "tgs", o0Var, 0);
                ImageReceiver imageReceiver = this.d;
                imageReceiver.u0 = r14;
                org.telegram.messenger.ui.b0(ji0Var.J);
                org.telegram.messenger.ui.m1(imageReceiver, org.telegram.messenger.hc.b(tL_availableReaction.around_animation), ch.k0.a());
            }
            ug.z0 z0Var = this.f;
            if (z0Var != null) {
                z0Var.setImageReceiver(gi0Var3.getImageReceiver());
            }
        }
    }

    public final void f(ch.o0 o0Var, boolean z9) {
        boolean z10 = this.x;
        boolean contains = this.P.d0.contains(o0Var);
        this.x = contains;
        if (contains != z10) {
            gi0 gi0Var = this.a;
            gi0 gi0Var2 = this.b;
            if (z9) {
                ViewPropertyAnimator duration = gi0Var2.animate().scaleX(this.I * (this.x ? 0.76f : 1.0f)).scaleY(this.I * (this.x ? 0.76f : 1.0f)).setDuration(240L);
                xq xqVar = xq.h;
                duration.setInterpolator(xqVar).start();
                gi0Var.animate().scaleX(this.I * (this.x ? 0.76f : 1.0f)).scaleY(this.I * (this.x ? 0.76f : 1.0f)).setDuration(240L).setInterpolator(xqVar).start();
            } else {
                gi0Var2.setScaleX(this.I * (contains ? 0.76f : 1.0f));
                gi0Var2.setScaleY(this.I * (this.x ? 0.76f : 1.0f));
                gi0Var.setScaleX(this.I * (this.x ? 0.76f : 1.0f));
                gi0Var.setScaleY(this.I * (this.x ? 0.76f : 1.0f));
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        this.d.P();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.R();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ch.o0 o0Var = this.e;
        if (o0Var != null) {
            String str = o0Var.f;
            if (str != null) {
                accessibilityNodeInfo.setText(str);
                accessibilityNodeInfo.setEnabled(true);
            } else {
                accessibilityNodeInfo.setText(org.telegram.messenger.id.M0(2131754890, null));
                accessibilityNodeInfo.setEnabled(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        ii0 ii0Var;
        if (this.O) {
            ji0 ji0Var = this.P;
            if (ji0Var.Q == null) {
                int action = motionEvent.getAction();
                ei0 ei0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i7 = ji0Var.M0) != 3 && i7 != 4 && i7 != 5 && ((ii0Var = ji0Var.g0) == null || ii0Var.v())) {
                        org.telegram.messenger.g0.i3(ei0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((ji0Var.l0 == null || ji0Var.n0 > 0.8f) && ji0Var.g0 != null)) {
                    ji0Var.r0 = true;
                    if (System.currentTimeMillis() - ji0Var.s0 > 300) {
                        ji0Var.s0 = System.currentTimeMillis();
                        ji0Var.g0.i(this, this.e, ji0Var.n0 > 0.8f, false);
                    }
                }
                if (!ji0Var.r0 && ji0Var.l0 != null) {
                    ji0Var.o0 = 0.0f;
                    float f10 = ji0Var.n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ji0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new xh0(ji0Var, f10));
                    ji0Var.Q.addListener(new wh0(ji0Var, 1));
                    ji0Var.Q.setDuration(150L);
                    ji0Var.Q.setInterpolator(xq.f);
                    ji0Var.Q.start();
                }
                org.telegram.messenger.g0.r(ei0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
