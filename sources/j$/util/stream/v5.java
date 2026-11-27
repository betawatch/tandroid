package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes4.dex */
public final class v5 extends a0 {
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(c0 c0Var, int i, long j, long j2) {
        super(c0Var, i);
        this.l = j;
        this.m = j2;
    }

    @Override // j$.util.stream.a
    public final h2 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        long j;
        long j2;
        long F = aVar.F(spliterator);
        if (F > 0 && spliterator.hasCharacteristics(TLObject.FLAG_14)) {
            a aVar2 = aVar;
            while (aVar2.e > 0) {
                aVar2 = aVar2.b;
            }
            return w3.B(aVar, w3.Z(aVar2.H(), spliterator, this.l, this.m), true);
        }
        if (b7.ORDERED.n(aVar.f)) {
            return (h2) new x5(this, aVar, spliterator, intFunction, this.l, this.m).invoke();
        }
        j$.util.u0 u0Var = (j$.util.u0) aVar.S(spliterator);
        long j3 = this.l;
        long j4 = this.m;
        if (j3 <= F) {
            long j5 = F - j3;
            j = j4 >= 0 ? Math.min(j4, j5) : j5;
            j2 = 0;
        } else {
            j = j4;
            j2 = j3;
        }
        return w3.B(this, new x7(u0Var, j2, j), true);
    }

    @Override // j$.util.stream.a
    public final Spliterator K(a aVar, Spliterator spliterator) {
        long F = aVar.F(spliterator);
        if (F > 0 && spliterator.hasCharacteristics(TLObject.FLAG_14)) {
            j$.util.u0 u0Var = (j$.util.u0) aVar.S(spliterator);
            long j = this.l;
            return new r7(u0Var, j, w3.z(j, this.m));
        }
        if (b7.ORDERED.n(aVar.f)) {
            return ((h2) new x5(this, aVar, spliterator, new d1((byte) 23), this.l, this.m).invoke()).spliterator();
        }
        j$.util.u0 u0Var2 = (j$.util.u0) aVar.S(spliterator);
        long j2 = this.l;
        long j3 = this.m;
        if (j2 <= F) {
            long j4 = F - j2;
            j3 = j3 >= 0 ? Math.min(j3, j4) : j4;
            j2 = 0;
        }
        return new x7(u0Var2, j2, j3);
    }

    @Override // j$.util.stream.a
    public final n5 M(int i, n5 n5Var) {
        return new u5(this, n5Var);
    }
}
