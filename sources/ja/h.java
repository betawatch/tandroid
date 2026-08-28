package ja;

import android.content.Context;
import android.os.Bundle;
import g7.o;
import g7.y5;
import ha.f0;
import ha.s;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h {
    public static final f c = new f();
    public static final m1.c d = o.a(s.b);
    public final xa.c a;
    public final d b;

    public h(s8.h hVar, qc.h hVar2, qc.h hVar3, y9.d dVar) {
        hVar.a();
        Context context = hVar.a;
        kotlin.jvm.internal.i.d(context, "firebaseApp.applicationContext");
        f0 f0Var = f0.a;
        ha.b a2 = f0.a(hVar);
        xa.c cVar = new xa.c(context);
        j4.c cVar2 = new j4.c(a2, hVar2);
        c.getClass();
        d dVar2 = new d(hVar3, dVar, a2, cVar2, d.a(context, f.a[0]));
        this.a = cVar;
        this.b = dVar2;
    }

    public final double a() {
        Bundle bundle = (Bundle) this.a.b;
        Double valueOf = bundle.containsKey("firebase_sessions_sampling_rate") ? Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate")) : null;
        if (valueOf != null) {
            double doubleValue = valueOf.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        e eVar = this.b.c.b;
        if (eVar == null) {
            kotlin.jvm.internal.i.h("sessionConfigs");
            throw null;
        }
        Double d9 = eVar.b;
        if (d9 != null) {
            double doubleValue2 = d9.doubleValue();
            if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sc.c cVar) {
        g gVar;
        int i9;
        h hVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i10 = gVar.d;
            if ((i10 & TLObject.FLAG_31) != 0) {
                gVar.d = i10 - TLObject.FLAG_31;
                Object obj = gVar.b;
                rc.a aVar = rc.a.a;
                i9 = gVar.d;
                oc.i iVar = oc.i.a;
                if (i9 != 0) {
                    y5.b(obj);
                    gVar.a = this;
                    gVar.d = 1;
                    this.a.getClass();
                    if (iVar != aVar) {
                        hVar = this;
                    }
                }
                if (i9 != 1) {
                    if (i9 == 2) {
                        y5.b(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hVar = gVar.a;
                y5.b(obj);
                d dVar = hVar.b;
                gVar.a = null;
                gVar.d = 2;
                return dVar.c(gVar) != aVar ? aVar : iVar;
            }
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.b;
        rc.a aVar2 = rc.a.a;
        i9 = gVar.d;
        oc.i iVar2 = oc.i.a;
        if (i9 != 0) {
        }
        d dVar2 = hVar.b;
        gVar.a = null;
        gVar.d = 2;
        if (dVar2.c(gVar) != aVar2) {
        }
    }
}
