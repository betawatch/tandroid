package c1;

import java.util.concurrent.Executor;
import ud.l;
import w0.i;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // ud.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                e eVar = (e) this.b;
                i e = (i) obj;
                kotlin.jvm.internal.i.e(e, "e");
                eVar.f().execute(new a(eVar, e, 2));
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
                e1.e eVar3 = (e1.e) this.b;
                w0.d e11 = (w0.d) obj;
                kotlin.jvm.internal.i.e(e11, "e");
                Executor executor2 = eVar3.g;
                if (executor2 == null) {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
                executor2.execute(new e1.d(eVar3, e11, 0));
                break;
            default:
                return obj == ((kd.c) this.b) ? "(this Collection)" : String.valueOf(obj);
        }
        return jd.i.a;
    }
}
