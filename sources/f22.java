// default package

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class f22 extends q59 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final /* synthetic */ i22 L;
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

    public f22(i22 i22Var, Context context) {
        this.L = i22Var;
        this.c = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return false;
    }

    @Override // y59
    public final int b() {
        int i = this.K;
        i22 i22Var = this.L;
        return (i22Var.E3 == null && (i22Var.Z1 instanceof yv1) && !i22Var.B1) ? hs6.d0(i22Var.G3).k1.size() + i : i;
    }

    @Override // y59
    public final int d(int i) {
        if (i < this.K) {
            return (i < this.e || i >= this.f) ? 0 : 1;
        }
        return 1;
    }

    @Override // y59
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
        i22 i22Var = this.L;
        if (i22Var.B1) {
            this.K = 1;
            this.d = 0;
            int i2 = i22Var.C1;
            if (i2 == 0 || iqd.a(i2, 16)) {
                int i3 = this.K;
                this.K = i3 + 1;
                this.n = i3;
            }
            int i4 = this.L.C1;
            if (i4 == 0 || iqd.a(i4, TLObject.FLAG_13)) {
                int i5 = this.K;
                this.K = i5 + 1;
                this.G = i5;
            }
            int i6 = this.L.C1;
            if (i6 == 0 || iqd.a(i6, TLObject.FLAG_14)) {
                int i7 = this.K;
                this.K = i7 + 1;
                this.H = i7;
            }
            int i8 = this.L.C1;
            if (i8 == 0 || iqd.a(i8, 8)) {
                int i9 = this.K;
                this.K = i9 + 1;
                this.s = i9;
            }
            int i10 = this.L.C1;
            if (i10 == 0 || iqd.a(i10, 64)) {
                int i11 = this.K;
                this.K = i11 + 1;
                this.F = i11;
            }
            int i12 = this.L.C1;
            if (i12 == 0 || iqd.a(i12, 32768)) {
                int i13 = this.K;
                this.K = i13 + 1;
                this.I = i13;
            }
        } else {
            d dVar = i22Var.Z1;
            if (!(dVar instanceof yv1)) {
                this.d = 0;
                this.K = 2;
                this.n = 1;
                if (i22Var.Q1) {
                    this.K = 3;
                    this.s = 2;
                }
            } else if (i22Var.E3 != null) {
                int i14 = i22Var.D3;
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
                TLRPC.User h = ((yv1) dVar).h();
                d dVar2 = this.L.Z1;
                TLRPC.Chat chat = dVar2 instanceof yv1 ? ((yv1) dVar2).e : null;
                boolean z = h != null && ((yv1) dVar2).getMessagesController().L1(h.id) > 0;
                int i16 = this.K;
                this.d = i16;
                this.K = i16 + 2;
                this.n = i16 + 1;
                if (oc7.r1(this.L.G3).l4.n0.f && ((yv1) this.L.Z1).g4 == 0 && i22.b1(h)) {
                    int i17 = this.K;
                    this.K = i17 + 1;
                    this.r = i17;
                }
                i22 i22Var2 = this.L;
                if (i22Var2.N3) {
                    int i18 = this.K;
                    this.K = i18 + 1;
                    this.F = i18;
                    oc7.r1(i22Var2.G3);
                    boolean z2 = e21.a;
                    int i19 = this.K;
                    this.K = i19 + 1;
                    this.J = i19;
                }
                i22 i22Var3 = this.L;
                if (i22Var3.L3) {
                    int i20 = this.K;
                    this.K = i20 + 1;
                    this.w = i20;
                }
                if (i22Var3.N3) {
                    int i21 = this.K;
                    this.K = i21 + 1;
                    this.y = i21;
                }
                int i22 = this.K;
                int i23 = i22 + 1;
                this.K = i23;
                this.s = i22;
                if (i22Var3.M3) {
                    this.K = i22 + 2;
                    this.x = i23;
                }
                d dVar3 = i22Var3.Z1;
                if ((dVar3 instanceof yv1) && ((yv1) dVar3).g4 == 0 && h != null && !z && !h.bot && !pz8.f(i22Var3.G3).b.isEmpty()) {
                    int i24 = this.K;
                    this.K = i24 + 1;
                    this.E = i24;
                }
                i22 i22Var4 = this.L;
                if ((i22Var4.I3 || i22Var4.J3) && !z && (chat == null || !sd2.p0(chat))) {
                    d dVar4 = this.L.Z1;
                    if ((dVar4 instanceof yv1) && !((yv1) dVar4).X7() && !((yv1) this.L.Z1).x()) {
                        yv1 yv1Var = (yv1) this.L.Z1;
                        if (yv1Var.g4 != 5) {
                            this.e = this.K;
                            this.h.clear();
                            ArrayList<TLRPC.TL_attachMenuBot> arrayList = hs6.d0(this.L.G3).b.bots;
                            int size = arrayList.size();
                            while (i < size) {
                                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i);
                                i++;
                                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                                if (tL_attachMenuBot2.show_in_attach_menu) {
                                    TLObject tLObject = yv1Var.e;
                                    if (tLObject == null) {
                                        tLObject = yv1Var.h();
                                    }
                                    if (hs6.v(tL_attachMenuBot2, tLObject)) {
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
    
        if (rs.b(r9, android.os.Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_AUDIO" : "android.permission.READ_EXTERNAL_STORAGE") == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0235, code lost:
    
        if (rs.b(r9, "android.permission.READ_CONTACTS") == 0) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02f7  */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int i2 = this.L.G3;
        int i3 = u69Var.f;
        View view = u69Var.a;
        boolean z4 = false;
        if (i3 != 0) {
            if (i3 == 1) {
                b22 b22Var = (b22) view;
                b22Var.a.getClass();
                int i4 = this.e;
                if (i >= i4 && i < this.f) {
                    int i5 = i - i4;
                    b22Var.setTag(Integer.valueOf(i5));
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.h.get(i5);
                    TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(tL_attachMenuBot.bot_id));
                    if (W1 != null) {
                        qz4 qz4Var = b22Var.a;
                        qz4Var.getClass();
                        qz4Var.E = null;
                        qz4Var.F = tL_attachMenuBot;
                        qz4Var.P = 0;
                        qz4Var.Q = 0L;
                        qz4Var.a.setText(tL_attachMenuBot.short_name);
                        qz4Var.c.setRoundRadius(0);
                        qz4Var.c.t(gm.L(24.0f), gm.L(24.0f));
                        qz4Var.c.setLayoutParams(qoe.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
                        qz4Var.N = true;
                        qz4Var.b(false);
                        qz4Var.a();
                        qz4Var.invalidate();
                        b22Var.b = W1;
                        b22Var.c = tL_attachMenuBot;
                        b22Var.a.f(false, false);
                        b22Var.invalidate();
                        return;
                    }
                    return;
                }
                int i6 = i - this.K;
                b22Var.setTag(Integer.valueOf(i6));
                TLRPC.User W12 = oc7.r1(i2).W1(Long.valueOf(((TLRPC.TL_topPeer) hs6.d0(i2).k1.get(i6)).peer.user_id));
                if (W12 == null) {
                    return;
                }
                qz4 qz4Var2 = b22Var.a;
                qz4Var2.E = null;
                qz4Var2.F = null;
                qz4Var2.P = 0;
                qz4Var2.Q = 0L;
                qz4Var2.a.setText(bw2.m(0, W12.first_name, W12.last_name));
                pc0 pc0Var = qz4Var2.V;
                if (pc0Var == null) {
                    pc0Var = new pc0((ylb) null);
                    qz4Var2.V = pc0Var;
                }
                pc0Var.q(W12);
                qz4Var2.c.f(W12, qz4Var2.V);
                qz4Var2.c.t(-1, -1);
                qz4Var2.c.setRoundRadius(gm.L(11.33f));
                qz4Var2.c.setLayoutParams(qoe.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
                qz4Var2.c.setColorFilter(null);
                qz4Var2.N = false;
                qz4Var2.invalidate();
                b22Var.b = W12;
                b22Var.c = null;
                b22Var.a.f(false, false);
                b22Var.invalidate();
                return;
            }
            return;
        }
        c22 c22Var = (c22) view;
        c22Var.a.getClass();
        int i7 = this.d;
        Context context = this.c;
        if (i != i7) {
            if (i == this.r) {
                c22Var.a(17, jb6.M0(2131742877, null), pz4.N);
                c22Var.setTag(17);
            } else if (i == this.n) {
                c22Var.a(4, jb6.M0(2131752177, null), pz4.w);
                c22Var.setTag(4);
                if (Build.VERSION.SDK_INT < 33) {
                }
            } else if (i == this.F) {
                c22Var.a(6, jb6.M0(2131752157, null), pz4.y);
                c22Var.setTag(6);
            } else if (i == this.s) {
                c22Var.a(3, jb6.M0(2131753917, null), pz4.H);
                c22Var.setTag(3);
            } else if (i == this.w) {
                c22Var.a(9, jb6.M0(2131746918, null), pz4.I);
                c22Var.setTag(9);
            } else {
                if (i != this.y) {
                    if (i == this.E) {
                        c22Var.a(11, jb6.M0(2131753907, null), pz4.K);
                        c22Var.setTag(11);
                    } else if (i == this.x) {
                        c22Var.a(12, jb6.M0(2131743794, null), pz4.r);
                        c22Var.setTag(12);
                    } else if (i == this.G) {
                        c22Var.a(13, jb6.M0(2131752146, null), pz4.E);
                        c22Var.setTag(13);
                    } else if (i == this.I) {
                        c22Var.a(15, jb6.M0(2131752163, null), pz4.L);
                        c22Var.setTag(15);
                    } else if (i == this.H) {
                        c22Var.a(14, jb6.M0(2131752176, null), pz4.F);
                        c22Var.setTag(14);
                    } else if (i == this.J) {
                        c22Var.a(16, jb6.M0(2131753948, null), pz4.M);
                        c22Var.setTag(16);
                        z = !oc7.r1(i2).f5();
                        z2 = false;
                        c22Var.a.e(z2 ? "!" : null, z2, false);
                        qz4 qz4Var3 = c22Var.a;
                        if (z && !z8c.h(i2).p()) {
                            z4 = true;
                        }
                        qz4Var3.setPremiumBadge(z4);
                    }
                    z2 = false;
                    z = true;
                    c22Var.a.e(z2 ? "!" : null, z2, false);
                    qz4 qz4Var32 = c22Var.a;
                    if (z) {
                        z4 = true;
                    }
                    qz4Var32.setPremiumBadge(z4);
                }
                c22Var.a(5, jb6.M0(2131753944, null), pz4.f);
                c22Var.setTag(5);
            }
            z2 = false;
            z = false;
            c22Var.a.e(z2 ? "!" : null, z2, false);
            qz4 qz4Var322 = c22Var.a;
            if (z) {
            }
            qz4Var322.setPremiumBadge(z4);
        }
        c22Var.a(1, jb6.M0(2131752175, null), pz4.x);
        c22Var.setTag(1);
        z3 = Build.VERSION.SDK_INT < 33 ? false : false;
        z2 = !z3;
        z = false;
        c22Var.a.e(z2 ? "!" : null, z2, false);
        qz4 qz4Var3222 = c22Var.a;
        if (z) {
        }
        qz4Var3222.setPremiumBadge(z4);
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        Context context = this.c;
        i22 i22Var = this.L;
        View b22Var = i != 0 ? new b22(i22Var, context) : new c22(i22Var, context);
        b22Var.setImportantForAccessibility(1);
        b22Var.setFocusable(true);
        b22Var.setLayoutParams(new g69(-2, -1));
        return new b59(b22Var);
    }

    @Override // y59
    public final void y(u69 u69Var) {
    }
}
