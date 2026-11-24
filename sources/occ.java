// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class occ extends View {
    public static final Object g0 = new Object();
    public MediaMetadataRetriever E;
    public ncc F;
    public final ArrayList G;
    public lcc H;
    public long I;
    public int J;
    public int K;
    public int L;
    public float M;
    public float N;
    public final RectF O;
    public int P;
    public int Q;
    public final Paint R;
    public final ArrayList S;
    public final Rect T;
    public final Paint U;
    public final Paint V;
    public final Paint W;
    public long a;
    public final Paint a0;
    public int b;
    public final Paint b0;
    public int c;
    public final Paint c0;
    public float d;
    public final lm d0;
    public float e;
    public final Path e0;
    public float f;
    public boolean f0;
    public boolean h;
    public boolean n;
    public boolean r;
    public float s;
    public float w;
    public boolean x;
    public ParcelFileDescriptor y;

    public occ(Context context) {
        super(context);
        this.e = 1.0f;
        this.s = 0.5f;
        this.G = new ArrayList();
        this.M = 1.0f;
        this.N = 0.0f;
        this.O = new RectF();
        this.Q = 0;
        this.R = new Paint(3);
        ArrayList arrayList = new ArrayList();
        this.S = arrayList;
        Rect rect = new Rect();
        this.T = rect;
        Paint paint = new Paint(1);
        this.U = paint;
        Paint paint2 = new Paint(1);
        this.V = paint2;
        Paint paint3 = new Paint(1);
        this.W = paint3;
        Paint paint4 = new Paint(1);
        this.a0 = paint4;
        Paint paint5 = new Paint(1);
        this.b0 = paint5;
        Paint paint6 = new Paint(1);
        this.c0 = paint6;
        this.d0 = new lm(0.0f, this, 0L, 200L, s33.j);
        this.e0 = new Path();
        paint.setColor(-1);
        paint2.setColor(-256);
        paint3.setColor(637534208);
        paint4.setColor(1291845632);
        paint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint6.setColor(-16777216);
        arrayList.add(rect);
    }

    public final void a() {
        ArrayList arrayList;
        Bitmap bitmap;
        synchronized (g0) {
            try {
                ParcelFileDescriptor parcelFileDescriptor = this.y;
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                    this.y = null;
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.E;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.E = null;
                }
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
        }
        int i = 0;
        while (true) {
            int size = this.G.size();
            arrayList = this.G;
            if (i >= size) {
                break;
            }
            mcc mccVar = (mcc) arrayList.get(i);
            if (mccVar != null && (bitmap = mccVar.a) != null) {
                bitmap.recycle();
            }
            i++;
        }
        arrayList.clear();
        lcc lccVar = this.H;
        if (lccVar != null) {
            lccVar.cancel(true);
            this.H = null;
        }
    }

    public abstract void b(Canvas canvas, RectF rectF);

    public final void c(float f, float f2, Canvas canvas, Paint paint) {
        float N = gl.N(12.0f);
        float L = gl.L(2.0f);
        float L2 = gl.L(46.0f) + L;
        float f3 = (1.0f - f2) * ((L2 - L) / 2.0f);
        float f4 = L + f3;
        float f5 = L2 - f3;
        Paint paint2 = this.W;
        paint2.setAlpha((int) (38.0f * f2));
        paint.setAlpha((int) (f2 * 255.0f));
        float measuredWidth = (((getMeasuredWidth() - (N * 2.0f)) - gl.L(20.0f)) * f) + N + gl.L(10.0f);
        float N2 = measuredWidth - gl.N(1.5f);
        float N3 = gl.N(1.5f) + measuredWidth;
        RectF rectF = this.O;
        rectF.set(N2, f4, N3, f5);
        rectF.inset(-gl.N(0.66f), -gl.N(0.66f));
        canvas.drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), paint2);
        rectF.set(measuredWidth - gl.N(1.5f), f4, gl.N(1.5f) + measuredWidth, f5);
        canvas.drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), paint);
    }

    public final void d(int i) {
        int i2;
        if (this.E == null) {
            return;
        }
        if (i == 0) {
            this.K = gl.L(38.0f);
            this.L = Math.max(1, (int) Math.ceil((getMeasuredWidth() - gl.L(32.0f)) / (this.K * Utilities.i((this.b == 0 || (i2 = this.c) == 0) ? 1.0f : r1 / i2, 1.3333334f, 0.5625f))));
            this.J = (int) Math.ceil((getMeasuredWidth() - gl.L(32.0f)) / this.L);
            this.I = this.a / this.L;
        }
        lcc lccVar = new lcc(this);
        this.H = lccVar;
        lccVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i), null, null);
    }

    public float getLeftProgress() {
        return this.d;
    }

    public long getLength() {
        return Math.max(1L, this.a);
    }

    public float getProgress() {
        return this.s;
    }

    public float getRightProgress() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        Canvas canvas2;
        float N = gl.N(12.0f);
        float measuredWidth = getMeasuredWidth() - (N * 2.0f);
        float L = gl.L(10.0f) + N + ((int) ((measuredWidth - gl.L(20.0f)) * this.d));
        float L2 = gl.L(10.0f) + N + ((int) ((measuredWidth - gl.L(20.0f)) * this.e));
        float L3 = gl.L(6.0f);
        float L4 = L3 + gl.L(38.0f);
        ArrayList arrayList = this.G;
        boolean isEmpty = arrayList.isEmpty();
        Path path = this.e0;
        if (isEmpty && this.H == null) {
            RectF rectF = gl.P;
            rectF.set(N, L3, measuredWidth + N, L4);
            canvas.save();
            path.rewind();
            path.addRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), Path.Direction.CW);
            canvas.clipPath(path);
            b(canvas, rectF);
            canvas.restore();
            d(0);
            f = 2.0f;
            f2 = 10.0f;
            f3 = 6.0f;
            f4 = L;
            f6 = L3;
            f5 = L2;
        } else {
            canvas.save();
            path.rewind();
            RectF rectF2 = gl.P;
            float f7 = measuredWidth + N;
            rectF2.set(N, L3, f7, L4);
            f = 2.0f;
            f2 = 10.0f;
            f3 = 6.0f;
            path.addRoundRect(rectF2, gl.L(6.0f), gl.L(6.0f), Path.Direction.CW);
            canvas.clipPath(path);
            boolean z = arrayList.size() < this.L;
            this.f0 = z;
            if (!z) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    }
                    if (((mcc) arrayList.get(i)).a == null) {
                        this.f0 = true;
                        break;
                    }
                    i++;
                }
            }
            if (this.f0) {
                RectF rectF3 = gl.P;
                rectF3.set(N, L3, gl.L(4.0f) + f7, L4);
                b(canvas, rectF3);
            }
            int i2 = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                mcc mccVar = (mcc) arrayList.get(i3);
                Bitmap bitmap = mccVar.a;
                if (bitmap != null) {
                    float f8 = (this.J * i2) + N;
                    float L5 = gl.L(6.0f);
                    float f9 = mccVar.b;
                    if (f9 != 1.0f) {
                        float f10 = f9 + 0.045714285f;
                        mccVar.b = f10;
                        if (f10 > 1.0f) {
                            mccVar.b = 1.0f;
                        } else {
                            invalidate();
                        }
                        int interpolation = (int) (s33.h.getInterpolation(mccVar.b) * 255.0f);
                        Paint paint = this.R;
                        paint.setAlpha(interpolation);
                        canvas.drawBitmap(bitmap, f8, L5, paint);
                    } else {
                        canvas.drawBitmap(bitmap, f8, L5, (Paint) null);
                    }
                }
                i2++;
            }
            float L6 = gl.L(46.0f);
            Paint paint2 = this.a0;
            canvas.drawRect(N, L3, L, L6, paint2);
            f4 = L;
            canvas.drawRect(L2, L3, f7, L4, paint2);
            f5 = L2;
            f6 = L3;
            canvas.restore();
        }
        boolean z2 = this.x;
        Paint paint3 = this.U;
        if (z2) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), kk7.d4, 31);
            float N2 = f4 - gl.N(f2);
            float N3 = gl.N(f2) + f5;
            RectF rectF4 = this.O;
            rectF4.set(N2, f6, N3, L4);
            paint3.setAlpha(kk7.d4);
            canvas2.drawRoundRect(rectF4, gl.N(f3), gl.N(f3), paint3);
            rectF4.set(f4, gl.N(f) + f6, f5, L4 - gl.N(f));
            canvas2.drawRect(rectF4, this.b0);
            canvas2.restore();
            float L7 = gl.L(f);
            float L8 = gl.L(f2);
            float N4 = f4 - ((gl.N(f2) - L7) / f);
            float f11 = (((L4 - f6) - L8) / f) + f6;
            float f12 = L8 + f11;
            rectF4.set(N4, f11, N4 - L7, f12);
            float N5 = gl.N(f3);
            float N6 = gl.N(f3);
            Paint paint4 = this.c0;
            canvas2.drawRoundRect(rectF4, N5, N6, paint4);
            float N7 = ((gl.N(f2) - L7) / f) + f5;
            rectF4.set(N7, f11, L7 + N7, f12);
            canvas2.drawRoundRect(rectF4, gl.N(f3), gl.N(f3), paint4);
        }
        float e = this.d0.e(false, 0.0f);
        if (e > 0.0f) {
            c(this.e, e, canvas2, paint3);
        }
        c(this.s, 1.0f - e, canvas2, paint3);
        if (this.x) {
            c(this.f, 1.0f, canvas2, this.V);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT >= 29) {
            this.T.set(i, 0, i3, getMeasuredHeight());
            setSystemGestureExclusionRects(this.S);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ArrayList arrayList;
        Bitmap bitmap;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        if (this.P != size) {
            int i3 = 0;
            while (true) {
                arrayList = this.G;
                if (i3 >= arrayList.size()) {
                    break;
                }
                mcc mccVar = (mcc) arrayList.get(i3);
                if (mccVar != null && (bitmap = mccVar.a) != null) {
                    bitmap.recycle();
                }
                i3++;
            }
            arrayList.clear();
            lcc lccVar = this.H;
            if (lccVar != null) {
                lccVar.cancel(true);
                this.H = null;
            }
            invalidate();
            this.P = size;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x016d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ncc nccVar;
        if (motionEvent != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int measuredWidth = getMeasuredWidth() - gl.L(44.0f);
            float f = measuredWidth;
            int L = gl.L(22.0f) + ((int) (this.d * f));
            int L2 = gl.L(22.0f) + ((int) (this.s * f));
            int L3 = gl.L(22.0f) + ((int) (this.e * f));
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.E != null) {
                    int L4 = gl.L(16.0f);
                    int L5 = gl.L(8.0f);
                    if (L3 != L && L2 - L5 <= x && x <= L5 + L2 && y >= 0.0f && y <= getMeasuredHeight()) {
                        ncc nccVar2 = this.F;
                        if (nccVar2 != null) {
                            ((ny0) nccVar2).b(2);
                        }
                        this.r = true;
                        this.w = (int) (x - L2);
                        invalidate();
                        return true;
                    }
                    if (L - L4 <= x && x <= Math.min(L + L4, L3) && y >= 0.0f && y <= getMeasuredHeight()) {
                        ncc nccVar3 = this.F;
                        if (nccVar3 != null) {
                            ((ny0) nccVar3).b(0);
                        }
                        this.h = true;
                        this.w = (int) (x - L);
                        invalidate();
                        return true;
                    }
                    if (L3 - L4 <= x && x <= L4 + L3 && y >= 0.0f && y <= getMeasuredHeight()) {
                        ncc nccVar4 = this.F;
                        if (nccVar4 != null) {
                            ((ny0) nccVar4).b(1);
                        }
                        this.n = true;
                        this.w = (int) (x - L3);
                        invalidate();
                        return true;
                    }
                    if (L <= x && x <= L3 && y >= 0.0f && y <= getMeasuredHeight()) {
                        ncc nccVar5 = this.F;
                        if (nccVar5 != null) {
                            ((ny0) nccVar5).b(2);
                        }
                        this.r = true;
                        float L6 = (x - gl.L(16.0f)) / f;
                        this.s = L6;
                        ncc nccVar6 = this.F;
                        if (nccVar6 != null) {
                            ny0 ny0Var = (ny0) nccVar6;
                            PhotoViewer photoViewer = (PhotoViewer) ny0Var.d;
                            if (photoViewer.G2 != null) {
                                if (photoViewer.d2 == 1) {
                                    ny0Var.g(0);
                                }
                                ny0Var.f(L6);
                            }
                        }
                        this.w = 0.0f;
                        invalidate();
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.h) {
                    ncc nccVar7 = this.F;
                    if (nccVar7 != null) {
                        ((ny0) nccVar7).c(0);
                    }
                    this.h = false;
                    return true;
                }
                if (this.n) {
                    ncc nccVar8 = this.F;
                    if (nccVar8 != null) {
                        ((ny0) nccVar8).c(1);
                    }
                    this.n = false;
                    return true;
                }
                if (this.r) {
                    ncc nccVar9 = this.F;
                    if (nccVar9 != null) {
                        ((ny0) nccVar9).c(2);
                    }
                    this.r = false;
                }
            } else if (motionEvent.getAction() == 2) {
                if (this.r) {
                    float L7 = (((int) (x - this.w)) - gl.L(16.0f)) / f;
                    this.s = L7;
                    float f2 = this.d;
                    if (L7 >= f2) {
                        f2 = this.e;
                        if (L7 > f2) {
                            this.s = f2;
                        }
                        nccVar = this.F;
                        if (nccVar != null) {
                            ny0 ny0Var2 = (ny0) nccVar;
                            PhotoViewer photoViewer2 = (PhotoViewer) ny0Var2.d;
                            if (photoViewer2.G2 != null) {
                                if (photoViewer2.d2 == 1) {
                                    ny0Var2.g(0);
                                }
                                ny0Var2.f(L7);
                            }
                        }
                        invalidate();
                        return true;
                    }
                    this.s = f2;
                    L7 = f2;
                    nccVar = this.F;
                    if (nccVar != null) {
                    }
                    invalidate();
                    return true;
                }
                if (this.h) {
                    int i = (int) (x - this.w);
                    if (i < gl.L(16.0f)) {
                        L3 = gl.L(16.0f);
                    } else if (i <= L3) {
                        L3 = i;
                    }
                    float L8 = (L3 - gl.L(16.0f)) / f;
                    this.d = L8;
                    float f3 = this.e;
                    float f4 = f3 - L8;
                    float f5 = this.M;
                    if (f4 > f5) {
                        f3 = L8 + f5;
                        this.e = f3;
                    } else {
                        float f6 = this.N;
                        if (f6 != 0.0f && f4 < f6) {
                            L8 = f3 - f6;
                            this.d = L8;
                            if (L8 < 0.0f) {
                                this.d = 0.0f;
                                L8 = 0.0f;
                            }
                        }
                    }
                    float f7 = this.s;
                    if (L8 > f7) {
                        this.s = L8;
                    } else if (f3 < f7) {
                        this.s = f3;
                    }
                    ncc nccVar10 = this.F;
                    if (nccVar10 != null) {
                        ny0 ny0Var3 = (ny0) nccVar10;
                        PhotoViewer photoViewer3 = (PhotoViewer) ny0Var3.d;
                        lbc lbcVar = photoViewer3.G2;
                        if (lbcVar != null) {
                            if (lbcVar.c0()) {
                                photoViewer3.H2 = false;
                                photoViewer3.G2.f0();
                                photoViewer3.f0.invalidate();
                            }
                            ny0Var3.g(1);
                            ny0Var3.f(L8);
                            photoViewer3.q3.h(false, 0.0f);
                            photoViewer3.Y7.setProgress(L8);
                            photoViewer3.O2();
                        }
                    }
                    invalidate();
                    return true;
                }
                if (this.n) {
                    int i2 = (int) (x - this.w);
                    if (i2 >= L) {
                        L = i2 > gl.L(16.0f) + measuredWidth ? gl.L(16.0f) + measuredWidth : i2;
                    }
                    float L9 = (L - gl.L(16.0f)) / f;
                    this.e = L9;
                    float f8 = this.d;
                    float f9 = L9 - f8;
                    float f10 = this.M;
                    if (f9 > f10) {
                        f8 = L9 - f10;
                        this.d = f8;
                    } else {
                        float f11 = this.N;
                        if (f11 != 0.0f && f9 < f11) {
                            L9 = f8 + f11;
                            this.e = L9;
                            if (L9 > 1.0f) {
                                this.e = 1.0f;
                                L9 = 1.0f;
                            }
                        }
                    }
                    float f12 = this.s;
                    if (f8 > f12) {
                        this.s = f8;
                    } else if (L9 < f12) {
                        this.s = L9;
                    }
                    ncc nccVar11 = this.F;
                    if (nccVar11 != null) {
                        ((ny0) nccVar11).e(L9);
                    }
                    invalidate();
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public void setDelegate(ncc nccVar) {
        this.F = nccVar;
    }

    public void setMaxProgressDiff(float f) {
        this.M = f;
        float f2 = this.e;
        float f3 = this.d;
        if (f2 - f3 > f) {
            this.e = f3 + f;
            invalidate();
        }
    }

    public void setMinProgressDiff(float f) {
        this.N = f;
    }

    public void setMode(int i) {
        if (this.Q == i) {
            return;
        }
        this.Q = i;
        invalidate();
    }

    public void setProgress(float f) {
        if (this.x && (f <= 0.0f || f >= 1.0f)) {
            f = this.f;
        }
        long j = this.a;
        float f2 = j != 0 ? 240.0f / j : 0.0f;
        float f3 = this.s;
        if (f < f3 && f <= this.d + f2 && f3 + f2 >= this.e) {
            this.d0.e(true, 1.0f);
        }
        this.s = f;
        invalidate();
    }

    public void setRightProgress(float f) {
        this.e = f;
        ncc nccVar = this.F;
        if (nccVar != null) {
            ((ny0) nccVar).b(1);
        }
        ncc nccVar2 = this.F;
        if (nccVar2 != null) {
            ((ny0) nccVar2).e(this.e);
        }
        ncc nccVar3 = this.F;
        if (nccVar3 != null) {
            ((ny0) nccVar3).c(1);
        }
        invalidate();
    }
}
