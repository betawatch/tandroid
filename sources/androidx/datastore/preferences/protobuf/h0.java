package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h0 {
    public static b0 a(Object obj, long j10) {
        b0 b0Var = (b0) n1.c.h(obj, j10);
        if (((b) b0Var).a) {
            return b0Var;
        }
        int size = b0Var.size();
        z0 j11 = ((z0) b0Var).j(size == 0 ? 10 : size * 2);
        n1.o(obj, j10, j11);
        return j11;
    }
}
