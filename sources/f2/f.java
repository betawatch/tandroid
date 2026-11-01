package f2;

import org.telegram.messenger.at;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class f {
    public final /* synthetic */ int a;
    public final int b;

    public /* synthetic */ f(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & at.e4)) + ((char) ((i10 >> 16) & at.e4)) + ((char) ((i10 >> 8) & at.e4)) + ((char) (i10 & at.e4));
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
