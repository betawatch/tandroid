package o4;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.upstream.r;
import f5.d0;
import java.util.TreeMap;
import nh.d6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class p implements Handler.Callback {
    public final r a;
    public final d6 b;
    public p4.c f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final TreeMap e = new TreeMap();
    public final Handler d = d0.k(this);
    public final c4.b c = new c4.b(1);

    public p(p4.c cVar, d6 d6Var, r rVar) {
        this.f = cVar;
        this.b = d6Var;
        this.a = rVar;
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
