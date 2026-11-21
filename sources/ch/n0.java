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
import di.ec;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.fc;
import org.telegram.messenger.gc;
import org.telegram.messenger.gd;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.pc;
import org.telegram.messenger.ri;
import org.telegram.messenger.u5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.u4;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.sq;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class n0 {
    public int A;
    public final ImageReceiver B;
    public final p5 C;
    public int D;
    public final sq E;
    public final n6 F;
    public final n6 G;
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
    public d9 S;
    public ArrayList T;
    public final int U;
    public final View V;
    public final h6 W;
    public final mc X;
    public final ec Y;
    public final oh0 Z;
    public final TLRPC.ReactionCount a;
    public int b;
    public int c;
    public int d;
    public boolean d0;
    public int e;
    public ImageReceiver e0;
    public int f;
    public p5 f0;
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

    public n0(n0 n0Var, int i7, View view, TLRPC.ReactionCount reactionCount, boolean z10, h6 h6Var) {
        ec ecVar;
        oh0 oh0Var;
        a5.b bVar = new a5.b(this, 1);
        this.U = i7;
        this.V = view;
        this.X = new mc(view);
        this.W = h6Var;
        this.R = z10;
        if (n0Var != null) {
            this.E = n0Var.E;
        }
        if (this.B == null) {
            this.B = new ImageReceiver(null);
        }
        if (this.E == null) {
            this.E = new sq(view, false, null);
        }
        if (this.F == null) {
            n6 n6Var = new n6(true, true, true);
            this.F = n6Var;
            n6Var.L = true;
            n6Var.n(0.4f, 320L, nr.h);
            n6Var.w(org.telegram.messenger.g0.L(13.0f));
            n6Var.setCallback(bVar);
            n6Var.x(org.telegram.messenger.g0.o());
            n6Var.N = org.telegram.messenger.g0.q.x;
        }
        if (this.G == null) {
            n6 n6Var2 = new n6(false, false, false, true, false);
            this.G = n6Var2;
            n6Var2.w(org.telegram.messenger.g0.L(12.0f));
            n6Var2.setCallback(bVar);
            n6Var2.x(org.telegram.messenger.g0.o());
            n6Var2.N = org.telegram.messenger.g0.q.x;
            n6Var2.B = 0.35f;
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
        sq sqVar = this.E;
        sqVar.G = false;
        sqVar.a = true;
        if (reaction != null) {
            if (d.a) {
                this.l = true;
                if (pc.e(8200)) {
                    if (n0Var == null || (oh0Var = n0Var.Z) == null) {
                        this.Z = new oh0(R.raw.star_reaction_click, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                    } else {
                        this.Z = oh0Var;
                    }
                    this.B.w0(this.Z);
                } else {
                    this.B.w0(org.telegram.messenger.t0.b.getResources().getDrawable(R.drawable.star_reaction).mutate());
                }
                if (n0Var == null || (ecVar = n0Var.Y) == null) {
                    ecVar = new ec(1, bz.o() == 2 ? 18 : 8);
                }
                this.Y = ecVar;
            } else if (d.f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ri.d0(i7).r.get(d.f);
                if (tL_availableReaction != null) {
                    this.B.q0(fc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", u5.f(tL_availableReaction.static_icon, m6.a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            } else if (d.g != 0) {
                this.C = new p5(i(), i7, d.g);
            }
        }
        this.E.d(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(100.0f));
        this.E.e = q0.V;
        if (z10) {
            this.u = mp.u1(i7).M1(reaction);
            this.t = !TextUtils.isEmpty(r1);
        }
        if (this.t) {
            n6 n6Var3 = this.F;
            n6Var3.t(j6.m(this.u, n6Var3.a.getFontMetricsInt(), false, null, 0), !gd.a0, true);
            if (this instanceof cm0) {
                Integer.toString(reactionCount.count);
                this.E.c(this.v, false);
            } else {
                this.E.c(0, false);
            }
        } else {
            n6 n6Var4 = this.F;
            if (n6Var4 != null) {
                n6Var4.t("", false, true);
            }
            Integer.toString(reactionCount.count);
            this.E.c(this.v, false);
        }
        sq sqVar2 = this.E;
        sqVar2.I = 2;
        sqVar2.z = 3;
    }

    public final void a() {
        this.d0 = true;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        d9 d9Var = this.S;
        if (d9Var != null) {
            d9Var.e();
        }
        p5 p5Var = this.C;
        if (p5Var != null) {
            p5Var.a(this.V);
        }
    }

    public final void b() {
        this.d0 = false;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        d9 d9Var = this.S;
        if (d9Var != null) {
            d9Var.f();
        }
        p5 p5Var = this.C;
        if (p5Var != null) {
            p5Var.n(this.V);
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
        sq sqVar;
        float f15;
        ImageReceiver imageReceiver;
        n6 n6Var;
        h6 h6Var;
        View view;
        float f16;
        float f17;
        float f18;
        boolean z12;
        float f19;
        float f20;
        n6 n6Var2;
        float f21;
        float f22;
        float f23;
        float f24;
        int L;
        int L2;
        ImageReceiver imageReceiver2;
        gc gcVar;
        boolean z13;
        Paint paint;
        u4 M1;
        sq sqVar2 = this.E;
        View view2 = this.V;
        boolean z14 = this.l;
        Rect rect = this.s;
        n6 n6Var3 = this.F;
        n6 n6Var4 = this.G;
        h6 h6Var2 = this.W;
        p5 p5Var = this.C;
        ImageReceiver imageReceiver3 = p5Var != null ? p5Var.k : this.B;
        if (this.o) {
            if (z14) {
                this.I = -1529086;
                this.J = -1;
                this.L = -1;
                this.K = -1529086;
            } else {
                this.I = m6.w0(l() ? m6.Jc : m6.tk, h6Var2);
                this.J = m6.w0(l() ? m6.xk : m6.wk, h6Var2);
                if (view2 instanceof v0) {
                    this.L = m6.w0(m6.zk, h6Var2);
                    this.K = m6.w0(m6.yk, h6Var2);
                } else {
                    this.L = m6.w0(l() ? m6.Jc : m6.tk, h6Var2);
                    this.K = m6.w0(l() ? m6.rb : m6.ra, h6Var2);
                }
            }
        } else if (z14) {
            this.J = -1529086;
            this.I = 1088989954;
            this.L = -1;
            this.K = 0;
        } else {
            this.J = m6.w0(l() ? m6.uk : m6.vk, h6Var2);
            int w02 = m6.w0(l() ? m6.Jc : m6.tk, h6Var2);
            this.I = w02;
            this.I = i0.a.o(w02, (int) (Color.alpha(w02) * 0.156f));
            this.L = m6.w0(m6.Zc, h6Var2);
            this.K = 0;
        }
        if (!z14 && (view2 instanceof r1) && ((r1) view2).w2()) {
            if (this.o) {
                this.I = m6.w0(m6.jb, h6Var2);
                this.J = m6.w0(m6.kb, h6Var2);
            } else {
                this.I = i0.a.k(m6.w0(m6.hb, h6Var2), l() ? i0.a.k(m6.w0(m6.La, h6Var2), m6.w0(m6.ua, h6Var2)) : m6.w0(m6.ua, h6Var2));
                this.J = m6.w0(m6.ib, h6Var2);
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
        if (n6Var3 != null) {
            n6Var3.u(this.M);
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
            sqVar = sqVar2;
            f15 = 0.0f;
            imageReceiver = imageReceiver3;
            n6Var = n6Var4;
            h6Var = h6Var2;
            view = view2;
        } else {
            if (z11) {
                n6Var = n6Var4;
                f15 = 0.0f;
                sqVar = sqVar2;
                h6Var = h6Var2;
                imageReceiver = imageReceiver3;
                n6Var.m(0.6f, 650L, 1.6f, nr.k);
                n6Var.t(org.telegram.messenger.g0.o0(this.v, 0), false, true);
                view = view2;
                n6Var.t(gd.E(this.v, ','), true, true);
            } else {
                sqVar = sqVar2;
                f15 = 0.0f;
                imageReceiver = imageReceiver3;
                n6Var = n6Var4;
                h6Var = h6Var2;
                view = view2;
                n6Var.m(0.6f, 320L, 1.6f, nr.h);
                n6Var.t(org.telegram.messenger.g0.o0(this.v, 0), true, true);
            }
            this.H = z11;
        }
        float a10 = this.X.a(0.1f);
        int i7 = this.z;
        if (f14 <= 0.0f || this.R || n6Var == null || this.S != null) {
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
            i7 = (int) (n6Var.c() + org.telegram.messenger.g0.L(p5Var != null ? 6.0f : 4.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(8.0f));
            n6Var.u(this.M);
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
            h6 h6Var3 = h6Var;
            Paint W0 = m6.W0("paintChatActionBackground", h6Var3);
            f19 = 2.0f;
            Paint W02 = m6.W0("paintChatActionBackgroundDarken", h6Var3);
            f20 = 4.0f;
            int alpha = W0.getAlpha();
            int alpha2 = W02.getAlpha();
            W0.setAlpha((int) (alpha * f13 * j()));
            W02.setAlpha((int) (alpha2 * f13 * j()));
            g(canvas, rectF, f27, W0);
            if (h6Var == null ? m6.d1() : h6Var.j()) {
                g(canvas, rectF, f27, W02);
            }
            W0.setAlpha(alpha);
            W02.setAlpha(alpha2);
        }
        if (z10 && j() < f26) {
            View view3 = view;
            if ((view3 instanceof r1) && (M1 = ((r1) view3).M1(false)) != null && !this.R) {
                canvas.drawRoundRect(rectF, f27, f27, M1.c);
            }
        }
        if (z15) {
            rectF.right += org.telegram.messenger.g0.L(f20);
            canvas.saveLayerAlpha(rectF, ks.e4, 31);
            rectF.right -= org.telegram.messenger.g0.L(f20);
        }
        if (this.Y != null) {
            pc.e(8200);
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
            } else if (p5Var != null) {
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
            p5 p5Var2 = this.C;
            if (p5Var2 == null || (imageReceiver2 = p5Var2.k) == null) {
                imageReceiver2 = this.B;
            }
            if (imageReceiver2 != null && rect != null) {
                imageReceiver2.z0(rect);
            }
            p5 p5Var3 = this.C;
            if (p5Var3 != null && this.D != this.M) {
                int i13 = this.M;
                this.D = i13;
                p5Var3.setColorFilter(new PorterDuffColorFilter(i13, PorterDuff.Mode.SRC_IN));
            }
            if (!this.k || (!this.l && this.i <= 1 && m() && this.P)) {
                n6Var2 = n6Var3;
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
                    n6Var2 = n6Var3;
                    float floor = (int) Math.floor(f28);
                    float floor2 = (int) Math.floor(f29);
                    k10.y0(floor, floor2, imageReceiver2.N0 * 2.0f, imageReceiver2.O0 * 2.0f);
                    canvas.save();
                    canvas.translate(f28 - floor, f29 - floor2);
                    gcVar = null;
                    k10.h(canvas, null);
                    canvas.restore();
                } else {
                    n6Var2 = n6Var3;
                    gcVar = null;
                    z13 = true;
                }
                if (z13) {
                    imageReceiver2.h(canvas, gcVar);
                }
                this.m = true;
            }
        } else {
            n6Var2 = n6Var3;
        }
        if (n6Var2 == null || n6Var2.i() <= f15) {
            f21 = f15;
        } else {
            canvas.save();
            if (!this.t || h()) {
                f24 = this.t ? 9 : 8;
            } else {
                f24 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f24) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(f19), f11);
            n6Var2.setBounds(0, 0, this.z, this.A);
            n6Var2.draw(canvas);
            n6Var2.C = (int) (f13 * 255.0f);
            canvas.restore();
            f21 = n6Var2.c() + (n6Var2.i() * org.telegram.messenger.g0.L(f20));
        }
        if (f14 > 0.0f && !this.R && n6Var != null && this.S == null) {
            float max = Math.max(f15, (org.telegram.messenger.g0.L(12.0f) - n6Var.c()) / f19);
            canvas.save();
            if (!this.t || h()) {
                f23 = this.t ? 9 : 8;
            } else {
                f23 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f23) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(p5Var == null ? f19 : 5.0f) + max, f11 - org.telegram.messenger.g0.L(f26));
            n6Var.setBounds(0, 0, this.z, this.A);
            n6Var.draw(canvas);
            n6Var.C = (int) (255.0f * f13);
            canvas.restore();
        } else if (sqVar != null && e()) {
            canvas.save();
            if (!this.t || h()) {
                f22 = this.t ? 9 : 8;
            } else {
                f22 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f22) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(p5Var == null ? f19 : 5.0f) + f21 + (z14 ? -org.telegram.messenger.g0.L(f26) : 0), f11);
            sqVar.a(canvas);
            canvas.restore();
        }
        if (!this.R && this.S != null) {
            canvas.save();
            canvas.translate(f10 + org.telegram.messenger.g0.L(10.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(f19), f11);
            d9 d9Var = this.S;
            d9Var.u = f13;
            if (d9Var.w && d9Var.e != f12) {
                d9Var.e = f12;
                if (f12 == f26) {
                    d9Var.k();
                    d9Var.w = false;
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
        ec ecVar = this.Y;
        if (ecVar == null) {
            return false;
        }
        RectF rectF = ecVar.c;
        if (!pc.e(8200) || !pc.e(131072)) {
            return false;
        }
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(f10, f11, this.z + f10, this.A + f11);
        float f12 = this.A / 2.0f;
        rectF.set(rectF2);
        rectF.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
        ecVar.g(rectF);
        boolean d = ecVar.d();
        ecVar.a(canvas, i0.a.f(j(), i0.a.o(this.I, ks.e4), i0.a.f(0.4f, this.L, i0.a.o(this.I, ks.e4))));
        if (this.P) {
            Path path = this.c0;
            path.rewind();
            path.addRoundRect(rectF2, f12, f12, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            ecVar.a(canvas, this.J);
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
                d9 d9Var = new d9(this.V, false);
                this.S = d9Var;
                d9Var.v = 250L;
                nr nrVar = pi.k.V;
                d9Var.s = org.telegram.messenger.g0.L(20.0f);
                this.S.p = org.telegram.messenger.g0.L(100.0f);
                d9 d9Var2 = this.S;
                d9Var2.o = this.A;
                d9Var2.h(org.telegram.messenger.g0.L(22.0f));
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
        p5 p5Var = this.C;
        if (p5Var == null || (imageReceiver = p5Var.k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            oh0 B = imageReceiver.B();
            if (B != null) {
                B.H(true);
                return;
            }
            c6 m10 = imageReceiver.m();
            if (m10 != null) {
                m10.start();
            }
        }
    }

    public final void q() {
        ImageReceiver imageReceiver;
        p5 p5Var = this.C;
        if (p5Var == null || (imageReceiver = p5Var.k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            oh0 B = imageReceiver.B();
            if (B != null) {
                B.stop();
                return;
            }
            c6 m10 = imageReceiver.m();
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
