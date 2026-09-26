package ai;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class d6 {
    public boolean a;
    public Object b;
    public Object d;
    public Object g;
    public Object c = k2.b.c;
    public Object e = k2.f0.a;
    public Object f = k2.v.a;

    public d6(Context context) {
        this.b = context;
    }

    public k2.e0 a() {
        e2.d.g(!this.a);
        this.a = true;
        if (((aa.a) this.d) == null) {
            this.d = new aa.a(new c2.h[0]);
        }
        if (((of.b) this.g) == null) {
            this.g = new of.b((Context) this.b, 26);
        }
        return new k2.e0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
