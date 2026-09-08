package bb;

import android.content.Context;
import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import v7.t7;
import w7.q;
import za.b0;
import za.r;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class i {
    public static final g c = new g();
    public static final m1.c d = q.a(r.b);
    public final a a;
    public final e b;

    public i(k9.h hVar, id.h hVar2, id.h hVar3, qa.d dVar) {
        hVar.a();
        Context context = hVar.a;
        kotlin.jvm.internal.i.d(context, "firebaseApp.applicationContext");
        b0 b0Var = b0.a;
        za.b a2 = b0.a(hVar);
        a aVar = new a(context);
        aa.a aVar2 = new aa.a(a2, hVar2);
        c.getClass();
        e eVar = new e(hVar3, dVar, a2, aVar2, d.a(context, g.a[0]));
        this.a = aVar;
        this.b = eVar;
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
        f fVar = this.b.c.b;
        if (fVar == null) {
            kotlin.jvm.internal.i.h("sessionConfigs");
            throw null;
        }
        Double d10 = fVar.b;
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
    public final Object b(kd.c cVar) {
        h hVar;
        int i10;
        i iVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i11 = hVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                hVar.d = i11 - TLObject.FLAG_31;
                Object obj = hVar.b;
                jd.a aVar = jd.a.a;
                i10 = hVar.d;
                gd.i iVar2 = gd.i.a;
                if (i10 != 0) {
                    t7.b(obj);
                    hVar.a = this;
                    hVar.d = 1;
                    this.a.getClass();
                    if (iVar2 != aVar) {
                        iVar = this;
                    }
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        t7.b(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iVar = hVar.a;
                t7.b(obj);
                e eVar = iVar.b;
                hVar.a = null;
                hVar.d = 2;
                return eVar.c(hVar) != aVar ? aVar : iVar2;
            }
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.b;
        jd.a aVar2 = jd.a.a;
        i10 = hVar.d;
        gd.i iVar22 = gd.i.a;
        if (i10 != 0) {
        }
        e eVar2 = iVar.b;
        hVar.a = null;
        hVar.d = 2;
        if (eVar2.c(hVar) != aVar2) {
        }
    }
}
