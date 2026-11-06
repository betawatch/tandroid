package org.telegram.messenger;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class w6 {
    public final int a;
    public final long b;

    public w6(long j3, int i7, long j10) {
        this.a = i7;
        this.b = j10;
    }

    public final int hashCode() {
        long j3 = this.b;
        return (int) (j3 ^ (j3 >>> 32));
    }
}
