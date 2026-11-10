package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
