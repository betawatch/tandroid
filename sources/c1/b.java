package c1;

import java.util.concurrent.Executor;
import w0.i;
import zc.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // zc.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                e eVar = (e) this.b;
                i e10 = (i) obj;
                kotlin.jvm.internal.i.e(e10, "e");
                eVar.f().execute(new a(eVar, e10, 2));
                break;
            case 1:
                d1.e eVar2 = (d1.e) this.b;
                w0.d e11 = (w0.d) obj;
                kotlin.jvm.internal.i.e(e11, "e");
                Executor executor = eVar2.g;
                if (executor == null) {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
                executor.execute(new d1.a(eVar2, e11, 0));
                break;
            case 2:
                e1.d dVar = (e1.d) this.b;
                w0.d e12 = (w0.d) obj;
                kotlin.jvm.internal.i.e(e12, "e");
                Executor executor2 = dVar.g;
                if (executor2 == null) {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
                executor2.execute(new e1.c(dVar, e12, 0));
                break;
            default:
                return obj == ((pc.c) this.b) ? "(this Collection)" : String.valueOf(obj);
        }
        return oc.i.a;
    }
}
