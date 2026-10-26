package g5;

import c3.h0;
import java.nio.ByteBuffer;
import li.e3;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class s extends a {
    public static final /* synthetic */ e3 f;
    public static final /* synthetic */ e3 h;
    public float e;

    static {
        ue.a aVar = new ue.a(s.class, "SoundMediaHeaderBox.java");
        f = aVar.e(aVar.d("getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "float"));
        h = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "java.lang.String"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = f5.b.g(byteBuffer);
        f5.b.h(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        f5.b.o(byteBuffer, this.e);
        f5.b.p(0, byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return 8L;
    }

    public final String toString() {
        ti.e b10 = ue.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SoundMediaHeaderBox[balance=");
        h0.s(ue.a.b(f, this, this));
        sb2.append(this.e);
        sb2.append("]");
        return sb2.toString();
    }
}
