package org.telegram.ui.Components;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zh extends sk0 {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public final /* synthetic */ bi K;
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

    public zh(bi biVar, Context context) {
        this.K = biVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.g0
    public final int b() {
        int i10 = this.J;
        bi biVar = this.K;
        return (biVar.B3 == null && (biVar.W1 instanceof org.telegram.ui.un) && !biVar.y1) ? org.telegram.messenger.ui.b0(biVar.D3).j1.size() + i10 : i10;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 < this.J) {
            return (i10 < this.e || i10 >= this.f) ? 0 : 1;
        }
        return 1;
    }

    @Override // s4.g0
    public final void f() {
        int i10 = 0;
        this.J = 0;
        this.d = -1;
        this.n = -1;
        this.s = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.H = -1;
        this.I = -1;
        this.G = -1;
        this.e = -1;
        this.f = -1;
        this.r = -1;
        bi biVar = this.K;
        int i11 = biVar.D3;
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        if (biVar.y1) {
            this.J = 1;
            this.d = 0;
            int i12 = biVar.z1;
            if (i12 == 0 || v7.u7.a(i12, 16)) {
                int i13 = this.J;
                this.J = i13 + 1;
                this.n = i13;
            }
            int i14 = biVar.z1;
            if (i14 == 0 || v7.u7.a(i14, TLObject.FLAG_13)) {
                int i15 = this.J;
                this.J = i15 + 1;
                this.F = i15;
            }
            int i16 = biVar.z1;
            if (i16 == 0 || v7.u7.a(i16, TLObject.FLAG_14)) {
                int i17 = this.J;
                this.J = i17 + 1;
                this.G = i17;
            }
            int i18 = biVar.z1;
            if (i18 == 0 || v7.u7.a(i18, 8)) {
                int i19 = this.J;
                this.J = i19 + 1;
                this.s = i19;
            }
            int i20 = biVar.z1;
            if (i20 == 0 || v7.u7.a(i20, 64)) {
                int i21 = this.J;
                this.J = i21 + 1;
                this.E = i21;
            }
            int i22 = biVar.z1;
            if (i22 == 0 || v7.u7.a(i22, 32768)) {
                int i23 = this.J;
                this.J = i23 + 1;
                this.H = i23;
            }
        } else if (!(k2Var instanceof org.telegram.ui.un)) {
            this.d = 0;
            this.J = 2;
            this.n = 1;
            if (biVar.N1) {
                this.J = 3;
                this.s = 2;
            }
        } else if (biVar.B3 != null) {
            int i24 = biVar.A3;
            if (i24 == -1) {
                this.d = 0;
                this.n = 1;
                this.J = 3;
                this.s = 2;
            } else {
                if (i24 == 0) {
                    this.J = 1;
                    this.d = 0;
                }
                if (i24 == 1) {
                    int i25 = this.J;
                    this.J = i25 + 1;
                    this.n = i25;
                }
                if (i24 == 2) {
                    int i26 = this.J;
                    this.J = i26 + 1;
                    this.s = i26;
                }
            }
        } else {
            TLRPC.User j10 = ((org.telegram.ui.un) k2Var).j();
            TLRPC.Chat chat = k2Var instanceof org.telegram.ui.un ? ((org.telegram.ui.un) k2Var).e : null;
            boolean z10 = j10 != null && ((org.telegram.ui.un) k2Var).getMessagesController().M1(j10.id) > 0;
            int i27 = this.J;
            this.d = i27;
            this.J = i27 + 2;
            this.n = i27 + 1;
            if (((org.telegram.messenger.j0) org.telegram.messenger.vp.r1(i11).y7.j0.b).c && ((org.telegram.ui.un) k2Var).f4 == 0 && bi.f1(j10)) {
                int i28 = this.J;
                this.J = i28 + 1;
                this.r = i28;
            }
            boolean z11 = biVar.K3;
            if (z11) {
                int i29 = this.J;
                this.J = i29 + 1;
                this.E = i29;
            }
            if (z11) {
                org.telegram.messenger.vp.r1(i11);
                boolean z12 = org.telegram.messenger.v2.a;
                int i30 = this.J;
                this.J = i30 + 1;
                this.I = i30;
            }
            if (biVar.I3) {
                int i31 = this.J;
                this.J = i31 + 1;
                this.w = i31;
            }
            if (biVar.K3) {
                int i32 = this.J;
                this.J = i32 + 1;
                this.y = i32;
            }
            int i33 = this.J;
            int i34 = i33 + 1;
            this.J = i34;
            this.s = i33;
            if (biVar.J3) {
                this.J = i33 + 2;
                this.x = i34;
            }
            if ((k2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) k2Var).f4 == 0 && j10 != null && !z10 && !j10.bot && !ag.i3.f(i11).b.isEmpty()) {
                int i35 = this.J;
                this.J = i35 + 1;
                this.D = i35;
            }
            if ((biVar.F3 || biVar.G3) && !z10 && ((chat == null || !org.telegram.messenger.w3.p0(chat)) && (k2Var instanceof org.telegram.ui.un) && !((org.telegram.ui.un) k2Var).c() && !((org.telegram.ui.un) k2Var).z())) {
                org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var;
                if (unVar.f4 != 5) {
                    this.e = this.J;
                    ArrayList arrayList = this.h;
                    arrayList.clear();
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = org.telegram.messenger.ui.b0(i11).b.bots;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i10);
                        i10++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_attach_menu) {
                            TLObject tLObject = unVar.e;
                            if (tLObject == null) {
                                tLObject = unVar.j();
                            }
                            if (org.telegram.messenger.ui.t(tL_attachMenuBot2, tLObject)) {
                                arrayList.add(tL_attachMenuBot2);
                            }
                        }
                    }
                    int size2 = arrayList.size() + this.J;
                    this.J = size2;
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
    
        if (f0.c.b(r9, android.os.Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_AUDIO" : "android.permission.READ_EXTERNAL_STORAGE") == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x023c, code lost:
    
        if (f0.c.b(r9, "android.permission.READ_CONTACTS") == 0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02f9  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i11 = this.K.D3;
        int i12 = c1Var.f;
        View view = c1Var.a;
        boolean z13 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                return;
            }
            vh vhVar = (vh) view;
            vhVar.a.getClass();
            int i13 = this.e;
            if (i10 >= i13 && i10 < this.f) {
                int i14 = i10 - i13;
                vhVar.setTag(Integer.valueOf(i14));
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.h.get(i14);
                TLRPC.User Z1 = org.telegram.messenger.vp.r1(i11).Z1(Long.valueOf(tL_attachMenuBot.bot_id));
                if (Z1 != null) {
                    gh.b bVar = vhVar.a;
                    bVar.getClass();
                    bVar.D = null;
                    bVar.E = tL_attachMenuBot;
                    bVar.O = 0;
                    bVar.P = 0L;
                    bVar.a.setText(tL_attachMenuBot.short_name);
                    bVar.c.setRoundRadius(0);
                    bVar.c.u(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f));
                    bVar.c.setLayoutParams(w7.b6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
                    bVar.M = true;
                    bVar.b(false);
                    bVar.a();
                    bVar.invalidate();
                    vhVar.b = Z1;
                    vhVar.c = tL_attachMenuBot;
                    vhVar.a.f(false, false);
                    vhVar.invalidate();
                    return;
                }
                return;
            }
            int i15 = i10 - this.J;
            vhVar.setTag(Integer.valueOf(i15));
            TLRPC.User Z12 = org.telegram.messenger.vp.r1(i11).Z1(Long.valueOf(((TLRPC.TL_topPeer) org.telegram.messenger.ui.b0(i11).j1.get(i15)).peer.user_id));
            if (Z12 == null) {
                return;
            }
            gh.b bVar2 = vhVar.a;
            bVar2.D = null;
            bVar2.E = null;
            bVar2.O = 0;
            bVar2.P = 0L;
            bVar2.a.setText(org.telegram.messenger.i5.m(0, Z12.first_name, Z12.last_name));
            if (bVar2.U == null) {
                bVar2.U = new r8((org.telegram.ui.ActionBar.p6) null);
            }
            bVar2.U.r(Z12);
            bVar2.c.e(Z12, bVar2.U);
            bVar2.c.u(-1, -1);
            bVar2.c.setRoundRadius(org.telegram.messenger.i0.L(11.33f));
            bVar2.c.setLayoutParams(w7.b6.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
            bVar2.c.setColorFilter(null);
            bVar2.M = false;
            bVar2.invalidate();
            vhVar.b = Z12;
            vhVar.c = null;
            vhVar.a.f(false, false);
            vhVar.invalidate();
            return;
        }
        wh whVar = (wh) view;
        whVar.a.getClass();
        int i16 = this.d;
        Context context = this.c;
        if (i10 != i16) {
            if (i10 == this.r) {
                whVar.a(17, org.telegram.messenger.cd.L0(2131743220, null), gh.a.N);
                whVar.setTag(17);
            } else if (i10 == this.n) {
                whVar.a(4, org.telegram.messenger.cd.L0(2131752240, null), gh.a.x);
                whVar.setTag(4);
                if (Build.VERSION.SDK_INT < 33) {
                }
            } else if (i10 == this.E) {
                whVar.a(6, org.telegram.messenger.cd.L0(2131752220, null), gh.a.D);
                whVar.setTag(6);
            } else if (i10 == this.s) {
                whVar.a(3, org.telegram.messenger.cd.L0(2131753952, null), gh.a.H);
                whVar.setTag(3);
            } else if (i10 == this.w) {
                whVar.a(9, org.telegram.messenger.cd.L0(2131747200, null), gh.a.I);
                whVar.setTag(9);
            } else {
                if (i10 != this.y) {
                    if (i10 == this.D) {
                        whVar.a(11, org.telegram.messenger.cd.L0(2131753942, null), gh.a.K);
                        whVar.setTag(11);
                    } else if (i10 == this.x) {
                        whVar.a(12, org.telegram.messenger.cd.L0(2131744134, null), gh.a.s);
                        whVar.setTag(12);
                    } else if (i10 == this.F) {
                        whVar.a(13, org.telegram.messenger.cd.L0(2131752209, null), gh.a.E);
                        whVar.setTag(13);
                    } else if (i10 == this.H) {
                        whVar.a(15, org.telegram.messenger.cd.L0(2131752226, null), gh.a.L);
                        whVar.setTag(15);
                    } else if (i10 == this.G) {
                        whVar.a(14, org.telegram.messenger.cd.L0(2131752239, null), gh.a.F);
                        whVar.setTag(14);
                    } else if (i10 == this.I) {
                        whVar.a(16, org.telegram.messenger.cd.L0(2131753983, null), gh.a.M);
                        whVar.setTag(16);
                        z10 = !org.telegram.messenger.vp.r1(i11).U4();
                        z11 = false;
                        whVar.a.e(z11 ? "!" : null, z11, false);
                        gh.b bVar3 = whVar.a;
                        if (z10 && !org.telegram.messenger.d20.i(i11).q()) {
                            z13 = true;
                        }
                        bVar3.setPremiumBadge(z13);
                    }
                    z11 = false;
                    z10 = true;
                    whVar.a.e(z11 ? "!" : null, z11, false);
                    gh.b bVar32 = whVar.a;
                    if (z10) {
                        z13 = true;
                    }
                    bVar32.setPremiumBadge(z13);
                }
                whVar.a(5, org.telegram.messenger.cd.L0(2131753979, null), gh.a.f);
                whVar.setTag(5);
            }
            z11 = false;
            z10 = false;
            whVar.a.e(z11 ? "!" : null, z11, false);
            gh.b bVar322 = whVar.a;
            if (z10) {
            }
            bVar322.setPremiumBadge(z13);
        }
        whVar.a(1, org.telegram.messenger.cd.L0(2131752238, null), gh.a.y);
        whVar.setTag(1);
        z12 = Build.VERSION.SDK_INT < 33 ? false : false;
        z11 = !z12;
        z10 = false;
        whVar.a.e(z11 ? "!" : null, z11, false);
        gh.b bVar3222 = whVar.a;
        if (z10) {
        }
        bVar3222.setPremiumBadge(z13);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        bi biVar = this.K;
        View vhVar = i10 != 0 ? new vh(biVar, context) : new wh(biVar, context);
        vhVar.setImportantForAccessibility(1);
        vhVar.setFocusable(true);
        vhVar.setLayoutParams(new s4.o0(-2, -1));
        return new ck0(vhVar);
    }

    @Override // s4.g0
    public final void y(s4.c1 c1Var) {
    }
}
