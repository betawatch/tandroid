package f5;

import com.google.android.gms.internal.play_billing.k3;
import java.nio.ByteBuffer;
import w7.b7;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class o extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ te.b n;
    public static final /* synthetic */ te.b r;
    public static final /* synthetic */ te.b s;
    public static final /* synthetic */ te.b v;
    public long e;
    public long[] f;
    public int h;

    static {
        te.a aVar = new te.a(o.class, "SampleSizeBox.java");
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
        this.e = e5.b.i(byteBuffer);
        int a2 = b7.a(e5.b.i(byteBuffer));
        this.h = a2;
        if (this.e == 0) {
            this.f = new long[a2];
            for (int i10 = 0; i10 < this.h; i10++) {
                this.f[i10] = e5.b.i(byteBuffer);
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
        com.google.firebase.messaging.r b10 = te.a.b(v, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SampleSizeBox[sampleSize=");
        k3.o(te.a.b(n, this, this));
        sb2.append(this.e);
        sb2.append(";sampleCount=");
        k3.o(te.a.b(r, this, this));
        return a1.g.r(sb2, this.e > 0 ? this.h : this.f.length, "]");
    }
}
