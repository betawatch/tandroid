package db;

import android.util.Log;
import b8.ib;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t0 implements q0 {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final n9.h a;
    public final ua.e b;
    public final gb.l c;
    public final l d;
    public final fd.h e;

    public t0(n9.h firebaseApp, ua.e firebaseInstallations, gb.l sessionSettings, l eventGDTLogger, fd.h backgroundDispatcher) {
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
    public static final Object a(t0 t0Var, hd.c cVar) {
        s0 s0Var;
        int i3;
        Collection values;
        Iterator it;
        gb.l lVar = t0Var.c;
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i10 = s0Var.c;
            if ((i10 & TLObject.FLAG_31) != 0) {
                s0Var.c = i10 - TLObject.FLAG_31;
                Object obj = s0Var.a;
                gd.a aVar = gd.a.a;
                i3 = s0Var.c;
                if (i3 != 0) {
                    ib.b(obj);
                    eb.c cVar2 = eb.c.a;
                    s0Var.c = 1;
                    obj = cVar2.b(s0Var);
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ib.b(obj);
                        Boolean b10 = lVar.a.b();
                        if (!((b10 == null && (b10 = lVar.b.b()) == null) ? true : b10.booleanValue())) {
                            Log.d("FirebaseSessions", "Sessions SDK disabled through settings API. Events will not be sent.");
                            return Boolean.FALSE;
                        }
                        if (f <= lVar.a()) {
                            return Boolean.TRUE;
                        }
                        Log.d("FirebaseSessions", "Sessions SDK has dropped this session due to sampling.");
                        return Boolean.FALSE;
                    }
                    ib.b(obj);
                }
                values = ((Map) obj).values();
                if ((values instanceof Collection) || !values.isEmpty()) {
                    it = values.iterator();
                    while (it.hasNext()) {
                        if (((z9.i) it.next()).a.a()) {
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
        gd.a aVar2 = gd.a.a;
        i3 = s0Var.c;
        if (i3 != 0) {
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
