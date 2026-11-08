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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class gf extends ze {
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

    public gf(int i7, int i10, long j3, String str, int i11, int i12, boolean z9, int i13, int i14, long j10) {
        this.Q = -1;
        this.B = i7;
        this.C = i10;
        this.D = j3;
        this.I = str;
        this.F = i13;
        this.G = i14;
        this.H = j10;
        this.E = i12;
        this.J = i11;
        this.b = z9;
    }

    @Override // org.telegram.messenger.ze
    public final String a() {
        return this.I;
    }

    @Override // org.telegram.messenger.ze
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

    @Override // org.telegram.messenger.ze
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
    public final gf clone() {
        gf gfVar = new gf(this.B, this.C, this.D, this.I, this.J, this.E, this.b, this.F, this.G, this.H);
        gfVar.K = this.K;
        gfVar.L = this.L;
        gfVar.M = this.M;
        gfVar.N = this.N;
        gfVar.R = this.R;
        gfVar.S = this.S;
        gfVar.T = this.T;
        gfVar.U = this.U;
        gfVar.O = this.O;
        gfVar.g(this);
        return gfVar;
    }

    public final void g(gf gfVar) {
        this.a = gfVar.a;
        this.c = gfVar.c;
        this.h = gfVar.h;
        this.i = gfVar.i;
        this.j = gfVar.j;
        this.k = gfVar.k;
        this.l = gfVar.l;
        this.n = gfVar.n;
        this.o = gfVar.o;
        this.p = gfVar.p;
        this.q = gfVar.q;
        this.r = gfVar.r;
        this.s = gfVar.s;
        this.t = gfVar.t;
        this.u = gfVar.u;
        this.v = gfVar.v;
        this.w = gfVar.w;
        this.m = gfVar.m;
        this.x = gfVar.x;
        this.A = gfVar.A;
        this.g = gfVar.g;
        this.z = gfVar.z;
        this.M = gfVar.M;
        this.N = gfVar.N;
        this.V = gfVar.V;
        this.W = gfVar.W;
        this.m = gfVar.m;
        this.P = gfVar.P;
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
        return bool == null ? !iz.i1 : bool.booleanValue();
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
        Z.postRunnable(new ff(this, 0));
        return false;
    }

    public final void l() {
        d3.x xVar;
        a8.ua uaVar;
        String str = this.I;
        long currentTimeMillis = System.currentTimeMillis();
        n3.c cVar = null;
        try {
            xVar = d3.x.b(new File(str));
        } catch (Exception e10) {
            a8.g(e10, true);
            xVar = null;
        }
        if (xVar != null) {
            long j3 = xVar.a;
            if (j3 > 0) {
                this.b = true;
                this.W = true;
                this.m = j3;
                this.P = xVar.b;
            }
        } else {
            try {
                String b10 = new u1.g(new File(str)).b("Xmp");
                if (b10 != null) {
                    try {
                        uaVar = n3.d.a(b10);
                    } catch (e2.t0 | NumberFormatException | XmlPullParserException unused) {
                        h2.a.l("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        uaVar = null;
                    }
                    if (uaVar != null) {
                        h9.t1 t1Var = (h9.t1) uaVar.c;
                        n3.c cVar2 = null;
                        for (int i7 = 0; i7 < t1Var.d; i7++) {
                            n3.c cVar3 = (n3.c) t1Var.get(i7);
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
                                this.P = uaVar.b;
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
        org.telegram.ui.Cells.f1.u("ms", sb2);
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
        Bitmap q10 = fi.e7.q(new j1(this, 11), g0.Z0(true), g0.Z0(true), 0, true);
        if (this.h != null) {
            new File(this.h).delete();
            this.h = null;
        }
        ye yeVar = this.A;
        if (yeVar == null) {
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
                TLRPC.PhotoSize a02 = gc.a0(q10, compressFormat, g0.Z0(true), g0.Z0(true), 99);
                w7.G(p10.s0);
                this.h = w7.J(a02, null, true, true).toString();
            } else {
                if (this.A != null) {
                    Bitmap decodeFile2 = BitmapFactory.decodeFile(str);
                    decodeFile = PhotoViewer.C0(decodeFile2, this.A, null, false);
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
                    this.h = PhotoViewer.v1();
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
        createBitmap = PhotoViewer.C0(q10, yeVar, new int[]{((Integer) N0.first).intValue(), ((Integer) N0.second).intValue()}, true);
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

    public gf(int i7, String str, int i10, boolean z9, int i11, int i12) {
        this.Q = -1;
        this.B = 0;
        this.C = i7;
        this.D = 0L;
        this.I = str;
        this.F = i11;
        this.G = i12;
        this.H = 0L;
        if (z9) {
            this.E = i10;
        } else {
            this.J = i10;
        }
        this.b = z9;
    }
}
