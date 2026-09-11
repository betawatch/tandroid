package e9;

import java.util.Map;
import v7.s6;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class u extends m {
    public final Object a;
    public int b;
    public final /* synthetic */ v c;

    public u(v vVar, int i10) {
        this.c = vVar;
        Object obj = v.s;
        this.a = vVar.i()[i10];
        this.b = i10;
    }

    public final void a() {
        int i10 = this.b;
        Object obj = this.a;
        v vVar = this.c;
        if (i10 != -1 && i10 < vVar.size()) {
            if (s6.a(obj, vVar.i()[this.b])) {
                return;
            }
        }
        Object obj2 = v.s;
        this.b = vVar.d(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        v vVar = this.c;
        Map b10 = vVar.b();
        if (b10 != null) {
            return b10.get(this.a);
        }
        a();
        int i10 = this.b;
        if (i10 == -1) {
            return null;
        }
        return vVar.j()[i10];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        v vVar = this.c;
        Map b10 = vVar.b();
        Object obj2 = this.a;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i10 = this.b;
        if (i10 == -1) {
            vVar.put(obj2, obj);
            return null;
        }
        Object obj3 = vVar.j()[i10];
        vVar.j()[this.b] = obj;
        return obj3;
    }
}
