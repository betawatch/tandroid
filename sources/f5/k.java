package f5;

import c3.i0;
import java.nio.ByteBuffer;
import java.util.Date;
import v7.r8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ za.c D;
    public static final /* synthetic */ za.c E;
    public static final /* synthetic */ za.c F;
    public static final /* synthetic */ za.c G;
    public static final /* synthetic */ za.c H;
    public static final /* synthetic */ za.c I;
    public static final /* synthetic */ za.c s;
    public static final /* synthetic */ za.c w;
    public static final /* synthetic */ za.c x;
    public static final /* synthetic */ za.c y;
    public Date e;
    public Date f;
    public long h;
    public long n;
    public String r;

    static {
        le.a aVar = new le.a(k.class, "MediaHeaderBox.java");
        s = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        w = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        I = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        x = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        y = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        D = aVar.e(aVar.d("getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
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
            this.e = r8.b(e5.b.j(byteBuffer));
            this.f = r8.b(e5.b.j(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.n = e5.b.j(byteBuffer);
        } else {
            this.e = r8.b(e5.b.i(byteBuffer));
            this.f = r8.b(e5.b.i(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.n = e5.b.i(byteBuffer);
        }
        int h = e5.b.h(byteBuffer);
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 3; i10++) {
            sb2.append((char) (((h >> ((2 - i10) * 5)) & 31) + 96));
        }
        this.r = sb2.toString();
        e5.b.h(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(r8.a(this.e));
            byteBuffer.putLong(r8.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.n);
        } else {
            byteBuffer.putInt((int) r8.a(this.e));
            byteBuffer.putInt((int) r8.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.n);
        }
        String str = this.r;
        if (str.getBytes().length != 3) {
            throw new IllegalArgumentException(a1.g.n("\"", str, "\" language string isn't exactly 3 characters long!"));
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 3; i11++) {
            i10 += (str.getBytes()[i11] - 96) << ((2 - i11) * 5);
        }
        e5.b.p(i10, byteBuffer);
        e5.b.p(0, byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (e() == 1 ? 32L : 20L) + 4;
    }

    public final String toString() {
        ji.f b10 = le.a.b(I, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MediaHeaderBox[creationTime=");
        i0.s(le.a.b(s, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        i0.s(le.a.b(w, this, this));
        sb2.append(this.f);
        sb2.append(";timescale=");
        i0.s(le.a.b(x, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        i0.s(le.a.b(y, this, this));
        sb2.append(this.n);
        sb2.append(";language=");
        i0.s(le.a.b(D, this, this));
        return a1.g.r(sb2, this.r, "]");
    }
}
