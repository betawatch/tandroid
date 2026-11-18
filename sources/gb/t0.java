package gb;

import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class t0 implements q0 {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final o9.g a;
    public final va.d b;
    public final jb.l c;
    public final l d;
    public final id.h e;

    public t0(o9.g firebaseApp, va.d firebaseInstallations, jb.l sessionSettings, l eventGDTLogger, id.h backgroundDispatcher) {
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
    public static final Object a(t0 t0Var, kd.c cVar) {
        s0 s0Var;
        int i7;
        Collection values;
        Iterator it;
        jb.l lVar = t0Var.c;
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i10 = s0Var.c;
            if ((i10 & TLObject.FLAG_31) != 0) {
                s0Var.c = i10 - TLObject.FLAG_31;
                Object obj = s0Var.a;
                jd.a aVar = jd.a.a;
                i7 = s0Var.c;
                if (i7 != 0) {
                    b7.h.b(obj);
                    hb.c cVar2 = hb.c.a;
                    s0Var.c = 1;
                    obj = cVar2.b(s0Var);
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        b7.h.b(obj);
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
                    b7.h.b(obj);
                }
                values = ((Map) obj).values();
                if ((values instanceof Collection) || !values.isEmpty()) {
                    it = values.iterator();
                    while (it.hasNext()) {
                        if (((aa.j) it.next()).a.a()) {
                            s0Var.c = 2;
                        }
                    }
                }
                Log.d("FirebaseSessions", "Sessions SDK disabled through data collection. Events will not be sent.");
                return Boolean.FALSE;
            }
        }
        s0Var = new s0(t0Var, cVar);
        Object obj2 = s0Var.a;
        jd.a aVar2 = jd.a.a;
        i7 = s0Var.c;
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
