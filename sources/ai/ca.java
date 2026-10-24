package ai;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class ca {
    public final org.telegram.ui.ActionBar.o2 a;
    public final long b;
    public final org.telegram.ui.Components.qc c;
    public final org.telegram.ui.Components.kc d;
    public final org.telegram.ui.Components.oc e;
    public final ga f;
    public int g;
    public long h;
    public y8 i;
    public final ArrayList j = new ArrayList();
    public final HashSet k = new HashSet();
    public final long l = System.currentTimeMillis();
    public boolean m = true;
    public boolean n;
    public boolean o;
    public final ba p;

    /* JADX WARN: Type inference failed for: r2v0, types: [ai.ba, java.lang.Runnable] */
    public ca(org.telegram.ui.ActionBar.o2 o2Var, long j10) {
        final int i10 = 0;
        ?? r22 = new Runnable(this) { // from class: ai.ba
            public final /* synthetic */ ca b;

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
                        ca caVar = this.b;
                        if (!caVar.n && !caVar.o && caVar.m) {
                            caVar.n = true;
                            y8 y8Var = caVar.i;
                            if (y8Var != null) {
                                y8Var.run(caVar.k);
                            }
                            if (caVar.e != null) {
                                caVar.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.p = r22;
        this.a = o2Var;
        this.b = j10;
        Context t10 = ha.t(o2Var);
        org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(t10, o2Var.getResourceProvider());
        this.d = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        ga gaVar = new ga(t10, o2Var.getResourceProvider());
        this.f = gaVar;
        gaVar.b = 3000L;
        int i11 = org.telegram.ui.ActionBar.k6.Gi;
        org.telegram.ui.ActionBar.g6 resourceProvider = o2Var.getResourceProvider();
        aa.a aVar = new aa.a(15);
        aa.a aVar2 = new aa.a(16);
        int R = org.telegram.ui.ActionBar.r6.R(i11, -1, 0, 0.0f, resourceProvider);
        aVar2.d(R, gaVar);
        org.telegram.ui.ActionBar.l6 y3 = org.telegram.ui.ActionBar.r6.y(101, gaVar);
        y3.c(i11, -1, 0, 0.0f, resourceProvider);
        y3.n = aVar;
        y3.o = aVar2;
        y3.m = false;
        y3.g = R;
        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(t10, o2Var.getResourceProvider(), true, false);
        this.e = ocVar;
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        final int i12 = 1;
        ocVar.b = new Runnable(this) { // from class: ai.ba
            public final /* synthetic */ ca b;

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
                        ca caVar = this.b;
                        if (!caVar.n && !caVar.o && caVar.m) {
                            caVar.n = true;
                            y8 y8Var = caVar.i;
                            if (y8Var != null) {
                                y8Var.run(caVar.k);
                            }
                            if (caVar.e != null) {
                                caVar.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        ocVar.addView(gaVar, w7.z5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ocVar.e.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        kcVar.setButton(ocVar);
        org.telegram.ui.Components.qc b10 = org.telegram.ui.Components.xc.a0(o2Var).b(kcVar, -1);
        this.c = b10;
        b10.r = false;
        b10.k(true);
        final int i13 = 0;
        b10.v = new Runnable(this) { // from class: ai.ba
            public final /* synthetic */ ca b;

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
                        ca caVar = this.b;
                        if (!caVar.n && !caVar.o && caVar.m) {
                            caVar.n = true;
                            y8 y8Var = caVar.i;
                            if (y8Var != null) {
                                y8Var.run(caVar.k);
                            }
                            if (caVar.e != null) {
                                caVar.c.b();
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
