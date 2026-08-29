package a9;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a {
    public int a;
    public int b;
    public Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;

    public a(Class cls, Class[] clsArr) {
        this.c = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.a = 0;
        this.b = 0;
        this.f = new HashSet();
        hashSet.add(v.a(cls));
        for (Class cls2 : clsArr) {
            h7.n.a(cls2, "Null interface");
            ((HashSet) this.d).add(v.a(cls2));
        }
    }

    public void a(m mVar) {
        if (((HashSet) this.d).contains(mVar.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.e).add(mVar);
    }

    public b b() {
        if (((e) this.g) != null) {
            return new b((String) this.c, new HashSet((HashSet) this.d), new HashSet((HashSet) this.e), this.a, this.b, (e) this.g, (HashSet) this.f);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i10) {
        if (!(this.a == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.a = i10;
    }

    public a(v vVar, v[] vVarArr) {
        this.c = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.a = 0;
        this.b = 0;
        this.f = new HashSet();
        hashSet.add(vVar);
        for (v vVar2 : vVarArr) {
            h7.n.a(vVar2, "Null interface");
        }
        Collections.addAll((HashSet) this.d, vVarArr);
    }

    public a() {
        this.c = new RectF();
        this.d = new Path();
        this.e = new RectF();
        this.f = new RectF();
        this.g = new PointF();
    }
}
