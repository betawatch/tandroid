// default package

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
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class f19 {
    public int A;
    public final ImageReceiver B;
    public final vl C;
    public int D;
    public final jx2 E;
    public final gn F;
    public final gn G;
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
    public gc0 S;
    public ArrayList T;
    public final int U;
    public final View V;
    public final wjb W;
    public final n41 X;
    public final vva Y;
    public final oy8 Z;
    public final TLRPC.ReactionCount a;
    public byte b;
    public int c;
    public int d;
    public boolean d0;
    public int e;
    public ImageReceiver e0;
    public int f;
    public vl f0;
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
    public final h19 r;
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

    public f19(f19 f19Var, int i, View view, TLRPC.ReactionCount reactionCount, boolean z, wjb wjbVar) {
        vva vvaVar;
        oy8 oy8Var;
        in inVar = new in(this, (byte) 8);
        this.U = i;
        this.V = view;
        this.X = new n41(view);
        this.W = wjbVar;
        this.R = z;
        if (f19Var != null) {
            this.E = f19Var.E;
        }
        if (this.B == null) {
            this.B = new ImageReceiver(null);
        }
        if (this.E == null) {
            this.E = new jx2(view, false, null);
        }
        if (this.F == null) {
            gn gnVar = new gn(true, true, true);
            this.F = gnVar;
            gnVar.L = true;
            gnVar.n(0.4f, 320L, s33.h);
            gnVar.w(gl.L(13.0f));
            gnVar.setCallback(inVar);
            gnVar.x(gl.o());
            gnVar.N = gl.q.x;
        }
        if (this.G == null) {
            gn gnVar2 = new gn(false, false, false, true, false);
            this.G = gnVar2;
            gnVar2.w(gl.L(12.0f));
            gnVar2.setCallback(inVar);
            gnVar2.x(gl.o());
            gnVar2.N = gl.q.x;
            gnVar2.B = 0.35f;
        }
        this.a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.q = reaction;
        h19 d = h19.d(reaction);
        this.r = d;
        int i2 = reactionCount.count;
        this.v = i2;
        this.o = reactionCount.chosen;
        this.i = i2;
        this.j = reactionCount.chosen_order;
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            this.n = "stars";
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            this.n = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        } else {
            if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji)) {
                wn4.j("unsupported");
                throw null;
            }
            this.n = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        }
        this.B.p0(view);
        this.P = reactionCount.chosen;
        jx2 jx2Var = this.E;
        jx2Var.F = false;
        jx2Var.a = true;
        if (reaction != null) {
            if (d.a) {
                this.l = true;
                if (e66.e(8200)) {
                    if (f19Var == null || (oy8Var = f19Var.Z) == null) {
                        oy8Var = new oy8(R.raw.star_reaction_click, gl.L(40.0f), gl.L(40.0f));
                        this.Z = oy8Var;
                    } else {
                        this.Z = oy8Var;
                    }
                    this.B.g0(oy8Var);
                } else {
                    this.B.g0(a.b.getResources().getDrawable(R.drawable.star_reaction).mutate());
                }
                if (f19Var == null || (vvaVar = f19Var.Y) == null) {
                    vvaVar = new vva(1, gba.o() == 2 ? 18 : 8);
                }
                this.Y = vvaVar;
            } else if (d.f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hq6.d0(i).r.get(d.f);
                if (tL_availableReaction != null) {
                    this.B.d0(gl5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", uo3.f(tL_availableReaction.static_icon, bkb.Z6, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            } else if (d.g != 0) {
                this.C = new vl(i(), i, d.g);
            }
        }
        this.E.d(gl.L(26.0f), gl.L(100.0f));
        this.E.e = i19.V;
        if (z) {
            this.u = na7.q1(i).H1(reaction);
            this.t = !TextUtils.isEmpty(r1);
        }
        boolean z2 = this.t;
        gn gnVar3 = this.F;
        if (z2) {
            gnVar3.t(vu3.m(this.u, gnVar3.a.getFontMetricsInt(), false, null, 0), !k96.a0, true);
            boolean z3 = this instanceof ts9;
            jx2 jx2Var2 = this.E;
            if (z3) {
                jx2Var2.c(this.v, false);
            } else {
                jx2Var2.c(0, false);
            }
        } else {
            if (gnVar3 != null) {
                gnVar3.t("", false, true);
            }
            this.E.c(this.v, false);
        }
        jx2 jx2Var3 = this.E;
        jx2Var3.H = (byte) 2;
        jx2Var3.z = 3;
    }

    public final void a() {
        this.d0 = true;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.I();
        }
        gc0 gc0Var = this.S;
        if (gc0Var != null) {
            gc0Var.e();
        }
        vl vlVar = this.C;
        if (vlVar != null) {
            vlVar.b(this.V);
        }
    }

    public final void b() {
        this.d0 = false;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.K();
        }
        gc0 gc0Var = this.S;
        if (gc0Var != null) {
            gc0Var.f();
        }
        vl vlVar = this.C;
        if (vlVar != null) {
            vlVar.o(this.V);
        }
        c();
    }

    public final void c() {
        ImageReceiver imageReceiver = this.e0;
        if (imageReceiver == null && this.f0 == null) {
            return;
        }
        if (imageReceiver != null) {
            imageReceiver.K();
            this.e0 = null;
        } else if (this.f0 != null) {
            View view = this.V;
            if (view != null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            this.f0.o(view);
            this.f0 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0398  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, float f, float f2, float f3, float f4, boolean z, boolean z2, float f5) {
        jx2 jx2Var;
        float f6;
        ImageReceiver imageReceiver;
        gn gnVar;
        wjb wjbVar;
        View view;
        float f7;
        float f8;
        float f9;
        RectF rectF;
        float f10;
        boolean z3;
        float f11;
        boolean z4;
        float f12;
        float f13;
        ImageReceiver imageReceiver2;
        float f14;
        float f15;
        gc0 gc0Var;
        float f16;
        float f17;
        int L;
        int L2;
        ImageReceiver imageReceiver3;
        il5 il5Var;
        float f18;
        il5 il5Var2;
        boolean z5;
        Paint paint;
        View view2;
        m17 O1;
        int v0;
        jx2 jx2Var2 = this.E;
        View view3 = this.V;
        boolean z6 = this.l;
        Rect rect = this.s;
        gn gnVar2 = this.F;
        gn gnVar3 = this.G;
        wjb wjbVar2 = this.W;
        vl vlVar = this.C;
        ImageReceiver imageReceiver4 = vlVar != null ? vlVar.k : this.B;
        if (this.o) {
            if (z6) {
                this.I = -1529086;
                this.J = -1;
                this.L = -1;
                this.K = -1529086;
            } else {
                this.I = bkb.v0(l() ? bkb.Ic : bkb.sk, wjbVar2);
                this.J = bkb.v0(l() ? bkb.wk : bkb.vk, wjbVar2);
                if (view3 instanceof uk1) {
                    this.L = bkb.v0(bkb.yk, wjbVar2);
                    this.K = bkb.v0(bkb.xk, wjbVar2);
                } else {
                    this.L = bkb.v0(l() ? bkb.Ic : bkb.sk, wjbVar2);
                    this.K = bkb.v0(l() ? bkb.qb : bkb.qa, wjbVar2);
                }
            }
        } else if (z6) {
            this.J = -1529086;
            this.I = 1088989954;
            this.L = -1;
            this.K = 0;
        } else {
            this.J = bkb.v0(l() ? bkb.tk : bkb.uk, wjbVar2);
            int v02 = bkb.v0(l() ? bkb.Ic : bkb.sk, wjbVar2);
            this.I = v02;
            this.I = bm2.o(v02, (int) (Color.alpha(v02) * 0.156f));
            this.L = bkb.v0(bkb.Yc, wjbVar2);
            this.K = 0;
        }
        if (!z6 && (view3 instanceof gb2) && ((gb2) view3).w2()) {
            if (this.o) {
                this.I = bkb.v0(bkb.ib, wjbVar2);
                v0 = bkb.v0(bkb.jb, wjbVar2);
                this.J = v0;
            } else {
                this.I = bm2.k(bkb.v0(bkb.gb, wjbVar2), l() ? bm2.k(bkb.v0(bkb.Ka, wjbVar2), bkb.v0(bkb.ta, wjbVar2)) : bkb.v0(bkb.ta, wjbVar2));
                v0 = bkb.v0(bkb.hb, wjbVar2);
                this.J = v0;
            }
            this.L = v0;
            this.K = this.I;
        }
        if (this.p) {
            this.I = 0;
            this.K = 0;
        }
        r(f3);
        TextPaint textPaint = i19.V;
        textPaint.setColor(this.M);
        if (gnVar2 != null) {
            gnVar2.u(this.M);
        }
        Paint paint2 = i19.S;
        paint2.setColor(this.N);
        boolean z7 = this.R && h() && Color.alpha(this.O) == 0;
        if (f4 != 1.0f) {
            textPaint.setAlpha((int) (textPaint.getAlpha() * f4));
            paint2.setAlpha((int) (paint2.getAlpha() * f4));
        }
        if (imageReceiver4 != null) {
            imageReceiver4.setAlpha(f4);
        }
        if (f5 <= 0.0f || this.H == z2) {
            jx2Var = jx2Var2;
            f6 = 0.0f;
            imageReceiver = imageReceiver4;
            gnVar = gnVar3;
            wjbVar = wjbVar2;
            view = view3;
        } else {
            if (z2) {
                f6 = 0.0f;
                gnVar = gnVar3;
                jx2Var = jx2Var2;
                wjbVar = wjbVar2;
                imageReceiver = imageReceiver4;
                gnVar.m(0.6f, 650L, 1.6f, s33.k);
                gnVar.t(gl.o0(this.v, 0), false, true);
                view = view3;
                gnVar.t(k96.E(this.v, ','), true, true);
            } else {
                jx2Var = jx2Var2;
                f6 = 0.0f;
                imageReceiver = imageReceiver4;
                gnVar = gnVar3;
                wjbVar = wjbVar2;
                view = view3;
                gnVar.m(0.6f, 320L, 1.6f, s33.h);
                gnVar.t(gl.o0(this.v, 0), true, true);
            }
            this.H = z2;
        }
        float a = this.X.a(0.1f);
        int i = this.z;
        if (f5 <= 0.0f || this.R || gnVar == null || this.S != null) {
            f7 = 1.0f;
            f8 = 8.0f;
            if (f3 != 1.0f) {
                f9 = 4.0f;
                if (this.b == 3) {
                    i = (int) tb4.A(1.0f, f3, this.e, i * f3);
                }
                rectF = gl.P;
                float f19 = i;
                f10 = f7;
                rectF.set(f, f2, f + f19, this.A + f2);
                if (a == f10) {
                    canvas.save();
                    canvas.scale(a, a, (f19 / 2.0f) + f, (this.A / 2.0f) + f2);
                    z3 = true;
                } else {
                    z3 = false;
                }
                f11 = this.A / 2.0f;
                if (j() > f6 || this.p) {
                    z4 = z3;
                    f12 = 2.0f;
                    f13 = 20.0f;
                } else {
                    f12 = 2.0f;
                    wjb wjbVar3 = wjbVar;
                    Paint U0 = bkb.U0("paintChatActionBackground", wjbVar3);
                    f13 = 20.0f;
                    Paint U02 = bkb.U0("paintChatActionBackgroundDarken", wjbVar3);
                    z4 = z3;
                    int alpha = U0.getAlpha();
                    int alpha2 = U02.getAlpha();
                    U0.setAlpha((int) (alpha * f4 * j()));
                    U02.setAlpha((int) (alpha2 * f4 * j()));
                    g(canvas, rectF, f11, U0);
                    if (wjbVar3 == null ? bkb.b1() : wjbVar3.g()) {
                        g(canvas, rectF, f11, U02);
                    }
                    U0.setAlpha(alpha);
                    U02.setAlpha(alpha2);
                }
                if (z && j() < f10) {
                    view2 = view;
                    if ((view2 instanceof gb2) && (O1 = ((gb2) view2).O1(false)) != null && !this.R) {
                        canvas.drawRoundRect(rectF, f11, f11, O1.c);
                    }
                }
                if (z7) {
                    rectF.right += gl.L(f9);
                    canvas.saveLayerAlpha(rectF, kk7.d4, 31);
                    rectF.right -= gl.L(f9);
                }
                if (this.Y != null) {
                    e66.e(8200);
                }
                g(canvas, rectF, f11, paint2);
                if (this.R && h()) {
                    if (z7) {
                        paint = i19.T;
                        paint.setColor(this.O);
                        paint.setAlpha((int) (paint.getAlpha() * f4));
                    } else {
                        paint = i19.U;
                    }
                    canvas.drawCircle(rectF.right - gl.L(8.4f), rectF.centerY(), gl.L(2.66f), paint);
                }
                if (z7) {
                    canvas.restore();
                }
                imageReceiver2 = imageReceiver;
                if (imageReceiver2 != null) {
                    if (z6) {
                        L = gl.L(22.0f);
                        L2 = gl.L(f9);
                    } else if (vlVar != null) {
                        L = gl.L(24.0f);
                        L2 = gl.L(6.0f);
                        imageReceiver2.q0(gl.L(6.0f));
                    } else {
                        L = gl.L(f13);
                        L2 = gl.L(f8);
                        imageReceiver2.q0(0);
                    }
                    int i2 = (int) ((this.A - L) / f12);
                    if (this.R) {
                        L2 -= gl.L(f12);
                    }
                    int i3 = ((int) f) + L2;
                    int i4 = ((int) f2) + i2;
                    rect.set(i3, i4, i3 + L, L + i4);
                    vl vlVar2 = this.C;
                    if (vlVar2 == null || (imageReceiver3 = vlVar2.k) == null) {
                        imageReceiver3 = this.B;
                    }
                    if (imageReceiver3 != null && rect != null) {
                        imageReceiver3.j0(rect);
                    }
                    vl vlVar3 = this.C;
                    if (vlVar3 != null && this.D != this.M) {
                        int i5 = this.M;
                        this.D = i5;
                        vlVar3.setColorFilter(new PorterDuffColorFilter(i5, PorterDuff.Mode.SRC_IN));
                    }
                    if (!this.k) {
                        il5Var = null;
                        f18 = f6;
                    } else if (this.l || this.i > 1 || !m() || !this.P) {
                        ImageReceiver k = k();
                        if (k != null) {
                            boolean z8 = k.y() == null || !k.y().p();
                            if (f4 != f10) {
                                k.setAlpha(f4);
                                if (f4 <= f6) {
                                    k.K();
                                    n();
                                }
                            } else if (k.y() != null && !k.y().l0) {
                                float alpha3 = k.getAlpha() - 0.08f;
                                if (alpha3 <= f6) {
                                    k.K();
                                    n();
                                } else {
                                    k.setAlpha(alpha3);
                                }
                                this.V.invalidate();
                                z5 = true;
                                float f20 = imageReceiver3.L0 - (imageReceiver3.N0 / f12);
                                float f21 = imageReceiver3.M0 - (imageReceiver3.O0 / f12);
                                float floor = (int) Math.floor(f20);
                                float floor2 = (int) Math.floor(f21);
                                k.i0(floor, floor2, imageReceiver3.N0 * f12, imageReceiver3.O0 * f12);
                                canvas.save();
                                canvas.translate(f20 - floor, f21 - floor2);
                                il5Var2 = null;
                                k.h(canvas, null);
                                canvas.restore();
                            }
                            z5 = z8;
                            float f202 = imageReceiver3.L0 - (imageReceiver3.N0 / f12);
                            float f212 = imageReceiver3.M0 - (imageReceiver3.O0 / f12);
                            float floor3 = (int) Math.floor(f202);
                            float floor22 = (int) Math.floor(f212);
                            k.i0(floor3, floor22, imageReceiver3.N0 * f12, imageReceiver3.O0 * f12);
                            canvas.save();
                            canvas.translate(f202 - floor3, f212 - floor22);
                            il5Var2 = null;
                            k.h(canvas, null);
                            canvas.restore();
                        } else {
                            il5Var2 = null;
                            z5 = true;
                        }
                        if (z5) {
                            imageReceiver3.h(canvas, il5Var2);
                        }
                        this.m = true;
                    } else {
                        f18 = f6;
                        il5Var = null;
                    }
                    imageReceiver3.setAlpha(f18);
                    imageReceiver3.h(canvas, il5Var);
                    this.m = false;
                }
                if (gnVar2 != null || gnVar2.i() <= 0.0f) {
                    f14 = 0.0f;
                } else {
                    canvas.save();
                    if (!this.t || h()) {
                        f17 = this.t ? 9 : 8;
                    } else {
                        f17 = 10.0f;
                    }
                    canvas.translate(gl.L(f17) + f + gl.L(f13) + gl.L(f12), f2);
                    gnVar2.setBounds(0, 0, this.z, this.A);
                    gnVar2.draw(canvas);
                    gnVar2.C = (int) (f4 * 255.0f);
                    canvas.restore();
                    f14 = gnVar2.c() + (gnVar2.i() * gl.L(f9));
                }
                if (f5 <= 0.0f && !this.R && gnVar != null && this.S == null) {
                    float max = Math.max(0.0f, (gl.L(12.0f) - gnVar.c()) / f12);
                    canvas.save();
                    if (!this.t || h()) {
                        f16 = this.t ? 9 : 8;
                    } else {
                        f16 = 10.0f;
                    }
                    canvas.translate(gl.L(f16) + f + gl.L(f13) + gl.L(vlVar == null ? f12 : 5.0f) + max, f2 - gl.L(f10));
                    gnVar.setBounds(0, 0, this.z, this.A);
                    gnVar.draw(canvas);
                    gnVar.C = (int) (255.0f * f4);
                    canvas.restore();
                } else if (jx2Var != null && e()) {
                    canvas.save();
                    if (this.t || h()) {
                        f15 = this.t ? 9 : 8;
                    } else {
                        f15 = 10.0f;
                    }
                    canvas.translate(gl.L(f15) + f + gl.L(f13) + gl.L(vlVar == null ? f12 : 5.0f) + f14 + (!z6 ? -gl.L(f10) : 0), f2);
                    jx2Var.a(canvas);
                    canvas.restore();
                }
                if (!this.R && this.S != null) {
                    canvas.save();
                    canvas.translate(f + gl.L(10.0f) + gl.L(f13) + gl.L(f12), f2);
                    gc0Var = this.S;
                    gc0Var.u = f4;
                    if (gc0Var.w && gc0Var.e != f3) {
                        gc0Var.e = f3;
                        if (f3 == f10) {
                            gc0Var.k();
                            gc0Var.w = false;
                        }
                    }
                    this.S.g(canvas);
                    canvas.restore();
                }
                if (z4) {
                    return;
                }
                canvas.restore();
                return;
            }
        } else {
            i = (int) (gnVar.c() + gl.L(vlVar != null ? 6.0f : 4.0f) + gl.L(20.0f) + gl.L(8.0f) + gl.L(8.0f));
            gnVar.u(this.M);
            f8 = 8.0f;
            f7 = 1.0f;
        }
        f9 = 4.0f;
        rectF = gl.P;
        float f192 = i;
        f10 = f7;
        rectF.set(f, f2, f + f192, this.A + f2);
        if (a == f10) {
        }
        f11 = this.A / 2.0f;
        if (j() > f6) {
        }
        z4 = z3;
        f12 = 2.0f;
        f13 = 20.0f;
        if (z) {
            view2 = view;
            if (view2 instanceof gb2) {
                canvas.drawRoundRect(rectF, f11, f11, O1.c);
            }
        }
        if (z7) {
        }
        if (this.Y != null) {
        }
        g(canvas, rectF, f11, paint2);
        if (this.R) {
            if (z7) {
            }
            canvas.drawCircle(rectF.right - gl.L(8.4f), rectF.centerY(), gl.L(2.66f), paint);
        }
        if (z7) {
        }
        imageReceiver2 = imageReceiver;
        if (imageReceiver2 != null) {
        }
        if (gnVar2 != null) {
        }
        f14 = 0.0f;
        if (f5 <= 0.0f) {
        }
        if (jx2Var != null) {
            canvas.save();
            if (this.t) {
            }
            f15 = this.t ? 9 : 8;
            canvas.translate(gl.L(f15) + f + gl.L(f13) + gl.L(vlVar == null ? f12 : 5.0f) + f14 + (!z6 ? -gl.L(f10) : 0), f2);
            jx2Var.a(canvas);
            canvas.restore();
        }
        if (!this.R) {
            canvas.save();
            canvas.translate(f + gl.L(10.0f) + gl.L(f13) + gl.L(f12), f2);
            gc0Var = this.S;
            gc0Var.u = f4;
            if (gc0Var.w) {
                gc0Var.e = f3;
                if (f3 == f10) {
                }
            }
            this.S.g(canvas);
            canvas.restore();
        }
        if (z4) {
        }
    }

    public boolean e() {
        int i = this.v;
        return ((i == 0 || (this.R && !this.t && i == 1)) && this.E.l == 1.0f) ? false : true;
    }

    public final boolean f(Canvas canvas, float f, float f2) {
        vva vvaVar = this.Y;
        if (vvaVar == null) {
            return false;
        }
        RectF rectF = vvaVar.c;
        if (!e66.e(8200) || !e66.e(131072)) {
            return false;
        }
        RectF rectF2 = gl.P;
        rectF2.set(f, f2, this.z + f, this.A + f2);
        float f3 = this.A / 2.0f;
        rectF.set(rectF2);
        rectF.inset(-gl.L(4.0f), -gl.L(4.0f));
        vvaVar.g(rectF);
        boolean d = vvaVar.d();
        vvaVar.a(canvas, bm2.f(j(), bm2.o(this.I, kk7.d4), bm2.f(0.4f, this.L, bm2.o(this.I, kk7.d4))));
        if (this.P) {
            Path path = this.c0;
            path.rewind();
            path.addRoundRect(rectF2, f3, f3, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            vvaVar.a(canvas, this.J);
            canvas.restore();
        }
        return d;
    }

    public final void g(Canvas canvas, RectF rectF, float f, Paint paint) {
        if (!this.R) {
            canvas.drawRoundRect(rectF, f, f, paint);
            return;
        }
        RectF rectF2 = this.a0;
        float f2 = rectF2.left;
        float f3 = rectF.left;
        Path path = this.c0;
        if (f2 != f3 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
            rectF2.set(rectF);
            i19.h(rectF2, this.b0, path);
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
            Collections.sort(arrayList, i19.Z);
            if (this.S == null) {
                gc0 gc0Var = new gc0(this.V, false);
                this.S = gc0Var;
                gc0Var.v = (short) 250;
                s33 s33Var = la2.V;
                gc0Var.s = gl.L(20.0f);
                this.S.p = gl.L(100.0f);
                gc0 gc0Var2 = this.S;
                gc0Var2.o = this.A;
                gc0Var2.h(gl.L(22.0f));
            }
            if (this.d0) {
                this.S.e();
            }
            for (int i = 0; i < arrayList.size() && i != 3; i++) {
                this.S.j(i, this.U, (TLObject) arrayList.get(i));
            }
            this.S.a(false, true);
        }
    }

    public final void p() {
        ImageReceiver imageReceiver;
        vl vlVar = this.C;
        if (vlVar == null || (imageReceiver = vlVar.k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            oy8 y = imageReceiver.y();
            if (y != null) {
                y.C(true);
                return;
            }
            km m = imageReceiver.m();
            if (m != null) {
                m.start();
            }
        }
    }

    public final void q() {
        ImageReceiver imageReceiver;
        vl vlVar = this.C;
        if (vlVar == null || (imageReceiver = vlVar.k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            oy8 y = imageReceiver.y();
            if (y != null) {
                y.stop();
                return;
            }
            km m = imageReceiver.m();
            if (m != null) {
                m.stop();
            }
        }
    }

    public void r(float f) {
        this.M = bm2.f(f, this.h, bm2.f(j(), this.J, this.L));
        int f2 = bm2.f(f, this.f, bm2.f(j(), this.I, this.K));
        this.N = f2;
        this.O = bm2.f(f, this.g, gl.B(f2) > 0.8f ? 0 : 1526726655);
    }

    public void n() {
    }
}
