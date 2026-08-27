package hh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.yb;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class q7 {
    public final org.telegram.ui.ActionBar.n2 a;
    public final long b;
    public final ec c;
    public final yb d;
    public final cc e;
    public final xb f;
    public int g;
    public long h;
    public o6 i;
    public final ArrayList j = new ArrayList();
    public final HashSet k = new HashSet();
    public final long l = System.currentTimeMillis();
    public boolean m = true;
    public boolean n;
    public boolean o;
    public final p7 p;

    /* JADX WARN: Type inference failed for: r2v0, types: [hh.p7, java.lang.Runnable] */
    public q7(org.telegram.ui.ActionBar.n2 n2Var, long j10) {
        final int i10 = 0;
        ?? r22 = new Runnable(this) { // from class: hh.p7
            public final /* synthetic */ q7 b;

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
                        q7 q7Var = this.b;
                        if (!q7Var.n && !q7Var.o && q7Var.m) {
                            q7Var.n = true;
                            o6 o6Var = q7Var.i;
                            if (o6Var != null) {
                                o6Var.run(q7Var.k);
                            }
                            if (q7Var.e != null) {
                                q7Var.c.b();
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
        Context t10 = u7.t(n2Var);
        yb ybVar = new yb(t10, n2Var.getResourceProvider());
        this.d = ybVar;
        ybVar.c(R.raw.stars_topup, new String[0]);
        xb xbVar = new xb(t10, n2Var.getResourceProvider());
        this.f = xbVar;
        xbVar.b = 3000L;
        xbVar.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Gi, n2Var.getResourceProvider()));
        cc ccVar = new cc(t10, n2Var.getResourceProvider(), true, false);
        this.e = ccVar;
        ccVar.e(LocaleController.getString(R.string.StarsSentUndo));
        final int i11 = 1;
        ccVar.a = new Runnable(this) { // from class: hh.p7
            public final /* synthetic */ q7 b;

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
                        q7 q7Var = this.b;
                        if (!q7Var.n && !q7Var.o && q7Var.m) {
                            q7Var.n = true;
                            o6 o6Var = q7Var.i;
                            if (o6Var != null) {
                                o6Var.run(q7Var.k);
                            }
                            if (q7Var.e != null) {
                                q7Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        ccVar.addView(xbVar, h7.z5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ccVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        ybVar.setButton(ccVar);
        ec b10 = mc.a0(n2Var).b(ybVar, -1);
        this.c = b10;
        b10.r = false;
        b10.k(true);
        final int i12 = 0;
        b10.v = new Runnable(this) { // from class: hh.p7
            public final /* synthetic */ q7 b;

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
                        q7 q7Var = this.b;
                        if (!q7Var.n && !q7Var.o && q7Var.m) {
                            q7Var.n = true;
                            o6 o6Var = q7Var.i;
                            if (o6Var != null) {
                                o6Var.run(q7Var.k);
                            }
                            if (q7Var.e != null) {
                                q7Var.c.b();
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
