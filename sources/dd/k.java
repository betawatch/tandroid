package dd;

import org.telegram.messenger.ks;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class k {
    public final /* synthetic */ int a;
    public final int b;

    public /* synthetic */ k(int i7, int i10) {
        this.a = i10;
        this.b = i7;
    }

    public static String a(int i7) {
        return "" + ((char) ((i7 >> 24) & ks.e4)) + ((char) ((i7 >> 16) & ks.e4)) + ((char) ((i7 >> 8) & ks.e4)) + ((char) (i7 & ks.e4));
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
