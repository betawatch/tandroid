package l2;

import a8.h0;
import android.os.Handler;
import android.os.Message;
import e2.n0;
import java.util.TreeMap;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class o implements Handler.Callback {
    public final h0 a;
    public final a4.l b;
    public m2.c f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final TreeMap e = new TreeMap();
    public final Handler d = n0.q(this);
    public final m3.b c = new m3.b(1);

    public o(m2.c cVar, a4.l lVar, h0 h0Var) {
        this.f = cVar;
        this.b = lVar;
        this.a = h0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.r) {
            if (message.what != 1) {
                return false;
            }
            m mVar = (m) message.obj;
            long j10 = mVar.a;
            long j11 = mVar.b;
            Long valueOf = Long.valueOf(j11);
            TreeMap treeMap = this.e;
            Long l4 = (Long) treeMap.get(valueOf);
            if (l4 == null) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
                return true;
            }
            if (l4.longValue() > j10) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
            }
        }
        return true;
    }
}
