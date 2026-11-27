// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class hoa extends o3 {
    public static final /* synthetic */ xh4 f;
    public static final /* synthetic */ xh4 h;
    public float e;

    static {
        u84 u84Var = new u84(hoa.class, "SoundMediaHeaderBox.java");
        f = u84Var.e(u84Var.d("getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "float"));
        h = u84Var.e(u84Var.d("toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "java.lang.String"));
    }

    @Override // h2, z1
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = zpe.e(byteBuffer);
        zpe.f(byteBuffer);
    }

    @Override // h2, z1
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        aqe.c(byteBuffer, this.e);
        aqe.d(0, byteBuffer);
    }

    public final String toString() {
        lyc b = u84.b(h, this, this);
        zb9.a().getClass();
        zb9.b(b);
        StringBuilder sb = new StringBuilder("SoundMediaHeaderBox[balance=");
        bp1.r(u84.b(f, this, this));
        sb.append(this.e);
        sb.append("]");
        return sb.toString();
    }
}
