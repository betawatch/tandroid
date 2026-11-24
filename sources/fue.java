// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class fue {
    public final ld7 a(nd7 nd7Var) {
        ByteBuffer byteBuffer = nd7Var.c;
        byteBuffer.getClass();
        gre.f(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(nd7Var, byteBuffer);
    }

    public abstract ld7 b(nd7 nd7Var, ByteBuffer byteBuffer);
}
