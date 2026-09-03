package n3;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class m extends j {
    public final com.google.android.exoplayer2.ext.ffmpeg.a e;
    public ByteBuffer f;

    public m(com.google.android.exoplayer2.ext.ffmpeg.a aVar) {
        this.e = aVar;
    }

    @Override // n3.a
    public final void b() {
        this.b = 0;
        ByteBuffer byteBuffer = this.f;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @Override // n3.j
    public final void i() {
        this.e.a.j(this);
    }
}
