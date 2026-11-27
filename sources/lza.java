// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class lza extends nic {
    public final Context a;
    public final int b;
    public final boolean c;
    public final int d;
    public final vnb e;
    public final long f;
    public h79 g;
    public vy4 h;
    public final ArrayList i = new ArrayList();

    public lza(Context context, int i, boolean z, long j, int i2, vnb vnbVar) {
        this.a = context;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = vnbVar;
        this.f = j;
        i();
    }

    @Override // nic
    public final void b(View view, int i, int i2) {
        h79 h79Var = this.g;
        if (h79Var != null) {
            h79Var.M(view);
        }
    }

    @Override // nic
    public final View d(int i) {
        kza kzaVar = new kza(this.a, this.c, this.f, i, this.b, this.d, this.e);
        if (this.g != null) {
            kzaVar.setClipChildren(false);
            kzaVar.setClipToPadding(false);
            q9c q9cVar = kzaVar.a;
            q9cVar.setClipToPadding(false);
            q9cVar.t1(hl.L(12.0f), hl.L(16.0f), false);
            q9cVar.g3.r = false;
            q9cVar.setCaptureSectionsDecoratorAllowed(true);
            q9cVar.setOverScrollMode(0);
            vy4 vy4Var = this.h;
            if (vy4Var != null) {
                vy4Var.b(q9cVar);
            }
        }
        return kzaVar;
    }

    @Override // nic
    public final int e() {
        return this.i.size();
    }

    @Override // nic
    public final CharSequence g(int i) {
        int h = h(i);
        return h != 0 ? h != 1 ? h != 2 ? "" : ob6.M0(2131744575, null) : ob6.M0(2131744576, null) : ob6.M0(2131744577, null);
    }

    @Override // nic
    public final int h(int i) {
        if (i < 0) {
            return 0;
        }
        ArrayList arrayList = this.i;
        if (i < arrayList.size()) {
            return ((b8c) arrayList.get(i)).A;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.i;
        arrayList.clear();
        long j = this.f;
        int i = this.b;
        if (j == 0) {
            jxa v = jxa.v(i, this.c);
            arrayList.add(b8c.D(0));
            if (v.K(1)) {
                arrayList.add(b8c.D(1));
            }
            if (v.K(2)) {
                arrayList.add(b8c.D(2));
                return;
            }
            return;
        }
        kt0 g = kt0.g(i);
        arrayList.add(b8c.D(0));
        if (!g.k(j).a[1].isEmpty()) {
            arrayList.add(b8c.D(1));
        }
        if (g.k(j).a[2].isEmpty()) {
            return;
        }
        arrayList.add(b8c.D(2));
    }
}
