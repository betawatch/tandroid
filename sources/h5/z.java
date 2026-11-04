package h5;

import java.nio.ByteBuffer;
import org.telegram.ui.Components.i9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class z extends a {
    public static final /* synthetic */ i9 h;
    public static final /* synthetic */ i9 n;
    public static final /* synthetic */ i9 r;
    public int e;
    public int[] f;

    static {
        we.a aVar = new we.a(z.class, "VideoMediaHeaderBox.java");
        h = aVar.e(aVar.d("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "int"));
        n = aVar.e(aVar.d("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "[I"));
        r = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "void"));
        aVar.e(aVar.d("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "void"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = g5.b.h(byteBuffer);
        this.f = new int[3];
        for (int i3 = 0; i3 < 3; i3++) {
            this.f[i3] = g5.b.h(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        g5.b.p(this.e, byteBuffer);
        for (int i3 : this.f) {
            g5.b.p(i3, byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return 12L;
    }

    public final String toString() {
        ui.f b10 = we.a.b(r, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        com.google.android.recaptcha.internal.a.t(we.a.b(h, this, this));
        sb2.append(this.e);
        sb2.append(";opcolor0=");
        i9 i9Var = n;
        com.google.android.recaptcha.internal.a.t(we.a.b(i9Var, this, this));
        sb2.append(this.f[0]);
        sb2.append(";opcolor1=");
        com.google.android.recaptcha.internal.a.t(we.a.b(i9Var, this, this));
        sb2.append(this.f[1]);
        sb2.append(";opcolor2=");
        com.google.android.recaptcha.internal.a.t(we.a.b(i9Var, this, this));
        return a1.g.o(this.f[2], "]", sb2);
    }
}
