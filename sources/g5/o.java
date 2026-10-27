package g5;

import c3.h0;
import java.nio.ByteBuffer;
import li.e3;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class o extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ e3 n;
    public static final /* synthetic */ e3 r;
    public static final /* synthetic */ e3 s;
    public static final /* synthetic */ e3 v;
    public long e;
    public long[] f;
    public int h;

    static {
        ue.a aVar = new ue.a(o.class, "SampleSizeBox.java");
        n = aVar.e(aVar.d("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "void"));
        aVar.e(aVar.d("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "long"));
        r = aVar.e(aVar.d("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "[J"));
        s = aVar.e(aVar.d("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "void"));
        v = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "java.lang.String"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = f5.b.i(byteBuffer);
        int a2 = f6.e.a(f5.b.i(byteBuffer));
        this.h = a2;
        if (this.e == 0) {
            this.f = new long[a2];
            for (int i10 = 0; i10 < this.h; i10++) {
                this.f[i10] = f5.b.i(byteBuffer);
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
        for (long j10 : this.f) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (this.e == 0 ? this.f.length * 4 : 0) + 12;
    }

    public final String toString() {
        ti.e b10 = ue.a.b(v, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SampleSizeBox[sampleSize=");
        h0.s(ue.a.b(n, this, this));
        sb2.append(this.e);
        sb2.append(";sampleCount=");
        h0.s(ue.a.b(r, this, this));
        return a1.g.r(sb2, this.e > 0 ? this.h : this.f.length, "]");
    }
}
