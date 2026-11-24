// default package

import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class i9d extends m3 {
    public final Object b;
    public int c;
    public final /* synthetic */ so2 d;

    public i9d(so2 so2Var, int i) {
        super((byte) 1, false);
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
            if (s3f.a(obj, objArr[i2])) {
                return;
            }
        }
        Object obj2 = so2.w;
        this.c = so2Var.x(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        so2 so2Var = this.d;
        Map n = so2Var.n();
        if (n != null) {
            return n.get(this.b);
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
        Map n = so2Var.n();
        Object obj2 = this.b;
        if (n != null) {
            return n.put(obj2, obj);
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
        int i2 = this.c;
        Object[] objArr2 = so2Var.e;
        objArr2.getClass();
        objArr2[i2] = obj;
        return obj3;
    }
}
