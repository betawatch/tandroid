package di;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class s8 {
    public final org.telegram.ui.ActionBar.h2 a;
    public final long b;
    public final org.telegram.ui.Components.gc c;
    public final org.telegram.ui.Components.ac d;
    public final org.telegram.ui.Components.ec e;
    public final w8 f;
    public int g;
    public long h;
    public ai.u2 i;
    public final ArrayList j = new ArrayList();
    public final HashSet k = new HashSet();
    public final long l = System.currentTimeMillis();
    public boolean m = true;
    public boolean n;
    public boolean o;
    public final r8 p;

    /* JADX WARN: Type inference failed for: r2v0, types: [di.r8, java.lang.Runnable] */
    public s8(org.telegram.ui.ActionBar.h2 h2Var, long j3) {
        final int i7 = 0;
        ?? r22 = new Runnable(this) { // from class: di.r8
            public final /* synthetic */ s8 b;

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
                        s8 s8Var = this.b;
                        if (!s8Var.n && !s8Var.o && s8Var.m) {
                            s8Var.n = true;
                            ai.u2 u2Var = s8Var.i;
                            if (u2Var != null) {
                                u2Var.a(s8Var.k);
                            }
                            if (s8Var.e != null) {
                                s8Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.p = r22;
        this.a = h2Var;
        this.b = j3;
        Context t6 = x8.t(h2Var);
        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(t6, h2Var.getResourceProvider());
        this.d = acVar;
        acVar.c(R.raw.stars_topup, new String[0]);
        w8 w8Var = new w8(t6, h2Var.getResourceProvider());
        this.f = w8Var;
        w8Var.b = 3000L;
        int i10 = org.telegram.ui.ActionBar.n6.xj;
        org.telegram.ui.ActionBar.i6 resourceProvider = h2Var.getResourceProvider();
        ci.v vVar = new ci.v(4);
        ci.v vVar2 = new ci.v(5);
        int P = org.telegram.ui.ActionBar.u6.P(i10, -1, 0, 0.0f, resourceProvider);
        vVar2.d(P, w8Var);
        org.telegram.ui.ActionBar.o6 w10 = org.telegram.ui.ActionBar.u6.w(101, w8Var);
        w10.c(i10, -1, 0, 0.0f, resourceProvider);
        w10.n = vVar;
        w10.o = vVar2;
        w10.m = false;
        w10.g = P;
        final int i11 = 1;
        org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(t6, h2Var.getResourceProvider(), true, false);
        this.e = ecVar;
        ecVar.e(gd.M0(2131744788, null));
        ecVar.b = new Runnable(this) { // from class: di.r8
            public final /* synthetic */ s8 b;

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
                        s8 s8Var = this.b;
                        if (!s8Var.n && !s8Var.o && s8Var.m) {
                            s8Var.n = true;
                            ai.u2 u2Var = s8Var.i;
                            if (u2Var != null) {
                                u2Var.a(s8Var.k);
                            }
                            if (s8Var.e != null) {
                                s8Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        ecVar.addView(w8Var, c8.ma.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ecVar.e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        acVar.setButton(ecVar);
        org.telegram.ui.Components.gc b10 = org.telegram.ui.Components.lc.b0(h2Var).b(acVar, -1);
        this.c = b10;
        b10.r = false;
        b10.k(true);
        b10.v = new Runnable(this) { // from class: di.r8
            public final /* synthetic */ s8 b;

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
                        s8 s8Var = this.b;
                        if (!s8Var.n && !s8Var.o && s8Var.m) {
                            s8Var.n = true;
                            ai.u2 u2Var = s8Var.i;
                            if (u2Var != null) {
                                u2Var.a(s8Var.k);
                            }
                            if (s8Var.e != null) {
                                s8Var.c.b();
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
