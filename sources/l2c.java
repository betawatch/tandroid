// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class l2c {
    public final String a;
    public final int b;
    public final short c;
    public int d;
    public String e;

    /* JADX WARN: Multi-variable type inference failed */
    public l2c(int i, int i2, int i3) {
        this.a = i != Integer.MIN_VALUE ? oo1.n(i, "/") : "";
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
        sc8.j("generateNewId() must be called before retrieving ids.");
    }

    public l2c(int i, int i2) {
        this(TLObject.FLAG_31, i, i2);
    }
}
