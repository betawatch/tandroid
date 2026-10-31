package kg;

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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.d00;
import org.telegram.messenger.r20;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class f2 {
    public boolean B;
    public Matrix[] C;
    public float[][] D;
    public int[] E;
    public float[] F;
    public boolean G;
    public boolean N;
    public p6 P;
    public long R;
    public long S;
    public boolean g;
    public boolean h;
    public r20 l;
    public boolean m;
    public final int p;
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
    public int r = 14;
    public int s = 12;
    public int t = 10;
    public float u = 0.85f;
    public float v = 0.85f;
    public float w = 0.9f;
    public long x = 2000;
    public int y = 1000;
    public final float A = 1000.0f / org.telegram.messenger.i0.r;
    public boolean H = false;
    public boolean I = true;
    public boolean J = true;
    public boolean K = false;
    public boolean L = false;
    public boolean M = true;
    public int O = -1;
    public int Q = t6.Ik;
    public int T = 0;

    public f2(int i10) {
        this.p = i10;
        this.B = i10 < 50;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0334 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i10;
        int L;
        int i11 = 6;
        int i12 = 3;
        if (this.O == 43) {
            if (this.d.length != 6) {
                this.d = new Bitmap[6];
            }
            if (this.e.length != 6) {
                this.e = new boolean[6];
            }
            if (this.f.length != 6) {
                this.f = new boolean[6];
            }
            i10 = 6;
        } else {
            i10 = 3;
        }
        int i13 = 0;
        while (i13 < i10) {
            float f7 = this.u;
            if (i13 == 0) {
                L = org.telegram.messenger.i0.L(this.r);
            } else if (i13 == 1) {
                f7 = this.v;
                L = org.telegram.messenger.i0.L(this.s);
            } else {
                f7 = this.w;
                L = org.telegram.messenger.i0.L(this.t);
            }
            int i14 = this.O;
            if (i14 == 9) {
                this.d[i13] = d00.d(i13 == 0 ? R.raw.premium_object_folder : i13 == 1 ? R.raw.premium_object_bubble : R.raw.premium_object_settings, L, L, i0.b.o(t6.w0(this.Q, this.P), 30));
                this.e[i13] = true;
            } else {
                int i15 = R.raw.premium_object_star2;
                if (i14 == 27) {
                    if (i13 == 0) {
                        i15 = R.raw.filled_messages_paid;
                    } else if (i13 == 1) {
                        i15 = R.raw.filled_crown_on;
                    }
                    this.d[i13] = d00.d(i15, L, L, i0.b.o(t6.w0(this.Q, this.P), 30));
                    this.e[i13] = true;
                } else {
                    int i16 = R.raw.premium_object_like;
                    if (i14 == 11 || i14 == 4) {
                        if (i13 == 0) {
                            i16 = R.raw.premium_object_smile1;
                        } else if (i13 == 1) {
                            i16 = R.raw.premium_object_smile2;
                        }
                        this.d[i13] = d00.d(i16, L, L, i0.b.o(t6.w0(this.Q, this.P), 30));
                        this.e[i13] = true;
                    } else {
                        int i17 = R.raw.premium_object_user;
                        if (i14 == 22) {
                            if (i13 != 0) {
                                i17 = i13 == 1 ? R.raw.cache_photos : R.raw.cache_profile_photos;
                            }
                            this.d[i13] = d00.d(i17, L, L, i0.b.o(t6.w0(this.Q, this.P), 30));
                            this.e[i13] = true;
                        } else if (i14 == i12) {
                            if (i13 == 0) {
                                i16 = R.raw.premium_object_adsbubble;
                            } else if (i13 != 1) {
                                i16 = R.raw.premium_object_noads;
                            }
                            this.d[i13] = d00.d(i16, L, L, i0.b.o(t6.w0(this.Q, this.P), 30));
                            this.e[i13] = true;
                        } else if (i14 == 7) {
                            if (i13 == 0) {
                                i17 = R.raw.premium_object_video2;
                            } else if (i13 == 1) {
                                i17 = R.raw.premium_object_video;
                            }
                            this.d[i13] = d00.d(i17, L, L, i0.b.o(t6.w0(this.Q, this.P), 30));
                            this.e[i13] = true;
                        } else if (i14 == 43) {
                            this.d[i13] = d00.d(i13 == 0 ? R.raw.premium_object_list : i13 == 1 ? R.raw.premium_object_math : i13 == 2 ? R.raw.premium_object_table : i13 == i12 ? R.raw.premium_object_superscript : i13 == 4 ? R.raw.premium_object_bold : R.raw.premium_object_code, L, L, i0.b.o(t6.w0(this.Q, this.P), 30));
                            this.e[i13] = true;
                        } else if (i14 == 1001) {
                            this.d[i13] = d00.d(R.raw.premium_object_fire, L, L, i0.b.o(t6.w0(this.Q, this.P), 30));
                            this.e[i13] = true;
                        } else if (i14 == 1002) {
                            this.d[i13] = d00.d(R.raw.premium_object_star2, L, L, i0.b.o(t6.w0(this.Q, this.P), 30));
                            this.e[i13] = true;
                        } else if (i14 == 24) {
                            this.d[i13] = d00.d(i13 == 0 ? R.raw.premium_object_tag : i13 == 1 ? R.raw.premium_object_check : R.raw.premium_object_star, L, L, i0.b.o(t6.w0(this.Q, this.P), 30));
                            this.e[i13] = true;
                        } else if (i14 == 28) {
                            if (i13 == 0) {
                                this.d[i13] = d00.d(R.raw.filled_premium_dollar, L, L, i0.b.o(t6.w0(this.Q, this.P), zs.e4));
                                this.f[i13] = true;
                            }
                            Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
                            this.d[i13] = createBitmap;
                            Canvas canvas = new Canvas(createBitmap);
                            if (this.O == i11 || !(i13 == 1 || i13 == 2)) {
                                Path path = new Path();
                                float f10 = L >> 1;
                                int i18 = (int) (f7 * f10);
                                path.moveTo(0.0f, f10);
                                float f11 = i18;
                                path.lineTo(f11, f11);
                                path.lineTo(f10, 0.0f);
                                float f12 = L - i18;
                                path.lineTo(f12, f11);
                                float f13 = L;
                                path.lineTo(f13, f10);
                                path.lineTo(f12, f12);
                                path.lineTo(f10, f13);
                                path.lineTo(f11, f12);
                                path.lineTo(0.0f, f10);
                                path.close();
                                Paint paint = new Paint();
                                if (this.q) {
                                    paint.setColor(b());
                                    if (this.M) {
                                        paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.N(this.r / 5.0f)));
                                    }
                                    canvas.drawPath(path, paint);
                                } else {
                                    if (L >= org.telegram.messenger.i0.L(10.0f)) {
                                        ea.f.d().f(L * (-2), 0.0f, L, L);
                                    } else {
                                        ea.f.d().f(L * (-4), 0.0f, L, L);
                                    }
                                    Paint e = ea.f.d().e();
                                    if (this.M) {
                                        e.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.N(this.r / 5.0f)));
                                    }
                                    if (this.L) {
                                        e.setAlpha(zs.e4);
                                    } else if (this.K) {
                                        e.setAlpha(60);
                                    } else {
                                        e.setAlpha(120);
                                    }
                                    canvas.drawPath(path, e);
                                    e.setPathEffect(null);
                                    e.setAlpha(zs.e4);
                                }
                                if (!this.K) {
                                    Utilities.stackBlurBitmap(createBitmap, 2);
                                }
                            } else {
                                Drawable drawable = org.telegram.messenger.w0.b.getDrawable(R.drawable.msg_premium_liststar);
                                drawable.setColorFilter(new PorterDuffColorFilter(t6.w0(this.Q, this.P), PorterDuff.Mode.MULTIPLY));
                                drawable.setBounds(0, 0, L, L);
                                drawable.draw(canvas);
                            }
                        } else {
                            if (i14 == 105 && i13 == 0) {
                                this.d[i13] = d00.d(R.raw.premium_object_star2, L, L, b());
                            }
                            Bitmap createBitmap2 = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
                            this.d[i13] = createBitmap2;
                            Canvas canvas2 = new Canvas(createBitmap2);
                            if (this.O == i11) {
                            }
                            Path path2 = new Path();
                            float f102 = L >> 1;
                            int i182 = (int) (f7 * f102);
                            path2.moveTo(0.0f, f102);
                            float f112 = i182;
                            path2.lineTo(f112, f112);
                            path2.lineTo(f102, 0.0f);
                            float f122 = L - i182;
                            path2.lineTo(f122, f112);
                            float f132 = L;
                            path2.lineTo(f132, f102);
                            path2.lineTo(f122, f122);
                            path2.lineTo(f102, f132);
                            path2.lineTo(f112, f122);
                            path2.lineTo(0.0f, f102);
                            path2.close();
                            Paint paint2 = new Paint();
                            if (this.q) {
                            }
                            if (!this.K) {
                            }
                        }
                    }
                }
            }
            i13++;
            i11 = 6;
            i12 = 3;
        }
    }

    public int b() {
        return this.O == 100 ? i0.b.o(t6.w0(this.Q, this.P), zs.e3) : t6.w0(this.Q, this.P);
    }

    public final void c() {
        a();
        boolean z10 = this.G;
        int i10 = this.p;
        if (z10) {
            int length = this.d.length;
            this.C = new Matrix[length];
            this.D = new float[length][];
            this.E = new int[length];
            this.F = new float[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.C[i11] = new Matrix();
                this.D[i11] = new float[i10 * 2];
            }
        }
        ArrayList arrayList = this.n;
        if (arrayList.isEmpty()) {
            for (int i12 = 0; i12 < i10; i12++) {
                arrayList.add(new e2(this));
            }
        }
    }

    public final void d(Canvas canvas) {
        e(canvas, 1.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x001a, code lost:
    
        if (r5 > 50) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas, float f7) {
        int i10;
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.S;
        long j11 = j10 >= 4 ? 50L : 4L;
        j10 = j11;
        boolean z10 = this.G;
        ArrayList arrayList = this.n;
        if (z10) {
            RectF rectF = this.a;
            float centerX = rectF.centerX() + 0.0f;
            float centerY = rectF.centerY() + this.k;
            int i11 = 0;
            while (true) {
                Matrix[] matrixArr = this.C;
                if (i11 >= matrixArr.length) {
                    break;
                }
                float[] fArr = this.F;
                float f10 = ((j10 / ((i11 * 10000.0f) + 40000.0f)) * 360.0f) + fArr[i11];
                fArr[i11] = f10;
                matrixArr[i11].setRotate(f10, centerX, centerY);
                this.E[i11] = 0;
                i11++;
            }
            i10 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                e2 e2Var = (e2) arrayList.get(i12);
                f2 f2Var = e2Var.t;
                int[] iArr = f2Var.E;
                int i13 = e2Var.l;
                int i14 = iArr[i13];
                float[] fArr2 = f2Var.D[i13];
                int i15 = i14 * 2;
                fArr2[i15] = e2Var.d;
                fArr2[i15 + 1] = e2Var.e;
                iArr[i13] = i14 + 1;
            }
            int i16 = 0;
            while (true) {
                Matrix[] matrixArr2 = this.C;
                if (i16 >= matrixArr2.length) {
                    break;
                }
                Matrix matrix = matrixArr2[i16];
                float[] fArr3 = this.D[i16];
                matrix.mapPoints(fArr3, 0, fArr3, 0, this.E[i16]);
                this.E[i16] = 0;
                i16++;
            }
        } else {
            i10 = 0;
        }
        for (int i17 = i10; i17 < arrayList.size(); i17++) {
            e2 e2Var2 = (e2) arrayList.get(i17);
            if (this.g) {
                e2Var2.a(canvas, this.R, f7);
            } else {
                e2Var2.a(canvas, currentTimeMillis, f7);
            }
            if (this.I && currentTimeMillis > e2Var2.a) {
                e2Var2.b(currentTimeMillis);
            }
            if (this.H) {
                if (!this.b.contains(e2Var2.h, e2Var2.i)) {
                    e2Var2.b(currentTimeMillis);
                }
            }
        }
        this.S = currentTimeMillis;
    }

    public final void f() {
        long currentTimeMillis = System.currentTimeMillis();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.n;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((e2) arrayList.get(i10)).b(currentTimeMillis);
            i10++;
        }
    }

    public final void g() {
        int w02 = t6.w0(this.Q, this.P);
        if (this.z != w02) {
            this.z = w02;
            a();
        }
    }
}
