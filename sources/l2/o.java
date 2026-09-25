package l2;

import android.os.Handler;
import android.os.Message;
import e2.d0;
import java.util.TreeMap;
import k2.u;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class o implements Handler.Callback {
    public final y2.d a;
    public final u b;
    public m2.c f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final TreeMap e = new TreeMap();
    public final Handler d = d0.o(this);
    public final m3.b c = new m3.b(1);

    public o(m2.c cVar, u uVar, y2.d dVar) {
        this.f = cVar;
        this.b = uVar;
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
