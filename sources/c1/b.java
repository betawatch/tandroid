package c1;

import java.util.concurrent.Executor;
import rd.l;
import w0.i;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // rd.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                e eVar = (e) this.b;
                i e7 = (i) obj;
                kotlin.jvm.internal.i.e(e7, "e");
                eVar.f().execute(new a(eVar, e7, 2));
                break;
            case 1:
                d1.e eVar2 = (d1.e) this.b;
                w0.d e10 = (w0.d) obj;
                kotlin.jvm.internal.i.e(e10, "e");
                Executor executor = eVar2.g;
                if (executor == null) {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
                executor.execute(new d1.a(eVar2, e10, 0));
                break;
            case 2:
                e1.d dVar = (e1.d) this.b;
                w0.d e11 = (w0.d) obj;
                kotlin.jvm.internal.i.e(e11, "e");
                Executor executor2 = dVar.g;
                if (executor2 == null) {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
                executor2.execute(new e1.c(dVar, e11, 0));
                break;
            default:
                return obj == ((hd.c) this.b) ? "(this Collection)" : String.valueOf(obj);
        }
        return gd.i.a;
    }
}
