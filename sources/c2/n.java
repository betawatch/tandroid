package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public interface n {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    ByteBuffer a();

    boolean b();

    void c(ByteBuffer byteBuffer);

    void d(l lVar);

    k e(k kVar);

    void f();

    long g(long j10);

    boolean isActive();

    void reset();
}
