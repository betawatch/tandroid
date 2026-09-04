package f2;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class d extends dd.k {
    public final long c;
    public final ArrayList d;
    public final ArrayList e;

    public d(int i10, long j3) {
        super(i10, 1);
        this.c = j3;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public final d i(int i10) {
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

    public final e j(int i10) {
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

    @Override // dd.k
    public final String toString() {
        return dd.k.b(this.b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.e.toArray());
    }
}
