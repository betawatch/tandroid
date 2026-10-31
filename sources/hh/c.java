package hh;

import ag.l;
import java.io.Serializable;
import org.telegram.messenger.i0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
