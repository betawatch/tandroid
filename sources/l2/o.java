package l2;

import android.os.Handler;
import android.os.Message;
import e2.d0;
import java.util.TreeMap;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class o implements Handler.Callback {
    public final y2.d a;
    public final ka.c b;
    public m2.c f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final TreeMap e = new TreeMap();
    public final Handler d = d0.o(this);
    public final m3.b c = new m3.b(1);

    public o(m2.c cVar, ka.c cVar2, y2.d dVar) {
        this.f = cVar;
        this.b = cVar2;
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
