package la;

import android.content.Context;
import android.os.Bundle;
import i7.c7;
import i7.x;
import ja.f0;
import ja.s;
import l3.g0;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h {
    public static final f c = new f();
    public static final m1.c d = x.a(s.b);
    public final m5.i a;
    public final d b;

    public h(u8.g gVar, sc.h hVar, sc.h hVar2, aa.d dVar) {
        gVar.a();
        Context context = gVar.a;
        kotlin.jvm.internal.j.d(context, "firebaseApp.applicationContext");
        f0 f0Var = f0.a;
        ja.b a2 = f0.a(gVar);
        m5.i iVar = new m5.i(context, 22);
        g0 g0Var = new g0(a2, hVar);
        c.getClass();
        d dVar2 = new d(hVar2, dVar, a2, g0Var, d.a(context, f.a[0]));
        this.a = iVar;
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
    public final Object b(uc.c cVar) {
        g gVar;
        int i10;
        h hVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i11 = gVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                gVar.d = i11 - TLObject.FLAG_31;
                Object obj = gVar.b;
                tc.a aVar = tc.a.a;
                i10 = gVar.d;
                qc.i iVar = qc.i.a;
                if (i10 != 0) {
                    c7.b(obj);
                    gVar.a = this;
                    gVar.d = 1;
                    this.a.getClass();
                    if (iVar != aVar) {
                        hVar = this;
                    }
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        c7.b(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hVar = gVar.a;
                c7.b(obj);
                d dVar = hVar.b;
                gVar.a = null;
                gVar.d = 2;
                return dVar.c(gVar) != aVar ? aVar : iVar;
            }
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.b;
        tc.a aVar2 = tc.a.a;
        i10 = gVar.d;
        qc.i iVar2 = qc.i.a;
        if (i10 != 0) {
        }
        d dVar2 = hVar.b;
        gVar.a = null;
        gVar.d = 2;
        if (dVar2.c(gVar) != aVar2) {
        }
    }
}
