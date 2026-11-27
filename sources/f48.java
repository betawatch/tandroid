// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class f48 extends FrameLayout implements snb {
    public kc7 E;
    public byte F;
    public final RectF G;
    public final vnb a;
    public final int b;
    public final boolean c;
    public final ImageReceiver d;
    public final rb0 e;
    public final ns1 f;
    public final ema h;
    public boolean n;
    public final ul r;
    public final ul s;
    public final ul w;
    public final r6b x;
    public final mm y;

    public f48(int i, long j, vnb vnbVar, Context context) {
        super(context);
        CharSequence r;
        long c;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        rb0 rb0Var = new rb0((vnb) null);
        this.e = rb0Var;
        this.w = new ul(hl.L(20.0f), 13, this, false);
        this.x = new r6b(this);
        this.y = new mm(320L, this, k43.h);
        this.G = new RectF();
        this.b = i;
        this.a = vnbVar;
        long j2 = 0;
        boolean z = j < 0;
        this.c = z;
        ns1 ns1Var = new ns1((byte) 2, context, this);
        this.f = ns1Var;
        this.r = new ul(hl.L(17.0f), ns1Var);
        this.s = new ul(hl.L(24.0f), ns1Var);
        ns1Var.setLeftDrawableOutside(true);
        ns1Var.setRightDrawableOutside(true);
        ns1Var.setTextColor(-1);
        ns1Var.setTextSize(20);
        ns1Var.setTypeface(hl.o());
        ns1Var.setWidthWrapContent(true);
        addView(ns1Var, tre.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
        ema emaVar = new ema(context);
        this.h = emaVar;
        emaVar.setTextSize(14);
        emaVar.setTextColor(-2130706433);
        emaVar.setGravity(1);
        addView(emaVar, tre.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
        imageReceiver.q0(hl.L(96.0f));
        if (z) {
            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-j));
            r = M0 == null ? "" : M0.title;
            rb0Var.p(M0);
            imageReceiver.U(M0, rb0Var, null);
            c = wf3.c(M0);
            if (M0 != null) {
                j2 = wf3.f(M0.emoji_status);
            }
        } else {
            TLRPC.User f = yac.h(i).f();
            r = lbc.r(f);
            rb0Var.q(f);
            imageReceiver.U(f, rb0Var, null);
            c = wf3.c(f);
            if (f != null) {
                j2 = wf3.f(f.emoji_status);
            }
        }
        try {
            r = pv3.m(r, null, false, null, 0);
        } catch (Exception unused) {
        }
        this.f.l(r, false);
        this.r.j(c, false);
        this.f.setLeftDrawable(this.r);
        this.s.j(j2, false);
        this.f.i(this.s);
        if (this.c) {
            long j3 = -j;
            TLRPC.Chat M02 = uc7.s1(i).M0(Long.valueOf(j3));
            TLRPC.ChatFull N0 = uc7.s1(i).N0(j3);
            if (N0 != null && N0.participants_count > 0) {
                boolean V = xc2.V(M02);
                ema emaVar2 = this.h;
                int i2 = N0.participants_count;
                if (V) {
                    emaVar2.l(ob6.H(',', "Subscribers", i2), false);
                } else {
                    emaVar2.l(ob6.H(',', "Members", i2), false);
                }
            } else if (M02 == null || M02.participants_count <= 0) {
                boolean t0 = xc2.t0(M02);
                boolean V2 = xc2.V(M02);
                ema emaVar3 = this.h;
                if (V2) {
                    emaVar3.l(ob6.M0(t0 ? 2131752288 : 2131752299, null).toLowerCase(), false);
                } else {
                    emaVar3.l(ob6.M0(t0 ? 2131748392 : 2131748395, null).toLowerCase(), false);
                }
            } else {
                boolean V3 = xc2.V(M02);
                ema emaVar4 = this.h;
                int i3 = M02.participants_count;
                if (V3) {
                    emaVar4.l(ob6.H(',', "Subscribers", i3), false);
                } else {
                    emaVar4.l(ob6.H(',', "Members", i3), false);
                }
            }
        } else {
            this.h.l(ob6.M0(2131747553, null), false);
        }
        setWillNotDraw(false);
    }

    public final void a(int i) {
        int v0;
        int v02;
        vnb vnbVar = this.a;
        if (i >= 14) {
            lc7 lc7Var = uc7.s1(yac.t0).F3;
            kc7 d = lc7Var != null ? lc7Var.d(i) : null;
            if (d != null) {
                int f = d.f();
                v0 = aob.v0(aob.p8[rb0.e(f)], vnbVar);
                v02 = aob.v0(aob.q8[rb0.e(f)], vnbVar);
            } else {
                long j = i;
                v0 = aob.v0(aob.p8[rb0.d(j)], vnbVar);
                v02 = aob.v0(aob.q8[rb0.d(j)], vnbVar);
            }
        } else {
            long j2 = i;
            v0 = aob.v0(aob.p8[rb0.d(j2)], vnbVar);
            v02 = aob.v0(aob.q8[rb0.d(j2)], vnbVar);
        }
        this.e.h(v0, v02);
        invalidate();
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.s8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.B8));
        hashSet.add(Integer.valueOf(aob.n6));
        hashSet.add(Integer.valueOf(aob.qi));
        hashSet.add(Integer.valueOf(aob.h8));
    }

    public void b(int i, boolean z) {
        lc7 lc7Var = uc7.s1(this.b).G3;
        c(lc7Var == null ? null : lc7Var.d(i), z);
    }

    public final void c(kc7 kc7Var, boolean z) {
        this.E = kc7Var;
        vnb vnbVar = this.a;
        boolean a = vnbVar != null ? vnbVar.a() : aob.I.o();
        ns1 ns1Var = this.f;
        ema emaVar = this.h;
        ul ulVar = this.r;
        ul ulVar2 = this.s;
        ul ulVar3 = this.w;
        if (kc7Var != null) {
            int i = kc7Var.a;
            if (i != 0) {
                ulVar3.k(Integer.valueOf(i));
            } else {
                ulVar3.k(Integer.valueOf(h48.z0(kc7Var.c(a))));
            }
            ulVar2.k(Integer.valueOf(vm2.f(0.25f, kc7Var.m(aob.I.o()), -1)));
            ulVar.k(Integer.valueOf(vm2.f(0.25f, kc7Var.m(aob.I.o()), -1)));
            int f = vm2.f(0.5f, kc7Var.m(a), kc7Var.n(a));
            int i2 = aob.s8;
            if (aob.c1(aob.v0(i2, vnbVar))) {
                emaVar.setTextColor(aob.C(a, aob.v0(i2, vnbVar), f, aob.v0(aob.h8, vnbVar), f));
            } else {
                emaVar.setTextColor(f);
            }
            ns1Var.setTextColor(-1);
        } else {
            int i3 = aob.s8;
            if (hl.B(aob.v0(i3, vnbVar)) > 0.8f) {
                ulVar3.k(Integer.valueOf(aob.v0(aob.n6, vnbVar)));
            } else if (hl.B(aob.v0(i3, vnbVar)) < 0.2f) {
                ulVar3.k(Integer.valueOf(aob.p1(0.5f, aob.v0(aob.A8, vnbVar))));
            } else {
                ulVar3.k(Integer.valueOf(h48.z0(aob.v0(i3, vnbVar))));
            }
            int i4 = aob.qi;
            ulVar2.k(Integer.valueOf(aob.v0(i4, vnbVar)));
            ulVar.k(Integer.valueOf(aob.v0(i4, vnbVar)));
            emaVar.setTextColor(aob.v0(aob.B8, vnbVar));
            ns1Var.setTextColor(aob.v0(aob.A8, vnbVar));
        }
        this.F = (byte) 0;
        this.x.c(kc7Var, z);
        invalidate();
    }

    public final void d(long j, boolean z, boolean z2) {
        ul ulVar = this.w;
        if (j == 0) {
            ulVar.g(null, z2);
        } else {
            ulVar.j(j, z2);
        }
        vnb vnbVar = this.a;
        boolean a = vnbVar != null ? vnbVar.a() : aob.I.o();
        kc7 kc7Var = this.E;
        if (kc7Var != null) {
            int i = kc7Var.a;
            if (i != 0) {
                ulVar.k(Integer.valueOf(i));
            } else {
                ulVar.k(Integer.valueOf(h48.z0(kc7Var.c(a))));
            }
        } else {
            int i2 = aob.s8;
            if (hl.B(aob.v0(i2, vnbVar)) > 0.8f) {
                ulVar.k(Integer.valueOf(aob.v0(aob.n6, vnbVar)));
            } else if (hl.B(aob.v0(i2, vnbVar)) < 0.2f) {
                ulVar.k(Integer.valueOf(aob.p1(0.5f, aob.w0(null, aob.A8, false))));
            } else {
                ulVar.k(Integer.valueOf(h48.z0(aob.w0(null, i2, false))));
            }
        }
        kc7 kc7Var2 = this.E;
        ul ulVar2 = this.s;
        if (kc7Var2 != null) {
            ulVar2.k(Integer.valueOf(vm2.f(0.5f, kc7Var2.e(1, vnbVar), this.E.e(this.E.o(a) ? 4 : 2, vnbVar))));
        } else {
            ulVar2.k(Integer.valueOf(aob.v0(aob.qi, vnbVar)));
        }
        this.F = (byte) 1;
        if (!z2) {
            this.y.a(z);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float height = getHeight() - hl.L(82.0f);
        RectF rectF = this.G;
        rectF.set((getWidth() - hl.L(86.0f)) / 2.0f, getHeight() - hl.L(168.0f), (hl.L(86.0f) + getWidth()) / 2.0f, height);
        xqa.c(canvas, this.w, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
        int L = hl.L(this.n ? 18.0f : 54.0f);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.q0(L);
        imageReceiver.k0(rectF);
        imageReceiver.h(canvas, null);
        float width = (rectF.width() / 2.0f) + hl.L(4.0f);
        float L2 = hl.L(this.n ? 22.0f : 58.0f);
        canvas.drawRoundRect(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width, L2, L2, this.x.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j, boolean z, boolean z2) {
        int j2;
        ul ulVar = this.s;
        ulVar.j(j, z2);
        ulVar.m(z, z2);
        vnb vnbVar = this.a;
        boolean a = vnbVar != null ? vnbVar.a() : aob.I.o();
        kc7 kc7Var = this.E;
        if (kc7Var != null) {
            int h = kc7Var.h(a);
            boolean o = this.E.o(a);
            kc7 kc7Var2 = this.E;
            if (o) {
                j2 = (a ? kc7Var2.h : kc7Var2.g)[4];
            } else {
                j2 = kc7Var2.j(a);
            }
            ulVar.k(Integer.valueOf(vm2.f(0.5f, h, j2)));
        } else {
            ulVar.k(Integer.valueOf(aob.v0(aob.qi, vnbVar)));
        }
        this.F = (byte) 2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w.a();
        this.d.I();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.w.b();
        this.d.K();
    }

    public void setForum(boolean z) {
        if (this.n != z) {
            invalidate();
        }
        this.n = z;
    }

    @Override // snb
    public final void updateColors() {
        ul ulVar;
        ul ulVar2;
        ns1 ns1Var;
        ema emaVar;
        int j;
        ul ulVar3 = this.w;
        if (ulVar3 == null || (ulVar = this.s) == null || (ulVar2 = this.r) == null || (ns1Var = this.f) == null || (emaVar = this.h) == null) {
            return;
        }
        vnb vnbVar = this.a;
        try {
            boolean a = vnbVar != null ? vnbVar.a() : aob.I.o();
            kc7 kc7Var = this.E;
            if (kc7Var != null) {
                int i = kc7Var.a;
                if (i != 0) {
                    ulVar3.k(Integer.valueOf(i));
                } else {
                    ulVar3.k(Integer.valueOf(h48.z0(kc7Var.c(a))));
                }
                ulVar2.k(Integer.valueOf(vm2.f(0.25f, this.E.m(aob.I.o()), -1)));
                byte b = this.F;
                if (b == 1) {
                    int e = this.E.e(1, vnbVar);
                    boolean o = this.E.o(a);
                    kc7 kc7Var2 = this.E;
                    ulVar.k(Integer.valueOf(vm2.f(0.5f, e, o ? kc7Var2.e(4, vnbVar) : kc7Var2.e(2, vnbVar))));
                } else {
                    kc7 kc7Var3 = this.E;
                    if (b == 2) {
                        int h = kc7Var3.h(a);
                        boolean o2 = this.E.o(a);
                        kc7 kc7Var4 = this.E;
                        if (o2) {
                            j = (a ? kc7Var4.h : kc7Var4.g)[4];
                        } else {
                            j = kc7Var4.j(a);
                        }
                        ulVar.k(Integer.valueOf(vm2.f(0.5f, h, j)));
                    } else {
                        ulVar.k(Integer.valueOf(vm2.f(0.25f, kc7Var3.m(aob.I.o()), -1)));
                    }
                }
                int f = vm2.f(0.5f, this.E.m(a), this.E.n(a));
                int i2 = aob.s8;
                if (aob.c1(aob.v0(i2, vnbVar))) {
                    emaVar.setTextColor(aob.C(a, aob.v0(i2, vnbVar), f, aob.v0(aob.h8, vnbVar), f));
                } else {
                    emaVar.setTextColor(f);
                }
                ns1Var.setTextColor(-1);
            } else {
                int i3 = aob.s8;
                if (hl.B(aob.v0(i3, vnbVar)) > 0.8f) {
                    ulVar3.k(Integer.valueOf(aob.v0(aob.n6, vnbVar)));
                } else if (hl.B(aob.v0(i3, vnbVar)) < 0.2f) {
                    ulVar3.k(Integer.valueOf(aob.p1(0.5f, aob.v0(aob.A8, vnbVar))));
                } else {
                    ulVar3.k(Integer.valueOf(h48.z0(aob.v0(i3, vnbVar))));
                }
                int i4 = aob.qi;
                ulVar.k(Integer.valueOf(aob.v0(i4, vnbVar)));
                ulVar2.k(Integer.valueOf(aob.v0(i4, vnbVar)));
                emaVar.setTextColor(aob.v0(aob.B8, vnbVar));
                ns1Var.setTextColor(aob.v0(aob.A8, vnbVar));
            }
            invalidate();
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }
}
