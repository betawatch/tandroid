package g9;

import b8.yb;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class r extends k {
    public final Object a;
    public int b;
    public final /* synthetic */ s c;

    public r(s sVar, int i3) {
        this.c = sVar;
        Object obj = s.s;
        this.a = sVar.k()[i3];
        this.b = i3;
    }

    public final void a() {
        int i3 = this.b;
        Object obj = this.a;
        s sVar = this.c;
        if (i3 != -1 && i3 < sVar.size()) {
            if (yb.a(obj, sVar.k()[this.b])) {
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
        int i3 = this.b;
        if (i3 == -1) {
            return null;
        }
        return sVar.l()[i3];
    }

    @Override // g9.k, java.util.Map.Entry
    public final Object setValue(Object obj) {
        s sVar = this.c;
        Map d = sVar.d();
        Object obj2 = this.a;
        if (d != null) {
            return d.put(obj2, obj);
        }
        a();
        int i3 = this.b;
        if (i3 == -1) {
            sVar.put(obj2, obj);
            return null;
        }
        Object obj3 = sVar.l()[i3];
        sVar.l()[this.b] = obj;
        return obj3;
    }
}
