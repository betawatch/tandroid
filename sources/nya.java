// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class nya extends pi2 {
    public static final /* synthetic */ ai4 h;
    public static final /* synthetic */ ai4 n;
    public long[] f;

    static {
        i94 i94Var = new i94(nya.class, "StaticChunkOffsetBox.java");
        h = i94Var.e(i94Var.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        n = i94Var.e(i94Var.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override // g2, y1
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a = psd.a(jne.g(byteBuffer));
        this.f = new long[a];
        for (int i = 0; i < a; i++) {
            this.f[i] = jne.g(byteBuffer);
        }
    }

    @Override // g2, y1
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f.length);
        for (long j : this.f) {
            byteBuffer.putInt((int) j);
        }
    }

    @Override // y1
    public final long getContentSize() {
        return (this.f.length << 2) + 8;
    }
}
