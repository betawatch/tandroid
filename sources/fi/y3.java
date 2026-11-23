package fi;

import a8.la;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.at;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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

    public static void c(at atVar) {
        y3 y3Var = new y3();
        y3Var.b = new org.telegram.messenger.j5(y3Var, 0);
        y3Var.d = atVar;
        int i7 = k10.t0;
        y3Var.g = new org.telegram.messenger.a(y3Var, 6);
        y3Var.f = org.telegram.messenger.i5.r(i7);
        y3Var.e = ls.f(i7);
        y3Var.c = new Handler(Looper.myLooper());
        if (y3Var.d(false)) {
            return;
        }
        ((ls) y3Var.e).b((org.telegram.messenger.j5) y3Var.b, ls.O);
        ((Handler) y3Var.c).postDelayed((org.telegram.messenger.a) y3Var.g, 1000L);
    }

    public n2.r0 a() {
        Context context = (Context) this.b;
        la.p(!this.a);
        this.a = true;
        if (((h6.m) this.d) == null) {
            this.d = new h6.m(new f2.n[0]);
        }
        if (((n2.i0) this.f) == null) {
            if (((n2.l0) this.g) == null) {
                this.g = new n2.l0(context);
            }
            if (((n2.s0) this.e) == null) {
                this.e = n2.s0.a;
            }
            n2.h0 h0Var = new n2.h0(context);
            n2.b bVar = context != null ? null : (n2.b) this.c;
            Context context2 = h0Var.a;
            if (context2 == null) {
                h0Var.d = bVar;
            }
            n2.l0 l0Var = (n2.l0) this.g;
            h0Var.b = l0Var;
            h0Var.c = (n2.s0) this.e;
            if (l0Var == null) {
                h0Var.b = new n2.l0(context2);
            }
            this.f = new n2.i0(h0Var);
        } else {
            la.p(((n2.l0) this.g) == null);
            la.p(((n2.s0) this.e) == null);
        }
        return new n2.r0(this);
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
            ls lsVar = (ls) this.e;
            if (lsVar != null) {
                lsVar.n((org.telegram.messenger.j5) this.b, ls.O);
            }
            Handler handler = (Handler) this.c;
            if (handler != null) {
                handler.removeCallbacks((org.telegram.messenger.a) this.g);
            }
            this.a = true;
        }
        at atVar = (at) this.d;
        LaunchActivity launchActivity = (LaunchActivity) atVar.b;
        Intent intent = (Intent) atVar.c;
        String str = LaunchActivity.C1;
        launchActivity.W(intent, true, false, false, null, true, false);
        return true;
    }
}
