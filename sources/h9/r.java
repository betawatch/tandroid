package h9;

import a8.ha;
import java.util.Map;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class r extends k {
    public final Object a;
    public int b;
    public final /* synthetic */ s c;

    public r(s sVar, int i7) {
        this.c = sVar;
        Object obj = s.s;
        this.a = sVar.k()[i7];
        this.b = i7;
    }

    public final void a() {
        int i7 = this.b;
        Object obj = this.a;
        s sVar = this.c;
        if (i7 != -1 && i7 < sVar.size()) {
            if (ha.a(obj, sVar.k()[this.b])) {
                return;
            }
        }
        Object obj2 = s.s;
        this.b = sVar.f(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        s sVar = this.c;
        Map d = sVar.d();
        if (d != null) {
            return d.get(this.a);
        }
        a();
        int i7 = this.b;
        if (i7 == -1) {
            return null;
        }
        return sVar.l()[i7];
    }

    @Override // h9.k, java.util.Map.Entry
    public final Object setValue(Object obj) {
        s sVar = this.c;
        Map d = sVar.d();
        Object obj2 = this.a;
        if (d != null) {
            return d.put(obj2, obj);
        }
        a();
        int i7 = this.b;
        if (i7 == -1) {
            sVar.put(obj2, obj);
            return null;
        }
        Object obj3 = sVar.l()[i7];
        sVar.l()[this.b] = obj;
        return obj3;
    }
}
