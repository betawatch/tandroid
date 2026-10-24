package cd;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class a extends c {
    public final a e;
    public ArrayList f;

    public a(String str, int i10, Map map, a aVar) {
        super(i10, str, map);
        this.e = aVar;
    }

    @Override // cd.c
    public final Map a() {
        return this.c;
    }

    public final void b(int i10) {
        if (this.d > -1) {
            return;
        }
        this.d = i10;
        ArrayList arrayList = this.f;
        if (arrayList != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((a) obj).b(i10);
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
