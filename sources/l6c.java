// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class l6c {
    public final String a;
    public final int b;
    public final short c;
    public int d;
    public String e;

    /* JADX WARN: Multi-variable type inference failed */
    public l6c(int i, int i2, int i3) {
        this.a = i != Integer.MIN_VALUE ? bp1.n(i, "/") : "";
        this.b = i2;
        this.c = i3;
        this.d = TLObject.FLAG_31;
        this.e = "";
    }

    public final void a() {
        int i = this.d;
        this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
        this.e = this.a + this.d;
    }

    public final void b() {
        if (this.d != Integer.MIN_VALUE) {
            return;
        }
        grb.i("generateNewId() must be called before retrieving ids.");
    }

    public l6c(int i, int i2) {
        this(TLObject.FLAG_31, i, i2);
    }
}
