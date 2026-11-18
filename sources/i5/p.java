package i5;

import a8.p0;
import ab.c0;
import c8.ob;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class p extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ ze.b n;
    public static final /* synthetic */ ze.b r;
    public static final /* synthetic */ ze.b s;
    public static final /* synthetic */ ze.b w;
    public long e;
    public long[] f;
    public int h;

    static {
        ze.a aVar = new ze.a(p.class, "SampleSizeBox.java");
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
        int a10 = ob.a(h5.b.i(byteBuffer));
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
        c0 b10 = ze.a.b(w, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SampleSizeBox[sampleSize=");
        c.w(ze.a.b(n, this, this));
        sb2.append(this.e);
        sb2.append(";sampleCount=");
        c.w(ze.a.b(r, this, this));
        return p0.r(sb2, this.e > 0 ? this.h : this.f.length, "]");
    }
}
