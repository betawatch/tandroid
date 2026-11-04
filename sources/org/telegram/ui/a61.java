package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a61 implements org.telegram.messenger.ec, org.telegram.ui.Components.gj0, org.telegram.ui.Components.p61, org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l71 b;

    public /* synthetic */ a61(l71 l71Var, int i3) {
        this.a = i3;
        this.b = l71Var;
    }

    @Override // org.telegram.ui.Components.gj0
    public void b(float f10, float f11, int i3, View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            boolean A2 = q1Var.A2(f10);
            l71 l71Var = this.b;
            if (!A2) {
                l71Var.d1(2, true);
            } else if (q1Var.getMessageObject().Q3()) {
                l71Var.d1(3, true);
            } else {
                l71Var.d1(1, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.p61
    public void e(int i3, int i10) {
        l71 l71Var = this.b;
        if (l71Var.G1) {
            l71Var.z0.getBackground();
            float scaleX = l71Var.D0 != null ? (l71Var.z0.getScaleX() - 1.0f) / (l71Var.A1 - 1.0f) : 1.0f;
            l71Var.z0.setTranslationX(i3 * scaleX);
            l71Var.z0.setTranslationY(i10 * scaleX);
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 3:
                this.b.u0.getActionBarMenuOnItemClick().b(4);
                break;
            case 4:
                this.b.S0(false);
                break;
            case 5:
                l71 l71Var = this.b;
                org.telegram.ui.ActionBar.g6 g6Var = l71Var.w;
                if (g6Var.j == 4294967296L) {
                    g6Var.j = 0L;
                    g6Var.k = 0L;
                    g6Var.l = 0L;
                    g6Var.m = 0L;
                    l71Var.r1(false);
                    org.telegram.ui.ActionBar.k6.t1(false, false);
                }
                l71Var.x = true;
                org.telegram.ui.ActionBar.k6.v1(true);
                l71Var.d1(2, false);
                break;
            case 6:
                l71 l71Var2 = this.b;
                org.telegram.ui.ActionBar.g6 g6Var2 = l71Var2.w;
                if (org.telegram.ui.ActionBar.k6.c1() && org.telegram.ui.ActionBar.k6.I.j0.d != 0) {
                    org.telegram.ui.ActionBar.b6 b6Var = g6Var2.y;
                    g6Var2.j = b6Var.d;
                    g6Var2.k = b6Var.e;
                    g6Var2.l = b6Var.f;
                    g6Var2.m = b6Var.g;
                    g6Var2.n = b6Var.h;
                    String str = b6Var.c;
                    g6Var2.o = str;
                    float f10 = b6Var.k;
                    g6Var2.p = f10;
                    l71Var2.n1 = f10;
                    if (str == null || "c".equals(str)) {
                        l71Var2.Y0 = null;
                    } else {
                        int size = l71Var2.W0.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) l71Var2.W0.get(i10);
                                if (tL_wallPaper.pattern && g6Var2.o.equals(tL_wallPaper.slug)) {
                                    l71Var2.Y0 = tL_wallPaper;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                    l71Var2.x = true;
                    l71Var2.L0[1].a(l71Var2.Y0 != null, true);
                    l71Var2.r1(false);
                    org.telegram.ui.ActionBar.k6.t1(false, false);
                }
                Drawable background = l71Var2.z0.getBackground();
                if (background instanceof org.telegram.ui.Components.la0) {
                    org.telegram.ui.Components.la0 la0Var = (org.telegram.ui.Components.la0) background;
                    la0Var.s(null, 100);
                    if (org.telegram.ui.ActionBar.k6.I.q()) {
                        if (l71Var2.n1 < 0.0f) {
                            l71Var2.z0.getImageReceiver().m0(la0Var.k);
                        }
                        org.telegram.ui.Cells.h0 h0Var = l71Var2.V0;
                        if (h0Var != null) {
                            h0Var.setTwoSided(true);
                        }
                    } else {
                        float f11 = l71Var2.n1;
                        if (f11 < 0.0f) {
                            l71Var2.n1 = -f11;
                        }
                    }
                }
                org.telegram.ui.Cells.h0 h0Var2 = l71Var2.V0;
                if (h0Var2 != null) {
                    h0Var2.setProgress(l71Var2.n1);
                }
                org.telegram.ui.ActionBar.k6.v1(true);
                l71Var2.d1(2, false);
                break;
            default:
                l71 l71Var3 = this.b;
                org.telegram.ui.ActionBar.g6 g6Var3 = l71Var3.w;
                if (g6Var3.j == 4294967296L) {
                    g6Var3.j = 0L;
                    g6Var3.k = 0L;
                    g6Var3.l = 0L;
                    g6Var3.m = 0L;
                    l71Var3.r1(false);
                    org.telegram.ui.ActionBar.k6.t1(false, false);
                }
                l71Var3.x = true;
                org.telegram.ui.ActionBar.k6.v1(true);
                l71Var3.d1(2, false);
                break;
        }
    }

    @Override // org.telegram.messenger.ec
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        l71 l71Var = this.b;
        if (l71Var.D1 instanceof kc1) {
            return;
        }
        Drawable t10 = imageReceiver.t();
        if (!z10 || t10 == null) {
            return;
        }
        l61 l61Var = l71Var.a;
        org.telegram.messenger.g0.q(t10);
        l61Var.k(l71Var.T0(t10), t10, Float.valueOf(l71Var.n1));
        if (!z11 && l71Var.H1 && l71Var.y1 == null) {
            l71Var.z0.getImageReceiver().B0 = false;
            l71Var.n1();
            l71Var.z0.getImageReceiver().B0 = true;
        }
        l71Var.a1();
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void D(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void F0(int i3, Drawable drawable) {
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
