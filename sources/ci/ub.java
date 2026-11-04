package ci;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.vj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ub extends f61 {
    public final Context a;
    public final int b;
    public final boolean c;
    public final int d;
    public final org.telegram.ui.ActionBar.e6 e;
    public final long f;
    public vj0 g;
    public pi.q h;
    public final ArrayList i = new ArrayList();

    public ub(Context context, int i3, boolean z10, long j10, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = context;
        this.b = i3;
        this.c = z10;
        this.d = i10;
        this.e = e6Var;
        this.f = j10;
        i();
    }

    @Override // org.telegram.ui.Components.f61
    public final void b(View view, int i3, int i10) {
        vj0 vj0Var = this.g;
        if (vj0Var != null) {
            vj0Var.L(view);
        }
    }

    @Override // org.telegram.ui.Components.f61
    public final View d(int i3) {
        tb tbVar = new tb(this.a, this.c, this.f, i3, this.b, this.d, this.e);
        if (this.g != null) {
            tbVar.setClipChildren(false);
            tbVar.setClipToPadding(false);
            l41 l41Var = tbVar.a;
            l41Var.setClipToPadding(false);
            l41Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
            l41Var.g3.r = false;
            l41Var.setCaptureSectionsDecoratorAllowed(true);
            l41Var.setOverScrollMode(0);
            pi.q qVar = this.h;
            if (qVar != null) {
                qVar.b(l41Var);
            }
        }
        return tbVar;
    }

    @Override // org.telegram.ui.Components.f61
    public final int e() {
        return this.i.size();
    }

    @Override // org.telegram.ui.Components.f61
    public final CharSequence g(int i3) {
        int h = h(i3);
        return h != 0 ? h != 1 ? h != 2 ? "" : bd.M0(2131744928, null) : bd.M0(2131744929, null) : bd.M0(2131744930, null);
    }

    @Override // org.telegram.ui.Components.f61
    public final int h(int i3) {
        if (i3 < 0) {
            return 0;
        }
        ArrayList arrayList = this.i;
        if (i3 >= arrayList.size()) {
            return 0;
        }
        return ((r31) arrayList.get(i3)).z;
    }

    public final void i() {
        ArrayList arrayList = this.i;
        arrayList.clear();
        long j10 = this.f;
        int i3 = this.b;
        if (j10 == 0) {
            e9 y9 = e9.y(i3, this.c);
            arrayList.add(r31.D(0));
            if (y9.N(1)) {
                arrayList.add(r31.D(1));
            }
            if (y9.N(2)) {
                arrayList.add(r31.D(2));
                return;
            }
            return;
        }
        i0 g7 = i0.g(i3);
        arrayList.add(r31.D(0));
        if (!g7.k(j10).a[1].isEmpty()) {
            arrayList.add(r31.D(1));
        }
        if (g7.k(j10).a[2].isEmpty()) {
            return;
        }
        arrayList.add(r31.D(2));
    }
}
