package f5;

import java.util.Random;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a extends Random {
    public long a;
    public long b;

    @Override // java.util.Random
    public final int next(int i3) {
        return ((int) nextLong()) >>> (32 - i3);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return nextLong() >= 0;
    }

    @Override // java.util.Random
    public final void nextBytes(byte[] bArr) {
        int length = bArr.length;
        int i3 = 0;
        while (i3 < length) {
            long nextLong = (int) nextLong();
            int min = Math.min(length - i3, 8);
            while (true) {
                int i10 = min - 1;
                if (min > 0) {
                    bArr[i3] = (byte) nextLong;
                    nextLong >>>= 8;
                    i3++;
                    min = i10;
                }
            }
        }
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (nextLong() >>> 11) * 1.1102230246251565E-16d;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (((int) nextLong()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final int nextInt() {
        return (int) nextLong();
    }

    @Override // java.util.Random
    public final long nextLong() {
        long j10 = this.a;
        long j11 = this.b;
        long j12 = j10 + j11;
        long j13 = j11 ^ j10;
        this.a = (Long.rotateLeft(j10, 55) ^ j13) ^ (j13 << 14);
        this.b = Long.rotateLeft(j13, 36);
        return j12;
    }

    @Override // java.util.Random
    public final void setSeed(long j10) {
        if (this.a != 0 || this.b != 0) {
            throw new RuntimeException("No seed set");
        }
    }
}
