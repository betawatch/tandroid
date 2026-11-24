package org.telegram.messenger;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class ImageReceiver implements gk7, dm {
    public static final PorterDuffColorFilter H1;
    public static final PorterDuffColorFilter I1;
    public static final float[] J1;
    public boolean A0;
    public boolean B0;
    public boolean B1;
    public boolean C0;
    public Drawable D0;
    public int D1;
    public int E;
    public String E0;
    public wtc E1;
    public nl5 F;
    public BitmapShader F0;
    public yr8 F1;
    public Object G;
    public boolean G0;
    public boolean G1;
    public Bitmap H;
    public boolean H0;
    public BitmapShader I;
    public TLRPC.Document I0;
    public ComposeShader J;
    public boolean J0;
    public Bitmap K;
    public boolean K0;
    public BitmapShader L;
    public float L0;
    public Canvas M;
    public float M0;
    public Paint N;
    public float N0;
    public gl5 O;
    public float O0;
    public gl5 P;
    public float P0;
    public String Q;
    public String R;
    public int S;
    public boolean S0;
    public Drawable T;
    public boolean T0;
    public BitmapShader U;
    public boolean U0;
    public int V;
    public boolean V0;
    public int W;
    public gl5 X;
    public String Y;
    public String Z;
    public Integer Z0;
    public List a;
    public int a0;
    public boolean b;
    public Drawable b0;
    public ArrayList c;
    public BitmapShader c0;
    public BitmapShader d0;
    public View e;
    public int e0;
    public int f;
    public int f0;
    public int f1;
    public gl5 g0;
    public boolean g1;
    public Object h;
    public String h0;
    public ll5 h1;
    public String i0;
    public float i1;
    public int j0;
    public Drawable k0;
    public long k1;
    public BitmapShader l0;
    public boolean m1;
    public boolean n;
    public Drawable n0;
    public boolean n1;
    public String o0;
    public boolean p0;
    public ColorFilter p1;
    public int q0;
    public boolean q1;
    public boolean r;
    public long r0;
    public long r1;
    public long s;
    public int s0;
    public long s1;
    public float u1;
    public int v1;
    public boolean w0;
    public String w1;
    public int x;
    public boolean x0;
    public boolean y;
    public boolean y1;
    public boolean z1;
    public byte w = 1;
    public boolean m0 = true;
    public boolean t0 = true;
    public boolean u0 = true;
    public boolean v0 = true;
    public byte y0 = 1;
    public int z0 = -1;
    public final RectF Q0 = new RectF();
    public boolean R0 = true;
    public boolean W0 = true;
    public final int[] X0 = new int[4];
    public boolean Y0 = true;
    public final RectF b1 = new RectF();
    public final Matrix c1 = new Matrix();
    public final Path d1 = new Path();
    public float e1 = 1.0f;
    public float j1 = 1.0f;
    public byte l1 = 1;
    public float o1 = 0.05f;
    public short t1 = 150;
    public final ArrayList x1 = new ArrayList();
    public boolean A1 = false;
    public boolean C1 = true;
    public final Paint a1 = new Paint(3);
    public int d = y6c.t0;

    static {
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        H1 = new PorterDuffColorFilter(-2236963, mode);
        I1 = new PorterDuffColorFilter(-4473925, mode);
        J1 = new float[8];
    }

    public ImageReceiver(View view) {
        this.e = view;
    }

    public final int A(int i) {
        return i == 1 ? this.a0 : i == 3 ? this.j0 : this.S;
    }

    public final boolean B() {
        return (this.T == null && this.b0 == null && this.n0 == null && this.k0 == null) ? false : true;
    }

    public final boolean C() {
        return (this.T == null && this.k0 == null) ? false : true;
    }

    public final boolean D() {
        return (this.T == null && this.k0 == null && this.b0 == null && this.n0 == null && this.R == null && this.i0 == null) ? false : true;
    }

    public final boolean E() {
        return (this.T == null && this.k0 == null && !(this.n0 instanceof i9c)) ? false : true;
    }

    public final boolean F() {
        km m = m();
        return m != null && m.c0;
    }

    public final boolean G() {
        return (!this.B0 || this.D0 == null || this.C0) ? false : true;
    }

    public final boolean H(float f, float f2) {
        float f3 = this.L0;
        if (f < f3 || f > f3 + this.N0) {
            return false;
        }
        float f4 = this.M0;
        return f2 >= f4 && f2 <= f4 + this.O0;
    }

    public final boolean I() {
        if (!this.y1) {
            this.y1 = true;
            this.E = kk7.e().p & (~this.x);
            boolean z = this.y;
            int i = kk7.i1;
            if (!z) {
                wtc wtcVar = this.E1;
                if (wtcVar != null) {
                    wtcVar.a();
                    this.E1 = null;
                }
                wtc wtcVar2 = (wtc) new fu0(kk7.e(), this).b;
                wtcVar2.b(kk7.o4);
                wtcVar2.b(i);
                wtcVar2.b(kk7.j1);
                this.E1 = wtcVar2;
            }
            if (O()) {
                return true;
            }
            oy8 y = y();
            if (y != null) {
                y.J0.add(this);
                y.F = this.t0;
                if (this.v0 && (!y.u() || this.E == 0)) {
                    y.start();
                }
            }
            km m = m();
            if (m != null) {
                m.e(this);
                if (this.u0 && this.E == 0) {
                    m.j();
                    invalidate();
                }
            }
            vl l = l();
            if (l != null) {
                l.a(this);
            }
            if (kk7.e().g()) {
                didReceivedNotification(i, this.d, 512);
            }
            Object obj = this.n0;
            if (obj instanceof yx) {
                ((yx) obj).c(this);
            }
            if (this.c != null) {
                for (int i2 = 0; i2 < this.c.size(); i2++) {
                    ((kl5) this.c.get(i2)).a(this);
                }
            }
        }
        return false;
    }

    public final void J(Drawable drawable) {
        if (drawable == this.k0 && this.i0 != null) {
            fl5.z().M(this.i0);
            this.i0 = null;
        } else if (drawable == this.T && this.R != null) {
            fl5.z().M(this.R);
            this.R = null;
        } else if (drawable == this.b0 && this.Z != null) {
            fl5.z().M(this.Z);
            this.Z = null;
        }
        Y(this.g0, this.h0, this.P, this.Q, this.X, this.Y, this.b0, this.r0, this.o0, this.h, this.s0);
    }

    public final void K() {
        wtc wtcVar;
        if (this.y1) {
            this.y1 = false;
            gl5 gl5Var = this.P;
            if (gl5Var != null || this.g0 != null || this.X != null || this.n0 != null) {
                nl5 nl5Var = this.F;
                if (nl5Var == null) {
                    nl5Var = new nl5();
                    this.F = nl5Var;
                }
                nl5Var.e = this.g0;
                nl5Var.f = this.h0;
                nl5Var.a = gl5Var;
                nl5Var.b = this.Q;
                nl5Var.c = this.X;
                nl5Var.d = this.Y;
                nl5Var.g = this.n0;
                nl5Var.h = this.r0;
                nl5Var.k = this.o0;
                nl5Var.i = this.s0;
                nl5Var.j = this.h;
            }
            if (!this.y && (wtcVar = this.E1) != null) {
                wtcVar.a();
                this.E1 = null;
            }
            Object obj = this.n0;
            if (obj instanceof yx) {
                ((yx) obj).b(this);
            }
            if (this.n0 != null) {
                u0(null);
                this.d0 = null;
            }
            f();
            this.a1.setShader(null);
            if (this.f1 == 0) {
                this.u1 = 0.0f;
            }
            vl l = l();
            if (l != null) {
                l.n(this);
            }
            km m = m();
            if (m != null) {
                m.v(this);
            }
            oy8 y = y();
            if (y != null) {
                y.A(this);
            }
            if (this.c != null) {
                for (int i = 0; i < this.c.size(); i++) {
                    ArrayList arrayList = ((r8b) ((kl5) this.c.get(i))).a;
                    if (arrayList != null) {
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((n8b) arrayList.get(i2)).b(false);
                        }
                    }
                }
            }
        }
    }

    public final void L(int i, String str) {
        String str2;
        Drawable drawable;
        String str3;
        if (i == 3) {
            str2 = this.i0;
            drawable = this.k0;
        } else if (i == 2) {
            str2 = this.E0;
            drawable = this.D0;
        } else if (i == 1) {
            str2 = this.Z;
            drawable = this.b0;
        } else {
            str2 = this.R;
            drawable = this.T;
        }
        if (str2 != null && ((str2.startsWith("-") || str2.startsWith("strippedmessage-")) && (str3 = (String) fl5.z().t.get(str2)) != null)) {
            str2 = str3;
        }
        if (drawable instanceof oy8) {
            ((oy8) drawable).A(this);
        }
        if (drawable instanceof km) {
            ((km) drawable).v(this);
        }
        if (drawable instanceof vl) {
            ((vl) drawable).n(this);
        }
        if (str2 != null && ((str == null || !str.equals(str2)) && drawable != null)) {
            if (drawable instanceof oy8) {
                oy8 oy8Var = (oy8) drawable;
                boolean l = fl5.z().l(str2);
                if (!fl5.z().F(str2, true) && l) {
                    oy8Var.x(false);
                }
            } else if (drawable instanceof km) {
                km kmVar = (km) drawable;
                if (kmVar.o0) {
                    boolean l2 = fl5.z().l(str2);
                    if (fl5.z().F(str2, true)) {
                        if (l2) {
                            kmVar.stop();
                        }
                    } else if (l2) {
                        kmVar.u();
                    }
                } else if (kmVar.u0.isEmpty()) {
                    kmVar.u();
                }
            } else if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                boolean l3 = fl5.z().l(str2);
                if (!fl5.z().F(str2, false) && l3) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bitmap);
                    gl.x2(arrayList);
                }
            }
        }
        if (i == 3) {
            this.i0 = null;
            this.k0 = null;
            this.l0 = null;
        } else if (i == 2) {
            this.E0 = null;
            this.D0 = null;
            this.F0 = null;
        } else if (i == 1) {
            this.b0 = null;
            this.Z = null;
            this.c0 = null;
        } else {
            this.T = null;
            this.R = null;
            this.U = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M(int i) {
        this.y0 = i;
        oy8 y = y();
        if (y != null) {
            y.F(i);
        }
    }

    public final void N(int i) {
        this.z0 = i;
        if (y() != null) {
            y().M = i;
            return;
        }
        this.D1 = i;
        if (m() != null) {
            m().z0 = 0;
        }
    }

    public final boolean O() {
        nl5 nl5Var = this.F;
        if (nl5Var == null) {
            return false;
        }
        if (nl5Var.a == null && nl5Var.c == null && nl5Var.e == null && nl5Var.g == null) {
            return false;
        }
        this.F = null;
        Drawable drawable = nl5Var.g;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (!(bitmapDrawable instanceof oy8) && !(bitmapDrawable instanceof km) && bitmapDrawable.getBitmap() != null && bitmapDrawable.getBitmap().isRecycled()) {
                nl5Var.g = null;
            }
        }
        Y(nl5Var.e, nl5Var.f, nl5Var.a, nl5Var.b, nl5Var.c, nl5Var.d, nl5Var.g, nl5Var.h, nl5Var.k, nl5Var.j, nl5Var.i);
        nl5Var.a = null;
        nl5Var.c = null;
        nl5Var.e = null;
        nl5Var.g = null;
        this.F = nl5Var;
        oy8 y = y();
        if (y == null) {
            return true;
        }
        y.F = this.t0;
        if (!this.v0) {
            return true;
        }
        if (y.u() && this.E != 0) {
            return true;
        }
        y.start();
        return true;
    }

    public final void P(Object obj) {
        this.G = obj;
        invalidate();
    }

    public final il5 Q(il5 il5Var, int i) {
        oy8 oy8Var;
        if (il5Var == null) {
            il5Var = new il5();
            il5Var.h = new int[4];
            il5Var.y = new RectF();
        }
        il5Var.d = i;
        il5Var.f = m();
        il5Var.g = y();
        boolean z = false;
        for (int i2 = 0; i2 < 4; i2++) {
            il5Var.h[i2] = this.X0[i2];
        }
        il5Var.j = this.k0;
        il5Var.i = this.l0;
        il5Var.l = this.T;
        il5Var.k = this.U;
        il5Var.m = this.b0;
        il5Var.n = this.c0;
        il5Var.e = this.d0;
        il5Var.o = this.n0;
        il5Var.x = this.D0;
        il5Var.z = this.p1;
        il5Var.w = this.C0;
        il5Var.p = this.i1;
        il5Var.q = this.j1;
        il5Var.r = this.F0;
        km kmVar = il5Var.f;
        if ((kmVar != null && !kmVar.s()) || ((oy8Var = il5Var.g) != null && !oy8Var.p())) {
            z = true;
        }
        il5Var.a = z;
        il5Var.u = this.L0;
        il5Var.v = this.M0;
        il5Var.t = this.N0;
        il5Var.s = this.O0;
        il5Var.b = this.e1;
        return il5Var;
    }

    public final void R(Drawable drawable, BitmapShader bitmapShader) {
        if (drawable == this.b0) {
            this.c0 = bitmapShader;
            return;
        }
        if (drawable == this.n0) {
            this.d0 = bitmapShader;
            return;
        }
        if (drawable == this.k0) {
            this.l0 = bitmapShader;
            return;
        }
        if (drawable == this.T) {
            this.U = bitmapShader;
            if (this.I == null || !(drawable instanceof BitmapDrawable)) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                this.J = new ComposeShader(this.I, this.U, PorterDuff.Mode.DST_IN);
                return;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            int width = bitmapDrawable.getBitmap().getWidth();
            int height = bitmapDrawable.getBitmap().getHeight();
            Bitmap bitmap = this.K;
            if (bitmap != null && bitmap.getWidth() == width && this.K.getHeight() == height) {
                return;
            }
            Bitmap bitmap2 = this.K;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.K = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.M = new Canvas(this.K);
            Bitmap bitmap3 = this.K;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.L = new BitmapShader(bitmap3, tileMode, tileMode);
            if (this.N == null) {
                Paint paint = new Paint();
                this.N = paint;
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            }
        }
    }

    public final void S(boolean z) {
        if (this.G1 != z) {
            this.G1 = z;
            this.v0 = !z;
            oy8 y = y();
            if (y != null) {
                if (z) {
                    y.stop();
                } else {
                    if (y.l0) {
                        return;
                    }
                    y.start();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T(int i) {
        if (this.w != i) {
            this.w = i;
            if (this.y1 && D()) {
                fl5 z = fl5.z();
                z.s.c(new o94((Object) z, (Object) this, (int) this.w, (byte) 3));
            }
        }
    }

    public final void U(TLObject tLObject, Drawable drawable, Object obj) {
        V(tLObject, drawable, obj, false, 0, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(TLObject tLObject, Drawable drawable, Object obj, boolean z, int i, boolean z2) {
        gl5 gl5Var;
        BitmapDrawable bitmapDrawable;
        boolean z3;
        boolean z4;
        TLRPC.ChatPhoto chatPhoto;
        gl5 m;
        String str;
        BitmapDrawable bitmapDrawable2;
        TLRPC.VideoSize videoSize;
        TLRPC.UserFull W1;
        ArrayList<TLRPC.VideoSize> arrayList;
        TLRPC.UserFull W12;
        Object obj2 = obj == null ? tLObject : obj;
        this.m0 = true;
        TLRPC.VideoSize videoSize2 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        gl5 gl5Var2 = null;
        videoSize2 = null;
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            z3 = user.premium;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            if (userProfilePhoto != null) {
                bitmapDrawable2 = userProfilePhoto.strippedBitmap;
                z4 = userProfilePhoto.stripped_thumb != null;
                if (i == 3 && (W12 = na7.q1(this.d).W1(user.id)) != null) {
                    TLRPC.Photo photo = user.photo.personal ? W12.personal_photo : W12.profile_photo;
                    if (photo != null) {
                        videoSize = ba4.R(photo);
                        if (videoSize == null && z) {
                            na7.q1(this.d);
                            if (na7.A2(user) && user.photo.has_video && e66.e(1024)) {
                                W1 = na7.q1(this.d).W1(user.id);
                                if (W1 != null) {
                                    na7.q1(this.d).Y2(user, this.q0, false, null);
                                } else {
                                    TLRPC.Photo photo2 = user.photo.personal ? W1.personal_photo : W1.profile_photo;
                                    if (photo2 != null && (videoSize = ba4.R(photo2)) == null && (arrayList = photo2.video_sizes) != null && !arrayList.isEmpty()) {
                                        TLRPC.VideoSize x = ba4.x(100, arrayList);
                                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                            TLRPC.VideoSize videoSize3 = arrayList.get(i2);
                                            if ("p".equals(videoSize3.type)) {
                                                x = videoSize3;
                                            }
                                            if ((videoSize3 instanceof TLRPC.TL_videoSizeEmojiMarkup) || (videoSize3 instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                                                videoSize = videoSize3;
                                            }
                                        }
                                        gl5Var2 = gl5.j(x, photo2);
                                    }
                                }
                            }
                        }
                    }
                }
                videoSize = null;
                if (videoSize == null) {
                    na7.q1(this.d);
                    if (na7.A2(user)) {
                        W1 = na7.q1(this.d).W1(user.id);
                        if (W1 != null) {
                        }
                    }
                }
            } else {
                bitmapDrawable2 = null;
                videoSize = null;
                z4 = false;
            }
            gl5Var = gl5Var2;
            bitmapDrawable = bitmapDrawable2;
            videoSize2 = videoSize;
        } else if (!(tLObject instanceof TLRPC.Chat) || (chatPhoto = ((TLRPC.Chat) tLObject).photo) == null) {
            gl5Var = null;
            bitmapDrawable = null;
            z3 = false;
            z4 = false;
        } else {
            bitmapDrawable = chatPhoto.strippedBitmap;
            z4 = chatPhoto.stripped_thumb != null;
            gl5Var = null;
            z3 = false;
        }
        if (videoSize2 != null && i != 0) {
            g0(new i9c(videoSize2, z3, i));
            return;
        }
        int i3 = this.d;
        if (z2) {
            m = gl5.m(i3, 0, tLObject);
            str = "100_100";
        } else {
            m = gl5.m(i3, 1, tLObject);
            str = "50_50";
        }
        String str2 = str;
        gl5 gl5Var3 = m;
        if (gl5Var != null) {
            Y(gl5Var, "avatar", gl5Var3, str2, null, null, bitmapDrawable, 0L, null, obj2, 0);
            this.D1 = 3;
            return;
        }
        Object obj3 = obj2;
        BitmapDrawable bitmapDrawable3 = bitmapDrawable;
        if (bitmapDrawable3 != null) {
            d0(gl5Var3, str2, bitmapDrawable3, null, obj3, 0);
        } else if (z4) {
            a0(gl5Var3, str2, gl5.m(this.d, 2, tLObject), "50_50_b", drawable, obj3, 0);
        } else {
            d0(gl5Var3, str2, drawable, null, obj3, 0);
        }
    }

    public final void W(Bitmap bitmap) {
        if (bitmap != null) {
            if (this.I == null || this.H != bitmap) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.I = new BitmapShader(bitmap, tileMode, tileMode);
                y0(this.T);
            }
            this.Y0 = true;
        } else {
            this.I = null;
            this.J = null;
            this.L = null;
            this.M = null;
            Bitmap bitmap2 = this.K;
            if (bitmap2 != null) {
                bitmap2.recycle();
                this.K = null;
            }
        }
        this.H = bitmap;
    }

    public final void X(int i, long j, gl5 gl5Var, gl5 gl5Var2, Object obj, String str, String str2, String str3) {
        Z(gl5Var, str, gl5Var2, str2, null, j, str3, obj, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0210 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(gl5 gl5Var, String str, gl5 gl5Var2, String str2, gl5 gl5Var3, String str3, Drawable drawable, long j, String str4, Object obj, int i) {
        Paint paint;
        String str5;
        Paint paint2;
        String q;
        String str6;
        gl5 gl5Var4;
        String q2;
        boolean z;
        Bitmap bitmap;
        ll5 ll5Var;
        boolean z2;
        ll5 ll5Var2;
        String str7;
        nl5 nl5Var;
        gl5 gl5Var5;
        gl5 gl5Var6;
        gl5 gl5Var7;
        gl5 gl5Var8 = gl5Var;
        gl5 gl5Var9 = gl5Var2;
        if (this.A1 && !this.y1) {
            nl5 nl5Var2 = this.F;
            if (nl5Var2 == null) {
                nl5Var2 = new nl5();
                this.F = nl5Var2;
            }
            nl5Var2.e = gl5Var8;
            nl5Var2.f = str;
            nl5Var2.a = gl5Var9;
            nl5Var2.b = str2;
            nl5Var2.c = gl5Var3;
            nl5Var2.d = str3;
            nl5Var2.g = drawable;
            nl5Var2.h = j;
            nl5Var2.k = str4;
            nl5Var2.i = i;
            nl5Var2.j = obj;
            return;
        }
        if (this.p0) {
            return;
        }
        if (this.B0 && (nl5Var = this.F) != null && (((gl5Var5 = nl5Var.a) != null && (gl5Var5.v != null || gl5Var5.g != null)) || (((gl5Var6 = nl5Var.c) != null && (gl5Var6.v != null || gl5Var6.g != null)) || ((gl5Var7 = nl5Var.e) != null && (gl5Var7.v != null || gl5Var7.g != null))))) {
            O();
        }
        nl5 nl5Var3 = this.F;
        if (nl5Var3 != null) {
            nl5Var3.a = null;
            nl5Var3.c = null;
            nl5Var3.e = null;
            nl5Var3.g = null;
        }
        Paint paint3 = this.a1;
        if (gl5Var9 == null && gl5Var3 == null && gl5Var8 == null) {
            for (int i2 = 0; i2 < 4; i2++) {
                L(i2, null);
            }
            this.P = null;
            this.Q = null;
            this.R = null;
            this.g0 = null;
            this.h0 = null;
            this.i0 = null;
            this.X = null;
            this.Y = null;
            this.Z = null;
            this.k0 = null;
            this.l0 = null;
            this.T = null;
            this.U = null;
            this.J = null;
            this.c0 = null;
            this.F0 = null;
            this.L = null;
            this.M = null;
            Bitmap bitmap2 = this.K;
            if (bitmap2 != null) {
                bitmap2.recycle();
                this.K = null;
            }
            this.o0 = str4;
            this.h = null;
            this.s0 = 0;
            paint3.setShader(null);
            u0(drawable);
            this.i1 = 1.0f;
            this.j1 = 1.0f;
            this.r0 = 0L;
            y0(this.n0);
            fl5.z().d(this, true);
            invalidate();
            ll5 ll5Var3 = this.h1;
            if (ll5Var3 != null) {
                Drawable drawable2 = this.T;
                ll5Var3.C(this, (drawable2 == null && this.b0 == null && this.n0 == null && this.k0 == null) ? false : true, drawable2 == null && this.k0 == null, false);
                return;
            }
            return;
        }
        String q3 = gl5Var9 != null ? gl5Var9.q(obj, null, false) : null;
        if (q3 == null && gl5Var9 != null) {
            gl5Var9 = null;
        }
        this.D1 = Math.max(this.z0, 0);
        this.J0 = false;
        if (q3 == null && this.G0 && ((obj instanceof k27) || this.I0 != null)) {
            TLRPC.Document document = this.I0;
            if (document == null) {
                document = ((k27) obj).F0();
            }
            if (document != null && document.dc_id != 0) {
                paint = paint3;
                if (document.id != 0) {
                    q3 = "q_" + document.dc_id + "_" + document.id;
                    this.J0 = true;
                }
                str5 = q3;
                if (str5 != null && str2 != null) {
                    str5 = tb4.y(str5, "@", str2);
                }
                if (this.w1 == null) {
                    paint2 = paint;
                    str5 = b00.j(new StringBuilder(), this.w1, str5);
                } else {
                    paint2 = paint;
                }
                q = gl5Var8 == null ? gl5Var8.q(obj, null, false) : null;
                if (q == null && gl5Var8 != null) {
                    gl5Var8 = null;
                }
                if (q != null && str != null) {
                    q = tb4.y(q, "@", str);
                }
                if (this.w1 != null) {
                    q = b00.j(new StringBuilder(), this.w1, q);
                }
                if ((q == null && (str7 = this.R) != null && str7.equals(str5)) || ((str6 = this.i0) != null && str6.equals(q))) {
                    ll5Var2 = this.h1;
                    if (ll5Var2 != null) {
                        Drawable drawable3 = this.T;
                        ll5Var2.C(this, (drawable3 == null && this.b0 == null && this.n0 == null && this.k0 == null) ? false : true, drawable3 == null && this.k0 == null, false);
                    }
                    if (!this.n) {
                        return;
                    }
                }
                gl5Var4 = this.O;
                if (gl5Var4 == null) {
                    gl5Var4 = gl5Var8 != null ? gl5Var8 : gl5Var9;
                }
                if (gl5Var4 == null) {
                    gl5Var4 = gl5Var3;
                }
                q2 = gl5Var3 != null ? gl5Var3.q(obj, gl5Var4, false) : null;
                if (q2 != null && str3 != null) {
                    q2 = tb4.y(q2, "@", str3);
                }
                if (this.B0) {
                    Object obj2 = this.h;
                    if (obj2 instanceof k27) {
                        k27 k27Var = (k27) obj2;
                        if (k27Var.e2 != null && (k27.m1(k27Var) instanceof TLRPC.TL_messageMediaGeoLive)) {
                            k27 k27Var2 = (k27) this.h;
                            k27Var2.f2 = k27Var2.e2;
                        }
                    }
                    Drawable drawable4 = this.k0;
                    if (drawable4 != null) {
                        if (drawable4 instanceof km) {
                            ((km) drawable4).stop();
                            ((km) this.k0).v(this);
                        }
                        L(1, q2);
                        L(2, null);
                        L(0, q);
                        this.D0 = this.k0;
                        this.F0 = this.l0;
                        this.E0 = this.R;
                        this.C0 = false;
                        this.k0 = null;
                        this.i0 = null;
                    } else if (this.T != null) {
                        L(1, q2);
                        L(2, null);
                        L(3, q);
                        this.F0 = this.U;
                        this.D0 = this.T;
                        this.E0 = this.R;
                        this.C0 = false;
                        this.T = null;
                        this.R = null;
                    } else if (this.b0 != null) {
                        L(0, str5);
                        L(2, null);
                        L(3, q);
                        this.F0 = this.c0;
                        this.D0 = this.b0;
                        this.E0 = this.Z;
                        this.C0 = false;
                        this.b0 = null;
                        this.Z = null;
                    } else if (this.n0 != null) {
                        L(0, str5);
                        L(1, q2);
                        L(2, null);
                        L(3, q);
                        this.F0 = this.d0;
                        this.D0 = this.n0;
                        this.C0 = false;
                        this.E0 = null;
                        this.b0 = null;
                        this.Z = null;
                    } else {
                        L(0, str5);
                        z = true;
                        L(1, q2);
                        L(2, null);
                        L(3, q);
                        this.F0 = null;
                    }
                    z = true;
                } else {
                    z = true;
                    L(0, str5);
                    L(1, q2);
                    L(2, null);
                    L(3, q);
                    this.F0 = null;
                }
                this.P = gl5Var9;
                this.Q = str2;
                this.R = str5;
                this.g0 = gl5Var8;
                this.h0 = str;
                this.i0 = q;
                this.X = gl5Var3;
                this.Y = str3;
                this.Z = q2;
                this.h = obj;
                this.o0 = str4;
                this.r0 = j;
                this.s0 = i;
                u0(drawable);
                this.U = null;
                this.J = null;
                this.c0 = null;
                this.d0 = null;
                this.l0 = null;
                this.L = null;
                this.M = null;
                paint2.setShader(null);
                bitmap = this.K;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.K = null;
                }
                this.i1 = 1.0f;
                this.j1 = 1.0f;
                y0(this.n0);
                ll5Var = this.h1;
                if (ll5Var != null) {
                    Drawable drawable5 = this.T;
                    z2 = false;
                    ll5Var.C(this, (drawable5 == null && this.b0 == null && this.n0 == null && this.k0 == null) ? false : z, (drawable5 == null && this.k0 == null) ? z : false, false);
                } else {
                    z2 = false;
                }
                fl5.z().I(this, this.a);
                invalidate();
                this.q1 = ((obj instanceof k27) || !((k27) obj).g4()) ? z2 : z;
            }
        }
        paint = paint3;
        str5 = q3;
        if (str5 != null) {
            str5 = tb4.y(str5, "@", str2);
        }
        if (this.w1 == null) {
        }
        if (gl5Var8 == null) {
        }
        if (q == null) {
            gl5Var8 = null;
        }
        if (q != null) {
            q = tb4.y(q, "@", str);
        }
        if (this.w1 != null) {
        }
        if (q == null) {
            ll5Var2 = this.h1;
            if (ll5Var2 != null) {
            }
            if (!this.n) {
            }
            gl5Var4 = this.O;
            if (gl5Var4 == null) {
            }
            if (gl5Var4 == null) {
            }
            if (gl5Var3 != null) {
            }
            if (q2 != null) {
                q2 = tb4.y(q2, "@", str3);
            }
            if (this.B0) {
            }
            this.P = gl5Var9;
            this.Q = str2;
            this.R = str5;
            this.g0 = gl5Var8;
            this.h0 = str;
            this.i0 = q;
            this.X = gl5Var3;
            this.Y = str3;
            this.Z = q2;
            this.h = obj;
            this.o0 = str4;
            this.r0 = j;
            this.s0 = i;
            u0(drawable);
            this.U = null;
            this.J = null;
            this.c0 = null;
            this.d0 = null;
            this.l0 = null;
            this.L = null;
            this.M = null;
            paint2.setShader(null);
            bitmap = this.K;
            if (bitmap != null) {
            }
            this.i1 = 1.0f;
            this.j1 = 1.0f;
            y0(this.n0);
            ll5Var = this.h1;
            if (ll5Var != null) {
            }
            fl5.z().I(this, this.a);
            invalidate();
            this.q1 = ((obj instanceof k27) || !((k27) obj).g4()) ? z2 : z;
        }
        ll5Var2 = this.h1;
        if (ll5Var2 != null) {
        }
        if (!this.n) {
        }
        gl5Var4 = this.O;
        if (gl5Var4 == null) {
        }
        if (gl5Var4 == null) {
        }
        if (gl5Var3 != null) {
        }
        if (q2 != null) {
        }
        if (this.B0) {
        }
        this.P = gl5Var9;
        this.Q = str2;
        this.R = str5;
        this.g0 = gl5Var8;
        this.h0 = str;
        this.i0 = q;
        this.X = gl5Var3;
        this.Y = str3;
        this.Z = q2;
        this.h = obj;
        this.o0 = str4;
        this.r0 = j;
        this.s0 = i;
        u0(drawable);
        this.U = null;
        this.J = null;
        this.c0 = null;
        this.d0 = null;
        this.l0 = null;
        this.L = null;
        this.M = null;
        paint2.setShader(null);
        bitmap = this.K;
        if (bitmap != null) {
        }
        this.i1 = 1.0f;
        this.j1 = 1.0f;
        y0(this.n0);
        ll5Var = this.h1;
        if (ll5Var != null) {
        }
        fl5.z().I(this, this.a);
        invalidate();
        this.q1 = ((obj instanceof k27) || !((k27) obj).g4()) ? z2 : z;
    }

    public final void Z(gl5 gl5Var, String str, gl5 gl5Var2, String str2, Drawable drawable, long j, String str3, Object obj, int i) {
        Y(null, null, gl5Var, str, gl5Var2, str2, drawable, j, str3, obj, i);
    }

    public final void a(r8b r8bVar) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.c = arrayList;
        }
        arrayList.add(r8bVar);
        if (this.y1) {
            r8bVar.a(this);
        }
    }

    public final void a0(gl5 gl5Var, String str, gl5 gl5Var2, String str2, Drawable drawable, Object obj, int i) {
        Y(null, null, gl5Var, str, gl5Var2, str2, drawable, 0L, null, obj, i);
    }

    public final void b() {
        fl5 z = fl5.z();
        z.s.c(new o94((Object) z, (Object) this, (int) this.w, (byte) 3));
    }

    public final void b0(gl5 gl5Var, String str, gl5 gl5Var2, String str2, String str3, Object obj, int i) {
        Z(gl5Var, str, gl5Var2, str2, null, 0L, str3, obj, i);
    }

    public final void c() {
        this.r = false;
        fl5.z().d(this, true);
        this.n = true;
    }

    public final void c0(gl5 gl5Var, String str, Drawable drawable, long j, String str2, Object obj, int i) {
        Z(gl5Var, str, null, null, drawable, j, str2, obj, i);
    }

    public final void d(boolean z, il5 il5Var) {
        float f;
        if (this.m1) {
            return;
        }
        float f2 = this.i1;
        if (f2 != 1.0f) {
            if (!z) {
                if (il5Var != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = this.k1;
                    long j2 = currentTimeMillis - j;
                    if (j == 0) {
                        j2 = 16;
                    }
                    if (j2 > 30 && gl.r > 60.0f) {
                        j2 = 30;
                    }
                    f = (j2 / this.t1) + this.i1;
                    this.i1 = f;
                } else {
                    f = f2 + (16.0f / this.t1);
                    this.i1 = f;
                }
                if (f > 1.0f) {
                    this.i1 = 1.0f;
                    this.j1 = 1.0f;
                    if (this.D0 != null) {
                        L(2, null);
                        this.F0 = null;
                    }
                }
            }
            if (il5Var != null) {
                gl.d3(new iu4(this, (byte) 27));
            } else {
                invalidate();
            }
        }
    }

    public final void d0(gl5 gl5Var, String str, Drawable drawable, String str2, Object obj, int i) {
        Z(gl5Var, str, null, null, drawable, 0L, str2, obj, i);
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        if (i == kk7.o4) {
            String str = (String) objArr[0];
            String str2 = this.i0;
            if (str2 != null && str2.equals(str)) {
                this.i0 = (String) objArr[1];
                gl5 gl5Var = (gl5) objArr[2];
                this.g0 = gl5Var;
                nl5 nl5Var = this.F;
                if (nl5Var != null) {
                    nl5Var.e = gl5Var;
                }
            }
            String str3 = this.R;
            if (str3 != null && str3.equals(str)) {
                this.R = (String) objArr[1];
                gl5 gl5Var2 = (gl5) objArr[2];
                this.P = gl5Var2;
                nl5 nl5Var2 = this.F;
                if (nl5Var2 != null) {
                    nl5Var2.a = gl5Var2;
                }
            }
            String str4 = this.Z;
            if (str4 == null || !str4.equals(str)) {
                return;
            }
            this.Z = (String) objArr[1];
            gl5 gl5Var3 = (gl5) objArr[2];
            this.X = gl5Var3;
            nl5 nl5Var3 = this.F;
            if (nl5Var3 != null) {
                nl5Var3.c = gl5Var3;
                return;
            }
            return;
        }
        if (i == kk7.i1) {
            Integer num = (Integer) objArr[0];
            if (this.x < num.intValue()) {
                int intValue = this.E | num.intValue();
                this.E = intValue;
                if (intValue != 0) {
                    oy8 y = y();
                    if (y != null && y.u()) {
                        y.stop();
                    }
                    km m = m();
                    if (m != null) {
                        m.stop();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i == kk7.j1) {
            Integer num2 = (Integer) objArr[0];
            if (this.x >= num2.intValue() || (i3 = this.E) == 0) {
                return;
            }
            int i4 = i3 & (~num2.intValue());
            this.E = i4;
            if (i4 == 0) {
                oy8 y2 = y();
                if (y2 != null) {
                    y2.F = this.t0;
                }
                if (this.v0 && y2 != null && y2.u()) {
                    y2.start();
                }
                km m2 = m();
                if (!this.u0 || m2 == null) {
                    return;
                }
                m2.j();
                invalidate();
            }
        }
    }

    public final void e() {
        if (this.c != null) {
            if (this.y1) {
                for (int i = 0; i < this.c.size(); i++) {
                    ArrayList arrayList = ((r8b) ((kl5) this.c.get(i))).a;
                    if (arrayList != null) {
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((n8b) arrayList.get(i2)).b(false);
                        }
                    }
                }
            }
            this.c.clear();
        }
    }

    public final void e0(String str, String str2, Drawable drawable, String str3, long j) {
        Z(gl5.g(str), str2, null, null, drawable, j, str3, null, 1);
    }

    public final void f() {
        for (int i = 0; i < 4; i++) {
            L(i, null);
        }
        fl5.z().d(this, true);
    }

    public final void f0(Bitmap bitmap) {
        g0(bitmap != null ? new BitmapDrawable((Resources) null, bitmap) : null);
    }

    public final boolean g(Canvas canvas) {
        return h(canvas, null);
    }

    public final void g0(Drawable drawable) {
        boolean z = true;
        fl5.z().d(this, true);
        if (!this.B0) {
            for (int i = 0; i < 4; i++) {
                L(i, null);
            }
        } else if (this.T != null) {
            L(1, null);
            L(2, null);
            L(3, null);
            this.F0 = this.U;
            this.D0 = this.T;
            this.E0 = this.R;
            this.C0 = true;
        } else if (this.b0 != null) {
            L(0, null);
            L(2, null);
            L(3, null);
            this.F0 = this.c0;
            this.D0 = this.b0;
            this.E0 = this.Z;
            this.C0 = true;
        } else if (this.n0 != null) {
            L(0, null);
            L(1, null);
            L(2, null);
            L(3, null);
            this.F0 = this.d0;
            this.D0 = this.n0;
            this.C0 = true;
            this.E0 = null;
        } else {
            for (int i2 = 0; i2 < 4; i2++) {
                L(i2, null);
            }
            this.F0 = null;
        }
        Drawable drawable2 = this.n0;
        if (drawable2 instanceof n29) {
            cr7 cr7Var = (cr7) ((n29) drawable2);
            up3.q(cr7Var.r.K1).v(cr7Var);
            cr7Var.n = null;
            cr7Var.r = null;
        }
        if (drawable instanceof vl) {
            vl vlVar = (vl) drawable;
            if (this.y1) {
                vlVar.a(this);
            }
        } else if (drawable instanceof km) {
            km kmVar = (km) drawable;
            View view = this.e;
            if (kmVar.s0 == null) {
                kmVar.s0 = new WeakReference(view);
            }
            if (this.y1) {
                kmVar.e(this);
            }
            boolean z2 = this.w0 || kmVar.o0;
            if (!kmVar.o0) {
                kmVar.w0 = z2;
            }
            if (this.u0 && this.E == 0) {
                kmVar.j();
            }
            boolean z3 = this.x0;
            kmVar.E = z3;
            if (z3) {
                kmVar.x(false);
            }
        } else if (drawable instanceof oy8) {
            oy8 oy8Var = (oy8) drawable;
            if (this.y1) {
                oy8Var.J0.add(this);
            }
            oy8Var.F = this.t0;
            if (this.v0 && (!oy8Var.u() || this.E == 0)) {
                oy8Var.start();
            }
            oy8Var.E(true);
        }
        this.d0 = null;
        this.c0 = null;
        this.a1.setShader(null);
        u0(drawable);
        y0(drawable);
        this.g0 = null;
        this.h0 = null;
        Drawable drawable3 = this.k0;
        if (drawable3 instanceof km) {
            ((km) drawable3).v(this);
        }
        this.k0 = null;
        this.i0 = null;
        this.l0 = null;
        this.P = null;
        this.Q = null;
        this.T = null;
        this.R = null;
        this.U = null;
        this.J = null;
        this.L = null;
        this.M = null;
        Bitmap bitmap = this.K;
        if (bitmap != null) {
            bitmap.recycle();
            this.K = null;
        }
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.J0 = false;
        this.o0 = null;
        this.r0 = 0L;
        this.s0 = 0;
        this.i1 = 1.0f;
        this.j1 = 1.0f;
        nl5 nl5Var = this.F;
        if (nl5Var != null) {
            nl5Var.a = null;
            nl5Var.c = null;
            nl5Var.e = null;
            nl5Var.g = null;
        }
        ll5 ll5Var = this.h1;
        if (ll5Var != null) {
            ll5Var.C(this, (this.b0 == null && this.n0 == null) ? false : true, true, false);
        }
        invalidate();
        if (this.V0 && this.B0 && this.D0 != null) {
            this.i1 = 0.0f;
            this.k1 = System.currentTimeMillis();
            if (this.b0 == null && this.n0 == null) {
                z = false;
            }
            this.n1 = z;
        }
    }

    public float getAlpha() {
        return this.e1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:0|1|(1:5)|(1:7)(1:214)|8|(1:10)(2:204|(1:212)(1:208))|11|(1:13)(1:203)|(1:15)(0)|(2:20|(1:22))|23|(12:(1:(1:(1:192)(2:193|(3:195|(1:200)(1:198)|199)(1:201)))(1:190))(1:187)|31|(1:33)(1:182)|34|35|(4:37|(12:39|(1:168)(4:44|(1:47)|48|49)|50|51|(1:(2:54|55)(3:99|(6:(4:(1:(2:156|(6:111|(1:145)(1:115)|116|117|118|(1:122)))(3:(5:158|(4:161|152|109|(0))|153|109|(0))|146|(0)))|108|109|(0))(3:(1:(5:148|(4:151|152|109|(0))|153|109|(0)))(1:(4:107|108|109|(0)))|146|(0))|(2:65|66)|71|(1:75)|(3:81|(4:84|(5:86|(2:89|87)|90|91|92)(1:94)|93|82)|95)|96)|162))(1:163)|123|124|(1:144)(4:129|(3:130|131|(2:133|134)(1:135))|136|137)|138|139|(1:141)|143)(2:169|170)|(1:98)(1:59)|60)(2:171|(5:173|(1:175)|176|177|178)(7:179|180|(2:65|66)|71|(2:73|75)|(5:77|79|81|(1:82)|95)|96))|61|(0)|71|(0)|(0)|96)(1:29)|30|31|(0)(0)|34|35|(0)(0)|61|(0)|71|(0)|(0)|96|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x031c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x00cd, code lost:
    
        if (r22 != null) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ff A[Catch: Exception -> 0x031e, TryCatch #0 {Exception -> 0x031e, blocks: (B:10:0x002c, B:11:0x00a2, B:15:0x00c9, B:17:0x00d1, B:20:0x00d7, B:22:0x00de, B:23:0x00e1, B:25:0x00e5, B:29:0x00ed, B:31:0x0148, B:33:0x0154, B:37:0x0161, B:44:0x0171, B:47:0x0177, B:48:0x017e, B:55:0x01ad, B:57:0x02d4, B:60:0x02db, B:111:0x01ff, B:113:0x0203, B:116:0x0216, B:148:0x01cf, B:151:0x01d5, B:158:0x01e9, B:161:0x01ef, B:170:0x02ce, B:173:0x02e9, B:175:0x02ed, B:176:0x02f2, B:187:0x0100, B:190:0x010e, B:192:0x011a, B:193:0x0124, B:195:0x0128, B:198:0x012e, B:199:0x0137, B:204:0x005d, B:206:0x008f, B:210:0x0097), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0154 A[Catch: Exception -> 0x031e, TryCatch #0 {Exception -> 0x031e, blocks: (B:10:0x002c, B:11:0x00a2, B:15:0x00c9, B:17:0x00d1, B:20:0x00d7, B:22:0x00de, B:23:0x00e1, B:25:0x00e5, B:29:0x00ed, B:31:0x0148, B:33:0x0154, B:37:0x0161, B:44:0x0171, B:47:0x0177, B:48:0x017e, B:55:0x01ad, B:57:0x02d4, B:60:0x02db, B:111:0x01ff, B:113:0x0203, B:116:0x0216, B:148:0x01cf, B:151:0x01d5, B:158:0x01e9, B:161:0x01ef, B:170:0x02ce, B:173:0x02e9, B:175:0x02ed, B:176:0x02f2, B:187:0x0100, B:190:0x010e, B:192:0x011a, B:193:0x0124, B:195:0x0128, B:198:0x012e, B:199:0x0137, B:204:0x005d, B:206:0x008f, B:210:0x0097), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0161 A[Catch: Exception -> 0x031e, TryCatch #0 {Exception -> 0x031e, blocks: (B:10:0x002c, B:11:0x00a2, B:15:0x00c9, B:17:0x00d1, B:20:0x00d7, B:22:0x00de, B:23:0x00e1, B:25:0x00e5, B:29:0x00ed, B:31:0x0148, B:33:0x0154, B:37:0x0161, B:44:0x0171, B:47:0x0177, B:48:0x017e, B:55:0x01ad, B:57:0x02d4, B:60:0x02db, B:111:0x01ff, B:113:0x0203, B:116:0x0216, B:148:0x01cf, B:151:0x01d5, B:158:0x01e9, B:161:0x01ef, B:170:0x02ce, B:173:0x02e9, B:175:0x02ed, B:176:0x02f2, B:187:0x0100, B:190:0x010e, B:192:0x011a, B:193:0x0124, B:195:0x0128, B:198:0x012e, B:199:0x0137, B:204:0x005d, B:206:0x008f, B:210:0x0097), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0311 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0341  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(Canvas canvas, il5 il5Var) {
        int[] iArr;
        boolean z;
        boolean z2;
        Canvas canvas2;
        ImageReceiver imageReceiver;
        int i;
        km m;
        oy8 y;
        int[] iArr2;
        Drawable drawable;
        BitmapShader bitmapShader;
        Drawable drawable2;
        BitmapShader bitmapShader2;
        BitmapShader bitmapShader3;
        BitmapShader bitmapShader4;
        boolean z3;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        float f;
        float f2;
        BitmapShader bitmapShader5;
        float f3;
        boolean z4;
        Drawable drawable6;
        BitmapShader bitmapShader6;
        Drawable drawable7;
        boolean z5;
        BitmapShader bitmapShader7;
        Drawable drawable8;
        float f4;
        BitmapShader bitmapShader8;
        boolean z6;
        Drawable drawable9;
        boolean z7;
        Drawable drawable10;
        float f5;
        boolean z8;
        Drawable drawable11;
        int i2;
        int i3;
        BitmapShader bitmapShader9;
        int i4;
        Drawable drawable12;
        boolean z9;
        Canvas canvas3;
        ImageReceiver imageReceiver2;
        boolean z10;
        il5 il5Var2;
        ImageReceiver imageReceiver3;
        int[] iArr3;
        float f6;
        Drawable drawable13;
        float f7;
        Canvas canvas4;
        int i5;
        Drawable drawable14;
        int i6;
        boolean z11;
        float[] fArr;
        BitmapShader bitmapShader10;
        BitmapShader bitmapShader11;
        ImageReceiver imageReceiver4 = this;
        Path path = imageReceiver4.d1;
        if (imageReceiver4.H != null && imageReceiver4.R != null) {
            canvas.save();
            float f8 = imageReceiver4.L0;
            float f9 = imageReceiver4.M0;
            canvas.clipRect(f8, f9, imageReceiver4.N0 + f8, imageReceiver4.O0 + f9);
            canvas.drawColor(-16777216);
        }
        boolean z12 = il5Var != null;
        try {
            if (z12) {
                m = il5Var.f;
                y = il5Var.g;
                iArr2 = il5Var.h;
                drawable = il5Var.j;
                bitmapShader = il5Var.i;
                drawable2 = il5Var.l;
                bitmapShader2 = il5Var.k;
                bitmapShader3 = il5Var.n;
                bitmapShader4 = il5Var.e;
                drawable3 = il5Var.x;
                z3 = il5Var.w;
                drawable4 = il5Var.m;
                drawable5 = il5Var.o;
                f = il5Var.p;
                f2 = il5Var.q;
                bitmapShader5 = il5Var.r;
                z4 = il5Var.a;
                f3 = il5Var.b;
            } else {
                m = imageReceiver4.m();
                y = imageReceiver4.y();
                iArr2 = imageReceiver4.X0;
                drawable = imageReceiver4.k0;
                bitmapShader = imageReceiver4.l0;
                drawable2 = imageReceiver4.T;
                bitmapShader2 = imageReceiver4.U;
                Drawable drawable15 = imageReceiver4.b0;
                bitmapShader3 = imageReceiver4.c0;
                bitmapShader4 = imageReceiver4.d0;
                z3 = imageReceiver4.C0;
                drawable3 = imageReceiver4.D0;
                drawable4 = drawable15;
                drawable5 = imageReceiver4.n0;
                f = imageReceiver4.i1;
                f2 = imageReceiver4.j1;
                bitmapShader5 = imageReceiver4.F0;
                f3 = imageReceiver4.e1;
                z4 = ((m == null || m.s()) && (y == null || y.p())) ? false : true;
            }
            oy8 oy8Var = y;
            km kmVar = m;
            drawable6 = drawable5;
            bitmapShader6 = bitmapShader2;
            drawable7 = drawable;
            z5 = z4;
            bitmapShader7 = bitmapShader4;
            drawable8 = drawable3;
            f4 = f;
            bitmapShader8 = bitmapShader3;
            z6 = z3;
            drawable9 = drawable4;
            z7 = z12;
            drawable10 = drawable2;
            f5 = f3;
            iArr = !imageReceiver4.W0 ? 0 : iArr2;
            if (kmVar != null) {
                kmVar.B(iArr);
            }
            if (!z5 && !imageReceiver4.A0 && !z7) {
                imageReceiver4.A0 = true;
                ll5 ll5Var = imageReceiver4.h1;
                if (ll5Var != null) {
                    ll5Var.v(imageReceiver4);
                }
            }
            z8 = imageReceiver4.T0;
        } catch (Exception e) {
            e = e;
        }
        if (z8 || imageReceiver4.U0 || drawable7 == null || z5) {
            if (!z8 && drawable10 != null && (!z5 || drawable7 != null)) {
                i2 = imageReceiver4.V;
                i3 = imageReceiver4.W;
                drawable11 = drawable10;
                z5 = false;
            } else if (drawable8 != null && !z6) {
                i2 = imageReceiver4.V;
                i3 = imageReceiver4.W;
                drawable11 = drawable8;
                bitmapShader6 = bitmapShader5;
            } else if (drawable9 != null) {
                i2 = imageReceiver4.e0;
                i3 = imageReceiver4.f0;
                drawable11 = drawable9;
                bitmapShader6 = bitmapShader8;
            } else if (drawable6 instanceof BitmapDrawable) {
                if (imageReceiver4.m0 && bitmapShader7 == null) {
                    imageReceiver4.y0(drawable6);
                    bitmapShader9 = imageReceiver4.d0;
                } else {
                    bitmapShader9 = bitmapShader7;
                }
                int i7 = imageReceiver4.e0;
                i4 = imageReceiver4.f0;
                i2 = i7;
                bitmapShader6 = bitmapShader9;
                bitmapShader7 = bitmapShader6;
                drawable11 = drawable6;
            } else {
                drawable11 = null;
                bitmapShader6 = null;
                i2 = 0;
                i3 = 0;
            }
            float f10 = imageReceiver4.o1;
            float min = f10 <= 0.0f ? Math.min((f10 * f4) + f4, 1.0f) : f4;
            if (drawable11 == null) {
                if (imageReceiver4.l1 != 0) {
                    if (f2 == 1.0f || (!(drawable11 == drawable10 || drawable11 == drawable7) || drawable6 == null)) {
                        iArr3 = iArr;
                        f6 = f4;
                        z10 = z5;
                        drawable13 = drawable11;
                        f7 = min;
                    } else {
                        if (imageReceiver4.m0 && bitmapShader7 == null) {
                            imageReceiver4.y0(drawable6);
                            bitmapShader7 = imageReceiver4.d0;
                        }
                        f6 = f4;
                        z10 = z5;
                        drawable13 = drawable11;
                        f7 = min;
                        BitmapShader bitmapShader12 = bitmapShader7;
                        iArr3 = iArr;
                        imageReceiver4.k(canvas, drawable6, (int) (f5 * 255.0f), bitmapShader12, i2, i3, il5Var);
                        bitmapShader7 = bitmapShader12;
                    }
                    try {
                    } catch (Exception e2) {
                        e = e2;
                        imageReceiver4 = this;
                        iArr = canvas;
                        z = true;
                        z2 = false;
                        imageReceiver = imageReceiver4;
                        canvas2 = iArr;
                        fa4.g(e, z);
                        if (imageReceiver.H != null) {
                        }
                        if (z2) {
                        }
                        return z2;
                    }
                    if (!imageReceiver4.n1) {
                        canvas4 = canvas;
                        i5 = i3;
                        drawable14 = drawable13;
                        i6 = i2;
                    } else if (z10) {
                        Drawable drawable16 = drawable13;
                        imageReceiver4.k(canvas, drawable16, (int) (f5 * 255.0f), bitmapShader6, i2, i3, il5Var);
                        il5Var2 = il5Var;
                        drawable12 = drawable16;
                        imageReceiver3 = imageReceiver4;
                    } else {
                        i5 = i3;
                        Drawable drawable17 = drawable13;
                        i6 = i2;
                        if (f7 != 1.0f) {
                            if (drawable17 == drawable10 || drawable17 == drawable7) {
                                if (drawable8 == null) {
                                    if (drawable9 != null) {
                                        drawable6 = drawable9;
                                        bitmapShader11 = bitmapShader8;
                                        if (drawable6 != null) {
                                            int z13 = ((drawable6 instanceof kcb) || (drawable6 instanceof ru3)) ? (int) tb4.z(1.0f, f7, f5, 255.0f) : (int) (f2 * f5 * 255.0f);
                                            drawable14 = drawable17;
                                            canvas4 = canvas;
                                            imageReceiver4.k(canvas4, drawable6, z13, bitmapShader11, imageReceiver4.e0, imageReceiver4.f0, il5Var);
                                            if (z13 != 255 && (drawable6 instanceof ru3)) {
                                                drawable6.setAlpha(kk7.d4);
                                            }
                                        }
                                    } else {
                                        if (drawable6 != null) {
                                            if (imageReceiver4.m0 && bitmapShader7 == null) {
                                                imageReceiver4.y0(drawable6);
                                                bitmapShader10 = imageReceiver4.d0;
                                                bitmapShader5 = bitmapShader10;
                                                bitmapShader11 = bitmapShader5;
                                                if (drawable6 != null) {
                                                }
                                            }
                                            bitmapShader5 = bitmapShader7;
                                            bitmapShader11 = bitmapShader5;
                                            if (drawable6 != null) {
                                            }
                                        }
                                        drawable6 = null;
                                        bitmapShader11 = null;
                                        if (drawable6 != null) {
                                        }
                                    }
                                }
                                drawable6 = drawable8;
                                bitmapShader11 = bitmapShader5;
                                if (drawable6 != null) {
                                }
                            } else {
                                if (drawable17 == drawable9 || drawable17 == drawable8) {
                                    if (drawable6 != null) {
                                        if (imageReceiver4.m0 && bitmapShader7 == null) {
                                            imageReceiver4.y0(drawable6);
                                            bitmapShader10 = imageReceiver4.d0;
                                            bitmapShader5 = bitmapShader10;
                                            bitmapShader11 = bitmapShader5;
                                            if (drawable6 != null) {
                                            }
                                        }
                                        bitmapShader5 = bitmapShader7;
                                        bitmapShader11 = bitmapShader5;
                                        if (drawable6 != null) {
                                        }
                                    }
                                } else if (drawable17 == drawable6 && drawable8 != null) {
                                    drawable6 = drawable8;
                                    bitmapShader11 = bitmapShader5;
                                    if (drawable6 != null) {
                                    }
                                }
                                drawable6 = null;
                                bitmapShader11 = null;
                                if (drawable6 != null) {
                                }
                            }
                            if (drawable12 == null && z9 && !z7) {
                                try {
                                    imageReceiver.invalidate();
                                } catch (Exception e3) {
                                    e = e3;
                                    z = true;
                                    imageReceiver = imageReceiver;
                                    canvas2 = canvas2;
                                    fa4.g(e, z);
                                    if (imageReceiver.H != null) {
                                    }
                                    if (z2) {
                                    }
                                    return z2;
                                }
                            }
                            if (imageReceiver.H != null && imageReceiver.R != null) {
                                canvas2.restore();
                            }
                            if (z2 && imageReceiver.R0 && imageReceiver.c != null) {
                                for (i = 0; i < imageReceiver.c.size(); i++) {
                                    r8b r8bVar = (r8b) ((kl5) imageReceiver.c.get(i));
                                    ArrayList arrayList = r8bVar.a;
                                    if (arrayList != null) {
                                        float alpha = imageReceiver.getAlpha();
                                        float r = imageReceiver.r();
                                        float s = imageReceiver.s();
                                        float f11 = imageReceiver.N0;
                                        r8bVar.d = f11;
                                        float f12 = (16.0f * f11) / 9.0f;
                                        r8bVar.e = f12;
                                        r8bVar.b = r - (f11 / 2.0f);
                                        r8bVar.c = s - (f12 / 2.0f);
                                        canvas2.save();
                                        canvas2.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), imageReceiver.x());
                                        for (int i8 = 0; i8 < arrayList.size(); i8++) {
                                            ((n8b) arrayList.get(i8)).a(canvas2, alpha);
                                        }
                                        canvas2.restore();
                                    }
                                }
                            }
                            return z2;
                        }
                        drawable14 = drawable17;
                        canvas4 = canvas;
                    }
                    if (imageReceiver4.o1 <= 0.0f || f7 >= 1.0f || !z6) {
                        z11 = false;
                    } else {
                        canvas4.save();
                        path.rewind();
                        RectF rectF = gl.P;
                        float f13 = imageReceiver4.L0;
                        float f14 = imageReceiver4.M0;
                        rectF.set(f13, f14, imageReceiver4.N0 + f13, imageReceiver4.O0 + f14);
                        int i9 = 0;
                        while (true) {
                            int length = iArr3.length;
                            fArr = J1;
                            if (i9 >= length) {
                                break;
                            }
                            int i10 = i9 << 1;
                            float f15 = iArr3[i9];
                            fArr[i10] = f15;
                            fArr[i10 + 1] = f15;
                            i9++;
                        }
                        path.addRoundRect(gl.P, fArr, Path.Direction.CW);
                        canvas4.clipPath(path);
                        float interpolation = ((1.0f - s33.i.getInterpolation(f6)) * imageReceiver4.o1) + 1.0f;
                        canvas4.scale(interpolation, interpolation, imageReceiver4.r(), imageReceiver4.s());
                        z11 = true;
                    }
                    Drawable drawable18 = drawable14;
                    imageReceiver4.k(canvas4, drawable18, (int) (f5 * f7 * 255.0f), bitmapShader6, i6, i5, il5Var);
                    if (z11) {
                        canvas.restore();
                    }
                    imageReceiver3 = this;
                    il5Var2 = il5Var;
                    drawable12 = drawable18;
                } else {
                    Drawable drawable19 = drawable11;
                    z10 = z5;
                    ImageReceiver imageReceiver5 = this;
                    il5Var2 = il5Var;
                    imageReceiver5.k(canvas, drawable19, (int) (f5 * 255.0f), bitmapShader6, i2, i3, il5Var2);
                    drawable12 = drawable19;
                    imageReceiver3 = imageReceiver5;
                }
                imageReceiver3.d(z10 && imageReceiver3.n1, il5Var2);
                canvas3 = canvas;
                z9 = z10;
                imageReceiver2 = imageReceiver3;
            } else {
                drawable12 = drawable11;
                boolean z14 = z5;
                if (drawable6 == null) {
                    canvas2 = canvas;
                    z9 = z14;
                    imageReceiver4.d(z9, il5Var);
                    z2 = false;
                    imageReceiver = imageReceiver4;
                    if (drawable12 == null) {
                        imageReceiver.invalidate();
                    }
                    if (imageReceiver.H != null) {
                        canvas2.restore();
                    }
                    if (z2) {
                        while (i < imageReceiver.c.size()) {
                        }
                    }
                    return z2;
                }
                if (drawable6 instanceof i9c) {
                    ((i9c) drawable6).e = imageReceiver4;
                }
                Canvas canvas5 = canvas;
                imageReceiver4.k(canvas5, drawable6, (int) (f5 * 255.0f), null, imageReceiver4.e0, imageReceiver4.f0, il5Var);
                z9 = z14;
                imageReceiver4.d(z9, il5Var);
                imageReceiver2 = imageReceiver4;
                canvas3 = canvas5;
            }
            z2 = true;
            imageReceiver = imageReceiver2;
            canvas2 = canvas3;
            if (drawable12 == null) {
            }
            if (imageReceiver.H != null) {
            }
            if (z2) {
            }
            return z2;
        }
        int i11 = imageReceiver4.V;
        i4 = imageReceiver4.W;
        i2 = i11;
        bitmapShader6 = bitmapShader;
        drawable11 = drawable7;
        i3 = i4;
        float f102 = imageReceiver4.o1;
        if (f102 <= 0.0f) {
        }
        if (drawable11 == null) {
        }
        z2 = true;
        imageReceiver = imageReceiver2;
        canvas2 = canvas3;
        if (drawable12 == null) {
        }
        if (imageReceiver.H != null) {
        }
        if (z2) {
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00b3, code lost:
    
        if ((r9 instanceof ru3) == false) goto L176;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0255  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean h0(Drawable drawable, String str, int i, boolean z, int i2) {
        km m;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        boolean z2;
        ll5 ll5Var;
        boolean z3;
        if (drawable != null && str != null && this.q0 == i2) {
            if (i == 0) {
                if (str.equals(this.R)) {
                    ll5 ll5Var2 = this.h1;
                    if (ll5Var2 != null) {
                        ll5Var2.E(i, drawable);
                    }
                    if (drawable instanceof km) {
                        km kmVar = (km) drawable;
                        kmVar.C(this.r1, this.s1);
                        if (kmVar.o0) {
                            fl5.z().D(this.R);
                        }
                        if (this.z1) {
                            z3 = !kmVar.s();
                            this.T = drawable;
                            if (drawable instanceof v64) {
                            }
                            y0(drawable);
                            if (z3) {
                            }
                            this.i1 = 1.0f;
                            this.j1 = 1.0f;
                            ll5Var = this.h1;
                            if (ll5Var != null) {
                            }
                            if (!(drawable instanceof vl)) {
                            }
                            invalidate();
                            return true;
                        }
                        z3 = true;
                        this.T = drawable;
                        if (drawable instanceof v64) {
                        }
                        y0(drawable);
                        if (z3) {
                        }
                        this.i1 = 1.0f;
                        this.j1 = 1.0f;
                        ll5Var = this.h1;
                        if (ll5Var != null) {
                        }
                        if (!(drawable instanceof vl)) {
                        }
                        invalidate();
                        return true;
                    }
                    fl5.z().D(this.R);
                    if (this.z1 && (drawable == this.T || this.i1 < 1.0f)) {
                        z3 = false;
                        this.T = drawable;
                        if (drawable instanceof v64) {
                            v64 v64Var = (v64) drawable;
                            this.V = v64Var.b;
                            this.W = v64Var.a;
                        }
                        y0(drawable);
                        if (z3 || !this.R0 || (((z || this.T0) && !this.V0) || this.t1 == 0)) {
                            this.i1 = 1.0f;
                            this.j1 = 1.0f;
                        } else {
                            Drawable drawable5 = this.k0;
                            if (!(drawable5 instanceof oy8) || !((oy8) drawable5).p()) {
                                Drawable drawable6 = this.k0;
                                if (!(drawable6 instanceof km) || !((km) drawable6).s()) {
                                    if (this.T instanceof oy8) {
                                        Drawable drawable7 = this.n0;
                                        if (!(drawable7 instanceof v86)) {
                                            if (!(drawable7 instanceof kcb)) {
                                            }
                                        }
                                    }
                                    Drawable drawable8 = this.b0;
                                    if (drawable8 != null || this.n0 != null || this.V0) {
                                        if (drawable8 == null || this.n0 == null) {
                                            this.j1 = 1.0f;
                                        } else {
                                            this.j1 = this.i1;
                                        }
                                        this.i1 = 0.0f;
                                        this.k1 = System.currentTimeMillis();
                                        this.n1 = (this.D0 == null && this.b0 == null && this.n0 == null) ? false : true;
                                    }
                                }
                            }
                        }
                        ll5Var = this.h1;
                        if (ll5Var != null) {
                            Drawable drawable9 = this.T;
                            ll5Var.C(this, (drawable9 == null && this.b0 == null && this.n0 == null && this.k0 == null) ? false : true, drawable9 == null && this.k0 == null, z);
                        }
                        if (!(drawable instanceof vl)) {
                            vl vlVar = (vl) drawable;
                            if (this.y1) {
                                vlVar.a(this);
                            }
                        } else if (drawable instanceof km) {
                            km kmVar2 = (km) drawable;
                            boolean z4 = this.w0;
                            if (!kmVar2.o0) {
                                kmVar2.w0 = z4;
                            }
                            if (this.y1) {
                                kmVar2.e(this);
                            }
                            if (this.u0 && this.E == 0) {
                                kmVar2.j();
                            }
                            boolean z5 = this.x0;
                            kmVar2.E = z5;
                            if (z5) {
                                kmVar2.x(false);
                            }
                            this.A0 = false;
                            View view = this.e;
                            if (view != null) {
                                view.invalidate();
                            }
                        } else if (drawable instanceof oy8) {
                            oy8 oy8Var = (oy8) drawable;
                            if (this.y1) {
                                oy8Var.J0.add(this);
                            }
                            if (this.v0 && (!oy8Var.u() || this.E == 0)) {
                                oy8Var.start();
                            }
                            oy8Var.E(true);
                            oy8Var.F(this.y0);
                            oy8Var.M = this.z0;
                            oy8Var.F0 = this.b;
                            this.A0 = false;
                        }
                        invalidate();
                        return true;
                    }
                    z3 = true;
                    this.T = drawable;
                    if (drawable instanceof v64) {
                    }
                    y0(drawable);
                    if (z3) {
                    }
                    this.i1 = 1.0f;
                    this.j1 = 1.0f;
                    ll5Var = this.h1;
                    if (ll5Var != null) {
                    }
                    if (!(drawable instanceof vl)) {
                    }
                    invalidate();
                    return true;
                }
            } else {
                if (i != 3) {
                    if (i == 1) {
                        if (this.b0 == null && ((this.T0 || (((m = m()) == null || !m.s()) && (((drawable2 = this.T) == null || (drawable2 instanceof km)) && ((drawable3 = this.k0) == null || (drawable3 instanceof km))))) && str.equals(this.Z))) {
                            ll5 ll5Var3 = this.h1;
                            if (ll5Var3 != null) {
                                ll5Var3.E(i, drawable);
                            }
                            fl5.z().D(this.Z);
                            this.b0 = drawable;
                            if (drawable instanceof v64) {
                                v64 v64Var2 = (v64) drawable;
                                this.e0 = v64Var2.b;
                                this.f0 = v64Var2.a;
                            }
                            y0(drawable);
                            if (z || this.l1 == 2) {
                                this.i1 = 1.0f;
                                this.j1 = 1.0f;
                            } else {
                                Object obj = this.h;
                                if ((obj instanceof k27) && ((k27) obj).g4() && ((k27) this.h).n4()) {
                                    this.i1 = 1.0f;
                                    this.j1 = 1.0f;
                                } else {
                                    this.i1 = 0.0f;
                                    this.j1 = 1.0f;
                                    this.k1 = System.currentTimeMillis();
                                    this.n1 = this.n0 != null;
                                }
                            }
                        }
                    }
                    ll5Var = this.h1;
                    if (ll5Var != null) {
                    }
                    if (!(drawable instanceof vl)) {
                    }
                    invalidate();
                    return true;
                }
                if (str.equals(this.i0)) {
                    ll5 ll5Var4 = this.h1;
                    if (ll5Var4 != null) {
                        ll5Var4.E(i, drawable);
                    }
                    if (drawable instanceof km) {
                        km kmVar3 = (km) drawable;
                        kmVar3.C(this.r1, this.s1);
                        if (kmVar3.o0) {
                            fl5.z().D(this.i0);
                        }
                        if (this.z1 && (((z2 = (drawable4 = this.b0) instanceof km)) || (this.T instanceof km))) {
                            kmVar3.y(z2 ? ((km) drawable4).c : 0L, true, true);
                        }
                    } else {
                        fl5.z().D(this.i0);
                    }
                    this.k0 = drawable;
                    y0(drawable);
                    if (this.T == null) {
                        if ((z || this.T0) && !this.V0) {
                            this.i1 = 1.0f;
                            this.j1 = 1.0f;
                        } else {
                            Drawable drawable10 = this.b0;
                            if ((drawable10 == null && this.n0 == null) || this.i1 == 1.0f || this.V0) {
                                if (drawable10 == null || this.n0 == null) {
                                    this.j1 = 1.0f;
                                } else {
                                    this.j1 = this.i1;
                                }
                                this.i1 = 0.0f;
                                this.k1 = System.currentTimeMillis();
                                this.n1 = (this.D0 == null && this.b0 == null && this.n0 == null) ? false : true;
                            }
                        }
                    }
                    ll5Var = this.h1;
                    if (ll5Var != null) {
                    }
                    if (!(drawable instanceof vl)) {
                    }
                    invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    public final void i(Canvas canvas, BitmapDrawable bitmapDrawable, il5 il5Var, int i) {
        if (il5Var == null) {
            bitmapDrawable.setAlpha(i);
            if (bitmapDrawable instanceof oy8) {
                ((oy8) bitmapDrawable).l(canvas, null, false, this.s, 0);
                return;
            } else if (bitmapDrawable instanceof km) {
                ((km) bitmapDrawable).l(canvas, false, this.s, 0);
                return;
            } else {
                bitmapDrawable.draw(canvas);
                return;
            }
        }
        if (bitmapDrawable instanceof oy8) {
            oy8 oy8Var = (oy8) bitmapDrawable;
            float f = il5Var.u;
            float f2 = il5Var.v;
            float f3 = il5Var.t;
            float f4 = il5Var.s;
            ColorFilter colorFilter = il5Var.z;
            int i2 = il5Var.d;
            Paint[] paintArr = oy8Var.k0;
            RectF[] rectFArr = oy8Var.j0;
            if (rectFArr[i2] == null) {
                rectFArr[i2] = new RectF();
                Paint paint = new Paint(1);
                paintArr[i2] = paint;
                paint.setFilterBitmap(true);
            }
            paintArr[i2].setAlpha(i);
            paintArr[i2].setColorFilter(colorFilter);
            rectFArr[i2].set(f, f2, f + f3, f4 + f2);
            oy8Var.l(canvas, null, true, 0L, i2);
            return;
        }
        if (!(bitmapDrawable instanceof km)) {
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (bitmap != null) {
                Paint paint2 = il5Var.A;
                if (paint2 == null) {
                    paint2 = new Paint(1);
                    il5Var.A = paint2;
                }
                paint2.setAlpha(i);
                il5Var.A.setColorFilter(il5Var.z);
                canvas.save();
                canvas.translate(il5Var.u, il5Var.v);
                canvas.scale(il5Var.t / bitmap.getWidth(), il5Var.s / bitmap.getHeight());
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, il5Var.A);
                canvas.restore();
                return;
            }
            return;
        }
        km kmVar = (km) bitmapDrawable;
        float f5 = il5Var.u;
        float f6 = il5Var.v;
        float f7 = il5Var.t;
        float f8 = il5Var.s;
        ColorFilter colorFilter2 = il5Var.z;
        int i3 = il5Var.d;
        Paint[] paintArr2 = kmVar.r0;
        RectF[] rectFArr2 = kmVar.q0;
        if (rectFArr2[i3] == null) {
            rectFArr2[i3] = new RectF();
            Paint paint3 = new Paint();
            paintArr2[i3] = paint3;
            paint3.setFilterBitmap(true);
        }
        paintArr2[i3].setAlpha(i);
        paintArr2[i3].setColorFilter(colorFilter2);
        rectFArr2[i3].set(f5, f6, f7 + f5, f8 + f6);
        kmVar.l(canvas, true, 0L, i3);
    }

    public final void i0(float f, float f2, float f3, float f4) {
        this.L0 = f;
        this.M0 = f2;
        this.N0 = f3;
        this.O0 = f4;
    }

    public void invalidate() {
        View view = this.e;
        if (view == null) {
            return;
        }
        if (this.K0) {
            view.invalidate();
            return;
        }
        float f = this.L0;
        float f2 = this.M0;
        view.invalidate((int) f, (int) f2, (int) (f + this.N0), (int) (f2 + this.O0));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:383|(1:385)(8:406|(2:408|(1:410))|411|(1:389)|390|391|(1:(3:394|(1:396)|397)(1:402))(1:403)|(2:399|400)(1:401))|386|(1:389)|390|391|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x087d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x087e, code lost:
    
        fa4.g(r0, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:401:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0878 A[Catch: Exception -> 0x087d, TRY_LEAVE, TryCatch #0 {Exception -> 0x087d, blocks: (B:391:0x084a, B:394:0x0851, B:396:0x0859, B:397:0x085d, B:402:0x0873, B:403:0x0878), top: B:390:0x084a }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(Canvas canvas, Drawable drawable, int i, BitmapShader bitmapShader, int i2, int i3, int i4, il5 il5Var) {
        float f;
        float f2;
        float f3;
        float f4;
        ColorFilter colorFilter;
        RectF rectF;
        int[] iArr;
        kcb kcbVar;
        kcb kcbVar2;
        ColorFilter colorFilter2;
        boolean z;
        boolean z2;
        int i5;
        int intrinsicHeight;
        int intrinsicWidth;
        boolean z3;
        boolean z4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        il5 il5Var2;
        float f10;
        float f11;
        if (il5Var != null) {
            f = il5Var.u;
            f2 = il5Var.v;
            f3 = il5Var.s;
            f4 = il5Var.t;
            rectF = il5Var.y;
            colorFilter = il5Var.z;
            iArr = il5Var.h;
        } else {
            f = this.L0;
            f2 = this.M0;
            f3 = this.O0;
            f4 = this.N0;
            colorFilter = this.p1;
            rectF = this.Q0;
            iArr = this.X0;
        }
        int[] iArr2 = !this.W0 ? null : iArr;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            boolean z5 = drawable instanceof oy8;
            if (z5) {
                ((oy8) drawable).a = this.B1;
            } else if (drawable instanceof km) {
                ((km) drawable).a = this.B1;
            }
            Paint paint = this.a1;
            Paint paint2 = bitmapShader != null ? paint : bitmapDrawable.getPaint();
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 29) {
                Object obj = this.G;
                if (obj == null || this.I != null) {
                    colorFilter2 = null;
                    paint2.setBlendMode(null);
                    if (paint2 != null || paint2.getColorFilter() == null) {
                        if (i4 != 0) {
                            if (i4 == 1) {
                                ColorFilter colorFilter3 = H1;
                                if (bitmapShader != null) {
                                    paint.setColorFilter(colorFilter3);
                                } else {
                                    bitmapDrawable.setColorFilter(colorFilter3);
                                }
                            } else {
                                ColorFilter colorFilter4 = I1;
                                if (bitmapShader != null) {
                                    paint.setColorFilter(colorFilter4);
                                } else {
                                    bitmapDrawable.setColorFilter(colorFilter4);
                                }
                            }
                        }
                    } else if (i4 == 0) {
                        if (bitmapShader != null) {
                            paint.setColorFilter(colorFilter2);
                        } else if (this.n0 != drawable) {
                            bitmapDrawable.setColorFilter(colorFilter2);
                        }
                    }
                    if (colorFilter != null && this.I == null) {
                        if (bitmapShader == null) {
                            paint.setColorFilter(colorFilter);
                        } else {
                            bitmapDrawable.setColorFilter(colorFilter);
                        }
                    }
                    z = bitmapDrawable instanceof km;
                    if (!z || (bitmapDrawable instanceof oy8)) {
                        z2 = z;
                        i5 = i2 % 360;
                        if (i5 != 90 || i5 == 270) {
                            intrinsicHeight = bitmapDrawable.getIntrinsicHeight();
                            intrinsicWidth = bitmapDrawable.getIntrinsicWidth();
                        } else {
                            intrinsicHeight = bitmapDrawable.getIntrinsicWidth();
                            intrinsicWidth = bitmapDrawable.getIntrinsicHeight();
                        }
                        z3 = false;
                    } else {
                        Bitmap bitmap = bitmapDrawable.getBitmap();
                        if (bitmap != null && bitmap.isRecycled()) {
                            return;
                        }
                        z2 = z;
                        int i7 = i2 % 360;
                        if (i7 == 90 || i7 == 270) {
                            intrinsicHeight = bitmap.getHeight();
                            intrinsicWidth = bitmap.getWidth();
                        } else {
                            intrinsicHeight = bitmap.getWidth();
                            intrinsicWidth = bitmap.getHeight();
                        }
                        z3 = bitmapDrawable instanceof ml5;
                    }
                    float f12 = this.P0 * 2.0f;
                    z4 = z3;
                    float f13 = f4 - f12;
                    float f14 = f3 - f12;
                    float f15 = f4 != 0.0f ? 1.0f : intrinsicHeight / f13;
                    float f16 = f3 != 0.0f ? 1.0f : intrinsicWidth / f14;
                    if (z4) {
                        f15 /= 1.2f;
                        f16 /= 1.2f;
                    }
                    float f17 = f15;
                    float f18 = f16;
                    if (bitmapShader == null && il5Var == null) {
                        boolean z6 = this.S0;
                        float[] fArr = J1;
                        Path path = this.d1;
                        RectF rectF2 = this.b1;
                        Matrix matrix = this.c1;
                        if (z6) {
                            float max = Math.max(f17, f18);
                            float f19 = (int) (intrinsicHeight / max);
                            float f20 = (int) (intrinsicWidth / max);
                            rectF.set(oo1.z(f4, f19, 2.0f, f), oo1.z(f3, f20, 2.0f, f2), tb4.e(f4, f19, 2.0f, f), tb4.e(f3, f20, 2.0f, f2));
                            if (this.R0) {
                                matrix.reset();
                                matrix.setTranslate((int) rectF.left, (int) rectF.top);
                                if (i3 != 0) {
                                    matrix.preScale(i3 == 1 ? -1.0f : 1.0f, i3 == 2 ? -1.0f : 1.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
                                }
                                if (i2 == 90) {
                                    matrix.preRotate(90.0f);
                                    matrix.preTranslate(0.0f, -rectF.width());
                                } else if (i2 == 180) {
                                    matrix.preRotate(180.0f);
                                    matrix.preTranslate(-rectF.width(), -rectF.height());
                                } else if (i2 == 270) {
                                    matrix.preRotate(270.0f);
                                    matrix.preTranslate(-rectF.height(), 0.0f);
                                }
                                float f21 = 1.0f / max;
                                matrix.preScale(f21, f21);
                                bitmapShader.setLocalMatrix(matrix);
                                paint.setShader(bitmapShader);
                                paint.setAlpha(i);
                                rectF2.set(rectF);
                                if (!this.Y0 || !this.W0) {
                                    int[] iArr3 = iArr2;
                                    for (int i8 = 0; i8 < iArr3.length; i8++) {
                                        int i9 = i8 << 1;
                                        float f22 = iArr3[i8];
                                        fArr[i9] = f22;
                                        fArr[i9 + 1] = f22;
                                    }
                                    path.reset();
                                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                                    path.close();
                                    if (canvas != null) {
                                        canvas.drawPath(path, paint);
                                    }
                                } else if (canvas != null) {
                                    try {
                                        int i10 = iArr2[0];
                                        if (i10 == 0) {
                                            canvas.drawRect(rectF2, paint);
                                        } else {
                                            float f23 = i10;
                                            canvas.drawRoundRect(rectF2, f23, f23, paint);
                                        }
                                    } catch (Exception e) {
                                        J(bitmapDrawable);
                                        fa4.g(e, true);
                                    }
                                }
                            }
                        } else {
                            float f24 = f4;
                            int[] iArr4 = iArr2;
                            float f25 = f3;
                            if (this.M != null) {
                                rectF2.set(0.0f, 0.0f, this.K.getWidth(), this.K.getHeight());
                                this.M.drawBitmap(this.H, (Rect) null, rectF2, (Paint) null);
                                this.M.drawBitmap(bitmapDrawable.getBitmap(), (Rect) null, rectF2, this.N);
                            }
                            if (bitmapShader != this.U || this.I == null) {
                                paint.setShader(bitmapShader);
                            } else {
                                Shader shader = this.J;
                                if (shader != null) {
                                    paint.setShader(shader);
                                } else {
                                    paint.setShader(this.L);
                                }
                            }
                            float min = 1.0f / Math.min(f17, f18);
                            float f26 = this.P0;
                            rectF2.set(f + f26, f2 + f26, (f + f24) - f26, (f2 + f25) - f26);
                            if (Math.abs(f17 - f18) > 5.0E-4f) {
                                float f27 = intrinsicHeight / f18;
                                if (f27 > f13) {
                                    float f28 = (int) f27;
                                    f11 = f13;
                                    rectF.set(tb4.x(f28, f11, 2.0f, f), f2, tb4.e(f28, f11, 2.0f, f), f2 + f14);
                                    f10 = f14;
                                } else {
                                    f11 = f13;
                                    float f29 = (int) (intrinsicWidth / f17);
                                    f10 = f14;
                                    rectF.set(f, tb4.x(f29, f10, 2.0f, f2), f + f11, tb4.e(f29, f10, 2.0f, f2));
                                }
                            } else {
                                f10 = f14;
                                f11 = f13;
                                rectF.set(f, f2, f + f11, f2 + f10);
                            }
                            if (this.R0) {
                                matrix.reset();
                                if (z4) {
                                    matrix.setTranslate((rectF.left + this.P0) - (((rectF.width() * 1.2f) - rectF.width()) / 2.0f), (rectF.top + this.P0) - (((rectF.height() * 1.2f) - rectF.height()) / 2.0f));
                                } else {
                                    float f30 = rectF.left;
                                    float f31 = this.P0;
                                    matrix.setTranslate(f30 + f31, rectF.top + f31);
                                }
                                if (i3 != 0) {
                                    matrix.preScale(i3 == 1 ? -1.0f : 1.0f, i3 == 2 ? -1.0f : 1.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
                                }
                                if (i2 == 90) {
                                    matrix.preRotate(90.0f);
                                    matrix.preTranslate(0.0f, -rectF.width());
                                } else if (i2 == 180) {
                                    matrix.preRotate(180.0f);
                                    matrix.preTranslate(-rectF.width(), -rectF.height());
                                } else if (i2 == 270) {
                                    matrix.preRotate(270.0f);
                                    matrix.preTranslate(-rectF.height(), 0.0f);
                                }
                                matrix.preScale(min, min);
                                if (this.q1) {
                                    float f32 = ((gl.x << 1) + f11) / f11;
                                    matrix.postScale(f32, f32, rectF.centerX(), rectF.centerY());
                                }
                                BitmapShader bitmapShader2 = this.L;
                                if (bitmapShader2 != null) {
                                    bitmapShader2.setLocalMatrix(matrix);
                                }
                                bitmapShader.setLocalMatrix(matrix);
                                if (this.J != null) {
                                    int width = this.H.getWidth();
                                    int height = this.H.getHeight();
                                    float f33 = f4 == 0.0f ? 1.0f : width / f11;
                                    float f34 = f3 == 0.0f ? 1.0f : height / f10;
                                    if (Math.abs(f33 - f34) > 5.0E-4f) {
                                        float f35 = width / f34;
                                        if (f35 > f11) {
                                            width = (int) f35;
                                            float f36 = width;
                                            rectF.set(tb4.x(f36, f11, 2.0f, f), f2, tb4.e(f36, f11, 2.0f, f), f2 + f10);
                                        } else {
                                            height = (int) (height / f33);
                                            float f37 = height;
                                            rectF.set(f, tb4.x(f37, f10, 2.0f, f2), f + f11, tb4.e(f37, f10, 2.0f, f2));
                                        }
                                    } else {
                                        rectF.set(f, f2, f + f11, f2 + f10);
                                    }
                                    float min2 = 1.0f / Math.min(f4 == 0.0f ? 1.0f : width / f11, f3 == 0.0f ? 1.0f : height / f10);
                                    matrix.reset();
                                    float f38 = rectF.left;
                                    float f39 = this.P0;
                                    matrix.setTranslate(f38 + f39, rectF.top + f39);
                                    matrix.preScale(min2, min2);
                                    this.I.setLocalMatrix(matrix);
                                }
                                paint.setAlpha(i);
                                if (!this.Y0 || !this.W0) {
                                    for (int i11 = 0; i11 < iArr4.length; i11++) {
                                        int i12 = i11 << 1;
                                        float f40 = iArr4[i11];
                                        fArr[i12] = f40;
                                        fArr[i12 + 1] = f40;
                                    }
                                    path.reset();
                                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                                    path.close();
                                    if (canvas != null) {
                                        canvas.drawPath(path, paint);
                                    }
                                } else if (canvas != null) {
                                    try {
                                        int i13 = iArr4[0];
                                        if (i13 != 0) {
                                            float f41 = i13;
                                            canvas.drawRoundRect(rectF2, f41, f41, paint);
                                        } else if (z4) {
                                            RectF rectF3 = gl.P;
                                            rectF3.set(rectF2);
                                            rectF3.inset((-((rectF.width() * 1.2f) - rectF.width())) / 2.0f, (-((rectF.height() * 1.2f) - rectF.height())) / 2.0f);
                                            canvas.drawRect(rectF3, paint);
                                        } else {
                                            canvas.drawRect(rectF2, paint);
                                        }
                                    } catch (Exception e2) {
                                        if (il5Var == null) {
                                            J(bitmapDrawable);
                                        }
                                        fa4.g(e2, true);
                                    }
                                }
                            }
                        }
                    } else {
                        float f42 = f4;
                        int[] iArr5 = iArr2;
                        float f43 = f3;
                        if (!this.S0) {
                            float max2 = Math.max(f17, f18);
                            canvas.save();
                            int i14 = (int) (intrinsicHeight / max2);
                            int i15 = (int) (intrinsicWidth / max2);
                            if (il5Var == null) {
                                float f44 = i14;
                                f9 = f42;
                                float f45 = i15;
                                f8 = f43;
                                rectF.set(oo1.z(f9, f44, 2.0f, f), oo1.z(f8, f45, 2.0f, f2), tb4.e(f9, f44, 2.0f, f), tb4.e(f8, f45, 2.0f, f2));
                                bitmapDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                                if (z2) {
                                    ((km) bitmapDrawable).z(rectF.left, rectF.top, rectF.width(), rectF.height());
                                }
                            } else {
                                f8 = f43;
                                f9 = f42;
                            }
                            if (il5Var == null || iArr5 == null || iArr5[0] <= 0) {
                                il5Var2 = il5Var;
                            } else {
                                canvas.save();
                                il5Var2 = il5Var;
                                Path path2 = il5Var2.B;
                                if (path2 == null) {
                                    path2 = new Path();
                                    il5Var2.B = path2;
                                }
                                path2.rewind();
                                RectF rectF4 = gl.P;
                                rectF4.set(f, f2, f + f9, f8 + f2);
                                path2.addRoundRect(rectF4, iArr5[0], iArr5[2], Path.Direction.CW);
                                canvas.clipPath(path2);
                            }
                            if (this.R0) {
                                try {
                                    bitmapDrawable.setAlpha(i);
                                    i(canvas, bitmapDrawable, il5Var2, i);
                                } catch (Exception e3) {
                                    if (il5Var2 == null) {
                                        J(bitmapDrawable);
                                    }
                                    fa4.g(e3, true);
                                }
                            }
                            canvas.restore();
                            if (il5Var2 != null && iArr5 != null && iArr5[0] > 0) {
                                canvas.restore();
                            }
                        } else if (canvas != null) {
                            if (Math.abs(f17 - f18) > 1.0E-5f) {
                                canvas.save();
                                if (this.C1) {
                                    f6 = f18;
                                    canvas.clipRect(f, f2, f + f42, f2 + f43);
                                } else {
                                    f6 = f18;
                                }
                                if (i3 == 1) {
                                    f7 = 2.0f;
                                    canvas.scale(-1.0f, 1.0f, f42 / 2.0f, f43 / 2.0f);
                                } else {
                                    f7 = 2.0f;
                                    if (i3 == 2) {
                                        canvas.scale(1.0f, -1.0f, f42 / 2.0f, f43 / 2.0f);
                                    }
                                }
                                int i16 = i2 % 360;
                                if (i16 != 0) {
                                    if (this.g1) {
                                        canvas.rotate(i2, f42 / f7, f43 / f7);
                                    } else {
                                        canvas.rotate(i2, 0.0f, 0.0f);
                                    }
                                }
                                float f46 = intrinsicHeight / f6;
                                if (f46 > f42) {
                                    float f47 = (int) f46;
                                    rectF.set(tb4.x(f47, f42, 2.0f, f), f2, tb4.e(f47, f42, 2.0f, f), f2 + f43);
                                } else {
                                    float f48 = (int) (intrinsicWidth / f17);
                                    rectF.set(f, tb4.x(f48, f43, 2.0f, f2), f + f42, tb4.e(f48, f43, 2.0f, f2));
                                }
                                if (z2) {
                                    ((km) bitmapDrawable).z(f, f2, f42, f43);
                                }
                                if (il5Var == null) {
                                    if (i16 == 90 || i16 == 270) {
                                        float width2 = rectF.width() / 2.0f;
                                        float height2 = rectF.height() / 2.0f;
                                        float centerX = rectF.centerX();
                                        float centerY = rectF.centerY();
                                        bitmapDrawable.setBounds((int) (centerX - height2), (int) (centerY - width2), (int) (centerX + height2), (int) (centerY + width2));
                                    } else {
                                        bitmapDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                                    }
                                }
                                if (this.R0) {
                                    if (i6 >= 29) {
                                        try {
                                            if (this.G != null) {
                                                bitmapDrawable.getPaint().setBlendMode(wn4.e(this.G));
                                            } else {
                                                bitmapDrawable.getPaint().setBlendMode(null);
                                            }
                                        } catch (Exception e4) {
                                            if (il5Var == null) {
                                                J(bitmapDrawable);
                                            }
                                            fa4.g(e4, true);
                                        }
                                    }
                                    i(canvas, bitmapDrawable, il5Var, i);
                                }
                                canvas.restore();
                            } else {
                                canvas.save();
                                if (i3 == 1) {
                                    f5 = 2.0f;
                                    canvas.scale(-1.0f, 1.0f, f42 / 2.0f, f43 / 2.0f);
                                } else {
                                    f5 = 2.0f;
                                    if (i3 == 2) {
                                        canvas.scale(1.0f, -1.0f, f42 / 2.0f, f43 / 2.0f);
                                    }
                                }
                                int i17 = i2 % 360;
                                if (i17 != 0) {
                                    if (this.g1) {
                                        canvas.rotate(i2, f42 / f5, f43 / f5);
                                    } else {
                                        canvas.rotate(i2, 0.0f, 0.0f);
                                    }
                                }
                                rectF.set(f, f2, f + f42, f2 + f43);
                                if (this.q1) {
                                    float f49 = -gl.x;
                                    rectF.inset(f49, f49);
                                }
                                if (z2) {
                                    ((km) bitmapDrawable).z(f, f2, f42, f43);
                                }
                                if (il5Var == null) {
                                    if (i17 == 90 || i17 == 270) {
                                        float width3 = rectF.width() / 2.0f;
                                        float height3 = rectF.height() / 2.0f;
                                        float centerX2 = rectF.centerX();
                                        float centerY2 = rectF.centerY();
                                        bitmapDrawable.setBounds((int) (centerX2 - height3), (int) (centerY2 - width3), (int) (centerX2 + height3), (int) (centerY2 + width3));
                                    } else {
                                        bitmapDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                                    }
                                }
                                if (this.R0) {
                                    if (i6 >= 29) {
                                        try {
                                            if (this.G != null) {
                                                bitmapDrawable.getPaint().setBlendMode(wn4.e(this.G));
                                            } else {
                                                bitmapDrawable.getPaint().setBlendMode(null);
                                            }
                                        } catch (Exception e5) {
                                            J(bitmapDrawable);
                                            fa4.g(e5, true);
                                        }
                                    }
                                    i(canvas, bitmapDrawable, il5Var, i);
                                }
                                canvas.restore();
                            }
                        }
                    }
                    if (!z5) {
                        ((oy8) drawable).a = false;
                        return;
                    } else {
                        if (drawable instanceof km) {
                            ((km) drawable).a = false;
                            return;
                        }
                        return;
                    }
                }
                paint2.setBlendMode(wn4.e(obj));
            }
            colorFilter2 = null;
            if (paint2 != null) {
            }
            if (i4 != 0) {
            }
            if (colorFilter != null) {
                if (bitmapShader == null) {
                }
            }
            z = bitmapDrawable instanceof km;
            if (z) {
            }
            z2 = z;
            i5 = i2 % 360;
            if (i5 != 90) {
            }
            intrinsicHeight = bitmapDrawable.getIntrinsicHeight();
            intrinsicWidth = bitmapDrawable.getIntrinsicWidth();
            z3 = false;
            float f122 = this.P0 * 2.0f;
            z4 = z3;
            float f132 = f4 - f122;
            float f142 = f3 - f122;
            float f152 = f4 != 0.0f ? 1.0f : intrinsicHeight / f132;
            if (f3 != 0.0f) {
            }
            if (z4) {
            }
            float f172 = f152;
            float f182 = f16;
            if (bitmapShader == null) {
            }
            float f422 = f4;
            int[] iArr52 = iArr2;
            float f432 = f3;
            if (!this.S0) {
            }
            if (!z5) {
            }
        } else {
            float f50 = f4;
            if (il5Var == null) {
                if (this.S0) {
                    int intrinsicWidth2 = drawable.getIntrinsicWidth();
                    int intrinsicHeight2 = drawable.getIntrinsicHeight();
                    float f51 = this.P0 * 2.0f;
                    float f52 = f50 - f51;
                    float f53 = f3 - f51;
                    float max3 = Math.max(f50 != 0.0f ? intrinsicWidth2 / f52 : 1.0f, f3 == 0.0f ? 1.0f : intrinsicHeight2 / f53);
                    float f54 = (int) (intrinsicWidth2 / max3);
                    float f55 = (int) (intrinsicHeight2 / max3);
                    rectF.set(oo1.z(f50, f54, 2.0f, f), oo1.z(f3, f55, 2.0f, f2), tb4.e(f50, f54, 2.0f, f), tb4.e(f3, f55, 2.0f, f2));
                } else {
                    rectF.set(f, f2, f + f50, f3 + f2);
                }
                drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            }
            if (!this.R0 || canvas == null) {
                return;
            }
            if (!(drawable instanceof kcb)) {
                if (drawable instanceof ni2) {
                    Drawable drawable2 = ((ni2) drawable).a;
                    if (drawable2 instanceof kcb) {
                        kcbVar2 = (kcb) drawable2;
                        kcbVar2.k = this;
                    }
                }
                kcbVar = null;
                if (colorFilter != null && drawable != null) {
                    drawable.setColorFilter(colorFilter);
                }
                drawable.setAlpha(i);
                if (il5Var != null) {
                    drawable.draw(canvas);
                } else if (kcbVar != null) {
                    long j = il5Var.c;
                    if (j == 0) {
                        j = System.currentTimeMillis();
                    }
                    ((kcb) drawable).c(canvas, true, il5Var.d, j, il5Var.u, il5Var.v, il5Var.t, il5Var.s);
                } else {
                    drawable.draw(canvas);
                }
                if (kcbVar == null) {
                    kcbVar.k = null;
                    return;
                }
                return;
            }
            kcbVar2 = (kcb) drawable;
            kcbVar2.k = this;
            kcbVar = kcbVar2;
            if (colorFilter != null) {
                drawable.setColorFilter(colorFilter);
            }
            drawable.setAlpha(i);
            if (il5Var != null) {
            }
            if (kcbVar == null) {
            }
        }
    }

    public final void j0(Rect rect) {
        if (rect != null) {
            this.L0 = rect.left;
            this.M0 = rect.top;
            this.N0 = rect.width();
            this.O0 = rect.height();
        }
    }

    public final void k(Canvas canvas, Drawable drawable, int i, BitmapShader bitmapShader, int i2, int i3, il5 il5Var) {
        if (this.f1 == 0) {
            float f = this.u1;
            if (f != 0.0f) {
                float f2 = f - 0.10666667f;
                this.u1 = f2;
                if (f2 < 0.0f) {
                    this.u1 = 0.0f;
                }
                invalidate();
            }
        }
        int i4 = this.f1;
        if (i4 != 0) {
            this.u1 = 1.0f;
            this.v1 = i4;
        }
        float f3 = this.u1;
        if (f3 == 0.0f || f3 == 1.0f) {
            j(canvas, drawable, i, bitmapShader, i2, i3, i4, il5Var);
        } else {
            j(canvas, drawable, i, bitmapShader, i2, i3, i4, il5Var);
            j(canvas, drawable, (int) (i * this.u1), bitmapShader, i2, i3, this.v1, il5Var);
        }
    }

    public final void k0(RectF rectF) {
        if (rectF != null) {
            this.L0 = rectF.left;
            this.M0 = rectF.top;
            this.N0 = rectF.width();
            this.O0 = rectF.height();
        }
    }

    public final vl l() {
        Drawable drawable = this.k0;
        if (drawable instanceof vl) {
            return (vl) drawable;
        }
        Drawable drawable2 = this.T;
        if (drawable2 instanceof vl) {
            return (vl) drawable2;
        }
        Drawable drawable3 = this.b0;
        if (drawable3 instanceof vl) {
            return (vl) drawable3;
        }
        Drawable drawable4 = this.n0;
        if (drawable4 instanceof vl) {
            return (vl) drawable4;
        }
        return null;
    }

    public final void l0(int i) {
        this.N0 = i;
    }

    public final km m() {
        Drawable drawable = this.k0;
        if (drawable instanceof km) {
            return (km) drawable;
        }
        Drawable drawable2 = this.T;
        if (drawable2 instanceof km) {
            return (km) drawable2;
        }
        Drawable drawable3 = this.b0;
        if (drawable3 instanceof km) {
            return (km) drawable3;
        }
        Drawable drawable4 = this.n0;
        if (drawable4 instanceof km) {
            return (km) drawable4;
        }
        return null;
    }

    public final void m0(int i) {
        this.x = i;
        if (this.y1) {
            this.E = kk7.e().p & (~this.x);
        }
    }

    public final Bitmap n() {
        oy8 y = y();
        if (y != null && y.p()) {
            if (y.R != null) {
                return y.R;
            }
            if (y.S != null) {
                return y.S;
            }
            return null;
        }
        km m = m();
        if (m != null && m.s()) {
            return m.m();
        }
        Drawable drawable = this.k0;
        if ((drawable instanceof BitmapDrawable) && !(drawable instanceof km) && !(drawable instanceof oy8)) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Drawable drawable2 = this.T;
        if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof km) && !(drawable instanceof oy8)) {
            return ((BitmapDrawable) drawable2).getBitmap();
        }
        Drawable drawable3 = this.b0;
        if ((drawable3 instanceof BitmapDrawable) && !(drawable3 instanceof km) && !(drawable instanceof oy8)) {
            return ((BitmapDrawable) drawable3).getBitmap();
        }
        Drawable drawable4 = this.n0;
        if (drawable4 instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable4).getBitmap();
        }
        return null;
    }

    public final void n0(long j, long j2) {
        this.r1 = j;
        this.s1 = j2;
        Drawable drawable = this.k0;
        if (drawable instanceof km) {
            ((km) drawable).C(j, j2);
        }
    }

    public final int o() {
        km m = m();
        if (m != null) {
            int i = this.V;
            return (i % 360 == 0 || i % 360 == 180) ? m.getIntrinsicHeight() : m.getIntrinsicWidth();
        }
        oy8 y = y();
        if (y != null) {
            return y.c;
        }
        Bitmap n = n();
        if (n != null) {
            int i2 = this.V;
            return (i2 % 360 == 0 || i2 % 360 == 180) ? n.getHeight() : n.getWidth();
        }
        Drawable drawable = this.n0;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return 1;
    }

    public final void o0(int i, int i2, boolean z) {
        while (i < 0) {
            i += 360;
        }
        while (i > 360) {
            i -= 360;
        }
        this.e0 = i;
        this.V = i;
        this.f0 = i2;
        this.W = i2;
        this.g1 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jl5 p() {
        Bitmap bitmap;
        String str;
        Bitmap bitmap2;
        String str2;
        km m = m();
        oy8 y = y();
        int i = 0;
        if (y != null && y.p()) {
            bitmap = y.R != null ? y.R : y.S != null ? y.S : null;
        } else if (m == null || !m.s()) {
            Drawable drawable = this.k0;
            if (!(drawable instanceof BitmapDrawable) || (drawable instanceof km) || (drawable instanceof oy8)) {
                Drawable drawable2 = this.T;
                if (!(drawable2 instanceof BitmapDrawable) || (drawable2 instanceof km) || (drawable instanceof oy8)) {
                    Drawable drawable3 = this.b0;
                    if (!(drawable3 instanceof BitmapDrawable) || (drawable3 instanceof km) || (drawable instanceof oy8)) {
                        Drawable drawable4 = this.n0;
                        if (!(drawable4 instanceof BitmapDrawable)) {
                            bitmap = null;
                            str = null;
                            if (bitmap != null) {
                                return new jl5(bitmap, str, i);
                            }
                            return null;
                        }
                        bitmap = ((BitmapDrawable) drawable4).getBitmap();
                    } else {
                        bitmap2 = ((BitmapDrawable) drawable3).getBitmap();
                        str2 = this.Z;
                    }
                } else {
                    bitmap2 = ((BitmapDrawable) drawable2).getBitmap();
                    str2 = this.R;
                }
            } else {
                bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                str2 = this.i0;
            }
            Bitmap bitmap3 = bitmap2;
            str = str2;
            bitmap = bitmap3;
            if (bitmap != null) {
            }
        } else {
            bitmap = m.m();
            i = m.d[2];
            if (i != 0) {
                return new jl5(Bitmap.createBitmap(bitmap), null, i);
            }
        }
        str = null;
        if (bitmap != null) {
        }
    }

    public final void p0(View view) {
        this.e = view;
        km m = m();
        if (m == null || !this.y1) {
            return;
        }
        View view2 = this.e;
        if (m.s0 == null) {
            m.s0 = new WeakReference(view2);
        }
    }

    public final int q() {
        km m = m();
        if (m != null) {
            int i = this.V;
            return (i % 360 == 0 || i % 360 == 180) ? m.getIntrinsicWidth() : m.getIntrinsicHeight();
        }
        oy8 y = y();
        if (y != null) {
            return y.b;
        }
        Bitmap n = n();
        if (n != null) {
            int i2 = this.V;
            return (i2 % 360 == 0 || i2 % 360 == 180) ? n.getWidth() : n.getHeight();
        }
        Drawable drawable = this.n0;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return 1;
    }

    public final void q0(int i) {
        s0(new int[]{i, i, i, i});
    }

    public final float r() {
        return (this.N0 / 2.0f) + this.L0;
    }

    public final void r0(int i, int i2, int i3, int i4) {
        s0(new int[]{i, i2, i3, i4});
    }

    public final float s() {
        return (this.O0 / 2.0f) + this.M0;
    }

    public void s0(int[] iArr) {
        int i = iArr[0];
        this.Y0 = true;
        int i2 = 0;
        boolean z = false;
        while (true) {
            int[] iArr2 = this.X0;
            if (i2 >= iArr2.length) {
                break;
            }
            int i3 = iArr2[i2];
            int i4 = iArr[i2];
            if (i3 != i4) {
                z = true;
            }
            if (i != i4) {
                this.Y0 = false;
            }
            iArr2[i2] = i4;
            i2++;
        }
        if (z) {
            Drawable drawable = this.T;
            if (drawable != null && this.U == null) {
                y0(drawable);
            }
            Drawable drawable2 = this.k0;
            if (drawable2 != null && this.l0 == null) {
                y0(drawable2);
            }
            Drawable drawable3 = this.b0;
            if (drawable3 != null) {
                y0(drawable3);
            }
            Drawable drawable4 = this.n0;
            if (drawable4 != null) {
                y0(drawable4);
            }
        }
    }

    public void setAlpha(float f) {
        this.e1 = f;
    }

    public final Drawable t() {
        Drawable drawable = this.k0;
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = this.T;
        if (drawable2 != null) {
            return drawable2;
        }
        Drawable drawable3 = this.b0;
        if (drawable3 != null) {
            return drawable3;
        }
        Drawable drawable4 = this.n0;
        if (drawable4 != null) {
            return drawable4;
        }
        return null;
    }

    public final void t0() {
        if (!this.W0) {
            this.W0 = true;
            Drawable drawable = this.T;
            if (drawable != null && this.U == null) {
                y0(drawable);
            }
            Drawable drawable2 = this.k0;
            if (drawable2 != null && this.l0 == null) {
                y0(drawable2);
            }
            Drawable drawable3 = this.b0;
            if (drawable3 != null) {
                y0(drawable3);
            }
            Drawable drawable4 = this.n0;
            if (drawable4 != null) {
                y0(drawable4);
            }
        }
    }

    public final jl5 u() {
        String str;
        Drawable drawable = this.k0;
        if (!(drawable instanceof BitmapDrawable) || (drawable instanceof km) || (drawable instanceof oy8)) {
            Drawable drawable2 = this.T;
            if (!(drawable2 instanceof BitmapDrawable) || (drawable2 instanceof km) || (drawable instanceof oy8)) {
                drawable2 = this.b0;
                if (!(drawable2 instanceof BitmapDrawable) || (drawable2 instanceof km) || (drawable instanceof oy8)) {
                    drawable = this.n0;
                    if (drawable instanceof BitmapDrawable) {
                        str = null;
                    } else {
                        str = null;
                        drawable = null;
                    }
                } else {
                    str = this.Z;
                }
            } else {
                str = this.R;
            }
            drawable = drawable2;
        } else {
            str = this.i0;
        }
        if (drawable == null) {
            return null;
        }
        jl5 jl5Var = new jl5();
        jl5Var.d = drawable;
        jl5Var.a = str;
        jl5Var.e = 0;
        if (str != null) {
            fl5.z().D(jl5Var.a);
        }
        return jl5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u0(Drawable drawable) {
        yx yxVar;
        Drawable drawable2 = this.n0;
        if (drawable != drawable2) {
            if (!(drawable2 instanceof yx)) {
                yxVar = null;
            } else if (drawable2.equals(drawable)) {
                return;
            } else {
                yxVar = (yx) this.n0;
            }
            this.n0 = drawable;
            if (this.y1 && (drawable instanceof yx)) {
                ((yx) drawable).c(this);
            }
            if (!this.y1 || yxVar == null) {
                return;
            }
            yxVar.b(this);
        }
    }

    public final float v() {
        float width;
        float height;
        int i = this.V % kk7.J2;
        RectF rectF = this.Q0;
        if (i != 0) {
            width = rectF.height();
            height = rectF.width();
        } else {
            width = rectF.width();
            height = rectF.height();
        }
        return width / height;
    }

    public final void v0(boolean z, boolean z2) {
        if (this.R0 != z) {
            this.R0 = z;
            if (z2) {
                invalidate();
                yr8 yr8Var = this.F1;
                if (yr8Var != null) {
                    yr8Var.run();
                }
            }
        }
    }

    public final float w() {
        return this.L0 + this.N0;
    }

    public final void w0(boolean z) {
        km m = m();
        if (m != null) {
            boolean z2 = this.w0;
            if (!m.o0) {
                m.w0 = z2;
            }
            m.start();
            return;
        }
        oy8 y = y();
        if (y == null || y.l0) {
            return;
        }
        y.C(z);
    }

    public final float x() {
        return this.M0 + this.O0;
    }

    public final void x0() {
        km m = m();
        if (m != null) {
            m.stop();
            return;
        }
        oy8 y = y();
        if (y != null) {
            y.stop();
        }
    }

    public final oy8 y() {
        Drawable drawable = this.k0;
        if (drawable instanceof oy8) {
            return (oy8) drawable;
        }
        Drawable drawable2 = this.T;
        if (drawable2 instanceof oy8) {
            return (oy8) drawable2;
        }
        Drawable drawable3 = this.b0;
        if (drawable3 instanceof oy8) {
            return (oy8) drawable3;
        }
        Drawable drawable4 = this.n0;
        if (drawable4 instanceof oy8) {
            return (oy8) drawable4;
        }
        return null;
    }

    public final void y0(Drawable drawable) {
        if (drawable != null) {
            int[] z = z();
            if (!(drawable instanceof ni2)) {
                if (!(drawable instanceof BitmapDrawable) && !(drawable instanceof pb0)) {
                    R(drawable, null);
                    return;
                }
                if (drawable instanceof pb0) {
                    ((pb0) drawable).r = z[0];
                    return;
                }
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable instanceof oy8) {
                    return;
                }
                if (bitmapDrawable instanceof km) {
                    ((km) drawable).B(z);
                    return;
                } else {
                    if (bitmapDrawable.getBitmap() == null || bitmapDrawable.getBitmap().isRecycled()) {
                        return;
                    }
                    Bitmap bitmap = bitmapDrawable.getBitmap();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    R(drawable, new BitmapShader(bitmap, tileMode, tileMode));
                    return;
                }
            }
            ni2 ni2Var = (ni2) drawable;
            float f = z[0];
            float f2 = z[1];
            float f3 = z[2];
            float f4 = z[3];
            float[] fArr = ni2Var.f;
            float max = Math.max(0.0f, f);
            fArr[1] = max;
            fArr[0] = max;
            float max2 = Math.max(0.0f, f2);
            fArr[3] = max2;
            fArr[2] = max2;
            float max3 = Math.max(0.0f, f3);
            fArr[5] = max3;
            fArr[4] = max3;
            float max4 = Math.max(0.0f, f4);
            fArr[7] = max4;
            fArr[6] = max4;
            ni2Var.e = f > 0.0f || f2 > 0.0f || f3 > 0.0f || f4 > 0.0f;
            ni2Var.a();
        }
    }

    public final int[] z() {
        if (this.W0) {
            return this.X0;
        }
        return null;
    }
}
