package dd;

import org.telegram.messenger.qs;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class k {
    public final /* synthetic */ int a;
    public final int b;

    public /* synthetic */ k(int i7, int i10) {
        this.a = i10;
        this.b = i7;
    }

    public static String a(int i7) {
        return "" + ((char) ((i7 >> 24) & qs.e4)) + ((char) ((i7 >> 16) & qs.e4)) + ((char) ((i7 >> 8) & qs.e4)) + ((char) (i7 & qs.e4));
    }

    public static void c(StringBuilder sb2) {
        if (sb2 != null) {
            sb2.delete(0, sb2.length());
        }
    }

    public abstract k b();

    public String toString() {
        switch (this.a) {
            case 1:
                return a(this.b);
            default:
                return super.toString();
        }
    }
}
