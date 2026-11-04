package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w6 {
    public final int a;
    public final long b;

    public w6(long j10, int i3, long j11) {
        this.a = i3;
        this.b = j11;
    }

    public final int hashCode() {
        long j10 = this.b;
        return (int) (j10 ^ (j10 >>> 32));
    }
}
