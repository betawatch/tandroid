package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class bd extends n61 {
    public final Context a;
    public final int b;
    public final boolean c;
    public final int d;
    public final org.telegram.ui.ActionBar.g6 e;
    public final long f;
    public sj0 g;
    public oi.q h;
    public final ArrayList i = new ArrayList();

    public bd(Context context, int i7, boolean z9, long j3, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this.a = context;
        this.b = i7;
        this.c = z9;
        this.d = i10;
        this.e = g6Var;
        this.f = j3;
        i();
    }

    @Override // org.telegram.ui.Components.n61
    public final void b(View view, int i7, int i10) {
        sj0 sj0Var = this.g;
        if (sj0Var != null) {
            sj0Var.L(view);
        }
    }

    @Override // org.telegram.ui.Components.n61
    public final View d(int i7) {
        ad adVar = new ad(this.a, this.c, this.f, i7, this.b, this.d, this.e);
        if (this.g != null) {
            adVar.setClipChildren(false);
            adVar.setClipToPadding(false);
            r41 r41Var = adVar.a;
            r41Var.setClipToPadding(false);
            r41Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
            r41Var.f3.r = false;
            r41Var.setCaptureSectionsDecoratorAllowed(true);
            r41Var.setOverScrollMode(0);
            oi.q qVar = this.h;
            if (qVar != null) {
                qVar.b(r41Var);
            }
        }
        return adVar;
    }

    @Override // org.telegram.ui.Components.n61
    public final int e() {
        return this.i.size();
    }

    @Override // org.telegram.ui.Components.n61
    public final CharSequence g(int i7) {
        int h = h(i7);
        return h != 0 ? h != 1 ? h != 2 ? "" : org.telegram.messenger.id.M0(2131744918, null) : org.telegram.messenger.id.M0(2131744919, null) : org.telegram.messenger.id.M0(2131744920, null);
    }

    @Override // org.telegram.ui.Components.n61
    public final int h(int i7) {
        if (i7 < 0) {
            return 0;
        }
        ArrayList arrayList = this.i;
        if (i7 >= arrayList.size()) {
            return 0;
        }
        return ((y31) arrayList.get(i7)).z;
    }

    public final void i() {
        ArrayList arrayList = this.i;
        arrayList.clear();
        long j3 = this.f;
        int i7 = this.b;
        if (j3 == 0) {
            ea y10 = ea.y(i7, this.c);
            arrayList.add(y31.D(0));
            if (y10.N(1)) {
                arrayList.add(y31.D(1));
            }
            if (y10.N(2)) {
                arrayList.add(y31.D(2));
                return;
            }
            return;
        }
        n0 g10 = n0.g(i7);
        arrayList.add(y31.D(0));
        if (!g10.k(j3).a[1].isEmpty()) {
            arrayList.add(y31.D(1));
        }
        if (g10.k(j3).a[2].isEmpty()) {
            return;
        }
        arrayList.add(y31.D(2));
    }
}
