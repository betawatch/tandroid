package a8;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class h7 {
    public static be.c a(int i7, be.a aVar, int i10) {
        if ((i10 & 2) != 0) {
            aVar = be.a.a;
        }
        if (i7 == -2) {
            if (aVar != be.a.a) {
                return new be.o(1, aVar);
            }
            be.g.g.getClass();
            return new be.c(be.f.b);
        }
        if (i7 != -1) {
            return i7 != 0 ? i7 != Integer.MAX_VALUE ? aVar == be.a.a ? new be.c(i7) : new be.o(i7, aVar) : new be.c(ConnectionsManager.DEFAULT_DATACENTER_ID) : aVar == be.a.a ? new be.c(0) : new be.o(1, aVar);
        }
        if (aVar == be.a.a) {
            return new be.o(1, be.a.b);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }
}
