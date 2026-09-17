package mf;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final class j {
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
