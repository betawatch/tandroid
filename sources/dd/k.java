package dd;

import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
