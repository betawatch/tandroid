package i5;

import c8.jb;
import java.nio.ByteBuffer;
import java.util.Date;
import y7.i6;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class y extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ i6 E;
    public static final /* synthetic */ i6 F;
    public static final /* synthetic */ i6 G;
    public static final /* synthetic */ i6 H;
    public static final /* synthetic */ i6 I;
    public static final /* synthetic */ i6 J;
    public static final /* synthetic */ i6 K;
    public static final /* synthetic */ i6 L;
    public static final /* synthetic */ i6 M;
    public static final /* synthetic */ i6 N;
    public static final /* synthetic */ i6 O;
    public static final /* synthetic */ i6 P;
    public static final /* synthetic */ i6 Q;
    public static final /* synthetic */ i6 R;
    public static final /* synthetic */ i6 S;
    public static final /* synthetic */ i6 T;
    public static final /* synthetic */ i6 U;
    public static final /* synthetic */ i6 V;
    public static final /* synthetic */ i6 W;
    public static final /* synthetic */ i6 X;
    public static final /* synthetic */ i6 Y;
    public static final /* synthetic */ i6 Z;
    public static final /* synthetic */ i6 a0;
    public static final /* synthetic */ i6 b0;
    public double D;
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
        ze.a aVar = new ze.a(y.class, "TrackHeaderBox.java");
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
            this.e = jb.b(h5.b.j(byteBuffer));
            this.f = jb.b(h5.b.j(byteBuffer));
            this.h = h5.b.i(byteBuffer);
            h5.b.i(byteBuffer);
            long j3 = byteBuffer.getLong();
            this.n = j3;
            if (j3 < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else {
            this.e = jb.b(h5.b.i(byteBuffer));
            this.f = jb.b(h5.b.i(byteBuffer));
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
        this.D = h5.b.f(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        ui.e c10 = ze.a.c(N, this, this, byteBuffer);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c10);
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(jb.a(this.e));
            byteBuffer.putLong(jb.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putLong(this.n);
        } else {
            byteBuffer.putInt((int) jb.a(this.e));
            byteBuffer.putInt((int) jb.a(this.f));
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
        h5.b.n(byteBuffer, this.D);
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (e() == 1 ? 36L : 24L) + 60;
    }

    public final String toString() {
        ui.e b10 = ze.a.b(O, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("TrackHeaderBox[creationTime=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(E, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(F, this, this));
        sb2.append(this.f);
        sb2.append(";trackId=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(G, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(H, this, this));
        sb2.append(this.n);
        sb2.append(";layer=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(I, this, this));
        sb2.append(this.r);
        sb2.append(";alternateGroup=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(J, this, this));
        sb2.append(this.s);
        sb2.append(";volume=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(K, this, this));
        sb2.append(this.w);
        sb2.append(";matrix=");
        sb2.append(this.x);
        sb2.append(";width=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(L, this, this));
        sb2.append(this.y);
        sb2.append(";height=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(M, this, this));
        sb2.append(this.D);
        sb2.append("]");
        return sb2.toString();
    }
}
