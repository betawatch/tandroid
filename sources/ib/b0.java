package ib;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class b0 extends fb.u {
    @Override // fb.u
    public final Object read(nb.a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.k()) {
            try {
                arrayList.add(Integer.valueOf(aVar.p()));
            } catch (NumberFormatException e) {
                throw new fb.j(e);
            }
        }
        aVar.e();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // fb.u
    public final void write(nb.b bVar, Object obj) {
        bVar.b();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i10 = 0; i10 < length; i10++) {
            bVar.o(r6.get(i10));
        }
        bVar.e();
    }
}
