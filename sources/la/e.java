package la;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends u {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;

    public /* synthetic */ e(u uVar, int i9) {
        this.a = i9;
        this.b = uVar;
    }

    @Override // la.u
    public final Object read(ta.a aVar) {
        switch (this.a) {
            case 0:
                return new AtomicLong(((Number) this.b.read(aVar)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.k()) {
                    arrayList.add(Long.valueOf(((Number) this.b.read(aVar)).longValue()));
                }
                aVar.e();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i9 = 0; i9 < size; i9++) {
                    atomicLongArray.set(i9, ((Long) arrayList.get(i9)).longValue());
                }
                return atomicLongArray;
            default:
                if (aVar.x() != 9) {
                    return this.b.read(aVar);
                }
                aVar.t();
                return null;
        }
    }

    @Override // la.u
    public final void write(ta.c cVar, Object obj) {
        switch (this.a) {
            case 0:
                this.b.write(cVar, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                cVar.b();
                int length = atomicLongArray.length();
                for (int i9 = 0; i9 < length; i9++) {
                    this.b.write(cVar, Long.valueOf(atomicLongArray.get(i9)));
                }
                cVar.e();
                break;
            default:
                if (obj == null) {
                    cVar.i();
                    break;
                } else {
                    this.b.write(cVar, obj);
                    break;
                }
        }
    }
}
