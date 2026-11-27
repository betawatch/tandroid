// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class gi2 extends vu7 {
    public abstract int j();

    public final int k(int i) {
        int size = ((dt8) this).c.size();
        int j = j();
        if (i < j) {
            return ((size - (j << 1)) - ((j - i) - 1)) - 1;
        }
        int i2 = size - j;
        return i >= i2 ? i - i2 : i - j;
    }
}
