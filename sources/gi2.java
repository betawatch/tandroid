// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
