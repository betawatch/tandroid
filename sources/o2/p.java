package o2;

import android.os.Handler;
import android.os.Message;
import h2.l0;
import java.util.TreeMap;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class p implements Handler.Callback {
    public final h6.m a;
    public final f b;
    public p2.c f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final TreeMap e = new TreeMap();
    public final Handler d = l0.q(this);
    public final p3.b c = new p3.b(1);

    public p(p2.c cVar, f fVar, h6.m mVar) {
        this.f = cVar;
        this.b = fVar;
        this.a = mVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.r) {
            if (message.what != 1) {
                return false;
            }
            n nVar = (n) message.obj;
            long j3 = nVar.a;
            long j10 = nVar.b;
            Long valueOf = Long.valueOf(j10);
            TreeMap treeMap = this.e;
            Long l10 = (Long) treeMap.get(valueOf);
            if (l10 == null) {
                treeMap.put(Long.valueOf(j10), Long.valueOf(j3));
                return true;
            }
            if (l10.longValue() > j3) {
                treeMap.put(Long.valueOf(j10), Long.valueOf(j3));
            }
        }
        return true;
    }
}
