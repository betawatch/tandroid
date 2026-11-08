package o2;

import java.io.IOException;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
