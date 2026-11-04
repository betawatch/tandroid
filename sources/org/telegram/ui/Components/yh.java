package org.telegram.ui.Components;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yh extends sj0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final /* synthetic */ bi L;
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

    public yh(bi biVar, Context context) {
        this.L = biVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    @Override // u4.h0
    public final int b() {
        int i3 = this.K;
        bi biVar = this.L;
        return (biVar.C3 == null && (biVar.X1 instanceof org.telegram.ui.wm) && !biVar.z1) ? org.telegram.messenger.li.b0(biVar.E3).k1.size() + i3 : i3;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 < this.K) {
            return (i3 < this.e || i3 >= this.f) ? 0 : 1;
        }
        return 1;
    }

    @Override // u4.h0
    public final void f() {
        int i3 = 0;
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
        bi biVar = this.L;
        int i10 = biVar.E3;
        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
        if (biVar.z1) {
            this.K = 1;
            this.d = 0;
            int i11 = biVar.A1;
            if (i11 == 0 || x7.u.a(i11, 16)) {
                int i12 = this.K;
                this.K = i12 + 1;
                this.n = i12;
            }
            int i13 = biVar.A1;
            if (i13 == 0 || x7.u.a(i13, TLObject.FLAG_13)) {
                int i14 = this.K;
                this.K = i14 + 1;
                this.G = i14;
            }
            int i15 = biVar.A1;
            if (i15 == 0 || x7.u.a(i15, TLObject.FLAG_14)) {
                int i16 = this.K;
                this.K = i16 + 1;
                this.H = i16;
            }
            int i17 = biVar.A1;
            if (i17 == 0 || x7.u.a(i17, 8)) {
                int i18 = this.K;
                this.K = i18 + 1;
                this.s = i18;
            }
            int i19 = biVar.A1;
            if (i19 == 0 || x7.u.a(i19, 64)) {
                int i20 = this.K;
                this.K = i20 + 1;
                this.F = i20;
            }
            int i21 = biVar.A1;
            if (i21 == 0 || x7.u.a(i21, 32768)) {
                int i22 = this.K;
                this.K = i22 + 1;
                this.I = i22;
            }
        } else if (!(d2Var instanceof org.telegram.ui.wm)) {
            this.d = 0;
            this.K = 2;
            this.n = 1;
            if (biVar.O1) {
                this.K = 3;
                this.s = 2;
            }
        } else if (biVar.C3 != null) {
            int i23 = biVar.B3;
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
            TLRPC.User j10 = ((org.telegram.ui.wm) d2Var).j();
            TLRPC.Chat chat = d2Var instanceof org.telegram.ui.wm ? ((org.telegram.ui.wm) d2Var).e : null;
            boolean z10 = j10 != null && ((org.telegram.ui.wm) d2Var).getMessagesController().N1(j10.id) > 0;
            int i26 = this.K;
            this.d = i26;
            this.K = i26 + 2;
            this.n = i26 + 1;
            if (((org.telegram.messenger.h0) org.telegram.messenger.hp.s1(i10).x7.j0.b).c && ((org.telegram.ui.wm) d2Var).g4 == 0 && bi.g1(j10)) {
                int i27 = this.K;
                this.K = i27 + 1;
                this.r = i27;
            }
            boolean z11 = biVar.L3;
            if (z11) {
                int i28 = this.K;
                this.K = i28 + 1;
                this.F = i28;
            }
            if (z11) {
                org.telegram.messenger.hp.s1(i10);
                boolean z12 = org.telegram.messenger.r2.a;
                int i29 = this.K;
                this.K = i29 + 1;
                this.J = i29;
            }
            if (biVar.J3) {
                int i30 = this.K;
                this.K = i30 + 1;
                this.w = i30;
            }
            if (biVar.L3) {
                int i31 = this.K;
                this.K = i31 + 1;
                this.y = i31;
            }
            int i32 = this.K;
            int i33 = i32 + 1;
            this.K = i33;
            this.s = i32;
            if (biVar.K3) {
                this.K = i32 + 2;
                this.x = i33;
            }
            if ((d2Var instanceof org.telegram.ui.wm) && ((org.telegram.ui.wm) d2Var).g4 == 0 && j10 != null && !z10 && !j10.bot && !lg.u1.f(i10).b.isEmpty()) {
                int i34 = this.K;
                this.K = i34 + 1;
                this.E = i34;
            }
            if ((biVar.G3 || biVar.H3) && !z10 && ((chat == null || !org.telegram.messenger.t3.p0(chat)) && (d2Var instanceof org.telegram.ui.wm) && !((org.telegram.ui.wm) d2Var).c() && !((org.telegram.ui.wm) d2Var).z())) {
                org.telegram.ui.wm wmVar = (org.telegram.ui.wm) d2Var;
                if (wmVar.g4 != 5) {
                    this.e = this.K;
                    ArrayList arrayList = this.h;
                    arrayList.clear();
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = org.telegram.messenger.li.b0(i10).b.bots;
                    int size = arrayList2.size();
                    while (i3 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i3);
                        i3++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_attach_menu) {
                            TLObject tLObject = wmVar.e;
                            if (tLObject == null) {
                                tLObject = wmVar.j();
                            }
                            if (org.telegram.messenger.li.t(tL_attachMenuBot2, tLObject)) {
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
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10 = this.L.E3;
        int i11 = d1Var.f;
        View view = d1Var.a;
        boolean z13 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            uh uhVar = (uh) view;
            uhVar.a.getClass();
            int i12 = this.e;
            if (i3 >= i12 && i3 < this.f) {
                int i13 = i3 - i12;
                uhVar.setTag(Integer.valueOf(i13));
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.h.get(i13);
                TLRPC.User a22 = org.telegram.messenger.hp.s1(i10).a2(Long.valueOf(tL_attachMenuBot.bot_id));
                if (a22 != null) {
                    rh.b bVar = uhVar.a;
                    bVar.getClass();
                    bVar.E = null;
                    bVar.F = tL_attachMenuBot;
                    bVar.P = 0;
                    bVar.Q = 0L;
                    bVar.a.setText(tL_attachMenuBot.short_name);
                    bVar.c.setRoundRadius(0);
                    bVar.c.u(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
                    bVar.c.setLayoutParams(b8.mf.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
                    bVar.N = true;
                    bVar.b(false);
                    bVar.a();
                    bVar.invalidate();
                    uhVar.b = a22;
                    uhVar.c = tL_attachMenuBot;
                    uhVar.a.f(false, false);
                    uhVar.invalidate();
                    return;
                }
                return;
            }
            int i14 = i3 - this.K;
            uhVar.setTag(Integer.valueOf(i14));
            TLRPC.User a23 = org.telegram.messenger.hp.s1(i10).a2(Long.valueOf(((TLRPC.TL_topPeer) org.telegram.messenger.li.b0(i10).k1.get(i14)).peer.user_id));
            if (a23 == null) {
                return;
            }
            rh.b bVar2 = uhVar.a;
            bVar2.E = null;
            bVar2.F = null;
            bVar2.P = 0;
            bVar2.Q = 0L;
            bVar2.a.setText(org.telegram.messenger.g5.m(0, a23.first_name, a23.last_name));
            if (bVar2.V == null) {
                bVar2.V = new u8((org.telegram.ui.ActionBar.e6) null);
            }
            bVar2.V.r(a23);
            bVar2.c.e(a23, bVar2.V);
            bVar2.c.u(-1, -1);
            bVar2.c.setRoundRadius(org.telegram.messenger.g0.L(11.33f));
            bVar2.c.setLayoutParams(b8.mf.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
            bVar2.c.setColorFilter(null);
            bVar2.N = false;
            bVar2.invalidate();
            uhVar.b = a23;
            uhVar.c = null;
            uhVar.a.f(false, false);
            uhVar.invalidate();
            return;
        }
        vh vhVar = (vh) view;
        vhVar.a.getClass();
        int i15 = this.d;
        Context context = this.c;
        if (i3 != i15) {
            if (i3 == this.r) {
                vhVar.a(17, org.telegram.messenger.bd.M0(2131743204, null), rh.a.O);
                vhVar.setTag(17);
            } else if (i3 == this.n) {
                vhVar.a(4, org.telegram.messenger.bd.M0(2131752240, null), rh.a.x);
                vhVar.setTag(4);
                if (Build.VERSION.SDK_INT < 33) {
                }
            } else if (i3 == this.F) {
                vhVar.a(6, org.telegram.messenger.bd.M0(2131752220, null), rh.a.E);
                vhVar.setTag(6);
            } else if (i3 == this.s) {
                vhVar.a(3, org.telegram.messenger.bd.M0(2131753952, null), rh.a.I);
                vhVar.setTag(3);
            } else if (i3 == this.w) {
                vhVar.a(9, org.telegram.messenger.bd.M0(2131747193, null), rh.a.J);
                vhVar.setTag(9);
            } else {
                if (i3 != this.y) {
                    if (i3 == this.E) {
                        vhVar.a(11, org.telegram.messenger.bd.M0(2131753942, null), rh.a.L);
                        vhVar.setTag(11);
                    } else if (i3 == this.x) {
                        vhVar.a(12, org.telegram.messenger.bd.M0(2131744119, null), rh.a.s);
                        vhVar.setTag(12);
                    } else if (i3 == this.G) {
                        vhVar.a(13, org.telegram.messenger.bd.M0(2131752209, null), rh.a.F);
                        vhVar.setTag(13);
                    } else if (i3 == this.I) {
                        vhVar.a(15, org.telegram.messenger.bd.M0(2131752226, null), rh.a.M);
                        vhVar.setTag(15);
                    } else if (i3 == this.H) {
                        vhVar.a(14, org.telegram.messenger.bd.M0(2131752239, null), rh.a.G);
                        vhVar.setTag(14);
                    } else if (i3 == this.J) {
                        vhVar.a(16, org.telegram.messenger.bd.M0(2131753983, null), rh.a.N);
                        vhVar.setTag(16);
                        z10 = !org.telegram.messenger.hp.s1(i10).X4();
                        z11 = false;
                        vhVar.a.e(z11 ? "!" : null, z11, false);
                        rh.b bVar3 = vhVar.a;
                        if (z10 && !org.telegram.messenger.h10.i(i10).q()) {
                            z13 = true;
                        }
                        bVar3.setPremiumBadge(z13);
                    }
                    z11 = false;
                    z10 = true;
                    vhVar.a.e(z11 ? "!" : null, z11, false);
                    rh.b bVar32 = vhVar.a;
                    if (z10) {
                        z13 = true;
                    }
                    bVar32.setPremiumBadge(z13);
                }
                vhVar.a(5, org.telegram.messenger.bd.M0(2131753979, null), rh.a.f);
                vhVar.setTag(5);
            }
            z11 = false;
            z10 = false;
            vhVar.a.e(z11 ? "!" : null, z11, false);
            rh.b bVar322 = vhVar.a;
            if (z10) {
            }
            bVar322.setPremiumBadge(z13);
        }
        vhVar.a(1, org.telegram.messenger.bd.M0(2131752238, null), rh.a.y);
        vhVar.setTag(1);
        z12 = Build.VERSION.SDK_INT < 33 ? false : false;
        z11 = !z12;
        z10 = false;
        vhVar.a.e(z11 ? "!" : null, z11, false);
        rh.b bVar3222 = vhVar.a;
        if (z10) {
        }
        bVar3222.setPremiumBadge(z13);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        Context context = this.c;
        bi biVar = this.L;
        View uhVar = i3 != 0 ? new uh(biVar, context) : new vh(biVar, context);
        uhVar.setImportantForAccessibility(1);
        uhVar.setFocusable(true);
        uhVar.setLayoutParams(new u4.p0(-2, -1));
        return new bj0(uhVar);
    }

    @Override // u4.h0
    public final void y(u4.d1 d1Var) {
    }
}
