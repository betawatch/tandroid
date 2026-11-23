package org.telegram.ui.Components;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class qi extends dk0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final /* synthetic */ ti L;
    public final Context c;
    public int d;
    public int e;
    public int f;
    public final ArrayList h = new ArrayList();
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public qi(ti tiVar, Context context) {
        this.L = tiVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override // v4.i0
    public final int b() {
        int i7 = this.K;
        ti tiVar = this.L;
        return (tiVar.F3 == null && (tiVar.a2 instanceof org.telegram.ui.bn) && !tiVar.C1) ? org.telegram.messenger.ri.d0(tiVar.H3).k1.size() + i7 : i7;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 < this.K) {
            return (i7 < this.e || i7 >= this.f) ? 0 : 1;
        }
        return 1;
    }

    @Override // v4.i0
    public final void f() {
        int i7 = 0;
        this.K = 0;
        this.d = -1;
        this.n = -1;
        this.s = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.I = -1;
        this.J = -1;
        this.H = -1;
        this.e = -1;
        this.f = -1;
        this.r = -1;
        ti tiVar = this.L;
        int i10 = tiVar.H3;
        org.telegram.ui.ActionBar.g2 g2Var = tiVar.a2;
        if (tiVar.C1) {
            this.K = 1;
            this.d = 0;
            int i11 = tiVar.D1;
            if (i11 == 0 || c8.ed.a(i11, 16)) {
                int i12 = this.K;
                this.K = i12 + 1;
                this.n = i12;
            }
            int i13 = tiVar.D1;
            if (i13 == 0 || c8.ed.a(i13, TLObject.FLAG_13)) {
                int i14 = this.K;
                this.K = i14 + 1;
                this.G = i14;
            }
            int i15 = tiVar.D1;
            if (i15 == 0 || c8.ed.a(i15, TLObject.FLAG_14)) {
                int i16 = this.K;
                this.K = i16 + 1;
                this.H = i16;
            }
            int i17 = tiVar.D1;
            if (i17 == 0 || c8.ed.a(i17, 8)) {
                int i18 = this.K;
                this.K = i18 + 1;
                this.s = i18;
            }
            int i19 = tiVar.D1;
            if (i19 == 0 || c8.ed.a(i19, 64)) {
                int i20 = this.K;
                this.K = i20 + 1;
                this.F = i20;
            }
            int i21 = tiVar.D1;
            if (i21 == 0 || c8.ed.a(i21, 32768)) {
                int i22 = this.K;
                this.K = i22 + 1;
                this.I = i22;
            }
        } else if (!(g2Var instanceof org.telegram.ui.bn)) {
            this.d = 0;
            this.K = 2;
            this.n = 1;
            if (tiVar.R1) {
                this.K = 3;
                this.s = 2;
            }
        } else if (tiVar.F3 != null) {
            int i23 = tiVar.E3;
            if (i23 == -1) {
                this.d = 0;
                this.n = 1;
                this.K = 3;
                this.s = 2;
            } else {
                if (i23 == 0) {
                    this.K = 1;
                    this.d = 0;
                }
                if (i23 == 1) {
                    int i24 = this.K;
                    this.K = i24 + 1;
                    this.n = i24;
                }
                if (i23 == 2) {
                    int i25 = this.K;
                    this.K = i25 + 1;
                    this.s = i25;
                }
            }
        } else {
            TLRPC.User j3 = ((org.telegram.ui.bn) g2Var).j();
            TLRPC.Chat chat = g2Var instanceof org.telegram.ui.bn ? ((org.telegram.ui.bn) g2Var).e : null;
            boolean z10 = j3 != null && ((org.telegram.ui.bn) g2Var).getMessagesController().P1(j3.id) > 0;
            int i26 = this.K;
            this.d = i26;
            this.K = i26 + 2;
            this.n = i26 + 1;
            if (((org.telegram.messenger.h0) org.telegram.messenger.mp.u1(i10).A7.p0.b).c && ((org.telegram.ui.bn) g2Var).g4 == 0 && ti.h1(j3)) {
                int i27 = this.K;
                this.K = i27 + 1;
                this.r = i27;
            }
            boolean z11 = tiVar.O3;
            if (z11) {
                int i28 = this.K;
                this.K = i28 + 1;
                this.F = i28;
            }
            if (z11) {
                org.telegram.messenger.mp.u1(i10);
                boolean z12 = org.telegram.messenger.s2.a;
                int i29 = this.K;
                this.K = i29 + 1;
                this.J = i29;
            }
            if (tiVar.M3) {
                int i30 = this.K;
                this.K = i30 + 1;
                this.w = i30;
            }
            if (tiVar.O3) {
                int i31 = this.K;
                this.K = i31 + 1;
                this.y = i31;
            }
            int i32 = this.K;
            int i33 = i32 + 1;
            this.K = i33;
            this.s = i32;
            if (tiVar.N3) {
                this.K = i32 + 2;
                this.x = i33;
            }
            if ((g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).g4 == 0 && j3 != null && !z10 && !j3.bot && !kg.w1.f(i10).b.isEmpty()) {
                int i34 = this.K;
                this.K = i34 + 1;
                this.E = i34;
            }
            if ((tiVar.J3 || tiVar.K3) && !z10 && ((chat == null || !org.telegram.messenger.v3.p0(chat)) && (g2Var instanceof org.telegram.ui.bn) && !((org.telegram.ui.bn) g2Var).c() && !((org.telegram.ui.bn) g2Var).y())) {
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var;
                if (bnVar.g4 != 5) {
                    this.e = this.K;
                    ArrayList arrayList = this.h;
                    arrayList.clear();
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = org.telegram.messenger.ri.d0(i10).b.bots;
                    int size = arrayList2.size();
                    while (i7 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i7);
                        i7++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_attach_menu) {
                            TLObject tLObject = bnVar.e;
                            if (tLObject == null) {
                                tLObject = bnVar.j();
                            }
                            if (org.telegram.messenger.ri.v(tL_attachMenuBot2, tLObject)) {
                                arrayList.add(tL_attachMenuBot2);
                            }
                        }
                    }
                    int size2 = arrayList.size() + this.K;
                    this.K = size2;
                    this.f = size2;
                }
            }
        }
        super.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0171, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ff, code lost:
    
        if (f0.d.b(r9, android.os.Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_AUDIO" : "android.permission.READ_EXTERNAL_STORAGE") == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x023c, code lost:
    
        if (f0.d.b(r9, "android.permission.READ_CONTACTS") == 0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02f9  */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10 = this.L.H3;
        int i11 = f1Var.f;
        View view = f1Var.a;
        boolean z13 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            mi miVar = (mi) view;
            miVar.a.getClass();
            int i12 = this.e;
            if (i7 >= i12 && i7 < this.f) {
                int i13 = i7 - i12;
                miVar.setTag(Integer.valueOf(i13));
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.h.get(i13);
                TLRPC.User c22 = org.telegram.messenger.mp.u1(i10).c2(Long.valueOf(tL_attachMenuBot.bot_id));
                if (c22 != null) {
                    qh.b bVar = miVar.a;
                    bVar.getClass();
                    bVar.E = null;
                    bVar.F = tL_attachMenuBot;
                    bVar.P = 0;
                    bVar.Q = 0L;
                    bVar.a.setText(tL_attachMenuBot.short_name);
                    bVar.c.setRoundRadius(0);
                    bVar.c.u(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
                    bVar.c.setLayoutParams(c8.na.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
                    bVar.N = true;
                    bVar.b(false);
                    bVar.a();
                    bVar.invalidate();
                    miVar.b = c22;
                    miVar.c = tL_attachMenuBot;
                    miVar.a.f(false, false);
                    miVar.invalidate();
                    return;
                }
                return;
            }
            int i14 = i7 - this.K;
            miVar.setTag(Integer.valueOf(i14));
            TLRPC.User c23 = org.telegram.messenger.mp.u1(i10).c2(Long.valueOf(((TLRPC.TL_topPeer) org.telegram.messenger.ri.d0(i10).k1.get(i14)).peer.user_id));
            if (c23 == null) {
                return;
            }
            qh.b bVar2 = miVar.a;
            bVar2.E = null;
            bVar2.F = null;
            bVar2.P = 0;
            bVar2.Q = 0L;
            bVar2.a.setText(org.telegram.messenger.i5.m(0, c23.first_name, c23.last_name));
            if (bVar2.V == null) {
                bVar2.V = new a9((org.telegram.ui.ActionBar.i6) null);
            }
            bVar2.V.r(c23);
            bVar2.c.f(c23, bVar2.V);
            bVar2.c.u(-1, -1);
            bVar2.c.setRoundRadius(org.telegram.messenger.g0.L(11.33f));
            bVar2.c.setLayoutParams(c8.na.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
            bVar2.c.setColorFilter(null);
            bVar2.N = false;
            bVar2.invalidate();
            miVar.b = c23;
            miVar.c = null;
            miVar.a.f(false, false);
            miVar.invalidate();
            return;
        }
        ni niVar = (ni) view;
        niVar.a.getClass();
        int i15 = this.d;
        Context context = this.c;
        if (i7 != i15) {
            if (i7 == this.r) {
                niVar.a(17, org.telegram.messenger.gd.N0(2131742943, null), qh.a.O);
                niVar.setTag(17);
            } else if (i7 == this.n) {
                niVar.a(4, org.telegram.messenger.gd.N0(2131752228, null), qh.a.x);
                niVar.setTag(4);
                if (Build.VERSION.SDK_INT < 33) {
                }
            } else if (i7 == this.F) {
                niVar.a(6, org.telegram.messenger.gd.N0(2131752208, null), qh.a.E);
                niVar.setTag(6);
            } else if (i7 == this.s) {
                niVar.a(3, org.telegram.messenger.gd.N0(2131753949, null), qh.a.I);
                niVar.setTag(3);
            } else if (i7 == this.w) {
                niVar.a(9, org.telegram.messenger.gd.N0(2131746991, null), qh.a.J);
                niVar.setTag(9);
            } else {
                if (i7 != this.y) {
                    if (i7 == this.E) {
                        niVar.a(11, org.telegram.messenger.gd.N0(2131753939, null), qh.a.L);
                        niVar.setTag(11);
                    } else if (i7 == this.x) {
                        niVar.a(12, org.telegram.messenger.gd.N0(2131743864, null), qh.a.s);
                        niVar.setTag(12);
                    } else if (i7 == this.G) {
                        niVar.a(13, org.telegram.messenger.gd.N0(2131752197, null), qh.a.F);
                        niVar.setTag(13);
                    } else if (i7 == this.I) {
                        niVar.a(15, org.telegram.messenger.gd.N0(2131752214, null), qh.a.M);
                        niVar.setTag(15);
                    } else if (i7 == this.H) {
                        niVar.a(14, org.telegram.messenger.gd.N0(2131752227, null), qh.a.G);
                        niVar.setTag(14);
                    } else if (i7 == this.J) {
                        niVar.a(16, org.telegram.messenger.gd.N0(2131753980, null), qh.a.N);
                        niVar.setTag(16);
                        z10 = !org.telegram.messenger.mp.u1(i10).j5();
                        z11 = false;
                        niVar.a.e(z11 ? "!" : null, z11, false);
                        qh.b bVar3 = niVar.a;
                        if (z10 && !org.telegram.messenger.i10.i(i10).q()) {
                            z13 = true;
                        }
                        bVar3.setPremiumBadge(z13);
                    }
                    z11 = false;
                    z10 = true;
                    niVar.a.e(z11 ? "!" : null, z11, false);
                    qh.b bVar32 = niVar.a;
                    if (z10) {
                        z13 = true;
                    }
                    bVar32.setPremiumBadge(z13);
                }
                niVar.a(5, org.telegram.messenger.gd.N0(2131753976, null), qh.a.f);
                niVar.setTag(5);
            }
            z11 = false;
            z10 = false;
            niVar.a.e(z11 ? "!" : null, z11, false);
            qh.b bVar322 = niVar.a;
            if (z10) {
            }
            bVar322.setPremiumBadge(z13);
        }
        niVar.a(1, org.telegram.messenger.gd.N0(2131752226, null), qh.a.y);
        niVar.setTag(1);
        z12 = Build.VERSION.SDK_INT < 33 ? false : false;
        z11 = !z12;
        z10 = false;
        niVar.a.e(z11 ? "!" : null, z11, false);
        qh.b bVar3222 = niVar.a;
        if (z10) {
        }
        bVar3222.setPremiumBadge(z13);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        Context context = this.c;
        ti tiVar = this.L;
        View miVar = i7 != 0 ? new mi(tiVar, context) : new ni(tiVar, context);
        miVar.setImportantForAccessibility(1);
        miVar.setFocusable(true);
        miVar.setLayoutParams(new v4.q0(-2, -1));
        return new mj0(miVar);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
    }
}
