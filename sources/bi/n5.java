package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class n5 {
    public boolean a;
    public Object b;
    public Object d;
    public Object g;
    public Object c = k2.b.c;
    public Object e = k2.e0.a;
    public Object f = k2.u.a;

    public n5(Context context) {
        this.b = context;
    }

    public k2.d0 a() {
        e2.d.g(!this.a);
        this.a = true;
        if (((aa.a) this.d) == null) {
            this.d = new aa.a(new c2.h[0]);
        }
        if (((pf.b) this.g) == null) {
            this.g = new pf.b((Context) this.b, 26);
        }
        return new k2.d0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
