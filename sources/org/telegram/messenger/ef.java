package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.Pair;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ef extends ze {
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
    public boolean V;
    public boolean W;

    public ef(int i10, int i11, long j10, String str, int i12, int i13, boolean z10, int i14, int i15, long j11) {
        this.Q = -1;
        this.B = i10;
        this.C = i11;
        this.D = j10;
        this.I = str;
        this.F = i14;
        this.G = i15;
        this.H = j11;
        this.E = i13;
        this.J = i12;
        this.b = z10;
    }

    @Override // org.telegram.messenger.ze
    public final String a() {
        return this.I;
    }

    @Override // org.telegram.messenger.ze
    public final boolean d() {
        c3.g0 g0Var;
        String str = this.I;
        if (this.b || this.V) {
            return this.W;
        }
        this.V = true;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            String b10 = new r1.g(new File(str)).b("Xmp");
            if (b10 != null) {
                k3.c cVar = null;
                try {
                    g0Var = k3.d.a(b10);
                } catch (b2.w0 | NumberFormatException | XmlPullParserException unused) {
                    e2.a.l("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                    g0Var = null;
                }
                if (g0Var != null) {
                    e9.x1 x1Var = (e9.x1) g0Var.c;
                    k3.c cVar2 = null;
                    for (int i10 = 0; i10 < x1Var.d; i10++) {
                        k3.c cVar3 = (k3.c) x1Var.get(i10);
                        String str2 = cVar3.b;
                        if ("Primary".equalsIgnoreCase(str2)) {
                            cVar = cVar3;
                        } else if ("MotionPhoto".equalsIgnoreCase(str2)) {
                            cVar2 = cVar3;
                        }
                    }
                    if (cVar != null && cVar2 != null) {
                        long j10 = cVar2.c;
                        if (j10 > 0) {
                            try {
                                long length = new File(str).length() - j10;
                                this.b = true;
                                this.W = true;
                                this.m = length;
                                this.P = g0Var.b;
                            } catch (Exception e) {
                                f8.g(e, true);
                            }
                        }
                    }
                }
            }
        } catch (Exception e7) {
            f8.g(e7, true);
            this.W = false;
        }
        StringBuilder sb2 = new StringBuilder("parsed isLivePhoto()=");
        sb2.append(this.W);
        sb2.append(" in ");
        sb2.append(System.currentTimeMillis() - currentTimeMillis);
        a1.g.z("ms", sb2);
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
    public final ef clone() {
        ef efVar = new ef(this.B, this.C, this.D, this.I, this.J, this.E, this.b, this.F, this.G, this.H);
        efVar.K = this.K;
        efVar.L = this.L;
        efVar.M = this.M;
        efVar.N = this.N;
        efVar.R = this.R;
        efVar.S = this.S;
        efVar.T = this.T;
        efVar.U = this.U;
        efVar.O = this.O;
        efVar.g(this);
        return efVar;
    }

    public final void g(ef efVar) {
        this.a = efVar.a;
        this.c = efVar.c;
        this.h = efVar.h;
        this.i = efVar.i;
        this.j = efVar.j;
        this.k = efVar.k;
        this.l = efVar.l;
        this.n = efVar.n;
        this.o = efVar.o;
        this.p = efVar.p;
        this.q = efVar.q;
        this.r = efVar.r;
        this.s = efVar.s;
        this.t = efVar.t;
        this.u = efVar.u;
        this.v = efVar.v;
        this.w = efVar.w;
        this.m = efVar.m;
        this.x = efVar.x;
        this.A = efVar.A;
        this.g = efVar.g;
        this.z = efVar.z;
        this.M = efVar.M;
        this.N = efVar.N;
        this.V = efVar.V;
        this.W = efVar.W;
        this.m = efVar.m;
        this.P = efVar.P;
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
        Boolean bool = this.O;
        return bool == null ? !tz.i1 : bool.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        Bitmap createBitmap;
        String str;
        Bitmap decodeFile;
        String str2 = this.i;
        if (str2 == null) {
            str2 = this.I;
        }
        Pair N0 = i0.N0(str2);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        Bitmap q6 = vh.n5.q(new s1(this, 10), i0.Z0(true), i0.Z0(true), 0, true);
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
                createBitmap = Bitmap.createBitmap(q6, 0, 0, q6.getWidth(), q6.getHeight(), matrix, true);
                q6.recycle();
            }
            str = this.l;
            if (str != null) {
                TLRPC.PhotoSize a02 = hc.a0(q6, compressFormat, i0.Z0(true), i0.Z0(true), 99);
                b8.G(d20.s0);
                this.h = b8.K(a02, null, true, true).toString();
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
                    Bitmap createBitmap2 = Bitmap.createBitmap(q6.getWidth(), q6.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap2);
                    canvas.drawBitmap(q6, 0.0f, 0.0f, paint);
                    canvas.scale(q6.getWidth() / decodeFile.getWidth(), q6.getHeight() / decodeFile.getHeight());
                    canvas.drawBitmap(decodeFile, 0.0f, 0.0f, paint);
                    this.h = PhotoViewer.A1();
                    createBitmap2.compress(compressFormat, 99, new FileOutputStream(this.h));
                } catch (Exception e) {
                    f8.g(e, true);
                }
                if (decodeFile != null) {
                    decodeFile.recycle();
                }
            }
            if (q6 == null) {
                q6.recycle();
                return;
            }
            return;
        }
        createBitmap = PhotoViewer.J0(q6, yeVar, new int[]{((Integer) N0.first).intValue(), ((Integer) N0.second).intValue()}, true);
        q6.recycle();
        q6 = createBitmap;
        str = this.l;
        if (str != null) {
        }
        if (q6 == null) {
        }
    }

    public final void k(Pair pair) {
        this.J = ((Integer) pair.first).intValue();
        this.K = ((Integer) pair.second).intValue();
    }

    public ef(int i10, String str, int i11, boolean z10, int i12, int i13) {
        this.Q = -1;
        this.B = 0;
        this.C = i10;
        this.D = 0L;
        this.I = str;
        this.F = i12;
        this.G = i13;
        this.H = 0L;
        if (z10) {
            this.E = i11;
        } else {
            this.J = i11;
        }
        this.b = z10;
    }
}
