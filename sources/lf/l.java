package lf;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class l {
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
