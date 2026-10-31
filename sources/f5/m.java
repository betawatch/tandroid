package f5;

import c3.i0;
import java.nio.ByteBuffer;
import java.util.Date;
import v7.r8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class m extends com.googlecode.mp4parser.c {
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
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public Date e;
    public Date f;
    public long h;
    public long n;
    public double r;
    public float s;
    public jc.d w;
    public long x;
    public int y;

    static {
        le.a aVar = new le.a(m.class, "MovieHeaderBox.java");
        I = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.util.Date"));
        J = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.util.Date"));
        R = aVar.e(aVar.d("setModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "modificationTime", "void"));
        S = aVar.e(aVar.d("setTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "timescale", "void"));
        T = aVar.e(aVar.d("setDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "duration", "void"));
        aVar.e(aVar.d("setRate", "com.coremedia.iso.boxes.MovieHeaderBox", "double", "rate", "void"));
        aVar.e(aVar.d("setVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "float", "volume", "void"));
        U = aVar.e(aVar.d("setMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "void"));
        V = aVar.e(aVar.d("setNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "nextTrackId", "void"));
        aVar.e(aVar.d("getPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewTime", "void"));
        aVar.e(aVar.d("getPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        K = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        aVar.e(aVar.d("setPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewDuration", "void"));
        aVar.e(aVar.d("getPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "posterTime", "void"));
        aVar.e(aVar.d("getSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionTime", "void"));
        aVar.e(aVar.d("getSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionDuration", "void"));
        aVar.e(aVar.d("getCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "currentTime", "void"));
        L = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        M = aVar.e(aVar.d("getRate", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "double"));
        N = aVar.e(aVar.d("getVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "float"));
        aVar.e(aVar.d("getMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "com.googlecode.mp4parser.util.Matrix"));
        O = aVar.e(aVar.d("getNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        P = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.lang.String"));
        Q = aVar.e(aVar.d("setCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "creationTime", "void"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.e = r8.b(e5.b.j(byteBuffer));
            this.f = r8.b(e5.b.j(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.n = e5.b.j(byteBuffer);
        } else {
            this.e = r8.b(e5.b.i(byteBuffer));
            this.f = r8.b(e5.b.i(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.n = e5.b.i(byteBuffer);
        }
        this.r = e5.b.f(byteBuffer);
        this.s = e5.b.g(byteBuffer);
        e5.b.h(byteBuffer);
        e5.b.i(byteBuffer);
        e5.b.i(byteBuffer);
        this.w = jc.d.a(byteBuffer);
        this.y = byteBuffer.getInt();
        this.D = byteBuffer.getInt();
        this.E = byteBuffer.getInt();
        this.F = byteBuffer.getInt();
        this.G = byteBuffer.getInt();
        this.H = byteBuffer.getInt();
        this.x = e5.b.i(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(r8.a(this.e));
            byteBuffer.putLong(r8.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.n);
        } else {
            byteBuffer.putInt((int) r8.a(this.e));
            byteBuffer.putInt((int) r8.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.n);
        }
        e5.b.n(byteBuffer, this.r);
        e5.b.o(byteBuffer, this.s);
        e5.b.p(0, byteBuffer);
        int i10 = (int) 0;
        byteBuffer.putInt(i10);
        byteBuffer.putInt(i10);
        this.w.b(byteBuffer);
        byteBuffer.putInt(this.y);
        byteBuffer.putInt(this.D);
        byteBuffer.putInt(this.E);
        byteBuffer.putInt(this.F);
        byteBuffer.putInt(this.G);
        byteBuffer.putInt(this.H);
        byteBuffer.putInt((int) this.x);
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (e() == 1 ? 32L : 20L) + 80;
    }

    public final String toString() {
        ji.f b10 = le.a.b(P, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MovieHeaderBox[creationTime=");
        i0.s(le.a.b(I, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        i0.s(le.a.b(J, this, this));
        sb2.append(this.f);
        sb2.append(";timescale=");
        i0.s(le.a.b(K, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        i0.s(le.a.b(L, this, this));
        sb2.append(this.n);
        sb2.append(";rate=");
        i0.s(le.a.b(M, this, this));
        sb2.append(this.r);
        sb2.append(";volume=");
        i0.s(le.a.b(N, this, this));
        sb2.append(this.s);
        sb2.append(";matrix=");
        sb2.append(this.w);
        sb2.append(";nextTrackId=");
        i0.s(le.a.b(O, this, this));
        return a1.g.q(sb2, this.x, "]");
    }
}
