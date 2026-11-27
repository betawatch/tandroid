// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class n0b extends th2 {
    public static final /* synthetic */ xh4 h;
    public static final /* synthetic */ xh4 n;
    public long[] f;

    static {
        u84 u84Var = new u84(n0b.class, "StaticChunkOffsetBox.java");
        h = u84Var.e(u84Var.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        n = u84Var.e(u84Var.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override // h2, z1
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a = cvd.a(zpe.g(byteBuffer));
        this.f = new long[a];
        for (int i = 0; i < a; i++) {
            this.f[i] = zpe.g(byteBuffer);
        }
    }

    @Override // h2, z1
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f.length);
        for (long j : this.f) {
            byteBuffer.putInt((int) j);
        }
    }

    @Override // z1
    public final long getContentSize() {
        return (this.f.length << 2) + 8;
    }
}
