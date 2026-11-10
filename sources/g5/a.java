package g5;

import java.util.Random;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class a extends Random {
    public long a;
    public long b;

    @Override // java.util.Random
    public final int next(int i7) {
        return ((int) nextLong()) >>> (32 - i7);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return nextLong() >= 0;
    }

    @Override // java.util.Random
    public final void nextBytes(byte[] bArr) {
        int length = bArr.length;
        int i7 = 0;
        while (i7 < length) {
            long nextLong = (int) nextLong();
            int min = Math.min(length - i7, 8);
            while (true) {
                int i10 = min - 1;
                if (min > 0) {
                    bArr[i7] = (byte) nextLong;
                    nextLong >>>= 8;
                    i7++;
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
        long j3 = this.a;
        long j10 = this.b;
        long j11 = j3 + j10;
        long j12 = j10 ^ j3;
        this.a = (Long.rotateLeft(j3, 55) ^ j12) ^ (j12 << 14);
        this.b = Long.rotateLeft(j12, 36);
        return j11;
    }

    @Override // java.util.Random
    public final void setSeed(long j3) {
        if (this.a != 0 || this.b != 0) {
            throw new RuntimeException("No seed set");
        }
    }
}
