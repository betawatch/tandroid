package m9;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static /* synthetic */ boolean a(Unsafe unsafe, o oVar, long j3, n nVar, n nVar2) {
        while (!unsafe.compareAndSwapObject(oVar, j3, nVar, nVar2)) {
            if (unsafe.getObject(oVar, j3) != nVar) {
                return false;
            }
        }
        return true;
    }
}
