package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public class jm0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public org.telegram.messenger.cp E;
    public int F;
    public final RectF G;
    public final org.telegram.ui.ActionBar.h6 a;
    public final int b;
    public final boolean c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.b9 e;
    public final pk f;
    public final org.telegram.ui.ActionBar.m5 h;
    public boolean n;
    public final org.telegram.ui.Components.n5 r;
    public final org.telegram.ui.Components.n5 s;
    public final org.telegram.ui.Components.n5 w;
    public final fi.g7 x;
    public final org.telegram.ui.Components.d6 y;

    public jm0(int i7, long j3, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        CharSequence q10;
        long c10;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        this.e = b9Var;
        this.w = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(20.0f), 13, this, false);
        this.x = new fi.g7(this);
        this.y = new org.telegram.ui.Components.d6(this, 320L, org.telegram.ui.Components.nr.h);
        this.G = new RectF();
        this.b = i7;
        this.a = h6Var;
        long j10 = 0;
        boolean z10 = j3 < 0;
        this.c = z10;
        pk pkVar = new pk(2, context, this);
        this.f = pkVar;
        this.r = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(17.0f), pkVar);
        this.s = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(24.0f), pkVar);
        pkVar.setLeftDrawableOutside(true);
        pkVar.setRightDrawableOutside(true);
        pkVar.setTextColor(-1);
        pkVar.setTextSize(20);
        pkVar.setTypeface(org.telegram.messenger.g0.o());
        pkVar.setWidthWrapContent(true);
        addView(pkVar, c8.ma.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.h = m5Var;
        m5Var.setTextSize(14);
        m5Var.setTextColor(-2130706433);
        m5Var.setGravity(1);
        addView(m5Var, c8.ma.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
        imageReceiver.J0(org.telegram.messenger.g0.L(96.0f));
        if (z10) {
            TLRPC.Chat O0 = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(-j3));
            q10 = O0 == null ? "" : O0.title;
            b9Var.q(O0);
            imageReceiver.i0(O0, b9Var, null);
            c10 = org.telegram.messenger.n5.c(O0);
            if (O0 != null) {
                j10 = org.telegram.messenger.n5.f(O0.emoji_status);
            }
        } else {
            TLRPC.User f10 = org.telegram.messenger.k10.i(i7).f();
            q10 = org.telegram.messenger.p10.q(f10);
            b9Var.r(f10);
            imageReceiver.i0(f10, b9Var, null);
            c10 = org.telegram.messenger.n5.c(f10);
            if (f10 != null) {
                j10 = org.telegram.messenger.n5.f(f10.emoji_status);
            }
        }
        try {
            q10 = org.telegram.messenger.j6.m(q10, null, false, null, 0);
        } catch (Exception unused) {
        }
        this.f.l(q10, false);
        this.r.j(c10, false);
        this.f.setLeftDrawable(this.r);
        this.s.j(j10, false);
        this.f.i(this.s);
        if (this.c) {
            long j11 = -j3;
            TLRPC.Chat O02 = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(j11));
            TLRPC.ChatFull P0 = org.telegram.messenger.np.u1(i7).P0(j11);
            if (P0 == null || P0.participants_count <= 0) {
                if (O02 == null || O02.participants_count <= 0) {
                    boolean t02 = org.telegram.messenger.v3.t0(O02);
                    if (org.telegram.messenger.v3.V(O02)) {
                        this.h.l(org.telegram.messenger.hd.N0(t02 ? 2131752306 : 2131752317, null).toLowerCase(), false);
                    } else {
                        this.h.l(org.telegram.messenger.hd.N0(t02 ? 2131748445 : 2131748448, null).toLowerCase(), false);
                    }
                } else if (org.telegram.messenger.v3.V(O02)) {
                    this.h.l(org.telegram.messenger.hd.H(',', "Subscribers", O02.participants_count), false);
                } else {
                    this.h.l(org.telegram.messenger.hd.H(',', "Members", O02.participants_count), false);
                }
            } else if (org.telegram.messenger.v3.V(O02)) {
                this.h.l(org.telegram.messenger.hd.H(',', "Subscribers", P0.participants_count), false);
            } else {
                this.h.l(org.telegram.messenger.hd.H(',', "Members", P0.participants_count), false);
            }
        } else {
            this.h.l(org.telegram.messenger.hd.N0(2131747632, null), false);
        }
        setWillNotDraw(false);
    }

    public final void a(int i7) {
        int w02;
        int w03;
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        if (i7 >= 14) {
            org.telegram.messenger.dp dpVar = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).t4;
            org.telegram.messenger.cp d = dpVar != null ? dpVar.d(i7) : null;
            if (d != null) {
                int f10 = d.f();
                w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.p8[org.telegram.ui.Components.b9.f(f10)], h6Var);
                w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.q8[org.telegram.ui.Components.b9.f(f10)], h6Var);
            } else {
                long j3 = i7;
                w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.p8[org.telegram.ui.Components.b9.e(j3)], h6Var);
                w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.q8[org.telegram.ui.Components.b9.e(j3)], h6Var);
            }
        } else {
            long j10 = i7;
            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.p8[org.telegram.ui.Components.b9.e(j10)], h6Var);
            w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.q8[org.telegram.ui.Components.b9.e(j10)], h6Var);
        }
        this.e.i(w02, w03);
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.qi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.h8));
    }

    public void b(int i7, boolean z10) {
        org.telegram.messenger.dp dpVar = org.telegram.messenger.np.u1(this.b).u4;
        c(dpVar == null ? null : dpVar.d(i7), z10);
    }

    public final void c(org.telegram.messenger.cp cpVar, boolean z10) {
        this.E = cpVar;
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        boolean d = h6Var != null ? h6Var.d() : org.telegram.ui.ActionBar.m6.I.q();
        pk pkVar = this.f;
        org.telegram.ui.Components.n5 n5Var = this.r;
        org.telegram.ui.Components.n5 n5Var2 = this.s;
        org.telegram.ui.ActionBar.m5 m5Var = this.h;
        org.telegram.ui.Components.n5 n5Var3 = this.w;
        if (cpVar != null) {
            int i7 = cpVar.a;
            if (i7 != 0) {
                n5Var3.k(Integer.valueOf(i7));
            } else {
                n5Var3.k(Integer.valueOf(lm0.B0(cpVar.c(d))));
            }
            n5Var2.k(Integer.valueOf(i0.a.f(0.25f, cpVar.m(org.telegram.ui.ActionBar.m6.I.q()), -1)));
            n5Var.k(Integer.valueOf(i0.a.f(0.25f, cpVar.m(org.telegram.ui.ActionBar.m6.I.q()), -1)));
            int f10 = i0.a.f(0.5f, cpVar.m(d), cpVar.n(d));
            int i10 = org.telegram.ui.ActionBar.m6.s8;
            if (org.telegram.ui.ActionBar.m6.e1(org.telegram.ui.ActionBar.m6.w0(i10, h6Var))) {
                m5Var.setTextColor(org.telegram.ui.ActionBar.m6.D(d, org.telegram.ui.ActionBar.m6.w0(i10, h6Var), f10, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h8, h6Var), f10));
            } else {
                m5Var.setTextColor(f10);
            }
            pkVar.setTextColor(-1);
        } else {
            int i11 = org.telegram.ui.ActionBar.m6.s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i11, h6Var)) > 0.8f) {
                n5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.n6, h6Var)));
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i11, h6Var)) < 0.2f) {
                n5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, h6Var))));
            } else {
                n5Var3.k(Integer.valueOf(lm0.B0(org.telegram.ui.ActionBar.m6.w0(i11, h6Var))));
            }
            int i12 = org.telegram.ui.ActionBar.m6.qi;
            n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(i12, h6Var)));
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(i12, h6Var)));
            m5Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.B8, h6Var));
            pkVar.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, h6Var));
        }
        this.F = 0;
        this.x.c(cpVar, z10);
        invalidate();
    }

    public final void d(long j3, boolean z10, boolean z11) {
        org.telegram.messenger.cp cpVar;
        int i7;
        org.telegram.ui.Components.n5 n5Var = this.w;
        if (j3 == 0) {
            n5Var.g(null, z11);
        } else {
            n5Var.j(j3, z11);
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        boolean d = h6Var != null ? h6Var.d() : org.telegram.ui.ActionBar.m6.I.q();
        org.telegram.messenger.cp cpVar2 = this.E;
        if (cpVar2 != null) {
            int i10 = cpVar2.a;
            if (i10 != 0) {
                n5Var.k(Integer.valueOf(i10));
            } else {
                n5Var.k(Integer.valueOf(lm0.B0(cpVar2.c(d))));
            }
        } else {
            int i11 = org.telegram.ui.ActionBar.m6.s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i11, h6Var)) > 0.8f) {
                n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.n6, h6Var)));
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i11, h6Var)) < 0.2f) {
                n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.A8, false))));
            } else {
                n5Var.k(Integer.valueOf(lm0.B0(org.telegram.ui.ActionBar.m6.x0(null, i11, false))));
            }
        }
        org.telegram.messenger.cp cpVar3 = this.E;
        org.telegram.ui.Components.n5 n5Var2 = this.s;
        if (cpVar3 != null) {
            int e10 = cpVar3.e(1, h6Var);
            if (this.E.o(d)) {
                cpVar = this.E;
                i7 = 4;
            } else {
                cpVar = this.E;
                i7 = 2;
            }
            n5Var2.k(Integer.valueOf(i0.a.f(0.5f, e10, cpVar.e(i7, h6Var))));
        } else {
            n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.qi, h6Var)));
        }
        this.F = 1;
        if (!z11) {
            this.y.a(z10);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float height = getHeight() - org.telegram.messenger.g0.L(82.0f);
        RectF rectF = this.G;
        rectF.set((getWidth() - org.telegram.messenger.g0.L(86.0f)) / 2.0f, getHeight() - org.telegram.messenger.g0.L(168.0f), (org.telegram.messenger.g0.L(86.0f) + getWidth()) / 2.0f, height);
        di.v0.c(canvas, this.w, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
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

    public final void e(long j3, boolean z10, boolean z11) {
        int j10;
        org.telegram.ui.Components.n5 n5Var = this.s;
        n5Var.j(j3, z11);
        n5Var.m(z10, z11);
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        boolean d = h6Var != null ? h6Var.d() : org.telegram.ui.ActionBar.m6.I.q();
        org.telegram.messenger.cp cpVar = this.E;
        if (cpVar != null) {
            int h = cpVar.h(d);
            if (this.E.o(d)) {
                org.telegram.messenger.cp cpVar2 = this.E;
                j10 = (d ? cpVar2.h : cpVar2.g)[4];
            } else {
                j10 = this.E.j(d);
            }
            n5Var.k(Integer.valueOf(i0.a.f(0.5f, h, j10)));
        } else {
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.qi, h6Var)));
        }
        this.F = 2;
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

    public void setForum(boolean z10) {
        if (this.n != z10) {
            invalidate();
        }
        this.n = z10;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        org.telegram.ui.Components.n5 n5Var;
        org.telegram.ui.Components.n5 n5Var2;
        pk pkVar;
        org.telegram.ui.ActionBar.m5 m5Var;
        int j3;
        org.telegram.ui.Components.n5 n5Var3 = this.w;
        if (n5Var3 == null || (n5Var = this.s) == null || (n5Var2 = this.r) == null || (pkVar = this.f) == null || (m5Var = this.h) == null) {
            return;
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        try {
            boolean d = h6Var != null ? h6Var.d() : org.telegram.ui.ActionBar.m6.I.q();
            org.telegram.messenger.cp cpVar = this.E;
            if (cpVar != null) {
                int i7 = cpVar.a;
                if (i7 != 0) {
                    n5Var3.k(Integer.valueOf(i7));
                } else {
                    n5Var3.k(Integer.valueOf(lm0.B0(cpVar.c(d))));
                }
                n5Var2.k(Integer.valueOf(i0.a.f(0.25f, this.E.m(org.telegram.ui.ActionBar.m6.I.q()), -1)));
                int i10 = this.F;
                if (i10 == 1) {
                    n5Var.k(Integer.valueOf(i0.a.f(0.5f, this.E.e(1, h6Var), this.E.o(d) ? this.E.e(4, h6Var) : this.E.e(2, h6Var))));
                } else if (i10 == 2) {
                    int h = this.E.h(d);
                    if (this.E.o(d)) {
                        org.telegram.messenger.cp cpVar2 = this.E;
                        j3 = (d ? cpVar2.h : cpVar2.g)[4];
                    } else {
                        j3 = this.E.j(d);
                    }
                    n5Var.k(Integer.valueOf(i0.a.f(0.5f, h, j3)));
                } else {
                    n5Var.k(Integer.valueOf(i0.a.f(0.25f, this.E.m(org.telegram.ui.ActionBar.m6.I.q()), -1)));
                }
                int f10 = i0.a.f(0.5f, this.E.m(d), this.E.n(d));
                int i11 = org.telegram.ui.ActionBar.m6.s8;
                if (org.telegram.ui.ActionBar.m6.e1(org.telegram.ui.ActionBar.m6.w0(i11, h6Var))) {
                    m5Var.setTextColor(org.telegram.ui.ActionBar.m6.D(d, org.telegram.ui.ActionBar.m6.w0(i11, h6Var), f10, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h8, h6Var), f10));
                } else {
                    m5Var.setTextColor(f10);
                }
                pkVar.setTextColor(-1);
            } else {
                int i12 = org.telegram.ui.ActionBar.m6.s8;
                if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i12, h6Var)) > 0.8f) {
                    n5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.n6, h6Var)));
                } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i12, h6Var)) < 0.2f) {
                    n5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, h6Var))));
                } else {
                    n5Var3.k(Integer.valueOf(lm0.B0(org.telegram.ui.ActionBar.m6.w0(i12, h6Var))));
                }
                int i13 = org.telegram.ui.ActionBar.m6.qi;
                n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(i13, h6Var)));
                n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(i13, h6Var)));
                m5Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.B8, h6Var));
                pkVar.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, h6Var));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
