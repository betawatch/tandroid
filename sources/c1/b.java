package c1;

import android.util.Log;
import gb.k0;
import gb.l0;
import gd.k;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import oe.m;
import rd.l;
import sa.h;
import w0.i;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(ie.d dVar, ie.c cVar) {
        this.a = 5;
        this.b = dVar;
    }

    @Override // rd.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                e eVar = (e) this.b;
                i e10 = (i) obj;
                j.e(e10, "e");
                eVar.g().execute(new a(eVar, e10, 2));
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
            case 3:
                l0 l0Var = (l0) this.b;
                m1.b ex = (m1.b) obj;
                j.e(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", ex);
                return new k0(l0Var.a.a(null), null, null);
            case 4:
                return obj == ((hd.c) this.b) ? "(this Collection)" : String.valueOf(obj);
            case 5:
                ((ie.d) this.b).f(null);
                return k.a;
            case 6:
                m mVar = (m) this.b;
                int intValue = ((Integer) obj).intValue();
                return mVar.e[intValue] + ": " + mVar.i(intValue).a();
            default:
                String str = (String) this.b;
                q1.b bVar = (q1.b) obj;
                bVar.d(h.d, str);
                h.f(bVar, str);
                return null;
        }
    }

    public /* synthetic */ b(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public /* synthetic */ b(h hVar, String str) {
        this.a = 7;
        this.b = str;
    }
}
