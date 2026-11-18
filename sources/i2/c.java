package i2;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
