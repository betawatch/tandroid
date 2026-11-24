// default package

import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class haa {
    public final tpb a;
    public final h83 b;
    public final AtomicReference c;

    public haa(cy2 cy2Var, tpb tpbVar, h83 h83Var) {
        cy2Var.getClass();
        tpbVar.getClass();
        h83Var.getClass();
        this.a = tpbVar;
        this.b = h83Var;
        this.c = new AtomicReference();
        srd.b(ibe.a(cy2Var), new faa(this, null, (byte) 0));
    }

    public final v7a a() {
        AtomicReference atomicReference = this.c;
        if (atomicReference.get() == null) {
            Object a = lrd.a(new faa(this, null, (byte) 1));
            while (!atomicReference.compareAndSet(null, a) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        obj.getClass();
        return (v7a) obj;
    }

    public final boolean b() {
        Long l = a().e;
        Integer num = a().d;
        if (l == null || num == null) {
            return true;
        }
        this.a.getClass();
        return tpb.a().c - l.longValue() >= ((long) num.intValue());
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
    public final Object c(v7a v7aVar, qx2 qx2Var) {
        gaa gaaVar;
        int i;
        if (qx2Var instanceof gaa) {
            gaaVar = (gaa) qx2Var;
            int i2 = gaaVar.c;
            if ((i2 & TLObject.FLAG_31) != 0) {
                gaaVar.c = i2 - TLObject.FLAG_31;
                Object obj = gaaVar.a;
                i = gaaVar.c;
                if (i != 0) {
                    tue.b(obj);
                    h83 h83Var = this.b;
                    o83 o83Var = new o83(v7aVar, null);
                    gaaVar.c = 1;
                    Object a = h83Var.a(o83Var, gaaVar);
                    ly2 ly2Var = ly2.a;
                    if (a == ly2Var) {
                        return ly2Var;
                    }
                } else {
                    if (i != 1) {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tue.b(obj);
                }
                return g7c.a;
            }
        }
        gaaVar = new gaa(this, qx2Var);
        Object obj2 = gaaVar.a;
        i = gaaVar.c;
        if (i != 0) {
        }
        return g7c.a;
    }
}
