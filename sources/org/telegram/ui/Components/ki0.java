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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ki0 extends FrameLayout {
    public int E;
    public boolean F;
    public di.ac G;
    public final hi0 H;
    public boolean I;
    public float J;
    public ValueAnimator K;
    public final hi0 L;
    public float M;
    public float N;
    public boolean O;
    public boolean P;
    public final /* synthetic */ mi0 Q;
    public final ji0 a;
    public final ji0 b;
    public final ji0 c;
    public final ImageReceiver d;
    public ch.p0 e;
    public ug.a1 f;
    public float h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki0(mi0 mi0Var, Context context) {
        super(context);
        this.Q = mi0Var;
        this.d = new ImageReceiver(null);
        this.h = 1.0f;
        this.y = true;
        this.H = new hi0(this, 0);
        this.J = 1.0f;
        int i7 = 1;
        this.L = new hi0(this, i7);
        this.P = true;
        ji0 ji0Var = new ji0(this, context, 0);
        this.a = ji0Var;
        ji0 ji0Var2 = new ji0(this, context, i7);
        this.b = ji0Var2;
        ji0Var.getImageReceiver().W(0);
        ji0Var.getImageReceiver().v0 = false;
        ji0 ji0Var3 = new ji0(this, context, 2);
        this.c = ji0Var3;
        addView(ji0Var, c8.ja.e(34, 34, 17));
        addView(ji0Var3, c8.ja.e(34, 34, 17));
        addView(ji0Var2, c8.ja.e(34, 34, 17));
        if (mi0Var.N0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        ji0Var.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        ji0Var2.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        ji0Var2.a.W(0);
        ImageReceiver imageReceiver = ji0Var2.a;
        imageReceiver.u0 = false;
        imageReceiver.v0 = false;
        ji0Var3.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    public static void a(ki0 ki0Var, ch.p0 p0Var, int i7) {
        ji0 ji0Var = ki0Var.c;
        ji0 ji0Var2 = ki0Var.a;
        ji0 ji0Var3 = ki0Var.b;
        mi0 mi0Var = ki0Var.Q;
        ki0Var.f(p0Var, false);
        ch.p0 p0Var2 = ki0Var.e;
        if (p0Var2 != null && p0Var2.equals(p0Var)) {
            ki0Var.E = i7;
            ki0Var.e(p0Var);
            return;
        }
        int i10 = mi0Var.K;
        org.telegram.ui.ActionBar.e6 e6Var = mi0Var.l0;
        int i11 = mi0Var.N0;
        boolean q10 = org.telegram.messenger.m10.i(i10).q();
        boolean z10 = (i11 == 3 && !q10) || (i11 == 5 && p0Var.d && !q10);
        ki0Var.I = z10;
        if (z10 && ki0Var.f == null) {
            ug.a1 a1Var = new ug.a1(1, ki0Var.getContext(), null);
            ki0Var.f = a1Var;
            a1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ki0Var.f.setImageReceiver(ji0Var3.getImageReceiver());
            ki0Var.addView(ki0Var.f, c8.ja.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        ug.a1 a1Var2 = ki0Var.f;
        if (a1Var2 != null) {
            a1Var2.setVisibility(ki0Var.I ? 0 : 8);
        }
        ki0Var.d();
        ki0Var.e = p0Var;
        ki0Var.r = p0Var.a || (p0Var.f != null && ((mi0Var.q() || mi0Var.H0) && org.telegram.messenger.qc.e(8200)));
        if (i11 == 4 || ki0Var.e.b) {
            ki0Var.r = false;
        }
        ch.p0 p0Var3 = ki0Var.e;
        if (p0Var3.a || p0Var3.f != null) {
            ki0Var.e(p0Var);
            ji0Var.setAnimatedEmojiDrawable(null);
            if (ji0Var2.getImageReceiver().B() != null) {
                ji0Var2.getImageReceiver().B().N(0, false, false);
            }
            ug.a1 a1Var3 = ki0Var.f;
            if (a1Var3 != null) {
                a1Var3.setAnimatedEmojiDrawable(null);
            }
        } else {
            ji0Var.getImageReceiver().f();
            ji0Var3.getImageReceiver().f();
            g5 g5Var = new g5(4, mi0Var.K, ki0Var.e.g);
            g5 g5Var2 = new g5(3, mi0Var.K, ki0Var.e.g);
            if (i11 == 1 || i11 == 2 || i11 == 4) {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                g5Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
                g5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
            } else {
                int i12 = org.telegram.ui.ActionBar.j6.v6;
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                org.telegram.ui.ActionBar.q6.x(ki0Var, g5Var, i12, e6Var, mode2);
                org.telegram.ui.ActionBar.q6.x(ki0Var, g5Var2, i12, e6Var, mode2);
            }
            ji0Var.setAnimatedEmojiDrawable(g5Var);
            ji0Var3.setAnimatedEmojiDrawable(g5Var2);
            ug.a1 a1Var4 = ki0Var.f;
            if (a1Var4 != null) {
                a1Var4.setAnimatedEmojiDrawable(g5Var2);
            }
        }
        ki0Var.setFocusable(true);
        boolean z11 = ki0Var.r;
        ki0Var.s = z11;
        if (z11) {
            ki0Var.w = false;
            ji0Var2.setVisibility(0);
            ji0Var3.setVisibility(8);
        } else {
            ji0Var2.setVisibility(8);
            ji0Var3.setVisibility(0);
            ki0Var.w = true;
        }
        ViewGroup.LayoutParams layoutParams = ji0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = ji0Var3.getLayoutParams();
        int L = org.telegram.messenger.g0.L(34.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        ViewGroup.LayoutParams layoutParams3 = ji0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = ji0Var2.getLayoutParams();
        int L2 = org.telegram.messenger.g0.L(34.0f);
        layoutParams4.height = L2;
        layoutParams3.width = L2;
    }

    public final void b() {
        ji0 ji0Var = this.b;
        g5 g5Var = ji0Var.e;
        ImageReceiver imageReceiver = g5Var != null ? g5Var.k : ji0Var.a;
        if (imageReceiver == null || imageReceiver.B() == null) {
            return;
        }
        mi0 mi0Var = this.Q;
        if (mi0Var.y0 != null || this.O || !mi0Var.H0) {
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
            ofFloat.addUpdateListener(new f60(this, 8));
            this.K.setDuration(150L);
            this.K.setInterpolator(er.h);
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
        org.telegram.messenger.g0.i3(this.H, i7);
    }

    public final void d() {
        boolean z10 = this.r;
        mi0 mi0Var = this.Q;
        ji0 ji0Var = this.b;
        if (z10) {
            org.telegram.messenger.g0.r(this.H);
            ji0 ji0Var2 = this.a;
            if (ji0Var2.getImageReceiver().B() != null && !ji0Var2.getImageReceiver().B().y()) {
                ji0Var2.getImageReceiver().B().stop();
                if (mi0Var.k0) {
                    ji0Var2.getImageReceiver().B().N(0, false, true);
                } else {
                    ji0Var2.getImageReceiver().B().N(ji0Var2.getImageReceiver().B().e[0] - 1, false, true);
                }
            }
            ji0Var.setVisibility(4);
            ji0Var2.setVisibility(0);
            this.w = false;
            ji0Var.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
            ji0Var.setScaleX(this.J * (this.x ? 0.76f : 1.0f));
        } else {
            ji0Var.animate().cancel();
            if (mi0Var.O0) {
                ji0Var.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
                ji0Var.setScaleX(this.J * (this.x ? 0.76f : 1.0f));
            } else {
                ji0Var.setScaleY(0.0f);
                ji0Var.setScaleX(0.0f);
            }
        }
        this.n = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        fi.u2 u2Var;
        if (this.x && this.y) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - org.telegram.messenger.g0.L(1.0f);
            ch.p0 p0Var = this.e;
            mi0 mi0Var = this.Q;
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, (p0Var == null || !p0Var.a) ? mi0Var.I0 : mi0Var.J0);
        }
        g5 g5Var = this.b.e;
        if (g5Var != null && (u2Var = g5Var.k) != null) {
            if (this.E == 0) {
                u2Var.K0(org.telegram.messenger.g0.L(6.0f), 0, 0, org.telegram.messenger.g0.L(6.0f));
            } else {
                u2Var.J0(this.x ? org.telegram.messenger.g0.L(6.0f) : 0);
            }
        }
        ch.p0 p0Var2 = this.e;
        if (p0Var2 != null && p0Var2.a && this.G != null && org.telegram.messenger.qc.e(8200) && org.telegram.messenger.qc.e(131072)) {
            RectF rectF = org.telegram.messenger.g0.P;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            ch0 B = this.a.getImageReceiver().B();
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
        ji0 ji0Var;
        org.telegram.messenger.pz pzVar;
        ?? r14;
        TLRPC.Document document;
        mi0 mi0Var = this.Q;
        int i7 = mi0Var.N0;
        ji0 ji0Var2 = this.a;
        ji0 ji0Var3 = this.b;
        if (p0Var != null && p0Var.a) {
            ji0Var2.getImageReceiver().w0(new ch0(R.raw.star_reaction, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f)));
            ji0Var3.getImageReceiver().w0(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.G == null) {
                this.G = new di.ac(1, org.telegram.messenger.gz.o() == 2 ? 45 : 18);
                return;
            }
            return;
        }
        if (i7 == 4 && p0Var != null && p0Var.f != null) {
            ji0Var2.getImageReceiver().w0(org.telegram.messenger.j6.g(p0Var.f));
            ji0Var3.getImageReceiver().w0(org.telegram.messenger.j6.g(p0Var.f));
            return;
        }
        ch.p0 p0Var2 = this.e;
        if (p0Var2.b) {
            org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(mi0Var.K);
            long j3 = this.e.g;
            if (s12.i8 != null) {
                for (int i10 = 0; i10 < s12.i8.documents.size(); i10++) {
                    if (s12.i8.documents.get(i10).id == j3) {
                        document = s12.i8.documents.get(i10);
                        break;
                    }
                }
            }
            document = null;
            ji0Var3.getImageReceiver().r0(org.telegram.messenger.gc.b(document), "60_60_firstframe", null, null, this.r ? null : org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.j6.m6, 0.2f, null), 0L, "tgs", this.e, 0);
            return;
        }
        if (p0Var2.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) org.telegram.messenger.si.b0(mi0Var.K).r.get(this.e.f);
            if (tL_availableReaction2 != null) {
                org.telegram.messenger.pz f10 = org.telegram.messenger.t5.f(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.j6.m6, 0.2f, null);
                if (!org.telegram.messenger.qc.e(8200) || i7 == 4) {
                    tL_availableReaction = tL_availableReaction2;
                    ji0Var = ji0Var2;
                    boolean z10 = false;
                    pzVar = f10;
                    if (org.telegram.messenger.gz.o() <= 0 || i7 == 4) {
                        ji0Var3.getImageReceiver().r0(org.telegram.messenger.gc.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : pzVar, 0L, "tgs", this.e, 0);
                        r14 = z10;
                    } else {
                        ji0Var.getImageReceiver().r0(org.telegram.messenger.gc.b(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, pzVar, 0L, "tgs", p0Var, 0);
                        ji0Var3.getImageReceiver().r0(org.telegram.messenger.gc.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : pzVar, 0L, "tgs", this.e, 0);
                        r14 = z10;
                    }
                } else {
                    pzVar = f10;
                    ji0Var = ji0Var2;
                    r14 = 0;
                    tL_availableReaction = tL_availableReaction2;
                    ji0Var2.getImageReceiver().r0(org.telegram.messenger.gc.b(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, pzVar, 0L, "tgs", p0Var, 0);
                    ji0Var3.getImageReceiver().r0(org.telegram.messenger.gc.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, this.r ? null : pzVar, 0L, "tgs", this.e, 0);
                }
                if (ji0Var.getImageReceiver().B() != null) {
                    ji0Var.getImageReceiver().B().N(r14, r14, true);
                }
                this.c.getImageReceiver().r0(org.telegram.messenger.gc.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, pzVar, 0L, "tgs", p0Var, 0);
                ImageReceiver imageReceiver = this.d;
                imageReceiver.v0 = r14;
                org.telegram.messenger.si.b0(mi0Var.K);
                org.telegram.messenger.si.m1(imageReceiver, org.telegram.messenger.gc.b(tL_availableReaction.around_animation), ch.l0.a());
            }
            ug.a1 a1Var = this.f;
            if (a1Var != null) {
                a1Var.setImageReceiver(ji0Var3.getImageReceiver());
            }
        }
    }

    public final void f(ch.p0 p0Var, boolean z10) {
        boolean z11 = this.x;
        boolean contains = this.Q.e0.contains(p0Var);
        this.x = contains;
        if (contains != z11) {
            ji0 ji0Var = this.a;
            ji0 ji0Var2 = this.b;
            if (z10) {
                ViewPropertyAnimator duration = ji0Var2.animate().scaleX(this.J * (this.x ? 0.76f : 1.0f)).scaleY(this.J * (this.x ? 0.76f : 1.0f)).setDuration(240L);
                er erVar = er.h;
                duration.setInterpolator(erVar).start();
                ji0Var.animate().scaleX(this.J * (this.x ? 0.76f : 1.0f)).scaleY(this.J * (this.x ? 0.76f : 1.0f)).setDuration(240L).setInterpolator(erVar).start();
            } else {
                ji0Var2.setScaleX(this.J * (contains ? 0.76f : 1.0f));
                ji0Var2.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
                ji0Var.setScaleX(this.J * (this.x ? 0.76f : 1.0f));
                ji0Var.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
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
                accessibilityNodeInfo.setText(org.telegram.messenger.hd.M0(2131754890, null));
                accessibilityNodeInfo.setEnabled(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        li0 li0Var;
        if (this.P) {
            mi0 mi0Var = this.Q;
            if (mi0Var.R == null) {
                int action = motionEvent.getAction();
                hi0 hi0Var = this.L;
                if (action == 0) {
                    this.O = true;
                    this.M = motionEvent.getX();
                    this.N = motionEvent.getY();
                    if (this.h == 1.0f && !this.I && (i7 = mi0Var.N0) != 3 && i7 != 4 && i7 != 5 && ((li0Var = mi0Var.h0) == null || li0Var.r())) {
                        org.telegram.messenger.g0.i3(hi0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.M - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.N - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.O && ((mi0Var.m0 == null || mi0Var.o0 > 0.8f) && mi0Var.h0 != null)) {
                    mi0Var.s0 = true;
                    if (System.currentTimeMillis() - mi0Var.t0 > 300) {
                        mi0Var.t0 = System.currentTimeMillis();
                        mi0Var.h0.h(this, this.e, mi0Var.o0 > 0.8f, false);
                    }
                }
                if (!mi0Var.s0 && mi0Var.m0 != null) {
                    mi0Var.p0 = 0.0f;
                    float f10 = mi0Var.o0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    mi0Var.R = ofFloat;
                    ofFloat.addUpdateListener(new ai0(mi0Var, f10));
                    mi0Var.R.addListener(new zh0(mi0Var, 1));
                    mi0Var.R.setDuration(150L);
                    mi0Var.R.setInterpolator(er.f);
                    mi0Var.R.start();
                }
                org.telegram.messenger.g0.r(hi0Var);
                this.O = false;
                return true;
            }
        }
        return false;
    }
}
