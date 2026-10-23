package e9;

import java.util.Map;
import v7.t6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class w extends n {
    public final Object a;
    public int b;
    public final /* synthetic */ x c;

    public w(x xVar, int i10) {
        this.c = xVar;
        Object obj = x.s;
        this.a = xVar.j()[i10];
        this.b = i10;
    }

    public final void a() {
        int i10 = this.b;
        Object obj = this.a;
        x xVar = this.c;
        if (i10 != -1 && i10 < xVar.size()) {
            if (t6.a(obj, xVar.j()[this.b])) {
                return;
            }
        }
        Object obj2 = x.s;
        this.b = xVar.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        x xVar = this.c;
        Map c10 = xVar.c();
        if (c10 != null) {
            return c10.get(this.a);
        }
        a();
        int i10 = this.b;
        if (i10 == -1) {
            return null;
        }
        return xVar.k()[i10];
    }

    @Override // e9.n, java.util.Map.Entry
    public final Object setValue(Object obj) {
        x xVar = this.c;
        Map c10 = xVar.c();
        Object obj2 = this.a;
        if (c10 != null) {
            return c10.put(obj2, obj);
        }
        a();
        int i10 = this.b;
        if (i10 == -1) {
            xVar.put(obj2, obj);
            return null;
        }
        Object obj3 = xVar.k()[i10];
        xVar.k()[this.b] = obj;
        return obj3;
    }
}
