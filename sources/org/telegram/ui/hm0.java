package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class hm0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public org.telegram.messenger.fp D;
    public int E;
    public final RectF F;
    public final org.telegram.ui.ActionBar.g6 a;
    public final int b;
    public final boolean c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.w8 e;
    public final qk f;
    public final org.telegram.ui.ActionBar.l5 h;
    public boolean n;
    public final org.telegram.ui.Components.g5 r;
    public final org.telegram.ui.Components.g5 s;
    public final org.telegram.ui.Components.g5 w;
    public final di.q7 x;
    public final org.telegram.ui.Components.w5 y;

    public hm0(int i7, long j3, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        CharSequence p10;
        long c10;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        this.e = w8Var;
        this.w = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(20.0f), 13, this, false);
        this.x = new di.q7(this);
        this.y = new org.telegram.ui.Components.w5(this, 320L, org.telegram.ui.Components.xq.h);
        this.F = new RectF();
        this.b = i7;
        this.a = g6Var;
        long j10 = 0;
        boolean z9 = j3 < 0;
        this.c = z9;
        qk qkVar = new qk(2, context, this);
        this.f = qkVar;
        this.r = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(17.0f), qkVar);
        this.s = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(24.0f), qkVar);
        qkVar.setLeftDrawableOutside(true);
        qkVar.setRightDrawableOutside(true);
        qkVar.setTextColor(-1);
        qkVar.setTextSize(20);
        qkVar.setTypeface(org.telegram.messenger.g0.o());
        qkVar.setWidthWrapContent(true);
        addView(qkVar, c8.ha.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.h = l5Var;
        l5Var.setTextSize(14);
        l5Var.setTextColor(-2130706433);
        l5Var.setGravity(1);
        addView(l5Var, c8.ha.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
        imageReceiver.J0(org.telegram.messenger.g0.L(96.0f));
        if (z9) {
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-j3));
            p10 = M0 == null ? "" : M0.title;
            w8Var.q(M0);
            imageReceiver.i0(M0, w8Var, null);
            c10 = org.telegram.messenger.m5.c(M0);
            if (M0 != null) {
                j10 = org.telegram.messenger.m5.f(M0.emoji_status);
            }
        } else {
            TLRPC.User f10 = org.telegram.messenger.p10.i(i7).f();
            p10 = org.telegram.messenger.t10.p(f10);
            w8Var.r(f10);
            imageReceiver.i0(f10, w8Var, null);
            c10 = org.telegram.messenger.m5.c(f10);
            if (f10 != null) {
                j10 = org.telegram.messenger.m5.f(f10.emoji_status);
            }
        }
        try {
            p10 = org.telegram.messenger.i6.m(p10, null, false, null, 0);
        } catch (Exception unused) {
        }
        this.f.l(p10, false);
        this.r.j(c10, false);
        this.f.setLeftDrawable(this.r);
        this.s.j(j10, false);
        this.f.i(this.s);
        if (this.c) {
            long j11 = -j3;
            TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(j11));
            TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(i7).N0(j11);
            if (N0 == null || N0.participants_count <= 0) {
                if (M02 == null || M02.participants_count <= 0) {
                    boolean t02 = org.telegram.messenger.t3.t0(M02);
                    if (org.telegram.messenger.t3.V(M02)) {
                        this.h.l(org.telegram.messenger.id.M0(t02 ? 2131752318 : 2131752329, null).toLowerCase(), false);
                    } else {
                        this.h.l(org.telegram.messenger.id.M0(t02 ? 2131748638 : 2131748641, null).toLowerCase(), false);
                    }
                } else if (org.telegram.messenger.t3.V(M02)) {
                    this.h.l(org.telegram.messenger.id.H(',', "Subscribers", M02.participants_count), false);
                } else {
                    this.h.l(org.telegram.messenger.id.H(',', "Members", M02.participants_count), false);
                }
            } else if (org.telegram.messenger.t3.V(M02)) {
                this.h.l(org.telegram.messenger.id.H(',', "Subscribers", N0.participants_count), false);
            } else {
                this.h.l(org.telegram.messenger.id.H(',', "Members", N0.participants_count), false);
            }
        } else {
            this.h.l(org.telegram.messenger.id.M0(2131747826, null), false);
        }
        setWillNotDraw(false);
    }

    public final void a(int i7) {
        int w02;
        int w03;
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        if (i7 >= 14) {
            org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).q4;
            org.telegram.messenger.fp d = gpVar != null ? gpVar.d(i7) : null;
            if (d != null) {
                int f10 = d.f();
                w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.p8[org.telegram.ui.Components.w8.f(f10)], g6Var);
                w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.q8[org.telegram.ui.Components.w8.f(f10)], g6Var);
            } else {
                long j3 = i7;
                w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.p8[org.telegram.ui.Components.w8.e(j3)], g6Var);
                w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.q8[org.telegram.ui.Components.w8.e(j3)], g6Var);
            }
        } else {
            long j10 = i7;
            w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.p8[org.telegram.ui.Components.w8.e(j10)], g6Var);
            w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.q8[org.telegram.ui.Components.w8.e(j10)], g6Var);
        }
        this.e.i(w02, w03);
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.ni));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.h8));
    }

    public void b(int i7, boolean z9) {
        org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(this.b).r4;
        c(gpVar == null ? null : gpVar.d(i7), z9);
    }

    public final void c(org.telegram.messenger.fp fpVar, boolean z9) {
        this.D = fpVar;
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        boolean a10 = g6Var != null ? g6Var.a() : org.telegram.ui.ActionBar.l6.I.q();
        qk qkVar = this.f;
        org.telegram.ui.Components.g5 g5Var = this.r;
        org.telegram.ui.Components.g5 g5Var2 = this.s;
        org.telegram.ui.ActionBar.l5 l5Var = this.h;
        org.telegram.ui.Components.g5 g5Var3 = this.w;
        if (fpVar != null) {
            int i7 = fpVar.a;
            if (i7 != 0) {
                g5Var3.k(Integer.valueOf(i7));
            } else {
                g5Var3.k(Integer.valueOf(jm0.B0(fpVar.c(a10))));
            }
            g5Var2.k(Integer.valueOf(i0.a.f(0.25f, fpVar.m(org.telegram.ui.ActionBar.l6.I.q()), -1)));
            g5Var.k(Integer.valueOf(i0.a.f(0.25f, fpVar.m(org.telegram.ui.ActionBar.l6.I.q()), -1)));
            int f10 = i0.a.f(0.5f, fpVar.m(a10), fpVar.n(a10));
            int i10 = org.telegram.ui.ActionBar.l6.s8;
            if (org.telegram.ui.ActionBar.l6.e1(org.telegram.ui.ActionBar.l6.w0(i10, g6Var))) {
                l5Var.setTextColor(org.telegram.ui.ActionBar.l6.D(a10, org.telegram.ui.ActionBar.l6.w0(i10, g6Var), f10, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.h8, g6Var), f10));
            } else {
                l5Var.setTextColor(f10);
            }
            qkVar.setTextColor(-1);
        } else {
            int i11 = org.telegram.ui.ActionBar.l6.s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(i11, g6Var)) > 0.8f) {
                g5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.n6, g6Var)));
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(i11, g6Var)) < 0.2f) {
                g5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.r1(0.5f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.A8, g6Var))));
            } else {
                g5Var3.k(Integer.valueOf(jm0.B0(org.telegram.ui.ActionBar.l6.w0(i11, g6Var))));
            }
            int i12 = org.telegram.ui.ActionBar.l6.ni;
            g5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(i12, g6Var)));
            g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(i12, g6Var)));
            l5Var.setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.B8, g6Var));
            qkVar.setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.A8, g6Var));
        }
        this.E = 0;
        this.x.c(fpVar, z9);
        invalidate();
    }

    public final void d(long j3, boolean z9, boolean z10) {
        org.telegram.messenger.fp fpVar;
        int i7;
        org.telegram.ui.Components.g5 g5Var = this.w;
        if (j3 == 0) {
            g5Var.g(null, z10);
        } else {
            g5Var.j(j3, z10);
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        boolean a10 = g6Var != null ? g6Var.a() : org.telegram.ui.ActionBar.l6.I.q();
        org.telegram.messenger.fp fpVar2 = this.D;
        if (fpVar2 != null) {
            int i10 = fpVar2.a;
            if (i10 != 0) {
                g5Var.k(Integer.valueOf(i10));
            } else {
                g5Var.k(Integer.valueOf(jm0.B0(fpVar2.c(a10))));
            }
        } else {
            int i11 = org.telegram.ui.ActionBar.l6.s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(i11, g6Var)) > 0.8f) {
                g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.n6, g6Var)));
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(i11, g6Var)) < 0.2f) {
                g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.r1(0.5f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.A8, false))));
            } else {
                g5Var.k(Integer.valueOf(jm0.B0(org.telegram.ui.ActionBar.l6.x0(null, i11, false))));
            }
        }
        org.telegram.messenger.fp fpVar3 = this.D;
        org.telegram.ui.Components.g5 g5Var2 = this.s;
        if (fpVar3 != null) {
            int e10 = fpVar3.e(1, g6Var);
            if (this.D.o(a10)) {
                fpVar = this.D;
                i7 = 4;
            } else {
                fpVar = this.D;
                i7 = 2;
            }
            g5Var2.k(Integer.valueOf(i0.a.f(0.5f, e10, fpVar.e(i7, g6Var))));
        } else {
            g5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.ni, g6Var)));
        }
        this.E = 1;
        if (!z10) {
            this.y.a(z9);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float height = getHeight() - org.telegram.messenger.g0.L(82.0f);
        RectF rectF = this.F;
        rectF.set((getWidth() - org.telegram.messenger.g0.L(86.0f)) / 2.0f, getHeight() - org.telegram.messenger.g0.L(168.0f), (org.telegram.messenger.g0.L(86.0f) + getWidth()) / 2.0f, height);
        bi.i1.c(canvas, this.w, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
        int L = org.telegram.messenger.g0.L(this.n ? 18.0f : 54.0f);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.J0(L);
        imageReceiver.A0(rectF);
        imageReceiver.h(canvas, null);
        float width = (rectF.width() / 2.0f) + org.telegram.messenger.g0.L(4.0f);
        float L2 = org.telegram.messenger.g0.L(this.n ? 22.0f : 58.0f);
        canvas.drawRoundRect(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width, L2, L2, this.x.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j3, boolean z9, boolean z10) {
        int j10;
        org.telegram.ui.Components.g5 g5Var = this.s;
        g5Var.j(j3, z10);
        g5Var.m(z9, z10);
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        boolean a10 = g6Var != null ? g6Var.a() : org.telegram.ui.ActionBar.l6.I.q();
        org.telegram.messenger.fp fpVar = this.D;
        if (fpVar != null) {
            int h = fpVar.h(a10);
            if (this.D.o(a10)) {
                org.telegram.messenger.fp fpVar2 = this.D;
                j10 = (a10 ? fpVar2.h : fpVar2.g)[4];
            } else {
                j10 = this.D.j(a10);
            }
            g5Var.k(Integer.valueOf(i0.a.f(0.5f, h, j10)));
        } else {
            g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.ni, g6Var)));
        }
        this.E = 2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w.a();
        this.d.P();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.w.b();
        this.d.R();
    }

    public void setForum(boolean z9) {
        if (this.n != z9) {
            invalidate();
        }
        this.n = z9;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        org.telegram.ui.Components.g5 g5Var;
        org.telegram.ui.Components.g5 g5Var2;
        qk qkVar;
        org.telegram.ui.ActionBar.l5 l5Var;
        int j3;
        org.telegram.ui.Components.g5 g5Var3 = this.w;
        if (g5Var3 == null || (g5Var = this.s) == null || (g5Var2 = this.r) == null || (qkVar = this.f) == null || (l5Var = this.h) == null) {
            return;
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        try {
            boolean a10 = g6Var != null ? g6Var.a() : org.telegram.ui.ActionBar.l6.I.q();
            org.telegram.messenger.fp fpVar = this.D;
            if (fpVar != null) {
                int i7 = fpVar.a;
                if (i7 != 0) {
                    g5Var3.k(Integer.valueOf(i7));
                } else {
                    g5Var3.k(Integer.valueOf(jm0.B0(fpVar.c(a10))));
                }
                g5Var2.k(Integer.valueOf(i0.a.f(0.25f, this.D.m(org.telegram.ui.ActionBar.l6.I.q()), -1)));
                int i10 = this.E;
                if (i10 == 1) {
                    g5Var.k(Integer.valueOf(i0.a.f(0.5f, this.D.e(1, g6Var), this.D.o(a10) ? this.D.e(4, g6Var) : this.D.e(2, g6Var))));
                } else if (i10 == 2) {
                    int h = this.D.h(a10);
                    if (this.D.o(a10)) {
                        org.telegram.messenger.fp fpVar2 = this.D;
                        j3 = (a10 ? fpVar2.h : fpVar2.g)[4];
                    } else {
                        j3 = this.D.j(a10);
                    }
                    g5Var.k(Integer.valueOf(i0.a.f(0.5f, h, j3)));
                } else {
                    g5Var.k(Integer.valueOf(i0.a.f(0.25f, this.D.m(org.telegram.ui.ActionBar.l6.I.q()), -1)));
                }
                int f10 = i0.a.f(0.5f, this.D.m(a10), this.D.n(a10));
                int i11 = org.telegram.ui.ActionBar.l6.s8;
                if (org.telegram.ui.ActionBar.l6.e1(org.telegram.ui.ActionBar.l6.w0(i11, g6Var))) {
                    l5Var.setTextColor(org.telegram.ui.ActionBar.l6.D(a10, org.telegram.ui.ActionBar.l6.w0(i11, g6Var), f10, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.h8, g6Var), f10));
                } else {
                    l5Var.setTextColor(f10);
                }
                qkVar.setTextColor(-1);
            } else {
                int i12 = org.telegram.ui.ActionBar.l6.s8;
                if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(i12, g6Var)) > 0.8f) {
                    g5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.n6, g6Var)));
                } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(i12, g6Var)) < 0.2f) {
                    g5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.r1(0.5f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.A8, g6Var))));
                } else {
                    g5Var3.k(Integer.valueOf(jm0.B0(org.telegram.ui.ActionBar.l6.w0(i12, g6Var))));
                }
                int i13 = org.telegram.ui.ActionBar.l6.ni;
                g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(i13, g6Var)));
                g5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(i13, g6Var)));
                l5Var.setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.B8, g6Var));
                qkVar.setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.A8, g6Var));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
