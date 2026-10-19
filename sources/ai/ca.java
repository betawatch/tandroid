package ai;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class ca {
    public final org.telegram.ui.ActionBar.n2 a;
    public final long b;
    public final org.telegram.ui.Components.qc c;
    public final org.telegram.ui.Components.kc d;
    public final org.telegram.ui.Components.oc e;
    public final org.telegram.ui.Components.jc f;
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
    public ca(org.telegram.ui.ActionBar.n2 n2Var, long j10) {
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
        this.a = n2Var;
        this.b = j10;
        Context t10 = ga.t(n2Var);
        org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(t10, n2Var.getResourceProvider());
        this.d = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        org.telegram.ui.Components.jc jcVar = new org.telegram.ui.Components.jc(t10, n2Var.getResourceProvider());
        this.f = jcVar;
        jcVar.b = 3000L;
        jcVar.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, n2Var.getResourceProvider()));
        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(t10, n2Var.getResourceProvider(), true, false);
        this.e = ocVar;
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        final int i11 = 1;
        ocVar.a = new Runnable(this) { // from class: ai.ba
            public final /* synthetic */ ca b;

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
        ocVar.addView(jcVar, w7.z5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ocVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        kcVar.setButton(ocVar);
        org.telegram.ui.Components.qc b10 = org.telegram.ui.Components.xc.a0(n2Var).b(kcVar, -1);
        this.c = b10;
        b10.r = false;
        b10.k(true);
        final int i12 = 0;
        b10.v = new Runnable(this) { // from class: ai.ba
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
