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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class no6 extends go6 {
    public static uo3 Z;
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

    public no6(int i, String str, int i2, boolean z, int i3, int i4) {
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

    @Override // go6
    public final String a() {
        return this.I;
    }

    @Override // go6
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

    @Override // go6
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
    public final no6 clone() {
        no6 no6Var = new no6(this.B, this.C, this.D, this.I, this.J, this.E, this.b, this.F, this.G, this.H);
        no6Var.K = this.K;
        no6Var.L = this.L;
        no6Var.M = this.M;
        no6Var.N = this.N;
        no6Var.R = this.R;
        no6Var.S = this.S;
        no6Var.T = this.T;
        no6Var.U = this.U;
        no6Var.O = this.O;
        no6Var.g(this);
        return no6Var;
    }

    public final void g(no6 no6Var) {
        this.a = no6Var.a;
        this.c = no6Var.c;
        this.h = no6Var.h;
        this.i = no6Var.i;
        this.j = no6Var.j;
        this.k = no6Var.k;
        this.l = no6Var.l;
        this.n = no6Var.n;
        this.o = no6Var.o;
        this.p = no6Var.p;
        this.q = no6Var.q;
        this.r = no6Var.r;
        this.s = no6Var.s;
        this.t = no6Var.t;
        this.u = no6Var.u;
        this.v = no6Var.v;
        this.w = no6Var.w;
        this.m = no6Var.m;
        this.x = no6Var.x;
        this.A = no6Var.A;
        this.g = no6Var.g;
        this.z = no6Var.z;
        this.M = no6Var.M;
        this.N = no6Var.N;
        this.V = no6Var.V;
        this.W = no6Var.W;
        this.m = no6Var.m;
        this.P = no6Var.P;
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
        return bool == null ? !xea.e1 : bool.booleanValue();
    }

    public final boolean k(x38 x38Var) {
        if (i()) {
            return true;
        }
        if (x38Var != null) {
            ArrayList arrayList = this.Y;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.Y = arrayList;
            }
            if (!arrayList.contains(x38Var)) {
                this.Y.add(x38Var);
            }
        }
        byte b = 0;
        if (!this.X) {
            this.X = true;
            uo3 uo3Var = Z;
            if (uo3Var == null) {
                uo3Var = new uo3("livePhotoQueue", true);
                Z = uo3Var;
            }
            uo3Var.postRunnable(new mo6(this, b));
        }
        return false;
    }

    public final void l() {
        ry0 ry0Var;
        zg2 zg2Var;
        String str = this.I;
        long currentTimeMillis = System.currentTimeMillis();
        nh7 nh7Var = null;
        try {
            ry0Var = ry0.b(new File(str));
        } catch (Exception e) {
            cc4.g(e, true);
            ry0Var = null;
        }
        if (ry0Var != null) {
            long j = ry0Var.a;
            if (j > 0) {
                this.b = true;
                this.W = true;
                this.m = j;
                this.P = ry0Var.b;
            }
        } else {
            try {
                String b = new y54(new File(str)).b("Xmp");
                if (b != null) {
                    try {
                        zg2Var = jid.a(b);
                    } catch (hy7 | NumberFormatException | XmlPullParserException unused) {
                        efd.f("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        zg2Var = null;
                    }
                    if (zg2Var != null) {
                        j99 j99Var = (j99) zg2Var.c;
                        nh7 nh7Var2 = null;
                        for (int i = 0; i < j99Var.d; i++) {
                            nh7 nh7Var3 = (nh7) j99Var.get(i);
                            String str2 = nh7Var3.b;
                            if ("Primary".equalsIgnoreCase(str2)) {
                                nh7Var = nh7Var3;
                            } else if ("MotionPhoto".equalsIgnoreCase(str2)) {
                                nh7Var2 = nh7Var3;
                            }
                        }
                        if (nh7Var != null && nh7Var2 != null && nh7Var2.c > 0) {
                            try {
                                long length = new File(str).length() - nh7Var2.c;
                                this.b = true;
                                this.W = true;
                                this.m = length;
                                this.P = zg2Var.b;
                            } catch (Exception e2) {
                                cc4.g(e2, true);
                            }
                        }
                    }
                }
            } catch (Exception e3) {
                cc4.g(e3, true);
                this.W = false;
            }
        }
        StringBuilder sb = new StringBuilder("parsed isLivePhoto()=");
        sb.append(this.W);
        sb.append(" in ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        uh9.s("ms", sb);
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
        Pair N0 = hl.N0(str2);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        Bitmap q = c8b.q(new bm6(this, (byte) 2), hl.Y0(true), hl.Y0(true), 0, true);
        if (this.h != null) {
            new File(this.h).delete();
            this.h = null;
        }
        fo6 fo6Var = this.A;
        Object obj = N0.first;
        if (fo6Var == null) {
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
                TLRPC.PhotoSize V = in5.V(q, compressFormat, hl.Y0(true), hl.Y0(true), 99);
                xb4.G(yac.t0);
                this.h = xb4.J(V, null, true, true).toString();
            } else {
                if (this.A != null) {
                    Bitmap decodeFile2 = BitmapFactory.decodeFile(str);
                    decodeFile = PhotoViewer.D(decodeFile2, this.A, null, false);
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
                    cc4.g(e, true);
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
        createBitmap = PhotoViewer.D(q, fo6Var, new int[]{((Integer) obj).intValue(), ((Integer) N0.second).intValue()}, true);
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

    public no6(int i, int i2, long j, String str, int i3, int i4, boolean z, int i5, int i6, long j2) {
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
