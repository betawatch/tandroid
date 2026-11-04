package h5;

import b8.fe;
import java.nio.ByteBuffer;
import java.util.Date;
import org.telegram.ui.Components.i9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ i9 F;
    public static final /* synthetic */ i9 G;
    public static final /* synthetic */ i9 H;
    public static final /* synthetic */ i9 I;
    public static final /* synthetic */ i9 J;
    public static final /* synthetic */ i9 K;
    public static final /* synthetic */ i9 L;
    public static final /* synthetic */ i9 M;
    public static final /* synthetic */ i9 N;
    public static final /* synthetic */ i9 O;
    public static final /* synthetic */ i9 P;
    public static final /* synthetic */ i9 Q;
    public static final /* synthetic */ i9 R;
    public static final /* synthetic */ i9 S;
    public static final /* synthetic */ i9 T;
    public static final /* synthetic */ i9 U;
    public static final /* synthetic */ i9 V;
    public static final /* synthetic */ i9 W;
    public static final /* synthetic */ i9 X;
    public static final /* synthetic */ i9 Y;
    public static final /* synthetic */ i9 Z;
    public static final /* synthetic */ i9 a0;
    public static final /* synthetic */ i9 b0;
    public static final /* synthetic */ i9 c0;
    public double E;
    public Date e;
    public Date f;
    public long h;
    public long n;
    public int r;
    public int s;
    public float w;
    public mc.d x;
    public double y;

    static {
        we.a aVar = new we.a(y.class, "TrackHeaderBox.java");
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
            this.e = fe.b(g5.b.j(byteBuffer));
            this.f = fe.b(g5.b.j(byteBuffer));
            this.h = g5.b.i(byteBuffer);
            g5.b.i(byteBuffer);
            long j10 = byteBuffer.getLong();
            this.n = j10;
            if (j10 < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else {
            this.e = fe.b(g5.b.i(byteBuffer));
            this.f = fe.b(g5.b.i(byteBuffer));
            this.h = g5.b.i(byteBuffer);
            g5.b.i(byteBuffer);
            this.n = g5.b.i(byteBuffer);
        }
        g5.b.i(byteBuffer);
        g5.b.i(byteBuffer);
        this.r = g5.b.h(byteBuffer);
        this.s = g5.b.h(byteBuffer);
        this.w = g5.b.g(byteBuffer);
        g5.b.h(byteBuffer);
        this.x = mc.d.a(byteBuffer);
        this.y = g5.b.f(byteBuffer);
        this.E = g5.b.f(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        ui.f c2 = we.a.c(O, this, this, byteBuffer);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c2);
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(fe.a(this.e));
            byteBuffer.putLong(fe.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putLong(this.n);
        } else {
            byteBuffer.putInt((int) fe.a(this.e));
            byteBuffer.putInt((int) fe.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putInt((int) this.n);
        }
        int i3 = (int) 0;
        byteBuffer.putInt(i3);
        byteBuffer.putInt(i3);
        g5.b.p(this.r, byteBuffer);
        g5.b.p(this.s, byteBuffer);
        g5.b.o(byteBuffer, this.w);
        g5.b.p(0, byteBuffer);
        this.x.b(byteBuffer);
        g5.b.n(byteBuffer, this.y);
        g5.b.n(byteBuffer, this.E);
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (e() == 1 ? 36L : 24L) + 60;
    }

    public final String toString() {
        ui.f b10 = we.a.b(P, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("TrackHeaderBox[creationTime=");
        com.google.android.recaptcha.internal.a.t(we.a.b(F, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        com.google.android.recaptcha.internal.a.t(we.a.b(G, this, this));
        sb2.append(this.f);
        sb2.append(";trackId=");
        com.google.android.recaptcha.internal.a.t(we.a.b(H, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        com.google.android.recaptcha.internal.a.t(we.a.b(I, this, this));
        sb2.append(this.n);
        sb2.append(";layer=");
        com.google.android.recaptcha.internal.a.t(we.a.b(J, this, this));
        sb2.append(this.r);
        sb2.append(";alternateGroup=");
        com.google.android.recaptcha.internal.a.t(we.a.b(K, this, this));
        sb2.append(this.s);
        sb2.append(";volume=");
        com.google.android.recaptcha.internal.a.t(we.a.b(L, this, this));
        sb2.append(this.w);
        sb2.append(";matrix=");
        sb2.append(this.x);
        sb2.append(";width=");
        com.google.android.recaptcha.internal.a.t(we.a.b(M, this, this));
        sb2.append(this.y);
        sb2.append(";height=");
        com.google.android.recaptcha.internal.a.t(we.a.b(N, this, this));
        sb2.append(this.E);
        sb2.append("]");
        return sb2.toString();
    }
}
