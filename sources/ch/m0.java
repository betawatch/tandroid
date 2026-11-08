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
import org.telegram.messenger.hc;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t4;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y8;
import org.telegram.ui.Components.zg0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public abstract class m0 {
    public int A;
    public final ImageReceiver B;
    public final i5 C;
    public int D;
    public final bq E;
    public final i6 F;
    public final i6 G;
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
    public y8 S;
    public ArrayList T;
    public final int U;
    public final View V;
    public final f6 W;
    public final ic X;
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
    public i5 f0;
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

    public m0(m0 m0Var, int i7, View view, TLRPC.ReactionCount reactionCount, boolean z9, f6 f6Var) {
        ud udVar;
        zg0 zg0Var;
        a5.b bVar = new a5.b(this, 2);
        this.U = i7;
        this.V = view;
        this.X = new ic(view);
        this.W = f6Var;
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
            i6 i6Var = new i6(true, true, true);
            this.F = i6Var;
            i6Var.K = true;
            i6Var.n(0.4f, 320L, xq.h);
            i6Var.w(org.telegram.messenger.g0.L(13.0f));
            i6Var.setCallback(bVar);
            i6Var.x(org.telegram.messenger.g0.o());
            i6Var.M = org.telegram.messenger.g0.q.x;
        }
        if (this.G == null) {
            i6 i6Var2 = new i6(false, false, false, true, false);
            this.G = i6Var2;
            i6Var2.w(org.telegram.messenger.g0.L(12.0f));
            i6Var2.setCallback(bVar);
            i6Var2.x(org.telegram.messenger.g0.o());
            i6Var2.M = org.telegram.messenger.g0.q.x;
            i6Var2.A = 0.35f;
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
                    this.B.q0(hc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", t5.f(tL_availableReaction.static_icon, k6.a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            } else if (d.g != 0) {
                this.C = new i5(i(), i7, d.g);
            }
        }
        this.E.d(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(100.0f));
        this.E.e = p0.V;
        if (z9) {
            this.u = qp.s1(i7).K1(reaction);
            this.t = !TextUtils.isEmpty(r1);
        }
        if (this.t) {
            i6 i6Var3 = this.F;
            i6Var3.t(org.telegram.messenger.i6.m(this.u, i6Var3.a.getFontMetricsInt(), false, null, 0), !id.a0, true);
            if (this instanceof ol0) {
                Integer.toString(reactionCount.count);
                this.E.c(this.v, false);
            } else {
                this.E.c(0, false);
            }
        } else {
            i6 i6Var4 = this.F;
            if (i6Var4 != null) {
                i6Var4.t("", false, true);
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
        y8 y8Var = this.S;
        if (y8Var != null) {
            y8Var.e();
        }
        i5 i5Var = this.C;
        if (i5Var != null) {
            i5Var.a(this.V);
        }
    }

    public final void b() {
        this.d0 = false;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        y8 y8Var = this.S;
        if (y8Var != null) {
            y8Var.f();
        }
        i5 i5Var = this.C;
        if (i5Var != null) {
            i5Var.n(this.V);
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
        ImageReceiver imageReceiver;
        i6 i6Var;
        f6 f6Var;
        View view;
        float f15;
        float f16;
        float f17;
        boolean z11;
        float f18;
        float f19;
        i6 i6Var2;
        float f20;
        float f21;
        float f22;
        int L;
        int L2;
        ImageReceiver imageReceiver2;
        org.telegram.messenger.ic icVar;
        boolean z12;
        Paint paint;
        t4 L1;
        bq bqVar2 = this.E;
        View view2 = this.V;
        boolean z13 = this.l;
        Rect rect = this.s;
        i6 i6Var3 = this.F;
        i6 i6Var4 = this.G;
        f6 f6Var2 = this.W;
        i5 i5Var = this.C;
        ImageReceiver imageReceiver3 = i5Var != null ? i5Var.k : this.B;
        if (this.o) {
            if (z13) {
                this.I = -1529086;
                this.J = -1;
                this.L = -1;
                this.K = -1529086;
            } else {
                this.I = k6.w0(l() ? k6.Gc : k6.qk, f6Var2);
                this.J = k6.w0(l() ? k6.uk : k6.tk, f6Var2);
                if (view2 instanceof org.telegram.ui.Cells.t0) {
                    this.L = k6.w0(k6.wk, f6Var2);
                    this.K = k6.w0(k6.vk, f6Var2);
                } else {
                    this.L = k6.w0(l() ? k6.Gc : k6.qk, f6Var2);
                    this.K = k6.w0(l() ? k6.ob : k6.ra, f6Var2);
                }
            }
        } else if (z13) {
            this.J = -1529086;
            this.I = 1088989954;
            this.L = -1;
            this.K = 0;
        } else {
            this.J = k6.w0(l() ? k6.rk : k6.sk, f6Var2);
            int w02 = k6.w0(l() ? k6.Gc : k6.qk, f6Var2);
            this.I = w02;
            this.I = i0.a.o(w02, (int) (Color.alpha(w02) * 0.156f));
            this.L = k6.w0(k6.Wc, f6Var2);
            this.K = 0;
        }
        if (!z13 && (view2 instanceof q1) && ((q1) view2).v2()) {
            if (this.o) {
                this.I = k6.w0(k6.gb, f6Var2);
                this.J = k6.w0(k6.hb, f6Var2);
            } else {
                this.I = i0.a.k(k6.w0(k6.eb, f6Var2), l() ? i0.a.k(k6.w0(k6.La, f6Var2), k6.w0(k6.ua, f6Var2)) : k6.w0(k6.ua, f6Var2));
                this.J = k6.w0(k6.fb, f6Var2);
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
        if (i6Var3 != null) {
            i6Var3.u(this.M);
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
        float f23 = 0.0f;
        if (f14 <= 0.0f || this.H == z10) {
            bqVar = bqVar2;
            imageReceiver = imageReceiver3;
            i6Var = i6Var4;
            f6Var = f6Var2;
            view = view2;
        } else {
            if (z10) {
                i6Var = i6Var4;
                bqVar = bqVar2;
                f6Var = f6Var2;
                imageReceiver = imageReceiver3;
                i6Var.m(0.6f, 650L, 1.6f, xq.k);
                i6Var.t(org.telegram.messenger.g0.o0(this.v, 0), false, true);
                view = view2;
                i6Var.t(id.E(this.v, ','), true, true);
            } else {
                bqVar = bqVar2;
                imageReceiver = imageReceiver3;
                i6Var = i6Var4;
                f6Var = f6Var2;
                view = view2;
                i6Var.m(0.6f, 320L, 1.6f, xq.h);
                i6Var.t(org.telegram.messenger.g0.o0(this.v, 0), true, true);
            }
            this.H = z10;
        }
        float a10 = this.X.a(0.1f);
        int i7 = this.z;
        if (f14 <= 0.0f || this.R || i6Var == null || this.S != null) {
            f15 = 1.0f;
            if (f12 != 1.0f) {
                f17 = 6.0f;
                f16 = 8.0f;
                if (this.b == 3) {
                    i7 = (int) com.google.android.recaptcha.internal.a.z(1.0f, f12, this.e, i7 * f12);
                }
            } else {
                f16 = 8.0f;
                f17 = 6.0f;
            }
        } else {
            i7 = (int) (i6Var.c() + org.telegram.messenger.g0.L(i5Var != null ? 6.0f : 4.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(8.0f));
            i6Var.u(this.M);
            f16 = 8.0f;
            f17 = 6.0f;
            f15 = 1.0f;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        float f24 = i7;
        float f25 = f15;
        rectF.set(f10, f11, f10 + f24, this.A + f11);
        if (a10 != f25) {
            canvas.save();
            canvas.scale(a10, a10, (f24 / 2.0f) + f10, (this.A / 2.0f) + f11);
            z11 = true;
        } else {
            z11 = false;
        }
        float f26 = this.A / 2.0f;
        if (j() <= 0.0f || this.p) {
            f18 = 2.0f;
            f19 = 4.0f;
        } else {
            f6 f6Var3 = f6Var;
            Paint W0 = k6.W0("paintChatActionBackground", f6Var3);
            f18 = 2.0f;
            Paint W02 = k6.W0("paintChatActionBackgroundDarken", f6Var3);
            f19 = 4.0f;
            int alpha = W0.getAlpha();
            int alpha2 = W02.getAlpha();
            W0.setAlpha((int) (alpha * f13 * j()));
            W02.setAlpha((int) (alpha2 * f13 * j()));
            g(canvas, rectF, f26, W0);
            if (f6Var == null ? k6.d1() : f6Var.g()) {
                g(canvas, rectF, f26, W02);
            }
            W0.setAlpha(alpha);
            W02.setAlpha(alpha2);
        }
        if (z9 && j() < f25) {
            View view3 = view;
            if ((view3 instanceof q1) && (L1 = ((q1) view3).L1(false)) != null && !this.R) {
                canvas.drawRoundRect(rectF, f26, f26, L1.c);
            }
        }
        if (z14) {
            rectF.right += org.telegram.messenger.g0.L(f19);
            canvas.saveLayerAlpha(rectF, qs.e4, 31);
            rectF.right -= org.telegram.messenger.g0.L(f19);
        }
        if (this.Y != null) {
            sc.e(8200);
        }
        g(canvas, rectF, f26, paint2);
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
                L2 = org.telegram.messenger.g0.L(f19);
            } else if (i5Var != null) {
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
            i5 i5Var2 = this.C;
            if (i5Var2 == null || (imageReceiver2 = i5Var2.k) == null) {
                imageReceiver2 = this.B;
            }
            if (imageReceiver2 != null && rect != null) {
                imageReceiver2.z0(rect);
            }
            i5 i5Var3 = this.C;
            if (i5Var3 != null && this.D != this.M) {
                int i13 = this.M;
                this.D = i13;
                i5Var3.setColorFilter(new PorterDuffColorFilter(i13, PorterDuff.Mode.SRC_IN));
            }
            if (!this.k || (!this.l && this.i <= 1 && m() && this.P)) {
                i6Var2 = i6Var3;
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
                    float f27 = imageReceiver2.K0 - (imageReceiver2.M0 / 2.0f);
                    float f28 = imageReceiver2.L0 - (imageReceiver2.N0 / 2.0f);
                    i6Var2 = i6Var3;
                    float floor = (int) Math.floor(f27);
                    float floor2 = (int) Math.floor(f28);
                    k10.y0(floor, floor2, imageReceiver2.M0 * 2.0f, imageReceiver2.N0 * 2.0f);
                    canvas.save();
                    canvas.translate(f27 - floor, f28 - floor2);
                    icVar = null;
                    k10.h(canvas, null);
                    canvas.restore();
                } else {
                    i6Var2 = i6Var3;
                    icVar = null;
                    z12 = true;
                }
                if (z12) {
                    imageReceiver2.h(canvas, icVar);
                }
                this.m = true;
            }
        } else {
            i6Var2 = i6Var3;
        }
        if (i6Var2 != null && i6Var2.i() > 0.0f) {
            canvas.save();
            if (!this.t || h()) {
                f22 = this.t ? 9 : 8;
            } else {
                f22 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f22) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(f18), f11);
            i6Var2.setBounds(0, 0, this.z, this.A);
            i6Var2.draw(canvas);
            i6Var2.B = (int) (f13 * 255.0f);
            canvas.restore();
            f23 = (i6Var2.i() * org.telegram.messenger.g0.L(f19)) + i6Var2.c();
        }
        if (f14 > 0.0f && !this.R && i6Var != null && this.S == null) {
            canvas.save();
            if (!this.t || h()) {
                f21 = this.t ? 9 : 8;
            } else {
                f21 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f21) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(i5Var == null ? f18 : 5.0f), f11 - org.telegram.messenger.g0.L(f25));
            i6Var.setBounds(0, 0, this.z, this.A);
            i6Var.draw(canvas);
            i6Var.B = (int) (255.0f * f13);
            canvas.restore();
        } else if (bqVar != null && e()) {
            canvas.save();
            if (!this.t || h()) {
                f20 = this.t ? 9 : 8;
            } else {
                f20 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f20) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(i5Var == null ? f18 : 5.0f) + f23 + (z13 ? -org.telegram.messenger.g0.L(f25) : 0), f11);
            bqVar.a(canvas);
            canvas.restore();
        }
        if (!this.R && this.S != null) {
            canvas.save();
            canvas.translate(f10 + org.telegram.messenger.g0.L(10.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(f18), f11);
            y8 y8Var = this.S;
            y8Var.u = f13;
            if (y8Var.w && y8Var.e != f12) {
                y8Var.e = f12;
                if (f12 == f25) {
                    y8Var.k();
                    y8Var.w = false;
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
                y8 y8Var = new y8(this.V, false);
                this.S = y8Var;
                y8Var.v = 250L;
                xq xqVar = mi.l.V;
                y8Var.s = org.telegram.messenger.g0.L(20.0f);
                this.S.p = org.telegram.messenger.g0.L(100.0f);
                y8 y8Var2 = this.S;
                y8Var2.o = this.A;
                y8Var2.h(org.telegram.messenger.g0.L(22.0f));
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
        i5 i5Var = this.C;
        if (i5Var == null || (imageReceiver = i5Var.k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            zg0 B = imageReceiver.B();
            if (B != null) {
                B.H(true);
                return;
            }
            v5 m10 = imageReceiver.m();
            if (m10 != null) {
                m10.start();
            }
        }
    }

    public final void q() {
        ImageReceiver imageReceiver;
        i5 i5Var = this.C;
        if (i5Var == null || (imageReceiver = i5Var.k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            zg0 B = imageReceiver.B();
            if (B != null) {
                B.stop();
                return;
            }
            v5 m10 = imageReceiver.m();
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
