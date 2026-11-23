package a8;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class j7 {
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
