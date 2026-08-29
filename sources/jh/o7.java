package jh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class o7 {
    public final org.telegram.ui.ActionBar.o2 a;
    public final long b;
    public final mc c;
    public final gc d;
    public final kc e;
    public final fc f;
    public int g;
    public long h;
    public m6 i;
    public final ArrayList j = new ArrayList();
    public final HashSet k = new HashSet();
    public final long l = System.currentTimeMillis();
    public boolean m = true;
    public boolean n;
    public boolean o;
    public final n7 p;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Runnable, jh.n7] */
    public o7(org.telegram.ui.ActionBar.o2 o2Var, long j10) {
        final int i10 = 0;
        ?? r22 = new Runnable(this) { // from class: jh.n7
            public final /* synthetic */ o7 b;

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
                        o7 o7Var = this.b;
                        if (!o7Var.n && !o7Var.o && o7Var.m) {
                            o7Var.n = true;
                            m6 m6Var = o7Var.i;
                            if (m6Var != null) {
                                m6Var.run(o7Var.k);
                            }
                            if (o7Var.e != null) {
                                o7Var.c.b();
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
        Context t10 = s7.t(o2Var);
        gc gcVar = new gc(t10, o2Var.getResourceProvider());
        this.d = gcVar;
        gcVar.c(R.raw.stars_topup, new String[0]);
        fc fcVar = new fc(t10, o2Var.getResourceProvider());
        this.f = fcVar;
        fcVar.b = 3000L;
        fcVar.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Gi, o2Var.getResourceProvider()));
        kc kcVar = new kc(t10, o2Var.getResourceProvider(), true, false);
        this.e = kcVar;
        kcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        final int i11 = 1;
        kcVar.a = new Runnable(this) { // from class: jh.n7
            public final /* synthetic */ o7 b;

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
                        o7 o7Var = this.b;
                        if (!o7Var.n && !o7Var.o && o7Var.m) {
                            o7Var.n = true;
                            m6 m6Var = o7Var.i;
                            if (m6Var != null) {
                                m6Var.run(o7Var.k);
                            }
                            if (o7Var.e != null) {
                                o7Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        kcVar.addView(fcVar, i7.f6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        kcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        gcVar.setButton(kcVar);
        mc b10 = tc.a0(o2Var).b(gcVar, -1);
        this.c = b10;
        b10.r = false;
        b10.k(true);
        final int i12 = 0;
        b10.v = new Runnable(this) { // from class: jh.n7
            public final /* synthetic */ o7 b;

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
                        o7 o7Var = this.b;
                        if (!o7Var.n && !o7Var.o && o7Var.m) {
                            o7Var.n = true;
                            m6 m6Var = o7Var.i;
                            if (m6Var != null) {
                                m6Var.run(o7Var.k);
                            }
                            if (o7Var.e != null) {
                                o7Var.c.b();
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
