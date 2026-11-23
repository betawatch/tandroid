package fi;

import a8.ma;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zs;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class y3 {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public y3(Context context, int i7) {
        switch (i7) {
            case 3:
                this.d = yi.g.a;
                this.a = true;
                this.g = yi.j.H;
                this.b = context;
                break;
            default:
                this.b = context;
                this.c = n2.b.f;
                break;
        }
    }

    public static void c(zs zsVar) {
        y3 y3Var = new y3();
        y3Var.b = new org.telegram.messenger.j5(y3Var, 0);
        y3Var.d = zsVar;
        int i7 = i10.t0;
        y3Var.g = new org.telegram.messenger.a(y3Var, 6);
        y3Var.f = org.telegram.messenger.i5.r(i7);
        y3Var.e = ks.f(i7);
        y3Var.c = new Handler(Looper.myLooper());
        if (y3Var.d(false)) {
            return;
        }
        ((ks) y3Var.e).b((org.telegram.messenger.j5) y3Var.b, ks.O);
        ((Handler) y3Var.c).postDelayed((org.telegram.messenger.a) y3Var.g, 1000L);
    }

    public n2.s0 a() {
        Context context = (Context) this.b;
        ma.p(!this.a);
        this.a = true;
        if (((h6.m) this.d) == null) {
            this.d = new h6.m(new f2.n[0]);
        }
        if (((n2.j0) this.f) == null) {
            if (((n2.m0) this.g) == null) {
                this.g = new n2.m0(context);
            }
            if (((n2.t0) this.e) == null) {
                this.e = n2.t0.a;
            }
            n2.i0 i0Var = new n2.i0(context);
            n2.b bVar = context != null ? null : (n2.b) this.c;
            Context context2 = i0Var.a;
            if (context2 == null) {
                i0Var.d = bVar;
            }
            n2.m0 m0Var = (n2.m0) this.g;
            i0Var.b = m0Var;
            i0Var.c = (n2.t0) this.e;
            if (m0Var == null) {
                i0Var.b = new n2.m0(context2);
            }
            this.f = new n2.j0(i0Var);
        } else {
            ma.p(((n2.m0) this.g) == null);
            ma.p(((n2.t0) this.e) == null);
        }
        return new n2.s0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.g;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((View) arrayList.get(i7)).invalidate();
        }
    }

    public boolean d(boolean z10) {
        boolean z11 = this.a;
        if (z11) {
            return false;
        }
        if (!((org.telegram.messenger.i5) this.f).h && !z10) {
            return false;
        }
        if (!z11) {
            ks ksVar = (ks) this.e;
            if (ksVar != null) {
                ksVar.n((org.telegram.messenger.j5) this.b, ks.O);
            }
            Handler handler = (Handler) this.c;
            if (handler != null) {
                handler.removeCallbacks((org.telegram.messenger.a) this.g);
            }
            this.a = true;
        }
        zs zsVar = (zs) this.d;
        LaunchActivity launchActivity = (LaunchActivity) zsVar.b;
        Intent intent = (Intent) zsVar.c;
        String str = LaunchActivity.C1;
        launchActivity.W(intent, true, false, false, null, true, false);
        return true;
    }
}
