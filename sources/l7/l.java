package l7;

import java.util.Map;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class l extends f {
    public final Object b;
    public int c;
    public final /* synthetic */ n d;

    public l(n nVar, int i10) {
        super(0, false);
        this.d = nVar;
        Object[] objArr = nVar.c;
        objArr.getClass();
        this.b = objArr[i10];
        this.c = i10;
    }

    public final void a() {
        int i10 = this.c;
        Object obj = this.b;
        n nVar = this.d;
        if (i10 != -1 && i10 < nVar.size()) {
            int i11 = this.c;
            Object[] objArr = nVar.c;
            objArr.getClass();
            if (k7.i.a(obj, objArr[i11])) {
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
        int i10 = this.c;
        if (i10 == -1) {
            return null;
        }
        Object[] objArr = nVar.d;
        objArr.getClass();
        return objArr[i10];
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
        int i10 = this.c;
        if (i10 == -1) {
            nVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = nVar.d;
        objArr.getClass();
        Object obj3 = objArr[i10];
        int i11 = this.c;
        Object[] objArr2 = nVar.d;
        objArr2.getClass();
        objArr2[i11] = obj;
        return obj3;
    }
}
