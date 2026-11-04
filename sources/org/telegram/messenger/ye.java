package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.Pair;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class ye extends se {
    public static q5 Z;
    public final int B;
    public final int C;
    public final long D;
    public int E;
    public final int F;
    public final int G;
    public final long H;
    public final String I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public long N;
    public Boolean O;
    public long P;
    public int Q;
    public boolean R;
    public TLRPC.VideoSize S;
    public int T;
    public int U;
    public volatile boolean V;
    public boolean W;
    public boolean X;
    public ArrayList Y;

    public ye(int i3, int i10, long j10, String str, int i11, int i12, boolean z10, int i13, int i14, long j11) {
        this.Q = -1;
        this.B = i3;
        this.C = i10;
        this.D = j10;
        this.I = str;
        this.F = i13;
        this.G = i14;
        this.H = j11;
        this.E = i12;
        this.J = i11;
        this.b = z10;
    }

    @Override // org.telegram.messenger.se
    public final String a() {
        return this.I;
    }

    @Override // org.telegram.messenger.se
    public final boolean d() {
        if (this.V) {
            return this.W;
        }
        synchronized (this) {
            try {
                if (!this.V) {
                    if (!this.b) {
                        l();
                    }
                    this.V = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.W;
    }

    @Override // org.telegram.messenger.se
    public final void e() {
        if (this.b && this.i != null) {
            new File(this.i).delete();
            this.i = null;
        }
        this.M = false;
        this.N = 0L;
        super.e();
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final ye clone() {
        ye yeVar = new ye(this.B, this.C, this.D, this.I, this.J, this.E, this.b, this.F, this.G, this.H);
        yeVar.K = this.K;
        yeVar.L = this.L;
        yeVar.M = this.M;
        yeVar.N = this.N;
        yeVar.R = this.R;
        yeVar.S = this.S;
        yeVar.T = this.T;
        yeVar.U = this.U;
        yeVar.O = this.O;
        yeVar.g(this);
        return yeVar;
    }

    public final void g(ye yeVar) {
        this.a = yeVar.a;
        this.c = yeVar.c;
        this.h = yeVar.h;
        this.i = yeVar.i;
        this.j = yeVar.j;
        this.k = yeVar.k;
        this.l = yeVar.l;
        this.n = yeVar.n;
        this.o = yeVar.o;
        this.p = yeVar.p;
        this.q = yeVar.q;
        this.r = yeVar.r;
        this.s = yeVar.s;
        this.t = yeVar.t;
        this.u = yeVar.u;
        this.v = yeVar.v;
        this.w = yeVar.w;
        this.m = yeVar.m;
        this.x = yeVar.x;
        this.A = yeVar.A;
        this.g = yeVar.g;
        this.z = yeVar.z;
        this.M = yeVar.M;
        this.N = yeVar.N;
        this.V = yeVar.V;
        this.W = yeVar.W;
        this.m = yeVar.m;
        this.P = yeVar.P;
    }

    public final void h() {
        String str = this.I;
        if (str != null) {
            try {
                new File(str).delete();
            } catch (Exception unused) {
            }
        }
        if (this.l != null) {
            try {
                new File(this.l).delete();
            } catch (Exception unused2) {
            }
        }
        if (this.j != null) {
            try {
                new File(this.j).delete();
            } catch (Exception unused3) {
            }
        }
        if (this.h != null) {
            try {
                new File(this.h).delete();
            } catch (Exception unused4) {
            }
        }
        if (this.i != null) {
            try {
                new File(this.i).delete();
            } catch (Exception unused5) {
            }
        }
        if (this.k != null) {
            try {
                new File(this.k).delete();
            } catch (Exception unused6) {
            }
        }
    }

    public final boolean i() {
        if (this.V) {
            return true;
        }
        return this.b && !this.X;
    }

    public final boolean j() {
        Boolean bool = this.O;
        return bool == null ? !az.i1 : bool.booleanValue();
    }

    public final boolean k(org.telegram.ui.Cells.f fVar) {
        if (i()) {
            return true;
        }
        if (fVar != null) {
            if (this.Y == null) {
                this.Y = new ArrayList();
            }
            if (!this.Y.contains(fVar)) {
                this.Y.add(fVar);
            }
        }
        if (this.X) {
            return false;
        }
        this.X = true;
        if (Z == null) {
            Z = new q5("livePhotoQueue", true);
        }
        Z.postRunnable(new xe(this, 0));
        return false;
    }

    public final void l() {
        c3.x xVar;
        b8.ig igVar;
        String str = this.I;
        long currentTimeMillis = System.currentTimeMillis();
        m3.c cVar = null;
        try {
            xVar = c3.x.b(new File(str));
        } catch (Exception e10) {
            a8.g(e10, true);
            xVar = null;
        }
        if (xVar != null) {
            long j10 = xVar.a;
            if (j10 > 0) {
                this.b = true;
                this.W = true;
                this.m = j10;
                this.P = xVar.b;
            }
        } else {
            try {
                String b10 = new t1.g(new File(str)).b("Xmp");
                if (b10 != null) {
                    try {
                        igVar = m3.d.a(b10);
                    } catch (d2.v0 | NumberFormatException | XmlPullParserException unused) {
                        g2.a.l("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        igVar = null;
                    }
                    if (igVar != null) {
                        g9.s1 s1Var = (g9.s1) igVar.c;
                        m3.c cVar2 = null;
                        for (int i3 = 0; i3 < s1Var.d; i3++) {
                            m3.c cVar3 = (m3.c) s1Var.get(i3);
                            String str2 = cVar3.b;
                            if ("Primary".equalsIgnoreCase(str2)) {
                                cVar = cVar3;
                            } else if ("MotionPhoto".equalsIgnoreCase(str2)) {
                                cVar2 = cVar3;
                            }
                        }
                        if (cVar != null && cVar2 != null && cVar2.c > 0) {
                            try {
                                long length = new File(str).length() - cVar2.c;
                                this.b = true;
                                this.W = true;
                                this.m = length;
                                this.P = igVar.b;
                            } catch (Exception e11) {
                                a8.g(e11, true);
                            }
                        }
                    }
                }
            } catch (Exception e12) {
                a8.g(e12, true);
                this.W = false;
            }
        }
        StringBuilder sb2 = new StringBuilder("parsed isLivePhoto()=");
        sb2.append(this.W);
        sb2.append(" in ");
        sb2.append(System.currentTimeMillis() - currentTimeMillis);
        k2.p1.w("ms", sb2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        Bitmap createBitmap;
        String str;
        Bitmap decodeFile;
        String str2 = this.i;
        if (str2 == null) {
            str2 = this.I;
        }
        Pair N0 = g0.N0(str2);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        Bitmap q10 = gi.f7.q(new p1(this, 10), g0.Z0(true), g0.Z0(true), 0, true);
        if (this.h != null) {
            new File(this.h).delete();
            this.h = null;
        }
        re reVar = this.A;
        if (reVar == null) {
            if (((Integer) N0.first).intValue() != 0) {
                Matrix matrix = new Matrix();
                matrix.postRotate(((Integer) N0.first).intValue());
                if (((Integer) N0.second).intValue() == 1) {
                    matrix.postScale(-1.0f, 1.0f);
                } else if (((Integer) N0.second).intValue() == 2) {
                    matrix.postScale(1.0f, -1.0f);
                }
                createBitmap = Bitmap.createBitmap(q10, 0, 0, q10.getWidth(), q10.getHeight(), matrix, true);
                q10.recycle();
            }
            str = this.l;
            if (str != null) {
                TLRPC.PhotoSize a02 = zb.a0(q10, compressFormat, g0.Z0(true), g0.Z0(true), 99);
                w7.G(h10.t0);
                this.h = w7.K(a02, null, true, true).toString();
            } else {
                if (this.A != null) {
                    Bitmap decodeFile2 = BitmapFactory.decodeFile(str);
                    decodeFile = PhotoViewer.J0(decodeFile2, this.A, null, false);
                    decodeFile2.recycle();
                } else {
                    decodeFile = BitmapFactory.decodeFile(str);
                }
                try {
                    Paint paint = new Paint(3);
                    Bitmap createBitmap2 = Bitmap.createBitmap(q10.getWidth(), q10.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap2);
                    canvas.drawBitmap(q10, 0.0f, 0.0f, paint);
                    canvas.scale(q10.getWidth() / decodeFile.getWidth(), q10.getHeight() / decodeFile.getHeight());
                    canvas.drawBitmap(decodeFile, 0.0f, 0.0f, paint);
                    this.h = PhotoViewer.A1();
                    createBitmap2.compress(compressFormat, 99, new FileOutputStream(this.h));
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                if (decodeFile != null) {
                    decodeFile.recycle();
                }
            }
            if (q10 == null) {
                q10.recycle();
                return;
            }
            return;
        }
        createBitmap = PhotoViewer.J0(q10, reVar, new int[]{((Integer) N0.first).intValue(), ((Integer) N0.second).intValue()}, true);
        q10.recycle();
        q10 = createBitmap;
        str = this.l;
        if (str != null) {
        }
        if (q10 == null) {
        }
    }

    public final void n(Pair pair) {
        this.J = ((Integer) pair.first).intValue();
        this.K = ((Integer) pair.second).intValue();
    }

    public ye(int i3, String str, int i10, boolean z10, int i11, int i12) {
        this.Q = -1;
        this.B = 0;
        this.C = i3;
        this.D = 0L;
        this.I = str;
        this.F = i11;
        this.G = i12;
        this.H = 0L;
        if (z10) {
            this.E = i10;
        } else {
            this.J = i10;
        }
        this.b = z10;
    }
}
