package g5;

import c3.h0;
import java.nio.ByteBuffer;
import java.util.Date;
import li.e3;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class y extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ e3 E;
    public static final /* synthetic */ e3 F;
    public static final /* synthetic */ e3 G;
    public static final /* synthetic */ e3 H;
    public static final /* synthetic */ e3 I;
    public static final /* synthetic */ e3 J;
    public static final /* synthetic */ e3 K;
    public static final /* synthetic */ e3 L;
    public static final /* synthetic */ e3 M;
    public static final /* synthetic */ e3 N;
    public static final /* synthetic */ e3 O;
    public static final /* synthetic */ e3 P;
    public static final /* synthetic */ e3 Q;
    public static final /* synthetic */ e3 R;
    public static final /* synthetic */ e3 S;
    public static final /* synthetic */ e3 T;
    public static final /* synthetic */ e3 U;
    public static final /* synthetic */ e3 V;
    public static final /* synthetic */ e3 W;
    public static final /* synthetic */ e3 X;
    public static final /* synthetic */ e3 Y;
    public static final /* synthetic */ e3 Z;
    public static final /* synthetic */ e3 a0;
    public static final /* synthetic */ e3 b0;
    public Date e;
    public Date f;
    public long h;
    public long n;
    public int r;
    public int s;
    public float v;
    public sc.d w;
    public double x;
    public double y;

    static {
        ue.a aVar = new ue.a(y.class, "TrackHeaderBox.java");
        E = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.util.Date"));
        F = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.util.Date"));
        N = aVar.e(aVar.d("getContent", "com.coremedia.iso.boxes.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        O = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.lang.String"));
        P = aVar.e(aVar.d("setCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "creationTime", "void"));
        Q = aVar.e(aVar.d("setModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "modificationTime", "void"));
        R = aVar.e(aVar.d("setTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "trackId", "void"));
        S = aVar.e(aVar.d("setDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "duration", "void"));
        T = aVar.e(aVar.d("setLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "layer", "void"));
        U = aVar.e(aVar.d("setAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "alternateGroup", "void"));
        V = aVar.e(aVar.d("setVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "float", "volume", "void"));
        W = aVar.e(aVar.d("setMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "void"));
        G = aVar.e(aVar.d("getTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "long"));
        X = aVar.e(aVar.d("setWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "width", "void"));
        Y = aVar.e(aVar.d("setHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "height", "void"));
        aVar.e(aVar.d("isEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        aVar.e(aVar.d("isInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        aVar.e(aVar.d("isInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        aVar.e(aVar.d("isInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        Z = aVar.e(aVar.d("setEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "enabled", "void"));
        a0 = aVar.e(aVar.d("setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "void"));
        b0 = aVar.e(aVar.d("setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "void"));
        aVar.e(aVar.d("setInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPoster", "void"));
        H = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "long"));
        I = aVar.e(aVar.d("getLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "int"));
        J = aVar.e(aVar.d("getAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "int"));
        K = aVar.e(aVar.d("getVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "float"));
        aVar.e(aVar.d("getMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "com.googlecode.mp4parser.util.Matrix"));
        L = aVar.e(aVar.d("getWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "double"));
        M = aVar.e(aVar.d("getHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "double"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.e = i8.e.b(f5.b.j(byteBuffer));
            this.f = i8.e.b(f5.b.j(byteBuffer));
            this.h = f5.b.i(byteBuffer);
            f5.b.i(byteBuffer);
            long j10 = byteBuffer.getLong();
            this.n = j10;
            if (j10 < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else {
            this.e = i8.e.b(f5.b.i(byteBuffer));
            this.f = i8.e.b(f5.b.i(byteBuffer));
            this.h = f5.b.i(byteBuffer);
            f5.b.i(byteBuffer);
            this.n = f5.b.i(byteBuffer);
        }
        f5.b.i(byteBuffer);
        f5.b.i(byteBuffer);
        this.r = f5.b.h(byteBuffer);
        this.s = f5.b.h(byteBuffer);
        this.v = f5.b.g(byteBuffer);
        f5.b.h(byteBuffer);
        this.w = sc.d.a(byteBuffer);
        this.x = f5.b.f(byteBuffer);
        this.y = f5.b.f(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        ti.e c10 = ue.a.c(N, this, this, byteBuffer);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c10);
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(i8.e.a(this.e));
            byteBuffer.putLong(i8.e.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putLong(this.n);
        } else {
            byteBuffer.putInt((int) i8.e.a(this.e));
            byteBuffer.putInt((int) i8.e.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putInt((int) this.n);
        }
        int i10 = (int) 0;
        byteBuffer.putInt(i10);
        byteBuffer.putInt(i10);
        f5.b.p(this.r, byteBuffer);
        f5.b.p(this.s, byteBuffer);
        f5.b.o(byteBuffer, this.v);
        f5.b.p(0, byteBuffer);
        this.w.b(byteBuffer);
        f5.b.n(byteBuffer, this.x);
        f5.b.n(byteBuffer, this.y);
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (e() == 1 ? 36L : 24L) + 60;
    }

    public final String toString() {
        ti.e b10 = ue.a.b(O, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("TrackHeaderBox[creationTime=");
        h0.s(ue.a.b(E, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        h0.s(ue.a.b(F, this, this));
        sb2.append(this.f);
        sb2.append(";trackId=");
        h0.s(ue.a.b(G, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        h0.s(ue.a.b(H, this, this));
        sb2.append(this.n);
        sb2.append(";layer=");
        h0.s(ue.a.b(I, this, this));
        sb2.append(this.r);
        sb2.append(";alternateGroup=");
        h0.s(ue.a.b(J, this, this));
        sb2.append(this.s);
        sb2.append(";volume=");
        h0.s(ue.a.b(K, this, this));
        sb2.append(this.v);
        sb2.append(";matrix=");
        sb2.append(this.w);
        sb2.append(";width=");
        h0.s(ue.a.b(L, this, this));
        sb2.append(this.x);
        sb2.append(";height=");
        h0.s(ue.a.b(M, this, this));
        sb2.append(this.y);
        sb2.append("]");
        return sb2.toString();
    }
}
