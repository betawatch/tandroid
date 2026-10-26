package a8;

import java.util.Map;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class e extends eh {
    public final Object b;
    public int c;
    public final /* synthetic */ g d;

    public e(g gVar, int i10) {
        super(0, false);
        this.d = gVar;
        Object[] objArr = gVar.c;
        objArr.getClass();
        this.b = objArr[i10];
        this.c = i10;
    }

    public final void a() {
        int i10 = this.c;
        Object obj = this.b;
        g gVar = this.d;
        if (i10 != -1 && i10 < gVar.size()) {
            int i11 = this.c;
            Object[] objArr = gVar.c;
            objArr.getClass();
            if (n0.a(obj, objArr[i11])) {
                return;
            }
        }
        Object obj2 = g.s;
        this.c = gVar.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        g gVar = this.d;
        Map a2 = gVar.a();
        if (a2 != null) {
            return a2.get(this.b);
        }
        a();
        int i10 = this.c;
        if (i10 == -1) {
            return null;
        }
        Object[] objArr = gVar.d;
        objArr.getClass();
        return objArr[i10];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        g gVar = this.d;
        Map a2 = gVar.a();
        Object obj2 = this.b;
        if (a2 != null) {
            return a2.put(obj2, obj);
        }
        a();
        int i10 = this.c;
        if (i10 == -1) {
            gVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = gVar.d;
        objArr.getClass();
        Object obj3 = objArr[i10];
        objArr[i10] = obj;
        return obj3;
    }
}
