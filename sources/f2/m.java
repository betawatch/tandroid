package f2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public interface m {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean a();

    ByteBuffer b();

    void c(ByteBuffer byteBuffer);

    void d(k kVar);

    j e(j jVar);

    void f();

    long g(long j3);

    boolean isActive();

    void reset();
}
