package di;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class nb extends b71 {
    public final Context a;
    public final int b;
    public final boolean c;
    public final int d;
    public final org.telegram.ui.ActionBar.h6 e;
    public final long f;
    public gk0 g;
    public ri.q h;
    public final ArrayList i = new ArrayList();

    public nb(Context context, int i7, boolean z10, long j3, int i10, org.telegram.ui.ActionBar.h6 h6Var) {
        this.a = context;
        this.b = i7;
        this.c = z10;
        this.d = i10;
        this.e = h6Var;
        this.f = j3;
        i();
    }

    @Override // org.telegram.ui.Components.b71
    public final void b(View view, int i7, int i10) {
        gk0 gk0Var = this.g;
        if (gk0Var != null) {
            gk0Var.H(view);
        }
    }

    @Override // org.telegram.ui.Components.b71
    public final View d(int i7) {
        mb mbVar = new mb(this.a, this.c, this.f, i7, this.b, this.d, this.e);
        if (this.g != null) {
            mbVar.setClipChildren(false);
            mbVar.setClipToPadding(false);
            h51 h51Var = mbVar.a;
            h51Var.setClipToPadding(false);
            h51Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
            h51Var.g3.r = false;
            h51Var.setCaptureSectionsDecoratorAllowed(true);
            h51Var.setOverScrollMode(0);
            ri.q qVar = this.h;
            if (qVar != null) {
                qVar.b(h51Var);
            }
        }
        return mbVar;
    }

    @Override // org.telegram.ui.Components.b71
    public final int e() {
        return this.i.size();
    }

    @Override // org.telegram.ui.Components.b71
    public final CharSequence g(int i7) {
        int h = h(i7);
        return h != 0 ? h != 1 ? h != 2 ? "" : gd.N0(2131744677, null) : gd.N0(2131744678, null) : gd.N0(2131744679, null);
    }

    @Override // org.telegram.ui.Components.b71
    public final int h(int i7) {
        if (i7 < 0) {
            return 0;
        }
        ArrayList arrayList = this.i;
        if (i7 >= arrayList.size()) {
            return 0;
        }
        return ((o41) arrayList.get(i7)).A;
    }

    public final void i() {
        ArrayList arrayList = this.i;
        arrayList.clear();
        long j3 = this.f;
        int i7 = this.b;
        if (j3 == 0) {
            y8 y10 = y8.y(i7, this.c);
            arrayList.add(o41.D(0));
            if (y10.M(1)) {
                arrayList.add(o41.D(1));
            }
            if (y10.M(2)) {
                arrayList.add(o41.D(2));
                return;
            }
            return;
        }
        e0 g10 = e0.g(i7);
        arrayList.add(o41.D(0));
        if (!g10.k(j3).a[1].isEmpty()) {
            arrayList.add(o41.D(1));
        }
        if (g10.k(j3).a[2].isEmpty()) {
            return;
        }
        arrayList.add(o41.D(2));
    }
}
