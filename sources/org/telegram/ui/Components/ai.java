package org.telegram.ui.Components;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class ai extends oj0 {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public final /* synthetic */ di K;
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

    public ai(di diVar, Context context) {
        this.K = diVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override // v4.g0
    public final int b() {
        int i7 = this.J;
        di diVar = this.K;
        return (diVar.B3 == null && (diVar.W1 instanceof org.telegram.ui.an) && !diVar.y1) ? org.telegram.messenger.ui.b0(diVar.D3).j1.size() + i7 : i7;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (i7 < this.J) {
            return (i7 < this.e || i7 >= this.f) ? 0 : 1;
        }
        return 1;
    }

    @Override // v4.g0
    public final void f() {
        int i7 = 0;
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
        di diVar = this.K;
        int i10 = diVar.D3;
        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
        if (diVar.y1) {
            this.J = 1;
            this.d = 0;
            int i11 = diVar.z1;
            if (i11 == 0 || c8.zc.a(i11, 16)) {
                int i12 = this.J;
                this.J = i12 + 1;
                this.n = i12;
            }
            int i13 = diVar.z1;
            if (i13 == 0 || c8.zc.a(i13, TLObject.FLAG_13)) {
                int i14 = this.J;
                this.J = i14 + 1;
                this.F = i14;
            }
            int i15 = diVar.z1;
            if (i15 == 0 || c8.zc.a(i15, TLObject.FLAG_14)) {
                int i16 = this.J;
                this.J = i16 + 1;
                this.G = i16;
            }
            int i17 = diVar.z1;
            if (i17 == 0 || c8.zc.a(i17, 8)) {
                int i18 = this.J;
                this.J = i18 + 1;
                this.s = i18;
            }
            int i19 = diVar.z1;
            if (i19 == 0 || c8.zc.a(i19, 64)) {
                int i20 = this.J;
                this.J = i20 + 1;
                this.E = i20;
            }
            int i21 = diVar.z1;
            if (i21 == 0 || c8.zc.a(i21, 32768)) {
                int i22 = this.J;
                this.J = i22 + 1;
                this.H = i22;
            }
        } else if (!(f2Var instanceof org.telegram.ui.an)) {
            this.d = 0;
            this.J = 2;
            this.n = 1;
            if (diVar.N1) {
                this.J = 3;
                this.s = 2;
            }
        } else if (diVar.B3 != null) {
            int i23 = diVar.A3;
            if (i23 == -1) {
                this.d = 0;
                this.n = 1;
                this.J = 3;
                this.s = 2;
            } else {
                if (i23 == 0) {
                    this.J = 1;
                    this.d = 0;
                }
                if (i23 == 1) {
                    int i24 = this.J;
                    this.J = i24 + 1;
                    this.n = i24;
                }
                if (i23 == 2) {
                    int i25 = this.J;
                    this.J = i25 + 1;
                    this.s = i25;
                }
            }
        } else {
            TLRPC.User j3 = ((org.telegram.ui.an) f2Var).j();
            TLRPC.Chat chat = f2Var instanceof org.telegram.ui.an ? ((org.telegram.ui.an) f2Var).e : null;
            boolean z9 = j3 != null && ((org.telegram.ui.an) f2Var).getMessagesController().N1(j3.id) > 0;
            int i26 = this.J;
            this.d = i26;
            this.J = i26 + 2;
            this.n = i26 + 1;
            if (((org.telegram.messenger.h0) org.telegram.messenger.qp.s1(i10).x7.j0.b).c && ((org.telegram.ui.an) f2Var).f4 == 0 && di.g1(j3)) {
                int i27 = this.J;
                this.J = i27 + 1;
                this.r = i27;
            }
            boolean z10 = diVar.K3;
            if (z10) {
                int i28 = this.J;
                this.J = i28 + 1;
                this.E = i28;
            }
            if (z10) {
                org.telegram.messenger.qp.s1(i10);
                boolean z11 = org.telegram.messenger.r2.a;
                int i29 = this.J;
                this.J = i29 + 1;
                this.I = i29;
            }
            if (diVar.I3) {
                int i30 = this.J;
                this.J = i30 + 1;
                this.w = i30;
            }
            if (diVar.K3) {
                int i31 = this.J;
                this.J = i31 + 1;
                this.y = i31;
            }
            int i32 = this.J;
            int i33 = i32 + 1;
            this.J = i33;
            this.s = i32;
            if (diVar.J3) {
                this.J = i32 + 2;
                this.x = i33;
            }
            if ((f2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) f2Var).f4 == 0 && j3 != null && !z9 && !j3.bot && !kg.t1.f(i10).b.isEmpty()) {
                int i34 = this.J;
                this.J = i34 + 1;
                this.D = i34;
            }
            if ((diVar.F3 || diVar.G3) && !z9 && ((chat == null || !org.telegram.messenger.t3.p0(chat)) && (f2Var instanceof org.telegram.ui.an) && !((org.telegram.ui.an) f2Var).c() && !((org.telegram.ui.an) f2Var).z())) {
                org.telegram.ui.an anVar = (org.telegram.ui.an) f2Var;
                if (anVar.f4 != 5) {
                    this.e = this.J;
                    ArrayList arrayList = this.h;
                    arrayList.clear();
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = org.telegram.messenger.ui.b0(i10).b.bots;
                    int size = arrayList2.size();
                    while (i7 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i7);
                        i7++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_attach_menu) {
                            TLObject tLObject = anVar.e;
                            if (tLObject == null) {
                                tLObject = anVar.j();
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
    
        if (f0.d.b(r9, android.os.Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_AUDIO" : "android.permission.READ_EXTERNAL_STORAGE") == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x023c, code lost:
    
        if (f0.d.b(r9, "android.permission.READ_CONTACTS") == 0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02f9  */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        boolean z10;
        boolean z11;
        int i10 = this.K.D3;
        int i11 = d1Var.f;
        View view = d1Var.a;
        boolean z12 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            wh whVar = (wh) view;
            whVar.a.getClass();
            int i12 = this.e;
            if (i7 >= i12 && i7 < this.f) {
                int i13 = i7 - i12;
                whVar.setTag(Integer.valueOf(i13));
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.h.get(i13);
                TLRPC.User a22 = org.telegram.messenger.qp.s1(i10).a2(Long.valueOf(tL_attachMenuBot.bot_id));
                if (a22 != null) {
                    qh.b bVar = whVar.a;
                    bVar.getClass();
                    bVar.D = null;
                    bVar.E = tL_attachMenuBot;
                    bVar.O = 0;
                    bVar.P = 0L;
                    bVar.a.setText(tL_attachMenuBot.short_name);
                    bVar.c.setRoundRadius(0);
                    bVar.c.u(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
                    bVar.c.setLayoutParams(c8.ha.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
                    bVar.M = true;
                    bVar.b(false);
                    bVar.a();
                    bVar.invalidate();
                    whVar.b = a22;
                    whVar.c = tL_attachMenuBot;
                    whVar.a.f(false, false);
                    whVar.invalidate();
                    return;
                }
                return;
            }
            int i14 = i7 - this.J;
            whVar.setTag(Integer.valueOf(i14));
            TLRPC.User a23 = org.telegram.messenger.qp.s1(i10).a2(Long.valueOf(((TLRPC.TL_topPeer) org.telegram.messenger.ui.b0(i10).j1.get(i14)).peer.user_id));
            if (a23 == null) {
                return;
            }
            qh.b bVar2 = whVar.a;
            bVar2.D = null;
            bVar2.E = null;
            bVar2.O = 0;
            bVar2.P = 0L;
            bVar2.a.setText(org.telegram.messenger.g5.m(0, a23.first_name, a23.last_name));
            if (bVar2.U == null) {
                bVar2.U = new w8((org.telegram.ui.ActionBar.f6) null);
            }
            bVar2.U.r(a23);
            bVar2.c.e(a23, bVar2.U);
            bVar2.c.u(-1, -1);
            bVar2.c.setRoundRadius(org.telegram.messenger.g0.L(11.33f));
            bVar2.c.setLayoutParams(c8.ha.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
            bVar2.c.setColorFilter(null);
            bVar2.M = false;
            bVar2.invalidate();
            whVar.b = a23;
            whVar.c = null;
            whVar.a.f(false, false);
            whVar.invalidate();
            return;
        }
        xh xhVar = (xh) view;
        xhVar.a.getClass();
        int i15 = this.d;
        Context context = this.c;
        if (i7 != i15) {
            if (i7 == this.r) {
                xhVar.a(17, org.telegram.messenger.id.M0(2131743197, null), qh.a.N);
                xhVar.setTag(17);
            } else if (i7 == this.n) {
                xhVar.a(4, org.telegram.messenger.id.M0(2131752240, null), qh.a.x);
                xhVar.setTag(4);
                if (Build.VERSION.SDK_INT < 33) {
                }
            } else if (i7 == this.E) {
                xhVar.a(6, org.telegram.messenger.id.M0(2131752220, null), qh.a.D);
                xhVar.setTag(6);
            } else if (i7 == this.s) {
                xhVar.a(3, org.telegram.messenger.id.M0(2131753952, null), qh.a.H);
                xhVar.setTag(3);
            } else if (i7 == this.w) {
                xhVar.a(9, org.telegram.messenger.id.M0(2131747186, null), qh.a.I);
                xhVar.setTag(9);
            } else {
                if (i7 != this.y) {
                    if (i7 == this.D) {
                        xhVar.a(11, org.telegram.messenger.id.M0(2131753942, null), qh.a.K);
                        xhVar.setTag(11);
                    } else if (i7 == this.x) {
                        xhVar.a(12, org.telegram.messenger.id.M0(2131744112, null), qh.a.s);
                        xhVar.setTag(12);
                    } else if (i7 == this.F) {
                        xhVar.a(13, org.telegram.messenger.id.M0(2131752209, null), qh.a.E);
                        xhVar.setTag(13);
                    } else if (i7 == this.H) {
                        xhVar.a(15, org.telegram.messenger.id.M0(2131752226, null), qh.a.L);
                        xhVar.setTag(15);
                    } else if (i7 == this.G) {
                        xhVar.a(14, org.telegram.messenger.id.M0(2131752239, null), qh.a.F);
                        xhVar.setTag(14);
                    } else if (i7 == this.I) {
                        xhVar.a(16, org.telegram.messenger.id.M0(2131753983, null), qh.a.M);
                        xhVar.setTag(16);
                        z9 = !org.telegram.messenger.qp.s1(i10).X4();
                        z10 = false;
                        xhVar.a.e(z10 ? "!" : null, z10, false);
                        qh.b bVar3 = xhVar.a;
                        if (z9 && !org.telegram.messenger.p10.i(i10).q()) {
                            z12 = true;
                        }
                        bVar3.setPremiumBadge(z12);
                    }
                    z10 = false;
                    z9 = true;
                    xhVar.a.e(z10 ? "!" : null, z10, false);
                    qh.b bVar32 = xhVar.a;
                    if (z9) {
                        z12 = true;
                    }
                    bVar32.setPremiumBadge(z12);
                }
                xhVar.a(5, org.telegram.messenger.id.M0(2131753979, null), qh.a.f);
                xhVar.setTag(5);
            }
            z10 = false;
            z9 = false;
            xhVar.a.e(z10 ? "!" : null, z10, false);
            qh.b bVar322 = xhVar.a;
            if (z9) {
            }
            bVar322.setPremiumBadge(z12);
        }
        xhVar.a(1, org.telegram.messenger.id.M0(2131752238, null), qh.a.y);
        xhVar.setTag(1);
        z11 = Build.VERSION.SDK_INT < 33 ? false : false;
        z10 = !z11;
        z9 = false;
        xhVar.a.e(z10 ? "!" : null, z10, false);
        qh.b bVar3222 = xhVar.a;
        if (z9) {
        }
        bVar3222.setPremiumBadge(z12);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        Context context = this.c;
        di diVar = this.K;
        View whVar = i7 != 0 ? new wh(diVar, context) : new xh(diVar, context);
        whVar.setImportantForAccessibility(1);
        whVar.setFocusable(true);
        whVar.setLayoutParams(new v4.o0(-2, -1));
        return new xi0(whVar);
    }

    @Override // v4.g0
    public final void y(v4.d1 d1Var) {
    }
}
