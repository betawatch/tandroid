// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class iwe {
    public final nf7 a(pf7 pf7Var) {
        ByteBuffer byteBuffer = pf7Var.c;
        byteBuffer.getClass();
        jte.f(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(pf7Var, byteBuffer);
    }

    public abstract nf7 b(pf7 pf7Var, ByteBuffer byteBuffer);
}
