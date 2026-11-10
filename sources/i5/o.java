package i5;

import a8.p0;
import c8.jb;
import java.nio.ByteBuffer;
import y7.i6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class o extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ i6 n;
    public static final /* synthetic */ i6 r;
    public static final /* synthetic */ i6 s;
    public static final /* synthetic */ i6 w;
    public long e;
    public long[] f;
    public int h;

    static {
        ze.a aVar = new ze.a(o.class, "SampleSizeBox.java");
        n = aVar.e(aVar.d("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "void"));
        aVar.e(aVar.d("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "long"));
        r = aVar.e(aVar.d("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "[J"));
        s = aVar.e(aVar.d("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "void"));
        w = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "java.lang.String"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = h5.b.i(byteBuffer);
        int a10 = jb.a(h5.b.i(byteBuffer));
        this.h = a10;
        if (this.e == 0) {
            this.f = new long[a10];
            for (int i7 = 0; i7 < this.h; i7++) {
                this.f[i7] = h5.b.i(byteBuffer);
            }
        }
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.e);
        if (this.e != 0) {
            byteBuffer.putInt(this.h);
            return;
        }
        byteBuffer.putInt(this.f.length);
        for (long j3 : this.f) {
            byteBuffer.putInt((int) j3);
        }
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (this.e == 0 ? this.f.length * 4 : 0) + 12;
    }

    public final String toString() {
        ui.e b10 = ze.a.b(w, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SampleSizeBox[sampleSize=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(n, this, this));
        sb2.append(this.e);
        sb2.append(";sampleCount=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(r, this, this));
        return p0.r(sb2, this.e > 0 ? this.h : this.f.length, "]");
    }
}
