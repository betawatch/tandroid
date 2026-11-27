// default package

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class k12 extends c79 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final /* synthetic */ n12 L;
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

    public k12(n12 n12Var, Context context) {
        this.L = n12Var;
        this.c = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return false;
    }

    @Override // j79
    public final int b() {
        int i = this.K;
        n12 n12Var = this.L;
        return (n12Var.E3 == null && (n12Var.Z1 instanceof zu1) && !n12Var.B1) ? ls6.d0(n12Var.G3).k1.size() + i : i;
    }

    @Override // j79
    public final int d(int i) {
        if (i < this.K) {
            return (i < this.e || i >= this.f) ? 0 : 1;
        }
        return 1;
    }

    @Override // j79
    public final void f() {
        int i = 0;
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
        n12 n12Var = this.L;
        if (n12Var.B1) {
            this.K = 1;
            this.d = 0;
            int i2 = n12Var.C1;
            if (i2 == 0 || vsd.a(i2, 16)) {
                int i3 = this.K;
                this.K = i3 + 1;
                this.n = i3;
            }
            int i4 = this.L.C1;
            if (i4 == 0 || vsd.a(i4, TLObject.FLAG_13)) {
                int i5 = this.K;
                this.K = i5 + 1;
                this.G = i5;
            }
            int i6 = this.L.C1;
            if (i6 == 0 || vsd.a(i6, TLObject.FLAG_14)) {
                int i7 = this.K;
                this.K = i7 + 1;
                this.H = i7;
            }
            int i8 = this.L.C1;
            if (i8 == 0 || vsd.a(i8, 8)) {
                int i9 = this.K;
                this.K = i9 + 1;
                this.s = i9;
            }
            int i10 = this.L.C1;
            if (i10 == 0 || vsd.a(i10, 64)) {
                int i11 = this.K;
                this.K = i11 + 1;
                this.F = i11;
            }
            int i12 = this.L.C1;
            if (i12 == 0 || vsd.a(i12, 32768)) {
                int i13 = this.K;
                this.K = i13 + 1;
                this.I = i13;
            }
        } else {
            e eVar = n12Var.Z1;
            if (!(eVar instanceof zu1)) {
                this.d = 0;
                this.K = 2;
                this.n = 1;
                if (n12Var.Q1) {
                    this.K = 3;
                    this.s = 2;
                }
            } else if (n12Var.E3 != null) {
                int i14 = n12Var.D3;
                if (i14 == -1) {
                    this.d = 0;
                    this.n = 1;
                    this.K = 3;
                    this.s = 2;
                } else {
                    if (i14 == 0) {
                        this.K = 1;
                        this.d = 0;
                        i = 1;
                    }
                    if (i14 == 1) {
                        int i15 = i + 1;
                        this.K = i15;
                        this.n = i;
                        i = i15;
                    }
                    if (i14 == 2) {
                        this.K = i + 1;
                        this.s = i;
                    }
                }
            } else {
                TLRPC.User h = ((zu1) eVar).h();
                e eVar2 = this.L.Z1;
                TLRPC.Chat chat = eVar2 instanceof zu1 ? ((zu1) eVar2).e : null;
                boolean z = h != null && ((zu1) eVar2).getMessagesController().M1(h.id) > 0;
                int i16 = this.K;
                this.d = i16;
                this.K = i16 + 2;
                this.n = i16 + 1;
                if (uc7.s1(this.L.G3).l4.v0.f && ((zu1) this.L.Z1).g4 == 0 && n12.c1(h)) {
                    int i17 = this.K;
                    this.K = i17 + 1;
                    this.r = i17;
                }
                n12 n12Var2 = this.L;
                if (n12Var2.N3) {
                    int i18 = this.K;
                    this.K = i18 + 1;
                    this.F = i18;
                    uc7.s1(n12Var2.G3);
                    boolean z2 = f11.a;
                    int i19 = this.K;
                    this.K = i19 + 1;
                    this.J = i19;
                }
                n12 n12Var3 = this.L;
                if (n12Var3.L3) {
                    int i20 = this.K;
                    this.K = i20 + 1;
                    this.w = i20;
                }
                if (n12Var3.N3) {
                    int i21 = this.K;
                    this.K = i21 + 1;
                    this.y = i21;
                }
                int i22 = this.K;
                int i23 = i22 + 1;
                this.K = i23;
                this.s = i22;
                if (n12Var3.M3) {
                    this.K = i22 + 2;
                    this.x = i23;
                }
                e eVar3 = n12Var3.Z1;
                if ((eVar3 instanceof zu1) && ((zu1) eVar3).g4 == 0 && h != null && !z && !h.bot && !b19.f(n12Var3.G3).b.isEmpty()) {
                    int i24 = this.K;
                    this.K = i24 + 1;
                    this.E = i24;
                }
                n12 n12Var4 = this.L;
                if ((n12Var4.I3 || n12Var4.J3) && !z && (chat == null || !xc2.p0(chat))) {
                    e eVar4 = this.L.Z1;
                    if ((eVar4 instanceof zu1) && !((zu1) eVar4).X7() && !((zu1) this.L.Z1).y()) {
                        zu1 zu1Var = (zu1) this.L.Z1;
                        if (zu1Var.g4 != 5) {
                            this.e = this.K;
                            this.h.clear();
                            ArrayList<TLRPC.TL_attachMenuBot> arrayList = ls6.d0(this.L.G3).b.bots;
                            int size = arrayList.size();
                            while (i < size) {
                                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i);
                                i++;
                                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                                if (tL_attachMenuBot2.show_in_attach_menu) {
                                    TLObject tLObject = zu1Var.e;
                                    if (tLObject == null) {
                                        tLObject = zu1Var.h();
                                    }
                                    if (ls6.v(tL_attachMenuBot2, tLObject)) {
                                        this.h.add(tL_attachMenuBot2);
                                    }
                                }
                            }
                            int size2 = this.h.size() + this.K;
                            this.K = size2;
                            this.f = size2;
                        }
                    }
                }
            }
        }
        super.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0237, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01f9, code lost:
    
        if (sr.b(r9, android.os.Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_AUDIO" : "android.permission.READ_EXTERNAL_STORAGE") == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0235, code lost:
    
        if (sr.b(r9, "android.permission.READ_CONTACTS") == 0) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02f7  */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int i2 = this.L.G3;
        int i3 = f89Var.f;
        View view = f89Var.a;
        boolean z4 = false;
        if (i3 != 0) {
            if (i3 == 1) {
                g12 g12Var = (g12) view;
                g12Var.a.getClass();
                int i4 = this.e;
                if (i >= i4 && i < this.f) {
                    int i5 = i - i4;
                    g12Var.setTag(Integer.valueOf(i5));
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.h.get(i5);
                    TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(tL_attachMenuBot.bot_id));
                    if (X1 != null) {
                        uz4 uz4Var = g12Var.a;
                        uz4Var.getClass();
                        uz4Var.E = null;
                        uz4Var.F = tL_attachMenuBot;
                        uz4Var.P = 0;
                        uz4Var.Q = 0L;
                        uz4Var.a.setText(tL_attachMenuBot.short_name);
                        uz4Var.c.setRoundRadius(0);
                        uz4Var.c.t(hl.L(24.0f), hl.L(24.0f));
                        uz4Var.c.setLayoutParams(tre.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
                        uz4Var.N = true;
                        uz4Var.b(false);
                        uz4Var.a();
                        uz4Var.invalidate();
                        g12Var.b = X1;
                        g12Var.c = tL_attachMenuBot;
                        g12Var.a.f(false, false);
                        g12Var.invalidate();
                        return;
                    }
                    return;
                }
                int i6 = i - this.K;
                g12Var.setTag(Integer.valueOf(i6));
                TLRPC.User X12 = uc7.s1(i2).X1(Long.valueOf(((TLRPC.TL_topPeer) ls6.d0(i2).k1.get(i6)).peer.user_id));
                if (X12 == null) {
                    return;
                }
                uz4 uz4Var2 = g12Var.a;
                uz4Var2.E = null;
                uz4Var2.F = null;
                uz4Var2.P = 0;
                uz4Var2.Q = 0L;
                uz4Var2.a.setText(lv2.m(0, X12.first_name, X12.last_name));
                rb0 rb0Var = uz4Var2.V;
                if (rb0Var == null) {
                    rb0Var = new rb0((vnb) null);
                    uz4Var2.V = rb0Var;
                }
                rb0Var.q(X12);
                uz4Var2.c.f(X12, uz4Var2.V);
                uz4Var2.c.t(-1, -1);
                uz4Var2.c.setRoundRadius(hl.L(11.33f));
                uz4Var2.c.setLayoutParams(tre.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
                uz4Var2.c.setColorFilter(null);
                uz4Var2.N = false;
                uz4Var2.invalidate();
                g12Var.b = X12;
                g12Var.c = null;
                g12Var.a.f(false, false);
                g12Var.invalidate();
                return;
            }
            return;
        }
        h12 h12Var = (h12) view;
        h12Var.a.getClass();
        int i7 = this.d;
        Context context = this.c;
        if (i != i7) {
            if (i == this.r) {
                h12Var.a(17, ob6.M0(2131742845, null), tz4.P);
                h12Var.setTag(17);
            } else if (i == this.n) {
                h12Var.a(4, ob6.M0(2131752205, null), tz4.y);
                h12Var.setTag(4);
                if (Build.VERSION.SDK_INT < 33) {
                }
            } else if (i == this.F) {
                h12Var.a(6, ob6.M0(2131752185, null), tz4.F);
                h12Var.setTag(6);
            } else if (i == this.s) {
                h12Var.a(3, ob6.M0(2131753945, null), tz4.J);
                h12Var.setTag(3);
            } else if (i == this.w) {
                h12Var.a(9, ob6.M0(2131746912, null), tz4.K);
                h12Var.setTag(9);
            } else {
                if (i != this.y) {
                    if (i == this.E) {
                        h12Var.a(11, ob6.M0(2131753935, null), tz4.M);
                        h12Var.setTag(11);
                    } else if (i == this.x) {
                        h12Var.a(12, ob6.M0(2131743762, null), tz4.w);
                        h12Var.setTag(12);
                    } else if (i == this.G) {
                        h12Var.a(13, ob6.M0(2131752174, null), tz4.G);
                        h12Var.setTag(13);
                    } else if (i == this.I) {
                        h12Var.a(15, ob6.M0(2131752191, null), tz4.N);
                        h12Var.setTag(15);
                    } else if (i == this.H) {
                        h12Var.a(14, ob6.M0(2131752204, null), tz4.H);
                        h12Var.setTag(14);
                    } else if (i == this.J) {
                        h12Var.a(16, ob6.M0(2131753976, null), tz4.O);
                        h12Var.setTag(16);
                        z = !uc7.s1(i2).l5();
                        z2 = false;
                        h12Var.a.e(z2 ? "!" : null, z2, false);
                        uz4 uz4Var3 = h12Var.a;
                        if (z && !yac.h(i2).p()) {
                            z4 = true;
                        }
                        uz4Var3.setPremiumBadge(z4);
                    }
                    z2 = false;
                    z = true;
                    h12Var.a.e(z2 ? "!" : null, z2, false);
                    uz4 uz4Var32 = h12Var.a;
                    if (z) {
                        z4 = true;
                    }
                    uz4Var32.setPremiumBadge(z4);
                }
                h12Var.a(5, ob6.M0(2131753972, null), tz4.f);
                h12Var.setTag(5);
            }
            z2 = false;
            z = false;
            h12Var.a.e(z2 ? "!" : null, z2, false);
            uz4 uz4Var322 = h12Var.a;
            if (z) {
            }
            uz4Var322.setPremiumBadge(z4);
        }
        h12Var.a(1, ob6.M0(2131752203, null), tz4.E);
        h12Var.setTag(1);
        z3 = Build.VERSION.SDK_INT < 33 ? false : false;
        z2 = !z3;
        z = false;
        h12Var.a.e(z2 ? "!" : null, z2, false);
        uz4 uz4Var3222 = h12Var.a;
        if (z) {
        }
        uz4Var3222.setPremiumBadge(z4);
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        Context context = this.c;
        n12 n12Var = this.L;
        View g12Var = i != 0 ? new g12(n12Var, context) : new h12(n12Var, context);
        g12Var.setImportantForAccessibility(1);
        g12Var.setFocusable(true);
        g12Var.setLayoutParams(new r79(-2, -1));
        return new n69(g12Var);
    }

    @Override // j79
    public final void y(f89 f89Var) {
    }
}
