// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class m09 {
    public static final m09 d;
    public final /* synthetic */ byte a;
    public int b;
    public int c;

    static {
        int i = 0;
        d = new m09(i, i, (byte) 0);
    }

    public /* synthetic */ m09(int i, int i2, byte b) {
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
                StringBuilder sb = new StringBuilder(m09.class.getSimpleName());
                sb.append("[position = ");
                sb.append(this.b);
                sb.append(", length = ");
                return uh9.l(sb, this.c, "]");
            default:
                return super.toString();
        }
    }
}
