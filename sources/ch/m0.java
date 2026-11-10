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
import bi.ud;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.i6;
import org.telegram.messenger.ic;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.sc;
import org.telegram.messenger.t0;
import org.telegram.messenger.t5;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.u4;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x8;
import org.telegram.ui.Components.zg0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class m0 {
    public int A;
    public final ImageReceiver B;
    public final h5 C;
    public int D;
    public final bq E;
    public final h6 F;
    public final h6 G;
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
    public x8 S;
    public ArrayList T;
    public final int U;
    public final View V;
    public final org.telegram.ui.ActionBar.h6 W;
    public final hc X;
    public final ud Y;
    public final zg0 Z;
    public final TLRPC.ReactionCount a;
    public int b;
    public int c;
    public int d;
    public boolean d0;
    public int e;
    public ImageReceiver e0;
    public int f;
    public h5 f0;
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
    public final o0 r;
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

    public m0(m0 m0Var, int i7, View view, TLRPC.ReactionCount reactionCount, boolean z9, org.telegram.ui.ActionBar.h6 h6Var) {
        ud udVar;
        zg0 zg0Var;
        a5.b bVar = new a5.b(this, 2);
        this.U = i7;
        this.V = view;
        this.X = new hc(view);
        this.W = h6Var;
        this.R = z9;
        if (m0Var != null) {
            this.E = m0Var.E;
        }
        if (this.B == null) {
            this.B = new ImageReceiver(null);
        }
        if (this.E == null) {
            this.E = new bq(view, false, null);
        }
        if (this.F == null) {
            h6 h6Var2 = new h6(true, true, true);
            this.F = h6Var2;
            h6Var2.K = true;
            h6Var2.n(0.4f, 320L, wq.h);
            h6Var2.w(org.telegram.messenger.g0.L(13.0f));
            h6Var2.setCallback(bVar);
            h6Var2.x(org.telegram.messenger.g0.o());
            h6Var2.M = org.telegram.messenger.g0.q.x;
        }
        if (this.G == null) {
            h6 h6Var3 = new h6(false, false, false, true, false);
            this.G = h6Var3;
            h6Var3.w(org.telegram.messenger.g0.L(12.0f));
            h6Var3.setCallback(bVar);
            h6Var3.x(org.telegram.messenger.g0.o());
            h6Var3.M = org.telegram.messenger.g0.q.x;
            h6Var3.A = 0.35f;
        }
        this.a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.q = reaction;
        o0 d = o0.d(reaction);
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
        bq bqVar = this.E;
        bqVar.G = false;
        bqVar.a = true;
        if (reaction != null) {
            if (d.a) {
                this.l = true;
                if (sc.e(8200)) {
                    if (m0Var == null || (zg0Var = m0Var.Z) == null) {
                        this.Z = new zg0(R.raw.star_reaction_click, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                    } else {
                        this.Z = zg0Var;
                    }
                    this.B.w0(this.Z);
                } else {
                    this.B.w0(t0.b.getResources().getDrawable(R.drawable.star_reaction).mutate());
                }
                if (m0Var == null || (udVar = m0Var.Y) == null) {
                    udVar = new ud(1, iz.o() == 2 ? 18 : 8);
                }
                this.Y = udVar;
            } else if (d.f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(i7).r.get(d.f);
                if (tL_availableReaction != null) {
                    this.B.q0(org.telegram.messenger.hc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", t5.f(tL_availableReaction.static_icon, m6.a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            } else if (d.g != 0) {
                this.C = new h5(i(), i7, d.g);
            }
        }
        this.E.d(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(100.0f));
        this.E.e = p0.V;
        if (z9) {
            this.u = qp.s1(i7).K1(reaction);
            this.t = !TextUtils.isEmpty(r1);
        }
        if (this.t) {
            h6 h6Var4 = this.F;
            h6Var4.t(i6.m(this.u, h6Var4.a.getFontMetricsInt(), false, null, 0), !id.a0, true);
            if (this instanceof ol0) {
                Integer.toString(reactionCount.count);
                this.E.c(this.v, false);
            } else {
                this.E.c(0, false);
            }
        } else {
            h6 h6Var5 = this.F;
            if (h6Var5 != null) {
                h6Var5.t("", false, true);
            }
            Integer.toString(reactionCount.count);
            this.E.c(this.v, false);
        }
        bq bqVar2 = this.E;
        bqVar2.I = 2;
        bqVar2.z = 3;
    }

    public final void a() {
        this.d0 = true;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        x8 x8Var = this.S;
        if (x8Var != null) {
            x8Var.e();
        }
        h5 h5Var = this.C;
        if (h5Var != null) {
            h5Var.a(this.V);
        }
    }

    public final void b() {
        this.d0 = false;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        x8 x8Var = this.S;
        if (x8Var != null) {
            x8Var.f();
        }
        h5 h5Var = this.C;
        if (h5Var != null) {
            h5Var.n(this.V);
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

    public final void d(Canvas canvas, float f10, float f11, float f12, float f13, boolean z9, boolean z10, float f14) {
        bq bqVar;
        float f15;
        ImageReceiver imageReceiver;
        h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        View view;
        float f16;
        float f17;
        float f18;
        boolean z11;
        float f19;
        float f20;
        h6 h6Var3;
        float f21;
        float f22;
        float f23;
        float f24;
        int L;
        int L2;
        ImageReceiver imageReceiver2;
        ic icVar;
        boolean z12;
        Paint paint;
        u4 L1;
        bq bqVar2 = this.E;
        View view2 = this.V;
        boolean z13 = this.l;
        Rect rect = this.s;
        h6 h6Var4 = this.F;
        h6 h6Var5 = this.G;
        org.telegram.ui.ActionBar.h6 h6Var6 = this.W;
        h5 h5Var = this.C;
        ImageReceiver imageReceiver3 = h5Var != null ? h5Var.k : this.B;
        if (this.o) {
            if (z13) {
                this.I = -1529086;
                this.J = -1;
                this.L = -1;
                this.K = -1529086;
            } else {
                this.I = m6.w0(l() ? m6.Gc : m6.qk, h6Var6);
                this.J = m6.w0(l() ? m6.uk : m6.tk, h6Var6);
                if (view2 instanceof org.telegram.ui.Cells.t0) {
                    this.L = m6.w0(m6.wk, h6Var6);
                    this.K = m6.w0(m6.vk, h6Var6);
                } else {
                    this.L = m6.w0(l() ? m6.Gc : m6.qk, h6Var6);
                    this.K = m6.w0(l() ? m6.ob : m6.ra, h6Var6);
                }
            }
        } else if (z13) {
            this.J = -1529086;
            this.I = 1088989954;
            this.L = -1;
            this.K = 0;
        } else {
            this.J = m6.w0(l() ? m6.rk : m6.sk, h6Var6);
            int w02 = m6.w0(l() ? m6.Gc : m6.qk, h6Var6);
            this.I = w02;
            this.I = i0.a.o(w02, (int) (Color.alpha(w02) * 0.156f));
            this.L = m6.w0(m6.Wc, h6Var6);
            this.K = 0;
        }
        if (!z13 && (view2 instanceof q1) && ((q1) view2).v2()) {
            if (this.o) {
                this.I = m6.w0(m6.gb, h6Var6);
                this.J = m6.w0(m6.hb, h6Var6);
            } else {
                this.I = i0.a.k(m6.w0(m6.eb, h6Var6), l() ? i0.a.k(m6.w0(m6.La, h6Var6), m6.w0(m6.ua, h6Var6)) : m6.w0(m6.ua, h6Var6));
                this.J = m6.w0(m6.fb, h6Var6);
            }
            this.L = this.J;
            this.K = this.I;
        }
        if (this.p) {
            this.I = 0;
            this.K = 0;
        }
        r(f12);
        TextPaint textPaint = p0.V;
        textPaint.setColor(this.M);
        if (h6Var4 != null) {
            h6Var4.u(this.M);
        }
        Paint paint2 = p0.S;
        paint2.setColor(this.N);
        boolean z14 = this.R && h() && Color.alpha(this.O) == 0;
        if (f13 != 1.0f) {
            textPaint.setAlpha((int) (textPaint.getAlpha() * f13));
            paint2.setAlpha((int) (paint2.getAlpha() * f13));
        }
        if (imageReceiver3 != null) {
            imageReceiver3.setAlpha(f13);
        }
        if (f14 <= 0.0f || this.H == z10) {
            bqVar = bqVar2;
            f15 = 0.0f;
            imageReceiver = imageReceiver3;
            h6Var = h6Var5;
            h6Var2 = h6Var6;
            view = view2;
        } else {
            if (z10) {
                h6Var = h6Var5;
                f15 = 0.0f;
                bqVar = bqVar2;
                h6Var2 = h6Var6;
                imageReceiver = imageReceiver3;
                h6Var.m(0.6f, 650L, 1.6f, wq.k);
                h6Var.t(org.telegram.messenger.g0.o0(this.v, 0), false, true);
                view = view2;
                h6Var.t(id.E(this.v, ','), true, true);
            } else {
                bqVar = bqVar2;
                f15 = 0.0f;
                imageReceiver = imageReceiver3;
                h6Var = h6Var5;
                h6Var2 = h6Var6;
                view = view2;
                h6Var.m(0.6f, 320L, 1.6f, wq.h);
                h6Var.t(org.telegram.messenger.g0.o0(this.v, 0), true, true);
            }
            this.H = z10;
        }
        float a10 = this.X.a(0.1f);
        int i7 = this.z;
        if (f14 <= 0.0f || this.R || h6Var == null || this.S != null) {
            f16 = 1.0f;
            if (f12 != 1.0f) {
                f18 = 6.0f;
                f17 = 8.0f;
                if (this.b == 3) {
                    i7 = (int) com.google.android.recaptcha.internal.a.z(1.0f, f12, this.e, i7 * f12);
                }
            } else {
                f17 = 8.0f;
                f18 = 6.0f;
            }
        } else {
            i7 = (int) (h6Var.c() + org.telegram.messenger.g0.L(h5Var != null ? 6.0f : 4.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(8.0f));
            h6Var.u(this.M);
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
            z11 = true;
        } else {
            z11 = false;
        }
        float f27 = this.A / 2.0f;
        if (j() <= f15 || this.p) {
            f19 = 2.0f;
            f20 = 4.0f;
        } else {
            org.telegram.ui.ActionBar.h6 h6Var7 = h6Var2;
            Paint W0 = m6.W0("paintChatActionBackground", h6Var7);
            f19 = 2.0f;
            Paint W02 = m6.W0("paintChatActionBackgroundDarken", h6Var7);
            f20 = 4.0f;
            int alpha = W0.getAlpha();
            int alpha2 = W02.getAlpha();
            W0.setAlpha((int) (alpha * f13 * j()));
            W02.setAlpha((int) (alpha2 * f13 * j()));
            g(canvas, rectF, f27, W0);
            if (h6Var2 == null ? m6.d1() : h6Var2.g()) {
                g(canvas, rectF, f27, W02);
            }
            W0.setAlpha(alpha);
            W02.setAlpha(alpha2);
        }
        if (z9 && j() < f26) {
            View view3 = view;
            if ((view3 instanceof q1) && (L1 = ((q1) view3).L1(false)) != null && !this.R) {
                canvas.drawRoundRect(rectF, f27, f27, L1.c);
            }
        }
        if (z14) {
            rectF.right += org.telegram.messenger.g0.L(f20);
            canvas.saveLayerAlpha(rectF, qs.e4, 31);
            rectF.right -= org.telegram.messenger.g0.L(f20);
        }
        if (this.Y != null) {
            sc.e(8200);
        }
        g(canvas, rectF, f27, paint2);
        if (this.R && h()) {
            if (z14) {
                paint = p0.U;
            } else {
                paint = p0.T;
                paint.setColor(this.O);
                paint.setAlpha((int) (paint.getAlpha() * f13));
            }
            canvas.drawCircle(rectF.right - org.telegram.messenger.g0.L(8.4f), rectF.centerY(), org.telegram.messenger.g0.L(2.66f), paint);
        }
        if (z14) {
            canvas.restore();
        }
        ImageReceiver imageReceiver4 = imageReceiver;
        if (imageReceiver4 != null) {
            if (z13) {
                L = org.telegram.messenger.g0.L(22.0f);
                L2 = org.telegram.messenger.g0.L(f20);
            } else if (h5Var != null) {
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
            h5 h5Var2 = this.C;
            if (h5Var2 == null || (imageReceiver2 = h5Var2.k) == null) {
                imageReceiver2 = this.B;
            }
            if (imageReceiver2 != null && rect != null) {
                imageReceiver2.z0(rect);
            }
            h5 h5Var3 = this.C;
            if (h5Var3 != null && this.D != this.M) {
                int i13 = this.M;
                this.D = i13;
                h5Var3.setColorFilter(new PorterDuffColorFilter(i13, PorterDuff.Mode.SRC_IN));
            }
            if (!this.k || (!this.l && this.i <= 1 && m() && this.P)) {
                h6Var3 = h6Var4;
                imageReceiver2.setAlpha(0.0f);
                imageReceiver2.h(canvas, null);
                this.m = false;
            } else {
                ImageReceiver k10 = k();
                if (k10 != null) {
                    z12 = k10.B() == null || !k10.B().u();
                    if (f13 != 1.0f) {
                        k10.setAlpha(f13);
                        if (f13 <= 0.0f) {
                            k10.R();
                            n();
                        }
                    } else if (k10.B() != null && !k10.B().k0) {
                        float alpha3 = k10.getAlpha() - 0.08f;
                        if (alpha3 <= 0.0f) {
                            k10.R();
                            n();
                        } else {
                            k10.setAlpha(alpha3);
                        }
                        this.V.invalidate();
                        z12 = true;
                    }
                    float f28 = imageReceiver2.K0 - (imageReceiver2.M0 / 2.0f);
                    float f29 = imageReceiver2.L0 - (imageReceiver2.N0 / 2.0f);
                    h6Var3 = h6Var4;
                    float floor = (int) Math.floor(f28);
                    float floor2 = (int) Math.floor(f29);
                    k10.y0(floor, floor2, imageReceiver2.M0 * 2.0f, imageReceiver2.N0 * 2.0f);
                    canvas.save();
                    canvas.translate(f28 - floor, f29 - floor2);
                    icVar = null;
                    k10.h(canvas, null);
                    canvas.restore();
                } else {
                    h6Var3 = h6Var4;
                    icVar = null;
                    z12 = true;
                }
                if (z12) {
                    imageReceiver2.h(canvas, icVar);
                }
                this.m = true;
            }
        } else {
            h6Var3 = h6Var4;
        }
        if (h6Var3 == null || h6Var3.i() <= f15) {
            f21 = f15;
        } else {
            canvas.save();
            if (!this.t || h()) {
                f24 = this.t ? 9 : 8;
            } else {
                f24 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f24) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(f19), f11);
            h6Var3.setBounds(0, 0, this.z, this.A);
            h6Var3.draw(canvas);
            h6Var3.B = (int) (f13 * 255.0f);
            canvas.restore();
            f21 = h6Var3.c() + (h6Var3.i() * org.telegram.messenger.g0.L(f20));
        }
        if (f14 > 0.0f && !this.R && h6Var != null && this.S == null) {
            float max = Math.max(f15, (org.telegram.messenger.g0.L(12.0f) - h6Var.c()) / f19);
            canvas.save();
            if (!this.t || h()) {
                f23 = this.t ? 9 : 8;
            } else {
                f23 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f23) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(h5Var == null ? f19 : 5.0f) + max, f11 - org.telegram.messenger.g0.L(f26));
            h6Var.setBounds(0, 0, this.z, this.A);
            h6Var.draw(canvas);
            h6Var.B = (int) (255.0f * f13);
            canvas.restore();
        } else if (bqVar != null && e()) {
            canvas.save();
            if (!this.t || h()) {
                f22 = this.t ? 9 : 8;
            } else {
                f22 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f22) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(h5Var == null ? f19 : 5.0f) + f21 + (z13 ? -org.telegram.messenger.g0.L(f26) : 0), f11);
            bqVar.a(canvas);
            canvas.restore();
        }
        if (!this.R && this.S != null) {
            canvas.save();
            canvas.translate(f10 + org.telegram.messenger.g0.L(10.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(f19), f11);
            x8 x8Var = this.S;
            x8Var.u = f13;
            if (x8Var.w && x8Var.e != f12) {
                x8Var.e = f12;
                if (f12 == f26) {
                    x8Var.k();
                    x8Var.w = false;
                }
            }
            this.S.g(canvas);
            canvas.restore();
        }
        if (z11) {
            canvas.restore();
        }
    }

    public boolean e() {
        int i7 = this.v;
        return ((i7 == 0 || (this.R && !this.t && i7 == 1)) && this.E.l == 1.0f) ? false : true;
    }

    public final boolean f(Canvas canvas, float f10, float f11) {
        ud udVar = this.Y;
        if (udVar == null) {
            return false;
        }
        RectF rectF = udVar.c;
        if (!sc.e(8200) || !sc.e(131072)) {
            return false;
        }
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(f10, f11, this.z + f10, this.A + f11);
        float f12 = this.A / 2.0f;
        rectF.set(rectF2);
        rectF.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
        udVar.g(rectF);
        boolean d = udVar.d();
        udVar.a(canvas, i0.a.f(j(), i0.a.o(this.I, qs.e4), i0.a.f(0.4f, this.L, i0.a.o(this.I, qs.e4))));
        if (this.P) {
            Path path = this.c0;
            path.rewind();
            path.addRoundRect(rectF2, f12, f12, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            udVar.a(canvas, this.J);
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
            p0.h(rectF2, this.b0, path);
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
            Collections.sort(arrayList, p0.Z);
            if (this.S == null) {
                x8 x8Var = new x8(this.V, false);
                this.S = x8Var;
                x8Var.v = 250L;
                wq wqVar = mi.l.V;
                x8Var.s = org.telegram.messenger.g0.L(20.0f);
                this.S.p = org.telegram.messenger.g0.L(100.0f);
                x8 x8Var2 = this.S;
                x8Var2.o = this.A;
                x8Var2.h(org.telegram.messenger.g0.L(22.0f));
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
        h5 h5Var = this.C;
        if (h5Var == null || (imageReceiver = h5Var.k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            zg0 B = imageReceiver.B();
            if (B != null) {
                B.H(true);
                return;
            }
            u5 m10 = imageReceiver.m();
            if (m10 != null) {
                m10.start();
            }
        }
    }

    public final void q() {
        ImageReceiver imageReceiver;
        h5 h5Var = this.C;
        if (h5Var == null || (imageReceiver = h5Var.k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            zg0 B = imageReceiver.B();
            if (B != null) {
                B.stop();
                return;
            }
            u5 m10 = imageReceiver.m();
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
