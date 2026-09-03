package n3;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
    public final void j() {
        this.e.a.j(this);
    }
}
