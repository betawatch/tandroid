package m4;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.upstream.r;
import d5.f0;
import java.util.TreeMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o implements Handler.Callback {
    public final r a;
    public final android.support.v4.media.c b;
    public n4.c f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final TreeMap e = new TreeMap();
    public final Handler d = f0.k(this);
    public final a4.b c = new a4.b(1);

    public o(n4.c cVar, android.support.v4.media.c cVar2, r rVar) {
        this.f = cVar;
        this.b = cVar2;
        this.a = rVar;
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
            Long l10 = (Long) treeMap.get(valueOf);
            if (l10 == null) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
                return true;
            }
            if (l10.longValue() > j10) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
            }
        }
        return true;
    }
}
