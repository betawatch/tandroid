package o2;

import java.io.IOException;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class d implements b3.p {
    public final /* synthetic */ h a;

    @Override // b3.p
    public void a() {
        h hVar = this.a;
        hVar.A.a();
        IOException iOException = hVar.C;
        if (iOException != null) {
            throw iOException;
        }
    }

    public void b() {
        long j3;
        h hVar = this.a;
        synchronized (c3.b.b) {
            try {
                j3 = c3.b.c ? c3.b.d : -9223372036854775807L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        hVar.K = j3;
        hVar.z(true);
    }
}
