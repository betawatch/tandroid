package lf;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
