package ad;

import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class l {
    public final /* synthetic */ int a;
    public final int b;

    public /* synthetic */ l(int i3, int i10) {
        this.a = i10;
        this.b = i3;
    }

    public static String a(int i3) {
        return "" + ((char) ((i3 >> 24) & hs.e4)) + ((char) ((i3 >> 16) & hs.e4)) + ((char) ((i3 >> 8) & hs.e4)) + ((char) (i3 & hs.e4));
    }

    public static void c(StringBuilder sb2) {
        if (sb2 != null) {
            sb2.delete(0, sb2.length());
        }
    }

    public abstract l b();

    public String toString() {
        switch (this.a) {
            case 1:
                return a(this.b);
            default:
                return super.toString();
        }
    }
}
