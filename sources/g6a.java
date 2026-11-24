// default package

import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class g6a {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final jg4 a;
    public final rg4 b;
    public final k7a c;
    public final c44 d;
    public final sw2 e;

    public g6a(jg4 jg4Var, rg4 rg4Var, k7a k7aVar, c44 c44Var, sw2 sw2Var) {
        jg4Var.getClass();
        rg4Var.getClass();
        k7aVar.getClass();
        c44Var.getClass();
        sw2Var.getClass();
        this.a = jg4Var;
        this.b = rg4Var;
        this.c = k7aVar;
        this.d = c44Var;
        this.e = sw2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0079, code lost:
    
        if (r6.b(r0) == r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0044, code lost:
    
        if (r7 != r5) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(gw2 gw2Var) {
        f6a f6aVar;
        int i;
        Collection values;
        Iterator it;
        if (gw2Var instanceof f6a) {
            f6aVar = (f6a) gw2Var;
            int i2 = f6aVar.c;
            if ((i2 & TLObject.FLAG_31) != 0) {
                f6aVar.c = i2 - TLObject.FLAG_31;
                Object obj = f6aVar.a;
                i = f6aVar.c;
                k7a k7aVar = this.c;
                bx2 bx2Var = bx2.a;
                if (i != 0) {
                    qse.b(obj);
                    lh4 lh4Var = lh4.a;
                    f6aVar.c = 1;
                    obj = lh4Var.b(f6aVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            sc8.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qse.b(obj);
                        Boolean b = k7aVar.a.b();
                        if (!((b == null && (b = k7aVar.b.b()) == null) ? true : b.booleanValue())) {
                            Log.d("FirebaseSessions", "Sessions SDK disabled through settings API. Events will not be sent.");
                            return Boolean.FALSE;
                        }
                        if (f <= k7aVar.a()) {
                            return Boolean.TRUE;
                        }
                        Log.d("FirebaseSessions", "Sessions SDK has dropped this session due to sampling.");
                        return Boolean.FALSE;
                    }
                    qse.b(obj);
                }
                values = ((Map) obj).values();
                if ((values instanceof Collection) || !values.isEmpty()) {
                    it = values.iterator();
                    while (it.hasNext()) {
                        if (((zx2) it.next()).a.a()) {
                            f6aVar.c = 2;
                        }
                    }
                }
                Log.d("FirebaseSessions", "Sessions SDK disabled through data collection. Events will not be sent.");
                return Boolean.FALSE;
            }
        }
        f6aVar = new f6a(this, gw2Var);
        Object obj2 = f6aVar.a;
        i = f6aVar.c;
        k7a k7aVar2 = this.c;
        bx2 bx2Var2 = bx2.a;
        if (i != 0) {
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
