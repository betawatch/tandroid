package dd;

import org.telegram.messenger.ls;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class k {
    public final /* synthetic */ int a;
    public final int b;

    public /* synthetic */ k(int i7, int i10) {
        this.a = i10;
        this.b = i7;
    }

    public static String a(int i7) {
        return "" + ((char) ((i7 >> 24) & ls.e4)) + ((char) ((i7 >> 16) & ls.e4)) + ((char) ((i7 >> 8) & ls.e4)) + ((char) (i7 & ls.e4));
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
