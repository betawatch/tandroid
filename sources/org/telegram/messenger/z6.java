package org.telegram.messenger;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class z6 {
    public final int a;
    public final long b;

    public z6(long j10, int i10, long j11) {
        this.a = i10;
        this.b = j11;
    }

    public final int hashCode() {
        long j10 = this.b;
        return (int) (j10 ^ (j10 >>> 32));
    }
}
