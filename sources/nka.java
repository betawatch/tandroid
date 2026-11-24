// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class nka extends n3 {
    public static final /* synthetic */ z24 f;
    public static final /* synthetic */ z24 h;
    public float e;

    static {
        z74 z74Var = new z74(nka.class, "SoundMediaHeaderBox.java");
        f = z74Var.e(z74Var.d("getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "float"));
        h = z74Var.e(z74Var.d("toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "java.lang.String"));
    }

    @Override // g2, y1
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = hle.e(byteBuffer);
        hle.f(byteBuffer);
    }

    @Override // g2, y1
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        ile.c(byteBuffer, this.e);
        ile.d(0, byteBuffer);
    }

    public final String toString() {
        c5a b = z74.b(h, this, this);
        n89.a().getClass();
        n89.b(b);
        StringBuilder sb = new StringBuilder("SoundMediaHeaderBox[balance=");
        oo1.r(z74.b(f, this, this));
        sb.append(this.e);
        sb.append("]");
        return sb.toString();
    }
}
