// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class az8 {
    public static final az8 d;
    public final /* synthetic */ byte a;
    public int b;
    public int c;

    static {
        int i = 0;
        d = new az8(i, i, (byte) 0);
    }

    public /* synthetic */ az8(int i, int i2, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        int i = this.c;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i != 42) {
            return i != 22 ? i != 23 ? 0 : 15 : TLObject.FLAG_30;
        }
        return 16;
    }

    public final int b() {
        return this.b | this.c;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder(az8.class.getSimpleName());
                sb.append("[position = ");
                sb.append(this.b);
                sb.append(", length = ");
                return hg9.k(sb, this.c, "]");
            default:
                return super.toString();
        }
    }
}
