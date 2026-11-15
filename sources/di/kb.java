package di;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.wj0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class kb extends n61 {
    public final Context a;
    public final int b;
    public final boolean c;
    public final int d;
    public final org.telegram.ui.ActionBar.e6 e;
    public final long f;
    public wj0 g;
    public ri.q h;
    public final ArrayList i = new ArrayList();

    public kb(Context context, int i7, boolean z10, long j3, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = context;
        this.b = i7;
        this.c = z10;
        this.d = i10;
        this.e = e6Var;
        this.f = j3;
        i();
    }

    @Override // org.telegram.ui.Components.n61
    public final void b(View view, int i7, int i10) {
        wj0 wj0Var = this.g;
        if (wj0Var != null) {
            wj0Var.J(view);
        }
    }

    @Override // org.telegram.ui.Components.n61
    public final View d(int i7) {
        jb jbVar = new jb(this.a, this.c, this.f, i7, this.b, this.d, this.e);
        if (this.g != null) {
            jbVar.setClipChildren(false);
            jbVar.setClipToPadding(false);
            u41 u41Var = jbVar.a;
            u41Var.setClipToPadding(false);
            u41Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
            u41Var.g3.r = false;
            u41Var.setCaptureSectionsDecoratorAllowed(true);
            u41Var.setOverScrollMode(0);
            ri.q qVar = this.h;
            if (qVar != null) {
                qVar.b(u41Var);
            }
        }
        return jbVar;
    }

    @Override // org.telegram.ui.Components.n61
    public final int e() {
        return this.i.size();
    }

    @Override // org.telegram.ui.Components.n61
    public final CharSequence g(int i7) {
        int h = h(i7);
        return h != 0 ? h != 1 ? h != 2 ? "" : hd.M0(2131744918, null) : hd.M0(2131744919, null) : hd.M0(2131744920, null);
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
        return ((b41) arrayList.get(i7)).z;
    }

    public final void i() {
        ArrayList arrayList = this.i;
        arrayList.clear();
        long j3 = this.f;
        int i7 = this.b;
        if (j3 == 0) {
            v8 y10 = v8.y(i7, this.c);
            arrayList.add(b41.D(0));
            if (y10.N(1)) {
                arrayList.add(b41.D(1));
            }
            if (y10.N(2)) {
                arrayList.add(b41.D(2));
                return;
            }
            return;
        }
        e0 g10 = e0.g(i7);
        arrayList.add(b41.D(0));
        if (!g10.k(j3).a[1].isEmpty()) {
            arrayList.add(b41.D(1));
        }
        if (g10.k(j3).a[2].isEmpty()) {
            return;
        }
        arrayList.add(b41.D(2));
    }
}
