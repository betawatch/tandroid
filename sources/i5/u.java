package i5;

import c8.lb;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.ff;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class u extends d {
    public static final /* synthetic */ ff h;
    public static final /* synthetic */ ff n;
    public long[] f;

    static {
        ze.a aVar = new ze.a(u.class, "StaticChunkOffsetBox.java");
        h = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        n = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a10 = lb.a(h5.b.i(byteBuffer));
        this.f = new long[a10];
        for (int i7 = 0; i7 < a10; i7++) {
            this.f[i7] = h5.b.i(byteBuffer);
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
