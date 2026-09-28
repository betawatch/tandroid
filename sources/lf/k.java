package lf;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final class k {
    public short a;

    public final void a(byte b10) {
        int i10 = 128;
        do {
            short s10 = this.a;
            if (((32768 & s10) == 0) ^ ((b10 & i10) == 0)) {
                this.a = (short) (((short) (s10 << 1)) ^ 32773);
            } else {
                this.a = (short) (s10 << 1);
            }
            i10 >>>= 1;
        } while (i10 != 0);
    }
}
