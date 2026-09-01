package c1;

import dd.l;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import w0.i;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                i e6 = (i) obj;
                j.e(e6, "e");
                fVar.f().execute(new a(fVar, e6, 2));
                break;
            case 1:
                d1.e eVar = (d1.e) this.b;
                w0.d e10 = (w0.d) obj;
                j.e(e10, "e");
                Executor executor = eVar.g;
                if (executor == null) {
                    j.h("executor");
                    throw null;
                }
                executor.execute(new d1.a(eVar, e10, 0));
                break;
            case 2:
                e1.d dVar = (e1.d) this.b;
                w0.d e11 = (w0.d) obj;
                j.e(e11, "e");
                Executor executor2 = dVar.g;
                if (executor2 == null) {
                    j.h("executor");
                    throw null;
                }
                executor2.execute(new e1.c(dVar, e11, 0));
                break;
            default:
                return obj == ((tc.c) this.b) ? "(this Collection)" : String.valueOf(obj);
        }
        return sc.i.a;
    }
}
