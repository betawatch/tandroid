package org.telegram.ui.Components;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class t71 extends View {
    public static final Object c0 = new Object();
    public s71 B;
    public final ArrayList C;
    public q71 D;
    public long E;
    public int F;
    public int G;
    public int H;
    public float I;
    public float J;
    public final RectF K;
    public int L;
    public int M;
    public final Paint N;
    public final ArrayList O;
    public final Rect P;
    public final Paint Q;
    public final Paint R;
    public final Paint S;
    public final Paint T;
    public final Paint U;
    public final Paint V;
    public final z5 W;
    public long a;
    public final Path a0;
    public int b;
    public boolean b0;
    public int c;
    public float d;
    public float e;
    public float f;
    public boolean h;
    public boolean n;
    public boolean r;
    public float s;
    public float v;
    public boolean w;
    public ParcelFileDescriptor x;
    public MediaMetadataRetriever y;

    public t71(Context context) {
        super(context);
        this.e = 1.0f;
        this.s = 0.5f;
        this.C = new ArrayList();
        this.I = 1.0f;
        this.J = 0.0f;
        this.K = new RectF();
        this.M = 0;
        this.N = new Paint(3);
        ArrayList arrayList = new ArrayList();
        this.O = arrayList;
        Rect rect = new Rect();
        this.P = rect;
        Paint paint = new Paint(1);
        this.Q = paint;
        Paint paint2 = new Paint(1);
        this.R = paint2;
        Paint paint3 = new Paint(1);
        this.S = paint3;
        Paint paint4 = new Paint(1);
        this.T = paint4;
        Paint paint5 = new Paint(1);
        this.U = paint5;
        Paint paint6 = new Paint(1);
        this.V = paint6;
        this.W = new z5(0.0f, this, 0L, 200L, nr.j);
        this.a0 = new Path();
        paint.setColor(-1);
        paint2.setColor(-256);
        paint3.setColor(637534208);
        paint4.setColor(1291845632);
        paint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint6.setColor(-16777216);
        arrayList.add(rect);
    }

    public final void a() {
        Bitmap bitmap;
        synchronized (c0) {
            try {
                ParcelFileDescriptor parcelFileDescriptor = this.x;
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                    this.x = null;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.y;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.y = null;
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        for (int i10 = 0; i10 < this.C.size(); i10++) {
            r71 r71Var = (r71) this.C.get(i10);
            if (r71Var != null && (bitmap = r71Var.a) != null) {
                bitmap.recycle();
            }
        }
        this.C.clear();
        q71 q71Var = this.D;
        if (q71Var != null) {
            q71Var.cancel(true);
            this.D = null;
        }
    }

    public abstract void b(Canvas canvas, RectF rectF);

    public final void c(float f10, float f11, Canvas canvas, Paint paint) {
        float dpf2 = AndroidUtilities.dpf2(12.0f);
        float dp = AndroidUtilities.dp(2.0f);
        float dp2 = AndroidUtilities.dp(46.0f) + dp;
        float f12 = (1.0f - f11) * ((dp2 - dp) / 2.0f);
        float f13 = dp + f12;
        float f14 = dp2 - f12;
        Paint paint2 = this.S;
        paint2.setAlpha((int) (38.0f * f11));
        paint.setAlpha((int) (f11 * 255.0f));
        float measuredWidth = (((getMeasuredWidth() - (dpf2 * 2.0f)) - AndroidUtilities.dp(20.0f)) * f10) + dpf2 + AndroidUtilities.dp(10.0f);
        float dpf22 = measuredWidth - AndroidUtilities.dpf2(1.5f);
        float dpf23 = AndroidUtilities.dpf2(1.5f) + measuredWidth;
        RectF rectF = this.K;
        rectF.set(dpf22, f13, dpf23, f14);
        rectF.inset(-AndroidUtilities.dpf2(0.66f), -AndroidUtilities.dpf2(0.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint2);
        rectF.set(measuredWidth - AndroidUtilities.dpf2(1.5f), f13, AndroidUtilities.dpf2(1.5f) + measuredWidth, f14);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
    }

    public final void d(int i10) {
        int i11;
        if (this.y == null) {
            return;
        }
        if (i10 == 0) {
            this.G = AndroidUtilities.dp(38.0f);
            this.H = Math.max(1, (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(32.0f)) / (this.G * Utilities.clamp((this.b == 0 || (i11 = this.c) == 0) ? 1.0f : r1 / i11, 1.3333334f, 0.5625f))));
            this.F = (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(32.0f)) / this.H);
            this.E = this.a / this.H;
        }
        q71 q71Var = new q71(this);
        this.D = q71Var;
        q71Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i10), null, null);
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
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        Canvas canvas2;
        float dpf2 = AndroidUtilities.dpf2(12.0f);
        float measuredWidth = getMeasuredWidth() - (dpf2 * 2.0f);
        float dp = AndroidUtilities.dp(10.0f) + dpf2 + ((int) ((measuredWidth - AndroidUtilities.dp(20.0f)) * this.d));
        float dp2 = AndroidUtilities.dp(10.0f) + dpf2 + ((int) ((measuredWidth - AndroidUtilities.dp(20.0f)) * this.e));
        float dp3 = AndroidUtilities.dp(6.0f);
        float dp4 = dp3 + AndroidUtilities.dp(38.0f);
        ArrayList arrayList = this.C;
        boolean isEmpty = arrayList.isEmpty();
        Path path = this.a0;
        if (isEmpty && this.D == null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(dpf2, dp3, measuredWidth + dpf2, dp4);
            canvas.save();
            path.rewind();
            path.addRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.clipPath(path);
            b(canvas, rectF);
            canvas.restore();
            d(0);
            f13 = dp;
            f15 = dp3;
            f14 = dp2;
            f10 = 2.0f;
            f11 = 10.0f;
            f12 = 6.0f;
        } else {
            canvas.save();
            path.rewind();
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f16 = measuredWidth + dpf2;
            rectF2.set(dpf2, dp3, f16, dp4);
            f10 = 2.0f;
            f11 = 10.0f;
            f12 = 6.0f;
            path.addRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.clipPath(path);
            boolean z4 = arrayList.size() < this.H;
            this.b0 = z4;
            if (!z4) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (((r71) arrayList.get(i10)).a == null) {
                        this.b0 = true;
                        break;
                    }
                    i10++;
                }
            }
            if (this.b0) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(dpf2, dp3, AndroidUtilities.dp(4.0f) + f16, dp4);
                b(canvas, rectF3);
            }
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                r71 r71Var = (r71) arrayList.get(i12);
                Bitmap bitmap = r71Var.a;
                if (bitmap != null) {
                    float f17 = (this.F * i11) + dpf2;
                    float dp5 = AndroidUtilities.dp(6.0f);
                    float f18 = r71Var.b;
                    if (f18 != 1.0f) {
                        float f19 = f18 + 0.045714285f;
                        r71Var.b = f19;
                        if (f19 > 1.0f) {
                            r71Var.b = 1.0f;
                        } else {
                            invalidate();
                        }
                        int interpolation = (int) (nr.h.getInterpolation(r71Var.b) * 255.0f);
                        Paint paint = this.N;
                        paint.setAlpha(interpolation);
                        canvas.drawBitmap(bitmap, f17, dp5, paint);
                    } else {
                        canvas.drawBitmap(bitmap, f17, dp5, (Paint) null);
                    }
                }
                i11++;
            }
            float dp6 = AndroidUtilities.dp(46.0f);
            Paint paint2 = this.T;
            canvas.drawRect(dpf2, dp3, dp, dp6, paint2);
            f13 = dp;
            canvas.drawRect(dp2, dp3, f16, dp4, paint2);
            f14 = dp2;
            f15 = dp3;
            canvas.restore();
        }
        boolean z10 = this.w;
        Paint paint3 = this.Q;
        if (z10) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            float dpf22 = f13 - AndroidUtilities.dpf2(f11);
            float dpf23 = AndroidUtilities.dpf2(f11) + f14;
            RectF rectF4 = this.K;
            rectF4.set(dpf22, f15, dpf23, dp4);
            paint3.setAlpha(255);
            canvas2.drawRoundRect(rectF4, AndroidUtilities.dpf2(f12), AndroidUtilities.dpf2(f12), paint3);
            rectF4.set(f13, AndroidUtilities.dpf2(f10) + f15, f14, dp4 - AndroidUtilities.dpf2(f10));
            canvas2.drawRect(rectF4, this.U);
            canvas2.restore();
            float dp7 = AndroidUtilities.dp(f10);
            float dp8 = AndroidUtilities.dp(f11);
            float dpf24 = f13 - ((AndroidUtilities.dpf2(f11) - dp7) / f10);
            float f20 = (((dp4 - f15) - dp8) / f10) + f15;
            float f21 = dp8 + f20;
            rectF4.set(dpf24, f20, dpf24 - dp7, f21);
            float dpf25 = AndroidUtilities.dpf2(f12);
            float dpf26 = AndroidUtilities.dpf2(f12);
            Paint paint4 = this.V;
            canvas2.drawRoundRect(rectF4, dpf25, dpf26, paint4);
            float dpf27 = ((AndroidUtilities.dpf2(f11) - dp7) / f10) + f14;
            rectF4.set(dpf27, f20, dp7 + dpf27, f21);
            canvas2.drawRoundRect(rectF4, AndroidUtilities.dpf2(f12), AndroidUtilities.dpf2(f12), paint4);
        }
        float d = this.W.d(0.0f, false);
        if (d > 0.0f) {
            c(this.e, d, canvas2, paint3);
        }
        c(this.s, 1.0f - d, canvas2, paint3);
        if (this.w) {
            c(this.f, 1.0f, canvas2, this.R);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT >= 29) {
            this.P.set(i10, 0, i12, getMeasuredHeight());
            setSystemGestureExclusionRects(this.O);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList;
        Bitmap bitmap;
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.L != size) {
            int i12 = 0;
            while (true) {
                arrayList = this.C;
                if (i12 >= arrayList.size()) {
                    break;
                }
                r71 r71Var = (r71) arrayList.get(i12);
                if (r71Var != null && (bitmap = r71Var.a) != null) {
                    bitmap.recycle();
                }
                i12++;
            }
            arrayList.clear();
            q71 q71Var = this.D;
            if (q71Var != null) {
                q71Var.cancel(true);
                this.D = null;
            }
            invalidate();
            this.L = size;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(44.0f);
            float f10 = measuredWidth;
            int dp = AndroidUtilities.dp(22.0f) + ((int) (this.d * f10));
            int dp2 = AndroidUtilities.dp(22.0f) + ((int) (this.s * f10));
            int dp3 = AndroidUtilities.dp(22.0f) + ((int) (this.e * f10));
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.y != null) {
                    int dp4 = AndroidUtilities.dp(16.0f);
                    int dp5 = AndroidUtilities.dp(8.0f);
                    if (dp3 != dp && dp2 - dp5 <= x10 && x10 <= dp5 + dp2 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        s71 s71Var = this.B;
                        if (s71Var != null) {
                            ((com.google.android.gms.common.api.internal.v) s71Var).f(2);
                        }
                        this.r = true;
                        this.v = (int) (x10 - dp2);
                        invalidate();
                        return true;
                    }
                    if (dp - dp4 <= x10 && x10 <= Math.min(dp + dp4, dp3) && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        s71 s71Var2 = this.B;
                        if (s71Var2 != null) {
                            ((com.google.android.gms.common.api.internal.v) s71Var2).f(0);
                        }
                        this.h = true;
                        this.v = (int) (x10 - dp);
                        invalidate();
                        return true;
                    }
                    if (dp3 - dp4 <= x10 && x10 <= dp4 + dp3 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        s71 s71Var3 = this.B;
                        if (s71Var3 != null) {
                            ((com.google.android.gms.common.api.internal.v) s71Var3).f(1);
                        }
                        this.n = true;
                        this.v = (int) (x10 - dp3);
                        invalidate();
                        return true;
                    }
                    if (dp <= x10 && x10 <= dp3 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        s71 s71Var4 = this.B;
                        if (s71Var4 != null) {
                            ((com.google.android.gms.common.api.internal.v) s71Var4).f(2);
                        }
                        this.r = true;
                        float dp6 = (x10 - AndroidUtilities.dp(16.0f)) / f10;
                        this.s = dp6;
                        s71 s71Var5 = this.B;
                        if (s71Var5 != null) {
                            com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) s71Var5;
                            PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                            if (photoViewer.C2 != null) {
                                if (photoViewer.Z1 == 1) {
                                    vVar.j(0);
                                }
                                vVar.i(dp6);
                            }
                        }
                        this.v = 0.0f;
                        invalidate();
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.h) {
                    s71 s71Var6 = this.B;
                    if (s71Var6 != null) {
                        ((com.google.android.gms.common.api.internal.v) s71Var6).g(0);
                    }
                    this.h = false;
                    return true;
                }
                if (this.n) {
                    s71 s71Var7 = this.B;
                    if (s71Var7 != null) {
                        ((com.google.android.gms.common.api.internal.v) s71Var7).g(1);
                    }
                    this.n = false;
                    return true;
                }
                if (this.r) {
                    s71 s71Var8 = this.B;
                    if (s71Var8 != null) {
                        ((com.google.android.gms.common.api.internal.v) s71Var8).g(2);
                    }
                    this.r = false;
                }
            } else if (motionEvent.getAction() == 2) {
                if (this.r) {
                    float dp7 = (((int) (x10 - this.v)) - AndroidUtilities.dp(16.0f)) / f10;
                    this.s = dp7;
                    float f11 = this.d;
                    if (dp7 < f11) {
                        this.s = f11;
                    } else {
                        float f12 = this.e;
                        if (dp7 > f12) {
                            this.s = f12;
                        }
                    }
                    s71 s71Var9 = this.B;
                    if (s71Var9 != null) {
                        float f13 = this.s;
                        com.google.android.gms.common.api.internal.v vVar2 = (com.google.android.gms.common.api.internal.v) s71Var9;
                        PhotoViewer photoViewer2 = (PhotoViewer) vVar2.d;
                        if (photoViewer2.C2 != null) {
                            if (photoViewer2.Z1 == 1) {
                                vVar2.j(0);
                            }
                            vVar2.i(f13);
                        }
                    }
                    invalidate();
                    return true;
                }
                if (this.h) {
                    int i10 = (int) (x10 - this.v);
                    if (i10 < AndroidUtilities.dp(16.0f)) {
                        dp3 = AndroidUtilities.dp(16.0f);
                    } else if (i10 <= dp3) {
                        dp3 = i10;
                    }
                    float dp8 = (dp3 - AndroidUtilities.dp(16.0f)) / f10;
                    this.d = dp8;
                    float f14 = this.e;
                    float f15 = f14 - dp8;
                    float f16 = this.I;
                    if (f15 > f16) {
                        this.e = dp8 + f16;
                    } else {
                        float f17 = this.J;
                        if (f17 != 0.0f && f15 < f17) {
                            float f18 = f14 - f17;
                            this.d = f18;
                            if (f18 < 0.0f) {
                                this.d = 0.0f;
                            }
                        }
                    }
                    float f19 = this.d;
                    float f20 = this.s;
                    if (f19 > f20) {
                        this.s = f19;
                    } else {
                        float f21 = this.e;
                        if (f21 < f20) {
                            this.s = f21;
                        }
                    }
                    s71 s71Var10 = this.B;
                    if (s71Var10 != null) {
                        com.google.android.gms.common.api.internal.v vVar3 = (com.google.android.gms.common.api.internal.v) s71Var10;
                        PhotoViewer photoViewer3 = (PhotoViewer) vVar3.d;
                        i71 i71Var = photoViewer3.C2;
                        if (i71Var != null) {
                            if (i71Var.y()) {
                                photoViewer3.E2 = false;
                                photoViewer3.C2.B();
                                photoViewer3.b0.invalidate();
                            }
                            vVar3.j(1);
                            vVar3.i(f19);
                            photoViewer3.n3.h(0.0f, false);
                            photoViewer3.O7.setProgress(f19);
                            photoViewer3.B3();
                        }
                    }
                    invalidate();
                    return true;
                }
                if (this.n) {
                    int i11 = (int) (x10 - this.v);
                    if (i11 >= dp) {
                        dp = i11 > AndroidUtilities.dp(16.0f) + measuredWidth ? AndroidUtilities.dp(16.0f) + measuredWidth : i11;
                    }
                    float dp9 = (dp - AndroidUtilities.dp(16.0f)) / f10;
                    this.e = dp9;
                    float f22 = this.d;
                    float f23 = dp9 - f22;
                    float f24 = this.I;
                    if (f23 > f24) {
                        this.d = dp9 - f24;
                    } else {
                        float f25 = this.J;
                        if (f25 != 0.0f && f23 < f25) {
                            float f26 = f22 + f25;
                            this.e = f26;
                            if (f26 > 1.0f) {
                                this.e = 1.0f;
                            }
                        }
                    }
                    float f27 = this.d;
                    float f28 = this.s;
                    if (f27 > f28) {
                        this.s = f27;
                    } else {
                        float f29 = this.e;
                        if (f29 < f28) {
                            this.s = f29;
                        }
                    }
                    s71 s71Var11 = this.B;
                    if (s71Var11 != null) {
                        ((com.google.android.gms.common.api.internal.v) s71Var11).h(this.e);
                    }
                    invalidate();
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public void setDelegate(s71 s71Var) {
        this.B = s71Var;
    }

    public void setMaxProgressDiff(float f10) {
        this.I = f10;
        float f11 = this.e;
        float f12 = this.d;
        if (f11 - f12 > f10) {
            this.e = f12 + f10;
            invalidate();
        }
    }

    public void setMinProgressDiff(float f10) {
        this.J = f10;
    }

    public void setMode(int i10) {
        if (this.M == i10) {
            return;
        }
        this.M = i10;
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.w && (f10 <= 0.0f || f10 >= 1.0f)) {
            f10 = this.f;
        }
        long j10 = this.a;
        float f11 = j10 != 0 ? 240.0f / j10 : 0.0f;
        float f12 = this.s;
        if (f10 < f12 && f10 <= this.d + f11 && f12 + f11 >= this.e) {
            this.W.d(1.0f, true);
        }
        this.s = f10;
        invalidate();
    }

    public void setRightProgress(float f10) {
        this.e = f10;
        s71 s71Var = this.B;
        if (s71Var != null) {
            ((com.google.android.gms.common.api.internal.v) s71Var).f(1);
        }
        s71 s71Var2 = this.B;
        if (s71Var2 != null) {
            ((com.google.android.gms.common.api.internal.v) s71Var2).h(this.e);
        }
        s71 s71Var3 = this.B;
        if (s71Var3 != null) {
            ((com.google.android.gms.common.api.internal.v) s71Var3).g(1);
        }
        invalidate();
    }
}
