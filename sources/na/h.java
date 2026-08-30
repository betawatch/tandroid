package na;

import android.content.Context;
import android.os.Bundle;
import k7.o;
import k7.p7;
import l7.w0;
import la.c0;
import la.r;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class h {
    public static final f c = new f();
    public static final m1.c d = o.a(r.b);
    public final android.support.v4.media.d a;
    public final d b;

    public h(w8.g gVar, uc.h hVar, uc.h hVar2, ca.d dVar) {
        gVar.a();
        Context context = gVar.a;
        kotlin.jvm.internal.j.d(context, "firebaseApp.applicationContext");
        c0 c0Var = c0.a;
        la.b a2 = c0.a(gVar);
        android.support.v4.media.d dVar2 = new android.support.v4.media.d(context);
        w0 w0Var = new w0(a2, hVar);
        c.getClass();
        d dVar3 = new d(hVar2, dVar, a2, w0Var, d.a(context, f.a[0]));
        this.a = dVar2;
        this.b = dVar3;
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
    public final Object b(wc.c cVar) {
        g gVar;
        int i10;
        h hVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i11 = gVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                gVar.d = i11 - TLObject.FLAG_31;
                Object obj = gVar.b;
                vc.a aVar = vc.a.a;
                i10 = gVar.d;
                sc.i iVar = sc.i.a;
                if (i10 != 0) {
                    p7.b(obj);
                    gVar.a = this;
                    gVar.d = 1;
                    this.a.getClass();
                    if (iVar != aVar) {
                        hVar = this;
                    }
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        p7.b(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hVar = gVar.a;
                p7.b(obj);
                d dVar = hVar.b;
                gVar.a = null;
                gVar.d = 2;
                return dVar.c(gVar) != aVar ? aVar : iVar;
            }
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.b;
        vc.a aVar2 = vc.a.a;
        i10 = gVar.d;
        sc.i iVar2 = sc.i.a;
        if (i10 != 0) {
        }
        d dVar2 = hVar.b;
        gVar.a = null;
        gVar.d = 2;
        if (dVar2.c(gVar) != aVar2) {
        }
    }
}
