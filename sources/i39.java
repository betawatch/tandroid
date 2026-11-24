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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class i39 {
    public int A;
    public final ImageReceiver B;
    public final vm C;
    public int D;
    public final ty2 E;
    public final ho F;
    public final ho G;
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
    public gd0 S;
    public ArrayList T;
    public final int U;
    public final View V;
    public final ylb W;
    public final u51 X;
    public final yxa Y;
    public final p09 Z;
    public final TLRPC.ReactionCount a;
    public byte b;
    public int c;
    public int d;
    public boolean d0;
    public int e;
    public ImageReceiver e0;
    public int f;
    public vm f0;
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
    public final k39 r;
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

    public i39(i39 i39Var, int i, View view, TLRPC.ReactionCount reactionCount, boolean z, ylb ylbVar) {
        yxa yxaVar;
        p09 p09Var;
        jo joVar = new jo(this, (byte) 8);
        this.U = i;
        this.V = view;
        this.X = new u51(view);
        this.W = ylbVar;
        this.R = z;
        if (i39Var != null) {
            this.E = i39Var.E;
        }
        if (this.B == null) {
            this.B = new ImageReceiver(null);
        }
        if (this.E == null) {
            this.E = new ty2(view, false, null);
        }
        if (this.F == null) {
            ho hoVar = new ho(true, true, true);
            this.F = hoVar;
            hoVar.L = true;
            hoVar.n(0.4f, 320L, d53.h);
            hoVar.w(gm.L(13.0f));
            hoVar.setCallback(joVar);
            hoVar.x(gm.o());
            hoVar.N = gm.q.x;
        }
        if (this.G == null) {
            ho hoVar2 = new ho(false, false, false, true, false);
            this.G = hoVar2;
            hoVar2.w(gm.L(12.0f));
            hoVar2.setCallback(joVar);
            hoVar2.x(gm.o());
            hoVar2.N = gm.q.x;
            hoVar2.B = 0.35f;
        }
        this.a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.q = reaction;
        k39 d = k39.d(reaction);
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
                zo4.k("unsupported");
                throw null;
            }
            this.n = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        }
        this.B.p0(view);
        this.P = reactionCount.chosen;
        ty2 ty2Var = this.E;
        ty2Var.F = false;
        ty2Var.a = true;
        if (reaction != null) {
            if (d.a) {
                this.l = true;
                if (e86.e(8200)) {
                    if (i39Var == null || (p09Var = i39Var.Z) == null) {
                        p09Var = new p09(R.raw.star_reaction_click, gm.L(40.0f), gm.L(40.0f));
                        this.Z = p09Var;
                    } else {
                        this.Z = p09Var;
                    }
                    this.B.g0(p09Var);
                } else {
                    this.B.g0(a.b.getResources().getDrawable(R.drawable.star_reaction).mutate());
                }
                if (i39Var == null || (yxaVar = i39Var.Y) == null) {
                    yxaVar = new yxa(1, gda.o() == 2 ? 18 : 8);
                }
                this.Y = yxaVar;
            } else if (d.f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hs6.d0(i).r.get(d.f);
                if (tL_availableReaction != null) {
                    this.B.d0(gn5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", eq3.f(tL_availableReaction.static_icon, cmb.Z6, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            } else if (d.g != 0) {
                this.C = new vm(i(), i, d.g);
            }
        }
        this.E.d(gm.L(26.0f), gm.L(100.0f));
        this.E.e = l39.V;
        if (z) {
            this.u = oc7.r1(i).I1(reaction);
            this.t = !TextUtils.isEmpty(r1);
        }
        boolean z2 = this.t;
        ho hoVar3 = this.F;
        if (z2) {
            hoVar3.t(gw3.m(this.u, hoVar3.a.getFontMetricsInt(), false, null, 0), !jb6.a0, true);
            boolean z3 = this instanceof vu9;
            ty2 ty2Var2 = this.E;
            if (z3) {
                ty2Var2.c(this.v, false);
            } else {
                ty2Var2.c(0, false);
            }
        } else {
            if (hoVar3 != null) {
                hoVar3.t("", false, true);
            }
            this.E.c(this.v, false);
        }
        ty2 ty2Var3 = this.E;
        ty2Var3.H = (byte) 2;
        ty2Var3.z = 3;
    }

    public final void a() {
        this.d0 = true;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.I();
        }
        gd0 gd0Var = this.S;
        if (gd0Var != null) {
            gd0Var.e();
        }
        vm vmVar = this.C;
        if (vmVar != null) {
            vmVar.b(this.V);
        }
    }

    public final void b() {
        this.d0 = false;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.K();
        }
        gd0 gd0Var = this.S;
        if (gd0Var != null) {
            gd0Var.f();
        }
        vm vmVar = this.C;
        if (vmVar != null) {
            vmVar.o(this.V);
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
        ty2 ty2Var;
        float f6;
        ImageReceiver imageReceiver;
        ho hoVar;
        ylb ylbVar;
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
        gd0 gd0Var;
        float f16;
        float f17;
        int L;
        int L2;
        ImageReceiver imageReceiver3;
        in5 in5Var;
        float f18;
        in5 in5Var2;
        boolean z5;
        Paint paint;
        View view2;
        m37 O1;
        int v0;
        ty2 ty2Var2 = this.E;
        View view3 = this.V;
        boolean z6 = this.l;
        Rect rect = this.s;
        ho hoVar2 = this.F;
        ho hoVar3 = this.G;
        ylb ylbVar2 = this.W;
        vm vmVar = this.C;
        ImageReceiver imageReceiver4 = vmVar != null ? vmVar.k : this.B;
        if (this.o) {
            if (z6) {
                this.I = -1529086;
                this.J = -1;
                this.L = -1;
                this.K = -1529086;
            } else {
                this.I = cmb.v0(l() ? cmb.Ic : cmb.sk, ylbVar2);
                this.J = cmb.v0(l() ? cmb.wk : cmb.vk, ylbVar2);
                if (view3 instanceof cm1) {
                    this.L = cmb.v0(cmb.yk, ylbVar2);
                    this.K = cmb.v0(cmb.xk, ylbVar2);
                } else {
                    this.L = cmb.v0(l() ? cmb.Ic : cmb.sk, ylbVar2);
                    this.K = cmb.v0(l() ? cmb.qb : cmb.qa, ylbVar2);
                }
            }
        } else if (z6) {
            this.J = -1529086;
            this.I = 1088989954;
            this.L = -1;
            this.K = 0;
        } else {
            this.J = cmb.v0(l() ? cmb.tk : cmb.uk, ylbVar2);
            int v02 = cmb.v0(l() ? cmb.Ic : cmb.sk, ylbVar2);
            this.I = v02;
            this.I = on2.p(v02, (int) (Color.alpha(v02) * 0.156f));
            this.L = cmb.v0(cmb.Yc, ylbVar2);
            this.K = 0;
        }
        if (!z6 && (view3 instanceof rc2) && ((rc2) view3).w2()) {
            if (this.o) {
                this.I = cmb.v0(cmb.ib, ylbVar2);
                v0 = cmb.v0(cmb.jb, ylbVar2);
                this.J = v0;
            } else {
                this.I = on2.l(cmb.v0(cmb.gb, ylbVar2), l() ? on2.l(cmb.v0(cmb.Ka, ylbVar2), cmb.v0(cmb.ta, ylbVar2)) : cmb.v0(cmb.ta, ylbVar2));
                v0 = cmb.v0(cmb.hb, ylbVar2);
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
        TextPaint textPaint = l39.V;
        textPaint.setColor(this.M);
        if (hoVar2 != null) {
            hoVar2.u(this.M);
        }
        Paint paint2 = l39.S;
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
            ty2Var = ty2Var2;
            f6 = 0.0f;
            imageReceiver = imageReceiver4;
            hoVar = hoVar3;
            ylbVar = ylbVar2;
            view = view3;
        } else {
            if (z2) {
                f6 = 0.0f;
                hoVar = hoVar3;
                ty2Var = ty2Var2;
                ylbVar = ylbVar2;
                imageReceiver = imageReceiver4;
                hoVar.m(0.6f, 650L, 1.6f, d53.k);
                hoVar.t(gm.o0(this.v, 0), false, true);
                view = view3;
                hoVar.t(jb6.E(this.v, ','), true, true);
            } else {
                ty2Var = ty2Var2;
                f6 = 0.0f;
                imageReceiver = imageReceiver4;
                hoVar = hoVar3;
                ylbVar = ylbVar2;
                view = view3;
                hoVar.m(0.6f, 320L, 1.6f, d53.h);
                hoVar.t(gm.o0(this.v, 0), true, true);
            }
            this.H = z2;
        }
        float a = this.X.a(0.1f);
        int i = this.z;
        if (f5 <= 0.0f || this.R || hoVar == null || this.S != null) {
            f7 = 1.0f;
            f8 = 8.0f;
            if (f3 != 1.0f) {
                f9 = 4.0f;
                if (this.b == 3) {
                    i = (int) td4.A(1.0f, f3, this.e, i * f3);
                }
                rectF = gm.P;
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
                    ylb ylbVar3 = ylbVar;
                    Paint U0 = cmb.U0("paintChatActionBackground", ylbVar3);
                    f13 = 20.0f;
                    Paint U02 = cmb.U0("paintChatActionBackgroundDarken", ylbVar3);
                    z4 = z3;
                    int alpha = U0.getAlpha();
                    int alpha2 = U02.getAlpha();
                    U0.setAlpha((int) (alpha * f4 * j()));
                    U02.setAlpha((int) (alpha2 * f4 * j()));
                    g(canvas, rectF, f11, U0);
                    if (ylbVar3 == null ? cmb.b1() : ylbVar3.g()) {
                        g(canvas, rectF, f11, U02);
                    }
                    U0.setAlpha(alpha);
                    U02.setAlpha(alpha2);
                }
                if (z && j() < f10) {
                    view2 = view;
                    if ((view2 instanceof rc2) && (O1 = ((rc2) view2).O1(false)) != null && !this.R) {
                        canvas.drawRoundRect(rectF, f11, f11, O1.c);
                    }
                }
                if (z7) {
                    rectF.right += gm.L(f9);
                    canvas.saveLayerAlpha(rectF, nm7.d4, 31);
                    rectF.right -= gm.L(f9);
                }
                if (this.Y != null) {
                    e86.e(8200);
                }
                g(canvas, rectF, f11, paint2);
                if (this.R && h()) {
                    if (z7) {
                        paint = l39.T;
                        paint.setColor(this.O);
                        paint.setAlpha((int) (paint.getAlpha() * f4));
                    } else {
                        paint = l39.U;
                    }
                    canvas.drawCircle(rectF.right - gm.L(8.4f), rectF.centerY(), gm.L(2.66f), paint);
                }
                if (z7) {
                    canvas.restore();
                }
                imageReceiver2 = imageReceiver;
                if (imageReceiver2 != null) {
                    if (z6) {
                        L = gm.L(22.0f);
                        L2 = gm.L(f9);
                    } else if (vmVar != null) {
                        L = gm.L(24.0f);
                        L2 = gm.L(6.0f);
                        imageReceiver2.q0(gm.L(6.0f));
                    } else {
                        L = gm.L(f13);
                        L2 = gm.L(f8);
                        imageReceiver2.q0(0);
                    }
                    int i2 = (int) ((this.A - L) / f12);
                    if (this.R) {
                        L2 -= gm.L(f12);
                    }
                    int i3 = ((int) f) + L2;
                    int i4 = ((int) f2) + i2;
                    rect.set(i3, i4, i3 + L, L + i4);
                    vm vmVar2 = this.C;
                    if (vmVar2 == null || (imageReceiver3 = vmVar2.k) == null) {
                        imageReceiver3 = this.B;
                    }
                    if (imageReceiver3 != null && rect != null) {
                        imageReceiver3.j0(rect);
                    }
                    vm vmVar3 = this.C;
                    if (vmVar3 != null && this.D != this.M) {
                        int i5 = this.M;
                        this.D = i5;
                        vmVar3.setColorFilter(new PorterDuffColorFilter(i5, PorterDuff.Mode.SRC_IN));
                    }
                    if (!this.k) {
                        in5Var = null;
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
                                in5Var2 = null;
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
                            in5Var2 = null;
                            k.h(canvas, null);
                            canvas.restore();
                        } else {
                            in5Var2 = null;
                            z5 = true;
                        }
                        if (z5) {
                            imageReceiver3.h(canvas, in5Var2);
                        }
                        this.m = true;
                    } else {
                        f18 = f6;
                        in5Var = null;
                    }
                    imageReceiver3.setAlpha(f18);
                    imageReceiver3.h(canvas, in5Var);
                    this.m = false;
                }
                if (hoVar2 != null || hoVar2.i() <= 0.0f) {
                    f14 = 0.0f;
                } else {
                    canvas.save();
                    if (!this.t || h()) {
                        f17 = this.t ? 9 : 8;
                    } else {
                        f17 = 10.0f;
                    }
                    canvas.translate(gm.L(f17) + f + gm.L(f13) + gm.L(f12), f2);
                    hoVar2.setBounds(0, 0, this.z, this.A);
                    hoVar2.draw(canvas);
                    hoVar2.C = (int) (f4 * 255.0f);
                    canvas.restore();
                    f14 = hoVar2.c() + (hoVar2.i() * gm.L(f9));
                }
                if (f5 <= 0.0f && !this.R && hoVar != null && this.S == null) {
                    float max = Math.max(0.0f, (gm.L(12.0f) - hoVar.c()) / f12);
                    canvas.save();
                    if (!this.t || h()) {
                        f16 = this.t ? 9 : 8;
                    } else {
                        f16 = 10.0f;
                    }
                    canvas.translate(gm.L(f16) + f + gm.L(f13) + gm.L(vmVar == null ? f12 : 5.0f) + max, f2 - gm.L(f10));
                    hoVar.setBounds(0, 0, this.z, this.A);
                    hoVar.draw(canvas);
                    hoVar.C = (int) (255.0f * f4);
                    canvas.restore();
                } else if (ty2Var != null && e()) {
                    canvas.save();
                    if (this.t || h()) {
                        f15 = this.t ? 9 : 8;
                    } else {
                        f15 = 10.0f;
                    }
                    canvas.translate(gm.L(f15) + f + gm.L(f13) + gm.L(vmVar == null ? f12 : 5.0f) + f14 + (!z6 ? -gm.L(f10) : 0), f2);
                    ty2Var.a(canvas);
                    canvas.restore();
                }
                if (!this.R && this.S != null) {
                    canvas.save();
                    canvas.translate(f + gm.L(10.0f) + gm.L(f13) + gm.L(f12), f2);
                    gd0Var = this.S;
                    gd0Var.u = f4;
                    if (gd0Var.w && gd0Var.e != f3) {
                        gd0Var.e = f3;
                        if (f3 == f10) {
                            gd0Var.k();
                            gd0Var.w = false;
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
            i = (int) (hoVar.c() + gm.L(vmVar != null ? 6.0f : 4.0f) + gm.L(20.0f) + gm.L(8.0f) + gm.L(8.0f));
            hoVar.u(this.M);
            f8 = 8.0f;
            f7 = 1.0f;
        }
        f9 = 4.0f;
        rectF = gm.P;
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
            if (view2 instanceof rc2) {
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
            canvas.drawCircle(rectF.right - gm.L(8.4f), rectF.centerY(), gm.L(2.66f), paint);
        }
        if (z7) {
        }
        imageReceiver2 = imageReceiver;
        if (imageReceiver2 != null) {
        }
        if (hoVar2 != null) {
        }
        f14 = 0.0f;
        if (f5 <= 0.0f) {
        }
        if (ty2Var != null) {
            canvas.save();
            if (this.t) {
            }
            f15 = this.t ? 9 : 8;
            canvas.translate(gm.L(f15) + f + gm.L(f13) + gm.L(vmVar == null ? f12 : 5.0f) + f14 + (!z6 ? -gm.L(f10) : 0), f2);
            ty2Var.a(canvas);
            canvas.restore();
        }
        if (!this.R) {
            canvas.save();
            canvas.translate(f + gm.L(10.0f) + gm.L(f13) + gm.L(f12), f2);
            gd0Var = this.S;
            gd0Var.u = f4;
            if (gd0Var.w) {
                gd0Var.e = f3;
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
        yxa yxaVar = this.Y;
        if (yxaVar == null) {
            return false;
        }
        RectF rectF = yxaVar.c;
        if (!e86.e(8200) || !e86.e(131072)) {
            return false;
        }
        RectF rectF2 = gm.P;
        rectF2.set(f, f2, this.z + f, this.A + f2);
        float f3 = this.A / 2.0f;
        rectF.set(rectF2);
        rectF.inset(-gm.L(4.0f), -gm.L(4.0f));
        yxaVar.g(rectF);
        boolean d = yxaVar.d();
        yxaVar.a(canvas, on2.f(j(), on2.p(this.I, nm7.d4), on2.f(0.4f, this.L, on2.p(this.I, nm7.d4))));
        if (this.P) {
            Path path = this.c0;
            path.rewind();
            path.addRoundRect(rectF2, f3, f3, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            yxaVar.a(canvas, this.J);
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
            l39.h(rectF2, this.b0, path);
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
            Collections.sort(arrayList, l39.Z);
            if (this.S == null) {
                gd0 gd0Var = new gd0(this.V, false);
                this.S = gd0Var;
                gd0Var.v = (short) 250;
                d53 d53Var = wb2.V;
                gd0Var.s = gm.L(20.0f);
                this.S.p = gm.L(100.0f);
                gd0 gd0Var2 = this.S;
                gd0Var2.o = this.A;
                gd0Var2.h(gm.L(22.0f));
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
        vm vmVar = this.C;
        if (vmVar == null || (imageReceiver = vmVar.k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            p09 y = imageReceiver.y();
            if (y != null) {
                y.C(true);
                return;
            }
            kn m = imageReceiver.m();
            if (m != null) {
                m.start();
            }
        }
    }

    public final void q() {
        ImageReceiver imageReceiver;
        vm vmVar = this.C;
        if (vmVar == null || (imageReceiver = vmVar.k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            p09 y = imageReceiver.y();
            if (y != null) {
                y.stop();
                return;
            }
            kn m = imageReceiver.m();
            if (m != null) {
                m.stop();
            }
        }
    }

    public void r(float f) {
        this.M = on2.f(f, this.h, on2.f(j(), this.J, this.L));
        int f2 = on2.f(f, this.f, on2.f(j(), this.I, this.K));
        this.N = f2;
        this.O = on2.f(f, this.g, gm.B(f2) > 0.8f ? 0 : 1526726655);
    }

    public void n() {
    }
}
