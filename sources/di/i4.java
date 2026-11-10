package di;

import a8.ia;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.su;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i4 {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public i4(Context context, int i7) {
        switch (i7) {
            case 3:
                this.d = vi.f.a;
                this.a = true;
                this.g = vi.h.H;
                this.b = context;
                break;
            default:
                this.b = context;
                this.c = n2.b.f;
                break;
        }
    }

    public static void c(su suVar) {
        i4 i4Var = new i4();
        i4Var.b = new org.telegram.messenger.h5(i4Var, 0);
        i4Var.d = suVar;
        int i7 = p10.s0;
        i4Var.g = new org.telegram.messenger.a(i4Var, 6);
        i4Var.f = org.telegram.messenger.g5.r(i7);
        i4Var.e = qs.f(i7);
        i4Var.c = new Handler(Looper.myLooper());
        if (i4Var.d(false)) {
            return;
        }
        ((qs) i4Var.e).b((org.telegram.messenger.h5) i4Var.b, qs.O);
        ((Handler) i4Var.c).postDelayed((org.telegram.messenger.a) i4Var.g, 1000L);
    }

    public n2.q0 a() {
        Context context = (Context) this.b;
        ia.p(!this.a);
        this.a = true;
        if (((h6.m) this.d) == null) {
            this.d = new h6.m(new f2.n[0]);
        }
        if (((n2.h0) this.f) == null) {
            if (((n2.k0) this.g) == null) {
                this.g = new n2.k0(context);
            }
            if (((n2.r0) this.e) == null) {
                this.e = n2.r0.a;
            }
            n2.g0 g0Var = new n2.g0(context);
            n2.b bVar = context != null ? null : (n2.b) this.c;
            Context context2 = g0Var.a;
            if (context2 == null) {
                g0Var.d = bVar;
            }
            n2.k0 k0Var = (n2.k0) this.g;
            g0Var.b = k0Var;
            g0Var.c = (n2.r0) this.e;
            if (k0Var == null) {
                g0Var.b = new n2.k0(context2);
            }
            this.f = new n2.h0(g0Var);
        } else {
            ia.p(((n2.k0) this.g) == null);
            ia.p(((n2.r0) this.e) == null);
        }
        return new n2.q0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.g;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((View) arrayList.get(i7)).invalidate();
        }
    }

    public boolean d(boolean z9) {
        boolean z10 = this.a;
        if (z10) {
            return false;
        }
        if (!((org.telegram.messenger.g5) this.f).h && !z9) {
            return false;
        }
        if (!z10) {
            qs qsVar = (qs) this.e;
            if (qsVar != null) {
                qsVar.n((org.telegram.messenger.h5) this.b, qs.O);
            }
            Handler handler = (Handler) this.c;
            if (handler != null) {
                handler.removeCallbacks((org.telegram.messenger.a) this.g);
            }
            this.a = true;
        }
        su suVar = (su) this.d;
        LaunchActivity launchActivity = (LaunchActivity) suVar.b;
        Intent intent = (Intent) suVar.c;
        String str = LaunchActivity.B1;
        launchActivity.W(intent, true, false, false, null, true, false);
        return true;
    }
}
