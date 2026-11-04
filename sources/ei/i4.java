package ei;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import b8.zb;
import java.util.ArrayList;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.i41;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i4 {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public i4(Context context, int i3) {
        switch (i3) {
            case 3:
                this.d = vi.h.a;
                this.a = true;
                this.g = vi.j.H;
                this.b = context;
                break;
            default:
                this.b = context;
                this.c = m2.b.f;
                break;
        }
    }

    public static void c(i41 i41Var) {
        i4 i4Var = new i4();
        i4Var.b = new org.telegram.messenger.h5(i4Var, 0);
        i4Var.d = i41Var;
        int i3 = h10.t0;
        i4Var.g = new org.telegram.messenger.a(i4Var, 6);
        i4Var.f = org.telegram.messenger.g5.r(i3);
        i4Var.e = hs.f(i3);
        i4Var.c = new Handler(Looper.myLooper());
        if (i4Var.d(false)) {
            return;
        }
        ((hs) i4Var.e).b((org.telegram.messenger.h5) i4Var.b, hs.O);
        ((Handler) i4Var.c).postDelayed((org.telegram.messenger.a) i4Var.g, 1000L);
    }

    public m2.s0 a() {
        Context context = (Context) this.b;
        zb.p(!this.a);
        this.a = true;
        if (((k4.j) this.d) == null) {
            this.d = new k4.j(new e2.m[0]);
        }
        if (((m2.j0) this.f) == null) {
            if (((m2.m0) this.g) == null) {
                this.g = new m2.m0(context);
            }
            if (((m2.t0) this.e) == null) {
                this.e = m2.t0.a;
            }
            m2.i0 i0Var = new m2.i0(context);
            m2.b bVar = context != null ? null : (m2.b) this.c;
            Context context2 = i0Var.a;
            if (context2 == null) {
                i0Var.d = bVar;
            }
            m2.m0 m0Var = (m2.m0) this.g;
            i0Var.b = m0Var;
            i0Var.c = (m2.t0) this.e;
            if (m0Var == null) {
                i0Var.b = new m2.m0(context2);
            }
            this.f = new m2.j0(i0Var);
        } else {
            zb.p(((m2.m0) this.g) == null);
            zb.p(((m2.t0) this.e) == null);
        }
        return new m2.s0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.g;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((View) arrayList.get(i3)).invalidate();
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
            hs hsVar = (hs) this.e;
            if (hsVar != null) {
                hsVar.n((org.telegram.messenger.h5) this.b, hs.O);
            }
            Handler handler = (Handler) this.c;
            if (handler != null) {
                handler.removeCallbacks((org.telegram.messenger.a) this.g);
            }
            this.a = true;
        }
        i41 i41Var = (i41) this.d;
        LaunchActivity launchActivity = (LaunchActivity) i41Var.b;
        Intent intent = (Intent) i41Var.c;
        String str = LaunchActivity.E1;
        launchActivity.W(intent, true, false, false, null, true, false);
        return true;
    }
}
