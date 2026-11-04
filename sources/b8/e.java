package b8;

import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e extends bh {
    public final Object b;
    public int c;
    public final /* synthetic */ g d;

    public e(g gVar, int i3) {
        super(0, false);
        this.d = gVar;
        Object[] objArr = gVar.c;
        objArr.getClass();
        this.b = objArr[i3];
        this.c = i3;
    }

    public final void a() {
        int i3 = this.c;
        Object obj = this.b;
        g gVar = this.d;
        if (i3 != -1 && i3 < gVar.size()) {
            int i10 = this.c;
            Object[] objArr = gVar.c;
            objArr.getClass();
            if (m1.a(obj, objArr[i10])) {
                return;
            }
        }
        Object obj2 = g.s;
        this.c = gVar.f(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        g gVar = this.d;
        Map b10 = gVar.b();
        if (b10 != null) {
            return b10.get(this.b);
        }
        a();
        int i3 = this.c;
        if (i3 == -1) {
            return null;
        }
        Object[] objArr = gVar.d;
        objArr.getClass();
        return objArr[i3];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        g gVar = this.d;
        Map b10 = gVar.b();
        Object obj2 = this.b;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i3 = this.c;
        if (i3 == -1) {
            gVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = gVar.d;
        objArr.getClass();
        Object obj3 = objArr[i3];
        objArr[i3] = obj;
        return obj3;
    }
}
