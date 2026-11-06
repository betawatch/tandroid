package i2;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class c extends dd.k {
    public final long c;
    public final ArrayList d;
    public final ArrayList e;

    public c(int i7, long j3) {
        super(i7, 1);
        this.c = j3;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public final c d(int i7) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) arrayList.get(i10);
            if (cVar.b == i7) {
                return cVar;
            }
        }
        return null;
    }

    public final d e(int i7) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar.b == i7) {
                return dVar;
            }
        }
        return null;
    }

    @Override // dd.k
    public final String toString() {
        return dd.k.a(this.b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.e.toArray());
    }
}
