package f5;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import k2.c0;
import w7.s6;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class e extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ c0 f;
    public List e;

    static {
        re.a aVar = new re.a(e.class, "CompositionTimeToSample.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "java.util.List"));
        f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", "entries", "void"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = s6.a(e5.b.i(byteBuffer));
        this.e = new ArrayList(a2);
        for (int i10 = 0; i10 < a2; i10++) {
            this.e.add(new d(s6.a(e5.b.i(byteBuffer)), byteBuffer.getInt()));
        }
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.e.size());
        for (d dVar : this.e) {
            byteBuffer.putInt(dVar.a);
            byteBuffer.putInt(dVar.b);
        }
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (this.e.size() * 8) + 8;
    }
}
