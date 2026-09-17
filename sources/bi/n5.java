package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
