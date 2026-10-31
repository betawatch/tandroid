package l2;

import android.os.Handler;
import android.os.Message;
import android.support.v4.media.session.a0;
import e2.l0;
import java.util.TreeMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class p implements Handler.Callback {
    public final a0 a;
    public final f b;
    public m2.c f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final TreeMap e = new TreeMap();
    public final Handler d = l0.q(this);
    public final m3.b c = new m3.b(1);

    public p(m2.c cVar, f fVar, a0 a0Var) {
        this.f = cVar;
        this.b = fVar;
        this.a = a0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.r) {
            if (message.what != 1) {
                return false;
            }
            n nVar = (n) message.obj;
            long j10 = nVar.a;
            long j11 = nVar.b;
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
