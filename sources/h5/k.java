package h5;

import b8.fe;
import java.nio.ByteBuffer;
import java.util.Date;
import org.telegram.ui.Components.i9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ i9 E;
    public static final /* synthetic */ i9 F;
    public static final /* synthetic */ i9 G;
    public static final /* synthetic */ i9 H;
    public static final /* synthetic */ i9 I;
    public static final /* synthetic */ i9 J;
    public static final /* synthetic */ i9 s;
    public static final /* synthetic */ i9 w;
    public static final /* synthetic */ i9 x;
    public static final /* synthetic */ i9 y;
    public Date e;
    public Date f;
    public long h;
    public long n;
    public String r;

    static {
        we.a aVar = new we.a(k.class, "MediaHeaderBox.java");
        s = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        w = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        J = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        x = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        y = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        E = aVar.e(aVar.d("getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        F = aVar.e(aVar.d("setCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "creationTime", "void"));
        aVar.e(aVar.d("setModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "modificationTime", "void"));
        G = aVar.e(aVar.d("setTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "timescale", "void"));
        H = aVar.e(aVar.d("setDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "duration", "void"));
        I = aVar.e(aVar.d("setLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "java.lang.String", "language", "void"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.e = fe.b(g5.b.j(byteBuffer));
            this.f = fe.b(g5.b.j(byteBuffer));
            this.h = g5.b.i(byteBuffer);
            this.n = g5.b.j(byteBuffer);
        } else {
            this.e = fe.b(g5.b.i(byteBuffer));
            this.f = fe.b(g5.b.i(byteBuffer));
            this.h = g5.b.i(byteBuffer);
            this.n = g5.b.i(byteBuffer);
        }
        int h = g5.b.h(byteBuffer);
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = 0; i3 < 3; i3++) {
            sb2.append((char) (((h >> ((2 - i3) * 5)) & 31) + 96));
        }
        this.r = sb2.toString();
        g5.b.h(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(fe.a(this.e));
            byteBuffer.putLong(fe.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.n);
        } else {
            byteBuffer.putInt((int) fe.a(this.e));
            byteBuffer.putInt((int) fe.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.n);
        }
        String str = this.r;
        if (str.getBytes().length != 3) {
            throw new IllegalArgumentException(a1.g.q("\"", str, "\" language string isn't exactly 3 characters long!"));
        }
        int i3 = 0;
        for (int i10 = 0; i10 < 3; i10++) {
            i3 += (str.getBytes()[i10] - 96) << ((2 - i10) * 5);
        }
        g5.b.p(i3, byteBuffer);
        g5.b.p(0, byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (e() == 1 ? 32L : 20L) + 4;
    }

    public final String toString() {
        ui.f b10 = we.a.b(J, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MediaHeaderBox[creationTime=");
        com.google.android.recaptcha.internal.a.t(we.a.b(s, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        com.google.android.recaptcha.internal.a.t(we.a.b(w, this, this));
        sb2.append(this.f);
        sb2.append(";timescale=");
        com.google.android.recaptcha.internal.a.t(we.a.b(x, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        com.google.android.recaptcha.internal.a.t(we.a.b(y, this, this));
        sb2.append(this.n);
        sb2.append(";language=");
        com.google.android.recaptcha.internal.a.t(we.a.b(E, this, this));
        return a1.g.s(sb2, this.r, "]");
    }
}
