package o2;

import android.os.Handler;
import android.os.Message;
import h2.m0;
import java.util.TreeMap;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class p implements Handler.Callback {
    public final h6.m a;
    public final f b;
    public p2.c f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final TreeMap e = new TreeMap();
    public final Handler d = m0.q(this);
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
