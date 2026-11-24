// default package

import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class k7d extends m3 {
    public final Object b;
    public int c;
    public final /* synthetic */ so2 d;

    public k7d(so2 so2Var, int i) {
        super((byte) 2, false);
        this.d = so2Var;
        Object[] objArr = so2Var.d;
        objArr.getClass();
        this.b = objArr[i];
        this.c = i;
    }

    public final void a() {
        int i = this.c;
        Object obj = this.b;
        so2 so2Var = this.d;
        if (i != -1 && i < so2Var.size()) {
            int i2 = this.c;
            Object[] objArr = so2Var.d;
            objArr.getClass();
            if (m1f.a(obj, objArr[i2])) {
                return;
            }
        }
        Object obj2 = so2.w;
        this.c = so2Var.s(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        so2 so2Var = this.d;
        Map m = so2Var.m();
        if (m != null) {
            return m.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        Object[] objArr = so2Var.e;
        objArr.getClass();
        return objArr[i];
    }

    @Override // m3, java.util.Map.Entry
    public final Object setValue(Object obj) {
        so2 so2Var = this.d;
        Map m = so2Var.m();
        Object obj2 = this.b;
        if (m != null) {
            return m.put(obj2, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            so2Var.put(obj2, obj);
            return null;
        }
        Object[] objArr = so2Var.e;
        objArr.getClass();
        Object obj3 = objArr[i];
        objArr[i] = obj;
        return obj3;
    }
}
