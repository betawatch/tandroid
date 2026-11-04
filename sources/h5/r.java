package h5;

import b8.ee;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.i9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class r extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ i9 f;
    public static final /* synthetic */ i9 h;
    public static final /* synthetic */ i9 n;
    public List e;

    static {
        we.a aVar = new we.a(r.class, "SampleToChunkBox.java");
        f = aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.util.List"));
        h = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "void"));
        n = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "[J"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a10 = ee.a(g5.b.i(byteBuffer));
        this.e = new ArrayList(a10);
        for (int i3 = 0; i3 < a10; i3++) {
            this.e.add(new q(g5.b.i(byteBuffer), g5.b.i(byteBuffer), g5.b.i(byteBuffer)));
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
        ui.f b10 = we.a.b(n, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return "SampleToChunkBox[entryCount=" + this.e.size() + "]";
    }
}
