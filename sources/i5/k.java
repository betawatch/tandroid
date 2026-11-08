package i5;

import a8.p0;
import c8.kb;
import java.nio.ByteBuffer;
import java.util.Date;
import y7.i6;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class k extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ i6 D;
    public static final /* synthetic */ i6 E;
    public static final /* synthetic */ i6 F;
    public static final /* synthetic */ i6 G;
    public static final /* synthetic */ i6 H;
    public static final /* synthetic */ i6 I;
    public static final /* synthetic */ i6 s;
    public static final /* synthetic */ i6 w;
    public static final /* synthetic */ i6 x;
    public static final /* synthetic */ i6 y;
    public Date e;
    public Date f;
    public long h;
    public long n;
    public String r;

    static {
        ze.a aVar = new ze.a(k.class, "MediaHeaderBox.java");
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
            this.e = kb.b(h5.b.j(byteBuffer));
            this.f = kb.b(h5.b.j(byteBuffer));
            this.h = h5.b.i(byteBuffer);
            this.n = h5.b.j(byteBuffer);
        } else {
            this.e = kb.b(h5.b.i(byteBuffer));
            this.f = kb.b(h5.b.i(byteBuffer));
            this.h = h5.b.i(byteBuffer);
            this.n = h5.b.i(byteBuffer);
        }
        int h = h5.b.h(byteBuffer);
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < 3; i7++) {
            sb2.append((char) (((h >> ((2 - i7) * 5)) & 31) + 96));
        }
        this.r = sb2.toString();
        h5.b.h(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(kb.a(this.e));
            byteBuffer.putLong(kb.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.n);
        } else {
            byteBuffer.putInt((int) kb.a(this.e));
            byteBuffer.putInt((int) kb.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.n);
        }
        String str = this.r;
        if (str.getBytes().length != 3) {
            throw new IllegalArgumentException(p0.p("\"", str, "\" language string isn't exactly 3 characters long!"));
        }
        int i7 = 0;
        for (int i10 = 0; i10 < 3; i10++) {
            i7 += (str.getBytes()[i10] - 96) << ((2 - i10) * 5);
        }
        h5.b.p(i7, byteBuffer);
        h5.b.p(0, byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (e() == 1 ? 32L : 20L) + 4;
    }

    public final String toString() {
        ui.e b10 = ze.a.b(I, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MediaHeaderBox[creationTime=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(s, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(w, this, this));
        sb2.append(this.f);
        sb2.append(";timescale=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(x, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(y, this, this));
        sb2.append(this.n);
        sb2.append(";language=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(D, this, this));
        return p0.s(sb2, this.r, "]");
    }
}
