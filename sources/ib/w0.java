package ib;

import java.util.BitSet;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class w0 extends fb.u {
    @Override // fb.u
    public final Object read(nb.a aVar) {
        boolean z10;
        BitSet bitSet = new BitSet();
        aVar.a();
        int x9 = aVar.x();
        int i10 = 0;
        while (x9 != 2) {
            int c10 = m1.j.c(x9);
            if (c10 == 5 || c10 == 6) {
                int p10 = aVar.p();
                if (p10 == 0) {
                    z10 = false;
                } else {
                    if (p10 != 1) {
                        StringBuilder k10 = ic.a.k(p10, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        k10.append(aVar.j());
                        throw new fb.j(k10.toString());
                    }
                    z10 = true;
                }
            } else {
                if (c10 != 7) {
                    throw new fb.j("Invalid bitset value type: " + ic.a.C(x9) + "; at path " + aVar.h());
                }
                z10 = aVar.n();
            }
            if (z10) {
                bitSet.set(i10);
            }
            i10++;
            x9 = aVar.x();
        }
        aVar.e();
        return bitSet;
    }

    @Override // fb.u
    public final void write(nb.b bVar, Object obj) {
        BitSet bitSet = (BitSet) obj;
        bVar.b();
        int length = bitSet.length();
        for (int i10 = 0; i10 < length; i10++) {
            bVar.o(bitSet.get(i10) ? 1L : 0L);
        }
        bVar.e();
    }
}
