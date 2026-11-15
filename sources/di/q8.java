package di;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class q8 {
    public final org.telegram.ui.ActionBar.e2 a;
    public final long b;
    public final org.telegram.ui.Components.xb c;
    public final org.telegram.ui.Components.rb d;
    public final org.telegram.ui.Components.vb e;
    public final u8 f;
    public int g;
    public long h;
    public t7 i;
    public final ArrayList j = new ArrayList();
    public final HashSet k = new HashSet();
    public final long l = System.currentTimeMillis();
    public boolean m = true;
    public boolean n;
    public boolean o;
    public final p8 p;

    /* JADX WARN: Type inference failed for: r2v0, types: [di.p8, java.lang.Runnable] */
    public q8(org.telegram.ui.ActionBar.e2 e2Var, long j3) {
        final int i7 = 0;
        ?? r22 = new Runnable(this) { // from class: di.p8
            public final /* synthetic */ q8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        this.b.a();
                        break;
                    default:
                        q8 q8Var = this.b;
                        if (!q8Var.n && !q8Var.o && q8Var.m) {
                            q8Var.n = true;
                            t7 t7Var = q8Var.i;
                            if (t7Var != null) {
                                t7Var.a(q8Var.k);
                            }
                            if (q8Var.e != null) {
                                q8Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.p = r22;
        this.a = e2Var;
        this.b = j3;
        Context t6 = v8.t(e2Var);
        org.telegram.ui.Components.rb rbVar = new org.telegram.ui.Components.rb(t6, e2Var.getResourceProvider());
        this.d = rbVar;
        rbVar.c(R.raw.stars_topup, new String[0]);
        u8 u8Var = new u8(t6, e2Var.getResourceProvider());
        this.f = u8Var;
        u8Var.b = 3000L;
        int i10 = org.telegram.ui.ActionBar.j6.xj;
        org.telegram.ui.ActionBar.e6 resourceProvider = e2Var.getResourceProvider();
        o oVar = new o(3);
        o oVar2 = new o(4);
        int P = org.telegram.ui.ActionBar.q6.P(i10, -1, 0, 0.0f, resourceProvider);
        oVar2.f(P, u8Var);
        org.telegram.ui.ActionBar.k6 w10 = org.telegram.ui.ActionBar.q6.w(101, u8Var);
        w10.c(i10, -1, 0, 0.0f, resourceProvider);
        w10.n = oVar;
        w10.o = oVar2;
        w10.m = false;
        w10.g = P;
        final int i11 = 1;
        org.telegram.ui.Components.vb vbVar = new org.telegram.ui.Components.vb(t6, e2Var.getResourceProvider(), true, false);
        this.e = vbVar;
        vbVar.e(hd.M0(2131745023, null));
        vbVar.b = new Runnable(this) { // from class: di.p8
            public final /* synthetic */ q8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.a();
                        break;
                    default:
                        q8 q8Var = this.b;
                        if (!q8Var.n && !q8Var.o && q8Var.m) {
                            q8Var.n = true;
                            t7 t7Var = q8Var.i;
                            if (t7Var != null) {
                                t7Var.a(q8Var.k);
                            }
                            if (q8Var.e != null) {
                                q8Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        vbVar.addView(u8Var, c8.ja.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        vbVar.e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        rbVar.setButton(vbVar);
        org.telegram.ui.Components.xb b10 = org.telegram.ui.Components.cc.a0(e2Var).b(rbVar, -1);
        this.c = b10;
        b10.r = false;
        b10.k(true);
        b10.v = new Runnable(this) { // from class: di.p8
            public final /* synthetic */ q8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        this.b.a();
                        break;
                    default:
                        q8 q8Var = this.b;
                        if (!q8Var.n && !q8Var.o && q8Var.m) {
                            q8Var.n = true;
                            t7 t7Var = q8Var.i;
                            if (t7Var != null) {
                                t7Var.a(q8Var.k);
                            }
                            if (q8Var.e != null) {
                                q8Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        org.telegram.messenger.g0.r(r22);
        org.telegram.messenger.g0.i3(r22, 3000L);
    }

    public final void a() {
        if (this.n || this.o) {
            return;
        }
        this.o = true;
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
        if (this.e != null) {
            this.c.b();
        }
    }
}
