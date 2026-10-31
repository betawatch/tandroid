package bd;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ld.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // ld.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return obj == ((e) this.b) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                c1.d dVar = (c1.d) this.b;
                w0.i e = (w0.i) obj;
                kotlin.jvm.internal.i.e(e, "e");
                dVar.f().execute(new c1.a(dVar, e, 2));
                break;
            case 2:
                d1.f fVar = (d1.f) this.b;
                w0.d e7 = (w0.d) obj;
                kotlin.jvm.internal.i.e(e7, "e");
                Executor executor = fVar.g;
                if (executor == null) {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
                executor.execute(new d1.a(fVar, e7, 0));
                break;
            default:
                e1.d dVar2 = (e1.d) this.b;
                w0.d e10 = (w0.d) obj;
                kotlin.jvm.internal.i.e(e10, "e");
                Executor executor2 = dVar2.g;
                if (executor2 == null) {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
                executor2.execute(new e1.c(dVar2, e10, 0));
                break;
        }
        return ad.j.a;
    }
}
