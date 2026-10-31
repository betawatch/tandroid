package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public interface m {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    ByteBuffer a();

    void b(ByteBuffer byteBuffer);

    boolean c();

    void d(k kVar);

    j e(j jVar);

    void f();

    long g(long j10);

    boolean isActive();

    void reset();
}
