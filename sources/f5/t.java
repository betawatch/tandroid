package f5;

import java.nio.ByteBuffer;
import w7.u6;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class t extends c {
    public static final /* synthetic */ ka.c h;
    public static final /* synthetic */ ka.c n;
    public long[] f;

    static {
        re.a aVar = new re.a(t.class, "StaticChunkOffsetBox.java");
        h = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        n = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = u6.a(e5.b.i(byteBuffer));
        this.f = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.f[i10] = e5.b.i(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f.length);
        for (long j3 : this.f) {
            byteBuffer.putInt((int) j3);
        }
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (this.f.length * 4) + 8;
    }
}
