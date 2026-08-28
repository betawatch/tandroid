package j7;

import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c extends h7.f {
    public final Object b;
    public int c;
    public final /* synthetic */ d d;

    public c(d dVar, int i9) {
        super(1, false);
        this.d = dVar;
        Object[] objArr = dVar.c;
        objArr.getClass();
        this.b = objArr[i9];
        this.c = i9;
    }

    public final void a() {
        int i9 = this.c;
        Object obj = this.b;
        d dVar = this.d;
        if (i9 != -1 && i9 < dVar.size()) {
            int i10 = this.c;
            Object[] objArr = dVar.c;
            objArr.getClass();
            if (f7.x8.a(obj, objArr[i10])) {
                return;
            }
        }
        Object obj2 = d.s;
        this.c = dVar.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        d dVar = this.d;
        Map a2 = dVar.a();
        if (a2 != null) {
            return a2.get(this.b);
        }
        a();
        int i9 = this.c;
        if (i9 == -1) {
            return null;
        }
        Object[] objArr = dVar.d;
        objArr.getClass();
        return objArr[i9];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        d dVar = this.d;
        Map a2 = dVar.a();
        Object obj2 = this.b;
        if (a2 != null) {
            return a2.put(obj2, obj);
        }
        a();
        int i9 = this.c;
        if (i9 == -1) {
            dVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = dVar.d;
        objArr.getClass();
        Object obj3 = objArr[i9];
        objArr[i9] = obj;
        return obj3;
    }
}
