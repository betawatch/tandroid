package i5;

import ab.c0;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.ff;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class t extends a {
    public static final /* synthetic */ ff f;
    public static final /* synthetic */ ff h;
    public float e;

    static {
        ze.a aVar = new ze.a(t.class, "SoundMediaHeaderBox.java");
        f = aVar.e(aVar.d("getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "float"));
        h = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "java.lang.String"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = h5.b.g(byteBuffer);
        h5.b.h(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        h5.b.o(byteBuffer, this.e);
        h5.b.p(0, byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return 8L;
    }

    public final String toString() {
        c0 b10 = ze.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SoundMediaHeaderBox[balance=");
        c.u(ze.a.b(f, this, this));
        sb2.append(this.e);
        sb2.append("]");
        return sb2.toString();
    }
}
