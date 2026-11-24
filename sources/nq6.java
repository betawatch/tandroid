// default package

import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class nq6 extends g2 {
    public static final /* synthetic */ z24 E;
    public static final /* synthetic */ z24 F;
    public static final /* synthetic */ z24 G;
    public static final /* synthetic */ z24 H;
    public static final /* synthetic */ z24 I;
    public static final /* synthetic */ z24 J;
    public static final /* synthetic */ z24 s;
    public static final /* synthetic */ z24 w;
    public static final /* synthetic */ z24 x;
    public static final /* synthetic */ z24 y;
    public Date e;
    public Date f;
    public long h;
    public long n;
    public String r;

    static {
        z74 z74Var = new z74(nq6.class, "MediaHeaderBox.java");
        s = z74Var.e(z74Var.d("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        w = z74Var.e(z74Var.d("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        J = z74Var.e(z74Var.d("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        x = z74Var.e(z74Var.d("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        y = z74Var.e(z74Var.d("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        E = z74Var.e(z74Var.d("getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        F = z74Var.e(z74Var.d("setCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "creationTime", "void"));
        z74Var.e(z74Var.d("setModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "modificationTime", "void"));
        G = z74Var.e(z74Var.d("setTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "timescale", "void"));
        H = z74Var.e(z74Var.d("setDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "duration", "void"));
        I = z74Var.e(z74Var.d("setLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "java.lang.String", "language", "void"));
    }

    @Override // g2, y1
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.e = nce.b(hle.h(byteBuffer));
            this.f = nce.b(hle.h(byteBuffer));
            this.h = hle.g(byteBuffer);
            this.n = hle.h(byteBuffer);
        } else {
            this.e = nce.b(hle.g(byteBuffer));
            this.f = nce.b(hle.g(byteBuffer));
            this.h = hle.g(byteBuffer);
            this.n = hle.g(byteBuffer);
        }
        int f = hle.f(byteBuffer);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append((char) (((f >> ((2 - i) * 5)) & 31) + 96));
        }
        this.r = sb.toString();
        hle.f(byteBuffer);
    }

    @Override // g2, y1
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        int e = e();
        Date date = this.e;
        if (e == 1) {
            byteBuffer.putLong(nce.a(date));
            byteBuffer.putLong(nce.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.n);
        } else {
            byteBuffer.putInt((int) nce.a(date));
            byteBuffer.putInt((int) nce.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.n);
        }
        String str = this.r;
        if (str.getBytes().length != 3) {
            w26.j(tb4.y("\"", str, "\" language string isn't exactly 3 characters long!"));
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            i += (str.getBytes()[i2] - 96) << ((2 - i2) * 5);
        }
        ile.d(i, byteBuffer);
        ile.d(0, byteBuffer);
    }

    @Override // y1
    public final long getContentSize() {
        return (e() == 1 ? 32L : 20L) + 4;
    }

    public final String toString() {
        c5a b = z74.b(J, this, this);
        n89.a().getClass();
        n89.b(b);
        StringBuilder sb = new StringBuilder("MediaHeaderBox[creationTime=");
        oo1.r(z74.b(s, this, this));
        sb.append(this.e);
        sb.append(";modificationTime=");
        oo1.r(z74.b(w, this, this));
        sb.append(this.f);
        sb.append(";timescale=");
        oo1.r(z74.b(x, this, this));
        sb.append(this.h);
        sb.append(";duration=");
        oo1.r(z74.b(y, this, this));
        sb.append(this.n);
        sb.append(";language=");
        oo1.r(z74.b(E, this, this));
        return b00.j(sb, this.r, "]");
    }
}
