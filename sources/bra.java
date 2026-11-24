// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class bra {
    public boolean B;
    public Matrix[] C;
    public float[][] D;
    public int[] E;
    public float[] F;
    public boolean G;
    public boolean M;
    public wjb O;
    public long Q;
    public long R;
    public boolean g;
    public boolean h;
    public q8c l;
    public boolean m;
    public final short p;
    public boolean q;
    public int z;
    public final RectF a = new RectF();
    public final RectF b = new RectF();
    public final RectF c = new RectF();
    public Bitmap[] d = new Bitmap[3];
    public boolean[] e = new boolean[3];
    public boolean[] f = new boolean[3];
    public final Paint i = new Paint();
    public float j = 0.0f;
    public float k = 0.0f;
    public final ArrayList n = new ArrayList();
    public float o = 1.0f;
    public byte r = 14;
    public byte s = 12;
    public byte t = 10;
    public float u = 0.85f;
    public float v = 0.85f;
    public float w = 0.9f;
    public short x = 2000;
    public short y = 1000;
    public final float A = 1000.0f / gl.r;
    public boolean H = false;
    public boolean I = true;
    public boolean J = false;
    public boolean K = false;
    public boolean L = true;
    public int N = -1;
    public int P = bkb.Kk;
    public int S = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public bra(int i) {
        this.p = i;
        this.B = i < 50;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0331 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i;
        int L;
        int i2 = 6;
        int i3 = 3;
        if (this.N == 43) {
            if (this.d.length != 6) {
                this.d = new Bitmap[6];
            }
            if (this.e.length != 6) {
                this.e = new boolean[6];
            }
            if (this.f.length != 6) {
                this.f = new boolean[6];
            }
            i = 6;
        } else {
            i = 3;
        }
        int i4 = 0;
        while (i4 < i) {
            float f = this.u;
            if (i4 == 0) {
                L = gl.L(this.r);
            } else if (i4 == 1) {
                f = this.v;
                L = gl.L(this.s);
            } else {
                f = this.w;
                L = gl.L(this.t);
            }
            int i5 = this.N;
            if (i5 == 9) {
                this.d[i4] = lcb.d(i4 == 0 ? R.raw.premium_object_folder : i4 == 1 ? R.raw.premium_object_bubble : R.raw.premium_object_settings, L, L, bm2.o(bkb.v0(this.P, this.O), 30));
                this.e[i4] = true;
            } else {
                int i6 = R.raw.premium_object_star2;
                if (i5 == 27) {
                    if (i4 == 0) {
                        i6 = R.raw.filled_messages_paid;
                    } else if (i4 == 1) {
                        i6 = R.raw.filled_crown_on;
                    }
                    this.d[i4] = lcb.d(i6, L, L, bm2.o(bkb.v0(this.P, this.O), 30));
                    this.e[i4] = true;
                } else {
                    int i7 = R.raw.premium_object_like;
                    if (i5 == 11 || i5 == 4) {
                        if (i4 == 0) {
                            i7 = R.raw.premium_object_smile1;
                        } else if (i4 == 1) {
                            i7 = R.raw.premium_object_smile2;
                        }
                        this.d[i4] = lcb.d(i7, L, L, bm2.o(bkb.v0(this.P, this.O), 30));
                        this.e[i4] = true;
                    } else {
                        int i8 = R.raw.premium_object_user;
                        if (i5 == 22) {
                            if (i4 != 0) {
                                i8 = i4 == 1 ? R.raw.cache_photos : R.raw.cache_profile_photos;
                            }
                            this.d[i4] = lcb.d(i8, L, L, bm2.o(bkb.v0(this.P, this.O), 30));
                            this.e[i4] = true;
                        } else if (i5 == i3) {
                            if (i4 == 0) {
                                i7 = R.raw.premium_object_adsbubble;
                            } else if (i4 != 1) {
                                i7 = R.raw.premium_object_noads;
                            }
                            this.d[i4] = lcb.d(i7, L, L, bm2.o(bkb.v0(this.P, this.O), 30));
                            this.e[i4] = true;
                        } else if (i5 == 7) {
                            if (i4 == 0) {
                                i8 = R.raw.premium_object_video2;
                            } else if (i4 == 1) {
                                i8 = R.raw.premium_object_video;
                            }
                            this.d[i4] = lcb.d(i8, L, L, bm2.o(bkb.v0(this.P, this.O), 30));
                            this.e[i4] = true;
                        } else if (i5 == 43) {
                            this.d[i4] = lcb.d(i4 == 0 ? R.raw.premium_object_list : i4 == 1 ? R.raw.premium_object_math : i4 == 2 ? R.raw.premium_object_table : i4 == i3 ? R.raw.premium_object_superscript : i4 == 4 ? R.raw.premium_object_bold : R.raw.premium_object_code, L, L, bm2.o(bkb.v0(this.P, this.O), 30));
                            this.e[i4] = true;
                        } else if (i5 == 1001) {
                            this.d[i4] = lcb.d(R.raw.premium_object_fire, L, L, bm2.o(bkb.v0(this.P, this.O), 30));
                            this.e[i4] = true;
                        } else if (i5 == 1002) {
                            this.d[i4] = lcb.d(R.raw.premium_object_star2, L, L, bm2.o(bkb.v0(this.P, this.O), 30));
                            this.e[i4] = true;
                        } else if (i5 == 24) {
                            this.d[i4] = lcb.d(i4 == 0 ? R.raw.premium_object_tag : i4 == 1 ? R.raw.premium_object_check : R.raw.premium_object_star, L, L, bm2.o(bkb.v0(this.P, this.O), 30));
                            this.e[i4] = true;
                        } else if (i5 == 28) {
                            if (i4 == 0) {
                                this.d[i4] = lcb.d(R.raw.filled_premium_dollar, L, L, bm2.o(bkb.v0(this.P, this.O), kk7.d4));
                                this.f[i4] = true;
                            }
                            Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
                            this.d[i4] = createBitmap;
                            Canvas canvas = new Canvas(createBitmap);
                            if (this.N == i2 || !(i4 == 1 || i4 == 2)) {
                                Path path = new Path();
                                float f2 = L >> 1;
                                int i9 = (int) (f * f2);
                                path.moveTo(0.0f, f2);
                                float f3 = i9;
                                path.lineTo(f3, f3);
                                path.lineTo(f2, 0.0f);
                                float f4 = L - i9;
                                path.lineTo(f4, f3);
                                float f5 = L;
                                path.lineTo(f5, f2);
                                path.lineTo(f4, f4);
                                path.lineTo(f2, f5);
                                path.lineTo(f3, f4);
                                path.lineTo(0.0f, f2);
                                path.close();
                                Paint paint = new Paint();
                                if (this.q) {
                                    paint.setColor(b());
                                    if (this.L) {
                                        paint.setPathEffect(new CornerPathEffect(gl.N(this.r / 5.0f)));
                                    }
                                    canvas.drawPath(path, paint);
                                } else {
                                    if (L >= gl.L(10.0f)) {
                                        nh8.d().f(L * (-2), 0.0f, L, L);
                                    } else {
                                        nh8.d().f(L * (-4), 0.0f, L, L);
                                    }
                                    Paint e = nh8.d().e();
                                    if (this.L) {
                                        e.setPathEffect(new CornerPathEffect(gl.N(this.r / 5.0f)));
                                    }
                                    if (this.K) {
                                        e.setAlpha(kk7.d4);
                                    } else if (this.J) {
                                        e.setAlpha(60);
                                    } else {
                                        e.setAlpha(120);
                                    }
                                    canvas.drawPath(path, e);
                                    e.setPathEffect(null);
                                    e.setAlpha(kk7.d4);
                                }
                                if (!this.J) {
                                    Utilities.stackBlurBitmap(createBitmap, 2);
                                }
                            } else {
                                Drawable drawable = a.b.getDrawable(R.drawable.msg_premium_liststar);
                                drawable.setColorFilter(new PorterDuffColorFilter(bkb.v0(this.P, this.O), PorterDuff.Mode.MULTIPLY));
                                drawable.setBounds(0, 0, L, L);
                                drawable.draw(canvas);
                            }
                        } else {
                            if (i5 == 105 && i4 == 0) {
                                this.d[i4] = lcb.d(R.raw.premium_object_star2, L, L, b());
                            }
                            Bitmap createBitmap2 = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
                            this.d[i4] = createBitmap2;
                            Canvas canvas2 = new Canvas(createBitmap2);
                            if (this.N == i2) {
                            }
                            Path path2 = new Path();
                            float f22 = L >> 1;
                            int i92 = (int) (f * f22);
                            path2.moveTo(0.0f, f22);
                            float f32 = i92;
                            path2.lineTo(f32, f32);
                            path2.lineTo(f22, 0.0f);
                            float f42 = L - i92;
                            path2.lineTo(f42, f32);
                            float f52 = L;
                            path2.lineTo(f52, f22);
                            path2.lineTo(f42, f42);
                            path2.lineTo(f22, f52);
                            path2.lineTo(f32, f42);
                            path2.lineTo(0.0f, f22);
                            path2.close();
                            Paint paint2 = new Paint();
                            if (this.q) {
                            }
                            if (!this.J) {
                            }
                        }
                    }
                }
            }
            i4++;
            i2 = 6;
            i3 = 3;
        }
    }

    public int b() {
        int i = this.N;
        int i2 = this.P;
        wjb wjbVar = this.O;
        return i == 100 ? bm2.o(bkb.v0(i2, wjbVar), kk7.d3) : bkb.v0(i2, wjbVar);
    }

    public final void c() {
        a();
        boolean z = this.G;
        short s = this.p;
        if (z) {
            int length = this.d.length;
            this.C = new Matrix[length];
            this.D = new float[length][];
            this.E = new int[length];
            this.F = new float[length];
            for (int i = 0; i < length; i++) {
                this.C[i] = new Matrix();
                this.D[i] = new float[s << 1];
            }
        }
        ArrayList arrayList = this.n;
        if (arrayList.isEmpty()) {
            for (int i2 = 0; i2 < s; i2++) {
                arrayList.add(new ara(this));
            }
        }
    }

    public final void d(Canvas canvas) {
        e(canvas, 1.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r5 > 50) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas, float f) {
        int i;
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.R;
        long j2 = j >= 4 ? 50L : 4L;
        j = j2;
        boolean z = this.G;
        ArrayList arrayList = this.n;
        if (z) {
            RectF rectF = this.a;
            float centerX = rectF.centerX() + 0.0f;
            float centerY = rectF.centerY() + this.k;
            int i2 = 0;
            while (true) {
                Matrix[] matrixArr = this.C;
                if (i2 >= matrixArr.length) {
                    break;
                }
                float[] fArr = this.F;
                float f2 = ((j / ((i2 * 10000.0f) + 40000.0f)) * 360.0f) + fArr[i2];
                fArr[i2] = f2;
                matrixArr[i2].setRotate(f2, centerX, centerY);
                this.E[i2] = 0;
                i2++;
            }
            i = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ara araVar = (ara) arrayList.get(i3);
                bra braVar = araVar.t;
                int[] iArr = braVar.E;
                int i4 = araVar.l;
                int i5 = iArr[i4];
                float[] fArr2 = braVar.D[i4];
                int i6 = i5 << 1;
                fArr2[i6] = araVar.d;
                fArr2[i6 + 1] = araVar.e;
                iArr[i4] = i5 + 1;
            }
            int i7 = 0;
            while (true) {
                Matrix[] matrixArr2 = this.C;
                if (i7 >= matrixArr2.length) {
                    break;
                }
                Matrix matrix = matrixArr2[i7];
                float[] fArr3 = this.D[i7];
                matrix.mapPoints(fArr3, 0, fArr3, 0, this.E[i7]);
                this.E[i7] = 0;
                i7++;
            }
        } else {
            i = 0;
        }
        for (int i8 = i; i8 < arrayList.size(); i8++) {
            ara araVar2 = (ara) arrayList.get(i8);
            if (this.g) {
                araVar2.a(canvas, this.Q, f);
            } else {
                araVar2.a(canvas, currentTimeMillis, f);
            }
            if (currentTimeMillis > araVar2.a) {
                araVar2.b(currentTimeMillis);
            }
            if (this.H) {
                if (!this.b.contains(araVar2.h, araVar2.i)) {
                    araVar2.b(currentTimeMillis);
                }
            }
        }
        this.R = currentTimeMillis;
    }

    public final void f() {
        long currentTimeMillis = System.currentTimeMillis();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.n;
            if (i >= arrayList.size()) {
                return;
            }
            ((ara) arrayList.get(i)).b(currentTimeMillis);
            i++;
        }
    }

    public final void g() {
        int v0 = bkb.v0(this.P, this.O);
        if (this.z != v0) {
            this.z = v0;
            a();
        }
    }
}
