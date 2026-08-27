package c1;

import ad.l;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import w0.i;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // ad.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                e eVar = (e) this.b;
                i e9 = (i) obj;
                j.e(e9, "e");
                eVar.f().execute(new a(eVar, e9, 2));
                break;
            case 1:
                d1.e eVar2 = (d1.e) this.b;
                w0.d e10 = (w0.d) obj;
                j.e(e10, "e");
                Executor executor = eVar2.g;
                if (executor == null) {
                    j.h("executor");
                    throw null;
                }
                executor.execute(new d1.a(eVar2, e10, 0));
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
                return obj == ((qc.c) this.b) ? "(this Collection)" : String.valueOf(obj);
        }
        return pc.i.a;
    }
}
