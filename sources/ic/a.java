package ic;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a extends c {
    public final a e;
    public ArrayList f;

    public a(String str, int i9, Map map, a aVar) {
        super(i9, str, map);
        this.e = aVar;
    }

    @Override // ic.c
    public final Map a() {
        return this.c;
    }

    public final void b(int i9) {
        if (this.d > -1) {
            return;
        }
        this.d = i9;
        ArrayList arrayList = this.f;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((a) obj).b(i9);
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BlockImpl{name='");
        sb2.append(this.a);
        sb2.append("', start=");
        sb2.append(this.b);
        sb2.append(", end=");
        sb2.append(this.d);
        sb2.append(", attributes=");
        sb2.append(this.c);
        sb2.append(", parent=");
        a aVar = this.e;
        sb2.append(aVar != null ? aVar.a : null);
        sb2.append(", children=");
        sb2.append(this.f);
        sb2.append('}');
        return sb2.toString();
    }
}
