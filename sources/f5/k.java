package f5;

import com.google.android.gms.internal.play_billing.k3;
import java.nio.ByteBuffer;
import java.util.Date;
import ji.w4;
import w7.g7;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class k extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ w4 E;
    public static final /* synthetic */ w4 F;
    public static final /* synthetic */ w4 G;
    public static final /* synthetic */ w4 H;
    public static final /* synthetic */ w4 I;
    public static final /* synthetic */ w4 s;
    public static final /* synthetic */ w4 v;
    public static final /* synthetic */ w4 w;
    public static final /* synthetic */ w4 x;
    public static final /* synthetic */ w4 y;
    public Date e;
    public Date f;
    public long h;
    public long n;
    public String r;

    static {
        te.a aVar = new te.a(k.class, "MediaHeaderBox.java");
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
            this.e = g7.b(e5.b.j(byteBuffer));
            this.f = g7.b(e5.b.j(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.n = e5.b.j(byteBuffer);
        } else {
            this.e = g7.b(e5.b.i(byteBuffer));
            this.f = g7.b(e5.b.i(byteBuffer));
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
            byteBuffer.putLong(g7.a(this.e));
            byteBuffer.putLong(g7.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.n);
        } else {
            byteBuffer.putInt((int) g7.a(this.e));
            byteBuffer.putInt((int) g7.a(this.f));
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
        e5.b.p(i10, byteBuffer);
        e5.b.p(0, byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (e() == 1 ? 32L : 20L) + 4;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = te.a.b(I, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MediaHeaderBox[creationTime=");
        k3.p(te.a.b(s, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        k3.p(te.a.b(v, this, this));
        sb2.append(this.f);
        sb2.append(";timescale=");
        k3.p(te.a.b(w, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        k3.p(te.a.b(x, this, this));
        sb2.append(this.n);
        sb2.append(";language=");
        k3.p(te.a.b(y, this, this));
        return a1.g.s(sb2, this.r, "]");
    }
}
