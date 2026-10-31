package f5;

import c3.i0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class z extends a {
    public static final /* synthetic */ za.c h;
    public static final /* synthetic */ za.c n;
    public static final /* synthetic */ za.c r;
    public int e;
    public int[] f;

    static {
        le.a aVar = new le.a(z.class, "VideoMediaHeaderBox.java");
        h = aVar.e(aVar.d("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "int"));
        n = aVar.e(aVar.d("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "[I"));
        r = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "void"));
        aVar.e(aVar.d("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "void"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = e5.b.h(byteBuffer);
        this.f = new int[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.f[i10] = e5.b.h(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        e5.b.p(this.e, byteBuffer);
        for (int i10 : this.f) {
            e5.b.p(i10, byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return 12L;
    }

    public final String toString() {
        ji.f b10 = le.a.b(r, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        i0.s(le.a.b(h, this, this));
        sb2.append(this.e);
        sb2.append(";opcolor0=");
        za.c cVar = n;
        i0.s(le.a.b(cVar, this, this));
        sb2.append(this.f[0]);
        sb2.append(";opcolor1=");
        i0.s(le.a.b(cVar, this, this));
        sb2.append(this.f[1]);
        sb2.append(";opcolor2=");
        i0.s(le.a.b(cVar, this, this));
        return a1.g.p(sb2, this.f[2], "]");
    }
}
