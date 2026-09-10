package k2;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class v {
    public boolean a;
    public Object b;
    public Object d;
    public Object g;
    public Object c = b.c;
    public Object e = f0.a;
    public Object f = u.a;

    public v(Context context) {
        this.b = context;
    }

    public e0 a() {
        e2.d.g(!this.a);
        this.a = true;
        if (((aa.a) this.d) == null) {
            this.d = new aa.a(new c2.h[0]);
        }
        if (((n4.y) this.g) == null) {
            this.g = new n4.y((Context) this.b, 26);
        }
        return new e0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
