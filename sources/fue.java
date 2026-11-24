// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
