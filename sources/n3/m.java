package n3;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class m extends j {
    public final com.google.android.exoplayer2.ext.ffmpeg.a e;
    public ByteBuffer f;

    public m(com.google.android.exoplayer2.ext.ffmpeg.a aVar) {
        this.e = aVar;
    }

    @Override // n3.a
    public final void c() {
        this.b = 0;
        ByteBuffer byteBuffer = this.f;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @Override // n3.j
    public final void j() {
        this.e.a.j(this);
    }
}
