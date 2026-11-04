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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ji0 extends FrameLayout {
    public int E;
    public boolean F;
    public ci.lc G;
    public final gi0 H;
    public boolean I;
    public float J;
    public ValueAnimator K;
    public final gi0 L;
    public float M;
    public float N;
    public boolean O;
    public boolean P;
    public final /* synthetic */ li0 Q;
    public final ii0 a;
    public final ii0 b;
    public final ii0 c;
    public final ImageReceiver d;
    public dh.n0 e;
    public vg.y0 f;
    public float h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji0(li0 li0Var, Context context) {
        super(context);
        this.Q = li0Var;
        this.d = new ImageReceiver(null);
        this.h = 1.0f;
        this.y = true;
        this.H = new gi0(this, 0);
        this.J = 1.0f;
        int i3 = 1;
        this.L = new gi0(this, i3);
        this.P = true;
        ii0 ii0Var = new ii0(this, context, 0);
        this.a = ii0Var;
        ii0 ii0Var2 = new ii0(this, context, i3);
        this.b = ii0Var2;
        ii0Var.getImageReceiver().W(0);
        ii0Var.getImageReceiver().v0 = false;
        ii0 ii0Var3 = new ii0(this, context, 2);
        this.c = ii0Var3;
        addView(ii0Var, b8.mf.e(34, 34, 17));
        addView(ii0Var3, b8.mf.e(34, 34, 17));
        addView(ii0Var2, b8.mf.e(34, 34, 17));
        if (li0Var.N0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        ii0Var.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        ii0Var2.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        ii0Var2.a.W(0);
        ImageReceiver imageReceiver = ii0Var2.a;
        imageReceiver.u0 = false;
        imageReceiver.v0 = false;
        ii0Var3.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    public static void a(ji0 ji0Var, dh.n0 n0Var, int i3) {
        ii0 ii0Var = ji0Var.c;
        ii0 ii0Var2 = ji0Var.a;
        ii0 ii0Var3 = ji0Var.b;
        li0 li0Var = ji0Var.Q;
        ji0Var.f(n0Var, false);
        dh.n0 n0Var2 = ji0Var.e;
        if (n0Var2 != null && n0Var2.equals(n0Var)) {
            ji0Var.E = i3;
            ji0Var.e(n0Var);
            return;
        }
        int i10 = li0Var.K;
        org.telegram.ui.ActionBar.e6 e6Var = li0Var.l0;
        int i11 = li0Var.N0;
        boolean q10 = org.telegram.messenger.h10.i(i10).q();
        boolean z10 = (i11 == 3 && !q10) || (i11 == 5 && n0Var.d && !q10);
        ji0Var.I = z10;
        if (z10 && ji0Var.f == null) {
            vg.y0 y0Var = new vg.y0(1, ji0Var.getContext(), null);
            ji0Var.f = y0Var;
            y0Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ji0Var.f.setImageReceiver(ii0Var3.getImageReceiver());
            ji0Var.addView(ji0Var.f, b8.mf.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        vg.y0 y0Var2 = ji0Var.f;
        if (y0Var2 != null) {
            y0Var2.setVisibility(ji0Var.I ? 0 : 8);
        }
        ji0Var.d();
        ji0Var.e = n0Var;
        ji0Var.r = n0Var.a || (n0Var.f != null && ((li0Var.q() || li0Var.H0) && org.telegram.messenger.lc.e(8200)));
        if (i11 == 4 || ji0Var.e.b) {
            ji0Var.r = false;
        }
        dh.n0 n0Var3 = ji0Var.e;
        if (n0Var3.a || n0Var3.f != null) {
            ji0Var.e(n0Var);
            ii0Var.setAnimatedEmojiDrawable(null);
            if (ii0Var2.getImageReceiver().B() != null) {
                ii0Var2.getImageReceiver().B().N(0, false, false);
            }
            vg.y0 y0Var3 = ji0Var.f;
            if (y0Var3 != null) {
                y0Var3.setAnimatedEmojiDrawable(null);
            }
        } else {
            ii0Var.getImageReceiver().f();
            ii0Var3.getImageReceiver().f();
            g5 g5Var = new g5(4, li0Var.K, ji0Var.e.g);
            g5 g5Var2 = new g5(3, li0Var.K, ji0Var.e.g);
            if (i11 == 1 || i11 == 2 || i11 == 4) {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                g5Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
                g5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
            } else {
                int i12 = org.telegram.ui.ActionBar.k6.v6;
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                org.telegram.ui.ActionBar.r6.y(ji0Var, g5Var, i12, e6Var, mode2);
                org.telegram.ui.ActionBar.r6.y(ji0Var, g5Var2, i12, e6Var, mode2);
            }
            ii0Var.setAnimatedEmojiDrawable(g5Var);
            ii0Var3.setAnimatedEmojiDrawable(g5Var2);
            vg.y0 y0Var4 = ji0Var.f;
            if (y0Var4 != null) {
                y0Var4.setAnimatedEmojiDrawable(g5Var2);
            }
        }
        ji0Var.setFocusable(true);
        boolean z11 = ji0Var.r;
        ji0Var.s = z11;
        if (z11) {
            ji0Var.w = false;
            ii0Var2.setVisibility(0);
            ii0Var3.setVisibility(8);
        } else {
            ii0Var2.setVisibility(8);
            ii0Var3.setVisibility(0);
            ji0Var.w = true;
        }
        ViewGroup.LayoutParams layoutParams = ii0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = ii0Var3.getLayoutParams();
        int L = org.telegram.messenger.g0.L(34.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        ViewGroup.LayoutParams layoutParams3 = ii0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = ii0Var2.getLayoutParams();
        int L2 = org.telegram.messenger.g0.L(34.0f);
        layoutParams4.height = L2;
        layoutParams3.width = L2;
    }

    public final void b() {
        ii0 ii0Var = this.b;
        g5 g5Var = ii0Var.e;
        ImageReceiver imageReceiver = g5Var != null ? g5Var.k : ii0Var.a;
        if (imageReceiver == null || imageReceiver.B() == null) {
            return;
        }
        li0 li0Var = this.Q;
        if (li0Var.y0 != null || this.O || !li0Var.H0) {
            imageReceiver.B().start();
        } else if (imageReceiver.B().b0 <= 2) {
            imageReceiver.B().stop();
        }
    }

    public final void c(int i3) {
        if (!this.Q.k0) {
            d();
            this.n = true;
            if (this.r) {
                return;
            }
            this.b.setVisibility(0);
            this.b.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
            this.b.setScaleX(this.J * (this.x ? 0.76f : 1.0f));
            return;
        }
        org.telegram.messenger.g0.r(this.H);
        if (!this.r) {
            if (this.n) {
                return;
            }
            this.J = 0.0f;
            this.b.setScaleX(0.0f);
            this.b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new y50(this, 9));
            this.K.setDuration(150L);
            this.K.setInterpolator(xq.h);
            this.K.setStartDelay((long) (i3 * this.Q.c));
            this.K.start();
            this.n = true;
            return;
        }
        if (this.a.getImageReceiver().B() == null || this.a.getImageReceiver().B().y() || this.n) {
            if (this.a.getImageReceiver().B() != null && this.n && !this.a.getImageReceiver().B().l0 && !this.a.getImageReceiver().B().y()) {
                this.a.getImageReceiver().B().N(this.a.getImageReceiver().B().e[0] - 1, false, false);
            }
            this.b.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
            this.b.setScaleX(this.J * (this.x ? 0.76f : 1.0f));
            return;
        }
        this.n = true;
        if (i3 == 0) {
            this.F = false;
            this.a.getImageReceiver().B().stop();
            this.a.getImageReceiver().B().N(0, false, false);
            this.H.run();
            return;
        }
        this.F = true;
        this.a.getImageReceiver().B().stop();
        this.a.getImageReceiver().B().N(0, false, false);
        org.telegram.messenger.g0.i3(this.H, i3);
    }

    public final void d() {
        boolean z10 = this.r;
        li0 li0Var = this.Q;
        ii0 ii0Var = this.b;
        if (z10) {
            org.telegram.messenger.g0.r(this.H);
            ii0 ii0Var2 = this.a;
            if (ii0Var2.getImageReceiver().B() != null && !ii0Var2.getImageReceiver().B().y()) {
                ii0Var2.getImageReceiver().B().stop();
                if (li0Var.k0) {
                    ii0Var2.getImageReceiver().B().N(0, false, true);
                } else {
                    ii0Var2.getImageReceiver().B().N(ii0Var2.getImageReceiver().B().e[0] - 1, false, true);
                }
            }
            ii0Var.setVisibility(4);
            ii0Var2.setVisibility(0);
            this.w = false;
            ii0Var.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
            ii0Var.setScaleX(this.J * (this.x ? 0.76f : 1.0f));
        } else {
            ii0Var.animate().cancel();
            if (li0Var.O0) {
                ii0Var.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
                ii0Var.setScaleX(this.J * (this.x ? 0.76f : 1.0f));
            } else {
                ii0Var.setScaleY(0.0f);
                ii0Var.setScaleX(0.0f);
            }
        }
        this.n = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i3;
        ei.c3 c3Var;
        if (this.x && this.y) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - org.telegram.messenger.g0.L(1.0f);
            dh.n0 n0Var = this.e;
            li0 li0Var = this.Q;
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, (n0Var == null || !n0Var.a) ? li0Var.I0 : li0Var.J0);
        }
        g5 g5Var = this.b.e;
        if (g5Var != null && (c3Var = g5Var.k) != null) {
            if (this.E == 0) {
                c3Var.K0(org.telegram.messenger.g0.L(6.0f), 0, 0, org.telegram.messenger.g0.L(6.0f));
            } else {
                c3Var.J0(this.x ? org.telegram.messenger.g0.L(6.0f) : 0);
            }
        }
        dh.n0 n0Var2 = this.e;
        if (n0Var2 != null && n0Var2.a && this.G != null && org.telegram.messenger.lc.e(8200) && org.telegram.messenger.lc.e(131072)) {
            RectF rectF = org.telegram.messenger.g0.P;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            ch0 B = this.a.getImageReceiver().B();
            this.G.j = (int) (r2.b.size() * ((B == null || (i3 = B.b0) <= 30) ? 0.0f : Utilities.l((i3 - 30) / 30.0f)));
            this.G.g(rectF);
            this.G.d();
            this.G.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    public final void e(dh.n0 n0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        ii0 ii0Var;
        org.telegram.messenger.jz jzVar;
        ?? r14;
        TLRPC.Document document;
        li0 li0Var = this.Q;
        int i3 = li0Var.N0;
        ii0 ii0Var2 = this.a;
        ii0 ii0Var3 = this.b;
        if (n0Var != null && n0Var.a) {
            ii0Var2.getImageReceiver().w0(new ch0(R.raw.star_reaction, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f)));
            ii0Var3.getImageReceiver().w0(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.G == null) {
                this.G = new ci.lc(1, org.telegram.messenger.az.o() == 2 ? 45 : 18);
                return;
            }
            return;
        }
        if (i3 == 4 && n0Var != null && n0Var.f != null) {
            ii0Var2.getImageReceiver().w0(org.telegram.messenger.i6.g(n0Var.f));
            ii0Var3.getImageReceiver().w0(org.telegram.messenger.i6.g(n0Var.f));
            return;
        }
        dh.n0 n0Var2 = this.e;
        if (n0Var2.b) {
            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(li0Var.K);
            long j10 = this.e.g;
            if (s12.h8 != null) {
                for (int i10 = 0; i10 < s12.h8.documents.size(); i10++) {
                    if (s12.h8.documents.get(i10).id == j10) {
                        document = s12.h8.documents.get(i10);
                        break;
                    }
                }
            }
            document = null;
            ii0Var3.getImageReceiver().r0(org.telegram.messenger.ac.b(document), "60_60_firstframe", null, null, this.r ? null : org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.m6, 0.2f, null), 0L, "tgs", this.e, 0);
            return;
        }
        if (n0Var2.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) org.telegram.messenger.li.b0(li0Var.K).r.get(this.e.f);
            if (tL_availableReaction2 != null) {
                org.telegram.messenger.jz f10 = org.telegram.messenger.t5.f(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.k6.m6, 0.2f, null);
                if (!org.telegram.messenger.lc.e(8200) || i3 == 4) {
                    tL_availableReaction = tL_availableReaction2;
                    ii0Var = ii0Var2;
                    boolean z10 = false;
                    jzVar = f10;
                    if (org.telegram.messenger.az.o() <= 0 || i3 == 4) {
                        ii0Var3.getImageReceiver().r0(org.telegram.messenger.ac.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : jzVar, 0L, "tgs", this.e, 0);
                        r14 = z10;
                    } else {
                        ii0Var.getImageReceiver().r0(org.telegram.messenger.ac.b(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, jzVar, 0L, "tgs", n0Var, 0);
                        ii0Var3.getImageReceiver().r0(org.telegram.messenger.ac.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : jzVar, 0L, "tgs", this.e, 0);
                        r14 = z10;
                    }
                } else {
                    jzVar = f10;
                    ii0Var = ii0Var2;
                    r14 = 0;
                    tL_availableReaction = tL_availableReaction2;
                    ii0Var2.getImageReceiver().r0(org.telegram.messenger.ac.b(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, jzVar, 0L, "tgs", n0Var, 0);
                    ii0Var3.getImageReceiver().r0(org.telegram.messenger.ac.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, this.r ? null : jzVar, 0L, "tgs", this.e, 0);
                }
                if (ii0Var.getImageReceiver().B() != null) {
                    ii0Var.getImageReceiver().B().N(r14, r14, true);
                }
                this.c.getImageReceiver().r0(org.telegram.messenger.ac.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, jzVar, 0L, "tgs", n0Var, 0);
                ImageReceiver imageReceiver = this.d;
                imageReceiver.v0 = r14;
                org.telegram.messenger.li.b0(li0Var.K);
                org.telegram.messenger.li.m1(imageReceiver, org.telegram.messenger.ac.b(tL_availableReaction.around_animation), dh.j0.a());
            }
            vg.y0 y0Var = this.f;
            if (y0Var != null) {
                y0Var.setImageReceiver(ii0Var3.getImageReceiver());
            }
        }
    }

    public final void f(dh.n0 n0Var, boolean z10) {
        boolean z11 = this.x;
        boolean contains = this.Q.e0.contains(n0Var);
        this.x = contains;
        if (contains != z11) {
            ii0 ii0Var = this.a;
            ii0 ii0Var2 = this.b;
            if (z10) {
                ViewPropertyAnimator duration = ii0Var2.animate().scaleX(this.J * (this.x ? 0.76f : 1.0f)).scaleY(this.J * (this.x ? 0.76f : 1.0f)).setDuration(240L);
                xq xqVar = xq.h;
                duration.setInterpolator(xqVar).start();
                ii0Var.animate().scaleX(this.J * (this.x ? 0.76f : 1.0f)).scaleY(this.J * (this.x ? 0.76f : 1.0f)).setDuration(240L).setInterpolator(xqVar).start();
            } else {
                ii0Var2.setScaleX(this.J * (contains ? 0.76f : 1.0f));
                ii0Var2.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
                ii0Var.setScaleX(this.J * (this.x ? 0.76f : 1.0f));
                ii0Var.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
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
        dh.n0 n0Var = this.e;
        if (n0Var != null) {
            String str = n0Var.f;
            if (str != null) {
                accessibilityNodeInfo.setText(str);
                accessibilityNodeInfo.setEnabled(true);
            } else {
                accessibilityNodeInfo.setText(org.telegram.messenger.bd.M0(2131754890, null));
                accessibilityNodeInfo.setEnabled(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i3;
        ki0 ki0Var;
        if (this.P) {
            li0 li0Var = this.Q;
            if (li0Var.R == null) {
                int action = motionEvent.getAction();
                gi0 gi0Var = this.L;
                if (action == 0) {
                    this.O = true;
                    this.M = motionEvent.getX();
                    this.N = motionEvent.getY();
                    if (this.h == 1.0f && !this.I && (i3 = li0Var.N0) != 3 && i3 != 4 && i3 != 5 && ((ki0Var = li0Var.h0) == null || ki0Var.r())) {
                        org.telegram.messenger.g0.i3(gi0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.M - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.N - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.O && ((li0Var.m0 == null || li0Var.o0 > 0.8f) && li0Var.h0 != null)) {
                    li0Var.s0 = true;
                    if (System.currentTimeMillis() - li0Var.t0 > 300) {
                        li0Var.t0 = System.currentTimeMillis();
                        li0Var.h0.z(this, this.e, li0Var.o0 > 0.8f, false);
                    }
                }
                if (!li0Var.s0 && li0Var.m0 != null) {
                    li0Var.p0 = 0.0f;
                    float f10 = li0Var.o0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    li0Var.R = ofFloat;
                    ofFloat.addUpdateListener(new zh0(li0Var, f10));
                    li0Var.R.addListener(new yh0(li0Var, 1));
                    li0Var.R.setDuration(150L);
                    li0Var.R.setInterpolator(xq.f);
                    li0Var.R.start();
                }
                org.telegram.messenger.g0.r(gi0Var);
                this.O = false;
                return true;
            }
        }
        return false;
    }
}
