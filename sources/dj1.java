// default package

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class dj1 extends nic {
    public final Activity a;
    public final int b;
    public final int c;
    public final vnb d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ ej1 f;

    public dj1(ej1 ej1Var, Activity activity, int i, long j, int i2, vnb vnbVar) {
        this.f = ej1Var;
        this.a = activity;
        this.b = i;
        this.c = i2;
        this.d = vnbVar;
        i();
    }

    @Override // nic
    public final void b(View view, int i, int i2) {
        this.f.b.M(view);
    }

    @Override // nic
    public final View d(int i) {
        return new cj1(this.f, this.a, i, this.b, this.c, new zd((Object) this, i, (byte) 13), this.d);
    }

    @Override // nic
    public final int e() {
        return this.e.size();
    }

    @Override // nic
    public final CharSequence g(int i) {
        int h = h(i);
        return h != 0 ? h != 1 ? "" : ob6.M0(2131748106, null) : ob6.M0(2131748107, null);
    }

    @Override // nic
    public final int h(int i) {
        if (i < 0) {
            return 1;
        }
        ArrayList arrayList = this.e;
        if (i < arrayList.size()) {
            return ((b8c) arrayList.get(i)).A;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ej1 ej1Var = this.f;
        if (!ej1Var.n.isEmpty()) {
            arrayList.add(b8c.D(1));
        }
        if (ej1Var.r.isEmpty()) {
            return;
        }
        arrayList.add(b8c.D(0));
    }
}
