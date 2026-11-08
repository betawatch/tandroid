package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class h0 {
    public static b0 a(Object obj, long j3) {
        b0 b0Var = (b0) n1.c.h(obj, j3);
        if (((b) b0Var).a) {
            return b0Var;
        }
        int size = b0Var.size();
        z0 j10 = ((z0) b0Var).j(size == 0 ? 10 : size * 2);
        n1.o(obj, j3, j10);
        return j10;
    }
}
