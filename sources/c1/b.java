package c1;

import android.util.Log;
import db.j0;
import db.k0;
import dd.k;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import le.m;
import od.l;
import w0.i;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(fe.d dVar, fe.c cVar) {
        this.a = 5;
        this.b = dVar;
    }

    @Override // od.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                e eVar = (e) this.b;
                i e10 = (i) obj;
                j.e(e10, "e");
                eVar.f().execute(new a(eVar, e10, 2));
                return k.a;
            case 1:
                d1.e eVar2 = (d1.e) this.b;
                w0.d e11 = (w0.d) obj;
                j.e(e11, "e");
                Executor executor = eVar2.g;
                if (executor != null) {
                    executor.execute(new d1.a(eVar2, e11, 0));
                    return k.a;
                }
                j.h("executor");
                throw null;
            case 2:
                k0 k0Var = (k0) this.b;
                l1.b ex = (l1.b) obj;
                j.e(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", ex);
                return new j0(k0Var.a.a(null), null, null);
            case 3:
                e1.d dVar = (e1.d) this.b;
                w0.d e12 = (w0.d) obj;
                j.e(e12, "e");
                Executor executor2 = dVar.g;
                if (executor2 != null) {
                    executor2.execute(new e1.c(dVar, e12, 0));
                    return k.a;
                }
                j.h("executor");
                throw null;
            case 4:
                return obj == ((ed.d) this.b) ? "(this Collection)" : String.valueOf(obj);
            case 5:
                ((fe.d) this.b).f(null);
                return k.a;
            case 6:
                m mVar = (m) this.b;
                int intValue = ((Integer) obj).intValue();
                return mVar.e[intValue] + ": " + mVar.i(intValue).a();
            default:
                String str = (String) this.b;
                p1.b bVar = (p1.b) obj;
                bVar.d(ra.i.d, str);
                ra.i.f(bVar, str);
                return null;
        }
    }

    public /* synthetic */ b(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    public /* synthetic */ b(ra.i iVar, String str) {
        this.a = 7;
        this.b = str;
    }
}
