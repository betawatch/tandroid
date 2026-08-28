package h7;

import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l extends f {
    public final Object b;
    public int c;
    public final /* synthetic */ n d;

    public l(n nVar, int i9) {
        super(0, false);
        this.d = nVar;
        Object[] objArr = nVar.c;
        objArr.getClass();
        this.b = objArr[i9];
        this.c = i9;
    }

    public final void a() {
        int i9 = this.c;
        Object obj = this.b;
        n nVar = this.d;
        if (i9 != -1 && i9 < nVar.size()) {
            int i10 = this.c;
            Object[] objArr = nVar.c;
            objArr.getClass();
            if (f7.a8.a(obj, objArr[i10])) {
                return;
            }
        }
        Object obj2 = n.s;
        this.c = nVar.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        n nVar = this.d;
        Map a2 = nVar.a();
        if (a2 != null) {
            return a2.get(this.b);
        }
        a();
        int i9 = this.c;
        if (i9 == -1) {
            return null;
        }
        Object[] objArr = nVar.d;
        objArr.getClass();
        return objArr[i9];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        n nVar = this.d;
        Map a2 = nVar.a();
        Object obj2 = this.b;
        if (a2 != null) {
            return a2.put(obj2, obj);
        }
        a();
        int i9 = this.c;
        if (i9 == -1) {
            nVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = nVar.d;
        objArr.getClass();
        Object obj3 = objArr[i9];
        int i10 = this.c;
        Object[] objArr2 = nVar.d;
        objArr2.getClass();
        objArr2[i10] = obj;
        return obj3;
    }
}
