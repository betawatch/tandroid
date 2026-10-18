package cb;

import a6.m;
import ab.f0;
import android.content.Context;
import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import v7.i8;
import w7.s;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class h {
    public static final f c = new f();
    public static final m1.c d = s.a(ab.s.b);
    public final m a;
    public final d b;

    public h(l9.h hVar, kd.h hVar2, kd.h hVar3, ra.d dVar) {
        hVar.a();
        Context context = hVar.a;
        kotlin.jvm.internal.i.d(context, "firebaseApp.applicationContext");
        f0 f0Var = f0.a;
        ab.b a2 = f0.a(hVar);
        m mVar = new m(context);
        androidx.biometric.e eVar = new androidx.biometric.e(a2, hVar2);
        c.getClass();
        d dVar2 = new d(hVar3, dVar, a2, eVar, d.a(context, f.a[0]));
        this.a = mVar;
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
    public final Object b(md.c cVar) {
        g gVar;
        int i10;
        h hVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i11 = gVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                gVar.d = i11 - TLObject.FLAG_31;
                Object obj = gVar.b;
                ld.a aVar = ld.a.a;
                i10 = gVar.d;
                id.i iVar = id.i.a;
                if (i10 != 0) {
                    i8.b(obj);
                    gVar.a = this;
                    gVar.d = 1;
                    this.a.getClass();
                    if (iVar != aVar) {
                        hVar = this;
                    }
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        i8.b(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hVar = gVar.a;
                i8.b(obj);
                d dVar = hVar.b;
                gVar.a = null;
                gVar.d = 2;
                return dVar.c(gVar) != aVar ? aVar : iVar;
            }
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.b;
        ld.a aVar2 = ld.a.a;
        i10 = gVar.d;
        id.i iVar2 = id.i.a;
        if (i10 != 0) {
        }
        d dVar2 = hVar.b;
        gVar.a = null;
        gVar.d = 2;
        if (dVar2.c(gVar) != aVar2) {
        }
    }
}
