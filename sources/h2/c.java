package h2;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends ad.l {
    public final long c;
    public final ArrayList d;
    public final ArrayList e;

    public c(int i3, long j10) {
        super(i3, 1);
        this.c = j10;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public final c d(int i3) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) arrayList.get(i10);
            if (cVar.b == i3) {
                return cVar;
            }
        }
        return null;
    }

    public final d e(int i3) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar.b == i3) {
                return dVar;
            }
        }
        return null;
    }

    @Override // ad.l
    public final String toString() {
        return ad.l.a(this.b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.e.toArray());
    }
}
