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
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a61 extends View {
    public static final Object U = new Object();
    public int E;
    public int F;
    public int G;
    public float H;
    public float I;
    public boolean J;
    public Rect K;
    public Rect L;
    public int M;
    public Bitmap N;
    public final ArrayList O;
    public boolean P;
    public y51 Q;
    public Path R;
    public final Paint S;
    public boolean T;
    public long a;
    public float b;
    public float c;
    public final Paint d;
    public final Paint e;
    public boolean f;
    public boolean h;
    public float n;
    public MediaMetadataRetriever r;
    public z51 s;
    public final ArrayList w;
    public x51 x;
    public long y;

    public a61(Context context) {
        super(context);
        this.c = 1.0f;
        Paint paint = new Paint();
        this.d = paint;
        Paint paint2 = new Paint();
        this.e = paint2;
        this.w = new ArrayList();
        this.H = 1.0f;
        this.I = 0.0f;
        this.O = new ArrayList();
        Paint paint3 = new Paint(1);
        this.S = paint3;
        paint.setColor(2130706432);
        paint3.setColor(-1);
        paint3.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false));
        this.M = 0;
        y51 y51Var = this.Q;
        if (y51Var != null) {
            y51Var.b();
        }
    }

    public final void a(boolean z10) {
        synchronized (U) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.r;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.r = null;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (z10) {
            int i3 = 0;
            if (this.O.isEmpty()) {
                while (i3 < this.w.size()) {
                    Bitmap bitmap = (Bitmap) this.w.get(i3);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    i3++;
                }
            } else {
                while (i3 < this.O.size()) {
                    Bitmap bitmap2 = (Bitmap) this.O.get(i3);
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    i3++;
                }
            }
        }
        this.O.clear();
        this.w.clear();
        x51 x51Var = this.x;
        if (x51Var != null) {
            x51Var.cancel(true);
            this.x = null;
        }
    }

    public final void b(int i3) {
        if (this.r == null) {
            return;
        }
        if (i3 == 0) {
            if (this.J) {
                int L = org.telegram.messenger.g0.L(56.0f);
                this.E = L;
                this.F = L;
                this.G = Math.max(1, (int) Math.ceil((getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) / (this.F / 2.0f)));
            } else {
                this.F = org.telegram.messenger.g0.L(40.0f);
                this.G = Math.max(1, (getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) / this.F);
                this.E = (int) Math.ceil((getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) / this.G);
            }
            this.y = this.a / this.G;
            ArrayList arrayList = this.O;
            if (!arrayList.isEmpty()) {
                float size = arrayList.size() / this.G;
                float f10 = 0.0f;
                for (int i10 = 0; i10 < this.G; i10++) {
                    this.w.add((Bitmap) arrayList.get((int) f10));
                    f10 += size;
                }
                return;
            }
        }
        this.P = false;
        x51 x51Var = new x51(this);
        this.x = x51Var;
        x51Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i3), null, null);
    }

    public float getLeftProgress() {
        return this.b;
    }

    public float getRightProgress() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.T) {
            canvas.save();
            Path path = this.R;
            if (path != null) {
                canvas.clipPath(path);
            }
        }
        float measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
        int L = org.telegram.messenger.g0.L(12.0f) + ((int) (this.b * measuredWidth));
        int L2 = org.telegram.messenger.g0.L(12.0f) + ((int) (measuredWidth * this.c));
        float f10 = 32.0f;
        int measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) >> 1;
        ArrayList arrayList = this.w;
        if (arrayList.isEmpty() && this.x == null) {
            b(0);
        }
        if (arrayList.isEmpty()) {
            if (this.T) {
                canvas.restore();
                return;
            }
            return;
        }
        if (!this.P) {
            canvas.drawRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, this.e);
        }
        int i3 = 0;
        int i10 = 0;
        while (i3 < arrayList.size()) {
            Bitmap bitmap = (Bitmap) arrayList.get(i3);
            if (bitmap != null && !bitmap.isRecycled()) {
                boolean z10 = this.J;
                int i11 = this.E;
                if (z10) {
                    i11 /= 2;
                }
                int i12 = i11 * i10;
                if (z10) {
                    this.L.set(i12, measuredHeight, org.telegram.messenger.g0.L(28.0f) + i12, org.telegram.messenger.g0.L(f10) + measuredHeight);
                    canvas.drawBitmap(bitmap, this.K, this.L, (Paint) null);
                } else {
                    canvas.drawBitmap(bitmap, i12, measuredHeight, (Paint) null);
                }
            }
            i10++;
            i3++;
            f10 = 32.0f;
        }
        float f11 = measuredHeight;
        float measuredHeight2 = getMeasuredHeight() - measuredHeight;
        Paint paint = this.d;
        canvas.drawRect(0.0f, f11, L, measuredHeight2, paint);
        canvas.drawRect(L2, f11, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, paint);
        float L3 = L - org.telegram.messenger.g0.L(4.0f);
        float L4 = org.telegram.messenger.g0.L(10.0f) + measuredHeight;
        float L5 = L - org.telegram.messenger.g0.L(4.0f);
        float z11 = org.telegram.messenger.k5.z(10.0f, getMeasuredHeight(), measuredHeight);
        Paint paint2 = this.S;
        canvas.drawLine(L3, L4, L5, z11, paint2);
        canvas.drawLine(org.telegram.messenger.g0.L(4.0f) + L2, org.telegram.messenger.g0.L(10.0f) + measuredHeight, org.telegram.messenger.g0.L(4.0f) + L2, org.telegram.messenger.k5.z(10.0f, getMeasuredHeight(), measuredHeight), paint2);
        if (this.T) {
            canvas.restore();
            return;
        }
        int measuredHeight3 = getMeasuredHeight() - (measuredHeight * 2);
        int measuredWidth2 = getMeasuredWidth();
        if (org.telegram.messenger.g0.L(6.0f) != this.M) {
            this.M = org.telegram.messenger.g0.L(6.0f);
            this.N = Bitmap.createBitmap(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(this.N);
            Paint paint3 = new Paint(1);
            paint3.setColor(0);
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas2.drawColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ge, false));
            float f12 = this.M;
            canvas2.drawCircle(f12, f12, f12, paint3);
        }
        int i13 = this.M >> 1;
        canvas.save();
        float f13 = 0;
        canvas.drawBitmap(this.N, f13, f11, (Paint) null);
        float f14 = (measuredHeight3 + measuredHeight) - i13;
        canvas.rotate(-90.0f, i13, f14);
        canvas.drawBitmap(this.N, f13, r2 - this.M, (Paint) null);
        canvas.restore();
        canvas.save();
        float f15 = measuredWidth2 - i13;
        canvas.rotate(180.0f, f15, f14);
        Bitmap bitmap2 = this.N;
        int i14 = this.M;
        canvas.drawBitmap(bitmap2, measuredWidth2 - i14, r2 - i14, (Paint) null);
        canvas.restore();
        canvas.save();
        canvas.rotate(90.0f, f15, measuredHeight + i13);
        canvas.drawBitmap(this.N, measuredWidth2 - this.M, f11, (Paint) null);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        if (this.T) {
            if (this.R == null) {
                this.R = new Path();
            }
            this.R.rewind();
            int measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) >> 1;
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight() - measuredHeight);
            this.R.addRoundRect(rectF, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), Path.Direction.CCW);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            float x10 = motionEvent.getX();
            float y9 = motionEvent.getY();
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
            float f10 = measuredWidth;
            int L = org.telegram.messenger.g0.L(12.0f) + ((int) (this.b * f10));
            int L2 = org.telegram.messenger.g0.L(12.0f) + ((int) (this.c * f10));
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.r != null) {
                    int L3 = org.telegram.messenger.g0.L(24.0f);
                    if (L - L3 <= x10 && x10 <= L + L3 && y9 >= 0.0f && y9 <= getMeasuredHeight()) {
                        z51 z51Var = this.s;
                        if (z51Var != null) {
                            ((ke) z51Var).a.a3.O(0.0f, 1);
                        }
                        this.f = true;
                        this.n = (int) (x10 - L);
                        this.Q.setTime((int) ((this.a / 1000.0f) * this.b));
                        this.Q.setCx(org.telegram.messenger.g0.L(4.0f) + getLeft() + L);
                        this.Q.a(true);
                        invalidate();
                        return true;
                    }
                    if (L2 - L3 > x10 || x10 > L3 + L2 || y9 < 0.0f || y9 > getMeasuredHeight()) {
                        this.Q.a(false);
                        return false;
                    }
                    z51 z51Var2 = this.s;
                    if (z51Var2 != null) {
                        ((ke) z51Var2).a.a3.O(0.0f, 1);
                    }
                    this.h = true;
                    this.n = (int) (x10 - L2);
                    this.Q.setTime((int) ((this.a / 1000.0f) * this.c));
                    this.Q.setCx((getLeft() + L2) - org.telegram.messenger.g0.L(4.0f));
                    this.Q.a(true);
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.f) {
                    z51 z51Var3 = this.s;
                    if (z51Var3 != null) {
                        ((ke) z51Var3).a.a3.O(0.0f, 0);
                    }
                    this.f = false;
                    invalidate();
                    this.Q.a(false);
                    return true;
                }
                if (this.h) {
                    z51 z51Var4 = this.s;
                    if (z51Var4 != null) {
                        ((ke) z51Var4).a.a3.O(0.0f, 0);
                    }
                    this.h = false;
                    invalidate();
                    this.Q.a(false);
                    return true;
                }
            } else if (motionEvent.getAction() == 2) {
                if (this.f) {
                    int i3 = (int) (x10 - this.n);
                    if (i3 < org.telegram.messenger.g0.L(16.0f)) {
                        L2 = org.telegram.messenger.g0.L(16.0f);
                    } else if (i3 <= L2) {
                        L2 = i3;
                    }
                    float L4 = (L2 - org.telegram.messenger.g0.L(16.0f)) / f10;
                    this.b = L4;
                    float f11 = this.c;
                    float f12 = f11 - L4;
                    float f13 = this.H;
                    if (f12 > f13) {
                        this.c = L4 + f13;
                    } else {
                        float f14 = this.I;
                        if (f14 != 0.0f && f12 < f14) {
                            float f15 = f11 - f14;
                            this.b = f15;
                            if (f15 < 0.0f) {
                                this.b = 0.0f;
                            }
                        }
                    }
                    this.Q.setCx(((org.telegram.messenger.g0.N(12.0f) + (f10 * this.b)) + getLeft()) - org.telegram.messenger.g0.L(4.0f));
                    this.Q.setTime((int) ((this.a / 1000.0f) * this.b));
                    this.Q.a(true);
                    z51 z51Var5 = this.s;
                    if (z51Var5 != null) {
                        float f16 = this.b;
                        ChatActivityEnterView chatActivityEnterView = ((ke) z51Var5).a;
                        org.telegram.messenger.b20 b20Var = chatActivityEnterView.f3;
                        if (b20Var != null) {
                            b20Var.a = (long) (b20Var.r * f16);
                            chatActivityEnterView.a3.O(f16, 2);
                        }
                    }
                    invalidate();
                    return true;
                }
                if (this.h) {
                    int i10 = (int) (x10 - this.n);
                    if (i10 >= L) {
                        L = i10 > org.telegram.messenger.g0.L(16.0f) + measuredWidth ? org.telegram.messenger.g0.L(16.0f) + measuredWidth : i10;
                    }
                    float L5 = (L - org.telegram.messenger.g0.L(16.0f)) / f10;
                    this.c = L5;
                    float f17 = this.b;
                    float f18 = L5 - f17;
                    float f19 = this.H;
                    if (f18 > f19) {
                        this.b = L5 - f19;
                    } else {
                        float f20 = this.I;
                        if (f20 != 0.0f && f18 < f20) {
                            float f21 = f17 + f20;
                            this.c = f21;
                            if (f21 > 1.0f) {
                                this.c = 1.0f;
                            }
                        }
                    }
                    this.Q.setCx(org.telegram.messenger.g0.N(12.0f) + (f10 * this.c) + getLeft() + org.telegram.messenger.g0.L(4.0f));
                    this.Q.a(true);
                    this.Q.setTime((int) ((this.a / 1000.0f) * this.c));
                    z51 z51Var6 = this.s;
                    if (z51Var6 != null) {
                        float f22 = this.c;
                        ChatActivityEnterView chatActivityEnterView2 = ((ke) z51Var6).a;
                        org.telegram.messenger.b20 b20Var2 = chatActivityEnterView2.f3;
                        if (b20Var2 != null) {
                            b20Var2.b = (long) (b20Var2.r * f22);
                            chatActivityEnterView2.a3.O(f22, 2);
                        }
                    }
                    invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    public void setDelegate(z51 z51Var) {
        this.s = z51Var;
    }

    public void setKeyframes(ArrayList<Bitmap> arrayList) {
        ArrayList arrayList2 = this.O;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    public void setMaxProgressDiff(float f10) {
        this.H = f10;
        float f11 = this.c;
        float f12 = this.b;
        if (f11 - f12 > f10) {
            this.c = f12 + f10;
            invalidate();
        }
    }

    public void setMinProgressDiff(float f10) {
        this.I = f10;
    }

    public void setRoundFrames(boolean z10) {
        this.J = z10;
        if (z10) {
            this.K = new Rect(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f));
            this.L = new Rect();
        }
    }

    public void setTimeHintView(y51 y51Var) {
        this.Q = y51Var;
    }

    public void setVideoPath(String str) {
        a(false);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.r = mediaMetadataRetriever;
        this.b = 0.0f;
        this.c = 1.0f;
        try {
            mediaMetadataRetriever.setDataSource(str);
            this.a = Long.parseLong(this.r.extractMetadata(9));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        invalidate();
    }
}
