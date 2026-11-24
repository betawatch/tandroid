// default package

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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jm6 extends bm6 {
    public static do3 Z;
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

    public jm6(int i, String str, int i2, boolean z, int i3, int i4) {
        this.Q = -1;
        this.B = 0;
        this.C = i;
        this.D = 0L;
        this.I = str;
        this.F = i3;
        this.G = i4;
        this.H = 0L;
        if (z) {
            this.E = i2;
        } else {
            this.J = i2;
        }
        this.b = z;
    }

    @Override // bm6
    public final String a() {
        return this.I;
    }

    @Override // bm6
    public final boolean d() {
        if (this.V) {
            return this.W;
        }
        synchronized (this) {
            if (!this.V) {
                if (!this.b) {
                    l();
                }
                this.V = true;
            }
        }
        return this.W;
    }

    @Override // bm6
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
    public final jm6 clone() {
        jm6 jm6Var = new jm6(this.B, this.C, this.D, this.I, this.J, this.E, this.b, this.F, this.G, this.H);
        jm6Var.K = this.K;
        jm6Var.L = this.L;
        jm6Var.M = this.M;
        jm6Var.N = this.N;
        jm6Var.R = this.R;
        jm6Var.S = this.S;
        jm6Var.T = this.T;
        jm6Var.U = this.U;
        jm6Var.O = this.O;
        jm6Var.g(this);
        return jm6Var;
    }

    public final void g(jm6 jm6Var) {
        this.a = jm6Var.a;
        this.c = jm6Var.c;
        this.h = jm6Var.h;
        this.i = jm6Var.i;
        this.j = jm6Var.j;
        this.k = jm6Var.k;
        this.l = jm6Var.l;
        this.n = jm6Var.n;
        this.o = jm6Var.o;
        this.p = jm6Var.p;
        this.q = jm6Var.q;
        this.r = jm6Var.r;
        this.s = jm6Var.s;
        this.t = jm6Var.t;
        this.u = jm6Var.u;
        this.v = jm6Var.v;
        this.w = jm6Var.w;
        this.m = jm6Var.m;
        this.x = jm6Var.x;
        this.A = jm6Var.A;
        this.g = jm6Var.g;
        this.z = jm6Var.z;
        this.M = jm6Var.M;
        this.N = jm6Var.N;
        this.V = jm6Var.V;
        this.W = jm6Var.W;
        this.m = jm6Var.m;
        this.P = jm6Var.P;
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
        return bool == null ? !gba.e1 : bool.booleanValue();
    }

    public final boolean k(oq7 oq7Var) {
        if (i()) {
            return true;
        }
        if (oq7Var != null) {
            ArrayList arrayList = this.Y;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.Y = arrayList;
            }
            if (!arrayList.contains(oq7Var)) {
                this.Y.add(oq7Var);
            }
        }
        byte b = 0;
        if (!this.X) {
            this.X = true;
            do3 do3Var = Z;
            if (do3Var == null) {
                do3Var = new do3("livePhotoQueue", true);
                Z = do3Var;
            }
            do3Var.postRunnable(new hm6(this, b));
        }
        return false;
    }

    public final void l() {
        jy0 jy0Var;
        hg2 hg2Var;
        String str = this.I;
        long currentTimeMillis = System.currentTimeMillis();
        df7 df7Var = null;
        try {
            jy0Var = jy0.b(new File(str));
        } catch (Exception e) {
            fa4.g(e, true);
            jy0Var = null;
        }
        if (jy0Var != null) {
            long j = jy0Var.a;
            if (j > 0) {
                this.b = true;
                this.W = true;
                this.m = j;
                this.P = jy0Var.b;
            }
        } else {
            try {
                String b = new d54(new File(str)).b("Xmp");
                if (b != null) {
                    try {
                        hg2Var = rdd.a(b);
                    } catch (av7 | NumberFormatException | XmlPullParserException unused) {
                        lad.f("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        hg2Var = null;
                    }
                    if (hg2Var != null) {
                        w59 w59Var = (w59) hg2Var.c;
                        df7 df7Var2 = null;
                        for (int i = 0; i < w59Var.d; i++) {
                            df7 df7Var3 = (df7) w59Var.get(i);
                            String str2 = df7Var3.b;
                            if ("Primary".equalsIgnoreCase(str2)) {
                                df7Var = df7Var3;
                            } else if ("MotionPhoto".equalsIgnoreCase(str2)) {
                                df7Var2 = df7Var3;
                            }
                        }
                        if (df7Var != null && df7Var2 != null && df7Var2.c > 0) {
                            try {
                                long length = new File(str).length() - df7Var2.c;
                                this.b = true;
                                this.W = true;
                                this.m = length;
                                this.P = hg2Var.b;
                            } catch (Exception e2) {
                                fa4.g(e2, true);
                            }
                        }
                    }
                }
            } catch (Exception e3) {
                fa4.g(e3, true);
                this.W = false;
            }
        }
        StringBuilder sb = new StringBuilder("parsed isLivePhoto()=");
        sb.append(this.W);
        sb.append(" in ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        de9.s("ms", sb);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c1  */
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
        Pair N0 = gl.N0(str2);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        Bitmap q = f4b.q(new im6(this, (byte) 0), gl.Y0(true), gl.Y0(true), 0, true);
        if (this.h != null) {
            new File(this.h).delete();
            this.h = null;
        }
        zl6 zl6Var = this.A;
        Object obj = N0.first;
        if (zl6Var == null) {
            if (((Integer) obj).intValue() != 0) {
                Matrix matrix = new Matrix();
                matrix.postRotate(((Integer) N0.first).intValue());
                if (((Integer) N0.second).intValue() == 1) {
                    matrix.postScale(-1.0f, 1.0f);
                } else if (((Integer) N0.second).intValue() == 2) {
                    matrix.postScale(1.0f, -1.0f);
                }
                createBitmap = Bitmap.createBitmap(q, 0, 0, q.getWidth(), q.getHeight(), matrix, true);
                q.recycle();
            }
            str = this.l;
            if (str != null) {
                TLRPC.PhotoSize V = fl5.V(q, compressFormat, gl.Y0(true), gl.Y0(true), 99);
                ba4.G(y6c.t0);
                this.h = ba4.J(V, null, true, true).toString();
            } else {
                if (this.A != null) {
                    Bitmap decodeFile2 = BitmapFactory.decodeFile(str);
                    decodeFile = PhotoViewer.E(decodeFile2, this.A, null, false);
                    decodeFile2.recycle();
                } else {
                    decodeFile = BitmapFactory.decodeFile(str);
                }
                try {
                    Paint paint = new Paint(3);
                    Bitmap createBitmap2 = Bitmap.createBitmap(q.getWidth(), q.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap2);
                    canvas.drawBitmap(q, 0.0f, 0.0f, paint);
                    canvas.scale(q.getWidth() / decodeFile.getWidth(), q.getHeight() / decodeFile.getHeight());
                    canvas.drawBitmap(decodeFile, 0.0f, 0.0f, paint);
                    this.h = PhotoViewer.x0();
                    createBitmap2.compress(compressFormat, 99, new FileOutputStream(this.h));
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                if (decodeFile != null) {
                    decodeFile.recycle();
                }
            }
            if (q == null) {
                q.recycle();
                return;
            }
            return;
        }
        createBitmap = PhotoViewer.E(q, zl6Var, new int[]{((Integer) obj).intValue(), ((Integer) N0.second).intValue()}, true);
        q.recycle();
        q = createBitmap;
        str = this.l;
        if (str != null) {
        }
        if (q == null) {
        }
    }

    public final void n(Pair pair) {
        this.J = ((Integer) pair.first).intValue();
        this.K = ((Integer) pair.second).intValue();
    }

    public jm6(int i, int i2, long j, String str, int i3, int i4, boolean z, int i5, int i6, long j2) {
        this.Q = -1;
        this.B = i;
        this.C = i2;
        this.D = j;
        this.I = str;
        this.F = i5;
        this.G = i6;
        this.H = j2;
        this.E = i4;
        this.J = i3;
        this.b = z;
    }
}
