package c1;

import bd.l;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import w0.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // bd.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                e eVar = (e) this.b;
                i e10 = (i) obj;
                j.e(e10, "e");
                eVar.f().execute(new a(eVar, e10, 2));
                break;
            case 1:
                d1.e eVar2 = (d1.e) this.b;
                w0.d e11 = (w0.d) obj;
                j.e(e11, "e");
                Executor executor = eVar2.g;
                if (executor == null) {
                    j.h("executor");
                    throw null;
                }
                executor.execute(new d1.a(eVar2, e11, 0));
                break;
            case 2:
                e1.d dVar = (e1.d) this.b;
                w0.d e12 = (w0.d) obj;
                j.e(e12, "e");
                Executor executor2 = dVar.g;
                if (executor2 == null) {
                    j.h("executor");
                    throw null;
                }
                executor2.execute(new e1.c(dVar, e12, 0));
                break;
            default:
                return obj == ((rc.c) this.b) ? "(this Collection)" : String.valueOf(obj);
        }
        return qc.i.a;
    }
}
