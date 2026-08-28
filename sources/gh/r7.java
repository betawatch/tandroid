package gh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.zb;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r7 {
    public final org.telegram.ui.ActionBar.o2 a;
    public final long b;
    public final gc c;
    public final ac d;
    public final ec e;
    public final zb f;
    public int g;
    public long h;
    public p6 i;
    public final ArrayList j = new ArrayList();
    public final HashSet k = new HashSet();
    public final long l = System.currentTimeMillis();
    public boolean m = true;
    public boolean n;
    public boolean o;
    public final q7 p;

    /* JADX WARN: Type inference failed for: r2v0, types: [gh.q7, java.lang.Runnable] */
    public r7(org.telegram.ui.ActionBar.o2 o2Var, long j10) {
        final int i9 = 0;
        ?? r22 = new Runnable(this) { // from class: gh.q7
            public final /* synthetic */ r7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i9) {
                    case 0:
                        this.b.a();
                        break;
                    default:
                        r7 r7Var = this.b;
                        if (!r7Var.n && !r7Var.o && r7Var.m) {
                            r7Var.n = true;
                            p6 p6Var = r7Var.i;
                            if (p6Var != null) {
                                p6Var.run(r7Var.k);
                            }
                            if (r7Var.e != null) {
                                r7Var.c.b();
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
        Context t10 = v7.t(o2Var);
        ac acVar = new ac(t10, o2Var.getResourceProvider());
        this.d = acVar;
        acVar.c(R.raw.stars_topup, new String[0]);
        zb zbVar = new zb(t10, o2Var.getResourceProvider());
        this.f = zbVar;
        zbVar.b = 3000L;
        zbVar.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Gi, o2Var.getResourceProvider()));
        ec ecVar = new ec(t10, o2Var.getResourceProvider(), true, false);
        this.e = ecVar;
        ecVar.e(LocaleController.getString(R.string.StarsSentUndo));
        final int i10 = 1;
        ecVar.a = new Runnable(this) { // from class: gh.q7
            public final /* synthetic */ r7 b;

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
                        r7 r7Var = this.b;
                        if (!r7Var.n && !r7Var.o && r7Var.m) {
                            r7Var.n = true;
                            p6 p6Var = r7Var.i;
                            if (p6Var != null) {
                                p6Var.run(r7Var.k);
                            }
                            if (r7Var.e != null) {
                                r7Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        ecVar.addView(zbVar, g7.e6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ecVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        acVar.setButton(ecVar);
        gc b10 = oc.a0(o2Var).b(acVar, -1);
        this.c = b10;
        b10.r = false;
        b10.k(true);
        final int i11 = 0;
        b10.v = new Runnable(this) { // from class: gh.q7
            public final /* synthetic */ r7 b;

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
                        r7 r7Var = this.b;
                        if (!r7Var.n && !r7Var.o && r7Var.m) {
                            r7Var.n = true;
                            p6 p6Var = r7Var.i;
                            if (p6Var != null) {
                                p6Var.run(r7Var.k);
                            }
                            if (r7Var.e != null) {
                                r7Var.c.b();
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
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((Runnable) obj).run();
        }
        if (this.e != null) {
            this.c.b();
        }
    }
}
