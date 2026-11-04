package dh;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import ci.lc;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.az;
import org.telegram.messenger.bc;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.messenger.li;
import org.telegram.messenger.t0;
import org.telegram.messenger.t5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t4;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class l0 {
    public int A;
    public final ImageReceiver B;
    public final g5 C;
    public int D;
    public final cq E;
    public final g6 F;
    public final g6 G;
    public boolean H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public final boolean P;
    public boolean Q;
    public boolean R;
    public w8 S;
    public ArrayList T;
    public final int U;
    public final View V;
    public final e6 W;
    public final gc X;
    public final lc Y;
    public final ch0 Z;
    public final TLRPC.ReactionCount a;
    public int b;
    public int c;
    public int d;
    public boolean d0;
    public int e;
    public ImageReceiver e0;
    public int f;
    public g5 f0;
    public int g;
    public int h;
    public final int i;
    public final int j;
    public final boolean l;
    public boolean m;
    public final String n;
    public boolean o;
    public boolean p;
    public final TLRPC.Reaction q;
    public final n0 r;
    public boolean t;
    public final String u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public boolean k = true;
    public final Rect s = new Rect();
    public final RectF a0 = new RectF();
    public final RectF b0 = new RectF();
    public final Path c0 = new Path();

    public l0(l0 l0Var, int i3, View view, TLRPC.ReactionCount reactionCount, boolean z10, e6 e6Var) {
        lc lcVar;
        ch0 ch0Var;
        ah.a aVar = new ah.a(this, 3);
        this.U = i3;
        this.V = view;
        this.X = new gc(view);
        this.W = e6Var;
        this.R = z10;
        if (l0Var != null) {
            this.E = l0Var.E;
        }
        if (this.B == null) {
            this.B = new ImageReceiver(null);
        }
        if (this.E == null) {
            this.E = new cq(view, false, null);
        }
        if (this.F == null) {
            g6 g6Var = new g6(true, true, true);
            this.F = g6Var;
            g6Var.K = true;
            g6Var.n(0.4f, 320L, xq.h);
            g6Var.w(org.telegram.messenger.g0.L(13.0f));
            g6Var.setCallback(aVar);
            g6Var.x(org.telegram.messenger.g0.o());
            g6Var.M = org.telegram.messenger.g0.q.x;
        }
        if (this.G == null) {
            g6 g6Var2 = new g6(false, false, false, true, false);
            this.G = g6Var2;
            g6Var2.w(org.telegram.messenger.g0.L(12.0f));
            g6Var2.setCallback(aVar);
            g6Var2.x(org.telegram.messenger.g0.o());
            g6Var2.M = org.telegram.messenger.g0.q.x;
            g6Var2.A = 0.35f;
        }
        this.a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.q = reaction;
        n0 d = n0.d(reaction);
        this.r = d;
        int i10 = reactionCount.count;
        this.v = i10;
        this.o = reactionCount.chosen;
        this.i = i10;
        this.j = reactionCount.chosen_order;
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            this.n = "stars";
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            this.n = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        } else {
            if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji)) {
                throw new RuntimeException("unsupported");
            }
            this.n = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        }
        this.B.H0(view);
        this.P = reactionCount.chosen;
        cq cqVar = this.E;
        cqVar.G = false;
        cqVar.a = true;
        if (reaction != null) {
            if (d.a) {
                this.l = true;
                if (org.telegram.messenger.lc.e(8200)) {
                    if (l0Var == null || (ch0Var = l0Var.Z) == null) {
                        this.Z = new ch0(R.raw.star_reaction_click, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                    } else {
                        this.Z = ch0Var;
                    }
                    this.B.w0(this.Z);
                } else {
                    this.B.w0(t0.b.getResources().getDrawable(R.drawable.star_reaction).mutate());
                }
                if (l0Var == null || (lcVar = l0Var.Y) == null) {
                    lcVar = new lc(1, az.o() == 2 ? 18 : 8);
                }
                this.Y = lcVar;
            } else if (d.f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) li.b0(i3).r.get(d.f);
                if (tL_availableReaction != null) {
                    this.B.q0(ac.b(tL_availableReaction.center_icon), "40_40_lastreactframe", t5.f(tL_availableReaction.static_icon, k6.a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            } else if (d.g != 0) {
                this.C = new g5(i(), i3, d.g);
            }
        }
        this.E.d(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(100.0f));
        this.E.e = o0.V;
        if (z10) {
            this.u = hp.s1(i3).K1(reaction);
            this.t = !TextUtils.isEmpty(r1);
        }
        if (this.t) {
            g6 g6Var3 = this.F;
            g6Var3.t(i6.m(this.u, g6Var3.a.getFontMetricsInt(), false, null, 0), !bd.a0, true);
            if (this instanceof rl0) {
                Integer.toString(reactionCount.count);
                this.E.c(this.v, false);
            } else {
                this.E.c(0, false);
            }
        } else {
            g6 g6Var4 = this.F;
            if (g6Var4 != null) {
                g6Var4.t("", false, true);
            }
            Integer.toString(reactionCount.count);
            this.E.c(this.v, false);
        }
        cq cqVar2 = this.E;
        cqVar2.I = 2;
        cqVar2.z = 3;
    }

    public final void a() {
        this.d0 = true;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        w8 w8Var = this.S;
        if (w8Var != null) {
            w8Var.e();
        }
        g5 g5Var = this.C;
        if (g5Var != null) {
            g5Var.a(this.V);
        }
    }

    public final void b() {
        this.d0 = false;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        w8 w8Var = this.S;
        if (w8Var != null) {
            w8Var.f();
        }
        g5 g5Var = this.C;
        if (g5Var != null) {
            g5Var.n(this.V);
        }
        c();
    }

    public final void c() {
        ImageReceiver imageReceiver = this.e0;
        if (imageReceiver == null && this.f0 == null) {
            return;
        }
        if (imageReceiver != null) {
            imageReceiver.R();
            this.e0 = null;
        } else if (this.f0 != null) {
            View view = this.V;
            if (view != null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            this.f0.n(view);
            this.f0 = null;
        }
    }

    public final void d(Canvas canvas, float f10, float f11, float f12, float f13, boolean z10, boolean z11, float f14) {
        cq cqVar;
        ImageReceiver imageReceiver;
        g6 g6Var;
        e6 e6Var;
        View view;
        float f15;
        float f16;
        float f17;
        boolean z12;
        float f18;
        float f19;
        g6 g6Var2;
        float f20;
        float f21;
        float f22;
        int L;
        int L2;
        ImageReceiver imageReceiver2;
        bc bcVar;
        boolean z13;
        Paint paint;
        t4 L1;
        cq cqVar2 = this.E;
        View view2 = this.V;
        boolean z14 = this.l;
        Rect rect = this.s;
        g6 g6Var3 = this.F;
        g6 g6Var4 = this.G;
        e6 e6Var2 = this.W;
        g5 g5Var = this.C;
        ImageReceiver imageReceiver3 = g5Var != null ? g5Var.k : this.B;
        if (this.o) {
            if (z14) {
                this.I = -1529086;
                this.J = -1;
                this.L = -1;
                this.K = -1529086;
            } else {
                this.I = k6.w0(l() ? k6.Gc : k6.qk, e6Var2);
                this.J = k6.w0(l() ? k6.uk : k6.tk, e6Var2);
                if (view2 instanceof org.telegram.ui.Cells.t0) {
                    this.L = k6.w0(k6.wk, e6Var2);
                    this.K = k6.w0(k6.vk, e6Var2);
                } else {
                    this.L = k6.w0(l() ? k6.Gc : k6.qk, e6Var2);
                    this.K = k6.w0(l() ? k6.ob : k6.ra, e6Var2);
                }
            }
        } else if (z14) {
            this.J = -1529086;
            this.I = 1088989954;
            this.L = -1;
            this.K = 0;
        } else {
            this.J = k6.w0(l() ? k6.rk : k6.sk, e6Var2);
            int w02 = k6.w0(l() ? k6.Gc : k6.qk, e6Var2);
            this.I = w02;
            this.I = i0.a.o(w02, (int) (Color.alpha(w02) * 0.156f));
            this.L = k6.w0(k6.Wc, e6Var2);
            this.K = 0;
        }
        if (!z14 && (view2 instanceof q1) && ((q1) view2).v2()) {
            if (this.o) {
                this.I = k6.w0(k6.gb, e6Var2);
                this.J = k6.w0(k6.hb, e6Var2);
            } else {
                this.I = i0.a.k(k6.w0(k6.eb, e6Var2), l() ? i0.a.k(k6.w0(k6.La, e6Var2), k6.w0(k6.ua, e6Var2)) : k6.w0(k6.ua, e6Var2));
                this.J = k6.w0(k6.fb, e6Var2);
            }
            this.L = this.J;
            this.K = this.I;
        }
        if (this.p) {
            this.I = 0;
            this.K = 0;
        }
        r(f12);
        TextPaint textPaint = o0.V;
        textPaint.setColor(this.M);
        if (g6Var3 != null) {
            g6Var3.u(this.M);
        }
        Paint paint2 = o0.S;
        paint2.setColor(this.N);
        boolean z15 = this.R && h() && Color.alpha(this.O) == 0;
        if (f13 != 1.0f) {
            textPaint.setAlpha((int) (textPaint.getAlpha() * f13));
            paint2.setAlpha((int) (paint2.getAlpha() * f13));
        }
        if (imageReceiver3 != null) {
            imageReceiver3.setAlpha(f13);
        }
        float f23 = 0.0f;
        if (f14 <= 0.0f || this.H == z11) {
            cqVar = cqVar2;
            imageReceiver = imageReceiver3;
            g6Var = g6Var4;
            e6Var = e6Var2;
            view = view2;
        } else {
            if (z11) {
                g6Var = g6Var4;
                cqVar = cqVar2;
                e6Var = e6Var2;
                imageReceiver = imageReceiver3;
                g6Var.m(0.6f, 650L, 1.6f, xq.k);
                g6Var.t(org.telegram.messenger.g0.o0(this.v, 0), false, true);
                view = view2;
                g6Var.t(bd.E(this.v, ','), true, true);
            } else {
                cqVar = cqVar2;
                imageReceiver = imageReceiver3;
                g6Var = g6Var4;
                e6Var = e6Var2;
                view = view2;
                g6Var.m(0.6f, 320L, 1.6f, xq.h);
                g6Var.t(org.telegram.messenger.g0.o0(this.v, 0), true, true);
            }
            this.H = z11;
        }
        float a10 = this.X.a(0.1f);
        int i3 = this.z;
        if (f14 <= 0.0f || this.R || g6Var == null || this.S != null) {
            f15 = 1.0f;
            if (f12 != 1.0f) {
                f17 = 6.0f;
                f16 = 8.0f;
                if (this.b == 3) {
                    i3 = (int) com.google.android.recaptcha.internal.a.y(1.0f, f12, this.e, i3 * f12);
                }
            } else {
                f16 = 8.0f;
                f17 = 6.0f;
            }
        } else {
            i3 = (int) (g6Var.c() + org.telegram.messenger.g0.L(g5Var != null ? 6.0f : 4.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(8.0f));
            g6Var.u(this.M);
            f16 = 8.0f;
            f17 = 6.0f;
            f15 = 1.0f;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        float f24 = i3;
        float f25 = f15;
        rectF.set(f10, f11, f10 + f24, this.A + f11);
        if (a10 != f25) {
            canvas.save();
            canvas.scale(a10, a10, (f24 / 2.0f) + f10, (this.A / 2.0f) + f11);
            z12 = true;
        } else {
            z12 = false;
        }
        float f26 = this.A / 2.0f;
        if (j() <= 0.0f || this.p) {
            f18 = 2.0f;
            f19 = 4.0f;
        } else {
            e6 e6Var3 = e6Var;
            Paint W0 = k6.W0("paintChatActionBackground", e6Var3);
            f18 = 2.0f;
            Paint W02 = k6.W0("paintChatActionBackgroundDarken", e6Var3);
            f19 = 4.0f;
            int alpha = W0.getAlpha();
            int alpha2 = W02.getAlpha();
            W0.setAlpha((int) (alpha * f13 * j()));
            W02.setAlpha((int) (alpha2 * f13 * j()));
            g(canvas, rectF, f26, W0);
            if (e6Var == null ? k6.d1() : e6Var.g()) {
                g(canvas, rectF, f26, W02);
            }
            W0.setAlpha(alpha);
            W02.setAlpha(alpha2);
        }
        if (z10 && j() < f25) {
            View view3 = view;
            if ((view3 instanceof q1) && (L1 = ((q1) view3).L1(false)) != null && !this.R) {
                canvas.drawRoundRect(rectF, f26, f26, L1.c);
            }
        }
        if (z15) {
            rectF.right += org.telegram.messenger.g0.L(f19);
            canvas.saveLayerAlpha(rectF, hs.e4, 31);
            rectF.right -= org.telegram.messenger.g0.L(f19);
        }
        if (this.Y != null) {
            org.telegram.messenger.lc.e(8200);
        }
        g(canvas, rectF, f26, paint2);
        if (this.R && h()) {
            if (z15) {
                paint = o0.U;
            } else {
                paint = o0.T;
                paint.setColor(this.O);
                paint.setAlpha((int) (paint.getAlpha() * f13));
            }
            canvas.drawCircle(rectF.right - org.telegram.messenger.g0.L(8.4f), rectF.centerY(), org.telegram.messenger.g0.L(2.66f), paint);
        }
        if (z15) {
            canvas.restore();
        }
        ImageReceiver imageReceiver4 = imageReceiver;
        if (imageReceiver4 != null) {
            if (z14) {
                L = org.telegram.messenger.g0.L(22.0f);
                L2 = org.telegram.messenger.g0.L(f19);
            } else if (g5Var != null) {
                L = org.telegram.messenger.g0.L(24.0f);
                L2 = org.telegram.messenger.g0.L(f17);
                imageReceiver4.J0(org.telegram.messenger.g0.L(f17));
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
                L2 = org.telegram.messenger.g0.L(f16);
                imageReceiver4.J0(0);
            }
            int i10 = (int) ((this.A - L) / f18);
            if (this.R) {
                L2 -= org.telegram.messenger.g0.L(f18);
            }
            int i11 = ((int) f10) + L2;
            int i12 = ((int) f11) + i10;
            rect.set(i11, i12, i11 + L, L + i12);
            g5 g5Var2 = this.C;
            if (g5Var2 == null || (imageReceiver2 = g5Var2.k) == null) {
                imageReceiver2 = this.B;
            }
            if (imageReceiver2 != null && rect != null) {
                imageReceiver2.z0(rect);
            }
            g5 g5Var3 = this.C;
            if (g5Var3 != null && this.D != this.M) {
                int i13 = this.M;
                this.D = i13;
                g5Var3.setColorFilter(new PorterDuffColorFilter(i13, PorterDuff.Mode.SRC_IN));
            }
            if (!this.k || (!this.l && this.i <= 1 && m() && this.P)) {
                g6Var2 = g6Var3;
                imageReceiver2.setAlpha(0.0f);
                imageReceiver2.h(canvas, null);
                this.m = false;
            } else {
                ImageReceiver k10 = k();
                if (k10 != null) {
                    z13 = k10.B() == null || !k10.B().u();
                    if (f13 != 1.0f) {
                        k10.setAlpha(f13);
                        if (f13 <= 0.0f) {
                            k10.R();
                            n();
                        }
                    } else if (k10.B() != null && !k10.B().l0) {
                        float alpha3 = k10.getAlpha() - 0.08f;
                        if (alpha3 <= 0.0f) {
                            k10.R();
                            n();
                        } else {
                            k10.setAlpha(alpha3);
                        }
                        this.V.invalidate();
                        z13 = true;
                    }
                    float f27 = imageReceiver2.L0 - (imageReceiver2.N0 / 2.0f);
                    float f28 = imageReceiver2.M0 - (imageReceiver2.O0 / 2.0f);
                    g6Var2 = g6Var3;
                    float floor = (int) Math.floor(f27);
                    float floor2 = (int) Math.floor(f28);
                    k10.y0(floor, floor2, imageReceiver2.N0 * 2.0f, imageReceiver2.O0 * 2.0f);
                    canvas.save();
                    canvas.translate(f27 - floor, f28 - floor2);
                    bcVar = null;
                    k10.h(canvas, null);
                    canvas.restore();
                } else {
                    g6Var2 = g6Var3;
                    bcVar = null;
                    z13 = true;
                }
                if (z13) {
                    imageReceiver2.h(canvas, bcVar);
                }
                this.m = true;
            }
        } else {
            g6Var2 = g6Var3;
        }
        if (g6Var2 != null && g6Var2.i() > 0.0f) {
            canvas.save();
            if (!this.t || h()) {
                f22 = this.t ? 9 : 8;
            } else {
                f22 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f22) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(f18), f11);
            g6Var2.setBounds(0, 0, this.z, this.A);
            g6Var2.draw(canvas);
            g6Var2.B = (int) (f13 * 255.0f);
            canvas.restore();
            f23 = (g6Var2.i() * org.telegram.messenger.g0.L(f19)) + g6Var2.c();
        }
        if (f14 > 0.0f && !this.R && g6Var != null && this.S == null) {
            canvas.save();
            if (!this.t || h()) {
                f21 = this.t ? 9 : 8;
            } else {
                f21 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f21) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(g5Var == null ? f18 : 5.0f), f11 - org.telegram.messenger.g0.L(f25));
            g6Var.setBounds(0, 0, this.z, this.A);
            g6Var.draw(canvas);
            g6Var.B = (int) (255.0f * f13);
            canvas.restore();
        } else if (cqVar != null && e()) {
            canvas.save();
            if (!this.t || h()) {
                f20 = this.t ? 9 : 8;
            } else {
                f20 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f20) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(g5Var == null ? f18 : 5.0f) + f23 + (z14 ? -org.telegram.messenger.g0.L(f25) : 0), f11);
            cqVar.a(canvas);
            canvas.restore();
        }
        if (!this.R && this.S != null) {
            canvas.save();
            canvas.translate(f10 + org.telegram.messenger.g0.L(10.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(f18), f11);
            w8 w8Var = this.S;
            w8Var.u = f13;
            if (w8Var.w && w8Var.e != f12) {
                w8Var.e = f12;
                if (f12 == f25) {
                    w8Var.k();
                    w8Var.w = false;
                }
            }
            this.S.g(canvas);
            canvas.restore();
        }
        if (z12) {
            canvas.restore();
        }
    }

    public boolean e() {
        int i3 = this.v;
        return ((i3 == 0 || (this.R && !this.t && i3 == 1)) && this.E.l == 1.0f) ? false : true;
    }

    public final boolean f(Canvas canvas, float f10, float f11) {
        lc lcVar = this.Y;
        if (lcVar == null) {
            return false;
        }
        RectF rectF = lcVar.c;
        if (!org.telegram.messenger.lc.e(8200) || !org.telegram.messenger.lc.e(131072)) {
            return false;
        }
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(f10, f11, this.z + f10, this.A + f11);
        float f12 = this.A / 2.0f;
        rectF.set(rectF2);
        rectF.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
        lcVar.g(rectF);
        boolean d = lcVar.d();
        lcVar.a(canvas, i0.a.f(j(), i0.a.o(this.I, hs.e4), i0.a.f(0.4f, this.L, i0.a.o(this.I, hs.e4))));
        if (this.P) {
            Path path = this.c0;
            path.rewind();
            path.addRoundRect(rectF2, f12, f12, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            lcVar.a(canvas, this.J);
            canvas.restore();
        }
        return d;
    }

    public final void g(Canvas canvas, RectF rectF, float f10, Paint paint) {
        if (!this.R) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
            return;
        }
        RectF rectF2 = this.a0;
        float f11 = rectF2.left;
        float f12 = rectF.left;
        Path path = this.c0;
        if (f11 != f12 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
            rectF2.set(rectF);
            o0.h(rectF2, this.b0, path);
        }
        canvas.drawPath(path, paint);
    }

    public boolean h() {
        return true;
    }

    public int i() {
        return this.R ? 18 : 3;
    }

    public float j() {
        return 0.0f;
    }

    public ImageReceiver k() {
        return null;
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return false;
    }

    public final void o(ArrayList arrayList) {
        this.T = arrayList;
        if (arrayList != null) {
            Collections.sort(arrayList, o0.Z);
            if (this.S == null) {
                w8 w8Var = new w8(this.V, false);
                this.S = w8Var;
                w8Var.v = 250L;
                xq xqVar = ni.l.V;
                w8Var.s = org.telegram.messenger.g0.L(20.0f);
                this.S.p = org.telegram.messenger.g0.L(100.0f);
                w8 w8Var2 = this.S;
                w8Var2.o = this.A;
                w8Var2.h(org.telegram.messenger.g0.L(22.0f));
            }
            if (this.d0) {
                this.S.e();
            }
            for (int i3 = 0; i3 < arrayList.size() && i3 != 3; i3++) {
                this.S.j(i3, this.U, (TLObject) arrayList.get(i3));
            }
            this.S.a(false, true);
        }
    }

    public final void p() {
        ImageReceiver imageReceiver;
        g5 g5Var = this.C;
        if (g5Var == null || (imageReceiver = g5Var.k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            ch0 B = imageReceiver.B();
            if (B != null) {
                B.H(true);
                return;
            }
            org.telegram.ui.Components.t5 m10 = imageReceiver.m();
            if (m10 != null) {
                m10.start();
            }
        }
    }

    public final void q() {
        ImageReceiver imageReceiver;
        g5 g5Var = this.C;
        if (g5Var == null || (imageReceiver = g5Var.k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            ch0 B = imageReceiver.B();
            if (B != null) {
                B.stop();
                return;
            }
            org.telegram.ui.Components.t5 m10 = imageReceiver.m();
            if (m10 != null) {
                m10.stop();
            }
        }
    }

    public void r(float f10) {
        this.M = i0.a.f(f10, this.h, i0.a.f(j(), this.J, this.L));
        int f11 = i0.a.f(f10, this.f, i0.a.f(j(), this.I, this.K));
        this.N = f11;
        this.O = i0.a.f(f10, this.g, org.telegram.messenger.g0.B(f11) > 0.8f ? 0 : 1526726655);
    }

    public void n() {
    }
}
