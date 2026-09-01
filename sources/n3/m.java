package n3;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
