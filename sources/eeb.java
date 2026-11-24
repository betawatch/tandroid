// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
