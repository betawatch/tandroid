package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class L3 extends AbstractC0062b1 {
    public L3(AbstractC0066c abstractC0066c) {
        super(abstractC0066c, EnumC0083e4.LONG_VALUE, EnumC0077d4.q | EnumC0077d4.o);
    }

    @Override // j$.util.stream.AbstractC0066c
    public A1 E0(AbstractC0193y2 abstractC0193y2, j$.util.u uVar, j$.util.function.m mVar) {
        if (EnumC0077d4.SORTED.d(abstractC0193y2.s0())) {
            return abstractC0193y2.p0(uVar, false, mVar);
        }
        long[] jArr = (long[]) ((AbstractC0192y1) abstractC0193y2.p0(uVar, true, mVar)).e();
        Arrays.sort(jArr);
        return new C0123l2(jArr);
    }

    @Override // j$.util.stream.AbstractC0066c
    public AbstractC0130m3 H0(int i, AbstractC0130m3 abstractC0130m3) {
        abstractC0130m3.getClass();
        return EnumC0077d4.SORTED.d(i) ? abstractC0130m3 : EnumC0077d4.SIZED.d(i) ? new Q3(abstractC0130m3) : new I3(abstractC0130m3);
    }
}
