package ch;

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
import com.google.android.gms.internal.vision.e2;
import di.bc;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gc;
import org.telegram.messenger.gz;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.qc;
import org.telegram.messenger.si;
import org.telegram.messenger.t5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.v8;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class n0 {
    public int A;
    public final ImageReceiver B;
    public final g5 C;
    public int D;
    public final jq E;
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
    public v8 S;
    public ArrayList T;
    public final int U;
    public final View V;
    public final e6 W;
    public final dc X;
    public final bc Y;
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
    public final p0 r;
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

    public n0(n0 n0Var, int i7, View view, TLRPC.ReactionCount reactionCount, boolean z10, e6 e6Var) {
        bc bcVar;
        ch0 ch0Var;
        a5.b bVar = new a5.b(this, 1);
        this.U = i7;
        this.V = view;
        this.X = new dc(view);
        this.W = e6Var;
        this.R = z10;
        if (n0Var != null) {
            this.E = n0Var.E;
        }
        if (this.B == null) {
            this.B = new ImageReceiver(null);
        }
        if (this.E == null) {
            this.E = new jq(view, false, null);
        }
        if (this.F == null) {
            g6 g6Var = new g6(true, true, true);
            this.F = g6Var;
            g6Var.L = true;
            g6Var.n(0.4f, 320L, er.h);
            g6Var.w(org.telegram.messenger.g0.L(13.0f));
            g6Var.setCallback(bVar);
            g6Var.x(org.telegram.messenger.g0.o());
            g6Var.N = org.telegram.messenger.g0.q.x;
        }
        if (this.G == null) {
            g6 g6Var2 = new g6(false, false, false, true, false);
            this.G = g6Var2;
            g6Var2.w(org.telegram.messenger.g0.L(12.0f));
            g6Var2.setCallback(bVar);
            g6Var2.x(org.telegram.messenger.g0.o());
            g6Var2.N = org.telegram.messenger.g0.q.x;
            g6Var2.B = 0.35f;
        }
        this.a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.q = reaction;
        p0 d = p0.d(reaction);
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
        jq jqVar = this.E;
        jqVar.G = false;
        jqVar.a = true;
        if (reaction != null) {
            if (d.a) {
                this.l = true;
                if (qc.e(8200)) {
                    if (n0Var == null || (ch0Var = n0Var.Z) == null) {
                        this.Z = new ch0(R.raw.star_reaction_click, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                    } else {
                        this.Z = ch0Var;
                    }
                    this.B.w0(this.Z);
                } else {
                    this.B.w0(org.telegram.messenger.t0.b.getResources().getDrawable(R.drawable.star_reaction).mutate());
                }
                if (n0Var == null || (bcVar = n0Var.Y) == null) {
                    bcVar = new bc(1, gz.o() == 2 ? 18 : 8);
                }
                this.Y = bcVar;
            } else if (d.f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) si.b0(i7).r.get(d.f);
                if (tL_availableReaction != null) {
                    this.B.q0(gc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", t5.f(tL_availableReaction.static_icon, j6.a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            } else if (d.g != 0) {
                this.C = new g5(i(), i7, d.g);
            }
        }
        this.E.d(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(100.0f));
        this.E.e = q0.V;
        if (z10) {
            this.u = np.s1(i7).K1(reaction);
            this.t = !TextUtils.isEmpty(r1);
        }
        if (this.t) {
            g6 g6Var3 = this.F;
            g6Var3.t(org.telegram.messenger.j6.m(this.u, g6Var3.a.getFontMetricsInt(), false, null, 0), !hd.a0, true);
            if (this instanceof sl0) {
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
        jq jqVar2 = this.E;
        jqVar2.I = 2;
        jqVar2.z = 3;
    }

    public final void a() {
        this.d0 = true;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        v8 v8Var = this.S;
        if (v8Var != null) {
            v8Var.e();
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
        v8 v8Var = this.S;
        if (v8Var != null) {
            v8Var.f();
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
        jq jqVar;
        float f15;
        ImageReceiver imageReceiver;
        g6 g6Var;
        e6 e6Var;
        View view;
        float f16;
        float f17;
        float f18;
        boolean z12;
        float f19;
        float f20;
        g6 g6Var2;
        float f21;
        float f22;
        float f23;
        float f24;
        int L;
        int L2;
        ImageReceiver imageReceiver2;
        hc hcVar;
        boolean z13;
        Paint paint;
        r4 M1;
        jq jqVar2 = this.E;
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
                this.I = j6.w0(l() ? j6.Jc : j6.tk, e6Var2);
                this.J = j6.w0(l() ? j6.xk : j6.wk, e6Var2);
                if (view2 instanceof org.telegram.ui.Cells.t0) {
                    this.L = j6.w0(j6.zk, e6Var2);
                    this.K = j6.w0(j6.yk, e6Var2);
                } else {
                    this.L = j6.w0(l() ? j6.Jc : j6.tk, e6Var2);
                    this.K = j6.w0(l() ? j6.rb : j6.ra, e6Var2);
                }
            }
        } else if (z14) {
            this.J = -1529086;
            this.I = 1088989954;
            this.L = -1;
            this.K = 0;
        } else {
            this.J = j6.w0(l() ? j6.uk : j6.vk, e6Var2);
            int w02 = j6.w0(l() ? j6.Jc : j6.tk, e6Var2);
            this.I = w02;
            this.I = i0.a.o(w02, (int) (Color.alpha(w02) * 0.156f));
            this.L = j6.w0(j6.Zc, e6Var2);
            this.K = 0;
        }
        if (!z14 && (view2 instanceof q1) && ((q1) view2).w2()) {
            if (this.o) {
                this.I = j6.w0(j6.jb, e6Var2);
                this.J = j6.w0(j6.kb, e6Var2);
            } else {
                this.I = i0.a.k(j6.w0(j6.hb, e6Var2), l() ? i0.a.k(j6.w0(j6.La, e6Var2), j6.w0(j6.ua, e6Var2)) : j6.w0(j6.ua, e6Var2));
                this.J = j6.w0(j6.ib, e6Var2);
            }
            this.L = this.J;
            this.K = this.I;
        }
        if (this.p) {
            this.I = 0;
            this.K = 0;
        }
        r(f12);
        TextPaint textPaint = q0.V;
        textPaint.setColor(this.M);
        if (g6Var3 != null) {
            g6Var3.u(this.M);
        }
        Paint paint2 = q0.S;
        paint2.setColor(this.N);
        boolean z15 = this.R && h() && Color.alpha(this.O) == 0;
        if (f13 != 1.0f) {
            textPaint.setAlpha((int) (textPaint.getAlpha() * f13));
            paint2.setAlpha((int) (paint2.getAlpha() * f13));
        }
        if (imageReceiver3 != null) {
            imageReceiver3.setAlpha(f13);
        }
        if (f14 <= 0.0f || this.H == z11) {
            jqVar = jqVar2;
            f15 = 0.0f;
            imageReceiver = imageReceiver3;
            g6Var = g6Var4;
            e6Var = e6Var2;
            view = view2;
        } else {
            if (z11) {
                g6Var = g6Var4;
                f15 = 0.0f;
                jqVar = jqVar2;
                e6Var = e6Var2;
                imageReceiver = imageReceiver3;
                g6Var.m(0.6f, 650L, 1.6f, er.k);
                g6Var.t(org.telegram.messenger.g0.o0(this.v, 0), false, true);
                view = view2;
                g6Var.t(hd.E(this.v, ','), true, true);
            } else {
                jqVar = jqVar2;
                f15 = 0.0f;
                imageReceiver = imageReceiver3;
                g6Var = g6Var4;
                e6Var = e6Var2;
                view = view2;
                g6Var.m(0.6f, 320L, 1.6f, er.h);
                g6Var.t(org.telegram.messenger.g0.o0(this.v, 0), true, true);
            }
            this.H = z11;
        }
        float a10 = this.X.a(0.1f);
        int i7 = this.z;
        if (f14 <= 0.0f || this.R || g6Var == null || this.S != null) {
            f16 = 1.0f;
            if (f12 != 1.0f) {
                f18 = 6.0f;
                f17 = 8.0f;
                if (this.b == 3) {
                    i7 = (int) e2.z(1.0f, f12, this.e, i7 * f12);
                }
            } else {
                f17 = 8.0f;
                f18 = 6.0f;
            }
        } else {
            i7 = (int) (g6Var.c() + org.telegram.messenger.g0.L(g5Var != null ? 6.0f : 4.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(8.0f));
            g6Var.u(this.M);
            f17 = 8.0f;
            f18 = 6.0f;
            f16 = 1.0f;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        float f25 = i7;
        float f26 = f16;
        rectF.set(f10, f11, f10 + f25, this.A + f11);
        if (a10 != f26) {
            canvas.save();
            canvas.scale(a10, a10, (f25 / 2.0f) + f10, (this.A / 2.0f) + f11);
            z12 = true;
        } else {
            z12 = false;
        }
        float f27 = this.A / 2.0f;
        if (j() <= f15 || this.p) {
            f19 = 2.0f;
            f20 = 4.0f;
        } else {
            e6 e6Var3 = e6Var;
            Paint W0 = j6.W0("paintChatActionBackground", e6Var3);
            f19 = 2.0f;
            Paint W02 = j6.W0("paintChatActionBackgroundDarken", e6Var3);
            f20 = 4.0f;
            int alpha = W0.getAlpha();
            int alpha2 = W02.getAlpha();
            W0.setAlpha((int) (alpha * f13 * j()));
            W02.setAlpha((int) (alpha2 * f13 * j()));
            g(canvas, rectF, f27, W0);
            if (e6Var == null ? j6.d1() : e6Var.g()) {
                g(canvas, rectF, f27, W02);
            }
            W0.setAlpha(alpha);
            W02.setAlpha(alpha2);
        }
        if (z10 && j() < f26) {
            View view3 = view;
            if ((view3 instanceof q1) && (M1 = ((q1) view3).M1(false)) != null && !this.R) {
                canvas.drawRoundRect(rectF, f27, f27, M1.c);
            }
        }
        if (z15) {
            rectF.right += org.telegram.messenger.g0.L(f20);
            canvas.saveLayerAlpha(rectF, ns.e4, 31);
            rectF.right -= org.telegram.messenger.g0.L(f20);
        }
        if (this.Y != null) {
            qc.e(8200);
        }
        g(canvas, rectF, f27, paint2);
        if (this.R && h()) {
            if (z15) {
                paint = q0.U;
            } else {
                paint = q0.T;
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
                L2 = org.telegram.messenger.g0.L(f20);
            } else if (g5Var != null) {
                L = org.telegram.messenger.g0.L(24.0f);
                L2 = org.telegram.messenger.g0.L(f18);
                imageReceiver4.J0(org.telegram.messenger.g0.L(f18));
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
                L2 = org.telegram.messenger.g0.L(f17);
                imageReceiver4.J0(0);
            }
            int i10 = (int) ((this.A - L) / f19);
            if (this.R) {
                L2 -= org.telegram.messenger.g0.L(f19);
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
                    float f28 = imageReceiver2.L0 - (imageReceiver2.N0 / 2.0f);
                    float f29 = imageReceiver2.M0 - (imageReceiver2.O0 / 2.0f);
                    g6Var2 = g6Var3;
                    float floor = (int) Math.floor(f28);
                    float floor2 = (int) Math.floor(f29);
                    k10.y0(floor, floor2, imageReceiver2.N0 * 2.0f, imageReceiver2.O0 * 2.0f);
                    canvas.save();
                    canvas.translate(f28 - floor, f29 - floor2);
                    hcVar = null;
                    k10.h(canvas, null);
                    canvas.restore();
                } else {
                    g6Var2 = g6Var3;
                    hcVar = null;
                    z13 = true;
                }
                if (z13) {
                    imageReceiver2.h(canvas, hcVar);
                }
                this.m = true;
            }
        } else {
            g6Var2 = g6Var3;
        }
        if (g6Var2 == null || g6Var2.i() <= f15) {
            f21 = f15;
        } else {
            canvas.save();
            if (!this.t || h()) {
                f24 = this.t ? 9 : 8;
            } else {
                f24 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f24) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(f19), f11);
            g6Var2.setBounds(0, 0, this.z, this.A);
            g6Var2.draw(canvas);
            g6Var2.C = (int) (f13 * 255.0f);
            canvas.restore();
            f21 = g6Var2.c() + (g6Var2.i() * org.telegram.messenger.g0.L(f20));
        }
        if (f14 > 0.0f && !this.R && g6Var != null && this.S == null) {
            float max = Math.max(f15, (org.telegram.messenger.g0.L(12.0f) - g6Var.c()) / f19);
            canvas.save();
            if (!this.t || h()) {
                f23 = this.t ? 9 : 8;
            } else {
                f23 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f23) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(g5Var == null ? f19 : 5.0f) + max, f11 - org.telegram.messenger.g0.L(f26));
            g6Var.setBounds(0, 0, this.z, this.A);
            g6Var.draw(canvas);
            g6Var.C = (int) (255.0f * f13);
            canvas.restore();
        } else if (jqVar != null && e()) {
            canvas.save();
            if (!this.t || h()) {
                f22 = this.t ? 9 : 8;
            } else {
                f22 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f22) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(g5Var == null ? f19 : 5.0f) + f21 + (z14 ? -org.telegram.messenger.g0.L(f26) : 0), f11);
            jqVar.a(canvas);
            canvas.restore();
        }
        if (!this.R && this.S != null) {
            canvas.save();
            canvas.translate(f10 + org.telegram.messenger.g0.L(10.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(f19), f11);
            v8 v8Var = this.S;
            v8Var.u = f13;
            if (v8Var.w && v8Var.e != f12) {
                v8Var.e = f12;
                if (f12 == f26) {
                    v8Var.k();
                    v8Var.w = false;
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
        int i7 = this.v;
        return ((i7 == 0 || (this.R && !this.t && i7 == 1)) && this.E.l == 1.0f) ? false : true;
    }

    public final boolean f(Canvas canvas, float f10, float f11) {
        bc bcVar = this.Y;
        if (bcVar == null) {
            return false;
        }
        RectF rectF = bcVar.c;
        if (!qc.e(8200) || !qc.e(131072)) {
            return false;
        }
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(f10, f11, this.z + f10, this.A + f11);
        float f12 = this.A / 2.0f;
        rectF.set(rectF2);
        rectF.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
        bcVar.g(rectF);
        boolean d = bcVar.d();
        bcVar.a(canvas, i0.a.f(j(), i0.a.o(this.I, ns.e4), i0.a.f(0.4f, this.L, i0.a.o(this.I, ns.e4))));
        if (this.P) {
            Path path = this.c0;
            path.rewind();
            path.addRoundRect(rectF2, f12, f12, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            bcVar.a(canvas, this.J);
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
            q0.h(rectF2, this.b0, path);
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
            Collections.sort(arrayList, q0.Z);
            if (this.S == null) {
                v8 v8Var = new v8(this.V, false);
                this.S = v8Var;
                v8Var.v = 250L;
                er erVar = pi.k.V;
                v8Var.s = org.telegram.messenger.g0.L(20.0f);
                this.S.p = org.telegram.messenger.g0.L(100.0f);
                v8 v8Var2 = this.S;
                v8Var2.o = this.A;
                v8Var2.h(org.telegram.messenger.g0.L(22.0f));
            }
            if (this.d0) {
                this.S.e();
            }
            for (int i7 = 0; i7 < arrayList.size() && i7 != 3; i7++) {
                this.S.j(i7, this.U, (TLObject) arrayList.get(i7));
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
