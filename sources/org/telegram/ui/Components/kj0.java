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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class kj0 extends FrameLayout {
    public int D;
    public boolean E;
    public rh.s8 F;
    public final hj0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final hj0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final /* synthetic */ mj0 P;
    public final jj0 a;
    public final jj0 b;
    public final jj0 c;
    public final ImageReceiver d;
    public sg.o0 e;
    public kg.l1 f;
    public float h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj0(mj0 mj0Var, Context context) {
        super(context);
        this.P = mj0Var;
        this.d = new ImageReceiver(null);
        this.h = 1.0f;
        this.y = true;
        this.G = new hj0(this, 0);
        this.I = 1.0f;
        int i10 = 1;
        this.K = new hj0(this, i10);
        this.O = true;
        jj0 jj0Var = new jj0(this, context, 0);
        this.a = jj0Var;
        jj0 jj0Var2 = new jj0(this, context, i10);
        this.b = jj0Var2;
        jj0Var.getImageReceiver().W(0);
        jj0Var.getImageReceiver().u0 = false;
        jj0 jj0Var3 = new jj0(this, context, 2);
        this.c = jj0Var3;
        addView(jj0Var, w7.b6.e(34, 34, 17));
        addView(jj0Var3, w7.b6.e(34, 34, 17));
        addView(jj0Var2, w7.b6.e(34, 34, 17));
        if (mj0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        jj0Var.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        jj0Var2.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        jj0Var2.a.W(0);
        ImageReceiver imageReceiver = jj0Var2.a;
        imageReceiver.t0 = false;
        imageReceiver.u0 = false;
        jj0Var3.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    public static void a(kj0 kj0Var, sg.o0 o0Var, int i10) {
        jj0 jj0Var = kj0Var.c;
        jj0 jj0Var2 = kj0Var.a;
        jj0 jj0Var3 = kj0Var.b;
        mj0 mj0Var = kj0Var.P;
        kj0Var.f(o0Var, false);
        sg.o0 o0Var2 = kj0Var.e;
        if (o0Var2 != null && o0Var2.equals(o0Var)) {
            kj0Var.D = i10;
            kj0Var.e(o0Var);
            return;
        }
        int i11 = mj0Var.J;
        org.telegram.ui.ActionBar.p6 p6Var = mj0Var.k0;
        int i12 = mj0Var.M0;
        boolean q6 = org.telegram.messenger.d20.i(i11).q();
        boolean z10 = (i12 == 3 && !q6) || (i12 == 5 && o0Var.d && !q6);
        kj0Var.H = z10;
        if (z10 && kj0Var.f == null) {
            kg.l1 l1Var = new kg.l1(1, kj0Var.getContext(), null);
            kj0Var.f = l1Var;
            l1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            kj0Var.f.setImageReceiver(jj0Var3.getImageReceiver());
            kj0Var.addView(kj0Var.f, w7.b6.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        kg.l1 l1Var2 = kj0Var.f;
        if (l1Var2 != null) {
            l1Var2.setVisibility(kj0Var.H ? 0 : 8);
        }
        kj0Var.d();
        kj0Var.e = o0Var;
        kj0Var.r = o0Var.a || (o0Var.f != null && ((mj0Var.q() || mj0Var.G0) && org.telegram.messenger.sc.e(8200)));
        if (i12 == 4 || kj0Var.e.b) {
            kj0Var.r = false;
        }
        sg.o0 o0Var3 = kj0Var.e;
        if (o0Var3.a || o0Var3.f != null) {
            kj0Var.e(o0Var);
            jj0Var.setAnimatedEmojiDrawable(null);
            if (jj0Var2.getImageReceiver().B() != null) {
                jj0Var2.getImageReceiver().B().N(0, false, false);
            }
            kg.l1 l1Var3 = kj0Var.f;
            if (l1Var3 != null) {
                l1Var3.setAnimatedEmojiDrawable(null);
            }
        } else {
            jj0Var.getImageReceiver().f();
            jj0Var3.getImageReceiver().f();
            f5 f5Var = new f5(4, mj0Var.J, kj0Var.e.g);
            f5 f5Var2 = new f5(3, mj0Var.J, kj0Var.e.g);
            if (i12 == 1 || i12 == 2 || i12 == 4) {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                f5Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
                f5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
            } else {
                int i13 = org.telegram.ui.ActionBar.t6.v6;
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                org.telegram.ui.ActionBar.a7.y(kj0Var, f5Var, i13, p6Var, mode2);
                org.telegram.ui.ActionBar.a7.y(kj0Var, f5Var2, i13, p6Var, mode2);
            }
            jj0Var.setAnimatedEmojiDrawable(f5Var);
            jj0Var3.setAnimatedEmojiDrawable(f5Var2);
            kg.l1 l1Var4 = kj0Var.f;
            if (l1Var4 != null) {
                l1Var4.setAnimatedEmojiDrawable(f5Var2);
            }
        }
        kj0Var.setFocusable(true);
        boolean z11 = kj0Var.r;
        kj0Var.s = z11;
        if (z11) {
            kj0Var.w = false;
            jj0Var2.setVisibility(0);
            jj0Var3.setVisibility(8);
        } else {
            jj0Var2.setVisibility(8);
            jj0Var3.setVisibility(0);
            kj0Var.w = true;
        }
        ViewGroup.LayoutParams layoutParams = jj0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = jj0Var3.getLayoutParams();
        int L = org.telegram.messenger.i0.L(34.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        ViewGroup.LayoutParams layoutParams3 = jj0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = jj0Var2.getLayoutParams();
        int L2 = org.telegram.messenger.i0.L(34.0f);
        layoutParams4.height = L2;
        layoutParams3.width = L2;
    }

    public final void b() {
        jj0 jj0Var = this.b;
        f5 f5Var = jj0Var.e;
        ImageReceiver imageReceiver = f5Var != null ? f5Var.k : jj0Var.a;
        if (imageReceiver == null || imageReceiver.B() == null) {
            return;
        }
        mj0 mj0Var = this.P;
        if (mj0Var.x0 != null || this.N || !mj0Var.G0) {
            imageReceiver.B().start();
        } else if (imageReceiver.B().a0 <= 2) {
            imageReceiver.B().stop();
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
            this.b.setScaleY(this.I * (this.x ? 0.76f : 1.0f));
            this.b.setScaleX(this.I * (this.x ? 0.76f : 1.0f));
            return;
        }
        org.telegram.messenger.i0.r(this.G);
        if (!this.r) {
            if (this.n) {
                return;
            }
            this.I = 0.0f;
            this.b.setScaleX(0.0f);
            this.b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new r60(this, 9));
            this.J.setDuration(150L);
            this.J.setInterpolator(gr.h);
            this.J.setStartDelay((long) (i10 * this.P.c));
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
        if (i10 == 0) {
            this.E = false;
            this.a.getImageReceiver().B().stop();
            this.a.getImageReceiver().B().N(0, false, false);
            this.G.run();
            return;
        }
        this.E = true;
        this.a.getImageReceiver().B().stop();
        this.a.getImageReceiver().B().N(0, false, false);
        org.telegram.messenger.i0.h3(this.G, i10);
    }

    public final void d() {
        boolean z10 = this.r;
        mj0 mj0Var = this.P;
        jj0 jj0Var = this.b;
        if (z10) {
            org.telegram.messenger.i0.r(this.G);
            jj0 jj0Var2 = this.a;
            if (jj0Var2.getImageReceiver().B() != null && !jj0Var2.getImageReceiver().B().y()) {
                jj0Var2.getImageReceiver().B().stop();
                if (mj0Var.j0) {
                    jj0Var2.getImageReceiver().B().N(0, false, true);
                } else {
                    jj0Var2.getImageReceiver().B().N(jj0Var2.getImageReceiver().B().e[0] - 1, false, true);
                }
            }
            jj0Var.setVisibility(4);
            jj0Var2.setVisibility(0);
            this.w = false;
            jj0Var.setScaleY(this.I * (this.x ? 0.76f : 1.0f));
            jj0Var.setScaleX(this.I * (this.x ? 0.76f : 1.0f));
        } else {
            jj0Var.animate().cancel();
            if (mj0Var.N0) {
                jj0Var.setScaleY(this.I * (this.x ? 0.76f : 1.0f));
                jj0Var.setScaleX(this.I * (this.x ? 0.76f : 1.0f));
            } else {
                jj0Var.setScaleY(0.0f);
                jj0Var.setScaleX(0.0f);
            }
        }
        this.n = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        ag.c2 c2Var;
        if (this.x && this.y) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - org.telegram.messenger.i0.L(1.0f);
            sg.o0 o0Var = this.e;
            mj0 mj0Var = this.P;
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, (o0Var == null || !o0Var.a) ? mj0Var.H0 : mj0Var.I0);
        }
        f5 f5Var = this.b.e;
        if (f5Var != null && (c2Var = f5Var.k) != null) {
            if (this.D == 0) {
                c2Var.K0(org.telegram.messenger.i0.L(6.0f), 0, 0, org.telegram.messenger.i0.L(6.0f));
            } else {
                c2Var.J0(this.x ? org.telegram.messenger.i0.L(6.0f) : 0);
            }
        }
        sg.o0 o0Var2 = this.e;
        if (o0Var2 != null && o0Var2.a && this.F != null && org.telegram.messenger.sc.e(8200) && org.telegram.messenger.sc.e(131072)) {
            RectF rectF = org.telegram.messenger.i0.P;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            bi0 B = this.a.getImageReceiver().B();
            this.F.j = (int) (r2.b.size() * ((B == null || (i10 = B.a0) <= 30) ? 0.0f : Utilities.l((i10 - 30) / 30.0f)));
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
    public final void e(sg.o0 o0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        jj0 jj0Var;
        org.telegram.messenger.c00 c00Var;
        ?? r14;
        TLRPC.Document document;
        mj0 mj0Var = this.P;
        int i10 = mj0Var.M0;
        jj0 jj0Var2 = this.a;
        jj0 jj0Var3 = this.b;
        if (o0Var != null && o0Var.a) {
            jj0Var2.getImageReceiver().w0(new bi0(R.raw.star_reaction, org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(30.0f)));
            jj0Var3.getImageReceiver().w0(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                this.F = new rh.s8(1, org.telegram.messenger.tz.o() == 2 ? 45 : 18);
                return;
            }
            return;
        }
        if (i10 == 4 && o0Var != null && o0Var.f != null) {
            jj0Var2.getImageReceiver().w0(org.telegram.messenger.k6.g(o0Var.f));
            jj0Var3.getImageReceiver().w0(org.telegram.messenger.k6.g(o0Var.f));
            return;
        }
        sg.o0 o0Var2 = this.e;
        if (o0Var2.b) {
            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(mj0Var.J);
            long j10 = this.e.g;
            if (r12.i8 != null) {
                for (int i11 = 0; i11 < r12.i8.documents.size(); i11++) {
                    if (r12.i8.documents.get(i11).id == j10) {
                        document = r12.i8.documents.get(i11);
                        break;
                    }
                }
            }
            document = null;
            jj0Var3.getImageReceiver().r0(org.telegram.messenger.ic.b(document), "60_60_firstframe", null, null, this.r ? null : org.telegram.messenger.v5.f(document, org.telegram.ui.ActionBar.t6.m6, 0.2f, null), 0L, "tgs", this.e, 0);
            return;
        }
        if (o0Var2.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(mj0Var.J).r.get(this.e.f);
            if (tL_availableReaction2 != null) {
                org.telegram.messenger.c00 f7 = org.telegram.messenger.v5.f(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.t6.m6, 0.2f, null);
                if (!org.telegram.messenger.sc.e(8200) || i10 == 4) {
                    tL_availableReaction = tL_availableReaction2;
                    jj0Var = jj0Var2;
                    boolean z10 = false;
                    c00Var = f7;
                    if (org.telegram.messenger.tz.o() <= 0 || i10 == 4) {
                        jj0Var3.getImageReceiver().r0(org.telegram.messenger.ic.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : c00Var, 0L, "tgs", this.e, 0);
                        r14 = z10;
                    } else {
                        jj0Var.getImageReceiver().r0(org.telegram.messenger.ic.b(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, c00Var, 0L, "tgs", o0Var, 0);
                        jj0Var3.getImageReceiver().r0(org.telegram.messenger.ic.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : c00Var, 0L, "tgs", this.e, 0);
                        r14 = z10;
                    }
                } else {
                    c00Var = f7;
                    jj0Var = jj0Var2;
                    r14 = 0;
                    tL_availableReaction = tL_availableReaction2;
                    jj0Var2.getImageReceiver().r0(org.telegram.messenger.ic.b(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, c00Var, 0L, "tgs", o0Var, 0);
                    jj0Var3.getImageReceiver().r0(org.telegram.messenger.ic.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, this.r ? null : c00Var, 0L, "tgs", this.e, 0);
                }
                if (jj0Var.getImageReceiver().B() != null) {
                    jj0Var.getImageReceiver().B().N(r14, r14, true);
                }
                this.c.getImageReceiver().r0(org.telegram.messenger.ic.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, c00Var, 0L, "tgs", o0Var, 0);
                ImageReceiver imageReceiver = this.d;
                imageReceiver.u0 = r14;
                org.telegram.messenger.ui.b0(mj0Var.J);
                org.telegram.messenger.ui.m1(imageReceiver, org.telegram.messenger.ic.b(tL_availableReaction.around_animation), sg.k0.a());
            }
            kg.l1 l1Var = this.f;
            if (l1Var != null) {
                l1Var.setImageReceiver(jj0Var3.getImageReceiver());
            }
        }
    }

    public final void f(sg.o0 o0Var, boolean z10) {
        boolean z11 = this.x;
        boolean contains = this.P.d0.contains(o0Var);
        this.x = contains;
        if (contains != z11) {
            jj0 jj0Var = this.a;
            jj0 jj0Var2 = this.b;
            if (z10) {
                ViewPropertyAnimator duration = jj0Var2.animate().scaleX(this.I * (this.x ? 0.76f : 1.0f)).scaleY(this.I * (this.x ? 0.76f : 1.0f)).setDuration(240L);
                gr grVar = gr.h;
                duration.setInterpolator(grVar).start();
                jj0Var.animate().scaleX(this.I * (this.x ? 0.76f : 1.0f)).scaleY(this.I * (this.x ? 0.76f : 1.0f)).setDuration(240L).setInterpolator(grVar).start();
            } else {
                jj0Var2.setScaleX(this.I * (contains ? 0.76f : 1.0f));
                jj0Var2.setScaleY(this.I * (this.x ? 0.76f : 1.0f));
                jj0Var.setScaleX(this.I * (this.x ? 0.76f : 1.0f));
                jj0Var.setScaleY(this.I * (this.x ? 0.76f : 1.0f));
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
        sg.o0 o0Var = this.e;
        if (o0Var != null) {
            String str = o0Var.f;
            if (str != null) {
                accessibilityNodeInfo.setText(str);
                accessibilityNodeInfo.setEnabled(true);
            } else {
                accessibilityNodeInfo.setText(org.telegram.messenger.cd.L0(2131754890, null));
                accessibilityNodeInfo.setEnabled(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        lj0 lj0Var;
        if (this.O) {
            mj0 mj0Var = this.P;
            if (mj0Var.Q == null) {
                int action = motionEvent.getAction();
                hj0 hj0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = mj0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((lj0Var = mj0Var.g0) == null || lj0Var.f())) {
                        org.telegram.messenger.i0.h3(hj0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((mj0Var.l0 == null || mj0Var.n0 > 0.8f) && mj0Var.g0 != null)) {
                    mj0Var.r0 = true;
                    if (System.currentTimeMillis() - mj0Var.s0 > 300) {
                        mj0Var.s0 = System.currentTimeMillis();
                        mj0Var.g0.x(this, this.e, mj0Var.n0 > 0.8f, false);
                    }
                }
                if (!mj0Var.r0 && mj0Var.l0 != null) {
                    mj0Var.o0 = 0.0f;
                    float f7 = mj0Var.n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    mj0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new aj0(mj0Var, f7));
                    mj0Var.Q.addListener(new zi0(mj0Var, 1));
                    mj0Var.Q.setDuration(150L);
                    mj0Var.Q.setInterpolator(gr.f);
                    mj0Var.Q.start();
                }
                org.telegram.messenger.i0.r(hj0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
