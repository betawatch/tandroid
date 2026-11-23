package o2;

import b3.q;
import java.io.IOException;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class d implements q {
    public final /* synthetic */ h a;

    @Override // b3.q
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
