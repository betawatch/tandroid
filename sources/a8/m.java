package a8;

import java.util.Map;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class m extends g {
    public final Object b;
    public int c;
    public final /* synthetic */ o d;

    public m(o oVar, int i7) {
        super(0, false);
        this.d = oVar;
        Object[] objArr = oVar.c;
        objArr.getClass();
        this.b = objArr[i7];
        this.c = i7;
    }

    public final void a() {
        int i7 = this.c;
        Object obj = this.b;
        o oVar = this.d;
        if (i7 != -1 && i7 < oVar.size()) {
            int i10 = this.c;
            Object[] objArr = oVar.c;
            objArr.getClass();
            if (w0.a(obj, objArr[i10])) {
                return;
            }
        }
        Object obj2 = o.s;
        this.c = oVar.f(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        o oVar = this.d;
        Map b10 = oVar.b();
        if (b10 != null) {
            return b10.get(this.b);
        }
        a();
        int i7 = this.c;
        if (i7 == -1) {
            return null;
        }
        Object[] objArr = oVar.d;
        objArr.getClass();
        return objArr[i7];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        o oVar = this.d;
        Map b10 = oVar.b();
        Object obj2 = this.b;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i7 = this.c;
        if (i7 == -1) {
            oVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = oVar.d;
        objArr.getClass();
        Object obj3 = objArr[i7];
        int i10 = this.c;
        Object[] objArr2 = oVar.d;
        objArr2.getClass();
        objArr2[i10] = obj;
        return obj3;
    }
}
