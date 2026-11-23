package c1;

import android.util.Log;
import gb.j0;
import gb.k0;
import gd.k;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import oe.m;
import rd.l;
import sa.h;
import w0.i;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(ie.d dVar, ie.c cVar) {
        this.a = 5;
        this.b = dVar;
    }

    @Override // rd.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                f fVar = (f) this.b;
                i e10 = (i) obj;
                j.e(e10, "e");
                fVar.g().execute(new b(fVar, e10, 2));
                return k.a;
            case 1:
                d1.e eVar = (d1.e) this.b;
                w0.d e11 = (w0.d) obj;
                j.e(e11, "e");
                Executor executor = eVar.g;
                if (executor != null) {
                    executor.execute(new d1.a(eVar, e11, 0));
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
                k0 k0Var = (k0) this.b;
                m1.b ex = (m1.b) obj;
                j.e(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", ex);
                return new j0(k0Var.a.a(null), null, null);
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

    public /* synthetic */ c(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public /* synthetic */ c(h hVar, String str) {
        this.a = 7;
        this.b = str;
    }
}
