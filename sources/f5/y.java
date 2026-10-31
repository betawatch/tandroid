package f5;

import c3.i0;
import java.nio.ByteBuffer;
import java.util.Date;
import v7.r8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class y extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ za.c E;
    public static final /* synthetic */ za.c F;
    public static final /* synthetic */ za.c G;
    public static final /* synthetic */ za.c H;
    public static final /* synthetic */ za.c I;
    public static final /* synthetic */ za.c J;
    public static final /* synthetic */ za.c K;
    public static final /* synthetic */ za.c L;
    public static final /* synthetic */ za.c M;
    public static final /* synthetic */ za.c N;
    public static final /* synthetic */ za.c O;
    public static final /* synthetic */ za.c P;
    public static final /* synthetic */ za.c Q;
    public static final /* synthetic */ za.c R;
    public static final /* synthetic */ za.c S;
    public static final /* synthetic */ za.c T;
    public static final /* synthetic */ za.c U;
    public static final /* synthetic */ za.c V;
    public static final /* synthetic */ za.c W;
    public static final /* synthetic */ za.c X;
    public static final /* synthetic */ za.c Y;
    public static final /* synthetic */ za.c Z;
    public static final /* synthetic */ za.c a0;
    public static final /* synthetic */ za.c b0;
    public double D;
    public Date e;
    public Date f;
    public long h;
    public long n;
    public int r;
    public int s;
    public float w;
    public jc.d x;
    public double y;

    static {
        le.a aVar = new le.a(y.class, "TrackHeaderBox.java");
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
            this.e = r8.b(e5.b.j(byteBuffer));
            this.f = r8.b(e5.b.j(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            e5.b.i(byteBuffer);
            long j10 = byteBuffer.getLong();
            this.n = j10;
            if (j10 < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else {
            this.e = r8.b(e5.b.i(byteBuffer));
            this.f = r8.b(e5.b.i(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            e5.b.i(byteBuffer);
            this.n = e5.b.i(byteBuffer);
        }
        e5.b.i(byteBuffer);
        e5.b.i(byteBuffer);
        this.r = e5.b.h(byteBuffer);
        this.s = e5.b.h(byteBuffer);
        this.w = e5.b.g(byteBuffer);
        e5.b.h(byteBuffer);
        this.x = jc.d.a(byteBuffer);
        this.y = e5.b.f(byteBuffer);
        this.D = e5.b.f(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        ji.f c10 = le.a.c(N, this, this, byteBuffer);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c10);
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(r8.a(this.e));
            byteBuffer.putLong(r8.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putLong(this.n);
        } else {
            byteBuffer.putInt((int) r8.a(this.e));
            byteBuffer.putInt((int) r8.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putInt((int) this.n);
        }
        int i10 = (int) 0;
        byteBuffer.putInt(i10);
        byteBuffer.putInt(i10);
        e5.b.p(this.r, byteBuffer);
        e5.b.p(this.s, byteBuffer);
        e5.b.o(byteBuffer, this.w);
        e5.b.p(0, byteBuffer);
        this.x.b(byteBuffer);
        e5.b.n(byteBuffer, this.y);
        e5.b.n(byteBuffer, this.D);
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (e() == 1 ? 36L : 24L) + 60;
    }

    public final String toString() {
        ji.f b10 = le.a.b(O, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("TrackHeaderBox[creationTime=");
        i0.s(le.a.b(E, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        i0.s(le.a.b(F, this, this));
        sb2.append(this.f);
        sb2.append(";trackId=");
        i0.s(le.a.b(G, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        i0.s(le.a.b(H, this, this));
        sb2.append(this.n);
        sb2.append(";layer=");
        i0.s(le.a.b(I, this, this));
        sb2.append(this.r);
        sb2.append(";alternateGroup=");
        i0.s(le.a.b(J, this, this));
        sb2.append(this.s);
        sb2.append(";volume=");
        i0.s(le.a.b(K, this, this));
        sb2.append(this.w);
        sb2.append(";matrix=");
        sb2.append(this.x);
        sb2.append(";width=");
        i0.s(le.a.b(L, this, this));
        sb2.append(this.y);
        sb2.append(";height=");
        i0.s(le.a.b(M, this, this));
        sb2.append(this.D);
        sb2.append("]");
        return sb2.toString();
    }
}
