package di;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class t8 {
    public final org.telegram.ui.ActionBar.g2 a;
    public final long b;
    public final org.telegram.ui.Components.fc c;
    public final org.telegram.ui.Components.zb d;
    public final org.telegram.ui.Components.dc e;
    public final x8 f;
    public int g;
    public long h;
    public ai.o2 i;
    public final ArrayList j = new ArrayList();
    public final HashSet k = new HashSet();
    public final long l = System.currentTimeMillis();
    public boolean m = true;
    public boolean n;
    public boolean o;
    public final s8 p;

    /* JADX WARN: Type inference failed for: r2v0, types: [di.s8, java.lang.Runnable] */
    public t8(org.telegram.ui.ActionBar.g2 g2Var, long j3) {
        final int i7 = 1;
        final int i10 = 0;
        ?? r22 = new Runnable(this) { // from class: di.s8
            public final /* synthetic */ t8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.a();
                        break;
                    default:
                        t8 t8Var = this.b;
                        if (!t8Var.n && !t8Var.o && t8Var.m) {
                            t8Var.n = true;
                            ai.o2 o2Var = t8Var.i;
                            if (o2Var != null) {
                                o2Var.a(t8Var.k);
                            }
                            if (t8Var.e != null) {
                                t8Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.p = r22;
        this.a = g2Var;
        this.b = j3;
        Context t6 = y8.t(g2Var);
        org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(t6, g2Var.getResourceProvider());
        this.d = zbVar;
        zbVar.a.f(R.raw.stars_topup, 32, 32, null);
        x8 x8Var = new x8(t6, g2Var.getResourceProvider());
        this.f = x8Var;
        x8Var.b = 3000L;
        int i11 = org.telegram.ui.ActionBar.n6.xj;
        org.telegram.ui.ActionBar.i6 resourceProvider = g2Var.getResourceProvider();
        ci.v vVar = new ci.v(4);
        ci.v vVar2 = new ci.v(5);
        int P = org.telegram.ui.ActionBar.u6.P(i11, -1, 0, 0.0f, resourceProvider);
        vVar2.g(P, x8Var);
        org.telegram.ui.ActionBar.o6 w10 = org.telegram.ui.ActionBar.u6.w(101, x8Var);
        w10.c(i11, -1, 0, 0.0f, resourceProvider);
        w10.n = vVar;
        w10.o = vVar2;
        w10.m = false;
        w10.g = P;
        org.telegram.ui.Components.dc dcVar = new org.telegram.ui.Components.dc(t6, g2Var.getResourceProvider(), true, false);
        this.e = dcVar;
        dcVar.e(gd.N0(2131744782, null));
        dcVar.b = new Runnable(this) { // from class: di.s8
            public final /* synthetic */ t8 b;

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
                        t8 t8Var = this.b;
                        if (!t8Var.n && !t8Var.o && t8Var.m) {
                            t8Var.n = true;
                            ai.o2 o2Var = t8Var.i;
                            if (o2Var != null) {
                                o2Var.a(t8Var.k);
                            }
                            if (t8Var.e != null) {
                                t8Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        dcVar.addView(x8Var, c8.na.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        dcVar.e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        zbVar.setButton(dcVar);
        org.telegram.ui.Components.fc b10 = org.telegram.ui.Components.kc.b0(g2Var).b(zbVar, -1);
        this.c = b10;
        b10.r = false;
        b10.k(true);
        b10.v = new Runnable(this) { // from class: di.s8
            public final /* synthetic */ t8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.a();
                        break;
                    default:
                        t8 t8Var = this.b;
                        if (!t8Var.n && !t8Var.o && t8Var.m) {
                            t8Var.n = true;
                            ai.o2 o2Var = t8Var.i;
                            if (o2Var != null) {
                                o2Var.a(t8Var.k);
                            }
                            if (t8Var.e != null) {
                                t8Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        org.telegram.messenger.g0.r(r22);
        org.telegram.messenger.g0.h3(r22, 3000L);
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
