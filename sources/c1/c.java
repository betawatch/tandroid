package c1;

import dd.l;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import w0.i;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // dd.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                f fVar = (f) this.b;
                i e = (i) obj;
                j.e(e, "e");
                fVar.f().execute(new a(fVar, e, 2));
                break;
            case 1:
                d1.e eVar = (d1.e) this.b;
                w0.d e6 = (w0.d) obj;
                j.e(e6, "e");
                Executor executor = eVar.g;
                if (executor == null) {
                    j.h("executor");
                    throw null;
                }
                executor.execute(new d1.a(eVar, e6, 0));
                break;
            case 2:
                e1.d dVar = (e1.d) this.b;
                w0.d e10 = (w0.d) obj;
                j.e(e10, "e");
                Executor executor2 = dVar.g;
                if (executor2 == null) {
                    j.h("executor");
                    throw null;
                }
                executor2.execute(new e1.c(dVar, e10, 0));
                break;
            default:
                return obj == ((tc.c) this.b) ? "(this Collection)" : String.valueOf(obj);
        }
        return sc.i.a;
    }
}
