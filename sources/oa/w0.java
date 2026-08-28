package oa;

import java.util.BitSet;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class w0 extends la.u {
    @Override // la.u
    public final Object read(ta.a aVar) {
        boolean z10;
        BitSet bitSet = new BitSet();
        aVar.a();
        int x10 = aVar.x();
        int i9 = 0;
        while (x10 != 2) {
            int b10 = m1.j.b(x10);
            if (b10 == 5 || b10 == 6) {
                int p6 = aVar.p();
                if (p6 == 0) {
                    z10 = false;
                } else {
                    if (p6 != 1) {
                        StringBuilder p9 = j3.r0.p(p6, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        p9.append(aVar.j());
                        throw new la.j(p9.toString());
                    }
                    z10 = true;
                }
            } else {
                if (b10 != 7) {
                    throw new la.j("Invalid bitset value type: " + ta.b.k(x10) + "; at path " + aVar.h());
                }
                z10 = aVar.n();
            }
            if (z10) {
                bitSet.set(i9);
            }
            i9++;
            x10 = aVar.x();
        }
        aVar.e();
        return bitSet;
    }

    @Override // la.u
    public final void write(ta.c cVar, Object obj) {
        BitSet bitSet = (BitSet) obj;
        cVar.b();
        int length = bitSet.length();
        for (int i9 = 0; i9 < length; i9++) {
            cVar.o(bitSet.get(i9) ? 1L : 0L);
        }
        cVar.e();
    }
}
