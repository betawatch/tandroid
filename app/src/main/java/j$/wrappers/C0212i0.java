package j$.wrappers;

import java.util.function.LongFunction;
/* renamed from: j$.wrappers.i0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0212i0 implements LongFunction {
    final /* synthetic */ j$.util.function.r a;

    private /* synthetic */ C0212i0(j$.util.function.r rVar) {
        this.a = rVar;
    }

    public static /* synthetic */ LongFunction a(j$.util.function.r rVar) {
        if (rVar == null) {
            return null;
        }
        return rVar instanceof C0210h0 ? ((C0210h0) rVar).a : new C0212i0(rVar);
    }

    @Override // java.util.function.LongFunction
    public /* synthetic */ Object apply(long j) {
        return this.a.apply(j);
    }
}
