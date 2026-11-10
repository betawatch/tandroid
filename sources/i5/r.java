package i5;

import c8.jb;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import y7.i6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class r extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ i6 f;
    public static final /* synthetic */ i6 h;
    public static final /* synthetic */ i6 n;
    public List e;

    static {
        ze.a aVar = new ze.a(r.class, "SampleToChunkBox.java");
        f = aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.util.List"));
        h = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "void"));
        n = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "[J"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a10 = jb.a(h5.b.i(byteBuffer));
        this.e = new ArrayList(a10);
        for (int i7 = 0; i7 < a10; i7++) {
            this.e.add(new q(h5.b.i(byteBuffer), h5.b.i(byteBuffer), h5.b.i(byteBuffer)));
        }
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.e.size());
        for (q qVar : this.e) {
            byteBuffer.putInt((int) qVar.a);
            byteBuffer.putInt((int) qVar.b);
            byteBuffer.putInt((int) qVar.c);
        }
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (this.e.size() * 12) + 8;
    }

    public final String toString() {
        ui.e b10 = ze.a.b(n, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return "SampleToChunkBox[entryCount=" + this.e.size() + "]";
    }
}
