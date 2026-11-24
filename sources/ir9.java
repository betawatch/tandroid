// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ir9 extends g2 {
    public static final /* synthetic */ ai4 n;
    public static final /* synthetic */ ai4 r;
    public static final /* synthetic */ ai4 s;
    public static final /* synthetic */ ai4 w;
    public long e;
    public long[] f;
    public int h;

    static {
        i94 i94Var = new i94(ir9.class, "SampleSizeBox.java");
        n = i94Var.e(i94Var.d("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        i94Var.e(i94Var.d("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "void"));
        i94Var.e(i94Var.d("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "long"));
        r = i94Var.e(i94Var.d("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        i94Var.e(i94Var.d("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "[J"));
        s = i94Var.e(i94Var.d("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "void"));
        w = i94Var.e(i94Var.d("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "java.lang.String"));
    }

    @Override // g2, y1
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = jne.g(byteBuffer);
        int a = psd.a(jne.g(byteBuffer));
        this.h = a;
        if (this.e == 0) {
            this.f = new long[a];
            for (int i = 0; i < this.h; i++) {
                this.f[i] = jne.g(byteBuffer);
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
        xvc b = i94.b(w, this, this);
        pa9.a().getClass();
        pa9.b(b);
        StringBuilder sb = new StringBuilder("SampleSizeBox[sampleSize=");
        aq1.r(i94.b(n, this, this));
        sb.append(this.e);
        sb.append(";sampleCount=");
        aq1.r(i94.b(r, this, this));
        return kt6.q(sb, this.e > 0 ? this.h : this.f.length, "]");
    }
}
