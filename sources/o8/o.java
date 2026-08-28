package o8;

import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o extends j {
    public final Object a;
    public int b;
    public final /* synthetic */ p c;

    public o(p pVar, int i9) {
        this.c = pVar;
        Object obj = p.s;
        this.a = pVar.i()[i9];
        this.b = i9;
    }

    public final void a() {
        int i9 = this.b;
        Object obj = this.a;
        p pVar = this.c;
        if (i9 != -1 && i9 < pVar.size()) {
            if (g7.c0.a(obj, pVar.i()[this.b])) {
                return;
            }
        }
        Object obj2 = p.s;
        this.b = pVar.d(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        p pVar = this.c;
        Map b10 = pVar.b();
        if (b10 != null) {
            return b10.get(this.a);
        }
        a();
        int i9 = this.b;
        if (i9 == -1) {
            return null;
        }
        return pVar.j()[i9];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        p pVar = this.c;
        Map b10 = pVar.b();
        Object obj2 = this.a;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i9 = this.b;
        if (i9 == -1) {
            pVar.put(obj2, obj);
            return null;
        }
        Object obj3 = pVar.j()[i9];
        pVar.j()[this.b] = obj;
        return obj3;
    }
}
