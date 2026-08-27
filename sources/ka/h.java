package ka;

import android.content.Context;
import android.os.Bundle;
import h7.k6;
import h7.o;
import ia.g0;
import ia.t;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h {
    public static final f c = new f();
    public static final m1.c d = o.a(t.b);
    public final android.support.v4.media.c a;
    public final d b;

    public h(t8.h hVar, rc.h hVar2, rc.h hVar3, z9.d dVar) {
        hVar.a();
        Context context = hVar.a;
        kotlin.jvm.internal.j.d(context, "firebaseApp.applicationContext");
        g0 g0Var = g0.a;
        ia.b a2 = g0.a(hVar);
        android.support.v4.media.c cVar = new android.support.v4.media.c(context);
        j9.a aVar = new j9.a(a2, hVar2);
        c.getClass();
        d dVar2 = new d(hVar3, dVar, a2, aVar, d.a(context, f.a[0]));
        this.a = cVar;
        this.b = dVar2;
    }

    public final double a() {
        Bundle bundle = this.a.a;
        Double valueOf = bundle.containsKey("firebase_sessions_sampling_rate") ? Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate")) : null;
        if (valueOf != null) {
            double doubleValue = valueOf.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        e eVar = this.b.c.b;
        if (eVar == null) {
            kotlin.jvm.internal.j.h("sessionConfigs");
            throw null;
        }
        Double d10 = eVar.b;
        if (d10 != null) {
            double doubleValue2 = d10.doubleValue();
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
    public final Object b(tc.c cVar) {
        g gVar;
        int i10;
        h hVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i11 = gVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                gVar.d = i11 - TLObject.FLAG_31;
                Object obj = gVar.b;
                sc.a aVar = sc.a.a;
                i10 = gVar.d;
                pc.i iVar = pc.i.a;
                if (i10 != 0) {
                    k6.b(obj);
                    gVar.a = this;
                    gVar.d = 1;
                    this.a.getClass();
                    if (iVar != aVar) {
                        hVar = this;
                    }
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        k6.b(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hVar = gVar.a;
                k6.b(obj);
                d dVar = hVar.b;
                gVar.a = null;
                gVar.d = 2;
                return dVar.c(gVar) != aVar ? aVar : iVar;
            }
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.b;
        sc.a aVar2 = sc.a.a;
        i10 = gVar.d;
        pc.i iVar2 = pc.i.a;
        if (i10 != 0) {
        }
        d dVar2 = hVar.b;
        gVar.a = null;
        gVar.d = 2;
        if (dVar2.c(gVar) != aVar2) {
        }
    }
}
