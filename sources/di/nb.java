package di;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class nb extends c71 {
    public final Context a;
    public final int b;
    public final boolean c;
    public final int d;
    public final org.telegram.ui.ActionBar.i6 e;
    public final long f;
    public gk0 g;
    public ri.q h;
    public final ArrayList i = new ArrayList();

    public nb(Context context, int i7, boolean z10, long j3, int i10, org.telegram.ui.ActionBar.i6 i6Var) {
        this.a = context;
        this.b = i7;
        this.c = z10;
        this.d = i10;
        this.e = i6Var;
        this.f = j3;
        i();
    }

    @Override // org.telegram.ui.Components.c71
    public final void b(View view, int i7, int i10) {
        gk0 gk0Var = this.g;
        if (gk0Var != null) {
            gk0Var.J(view);
        }
    }

    @Override // org.telegram.ui.Components.c71
    public final View d(int i7) {
        mb mbVar = new mb(this.a, this.c, this.f, i7, this.b, this.d, this.e);
        if (this.g != null) {
            mbVar.setClipChildren(false);
            mbVar.setClipToPadding(false);
            g51 g51Var = mbVar.a;
            g51Var.setClipToPadding(false);
            g51Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
            g51Var.g3.r = false;
            g51Var.setCaptureSectionsDecoratorAllowed(true);
            g51Var.setOverScrollMode(0);
            ri.q qVar = this.h;
            if (qVar != null) {
                qVar.b(g51Var);
            }
        }
        return mbVar;
    }

    @Override // org.telegram.ui.Components.c71
    public final int e() {
        return this.i.size();
    }

    @Override // org.telegram.ui.Components.c71
    public final CharSequence g(int i7) {
        int h = h(i7);
        return h != 0 ? h != 1 ? h != 2 ? "" : gd.N0(2131744677, null) : gd.N0(2131744678, null) : gd.N0(2131744679, null);
    }

    @Override // org.telegram.ui.Components.c71
    public final int h(int i7) {
        if (i7 < 0) {
            return 0;
        }
        ArrayList arrayList = this.i;
        if (i7 >= arrayList.size()) {
            return 0;
        }
        return ((n41) arrayList.get(i7)).A;
    }

    public final void i() {
        ArrayList arrayList = this.i;
        arrayList.clear();
        long j3 = this.f;
        int i7 = this.b;
        if (j3 == 0) {
            y8 y10 = y8.y(i7, this.c);
            arrayList.add(n41.D(0));
            if (y10.M(1)) {
                arrayList.add(n41.D(1));
            }
            if (y10.M(2)) {
                arrayList.add(n41.D(2));
                return;
            }
            return;
        }
        e0 g10 = e0.g(i7);
        arrayList.add(n41.D(0));
        if (!g10.k(j3).a[1].isEmpty()) {
            arrayList.add(n41.D(1));
        }
        if (g10.k(j3).a[2].isEmpty()) {
            return;
        }
        arrayList.add(n41.D(2));
    }
}
