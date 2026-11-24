// default package

import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class m9d extends m3 {
    public final Object b;
    public int c;
    public final /* synthetic */ dq2 d;

    public m9d(dq2 dq2Var, int i) {
        super((byte) 2, false);
        this.d = dq2Var;
        Object[] objArr = dq2Var.d;
        objArr.getClass();
        this.b = objArr[i];
        this.c = i;
    }

    public final void a() {
        int i = this.c;
        Object obj = this.b;
        dq2 dq2Var = this.d;
        if (i != -1 && i < dq2Var.size()) {
            int i2 = this.c;
            Object[] objArr = dq2Var.d;
            objArr.getClass();
            if (o3f.a(obj, objArr[i2])) {
                return;
            }
        }
        Object obj2 = dq2.w;
        this.c = dq2Var.s(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        dq2 dq2Var = this.d;
        Map m = dq2Var.m();
        if (m != null) {
            return m.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        Object[] objArr = dq2Var.e;
        objArr.getClass();
        return objArr[i];
    }

    @Override // m3, java.util.Map.Entry
    public final Object setValue(Object obj) {
        dq2 dq2Var = this.d;
        Map m = dq2Var.m();
        Object obj2 = this.b;
        if (m != null) {
            return m.put(obj2, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            dq2Var.put(obj2, obj);
            return null;
        }
        Object[] objArr = dq2Var.e;
        objArr.getClass();
        Object obj3 = objArr[i];
        objArr[i] = obj;
        return obj3;
    }
}
