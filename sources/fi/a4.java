package fi;

import a8.ja;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tr;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class a4 {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public a4(Context context, int i7) {
        switch (i7) {
            case 3:
                this.d = yi.h.a;
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

    public static void c(tr trVar) {
        a4 a4Var = new a4();
        a4Var.b = new org.telegram.messenger.h5(a4Var, 0);
        a4Var.d = trVar;
        int i7 = m10.t0;
        a4Var.g = new org.telegram.messenger.a(a4Var, 6);
        a4Var.f = org.telegram.messenger.g5.r(i7);
        a4Var.e = ns.f(i7);
        a4Var.c = new Handler(Looper.myLooper());
        if (a4Var.d(false)) {
            return;
        }
        ((ns) a4Var.e).b((org.telegram.messenger.h5) a4Var.b, ns.O);
        ((Handler) a4Var.c).postDelayed((org.telegram.messenger.a) a4Var.g, 1000L);
    }

    public n2.r0 a() {
        Context context = (Context) this.b;
        ja.p(!this.a);
        this.a = true;
        if (((h6.m) this.d) == null) {
            this.d = new h6.m(new f2.m[0]);
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
            ja.p(((n2.l0) this.g) == null);
            ja.p(((n2.s0) this.e) == null);
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
        if (!((org.telegram.messenger.g5) this.f).h && !z10) {
            return false;
        }
        if (!z11) {
            ns nsVar = (ns) this.e;
            if (nsVar != null) {
                nsVar.n((org.telegram.messenger.h5) this.b, ns.O);
            }
            Handler handler = (Handler) this.c;
            if (handler != null) {
                handler.removeCallbacks((org.telegram.messenger.a) this.g);
            }
            this.a = true;
        }
        tr trVar = (tr) this.d;
        LaunchActivity launchActivity = (LaunchActivity) trVar.b;
        Intent intent = (Intent) trVar.c;
        String str = LaunchActivity.C1;
        launchActivity.W(intent, true, false, false, null, true, false);
        return true;
    }
}
