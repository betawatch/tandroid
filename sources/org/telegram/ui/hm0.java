package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class hm0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public org.telegram.messenger.cp E;
    public int F;
    public final RectF G;
    public final org.telegram.ui.ActionBar.e6 a;
    public final int b;
    public final boolean c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.t8 e;
    public final ok f;
    public final org.telegram.ui.ActionBar.j5 h;
    public boolean n;
    public final org.telegram.ui.Components.e5 r;
    public final org.telegram.ui.Components.e5 s;
    public final org.telegram.ui.Components.e5 w;
    public final fi.j7 x;
    public final org.telegram.ui.Components.u5 y;

    public hm0(int i7, long j3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        CharSequence p10;
        long c10;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.e = t8Var;
        this.w = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(20.0f), 13, this, false);
        this.x = new fi.j7(this);
        this.y = new org.telegram.ui.Components.u5(this, 320L, org.telegram.ui.Components.er.h);
        this.G = new RectF();
        this.b = i7;
        this.a = e6Var;
        long j10 = 0;
        boolean z10 = j3 < 0;
        this.c = z10;
        ok okVar = new ok(2, context, this);
        this.f = okVar;
        this.r = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(17.0f), okVar);
        this.s = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), okVar);
        okVar.setLeftDrawableOutside(true);
        okVar.setRightDrawableOutside(true);
        okVar.setTextColor(-1);
        okVar.setTextSize(20);
        okVar.setTypeface(org.telegram.messenger.g0.o());
        okVar.setWidthWrapContent(true);
        addView(okVar, c8.ja.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.h = j5Var;
        j5Var.setTextSize(14);
        j5Var.setTextColor(-2130706433);
        j5Var.setGravity(1);
        addView(j5Var, c8.ja.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
        imageReceiver.J0(org.telegram.messenger.g0.L(96.0f));
        if (z10) {
            TLRPC.Chat M0 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-j3));
            p10 = M0 == null ? "" : M0.title;
            t8Var.q(M0);
            imageReceiver.i0(M0, t8Var, null);
            c10 = org.telegram.messenger.m5.c(M0);
            if (M0 != null) {
                j10 = org.telegram.messenger.m5.f(M0.emoji_status);
            }
        } else {
            TLRPC.User f10 = org.telegram.messenger.m10.i(i7).f();
            p10 = org.telegram.messenger.q10.p(f10);
            t8Var.r(f10);
            imageReceiver.i0(f10, t8Var, null);
            c10 = org.telegram.messenger.m5.c(f10);
            if (f10 != null) {
                j10 = org.telegram.messenger.m5.f(f10.emoji_status);
            }
        }
        try {
            p10 = org.telegram.messenger.j6.m(p10, null, false, null, 0);
        } catch (Exception unused) {
        }
        this.f.l(p10, false);
        this.r.j(c10, false);
        this.f.setLeftDrawable(this.r);
        this.s.j(j10, false);
        this.f.i(this.s);
        if (this.c) {
            long j11 = -j3;
            TLRPC.Chat M02 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(j11));
            TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(i7).N0(j11);
            if (N0 == null || N0.participants_count <= 0) {
                if (M02 == null || M02.participants_count <= 0) {
                    boolean t02 = org.telegram.messenger.t3.t0(M02);
                    if (org.telegram.messenger.t3.V(M02)) {
                        this.h.l(org.telegram.messenger.hd.M0(t02 ? 2131752318 : 2131752329, null).toLowerCase(), false);
                    } else {
                        this.h.l(org.telegram.messenger.hd.M0(t02 ? 2131748638 : 2131748641, null).toLowerCase(), false);
                    }
                } else if (org.telegram.messenger.t3.V(M02)) {
                    this.h.l(org.telegram.messenger.hd.H(',', "Subscribers", M02.participants_count), false);
                } else {
                    this.h.l(org.telegram.messenger.hd.H(',', "Members", M02.participants_count), false);
                }
            } else if (org.telegram.messenger.t3.V(M02)) {
                this.h.l(org.telegram.messenger.hd.H(',', "Subscribers", N0.participants_count), false);
            } else {
                this.h.l(org.telegram.messenger.hd.H(',', "Members", N0.participants_count), false);
            }
        } else {
            this.h.l(org.telegram.messenger.hd.M0(2131747826, null), false);
        }
        setWillNotDraw(false);
    }

    public final void a(int i7) {
        int w02;
        int w03;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        if (i7 >= 14) {
            org.telegram.messenger.dp dpVar = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).r4;
            org.telegram.messenger.cp d = dpVar != null ? dpVar.d(i7) : null;
            if (d != null) {
                int f10 = d.f();
                w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.p8[org.telegram.ui.Components.t8.f(f10)], e6Var);
                w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.q8[org.telegram.ui.Components.t8.f(f10)], e6Var);
            } else {
                long j3 = i7;
                w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.p8[org.telegram.ui.Components.t8.e(j3)], e6Var);
                w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.q8[org.telegram.ui.Components.t8.e(j3)], e6Var);
            }
        } else {
            long j10 = i7;
            w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.p8[org.telegram.ui.Components.t8.e(j10)], e6Var);
            w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.q8[org.telegram.ui.Components.t8.e(j10)], e6Var);
        }
        this.e.i(w02, w03);
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.qi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.h8));
    }

    public void b(int i7, boolean z10) {
        org.telegram.messenger.dp dpVar = org.telegram.messenger.np.s1(this.b).s4;
        c(dpVar == null ? null : dpVar.d(i7), z10);
    }

    public final void c(org.telegram.messenger.cp cpVar, boolean z10) {
        this.E = cpVar;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        boolean a10 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
        ok okVar = this.f;
        org.telegram.ui.Components.e5 e5Var = this.r;
        org.telegram.ui.Components.e5 e5Var2 = this.s;
        org.telegram.ui.ActionBar.j5 j5Var = this.h;
        org.telegram.ui.Components.e5 e5Var3 = this.w;
        if (cpVar != null) {
            int i7 = cpVar.a;
            if (i7 != 0) {
                e5Var3.k(Integer.valueOf(i7));
            } else {
                e5Var3.k(Integer.valueOf(jm0.B0(cpVar.c(a10))));
            }
            e5Var2.k(Integer.valueOf(i0.a.f(0.25f, cpVar.m(org.telegram.ui.ActionBar.j6.I.q()), -1)));
            e5Var.k(Integer.valueOf(i0.a.f(0.25f, cpVar.m(org.telegram.ui.ActionBar.j6.I.q()), -1)));
            int f10 = i0.a.f(0.5f, cpVar.m(a10), cpVar.n(a10));
            int i10 = org.telegram.ui.ActionBar.j6.s8;
            if (org.telegram.ui.ActionBar.j6.e1(org.telegram.ui.ActionBar.j6.w0(i10, e6Var))) {
                j5Var.setTextColor(org.telegram.ui.ActionBar.j6.D(a10, org.telegram.ui.ActionBar.j6.w0(i10, e6Var), f10, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h8, e6Var), f10));
            } else {
                j5Var.setTextColor(f10);
            }
            okVar.setTextColor(-1);
        } else {
            int i11 = org.telegram.ui.ActionBar.j6.s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(i11, e6Var)) > 0.8f) {
                e5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.n6, e6Var)));
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(i11, e6Var)) < 0.2f) {
                e5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.r1(0.5f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.A8, e6Var))));
            } else {
                e5Var3.k(Integer.valueOf(jm0.B0(org.telegram.ui.ActionBar.j6.w0(i11, e6Var))));
            }
            int i12 = org.telegram.ui.ActionBar.j6.qi;
            e5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(i12, e6Var)));
            e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(i12, e6Var)));
            j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.B8, e6Var));
            okVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.A8, e6Var));
        }
        this.F = 0;
        this.x.c(cpVar, z10);
        invalidate();
    }

    public final void d(long j3, boolean z10, boolean z11) {
        org.telegram.messenger.cp cpVar;
        int i7;
        org.telegram.ui.Components.e5 e5Var = this.w;
        if (j3 == 0) {
            e5Var.g(null, z11);
        } else {
            e5Var.j(j3, z11);
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        boolean a10 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
        org.telegram.messenger.cp cpVar2 = this.E;
        if (cpVar2 != null) {
            int i10 = cpVar2.a;
            if (i10 != 0) {
                e5Var.k(Integer.valueOf(i10));
            } else {
                e5Var.k(Integer.valueOf(jm0.B0(cpVar2.c(a10))));
            }
        } else {
            int i11 = org.telegram.ui.ActionBar.j6.s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(i11, e6Var)) > 0.8f) {
                e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.n6, e6Var)));
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(i11, e6Var)) < 0.2f) {
                e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.r1(0.5f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.A8, false))));
            } else {
                e5Var.k(Integer.valueOf(jm0.B0(org.telegram.ui.ActionBar.j6.x0(null, i11, false))));
            }
        }
        org.telegram.messenger.cp cpVar3 = this.E;
        org.telegram.ui.Components.e5 e5Var2 = this.s;
        if (cpVar3 != null) {
            int e10 = cpVar3.e(1, e6Var);
            if (this.E.o(a10)) {
                cpVar = this.E;
                i7 = 4;
            } else {
                cpVar = this.E;
                i7 = 2;
            }
            e5Var2.k(Integer.valueOf(i0.a.f(0.5f, e10, cpVar.e(i7, e6Var))));
        } else {
            e5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.qi, e6Var)));
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
        di.w0.c(canvas, this.w, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
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
        org.telegram.ui.Components.e5 e5Var = this.s;
        e5Var.j(j3, z11);
        e5Var.m(z10, z11);
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        boolean a10 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
        org.telegram.messenger.cp cpVar = this.E;
        if (cpVar != null) {
            int h = cpVar.h(a10);
            if (this.E.o(a10)) {
                org.telegram.messenger.cp cpVar2 = this.E;
                j10 = (a10 ? cpVar2.h : cpVar2.g)[4];
            } else {
                j10 = this.E.j(a10);
            }
            e5Var.k(Integer.valueOf(i0.a.f(0.5f, h, j10)));
        } else {
            e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.qi, e6Var)));
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        org.telegram.ui.Components.e5 e5Var;
        org.telegram.ui.Components.e5 e5Var2;
        ok okVar;
        org.telegram.ui.ActionBar.j5 j5Var;
        int j3;
        org.telegram.ui.Components.e5 e5Var3 = this.w;
        if (e5Var3 == null || (e5Var = this.s) == null || (e5Var2 = this.r) == null || (okVar = this.f) == null || (j5Var = this.h) == null) {
            return;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        try {
            boolean a10 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
            org.telegram.messenger.cp cpVar = this.E;
            if (cpVar != null) {
                int i7 = cpVar.a;
                if (i7 != 0) {
                    e5Var3.k(Integer.valueOf(i7));
                } else {
                    e5Var3.k(Integer.valueOf(jm0.B0(cpVar.c(a10))));
                }
                e5Var2.k(Integer.valueOf(i0.a.f(0.25f, this.E.m(org.telegram.ui.ActionBar.j6.I.q()), -1)));
                int i10 = this.F;
                if (i10 == 1) {
                    e5Var.k(Integer.valueOf(i0.a.f(0.5f, this.E.e(1, e6Var), this.E.o(a10) ? this.E.e(4, e6Var) : this.E.e(2, e6Var))));
                } else if (i10 == 2) {
                    int h = this.E.h(a10);
                    if (this.E.o(a10)) {
                        org.telegram.messenger.cp cpVar2 = this.E;
                        j3 = (a10 ? cpVar2.h : cpVar2.g)[4];
                    } else {
                        j3 = this.E.j(a10);
                    }
                    e5Var.k(Integer.valueOf(i0.a.f(0.5f, h, j3)));
                } else {
                    e5Var.k(Integer.valueOf(i0.a.f(0.25f, this.E.m(org.telegram.ui.ActionBar.j6.I.q()), -1)));
                }
                int f10 = i0.a.f(0.5f, this.E.m(a10), this.E.n(a10));
                int i11 = org.telegram.ui.ActionBar.j6.s8;
                if (org.telegram.ui.ActionBar.j6.e1(org.telegram.ui.ActionBar.j6.w0(i11, e6Var))) {
                    j5Var.setTextColor(org.telegram.ui.ActionBar.j6.D(a10, org.telegram.ui.ActionBar.j6.w0(i11, e6Var), f10, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h8, e6Var), f10));
                } else {
                    j5Var.setTextColor(f10);
                }
                okVar.setTextColor(-1);
            } else {
                int i12 = org.telegram.ui.ActionBar.j6.s8;
                if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(i12, e6Var)) > 0.8f) {
                    e5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.n6, e6Var)));
                } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(i12, e6Var)) < 0.2f) {
                    e5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.r1(0.5f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.A8, e6Var))));
                } else {
                    e5Var3.k(Integer.valueOf(jm0.B0(org.telegram.ui.ActionBar.j6.w0(i12, e6Var))));
                }
                int i13 = org.telegram.ui.ActionBar.j6.qi;
                e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(i13, e6Var)));
                e5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(i13, e6Var)));
                j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.B8, e6Var));
                okVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.A8, e6Var));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
