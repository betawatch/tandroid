package f9;

import a8.xb;
import java.util.Map;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class r extends k {
    public final Object a;
    public int b;
    public final /* synthetic */ s c;

    public r(s sVar, int i10) {
        this.c = sVar;
        Object obj = s.s;
        this.a = sVar.j()[i10];
        this.b = i10;
    }

    public final void a() {
        int i10 = this.b;
        Object obj = this.a;
        s sVar = this.c;
        if (i10 != -1 && i10 < sVar.size()) {
            if (xb.a(obj, sVar.j()[this.b])) {
                return;
            }
        }
        Object obj2 = s.s;
        this.b = sVar.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        s sVar = this.c;
        Map c10 = sVar.c();
        if (c10 != null) {
            return c10.get(this.a);
        }
        a();
        int i10 = this.b;
        if (i10 == -1) {
            return null;
        }
        return sVar.k()[i10];
    }

    @Override // f9.k, java.util.Map.Entry
    public final Object setValue(Object obj) {
        s sVar = this.c;
        Map c10 = sVar.c();
        Object obj2 = this.a;
        if (c10 != null) {
            return c10.put(obj2, obj);
        }
        a();
        int i10 = this.b;
        if (i10 == -1) {
            sVar.put(obj2, obj);
            return null;
        }
        Object obj3 = sVar.k()[i10];
        sVar.k()[this.b] = obj;
        return obj3;
    }
}
