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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ti0 extends FrameLayout {
    public int E;
    public boolean F;
    public di.ec G;
    public final qi0 H;
    public boolean I;
    public float J;
    public ValueAnimator K;
    public final qi0 L;
    public float M;
    public float N;
    public boolean O;
    public boolean P;
    public final /* synthetic */ vi0 Q;
    public final si0 a;
    public final si0 b;
    public final si0 c;
    public final ImageReceiver d;
    public ch.p0 e;
    public ug.c1 f;
    public float h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti0(vi0 vi0Var, Context context) {
        super(context);
        this.Q = vi0Var;
        this.d = new ImageReceiver(null);
        this.h = 1.0f;
        this.y = true;
        this.H = new qi0(this, 0);
        this.J = 1.0f;
        int i7 = 1;
        this.L = new qi0(this, i7);
        this.P = true;
        si0 si0Var = new si0(this, context, 0);
        this.a = si0Var;
        si0 si0Var2 = new si0(this, context, i7);
        this.b = si0Var2;
        si0Var.getImageReceiver().W(0);
        si0Var.getImageReceiver().v0 = false;
        si0 si0Var3 = new si0(this, context, 2);
        this.c = si0Var3;
        addView(si0Var, c8.ma.e(34, 34, 17));
        addView(si0Var3, c8.ma.e(34, 34, 17));
        addView(si0Var2, c8.ma.e(34, 34, 17));
        if (vi0Var.N0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        si0Var.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        si0Var2.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        si0Var2.a.W(0);
        ImageReceiver imageReceiver = si0Var2.a;
        imageReceiver.u0 = false;
        imageReceiver.v0 = false;
        si0Var3.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    public static void a(ti0 ti0Var, ch.p0 p0Var, int i7) {
        si0 si0Var = ti0Var.c;
        si0 si0Var2 = ti0Var.a;
        si0 si0Var3 = ti0Var.b;
        vi0 vi0Var = ti0Var.Q;
        ti0Var.f(p0Var, false);
        ch.p0 p0Var2 = ti0Var.e;
        if (p0Var2 != null && p0Var2.equals(p0Var)) {
            ti0Var.E = i7;
            ti0Var.e(p0Var);
            return;
        }
        int i10 = vi0Var.K;
        org.telegram.ui.ActionBar.i6 i6Var = vi0Var.l0;
        int i11 = vi0Var.N0;
        boolean q10 = org.telegram.messenger.j10.i(i10).q();
        boolean z10 = (i11 == 3 && !q10) || (i11 == 5 && p0Var.d && !q10);
        ti0Var.I = z10;
        if (z10 && ti0Var.f == null) {
            ug.c1 c1Var = new ug.c1(1, ti0Var.getContext(), null);
            ti0Var.f = c1Var;
            c1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ti0Var.f.setImageReceiver(si0Var3.getImageReceiver());
            ti0Var.addView(ti0Var.f, c8.ma.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        ug.c1 c1Var2 = ti0Var.f;
        if (c1Var2 != null) {
            c1Var2.setVisibility(ti0Var.I ? 0 : 8);
        }
        ti0Var.d();
        ti0Var.e = p0Var;
        ti0Var.r = p0Var.a || (p0Var.f != null && ((vi0Var.q() || vi0Var.H0) && org.telegram.messenger.pc.e(8200)));
        if (i11 == 4 || ti0Var.e.b) {
            ti0Var.r = false;
        }
        ch.p0 p0Var3 = ti0Var.e;
        if (p0Var3.a || p0Var3.f != null) {
            ti0Var.e(p0Var);
            si0Var.setAnimatedEmojiDrawable(null);
            if (si0Var2.getImageReceiver().B() != null) {
                si0Var2.getImageReceiver().B().N(0, false, false);
            }
            ug.c1 c1Var3 = ti0Var.f;
            if (c1Var3 != null) {
                c1Var3.setAnimatedEmojiDrawable(null);
            }
        } else {
            si0Var.getImageReceiver().f();
            si0Var3.getImageReceiver().f();
            o5 o5Var = new o5(4, vi0Var.K, ti0Var.e.g);
            o5 o5Var2 = new o5(3, vi0Var.K, ti0Var.e.g);
            if (i11 == 1 || i11 == 2 || i11 == 4) {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                o5Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
                o5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
            } else {
                int i12 = org.telegram.ui.ActionBar.n6.v6;
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                org.telegram.ui.ActionBar.u6.x(ti0Var, o5Var, i12, i6Var, mode2);
                org.telegram.ui.ActionBar.u6.x(ti0Var, o5Var2, i12, i6Var, mode2);
            }
            si0Var.setAnimatedEmojiDrawable(o5Var);
            si0Var3.setAnimatedEmojiDrawable(o5Var2);
            ug.c1 c1Var4 = ti0Var.f;
            if (c1Var4 != null) {
                c1Var4.setAnimatedEmojiDrawable(o5Var2);
            }
        }
        ti0Var.setFocusable(true);
        boolean z11 = ti0Var.r;
        ti0Var.s = z11;
        if (z11) {
            ti0Var.w = false;
            si0Var2.setVisibility(0);
            si0Var3.setVisibility(8);
        } else {
            si0Var2.setVisibility(8);
            si0Var3.setVisibility(0);
            ti0Var.w = true;
        }
        ViewGroup.LayoutParams layoutParams = si0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = si0Var3.getLayoutParams();
        int L = org.telegram.messenger.g0.L(34.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        ViewGroup.LayoutParams layoutParams3 = si0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = si0Var2.getLayoutParams();
        int L2 = org.telegram.messenger.g0.L(34.0f);
        layoutParams4.height = L2;
        layoutParams3.width = L2;
    }

    public final void b() {
        si0 si0Var = this.b;
        o5 o5Var = si0Var.e;
        ImageReceiver imageReceiver = o5Var != null ? o5Var.k : si0Var.a;
        if (imageReceiver == null || imageReceiver.B() == null) {
            return;
        }
        vi0 vi0Var = this.Q;
        if (vi0Var.y0 != null || this.O || !vi0Var.H0) {
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
            ofFloat.addUpdateListener(new e60(this, 10));
            this.K.setDuration(150L);
            this.K.setInterpolator(lr.h);
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
        vi0 vi0Var = this.Q;
        si0 si0Var = this.b;
        if (z10) {
            org.telegram.messenger.g0.r(this.H);
            si0 si0Var2 = this.a;
            if (si0Var2.getImageReceiver().B() != null && !si0Var2.getImageReceiver().B().y()) {
                si0Var2.getImageReceiver().B().stop();
                if (vi0Var.k0) {
                    si0Var2.getImageReceiver().B().N(0, false, true);
                } else {
                    si0Var2.getImageReceiver().B().N(si0Var2.getImageReceiver().B().e[0] - 1, false, true);
                }
            }
            si0Var.setVisibility(4);
            si0Var2.setVisibility(0);
            this.w = false;
            si0Var.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
            si0Var.setScaleX(this.J * (this.x ? 0.76f : 1.0f));
        } else {
            si0Var.animate().cancel();
            if (vi0Var.O0) {
                si0Var.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
                si0Var.setScaleX(this.J * (this.x ? 0.76f : 1.0f));
            } else {
                si0Var.setScaleY(0.0f);
                si0Var.setScaleX(0.0f);
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
            vi0 vi0Var = this.Q;
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, (p0Var == null || !p0Var.a) ? vi0Var.I0 : vi0Var.J0);
        }
        o5 o5Var = this.b.e;
        if (o5Var != null && (s2Var = o5Var.k) != null) {
            if (this.E == 0) {
                s2Var.K0(org.telegram.messenger.g0.L(6.0f), 0, 0, org.telegram.messenger.g0.L(6.0f));
            } else {
                s2Var.J0(this.x ? org.telegram.messenger.g0.L(6.0f) : 0);
            }
        }
        ch.p0 p0Var2 = this.e;
        if (p0Var2 != null && p0Var2.a && this.G != null && org.telegram.messenger.pc.e(8200) && org.telegram.messenger.pc.e(131072)) {
            RectF rectF = org.telegram.messenger.g0.P;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            mh0 B = this.a.getImageReceiver().B();
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
        si0 si0Var;
        org.telegram.messenger.lz lzVar;
        ?? r14;
        TLRPC.Document document;
        vi0 vi0Var = this.Q;
        int i7 = vi0Var.N0;
        si0 si0Var2 = this.a;
        si0 si0Var3 = this.b;
        if (p0Var != null && p0Var.a) {
            si0Var2.getImageReceiver().w0(new mh0(R.raw.star_reaction, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f)));
            si0Var3.getImageReceiver().w0(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.G == null) {
                this.G = new di.ec(1, org.telegram.messenger.bz.o() == 2 ? 45 : 18);
                return;
            }
            return;
        }
        if (i7 == 4 && p0Var != null && p0Var.f != null) {
            si0Var2.getImageReceiver().w0(org.telegram.messenger.j6.g(p0Var.f));
            si0Var3.getImageReceiver().w0(org.telegram.messenger.j6.g(p0Var.f));
            return;
        }
        ch.p0 p0Var2 = this.e;
        if (p0Var2.b) {
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(vi0Var.K);
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
            si0Var3.getImageReceiver().r0(org.telegram.messenger.fc.b(document), "60_60_firstframe", null, null, this.r ? null : org.telegram.messenger.u5.f(document, org.telegram.ui.ActionBar.n6.m6, 0.2f, null), 0L, "tgs", this.e, 0);
            return;
        }
        if (p0Var2.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) org.telegram.messenger.ri.d0(vi0Var.K).r.get(this.e.f);
            if (tL_availableReaction2 != null) {
                org.telegram.messenger.lz f10 = org.telegram.messenger.u5.f(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.n6.m6, 0.2f, null);
                if (!org.telegram.messenger.pc.e(8200) || i7 == 4) {
                    tL_availableReaction = tL_availableReaction2;
                    si0Var = si0Var2;
                    boolean z10 = false;
                    lzVar = f10;
                    if (org.telegram.messenger.bz.o() <= 0 || i7 == 4) {
                        si0Var3.getImageReceiver().r0(org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : lzVar, 0L, "tgs", this.e, 0);
                        r14 = z10;
                    } else {
                        si0Var.getImageReceiver().r0(org.telegram.messenger.fc.b(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, lzVar, 0L, "tgs", p0Var, 0);
                        si0Var3.getImageReceiver().r0(org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : lzVar, 0L, "tgs", this.e, 0);
                        r14 = z10;
                    }
                } else {
                    lzVar = f10;
                    si0Var = si0Var2;
                    r14 = 0;
                    tL_availableReaction = tL_availableReaction2;
                    si0Var2.getImageReceiver().r0(org.telegram.messenger.fc.b(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, lzVar, 0L, "tgs", p0Var, 0);
                    si0Var3.getImageReceiver().r0(org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, this.r ? null : lzVar, 0L, "tgs", this.e, 0);
                }
                if (si0Var.getImageReceiver().B() != null) {
                    si0Var.getImageReceiver().B().N(r14, r14, true);
                }
                this.c.getImageReceiver().r0(org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, lzVar, 0L, "tgs", p0Var, 0);
                ImageReceiver imageReceiver = this.d;
                imageReceiver.v0 = r14;
                org.telegram.messenger.ri.d0(vi0Var.K);
                org.telegram.messenger.ri.p1(imageReceiver, org.telegram.messenger.fc.b(tL_availableReaction.around_animation), ch.l0.a());
            }
            ug.c1 c1Var = this.f;
            if (c1Var != null) {
                c1Var.setImageReceiver(si0Var3.getImageReceiver());
            }
        }
    }

    public final void f(ch.p0 p0Var, boolean z10) {
        boolean z11 = this.x;
        boolean contains = this.Q.e0.contains(p0Var);
        this.x = contains;
        if (contains != z11) {
            si0 si0Var = this.a;
            si0 si0Var2 = this.b;
            if (z10) {
                ViewPropertyAnimator duration = si0Var2.animate().scaleX(this.J * (this.x ? 0.76f : 1.0f)).scaleY(this.J * (this.x ? 0.76f : 1.0f)).setDuration(240L);
                lr lrVar = lr.h;
                duration.setInterpolator(lrVar).start();
                si0Var.animate().scaleX(this.J * (this.x ? 0.76f : 1.0f)).scaleY(this.J * (this.x ? 0.76f : 1.0f)).setDuration(240L).setInterpolator(lrVar).start();
            } else {
                si0Var2.setScaleX(this.J * (contains ? 0.76f : 1.0f));
                si0Var2.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
                si0Var.setScaleX(this.J * (this.x ? 0.76f : 1.0f));
                si0Var.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
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
                accessibilityNodeInfo.setText(org.telegram.messenger.gd.M0(2131754890, null));
                accessibilityNodeInfo.setEnabled(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        ui0 ui0Var;
        if (this.P) {
            vi0 vi0Var = this.Q;
            if (vi0Var.R == null) {
                int action = motionEvent.getAction();
                qi0 qi0Var = this.L;
                if (action == 0) {
                    this.O = true;
                    this.M = motionEvent.getX();
                    this.N = motionEvent.getY();
                    if (this.h == 1.0f && !this.I && (i7 = vi0Var.N0) != 3 && i7 != 4 && i7 != 5 && ((ui0Var = vi0Var.h0) == null || ui0Var.o())) {
                        org.telegram.messenger.g0.h3(qi0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.M - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.N - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.O && ((vi0Var.m0 == null || vi0Var.o0 > 0.8f) && vi0Var.h0 != null)) {
                    vi0Var.s0 = true;
                    if (System.currentTimeMillis() - vi0Var.t0 > 300) {
                        vi0Var.t0 = System.currentTimeMillis();
                        vi0Var.h0.g(this, this.e, vi0Var.o0 > 0.8f, false);
                    }
                }
                if (!vi0Var.s0 && vi0Var.m0 != null) {
                    vi0Var.p0 = 0.0f;
                    float f10 = vi0Var.o0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    vi0Var.R = ofFloat;
                    ofFloat.addUpdateListener(new ji0(vi0Var, f10));
                    vi0Var.R.addListener(new ii0(vi0Var, 1));
                    vi0Var.R.setDuration(150L);
                    vi0Var.R.setInterpolator(lr.f);
                    vi0Var.R.start();
                }
                org.telegram.messenger.g0.r(qi0Var);
                this.O = false;
                return true;
            }
        }
        return false;
    }
}
