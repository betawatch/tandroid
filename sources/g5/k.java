package g5;

import c3.h0;
import java.nio.ByteBuffer;
import java.util.Date;
import li.e3;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class k extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ e3 E;
    public static final /* synthetic */ e3 F;
    public static final /* synthetic */ e3 G;
    public static final /* synthetic */ e3 H;
    public static final /* synthetic */ e3 I;
    public static final /* synthetic */ e3 s;
    public static final /* synthetic */ e3 v;
    public static final /* synthetic */ e3 w;
    public static final /* synthetic */ e3 x;
    public static final /* synthetic */ e3 y;
    public Date e;
    public Date f;
    public long h;
    public long n;
    public String r;

    static {
        ue.a aVar = new ue.a(k.class, "MediaHeaderBox.java");
        s = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        v = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        I = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        w = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        x = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        y = aVar.e(aVar.d("getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        E = aVar.e(aVar.d("setCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "creationTime", "void"));
        aVar.e(aVar.d("setModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "modificationTime", "void"));
        F = aVar.e(aVar.d("setTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "timescale", "void"));
        G = aVar.e(aVar.d("setDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "duration", "void"));
        H = aVar.e(aVar.d("setLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "java.lang.String", "language", "void"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.e = i8.e.b(f5.b.j(byteBuffer));
            this.f = i8.e.b(f5.b.j(byteBuffer));
            this.h = f5.b.i(byteBuffer);
            this.n = f5.b.j(byteBuffer);
        } else {
            this.e = i8.e.b(f5.b.i(byteBuffer));
            this.f = i8.e.b(f5.b.i(byteBuffer));
            this.h = f5.b.i(byteBuffer);
            this.n = f5.b.i(byteBuffer);
        }
        int h = f5.b.h(byteBuffer);
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 3; i10++) {
            sb2.append((char) (((h >> ((2 - i10) * 5)) & 31) + 96));
        }
        this.r = sb2.toString();
        f5.b.h(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(i8.e.a(this.e));
            byteBuffer.putLong(i8.e.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.n);
        } else {
            byteBuffer.putInt((int) i8.e.a(this.e));
            byteBuffer.putInt((int) i8.e.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.n);
        }
        String str = this.r;
        if (str.getBytes().length != 3) {
            throw new IllegalArgumentException(a1.g.p("\"", str, "\" language string isn't exactly 3 characters long!"));
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 3; i11++) {
            i10 += (str.getBytes()[i11] - 96) << ((2 - i11) * 5);
        }
        f5.b.p(i10, byteBuffer);
        f5.b.p(0, byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (e() == 1 ? 32L : 20L) + 4;
    }

    public final String toString() {
        ti.e b10 = ue.a.b(I, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MediaHeaderBox[creationTime=");
        h0.s(ue.a.b(s, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        h0.s(ue.a.b(v, this, this));
        sb2.append(this.f);
        sb2.append(";timescale=");
        h0.s(ue.a.b(w, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        h0.s(ue.a.b(x, this, this));
        sb2.append(this.n);
        sb2.append(";language=");
        h0.s(ue.a.b(y, this, this));
        return a1.g.s(sb2, this.r, "]");
    }
}
