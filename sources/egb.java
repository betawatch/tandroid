// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class egb {
    public int a;
    public ByteBuffer b;
    public int c;
    public int d;

    public egb() {
        if (q7f.F == null) {
            q7f.F = new q7f((byte) 28);
        }
    }

    public final int a(int i) {
        if (i < this.d) {
            return this.b.getShort(this.c + i);
        }
        return 0;
    }
}
