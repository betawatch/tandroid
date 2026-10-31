package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c81 implements org.telegram.messenger.mc, org.telegram.ui.Components.hk0, org.telegram.ui.Components.y71, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m91 b;

    public /* synthetic */ c81(m91 m91Var, int i10) {
        this.a = i10;
        this.b = m91Var;
    }

    @Override // org.telegram.ui.Components.hk0
    public void b(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            boolean y22 = q1Var.y2(f7);
            m91 m91Var = this.b;
            if (!y22) {
                m91Var.c1(2, true);
            } else if (q1Var.getMessageObject().P3()) {
                m91Var.c1(3, true);
            } else {
                m91Var.c1(1, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.y71
    public void e(int i10, int i11) {
        m91 m91Var = this.b;
        if (m91Var.F1) {
            m91Var.y0.getBackground();
            float scaleX = m91Var.C0 != null ? (m91Var.y0.getScaleX() - 1.0f) / (m91Var.z1 - 1.0f) : 1.0f;
            m91Var.y0.setTranslationX(i10 * scaleX);
            m91Var.y0.setTranslationY(i11 * scaleX);
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 3:
                this.b.t0.getActionBarMenuOnItemClick().b(4);
                break;
            case 4:
                this.b.R0(false);
                break;
            case 5:
                m91 m91Var = this.b;
                org.telegram.ui.ActionBar.r6 r6Var = m91Var.w;
                if (r6Var.j == 4294967296L) {
                    r6Var.j = 0L;
                    r6Var.k = 0L;
                    r6Var.l = 0L;
                    r6Var.m = 0L;
                    m91Var.q1(false);
                    org.telegram.ui.ActionBar.t6.t1(false, false);
                }
                m91Var.x = true;
                org.telegram.ui.ActionBar.t6.v1(true);
                m91Var.c1(2, false);
                break;
            case 6:
                m91 m91Var2 = this.b;
                org.telegram.ui.ActionBar.r6 r6Var2 = m91Var2.w;
                if (org.telegram.ui.ActionBar.t6.c1() && org.telegram.ui.ActionBar.t6.I.i0.d != 0) {
                    org.telegram.ui.ActionBar.m6 m6Var = r6Var2.y;
                    r6Var2.j = m6Var.d;
                    r6Var2.k = m6Var.e;
                    r6Var2.l = m6Var.f;
                    r6Var2.m = m6Var.g;
                    r6Var2.n = m6Var.h;
                    String str = m6Var.c;
                    r6Var2.o = str;
                    float f7 = m6Var.k;
                    r6Var2.p = f7;
                    m91Var2.m1 = f7;
                    if (str == null || "c".equals(str)) {
                        m91Var2.X0 = null;
                    } else {
                        int size = m91Var2.V0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) m91Var2.V0.get(i11);
                                if (tL_wallPaper.pattern && r6Var2.o.equals(tL_wallPaper.slug)) {
                                    m91Var2.X0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                    m91Var2.x = true;
                    m91Var2.K0[1].a(m91Var2.X0 != null, true);
                    m91Var2.q1(false);
                    org.telegram.ui.ActionBar.t6.t1(false, false);
                }
                Drawable background = m91Var2.y0.getBackground();
                if (background instanceof org.telegram.ui.Components.jb0) {
                    org.telegram.ui.Components.jb0 jb0Var = (org.telegram.ui.Components.jb0) background;
                    jb0Var.s(null, 100);
                    if (org.telegram.ui.ActionBar.t6.I.q()) {
                        if (m91Var2.m1 < 0.0f) {
                            m91Var2.y0.getImageReceiver().m0(jb0Var.k);
                        }
                        org.telegram.ui.Cells.h0 h0Var = m91Var2.U0;
                        if (h0Var != null) {
                            h0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = m91Var2.m1;
                        if (f10 < 0.0f) {
                            m91Var2.m1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.h0 h0Var2 = m91Var2.U0;
                if (h0Var2 != null) {
                    h0Var2.setProgress(m91Var2.m1);
                }
                org.telegram.ui.ActionBar.t6.v1(true);
                m91Var2.c1(2, false);
                break;
            default:
                m91 m91Var3 = this.b;
                org.telegram.ui.ActionBar.r6 r6Var3 = m91Var3.w;
                if (r6Var3.j == 4294967296L) {
                    r6Var3.j = 0L;
                    r6Var3.k = 0L;
                    r6Var3.l = 0L;
                    r6Var3.m = 0L;
                    m91Var3.q1(false);
                    org.telegram.ui.ActionBar.t6.t1(false, false);
                }
                m91Var3.x = true;
                org.telegram.ui.ActionBar.t6.v1(true);
                m91Var3.c1(2, false);
                break;
        }
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ boolean h1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.mc
    public void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        m91 m91Var = this.b;
        if (m91Var.C1 instanceof me1) {
            return;
        }
        Drawable t10 = imageReceiver.t();
        if (!z10 || t10 == null) {
            return;
        }
        n81 n81Var = m91Var.a;
        org.telegram.messenger.i0.q(t10);
        n81Var.k(m91Var.S0(t10), t10, Float.valueOf(m91Var.m1));
        if (!z11 && m91Var.G1 && m91Var.x1 == null) {
            m91Var.y0.getImageReceiver().A0 = false;
            m91Var.m1();
            m91Var.y0.getImageReceiver().A0 = true;
        }
        m91Var.Z0();
    }

    @Override // org.telegram.messenger.mc
    public /* synthetic */ void j(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.mc
    public /* synthetic */ void q(int i10, Drawable drawable) {
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
