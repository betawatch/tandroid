package f2;

import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class f {
    public final /* synthetic */ int a;
    public final int b;

    public /* synthetic */ f(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & zs.e4)) + ((char) ((i10 >> 16) & zs.e4)) + ((char) ((i10 >> 8) & zs.e4)) + ((char) (i10 & zs.e4));
    }

    public static void c(StringBuilder sb2) {
        if (sb2 != null) {
            sb2.delete(0, sb2.length());
        }
    }

    public abstract f b();

    public String toString() {
        switch (this.a) {
            case 0:
                return a(this.b);
            default:
                return super.toString();
        }
    }
}
