// default package

import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class i8a {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final li4 a;
    public final ti4 b;
    public final l9a c;
    public final m54 d;
    public final cy2 e;

    public i8a(li4 li4Var, ti4 ti4Var, l9a l9aVar, m54 m54Var, cy2 cy2Var) {
        li4Var.getClass();
        ti4Var.getClass();
        l9aVar.getClass();
        m54Var.getClass();
        cy2Var.getClass();
        this.a = li4Var;
        this.b = ti4Var;
        this.c = l9aVar;
        this.d = m54Var;
        this.e = cy2Var;
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
    public final Object a(qx2 qx2Var) {
        h8a h8aVar;
        int i;
        Collection values;
        Iterator it;
        if (qx2Var instanceof h8a) {
            h8aVar = (h8a) qx2Var;
            int i2 = h8aVar.c;
            if ((i2 & TLObject.FLAG_31) != 0) {
                h8aVar.c = i2 - TLObject.FLAG_31;
                Object obj = h8aVar.a;
                i = h8aVar.c;
                l9a l9aVar = this.c;
                ly2 ly2Var = ly2.a;
                if (i != 0) {
                    tue.b(obj);
                    pj4 pj4Var = pj4.a;
                    h8aVar.c = 1;
                    obj = pj4Var.b(h8aVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            dq9.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tue.b(obj);
                        Boolean b = l9aVar.a.b();
                        if (!((b == null && (b = l9aVar.b.b()) == null) ? true : b.booleanValue())) {
                            Log.d("FirebaseSessions", "Sessions SDK disabled through settings API. Events will not be sent.");
                            return Boolean.FALSE;
                        }
                        if (f <= l9aVar.a()) {
                            return Boolean.TRUE;
                        }
                        Log.d("FirebaseSessions", "Sessions SDK has dropped this session due to sampling.");
                        return Boolean.FALSE;
                    }
                    tue.b(obj);
                }
                values = ((Map) obj).values();
                if ((values instanceof Collection) || !values.isEmpty()) {
                    it = values.iterator();
                    while (it.hasNext()) {
                        if (((jz2) it.next()).a.a()) {
                            h8aVar.c = 2;
                        }
                    }
                }
                Log.d("FirebaseSessions", "Sessions SDK disabled through data collection. Events will not be sent.");
                return Boolean.FALSE;
            }
        }
        h8aVar = new h8a(this, qx2Var);
        Object obj2 = h8aVar.a;
        i = h8aVar.c;
        l9a l9aVar2 = this.c;
        ly2 ly2Var2 = ly2.a;
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
