package oa;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class b0 extends la.u {
    @Override // la.u
    public final Object read(ta.a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.k()) {
            try {
                arrayList.add(Integer.valueOf(aVar.p()));
            } catch (NumberFormatException e10) {
                throw new la.j(e10);
            }
        }
        aVar.e();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i9 = 0; i9 < size; i9++) {
            atomicIntegerArray.set(i9, ((Integer) arrayList.get(i9)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // la.u
    public final void write(ta.c cVar, Object obj) {
        cVar.b();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i9 = 0; i9 < length; i9++) {
            cVar.o(r6.get(i9));
        }
        cVar.e();
    }
}
