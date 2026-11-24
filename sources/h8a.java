// default package

import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class h8a {
    public final snb a;
    public final v63 b;
    public final AtomicReference c;

    public h8a(sw2 sw2Var, snb snbVar, v63 v63Var) {
        sw2Var.getClass();
        snbVar.getClass();
        v63Var.getClass();
        this.a = snbVar;
        this.b = v63Var;
        this.c = new AtomicReference();
        ppd.b(h9e.a(sw2Var), new f8a(this, null, (byte) 0));
    }

    public final t5a a() {
        AtomicReference atomicReference = this.c;
        if (atomicReference.get() == null) {
            Object a = ipd.a(new f8a(this, null, (byte) 1));
            while (!atomicReference.compareAndSet(null, a) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        obj.getClass();
        return (t5a) obj;
    }

    public final boolean b() {
        Long l = a().e;
        Integer num = a().d;
        if (l == null || num == null) {
            return true;
        }
        this.a.getClass();
        return snb.a().c - l.longValue() >= ((long) num.intValue());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|19|20|(1:22))|11|12|13))|25|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        android.util.Log.w("FirebaseSessions", "Failed to update config values: " + r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(t5a t5aVar, gw2 gw2Var) {
        g8a g8aVar;
        int i;
        if (gw2Var instanceof g8a) {
            g8aVar = (g8a) gw2Var;
            int i2 = g8aVar.c;
            if ((i2 & TLObject.FLAG_31) != 0) {
                g8aVar.c = i2 - TLObject.FLAG_31;
                Object obj = g8aVar.a;
                i = g8aVar.c;
                if (i != 0) {
                    qse.b(obj);
                    v63 v63Var = this.b;
                    c73 c73Var = new c73(t5aVar, null);
                    g8aVar.c = 1;
                    Object a = v63Var.a(c73Var, g8aVar);
                    bx2 bx2Var = bx2.a;
                    if (a == bx2Var) {
                        return bx2Var;
                    }
                } else {
                    if (i != 1) {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qse.b(obj);
                }
                return g5c.a;
            }
        }
        g8aVar = new g8a(this, gw2Var);
        Object obj2 = g8aVar.a;
        i = g8aVar.c;
        if (i != 0) {
        }
        return g5c.a;
    }
}
