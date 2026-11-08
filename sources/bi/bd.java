package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class bd extends m61 {
    public final Context a;
    public final int b;
    public final boolean c;
    public final int d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final long f;
    public rj0 g;
    public oi.q h;
    public final ArrayList i = new ArrayList();

    public bd(Context context, int i7, boolean z9, long j3, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = context;
        this.b = i7;
        this.c = z9;
        this.d = i10;
        this.e = f6Var;
        this.f = j3;
        i();
    }

    @Override // org.telegram.ui.Components.m61
    public final void b(View view, int i7, int i10) {
        rj0 rj0Var = this.g;
        if (rj0Var != null) {
            rj0Var.L(view);
        }
    }

    @Override // org.telegram.ui.Components.m61
    public final View d(int i7) {
        ad adVar = new ad(this.a, this.c, this.f, i7, this.b, this.d, this.e);
        if (this.g != null) {
            adVar.setClipChildren(false);
            adVar.setClipToPadding(false);
            q41 q41Var = adVar.a;
            q41Var.setClipToPadding(false);
            q41Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
            q41Var.f3.r = false;
            q41Var.setCaptureSectionsDecoratorAllowed(true);
            q41Var.setOverScrollMode(0);
            oi.q qVar = this.h;
            if (qVar != null) {
                qVar.b(q41Var);
            }
        }
        return adVar;
    }

    @Override // org.telegram.ui.Components.m61
    public final int e() {
        return this.i.size();
    }

    @Override // org.telegram.ui.Components.m61
    public final CharSequence g(int i7) {
        int h = h(i7);
        return h != 0 ? h != 1 ? h != 2 ? "" : org.telegram.messenger.id.M0(2131744921, null) : org.telegram.messenger.id.M0(2131744922, null) : org.telegram.messenger.id.M0(2131744923, null);
    }

    @Override // org.telegram.ui.Components.m61
    public final int h(int i7) {
        if (i7 < 0) {
            return 0;
        }
        ArrayList arrayList = this.i;
        if (i7 >= arrayList.size()) {
            return 0;
        }
        return ((x31) arrayList.get(i7)).z;
    }

    public final void i() {
        ArrayList arrayList = this.i;
        arrayList.clear();
        long j3 = this.f;
        int i7 = this.b;
        if (j3 == 0) {
            ea y10 = ea.y(i7, this.c);
            arrayList.add(x31.D(0));
            if (y10.N(1)) {
                arrayList.add(x31.D(1));
            }
            if (y10.N(2)) {
                arrayList.add(x31.D(2));
                return;
            }
            return;
        }
        n0 g10 = n0.g(i7);
        arrayList.add(x31.D(0));
        if (!g10.k(j3).a[1].isEmpty()) {
            arrayList.add(x31.D(1));
        }
        if (g10.k(j3).a[2].isEmpty()) {
            return;
        }
        arrayList.add(x31.D(2));
    }
}
