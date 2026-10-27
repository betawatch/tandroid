package ib;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b extends fb.u {
    public static final a c = new a();
    public final Class a;
    public final o b;

    public b(fb.g gVar, fb.u uVar, Class cls) {
        this.b = new o(gVar, uVar, cls);
        this.a = cls;
    }

    @Override // fb.u
    public final Object read(nb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.k()) {
            arrayList.add(((fb.u) this.b.c).read(aVar));
        }
        aVar.e();
        int size = arrayList.size();
        Class cls = this.a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object newInstance = Array.newInstance((Class<?>) cls, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    @Override // fb.u
    public final void write(nb.b bVar, Object obj) {
        if (obj == null) {
            bVar.i();
            return;
        }
        bVar.b();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.b.write(bVar, Array.get(obj, i10));
        }
        bVar.e();
    }
}
