// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class dfc extends o3 {
    public static final /* synthetic */ xh4 h;
    public static final /* synthetic */ xh4 n;
    public static final /* synthetic */ xh4 r;
    public int e;
    public int[] f;

    static {
        u84 u84Var = new u84(dfc.class, "VideoMediaHeaderBox.java");
        h = u84Var.e(u84Var.d("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "int"));
        n = u84Var.e(u84Var.d("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "[I"));
        r = u84Var.e(u84Var.d("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "java.lang.String"));
        u84Var.e(u84Var.d("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "void"));
        u84Var.e(u84Var.d("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "void"));
    }

    @Override // h2, z1
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = zpe.f(byteBuffer);
        this.f = new int[3];
        for (int i = 0; i < 3; i++) {
            this.f[i] = zpe.f(byteBuffer);
        }
    }

    @Override // h2, z1
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        aqe.d(this.e, byteBuffer);
        for (int i : this.f) {
            aqe.d(i, byteBuffer);
        }
    }

    @Override // z1
    public final long getContentSize() {
        return 12L;
    }

    public final String toString() {
        lyc b = u84.b(r, this, this);
        zb9.a().getClass();
        zb9.b(b);
        StringBuilder sb = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        bp1.r(u84.b(h, this, this));
        sb.append(this.e);
        sb.append(";opcolor0=");
        xh4 xh4Var = n;
        bp1.r(u84.b(xh4Var, this, this));
        sb.append(this.f[0]);
        sb.append(";opcolor1=");
        bp1.r(u84.b(xh4Var, this, this));
        sb.append(this.f[1]);
        sb.append(";opcolor2=");
        bp1.r(u84.b(xh4Var, this, this));
        return uh9.l(sb, this.f[2], "]");
    }
}
