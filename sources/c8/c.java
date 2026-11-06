package c8;

import java.util.Map;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class c extends a8.g {
    public final Object b;
    public int c;
    public final /* synthetic */ d d;

    public c(d dVar, int i7) {
        super(1, false);
        this.d = dVar;
        Object[] objArr = dVar.c;
        objArr.getClass();
        this.b = objArr[i7];
        this.c = i7;
    }

    public final void a() {
        int i7 = this.c;
        Object obj = this.b;
        d dVar = this.d;
        if (i7 != -1 && i7 < dVar.size()) {
            int i10 = this.c;
            Object[] objArr = dVar.c;
            objArr.getClass();
            if (a8.e8.a(obj, objArr[i10])) {
                return;
            }
        }
        Object obj2 = d.s;
        this.c = dVar.f(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        d dVar = this.d;
        Map b10 = dVar.b();
        if (b10 != null) {
            return b10.get(this.b);
        }
        a();
        int i7 = this.c;
        if (i7 == -1) {
            return null;
        }
        Object[] objArr = dVar.d;
        objArr.getClass();
        return objArr[i7];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        d dVar = this.d;
        Map b10 = dVar.b();
        Object obj2 = this.b;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i7 = this.c;
        if (i7 == -1) {
            dVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = dVar.d;
        objArr.getClass();
        Object obj3 = objArr[i7];
        objArr[i7] = obj;
        return obj3;
    }
}
