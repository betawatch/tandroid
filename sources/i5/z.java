package i5;

import ab.c0;
import c8.mb;
import java.nio.ByteBuffer;
import java.util.Date;
import org.telegram.ui.Components.ff;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class z extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ ff F;
    public static final /* synthetic */ ff G;
    public static final /* synthetic */ ff H;
    public static final /* synthetic */ ff I;
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
    public static final /* synthetic */ ff X;
    public static final /* synthetic */ ff Y;
    public static final /* synthetic */ ff Z;
    public static final /* synthetic */ ff a0;
    public static final /* synthetic */ ff b0;
    public static final /* synthetic */ ff c0;
    public double E;
    public Date e;
    public Date f;
    public long h;
    public long n;
    public int r;
    public int s;
    public float w;
    public pc.d x;
    public double y;

    static {
        ze.a aVar = new ze.a(z.class, "TrackHeaderBox.java");
        F = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.util.Date"));
        G = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.util.Date"));
        O = aVar.e(aVar.d("getContent", "com.coremedia.iso.boxes.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        P = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.lang.String"));
        Q = aVar.e(aVar.d("setCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "creationTime", "void"));
        R = aVar.e(aVar.d("setModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "modificationTime", "void"));
        S = aVar.e(aVar.d("setTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "trackId", "void"));
        T = aVar.e(aVar.d("setDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "duration", "void"));
        U = aVar.e(aVar.d("setLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "layer", "void"));
        V = aVar.e(aVar.d("setAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "alternateGroup", "void"));
        W = aVar.e(aVar.d("setVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "float", "volume", "void"));
        X = aVar.e(aVar.d("setMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "void"));
        H = aVar.e(aVar.d("getTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "long"));
        Y = aVar.e(aVar.d("setWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "width", "void"));
        Z = aVar.e(aVar.d("setHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "height", "void"));
        aVar.e(aVar.d("isEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        aVar.e(aVar.d("isInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        aVar.e(aVar.d("isInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        aVar.e(aVar.d("isInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        a0 = aVar.e(aVar.d("setEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "enabled", "void"));
        b0 = aVar.e(aVar.d("setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "void"));
        c0 = aVar.e(aVar.d("setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "void"));
        aVar.e(aVar.d("setInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPoster", "void"));
        I = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "long"));
        J = aVar.e(aVar.d("getLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "int"));
        K = aVar.e(aVar.d("getAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "int"));
        L = aVar.e(aVar.d("getVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "float"));
        aVar.e(aVar.d("getMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "com.googlecode.mp4parser.util.Matrix"));
        M = aVar.e(aVar.d("getWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "double"));
        N = aVar.e(aVar.d("getHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "double"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.e = mb.b(h5.b.j(byteBuffer));
            this.f = mb.b(h5.b.j(byteBuffer));
            this.h = h5.b.i(byteBuffer);
            h5.b.i(byteBuffer);
            long j3 = byteBuffer.getLong();
            this.n = j3;
            if (j3 < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else {
            this.e = mb.b(h5.b.i(byteBuffer));
            this.f = mb.b(h5.b.i(byteBuffer));
            this.h = h5.b.i(byteBuffer);
            h5.b.i(byteBuffer);
            this.n = h5.b.i(byteBuffer);
        }
        h5.b.i(byteBuffer);
        h5.b.i(byteBuffer);
        this.r = h5.b.h(byteBuffer);
        this.s = h5.b.h(byteBuffer);
        this.w = h5.b.g(byteBuffer);
        h5.b.h(byteBuffer);
        this.x = pc.d.a(byteBuffer);
        this.y = h5.b.f(byteBuffer);
        this.E = h5.b.f(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        c0 c10 = ze.a.c(O, this, this, byteBuffer);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c10);
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(mb.a(this.e));
            byteBuffer.putLong(mb.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putLong(this.n);
        } else {
            byteBuffer.putInt((int) mb.a(this.e));
            byteBuffer.putInt((int) mb.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putInt((int) this.n);
        }
        int i7 = (int) 0;
        byteBuffer.putInt(i7);
        byteBuffer.putInt(i7);
        h5.b.p(this.r, byteBuffer);
        h5.b.p(this.s, byteBuffer);
        h5.b.o(byteBuffer, this.w);
        h5.b.p(0, byteBuffer);
        this.x.b(byteBuffer);
        h5.b.n(byteBuffer, this.y);
        h5.b.n(byteBuffer, this.E);
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (e() == 1 ? 36L : 24L) + 60;
    }

    public final String toString() {
        c0 b10 = ze.a.b(P, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("TrackHeaderBox[creationTime=");
        c.u(ze.a.b(F, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        c.u(ze.a.b(G, this, this));
        sb2.append(this.f);
        sb2.append(";trackId=");
        c.u(ze.a.b(H, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        c.u(ze.a.b(I, this, this));
        sb2.append(this.n);
        sb2.append(";layer=");
        c.u(ze.a.b(J, this, this));
        sb2.append(this.r);
        sb2.append(";alternateGroup=");
        c.u(ze.a.b(K, this, this));
        sb2.append(this.s);
        sb2.append(";volume=");
        c.u(ze.a.b(L, this, this));
        sb2.append(this.w);
        sb2.append(";matrix=");
        sb2.append(this.x);
        sb2.append(";width=");
        c.u(ze.a.b(M, this, this));
        sb2.append(this.y);
        sb2.append(";height=");
        c.u(ze.a.b(N, this, this));
        sb2.append(this.E);
        sb2.append("]");
        return sb2.toString();
    }
}
