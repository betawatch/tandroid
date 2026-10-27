package g5;

import c3.h0;
import java.nio.ByteBuffer;
import li.e3;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class z extends a {
    public static final /* synthetic */ e3 h;
    public static final /* synthetic */ e3 n;
    public static final /* synthetic */ e3 r;
    public int e;
    public int[] f;

    static {
        ue.a aVar = new ue.a(z.class, "VideoMediaHeaderBox.java");
        h = aVar.e(aVar.d("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "int"));
        n = aVar.e(aVar.d("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "[I"));
        r = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "void"));
        aVar.e(aVar.d("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "void"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = f5.b.h(byteBuffer);
        this.f = new int[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.f[i10] = f5.b.h(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        f5.b.p(this.e, byteBuffer);
        for (int i10 : this.f) {
            f5.b.p(i10, byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return 12L;
    }

    public final String toString() {
        ti.e b10 = ue.a.b(r, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        h0.s(ue.a.b(h, this, this));
        sb2.append(this.e);
        sb2.append(";opcolor0=");
        e3 e3Var = n;
        h0.s(ue.a.b(e3Var, this, this));
        sb2.append(this.f[0]);
        sb2.append(";opcolor1=");
        h0.s(ue.a.b(e3Var, this, this));
        sb2.append(this.f[1]);
        sb2.append(";opcolor2=");
        h0.s(ue.a.b(e3Var, this, this));
        return a1.g.n(this.f[2], "]", sb2);
    }
}
