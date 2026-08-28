package oa;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b extends la.u {
    public static final a c = new a();
    public final Class a;
    public final o b;

    public b(la.g gVar, la.u uVar, Class cls) {
        this.b = new o(gVar, uVar, cls);
        this.a = cls;
    }

    @Override // la.u
    public final Object read(ta.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.k()) {
            arrayList.add(((la.u) this.b.c).read(aVar));
        }
        aVar.e();
        int size = arrayList.size();
        Class cls = this.a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object newInstance = Array.newInstance((Class<?>) cls, size);
        for (int i9 = 0; i9 < size; i9++) {
            Array.set(newInstance, i9, arrayList.get(i9));
        }
        return newInstance;
    }

    @Override // la.u
    public final void write(ta.c cVar, Object obj) {
        if (obj == null) {
            cVar.i();
            return;
        }
        cVar.b();
        int length = Array.getLength(obj);
        for (int i9 = 0; i9 < length; i9++) {
            this.b.write(cVar, Array.get(obj, i9));
        }
        cVar.e();
    }
}
