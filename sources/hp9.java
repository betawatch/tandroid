// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class hp9 extends g2 {
    public static final /* synthetic */ z24 n;
    public static final /* synthetic */ z24 r;
    public static final /* synthetic */ z24 s;
    public static final /* synthetic */ z24 w;
    public long e;
    public long[] f;
    public int h;

    static {
        z74 z74Var = new z74(hp9.class, "SampleSizeBox.java");
        n = z74Var.e(z74Var.d("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        z74Var.e(z74Var.d("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "void"));
        z74Var.e(z74Var.d("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "long"));
        r = z74Var.e(z74Var.d("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        z74Var.e(z74Var.d("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "[J"));
        s = z74Var.e(z74Var.d("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "void"));
        w = z74Var.e(z74Var.d("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "java.lang.String"));
    }

    @Override // g2, y1
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = hle.g(byteBuffer);
        int a = mqd.a(hle.g(byteBuffer));
        this.h = a;
        if (this.e == 0) {
            this.f = new long[a];
            for (int i = 0; i < this.h; i++) {
                this.f[i] = hle.g(byteBuffer);
            }
        }
    }

    @Override // g2, y1
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.e);
        if (this.e != 0) {
            byteBuffer.putInt(this.h);
            return;
        }
        byteBuffer.putInt(this.f.length);
        long[] jArr = this.f;
        for (long j : jArr) {
            byteBuffer.putInt((int) j);
        }
    }

    @Override // y1
    public final long getContentSize() {
        return (this.e == 0 ? this.f.length << 2 : 0) + 12;
    }

    public final String toString() {
        c5a b = z74.b(w, this, this);
        n89.a().getClass();
        n89.b(b);
        StringBuilder sb = new StringBuilder("SampleSizeBox[sampleSize=");
        oo1.r(z74.b(n, this, this));
        sb.append(this.e);
        sb.append(";sampleCount=");
        oo1.r(z74.b(r, this, this));
        return ls6.p(sb, this.e > 0 ? this.h : this.f.length, "]");
    }
}
