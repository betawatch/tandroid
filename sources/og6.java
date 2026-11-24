// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class og6 {
    public short a;

    public final void a(byte b) {
        int i = 128;
        do {
            short s = this.a;
            boolean z = (32768 & s) == 0;
            short s2 = (short) (s << 1);
            if (z ^ ((b & i) == 0)) {
                this.a = (short) (s2 ^ 32773);
            } else {
                this.a = s2;
            }
            i >>>= 1;
        } while (i != 0);
    }
}
