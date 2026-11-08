package i5;

import a8.p0;
import java.nio.ByteBuffer;
import y7.i6;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class z extends a {
    public static final /* synthetic */ i6 h;
    public static final /* synthetic */ i6 n;
    public static final /* synthetic */ i6 r;
    public int e;
    public int[] f;

    static {
        ze.a aVar = new ze.a(z.class, "VideoMediaHeaderBox.java");
        h = aVar.e(aVar.d("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "int"));
        n = aVar.e(aVar.d("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "[I"));
        r = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "void"));
        aVar.e(aVar.d("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "void"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = h5.b.h(byteBuffer);
        this.f = new int[3];
        for (int i7 = 0; i7 < 3; i7++) {
            this.f[i7] = h5.b.h(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        h5.b.p(this.e, byteBuffer);
        for (int i7 : this.f) {
            h5.b.p(i7, byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return 12L;
    }

    public final String toString() {
        ui.e b10 = ze.a.b(r, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(h, this, this));
        sb2.append(this.e);
        sb2.append(";opcolor0=");
        i6 i6Var = n;
        com.google.android.recaptcha.internal.a.t(ze.a.b(i6Var, this, this));
        sb2.append(this.f[0]);
        sb2.append(";opcolor1=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(i6Var, this, this));
        sb2.append(this.f[1]);
        sb2.append(";opcolor2=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(i6Var, this, this));
        return p0.n(this.f[2], "]", sb2);
    }
}
