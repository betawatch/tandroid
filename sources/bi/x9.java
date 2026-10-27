package bi;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class x9 {
    public final org.telegram.ui.ActionBar.r2 a;
    public final long b;
    public final org.telegram.ui.Components.qc c;
    public final org.telegram.ui.Components.kc d;
    public final org.telegram.ui.Components.oc e;
    public final ba f;
    public int g;
    public long h;
    public t8 i;
    public final ArrayList j = new ArrayList();
    public final HashSet k = new HashSet();
    public final long l = System.currentTimeMillis();
    public boolean m = true;
    public boolean n;
    public boolean o;
    public final w9 p;

    /* JADX WARN: Type inference failed for: r2v0, types: [bi.w9, java.lang.Runnable] */
    public x9(org.telegram.ui.ActionBar.r2 r2Var, long j10) {
        final int i10 = 0;
        ?? r22 = new Runnable(this) { // from class: bi.w9
            public final /* synthetic */ x9 b;

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
                        x9 x9Var = this.b;
                        if (!x9Var.n && !x9Var.o && x9Var.m) {
                            x9Var.n = true;
                            t8 t8Var = x9Var.i;
                            if (t8Var != null) {
                                t8Var.run(x9Var.k);
                            }
                            if (x9Var.e != null) {
                                x9Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.p = r22;
        this.a = r2Var;
        this.b = j10;
        Context t10 = ca.t(r2Var);
        org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(t10, r2Var.getResourceProvider());
        this.d = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        ba baVar = new ba(t10, r2Var.getResourceProvider());
        this.f = baVar;
        baVar.b = 3000L;
        int i11 = org.telegram.ui.ActionBar.y6.Gi;
        org.telegram.ui.ActionBar.u6 resourceProvider = r2Var.getResourceProvider();
        ag.w wVar = new ag.w(27);
        ag.w wVar2 = new ag.w(28);
        int Q = org.telegram.ui.ActionBar.f7.Q(i11, -1, 0, 0.0f, resourceProvider);
        wVar2.d(Q, baVar);
        org.telegram.ui.ActionBar.z6 x9 = org.telegram.ui.ActionBar.f7.x(101, baVar);
        x9.c(i11, -1, 0, 0.0f, resourceProvider);
        x9.n = wVar;
        x9.o = wVar2;
        x9.m = false;
        x9.g = Q;
        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(t10, r2Var.getResourceProvider(), true, false);
        this.e = ocVar;
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        final int i12 = 1;
        ocVar.b = new Runnable(this) { // from class: bi.w9
            public final /* synthetic */ x9 b;

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
                        x9 x9Var = this.b;
                        if (!x9Var.n && !x9Var.o && x9Var.m) {
                            x9Var.n = true;
                            t8 t8Var = x9Var.i;
                            if (t8Var != null) {
                                t8Var.run(x9Var.k);
                            }
                            if (x9Var.e != null) {
                                x9Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        ocVar.addView(baVar, kb1.h(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ocVar.e.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        kcVar.setButton(ocVar);
        org.telegram.ui.Components.qc b10 = org.telegram.ui.Components.wc.b0(r2Var).b(kcVar, -1);
        this.c = b10;
        b10.s = false;
        b10.k(true);
        final int i13 = 0;
        b10.w = new Runnable(this) { // from class: bi.w9
            public final /* synthetic */ x9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.a();
                        break;
                    default:
                        x9 x9Var = this.b;
                        if (!x9Var.n && !x9Var.o && x9Var.m) {
                            x9Var.n = true;
                            t8 t8Var = x9Var.i;
                            if (t8Var != null) {
                                t8Var.run(x9Var.k);
                            }
                            if (x9Var.e != null) {
                                x9Var.c.b();
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
