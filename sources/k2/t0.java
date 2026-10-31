package k2;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.d20;
import org.telegram.messenger.i5;
import org.telegram.messenger.j5;
import org.telegram.messenger.zs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rv;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class t0 {
    public Object a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public t0(Context context, int i10) {
        switch (i10) {
            case 1:
                this.d = ki.i.a;
                this.b = true;
                this.g = ki.k.H;
                this.a = context;
                break;
            default:
                this.a = context;
                this.c = b.f;
                break;
        }
    }

    public static void c(rv rvVar) {
        t0 t0Var = new t0();
        t0Var.a = new j5(t0Var, 0);
        t0Var.d = rvVar;
        int i10 = d20.s0;
        t0Var.g = new org.telegram.messenger.a(t0Var, 6);
        t0Var.f = i5.r(i10);
        t0Var.e = zs.f(i10);
        t0Var.c = new Handler(Looper.myLooper());
        if (t0Var.d(false)) {
            return;
        }
        ((zs) t0Var.e).b((j5) t0Var.a, zs.O);
        ((Handler) t0Var.c).postDelayed((org.telegram.messenger.a) t0Var.g, 1000L);
    }

    public w0 a() {
        Context context = (Context) this.a;
        t6.p(!this.b);
        this.b = true;
        if (((android.support.v4.media.session.a0) this.d) == null) {
            this.d = new android.support.v4.media.session.a0(new c2.m[0]);
        }
        if (((n0) this.f) == null) {
            if (((q0) this.g) == null) {
                this.g = new q0(context);
            }
            if (((x0) this.e) == null) {
                this.e = x0.a;
            }
            l0 l0Var = new l0(context);
            b bVar = context != null ? null : (b) this.c;
            Context context2 = l0Var.a;
            if (context2 == null) {
                l0Var.d = bVar;
            }
            q0 q0Var = (q0) this.g;
            l0Var.b = q0Var;
            l0Var.c = (x0) this.e;
            if (q0Var == null) {
                l0Var.b = new q0(context2);
            }
            this.f = new n0(l0Var);
        } else {
            t6.p(((q0) this.g) == null);
            t6.p(((x0) this.e) == null);
        }
        return new w0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }

    public boolean d(boolean z10) {
        boolean z11 = this.b;
        if (z11) {
            return false;
        }
        if (!((i5) this.f).h && !z10) {
            return false;
        }
        if (!z11) {
            zs zsVar = (zs) this.e;
            if (zsVar != null) {
                zsVar.n((j5) this.a, zs.O);
            }
            Handler handler = (Handler) this.c;
            if (handler != null) {
                handler.removeCallbacks((org.telegram.messenger.a) this.g);
            }
            this.b = true;
        }
        rv rvVar = (rv) this.d;
        LaunchActivity launchActivity = (LaunchActivity) rvVar.b;
        Intent intent = (Intent) rvVar.c;
        Pattern pattern = LaunchActivity.D1;
        launchActivity.W(intent, true, false, false, null, true, false);
        return true;
    }
}
