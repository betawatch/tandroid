package gb;

import java.util.BitSet;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
                        StringBuilder l4 = i2.g.l(p5, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        l4.append(aVar.j());
                        throw new db.j(l4.toString());
                    }
                    z10 = true;
                }
            } else {
                if (c10 != 7) {
                    throw new db.j("Invalid bitset value type: " + i2.g.E(x10) + "; at path " + aVar.h());
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
