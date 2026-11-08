package gb;

import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class u0 implements r0 {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final o9.g a;
    public final va.d b;
    public final jb.l c;
    public final l d;
    public final id.h e;

    public u0(o9.g firebaseApp, va.d firebaseInstallations, jb.l sessionSettings, l eventGDTLogger, id.h backgroundDispatcher) {
        kotlin.jvm.internal.j.e(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.j.e(firebaseInstallations, "firebaseInstallations");
        kotlin.jvm.internal.j.e(sessionSettings, "sessionSettings");
        kotlin.jvm.internal.j.e(eventGDTLogger, "eventGDTLogger");
        kotlin.jvm.internal.j.e(backgroundDispatcher, "backgroundDispatcher");
        this.a = firebaseApp;
        this.b = firebaseInstallations;
        this.c = sessionSettings;
        this.d = eventGDTLogger;
        this.e = backgroundDispatcher;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007c, code lost:
    
        if (r0.b(r1) == r7) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007e, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0045, code lost:
    
        if (r6 == r7) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(u0 u0Var, kd.c cVar) {
        t0 t0Var;
        int i7;
        Collection values;
        Iterator it;
        jb.l lVar = u0Var.c;
        if (cVar instanceof t0) {
            t0Var = (t0) cVar;
            int i10 = t0Var.c;
            if ((i10 & TLObject.FLAG_31) != 0) {
                t0Var.c = i10 - TLObject.FLAG_31;
                Object obj = t0Var.a;
                jd.a aVar = jd.a.a;
                i7 = t0Var.c;
                if (i7 != 0) {
                    af.b.c(obj);
                    hb.c cVar2 = hb.c.a;
                    t0Var.c = 1;
                    obj = cVar2.b(t0Var);
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        af.b.c(obj);
                        Boolean a10 = lVar.a.a();
                        if (!((a10 == null && (a10 = lVar.b.a()) == null) ? true : a10.booleanValue())) {
                            Log.d("FirebaseSessions", "Sessions SDK disabled through settings API. Events will not be sent.");
                            return Boolean.FALSE;
                        }
                        if (f <= lVar.a()) {
                            return Boolean.TRUE;
                        }
                        Log.d("FirebaseSessions", "Sessions SDK has dropped this session due to sampling.");
                        return Boolean.FALSE;
                    }
                    af.b.c(obj);
                }
                values = ((Map) obj).values();
                if ((values instanceof Collection) || !values.isEmpty()) {
                    it = values.iterator();
                    while (it.hasNext()) {
                        if (((aa.j) it.next()).a.a()) {
                            t0Var.c = 2;
                        }
                    }
                }
                Log.d("FirebaseSessions", "Sessions SDK disabled through data collection. Events will not be sent.");
                return Boolean.FALSE;
            }
        }
        t0Var = new t0(u0Var, cVar);
        Object obj2 = t0Var.a;
        jd.a aVar2 = jd.a.a;
        i7 = t0Var.c;
        if (i7 != 0) {
        }
        values = ((Map) obj2).values();
        if (values instanceof Collection) {
        }
        it = values.iterator();
        while (it.hasNext()) {
        }
        Log.d("FirebaseSessions", "Sessions SDK disabled through data collection. Events will not be sent.");
        return Boolean.FALSE;
    }
}
