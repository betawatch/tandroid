// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class l4c {
    public final String a;
    public final int b;
    public final short c;
    public int d;
    public String e;

    /* JADX WARN: Multi-variable type inference failed */
    public l4c(int i, int i2, int i3) {
        this.a = i != Integer.MIN_VALUE ? aq1.n(i, "/") : "";
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
        dq9.m("generateNewId() must be called before retrieving ids.");
    }

    public l4c(int i, int i2) {
        this(TLObject.FLAG_31, i, i2);
    }
}
