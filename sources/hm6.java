// default package

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public interface hm6 {
    void a(int i, z43 z43Var, long j, int i2);

    void b(int i, int i2, int i3, long j);

    void c(int i);

    void d();

    void e(int i, long j);

    int f();

    void flush();

    boolean g(fk3 fk3Var);

    ByteBuffer getInputBuffer(int i);

    ByteBuffer getOutputBuffer(int i);

    MediaFormat getOutputFormat();

    int h(MediaCodec.BufferInfo bufferInfo);

    void i(kpb kpbVar);

    void j(int i);

    void k(Surface surface);

    void l(ArrayList arrayList);

    void m(xm6 xm6Var, Handler handler);

    void n(ArrayList arrayList);

    void release();

    void setParameters(Bundle bundle);
}
