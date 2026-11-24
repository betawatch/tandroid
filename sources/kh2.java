// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class kh2 extends pr7 {
    public abstract int j();

    public final int k(int i) {
        int size = ((rp8) this).c.size();
        int j = j();
        if (i < j) {
            return ((size - (j << 1)) - ((j - i) - 1)) - 1;
        }
        int i2 = size - j;
        return i >= i2 ? i - i2 : i - j;
    }
}
