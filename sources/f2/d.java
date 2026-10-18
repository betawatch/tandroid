package f2;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class d extends f {
    public final long c;
    public final ArrayList d;
    public final ArrayList e;

    public d(int i10, long j10) {
        super(i10, 0);
        this.c = j10;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public final d d(int i10) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) arrayList.get(i11);
            if (dVar.b == i10) {
                return dVar;
            }
        }
        return null;
    }

    public final e e(int i10) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            e eVar = (e) arrayList.get(i11);
            if (eVar.b == i10) {
                return eVar;
            }
        }
        return null;
    }

    @Override // f2.f
    public final String toString() {
        return f.a(this.b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.e.toArray());
    }
}
