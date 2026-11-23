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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class vi0 extends FrameLayout {
    public int E;
    public boolean F;
    public di.ec G;
    public final si0 H;
    public boolean I;
    public float J;
    public ValueAnimator K;
    public final si0 L;
    public float M;
    public float N;
    public boolean O;
    public boolean P;
    public final /* synthetic */ xi0 Q;
    public final ui0 a;
    public final ui0 b;
    public final ui0 c;
    public final ImageReceiver d;
    public ch.p0 e;
    public ug.b1 f;
    public float h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi0(xi0 xi0Var, Context context) {
        super(context);
        this.Q = xi0Var;
        this.d = new ImageReceiver(null);
        this.h = 1.0f;
        this.y = true;
        this.H = new si0(this, 0);
        this.J = 1.0f;
        int i7 = 1;
        this.L = new si0(this, i7);
        this.P = true;
        ui0 ui0Var = new ui0(this, context, 0);
        this.a = ui0Var;
        ui0 ui0Var2 = new ui0(this, context, i7);
        this.b = ui0Var2;
        ui0Var.getImageReceiver().W(0);
        ui0Var.getImageReceiver().v0 = false;
        ui0 ui0Var3 = new ui0(this, context, 2);
        this.c = ui0Var3;
        addView(ui0Var, c8.ma.e(34, 34, 17));
        addView(ui0Var3, c8.ma.e(34, 34, 17));
        addView(ui0Var2, c8.ma.e(34, 34, 17));
        if (xi0Var.N0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        ui0Var.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        ui0Var2.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        ui0Var2.a.W(0);
        ImageReceiver imageReceiver = ui0Var2.a;
        imageReceiver.u0 = false;
        imageReceiver.v0 = false;
        ui0Var3.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    public static void a(vi0 vi0Var, ch.p0 p0Var, int i7) {
        ui0 ui0Var = vi0Var.c;
        ui0 ui0Var2 = vi0Var.a;
        ui0 ui0Var3 = vi0Var.b;
        xi0 xi0Var = vi0Var.Q;
        vi0Var.f(p0Var, false);
        ch.p0 p0Var2 = vi0Var.e;
        if (p0Var2 != null && p0Var2.equals(p0Var)) {
            vi0Var.E = i7;
            vi0Var.e(p0Var);
            return;
        }
        int i10 = xi0Var.K;
        org.telegram.ui.ActionBar.h6 h6Var = xi0Var.l0;
        int i11 = xi0Var.N0;
        boolean q10 = org.telegram.messenger.k10.i(i10).q();
        boolean z10 = (i11 == 3 && !q10) || (i11 == 5 && p0Var.d && !q10);
        vi0Var.I = z10;
        if (z10 && vi0Var.f == null) {
            ug.b1 b1Var = new ug.b1(1, vi0Var.getContext(), null);
            vi0Var.f = b1Var;
            b1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            vi0Var.f.setImageReceiver(ui0Var3.getImageReceiver());
            vi0Var.addView(vi0Var.f, c8.ma.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        ug.b1 b1Var2 = vi0Var.f;
        if (b1Var2 != null) {
            b1Var2.setVisibility(vi0Var.I ? 0 : 8);
        }
        vi0Var.d();
        vi0Var.e = p0Var;
        vi0Var.r = p0Var.a || (p0Var.f != null && ((xi0Var.q() || xi0Var.H0) && org.telegram.messenger.qc.e(8200)));
        if (i11 == 4 || vi0Var.e.b) {
            vi0Var.r = false;
        }
        ch.p0 p0Var3 = vi0Var.e;
        if (p0Var3.a || p0Var3.f != null) {
            vi0Var.e(p0Var);
            ui0Var.setAnimatedEmojiDrawable(null);
            if (ui0Var2.getImageReceiver().B() != null) {
                ui0Var2.getImageReceiver().B().N(0, false, false);
            }
            ug.b1 b1Var3 = vi0Var.f;
            if (b1Var3 != null) {
                b1Var3.setAnimatedEmojiDrawable(null);
            }
        } else {
            ui0Var.getImageReceiver().f();
            ui0Var3.getImageReceiver().f();
            p5 p5Var = new p5(4, xi0Var.K, vi0Var.e.g);
            p5 p5Var2 = new p5(3, xi0Var.K, vi0Var.e.g);
            if (i11 == 1 || i11 == 2 || i11 == 4) {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                p5Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
                p5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
            } else {
                int i12 = org.telegram.ui.ActionBar.m6.v6;
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                org.telegram.ui.ActionBar.t6.x(vi0Var, p5Var, i12, h6Var, mode2);
                org.telegram.ui.ActionBar.t6.x(vi0Var, p5Var2, i12, h6Var, mode2);
            }
            ui0Var.setAnimatedEmojiDrawable(p5Var);
            ui0Var3.setAnimatedEmojiDrawable(p5Var2);
            ug.b1 b1Var4 = vi0Var.f;
            if (b1Var4 != null) {
                b1Var4.setAnimatedEmojiDrawable(p5Var2);
            }
        }
        vi0Var.setFocusable(true);
        boolean z11 = vi0Var.r;
        vi0Var.s = z11;
        if (z11) {
            vi0Var.w = false;
            ui0Var2.setVisibility(0);
            ui0Var3.setVisibility(8);
        } else {
            ui0Var2.setVisibility(8);
            ui0Var3.setVisibility(0);
            vi0Var.w = true;
        }
        ViewGroup.LayoutParams layoutParams = ui0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = ui0Var3.getLayoutParams();
        int L = org.telegram.messenger.g0.L(34.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        ViewGroup.LayoutParams layoutParams3 = ui0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = ui0Var2.getLayoutParams();
        int L2 = org.telegram.messenger.g0.L(34.0f);
        layoutParams4.height = L2;
        layoutParams3.width = L2;
    }

    public final void b() {
        ui0 ui0Var = this.b;
        p5 p5Var = ui0Var.e;
        ImageReceiver imageReceiver = p5Var != null ? p5Var.k : ui0Var.a;
        if (imageReceiver == null || imageReceiver.B() == null) {
            return;
        }
        xi0 xi0Var = this.Q;
        if (xi0Var.y0 != null || this.O || !xi0Var.H0) {
            imageReceiver.B().start();
        } else if (imageReceiver.B().b0 <= 2) {
            imageReceiver.B().stop();
        }
    }

    public final void c(int i7) {
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
            ofFloat.addUpdateListener(new h60(this, 10));
            this.K.setDuration(150L);
            this.K.setInterpolator(nr.h);
            this.K.setStartDelay((long) (i7 * this.Q.c));
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
        if (i7 == 0) {
            this.F = false;
            this.a.getImageReceiver().B().stop();
            this.a.getImageReceiver().B().N(0, false, false);
            this.H.run();
            return;
        }
        this.F = true;
        this.a.getImageReceiver().B().stop();
        this.a.getImageReceiver().B().N(0, false, false);
        org.telegram.messenger.g0.h3(this.H, i7);
    }

    public final void d() {
        boolean z10 = this.r;
        xi0 xi0Var = this.Q;
        ui0 ui0Var = this.b;
        if (z10) {
            org.telegram.messenger.g0.r(this.H);
            ui0 ui0Var2 = this.a;
            if (ui0Var2.getImageReceiver().B() != null && !ui0Var2.getImageReceiver().B().y()) {
                ui0Var2.getImageReceiver().B().stop();
                if (xi0Var.k0) {
                    ui0Var2.getImageReceiver().B().N(0, false, true);
                } else {
                    ui0Var2.getImageReceiver().B().N(ui0Var2.getImageReceiver().B().e[0] - 1, false, true);
                }
            }
            ui0Var.setVisibility(4);
            ui0Var2.setVisibility(0);
            this.w = false;
            ui0Var.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
            ui0Var.setScaleX(this.J * (this.x ? 0.76f : 1.0f));
        } else {
            ui0Var.animate().cancel();
            if (xi0Var.O0) {
                ui0Var.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
                ui0Var.setScaleX(this.J * (this.x ? 0.76f : 1.0f));
            } else {
                ui0Var.setScaleY(0.0f);
                ui0Var.setScaleX(0.0f);
            }
        }
        this.n = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        fi.s2 s2Var;
        if (this.x && this.y) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - org.telegram.messenger.g0.L(1.0f);
            ch.p0 p0Var = this.e;
            xi0 xi0Var = this.Q;
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, (p0Var == null || !p0Var.a) ? xi0Var.I0 : xi0Var.J0);
        }
        p5 p5Var = this.b.e;
        if (p5Var != null && (s2Var = p5Var.k) != null) {
            if (this.E == 0) {
                s2Var.K0(org.telegram.messenger.g0.L(6.0f), 0, 0, org.telegram.messenger.g0.L(6.0f));
            } else {
                s2Var.J0(this.x ? org.telegram.messenger.g0.L(6.0f) : 0);
            }
        }
        ch.p0 p0Var2 = this.e;
        if (p0Var2 != null && p0Var2.a && this.G != null && org.telegram.messenger.qc.e(8200) && org.telegram.messenger.qc.e(131072)) {
            RectF rectF = org.telegram.messenger.g0.P;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            oh0 B = this.a.getImageReceiver().B();
            this.G.j = (int) (r2.b.size() * ((B == null || (i7 = B.b0) <= 30) ? 0.0f : Utilities.l((i7 - 30) / 30.0f)));
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
    public final void e(ch.p0 p0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        ui0 ui0Var;
        org.telegram.messenger.mz mzVar;
        ?? r14;
        TLRPC.Document document;
        xi0 xi0Var = this.Q;
        int i7 = xi0Var.N0;
        ui0 ui0Var2 = this.a;
        ui0 ui0Var3 = this.b;
        if (p0Var != null && p0Var.a) {
            ui0Var2.getImageReceiver().w0(new oh0(R.raw.star_reaction, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f)));
            ui0Var3.getImageReceiver().w0(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.G == null) {
                this.G = new di.ec(1, org.telegram.messenger.cz.o() == 2 ? 45 : 18);
                return;
            }
            return;
        }
        if (i7 == 4 && p0Var != null && p0Var.f != null) {
            ui0Var2.getImageReceiver().w0(org.telegram.messenger.j6.g(p0Var.f));
            ui0Var3.getImageReceiver().w0(org.telegram.messenger.j6.g(p0Var.f));
            return;
        }
        ch.p0 p0Var2 = this.e;
        if (p0Var2.b) {
            org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(xi0Var.K);
            long j3 = this.e.g;
            if (u12.n8 != null) {
                for (int i10 = 0; i10 < u12.n8.documents.size(); i10++) {
                    if (u12.n8.documents.get(i10).id == j3) {
                        document = u12.n8.documents.get(i10);
                        break;
                    }
                }
            }
            document = null;
            ui0Var3.getImageReceiver().r0(org.telegram.messenger.gc.b(document), "60_60_firstframe", null, null, this.r ? null : org.telegram.messenger.u5.f(document, org.telegram.ui.ActionBar.m6.m6, 0.2f, null), 0L, "tgs", this.e, 0);
            return;
        }
        if (p0Var2.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) org.telegram.messenger.si.d0(xi0Var.K).r.get(this.e.f);
            if (tL_availableReaction2 != null) {
                org.telegram.messenger.mz f10 = org.telegram.messenger.u5.f(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.m6.m6, 0.2f, null);
                if (!org.telegram.messenger.qc.e(8200) || i7 == 4) {
                    tL_availableReaction = tL_availableReaction2;
                    ui0Var = ui0Var2;
                    boolean z10 = false;
                    mzVar = f10;
                    if (org.telegram.messenger.cz.o() <= 0 || i7 == 4) {
                        ui0Var3.getImageReceiver().r0(org.telegram.messenger.gc.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : mzVar, 0L, "tgs", this.e, 0);
                        r14 = z10;
                    } else {
                        ui0Var.getImageReceiver().r0(org.telegram.messenger.gc.b(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, mzVar, 0L, "tgs", p0Var, 0);
                        ui0Var3.getImageReceiver().r0(org.telegram.messenger.gc.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : mzVar, 0L, "tgs", this.e, 0);
                        r14 = z10;
                    }
                } else {
                    mzVar = f10;
                    ui0Var = ui0Var2;
                    r14 = 0;
                    tL_availableReaction = tL_availableReaction2;
                    ui0Var2.getImageReceiver().r0(org.telegram.messenger.gc.b(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, mzVar, 0L, "tgs", p0Var, 0);
                    ui0Var3.getImageReceiver().r0(org.telegram.messenger.gc.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, this.r ? null : mzVar, 0L, "tgs", this.e, 0);
                }
                if (ui0Var.getImageReceiver().B() != null) {
                    ui0Var.getImageReceiver().B().N(r14, r14, true);
                }
                this.c.getImageReceiver().r0(org.telegram.messenger.gc.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, mzVar, 0L, "tgs", p0Var, 0);
                ImageReceiver imageReceiver = this.d;
                imageReceiver.v0 = r14;
                org.telegram.messenger.si.d0(xi0Var.K);
                org.telegram.messenger.si.p1(imageReceiver, org.telegram.messenger.gc.b(tL_availableReaction.around_animation), ch.l0.a());
            }
            ug.b1 b1Var = this.f;
            if (b1Var != null) {
                b1Var.setImageReceiver(ui0Var3.getImageReceiver());
            }
        }
    }

    public final void f(ch.p0 p0Var, boolean z10) {
        boolean z11 = this.x;
        boolean contains = this.Q.e0.contains(p0Var);
        this.x = contains;
        if (contains != z11) {
            ui0 ui0Var = this.a;
            ui0 ui0Var2 = this.b;
            if (z10) {
                ViewPropertyAnimator duration = ui0Var2.animate().scaleX(this.J * (this.x ? 0.76f : 1.0f)).scaleY(this.J * (this.x ? 0.76f : 1.0f)).setDuration(240L);
                nr nrVar = nr.h;
                duration.setInterpolator(nrVar).start();
                ui0Var.animate().scaleX(this.J * (this.x ? 0.76f : 1.0f)).scaleY(this.J * (this.x ? 0.76f : 1.0f)).setDuration(240L).setInterpolator(nrVar).start();
            } else {
                ui0Var2.setScaleX(this.J * (contains ? 0.76f : 1.0f));
                ui0Var2.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
                ui0Var.setScaleX(this.J * (this.x ? 0.76f : 1.0f));
                ui0Var.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
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
        ch.p0 p0Var = this.e;
        if (p0Var != null) {
            String str = p0Var.f;
            if (str != null) {
                accessibilityNodeInfo.setText(str);
                accessibilityNodeInfo.setEnabled(true);
            } else {
                accessibilityNodeInfo.setText(org.telegram.messenger.hd.N0(2131754890, null));
                accessibilityNodeInfo.setEnabled(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        wi0 wi0Var;
        if (this.P) {
            xi0 xi0Var = this.Q;
            if (xi0Var.R == null) {
                int action = motionEvent.getAction();
                si0 si0Var = this.L;
                if (action == 0) {
                    this.O = true;
                    this.M = motionEvent.getX();
                    this.N = motionEvent.getY();
                    if (this.h == 1.0f && !this.I && (i7 = xi0Var.N0) != 3 && i7 != 4 && i7 != 5 && ((wi0Var = xi0Var.h0) == null || wi0Var.o())) {
                        org.telegram.messenger.g0.h3(si0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.M - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.N - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.O && ((xi0Var.m0 == null || xi0Var.o0 > 0.8f) && xi0Var.h0 != null)) {
                    xi0Var.s0 = true;
                    if (System.currentTimeMillis() - xi0Var.t0 > 300) {
                        xi0Var.t0 = System.currentTimeMillis();
                        xi0Var.h0.g(this, this.e, xi0Var.o0 > 0.8f, false);
                    }
                }
                if (!xi0Var.s0 && xi0Var.m0 != null) {
                    xi0Var.p0 = 0.0f;
                    float f10 = xi0Var.o0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    xi0Var.R = ofFloat;
                    ofFloat.addUpdateListener(new li0(xi0Var, f10));
                    xi0Var.R.addListener(new ki0(xi0Var, 1));
                    xi0Var.R.setDuration(150L);
                    xi0Var.R.setInterpolator(nr.f);
                    xi0Var.R.start();
                }
                org.telegram.messenger.g0.r(si0Var);
                this.O = false;
                return true;
            }
        }
        return false;
    }
}
