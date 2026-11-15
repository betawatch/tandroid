package i5;

import a8.p0;
import ab.c0;
import c8.mb;
import java.nio.ByteBuffer;
import java.util.Date;
import org.telegram.ui.Components.ff;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class n extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ ff J;
    public static final /* synthetic */ ff K;
    public static final /* synthetic */ ff L;
    public static final /* synthetic */ ff M;
    public static final /* synthetic */ ff N;
    public static final /* synthetic */ ff O;
    public static final /* synthetic */ ff P;
    public static final /* synthetic */ ff Q;
    public static final /* synthetic */ ff R;
    public static final /* synthetic */ ff S;
    public static final /* synthetic */ ff T;
    public static final /* synthetic */ ff U;
    public static final /* synthetic */ ff V;
    public static final /* synthetic */ ff W;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public Date e;
    public Date f;
    public long h;
    public long n;
    public double r;
    public float s;
    public pc.d w;
    public long x;
    public int y;

    static {
        ze.a aVar = new ze.a(n.class, "MovieHeaderBox.java");
        J = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.util.Date"));
        K = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.util.Date"));
        S = aVar.e(aVar.d("setModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "modificationTime", "void"));
        T = aVar.e(aVar.d("setTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "timescale", "void"));
        U = aVar.e(aVar.d("setDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "duration", "void"));
        aVar.e(aVar.d("setRate", "com.coremedia.iso.boxes.MovieHeaderBox", "double", "rate", "void"));
        aVar.e(aVar.d("setVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "float", "volume", "void"));
        V = aVar.e(aVar.d("setMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "void"));
        W = aVar.e(aVar.d("setNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "nextTrackId", "void"));
        aVar.e(aVar.d("getPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewTime", "void"));
        aVar.e(aVar.d("getPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        L = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        aVar.e(aVar.d("setPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewDuration", "void"));
        aVar.e(aVar.d("getPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "posterTime", "void"));
        aVar.e(aVar.d("getSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionTime", "void"));
        aVar.e(aVar.d("getSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionDuration", "void"));
        aVar.e(aVar.d("getCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "currentTime", "void"));
        M = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        N = aVar.e(aVar.d("getRate", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "double"));
        O = aVar.e(aVar.d("getVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "float"));
        aVar.e(aVar.d("getMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "com.googlecode.mp4parser.util.Matrix"));
        P = aVar.e(aVar.d("getNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        Q = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.lang.String"));
        R = aVar.e(aVar.d("setCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "creationTime", "void"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.e = mb.b(h5.b.j(byteBuffer));
            this.f = mb.b(h5.b.j(byteBuffer));
            this.h = h5.b.i(byteBuffer);
            this.n = h5.b.j(byteBuffer);
        } else {
            this.e = mb.b(h5.b.i(byteBuffer));
            this.f = mb.b(h5.b.i(byteBuffer));
            this.h = h5.b.i(byteBuffer);
            this.n = h5.b.i(byteBuffer);
        }
        this.r = h5.b.f(byteBuffer);
        this.s = h5.b.g(byteBuffer);
        h5.b.h(byteBuffer);
        h5.b.i(byteBuffer);
        h5.b.i(byteBuffer);
        this.w = pc.d.a(byteBuffer);
        this.y = byteBuffer.getInt();
        this.E = byteBuffer.getInt();
        this.F = byteBuffer.getInt();
        this.G = byteBuffer.getInt();
        this.H = byteBuffer.getInt();
        this.I = byteBuffer.getInt();
        this.x = h5.b.i(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(mb.a(this.e));
            byteBuffer.putLong(mb.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.n);
        } else {
            byteBuffer.putInt((int) mb.a(this.e));
            byteBuffer.putInt((int) mb.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.n);
        }
        h5.b.n(byteBuffer, this.r);
        h5.b.o(byteBuffer, this.s);
        h5.b.p(0, byteBuffer);
        int i7 = (int) 0;
        byteBuffer.putInt(i7);
        byteBuffer.putInt(i7);
        this.w.b(byteBuffer);
        byteBuffer.putInt(this.y);
        byteBuffer.putInt(this.E);
        byteBuffer.putInt(this.F);
        byteBuffer.putInt(this.G);
        byteBuffer.putInt(this.H);
        byteBuffer.putInt(this.I);
        byteBuffer.putInt((int) this.x);
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (e() == 1 ? 32L : 20L) + 80;
    }

    public final String toString() {
        c0 b10 = ze.a.b(Q, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MovieHeaderBox[creationTime=");
        c.u(ze.a.b(J, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        c.u(ze.a.b(K, this, this));
        sb2.append(this.f);
        sb2.append(";timescale=");
        c.u(ze.a.b(L, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        c.u(ze.a.b(M, this, this));
        sb2.append(this.n);
        sb2.append(";rate=");
        c.u(ze.a.b(N, this, this));
        sb2.append(this.r);
        sb2.append(";volume=");
        c.u(ze.a.b(O, this, this));
        sb2.append(this.s);
        sb2.append(";matrix=");
        sb2.append(this.w);
        sb2.append(";nextTrackId=");
        c.u(ze.a.b(P, this, this));
        return p0.r(sb2, this.x, "]");
    }
}
