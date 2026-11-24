// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class eeb {
    public int a;
    public ByteBuffer b;
    public int c;
    public int d;

    public eeb() {
        if (o5f.F == null) {
            o5f.F = new o5f((byte) 28);
        }
    }

    public final int a(int i) {
        if (i < this.d) {
            return this.b.getShort(this.c + i);
        }
        return 0;
    }
}
