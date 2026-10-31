package ig;

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
import org.telegram.messenger.z20;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q extends View {
    public final Paint a;
    public final int[] b;
    public final Paint c;
    public final LongSparseArray d;
    public long e;
    public final Path f;
    public final float[] h;
    public final HashMap n;
    public final /* synthetic */ u r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u uVar, Context context) {
        super(context);
        this.r = uVar;
        this.a = new Paint(1);
        this.b = new int[]{-16735784, -16752387, -11788361, -6804548, -4707235, -180718, -38656, -152832, -211200, -198077, -2495689, -8996289};
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new LongSparseArray();
        this.e = Long.MIN_VALUE;
        this.f = new Path();
        this.h = new float[8];
        this.n = new HashMap();
        setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(3.0f));
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        for (int i10 = 0; i10 < 12; i10++) {
            for (int i11 = 0; i11 < 10; i11++) {
                if (i11 == 0) {
                    this.n.put(Long.valueOf((i10 << 16) + i11), Integer.valueOf(i0.b.f(i10 / 11.0f, -1, -16777216)));
                } else {
                    this.n.put(Long.valueOf((i10 << 16) + i11), Integer.valueOf(i11 < 6 ? i0.b.f(((5 - i11) / 4.0f) * 0.5f, this.b[i10], -16777216) : i0.b.f(z20.v(9 - i11, 5.0f, 0.5f, 0.5f), this.b[i10], -1)));
                }
            }
        }
    }

    public final void a(int i10) {
        for (Map.Entry entry : this.n.entrySet()) {
            if (((Integer) entry.getValue()).intValue() == i10) {
                long longValue = ((Long) entry.getKey()).longValue();
                b((int) (longValue >> 16), (int) (longValue - (r5 << 16)));
                return;
            }
        }
        this.e = Long.MIN_VALUE;
        invalidate();
    }

    public final void b(int i10, int i11) {
        long j10 = (i10 << 16) + i11;
        this.e = j10;
        LongSparseArray longSparseArray = this.d;
        if (longSparseArray.get(j10) == null) {
            longSparseArray.put(this.e, Float.valueOf(0.0f));
        }
        invalidate();
    }

    public final void c(MotionEvent motionEvent) {
        int width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / 12;
        int height = ((getHeight() - getPaddingTop()) - getPaddingBottom()) / 10;
        int x10 = (int) ((motionEvent.getX() - getPaddingLeft()) / width);
        int y3 = (int) (motionEvent.getY() / height);
        Integer num = (Integer) this.n.get(Long.valueOf((x10 << 16) + y3));
        if (num != null) {
            int intValue = num.intValue();
            int i10 = u.q1;
            this.r.I0(intValue, 3);
            b(x10, y3);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        HashMap hashMap;
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        canvas.save();
        Path path = this.r.l1;
        path.rewind();
        float f7 = 10.0f;
        path.addRoundRect(rectF, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), Path.Direction.CW);
        canvas.clipPath(path);
        float width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / 12.0f;
        float height = ((getHeight() - getPaddingTop()) - getPaddingBottom()) / 10.0f;
        int i10 = 0;
        while (true) {
            hashMap = this.n;
            if (i10 >= 12) {
                break;
            }
            for (int i11 = 0; i11 < 10; i11++) {
                Integer num = (Integer) hashMap.get(Long.valueOf((i10 << 16) + i11));
                if (num != null) {
                    int intValue = num.intValue();
                    Paint paint = this.a;
                    paint.setColor(intValue);
                    RectF rectF2 = org.telegram.messenger.i0.P;
                    rectF2.set((i10 * width) + getPaddingLeft(), (i11 * height) + getPaddingTop(), ((i10 + 1) * width) + getPaddingLeft(), ((i11 + 1) * height) + getPaddingTop());
                    canvas.drawRect(rectF2, paint);
                }
            }
            i10++;
        }
        canvas.restore();
        int i12 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.d;
            if (i12 >= longSparseArray.size()) {
                return;
            }
            long keyAt = longSparseArray.keyAt(i12);
            float floatValue = ((Float) longSparseArray.valueAt(i12)).floatValue();
            float min = this.e == keyAt ? Math.min(1.0f, floatValue + 0.045714285f) : Math.max(0.0f, floatValue - 0.10666667f);
            float f10 = f7;
            int i13 = (int) (keyAt >> 16);
            int i14 = (int) (keyAt - (i13 << 16));
            Integer num2 = (Integer) hashMap.get(Long.valueOf(keyAt));
            Paint paint2 = this.c;
            if (num2 != null) {
                paint2.setColor(org.telegram.messenger.i0.B(num2.intValue()) > 0.721f ? -15658735 : -1);
            }
            paint2.setStrokeWidth(gr.h.getInterpolation(min) * org.telegram.messenger.i0.L(3.0f));
            Path path2 = this.f;
            path2.rewind();
            RectF rectF3 = org.telegram.messenger.i0.P;
            float f11 = width;
            float f12 = height;
            HashMap hashMap2 = hashMap;
            rectF3.set((i13 * f11) + getPaddingLeft(), (i14 * f12) + getPaddingTop(), ((i13 + 1) * f11) + getPaddingLeft(), ((i14 + 1) * f12) + getPaddingTop());
            float L = (i13 == 0 && i14 == 0) ? org.telegram.messenger.i0.L(f10) : 0.0f;
            float[] fArr = this.h;
            fArr[1] = L;
            fArr[0] = L;
            float L2 = (i13 == 11 && i14 == 0) ? org.telegram.messenger.i0.L(f10) : 0.0f;
            fArr[3] = L2;
            fArr[2] = L2;
            float L3 = (i13 == 11 && i14 == 9) ? org.telegram.messenger.i0.L(f10) : 0.0f;
            fArr[5] = L3;
            fArr[4] = L3;
            float L4 = (i13 == 0 && i14 == 9) ? org.telegram.messenger.i0.L(f10) : 0.0f;
            fArr[7] = L4;
            fArr[6] = L4;
            path2.addRoundRect(rectF3, fArr, Path.Direction.CW);
            canvas.drawPath(path2, paint2);
            if (min > 0.0f || this.e == keyAt) {
                if (min < 1.0f) {
                    invalidate();
                }
                longSparseArray.setValueAt(i12, Float.valueOf(min));
            } else {
                longSparseArray.removeAt(i12);
                i12--;
                invalidate();
            }
            i12++;
            f7 = f10;
            width = f11;
            height = f12;
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
