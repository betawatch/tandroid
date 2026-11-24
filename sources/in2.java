// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class in2 extends View {
    public final Paint a;
    public final int[] b;
    public final Paint c;
    public final LongSparseArray d;
    public long e;
    public final Path f;
    public final float[] h;
    public final HashMap n;
    public final /* synthetic */ ln2 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in2(ln2 ln2Var, Context context) {
        super(context);
        this.r = ln2Var;
        this.a = new Paint(1);
        this.b = new int[]{-16735784, -16752387, -11788361, -6804548, -4707235, -180718, -38656, -152832, -211200, -198077, -2495689, -8996289};
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new LongSparseArray();
        this.e = Long.MIN_VALUE;
        this.f = new Path();
        this.h = new float[8];
        this.n = new HashMap();
        setPadding(gm.L(14.0f), gm.L(3.0f), gm.L(14.0f), gm.L(3.0f));
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        for (int i = 0; i < 12; i++) {
            for (int i2 = 0; i2 < 10; i2++) {
                if (i2 == 0) {
                    this.n.put(Long.valueOf((i << 16) + i2), Integer.valueOf(on2.f(i / 11.0f, -1, -16777216)));
                } else {
                    int[] iArr = this.b;
                    this.n.put(Long.valueOf((i << 16) + i2), Integer.valueOf(i2 < 6 ? on2.f(((5 - i2) / 4.0f) * 0.5f, iArr[i], -16777216) : on2.f(hg9.x(9 - i2, 5.0f, 0.5f, 0.5f), iArr[i], -1)));
                }
            }
        }
    }

    public final void a(int i) {
        for (Map.Entry entry : this.n.entrySet()) {
            if (((Integer) entry.getValue()).intValue() == i) {
                long longValue = ((Long) entry.getKey()).longValue();
                b((int) (longValue >> 16), (int) (longValue - (r5 << 16)));
                return;
            }
        }
        this.e = Long.MIN_VALUE;
        invalidate();
    }

    public final void b(int i, int i2) {
        long j = (i << 16) + i2;
        this.e = j;
        LongSparseArray longSparseArray = this.d;
        if (longSparseArray.get(j) == null) {
            longSparseArray.put(this.e, Float.valueOf(0.0f));
        }
        invalidate();
    }

    public final void c(MotionEvent motionEvent) {
        int width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / 12;
        int height = ((getHeight() - getPaddingTop()) - getPaddingBottom()) / 10;
        int x = (int) ((motionEvent.getX() - getPaddingLeft()) / width);
        int y = (int) (motionEvent.getY() / height);
        Integer num = (Integer) this.n.get(Long.valueOf((x << 16) + y));
        if (num != null) {
            int intValue = num.intValue();
            int i = ln2.t1;
            this.r.D0(intValue, 3);
            b(x, y);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        HashMap hashMap;
        super.onDraw(canvas);
        RectF rectF = gm.P;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        canvas.save();
        Path path = this.r.o1;
        path.rewind();
        float f = 10.0f;
        path.addRoundRect(rectF, gm.L(10.0f), gm.L(10.0f), Path.Direction.CW);
        canvas.clipPath(path);
        float width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / 12.0f;
        float height = ((getHeight() - getPaddingTop()) - getPaddingBottom()) / 10.0f;
        int i = 0;
        while (true) {
            hashMap = this.n;
            if (i >= 12) {
                break;
            }
            for (int i2 = 0; i2 < 10; i2++) {
                Integer num = (Integer) hashMap.get(Long.valueOf((i << 16) + i2));
                if (num != null) {
                    int intValue = num.intValue();
                    Paint paint = this.a;
                    paint.setColor(intValue);
                    RectF rectF2 = gm.P;
                    rectF2.set((i * width) + getPaddingLeft(), (i2 * height) + getPaddingTop(), ((i + 1) * width) + getPaddingLeft(), ((i2 + 1) * height) + getPaddingTop());
                    canvas.drawRect(rectF2, paint);
                }
            }
            i++;
        }
        canvas.restore();
        int i3 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.d;
            if (i3 >= longSparseArray.size()) {
                return;
            }
            long keyAt = longSparseArray.keyAt(i3);
            float floatValue = ((Float) longSparseArray.valueAt(i3)).floatValue();
            float min = this.e == keyAt ? Math.min(1.0f, floatValue + 0.045714285f) : Math.max(0.0f, floatValue - 0.10666667f);
            float f2 = f;
            int i4 = (int) (keyAt >> 16);
            int i5 = (int) (keyAt - (i4 << 16));
            Integer num2 = (Integer) hashMap.get(Long.valueOf(keyAt));
            Paint paint2 = this.c;
            if (num2 != null) {
                paint2.setColor(gm.B(num2.intValue()) > 0.721f ? -15658735 : -1);
            }
            paint2.setStrokeWidth(d53.h.getInterpolation(min) * gm.L(3.0f));
            Path path2 = this.f;
            path2.rewind();
            RectF rectF3 = gm.P;
            float f3 = width;
            float f4 = height;
            HashMap hashMap2 = hashMap;
            rectF3.set((i4 * f3) + getPaddingLeft(), (i5 * f4) + getPaddingTop(), ((i4 + 1) * f3) + getPaddingLeft(), ((i5 + 1) * f4) + getPaddingTop());
            float L = (i4 == 0 && i5 == 0) ? gm.L(f2) : 0.0f;
            float[] fArr = this.h;
            fArr[1] = L;
            fArr[0] = L;
            float L2 = (i4 == 11 && i5 == 0) ? gm.L(f2) : 0.0f;
            fArr[3] = L2;
            fArr[2] = L2;
            float L3 = (i4 == 11 && i5 == 9) ? gm.L(f2) : 0.0f;
            fArr[5] = L3;
            fArr[4] = L3;
            float L4 = (i4 == 0 && i5 == 9) ? gm.L(f2) : 0.0f;
            fArr[7] = L4;
            fArr[6] = L4;
            path2.addRoundRect(rectF3, fArr, Path.Direction.CW);
            canvas.drawPath(path2, paint2);
            if (min > 0.0f || this.e == keyAt) {
                if (min < 1.0f) {
                    invalidate();
                }
                longSparseArray.setValueAt(i3, Float.valueOf(min));
            } else {
                longSparseArray.removeAt(i3);
                i3--;
                invalidate();
            }
            i3++;
            f = f2;
            width = f3;
            height = f4;
            hashMap = hashMap2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
    
        if (r0 != 3) goto L14;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                c(motionEvent);
            } else if (actionMasked == 2) {
                c(motionEvent);
            }
            getParent().requestDisallowInterceptTouchEvent(false);
        } else {
            c(motionEvent);
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }
}
