package oa;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class e1 extends la.u {
    @Override // la.u
    public final Object read(ta.a aVar) {
        try {
            return new AtomicInteger(aVar.p());
        } catch (NumberFormatException e10) {
            throw new la.j(e10);
        }
    }

    @Override // la.u
    public final void write(ta.c cVar, Object obj) {
        cVar.o(((AtomicInteger) obj).get());
    }
}
