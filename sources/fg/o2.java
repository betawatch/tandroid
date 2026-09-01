package fg;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class o2 {
    public boolean B;
    public Matrix[] C;
    public float[][] D;
    public int[] E;
    public float[] F;
    public boolean G;
    public g6 O;
    public long Q;
    public long R;
    public boolean g;
    public boolean h;
    public Utilities.CallbackReturn l;
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
    public int y = MediaDataController.MAX_STYLE_RUNS_COUNT;
    public final float A = 1000.0f / AndroidUtilities.screenRefreshRate;
    public boolean H = false;
    public boolean I = true;
    public boolean J = true;
    public boolean K = false;
    public boolean L = false;
    public boolean M = true;
    public int N = -1;
    public int P = k6.Uj;
    public int S = 0;

    public o2(int i10) {
        this.p = i10;
        this.B = i10 < 50;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x031e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i10;
        int dp;
        int i11 = 6;
        int i12 = 3;
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
            i10 = 6;
        } else {
            i10 = 3;
        }
        int i13 = 0;
        while (i13 < i10) {
            float f10 = this.u;
            if (i13 == 0) {
                dp = AndroidUtilities.dp(this.r);
            } else if (i13 == 1) {
                f10 = this.v;
                dp = AndroidUtilities.dp(this.s);
            } else {
                f10 = this.w;
                dp = AndroidUtilities.dp(this.t);
            }
            int i14 = this.N;
            if (i14 == 9) {
                this.d[i13] = SvgHelper.getBitmap(i13 == 0 ? R.raw.premium_object_folder : i13 == 1 ? R.raw.premium_object_bubble : R.raw.premium_object_settings, dp, dp, i0.a.k(k6.v0(this.P, this.O), 30));
                this.e[i13] = true;
            } else if (i14 == 27) {
                this.d[i13] = SvgHelper.getBitmap(i13 == 0 ? R.raw.filled_messages_paid : i13 == 1 ? R.raw.filled_crown_on : R.raw.premium_object_star2, dp, dp, i0.a.k(k6.v0(this.P, this.O), 30));
                this.e[i13] = true;
            } else if (i14 == 11 || i14 == 4) {
                this.d[i13] = SvgHelper.getBitmap(i13 == 0 ? R.raw.premium_object_smile1 : i13 == 1 ? R.raw.premium_object_smile2 : R.raw.premium_object_like, dp, dp, i0.a.k(k6.v0(this.P, this.O), 30));
                this.e[i13] = true;
            } else if (i14 == 22) {
                this.d[i13] = SvgHelper.getBitmap(i13 == 0 ? R.raw.premium_object_user : i13 == 1 ? R.raw.cache_photos : R.raw.cache_profile_photos, dp, dp, i0.a.k(k6.v0(this.P, this.O), 30));
                this.e[i13] = true;
            } else if (i14 == i12) {
                this.d[i13] = SvgHelper.getBitmap(i13 == 0 ? R.raw.premium_object_adsbubble : i13 == 1 ? R.raw.premium_object_like : R.raw.premium_object_noads, dp, dp, i0.a.k(k6.v0(this.P, this.O), 30));
                this.e[i13] = true;
            } else if (i14 == 7) {
                this.d[i13] = SvgHelper.getBitmap(i13 == 0 ? R.raw.premium_object_video2 : i13 == 1 ? R.raw.premium_object_video : R.raw.premium_object_user, dp, dp, i0.a.k(k6.v0(this.P, this.O), 30));
                this.e[i13] = true;
            } else if (i14 == 43) {
                this.d[i13] = SvgHelper.getBitmap(i13 == 0 ? R.raw.premium_object_list : i13 == 1 ? R.raw.premium_object_math : i13 == 2 ? R.raw.premium_object_table : i13 == i12 ? R.raw.premium_object_superscript : i13 == 4 ? R.raw.premium_object_bold : R.raw.premium_object_code, dp, dp, i0.a.k(k6.v0(this.P, this.O), 30));
                this.e[i13] = true;
            } else if (i14 == 1001) {
                this.d[i13] = SvgHelper.getBitmap(R.raw.premium_object_fire, dp, dp, i0.a.k(k6.v0(this.P, this.O), 30));
                this.e[i13] = true;
            } else if (i14 == 1002) {
                this.d[i13] = SvgHelper.getBitmap(R.raw.premium_object_star2, dp, dp, i0.a.k(k6.v0(this.P, this.O), 30));
                this.e[i13] = true;
            } else if (i14 == 24) {
                this.d[i13] = SvgHelper.getBitmap(i13 == 0 ? R.raw.premium_object_tag : i13 == 1 ? R.raw.premium_object_check : R.raw.premium_object_star, dp, dp, i0.a.k(k6.v0(this.P, this.O), 30));
                this.e[i13] = true;
            } else if (i14 == 28) {
                if (i13 == 0) {
                    this.d[i13] = SvgHelper.getBitmap(R.raw.filled_premium_dollar, dp, dp, i0.a.k(k6.v0(this.P, this.O), 255));
                    this.f[i13] = true;
                }
                Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
                this.d[i13] = createBitmap;
                Canvas canvas = new Canvas(createBitmap);
                if (this.N == i11 || !(i13 == 1 || i13 == 2)) {
                    Path path = new Path();
                    float f11 = dp >> 1;
                    int i15 = (int) (f10 * f11);
                    path.moveTo(0.0f, f11);
                    float f12 = i15;
                    path.lineTo(f12, f12);
                    path.lineTo(f11, 0.0f);
                    float f13 = dp - i15;
                    path.lineTo(f13, f12);
                    float f14 = dp;
                    path.lineTo(f14, f11);
                    path.lineTo(f13, f13);
                    path.lineTo(f11, f14);
                    path.lineTo(f12, f13);
                    path.lineTo(0.0f, f11);
                    path.close();
                    Paint paint = new Paint();
                    if (this.q) {
                        paint.setColor(b());
                        if (this.M) {
                            paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.r / 5.0f)));
                        }
                        canvas.drawPath(path, paint);
                    } else {
                        if (dp >= AndroidUtilities.dp(10.0f)) {
                            q1.d().f(dp * (-2), 0.0f, dp, dp);
                        } else {
                            q1.d().f(dp * (-4), 0.0f, dp, dp);
                        }
                        Paint e6 = q1.d().e();
                        if (this.M) {
                            e6.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.r / 5.0f)));
                        }
                        if (this.L) {
                            e6.setAlpha(255);
                        } else if (this.K) {
                            e6.setAlpha(60);
                        } else {
                            e6.setAlpha(120);
                        }
                        canvas.drawPath(path, e6);
                        e6.setPathEffect(null);
                        e6.setAlpha(255);
                    }
                    if (!this.K) {
                        Utilities.stackBlurBitmap(createBitmap, 2);
                    }
                } else {
                    Drawable drawable = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar);
                    drawable.setColorFilter(new PorterDuffColorFilter(k6.v0(this.P, this.O), PorterDuff.Mode.MULTIPLY));
                    drawable.setBounds(0, 0, dp, dp);
                    drawable.draw(canvas);
                }
            } else {
                if (i14 == 105 && i13 == 0) {
                    this.d[i13] = SvgHelper.getBitmap(R.raw.premium_object_star2, dp, dp, b());
                }
                Bitmap createBitmap2 = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
                this.d[i13] = createBitmap2;
                Canvas canvas2 = new Canvas(createBitmap2);
                if (this.N == i11) {
                }
                Path path2 = new Path();
                float f112 = dp >> 1;
                int i152 = (int) (f10 * f112);
                path2.moveTo(0.0f, f112);
                float f122 = i152;
                path2.lineTo(f122, f122);
                path2.lineTo(f112, 0.0f);
                float f132 = dp - i152;
                path2.lineTo(f132, f122);
                float f142 = dp;
                path2.lineTo(f142, f112);
                path2.lineTo(f132, f132);
                path2.lineTo(f112, f142);
                path2.lineTo(f122, f132);
                path2.lineTo(0.0f, f112);
                path2.close();
                Paint paint2 = new Paint();
                if (this.q) {
                }
                if (!this.K) {
                }
            }
            i13++;
            i11 = 6;
            i12 = 3;
        }
    }

    public int b() {
        return this.N == 100 ? i0.a.k(k6.v0(this.P, this.O), 200) : k6.v0(this.P, this.O);
    }

    public final void c() {
        a();
        boolean z4 = this.G;
        int i10 = this.p;
        if (z4) {
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
                arrayList.add(new n2(this));
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
    public final void e(Canvas canvas, float f10) {
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.R;
        long j11 = j10 >= 4 ? 50L : 4L;
        j10 = j11;
        boolean z4 = this.G;
        ArrayList arrayList = this.n;
        if (z4) {
            RectF rectF = this.a;
            float centerX = rectF.centerX() + 0.0f;
            float centerY = rectF.centerY() + this.k;
            int i10 = 0;
            while (true) {
                Matrix[] matrixArr = this.C;
                if (i10 >= matrixArr.length) {
                    break;
                }
                float[] fArr = this.F;
                float f11 = ((j10 / ((i10 * 10000.0f) + 40000.0f)) * 360.0f) + fArr[i10];
                fArr[i10] = f11;
                matrixArr[i10].setRotate(f11, centerX, centerY);
                this.E[i10] = 0;
                i10++;
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                n2 n2Var = (n2) arrayList.get(i11);
                o2 o2Var = n2Var.r;
                int[] iArr = o2Var.E;
                int i12 = n2Var.l;
                int i13 = iArr[i12];
                float[] fArr2 = o2Var.D[i12];
                int i14 = i13 * 2;
                fArr2[i14] = n2Var.d;
                fArr2[i14 + 1] = n2Var.e;
                iArr[i12] = i13 + 1;
            }
            int i15 = 0;
            while (true) {
                Matrix[] matrixArr2 = this.C;
                if (i15 >= matrixArr2.length) {
                    break;
                }
                Matrix matrix = matrixArr2[i15];
                float[] fArr3 = this.D[i15];
                matrix.mapPoints(fArr3, 0, fArr3, 0, this.E[i15]);
                this.E[i15] = 0;
                i15++;
            }
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            n2 n2Var2 = (n2) arrayList.get(i16);
            if (this.g) {
                n2Var2.a(canvas, this.Q, f10);
            } else {
                n2Var2.a(canvas, currentTimeMillis, f10);
            }
            if (this.I && currentTimeMillis > n2Var2.a) {
                n2Var2.b(currentTimeMillis);
            }
            if (this.H) {
                if (!this.b.contains(n2Var2.h, n2Var2.i)) {
                    n2Var2.b(currentTimeMillis);
                }
            }
        }
        this.R = currentTimeMillis;
    }

    public final void f() {
        long currentTimeMillis = System.currentTimeMillis();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.n;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((n2) arrayList.get(i10)).b(currentTimeMillis);
            i10++;
        }
    }

    public final void g() {
        int v02 = k6.v0(this.P, this.O);
        if (this.z != v02) {
            this.z = v02;
            a();
        }
    }
}
