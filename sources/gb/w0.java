package gb;

import java.util.BitSet;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class w0 extends db.u {
    @Override // db.u
    public final Object read(lb.a aVar) {
        boolean z10;
        BitSet bitSet = new BitSet();
        aVar.a();
        int x10 = aVar.x();
        int i10 = 0;
        while (x10 != 2) {
            int c10 = m1.j.c(x10);
            if (c10 == 5 || c10 == 6) {
                int p5 = aVar.p();
                if (p5 == 0) {
                    z10 = false;
                } else {
                    if (p5 != 1) {
                        StringBuilder m10 = hc.b.m(p5, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        m10.append(aVar.j());
                        throw new db.j(m10.toString());
                    }
                    z10 = true;
                }
            } else {
                if (c10 != 7) {
                    throw new db.j("Invalid bitset value type: " + hc.b.E(x10) + "; at path " + aVar.h());
                }
                z10 = aVar.n();
            }
            if (z10) {
                bitSet.set(i10);
            }
            i10++;
            x10 = aVar.x();
        }
        aVar.e();
        return bitSet;
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        BitSet bitSet = (BitSet) obj;
        bVar.b();
        int length = bitSet.length();
        for (int i10 = 0; i10 < length; i10++) {
            bVar.o(bitSet.get(i10) ? 1L : 0L);
        }
        bVar.e();
    }
}
