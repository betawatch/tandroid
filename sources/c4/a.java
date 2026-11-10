package c4;

import h9.i0;
import java.util.List;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class a {
    public final i0 a;
    public final long b;
    public final long c;
    public final long d;

    public a(long j3, long j10, List list) {
        this.a = i0.q(list);
        this.b = j3;
        this.c = j10;
        long j11 = -9223372036854775807L;
        if (j3 != -9223372036854775807L && j10 != -9223372036854775807L) {
            j11 = j3 + j10;
        }
        this.d = j11;
    }
}
