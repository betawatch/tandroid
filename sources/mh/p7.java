package mh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class p7 {
    public final org.telegram.ui.ActionBar.p2 a;
    public final long b;
    public final ic c;
    public final cc d;
    public final gc e;
    public final bc f;
    public int g;
    public long h;
    public m6 i;
    public final ArrayList j = new ArrayList();
    public final HashSet k = new HashSet();
    public final long l = System.currentTimeMillis();
    public boolean m = true;
    public boolean n;
    public boolean o;
    public final o7 p;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Runnable, mh.o7] */
    public p7(org.telegram.ui.ActionBar.p2 p2Var, long j10) {
        final int i10 = 0;
        ?? r22 = new Runnable(this) { // from class: mh.o7
            public final /* synthetic */ p7 b;

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
                        p7 p7Var = this.b;
                        if (!p7Var.n && !p7Var.o && p7Var.m) {
                            p7Var.n = true;
                            m6 m6Var = p7Var.i;
                            if (m6Var != null) {
                                m6Var.run(p7Var.k);
                            }
                            if (p7Var.e != null) {
                                p7Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.p = r22;
        this.a = p2Var;
        this.b = j10;
        Context t6 = t7.t(p2Var);
        cc ccVar = new cc(t6, p2Var.getResourceProvider());
        this.d = ccVar;
        ccVar.c(R.raw.stars_topup, new String[0]);
        bc bcVar = new bc(t6, p2Var.getResourceProvider());
        this.f = bcVar;
        bcVar.b = 3000L;
        bcVar.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Gi, p2Var.getResourceProvider()));
        gc gcVar = new gc(t6, p2Var.getResourceProvider(), true, false);
        this.e = gcVar;
        gcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        final int i11 = 1;
        gcVar.a = new Runnable(this) { // from class: mh.o7
            public final /* synthetic */ p7 b;

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
                        p7 p7Var = this.b;
                        if (!p7Var.n && !p7Var.o && p7Var.m) {
                            p7Var.n = true;
                            m6 m6Var = p7Var.i;
                            if (m6Var != null) {
                                m6Var.run(p7Var.k);
                            }
                            if (p7Var.e != null) {
                                p7Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        gcVar.addView(bcVar, k7.c6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        gcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        ccVar.setButton(gcVar);
        ic b10 = qc.a0(p2Var).b(ccVar, -1);
        this.c = b10;
        b10.r = false;
        b10.k(true);
        final int i12 = 0;
        b10.v = new Runnable(this) { // from class: mh.o7
            public final /* synthetic */ p7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.a();
                        break;
                    default:
                        p7 p7Var = this.b;
                        if (!p7Var.n && !p7Var.o && p7Var.m) {
                            p7Var.n = true;
                            m6 m6Var = p7Var.i;
                            if (m6Var != null) {
                                m6Var.run(p7Var.k);
                            }
                            if (p7Var.e != null) {
                                p7Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        AndroidUtilities.cancelRunOnUIThread(r22);
        AndroidUtilities.runOnUIThread(r22, 3000L);
    }

    public final void a() {
        if (this.n || this.o) {
            return;
        }
        this.o = true;
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        if (this.e != null) {
            this.c.b();
        }
    }
}
