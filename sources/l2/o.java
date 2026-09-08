package l2;

import android.os.Handler;
import android.os.Message;
import e2.d0;
import java.util.TreeMap;
import ji.u4;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class o implements Handler.Callback {
    public final y2.d a;
    public final u4 b;
    public m2.c f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final TreeMap e = new TreeMap();
    public final Handler d = d0.o(this);
    public final m3.b c = new m3.b(1);

    public o(m2.c cVar, u4 u4Var, y2.d dVar) {
        this.f = cVar;
        this.b = u4Var;
        this.a = dVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.r) {
            if (message.what != 1) {
                return false;
            }
            m mVar = (m) message.obj;
            long j3 = mVar.a;
            long j10 = mVar.b;
            Long valueOf = Long.valueOf(j10);
            TreeMap treeMap = this.e;
            Long l4 = (Long) treeMap.get(valueOf);
            if (l4 == null) {
                treeMap.put(Long.valueOf(j10), Long.valueOf(j3));
                return true;
            }
            if (l4.longValue() > j3) {
                treeMap.put(Long.valueOf(j10), Long.valueOf(j3));
            }
        }
        return true;
    }
}
