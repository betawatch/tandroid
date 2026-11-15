package i5;

import a8.p0;
import ab.c0;
import c8.lb;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.ff;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class v extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ ff f;
    public static final /* synthetic */ ff h;
    public long[] e;

    static {
        ze.a aVar = new ze.a(v.class, "SyncSampleBox.java");
        aVar.e(aVar.d("getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "[J"));
        f = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "java.lang.String"));
        h = aVar.e(aVar.d("setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "void"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a10 = lb.a(h5.b.i(byteBuffer));
        this.e = new long[a10];
        for (int i7 = 0; i7 < a10; i7++) {
            this.e[i7] = h5.b.i(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.e.length);
        for (long j3 : this.e) {
            byteBuffer.putInt((int) j3);
        }
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (this.e.length * 4) + 8;
    }

    public final String toString() {
        c0 b10 = ze.a.b(f, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return p0.n(this.e.length, "]", new StringBuilder("SyncSampleBox[entryCount="));
    }
}
