package hh;

import ag.l;
import java.io.Serializable;
import org.telegram.messenger.i0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class c {
    public long a;
    public Object b;
    public Serializable c;
    public Object d;

    public void a(b bVar, boolean z10) {
        gg.c cVar = (gg.c) this.d;
        if (((b) this.c) != bVar) {
            i0.r(cVar);
            this.c = bVar;
            if (z10) {
                ((l) this.b).a(bVar);
            }
            if (bVar == b.b || bVar == b.c) {
                i0.h3(cVar, this.a);
            }
        }
    }
}
