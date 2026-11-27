// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class lmb extends View {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public final Path e;
    public final ArrayList f;
    public float h;
    public float n;
    public final /* synthetic */ mmb r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lmb(mmb mmbVar, Context context) {
        super(context);
        this.r = mmbVar;
        Paint paint = new Paint(1);
        this.a = paint;
        this.d = 0L;
        this.e = new Path();
        this.f = new ArrayList();
        paint.setStyle(Paint.Style.FILL);
    }

    public final void a(RectF rectF) {
        if (rectF.isEmpty()) {
            return;
        }
        this.f.add(new Rect((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
    }

    public final boolean b(MotionEvent motionEvent) {
        mmb mmbVar = this.r;
        if (mmbVar.w() && !mmbVar.i) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            } else if (action == 1 && System.currentTimeMillis() - this.d < 200 && dte.b((int) this.b, (int) this.c, (int) motionEvent.getX(), (int) motionEvent.getY()) < mmbVar.m) {
                mmbVar.J(motionEvent.getRawX(), motionEvent.getRawY());
                mmbVar.t();
                mmbVar.e(false);
                return true;
            }
        }
        return false;
    }

    public final void c() {
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                return;
            }
            arrayList.clear();
            setSystemGestureExclusionRects(arrayList);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        mmb mmbVar = this.r;
        if (!mmbVar.i0 || (viewGroup = mmbVar.F) == null) {
            return;
        }
        viewGroup.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        s8b s8bVar;
        int i;
        char c;
        float f;
        int i2;
        boolean isRtlCharAt;
        float f2;
        boolean z;
        int i3;
        mmb mmbVar = this.r;
        s8b s8bVar2 = mmbVar.m0;
        OvershootInterpolator overshootInterpolator = mmbVar.c0;
        RectF rectF = mmbVar.S;
        RectF rectF2 = mmbVar.T;
        dj2 dj2Var = mmbVar.a0;
        if (mmbVar.w()) {
            int L = hl.L(22.0f);
            int i4 = mmbVar.x;
            mmbVar.M();
            hmb hmbVar = mmbVar.W;
            Paint paint = this.a;
            Path path = this.e;
            if (hmbVar != null) {
                canvas.save();
                int[] k = mmbVar.k();
                c = 1;
                float f3 = k[1] + mmbVar.b;
                f = 8.0f;
                float f4 = k[0] + mmbVar.a;
                canvas.translate(f4, f3);
                hmb hmbVar2 = mmbVar.W;
                r47 messageObject = hmbVar2 instanceof wb2 ? ((wb2) hmbVar2).getMessageObject() : null;
                if (messageObject == null || !messageObject.O3()) {
                    paint.setColor(mmbVar.s(aob.mg));
                } else {
                    paint.setColor(mmbVar.s(aob.Nc));
                }
                int length = mmbVar.r(mmbVar.W, false).length();
                int i5 = mmbVar.v;
                if (i5 >= 0 && i5 <= length) {
                    mmbVar.h(i5, dj2Var, false);
                    Layout layout = (Layout) dj2Var.d;
                    if (layout != null) {
                        s8bVar = s8bVar2;
                        int i6 = mmbVar.v - dj2Var.a;
                        int length2 = layout.getText().length();
                        if (i6 > length2) {
                            i6 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i6);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i6);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + dj2Var.b);
                        float f5 = primaryHorizontal + dj2Var.c;
                        Rect rect = (Rect) dj2Var.e;
                        if (rect != null) {
                            float f6 = rect.right - mmbVar.a;
                            i3 = rect.bottom - mmbVar.b;
                            f2 = f6;
                            z = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(mmbVar.v);
                            f2 = f5;
                            z = isRtlCharAt2;
                            i3 = lineBottom;
                        }
                        float f7 = i3;
                        float f8 = f3 + f7;
                        i = i4;
                        if (f8 <= i + mmbVar.d0 || f8 >= mmbVar.F.getMeasuredHeight()) {
                            rectF2.setEmpty();
                        } else if (z) {
                            canvas.save();
                            float f9 = L;
                            canvas.translate(f2 - f9, f7);
                            float interpolation = overshootInterpolator.getInterpolation(mmbVar.V);
                            float f10 = f9 / 2.0f;
                            canvas.scale(interpolation, interpolation, f10, f10);
                            path.reset();
                            Path.Direction direction = Path.Direction.CCW;
                            path.addCircle(f10, f10, f10, direction);
                            path.addRect(f10, 0.0f, f9, f10, direction);
                            canvas.drawPath(path, paint);
                            canvas.restore();
                            float f11 = f4 + f2;
                            rectF2.set(f11 - f9, f8 - f9, f11, f8 + f9);
                            rectF2.inset(-hl.L(8.0f), -hl.L(8.0f));
                        } else {
                            canvas.save();
                            canvas.translate(f2, f7);
                            float interpolation2 = overshootInterpolator.getInterpolation(mmbVar.V);
                            float f12 = L;
                            float f13 = f12 / 2.0f;
                            canvas.scale(interpolation2, interpolation2, f13, f13);
                            path.reset();
                            Path.Direction direction2 = Path.Direction.CCW;
                            path.addCircle(f13, f13, f13, direction2);
                            path.addRect(0.0f, 0.0f, f13, f13, direction2);
                            canvas.drawPath(path, paint);
                            canvas.restore();
                            float f14 = f4 + f2;
                            rectF2.set(f14, f8 - f12, f14 + f12, f8 + f12);
                            rectF2.inset(-hl.L(8.0f), -hl.L(8.0f));
                            i2 = 1;
                            canvas.restore();
                        }
                        i2 = 0;
                        canvas.restore();
                    }
                }
                s8bVar = s8bVar2;
                i = i4;
                i2 = 0;
                canvas.restore();
            } else {
                s8bVar = s8bVar2;
                i = i4;
                c = 1;
                f = 8.0f;
                i2 = 0;
            }
            mmbVar.N();
            if (mmbVar.W != null) {
                canvas.save();
                int[] k2 = mmbVar.k();
                float f15 = k2[c] + mmbVar.b;
                float f16 = k2[0] + mmbVar.a;
                canvas.translate(f16, f15);
                int length3 = mmbVar.r(mmbVar.W, false).length();
                int i7 = mmbVar.u;
                if (i7 >= 0 && i7 <= length3) {
                    mmbVar.h(i7, dj2Var, false);
                    Layout layout2 = (Layout) dj2Var.d;
                    if (layout2 != null) {
                        int i8 = mmbVar.u - dj2Var.a;
                        int lineForOffset2 = layout2.getLineForOffset(i8);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i8);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + dj2Var.b);
                        float f17 = primaryHorizontal2 + dj2Var.c;
                        Rect rect2 = (Rect) dj2Var.e;
                        if (rect2 != null) {
                            f17 = rect2.left - mmbVar.a;
                            lineBottom2 = rect2.bottom - mmbVar.b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(mmbVar.u);
                        }
                        float f18 = lineBottom2;
                        float f19 = f15 + f18;
                        if (f19 <= i + mmbVar.d0 || f19 >= mmbVar.F.getMeasuredHeight()) {
                            if (f19 > 0.0f && f19 - mmbVar.l() < mmbVar.F.getMeasuredHeight()) {
                                i2++;
                            }
                            rectF.setEmpty();
                        } else if (isRtlCharAt) {
                            canvas.save();
                            canvas.translate(f17, f18);
                            float interpolation3 = overshootInterpolator.getInterpolation(mmbVar.V);
                            float f20 = L;
                            float f21 = f20 / 2.0f;
                            canvas.scale(interpolation3, interpolation3, f21, f21);
                            path.reset();
                            Path.Direction direction3 = Path.Direction.CCW;
                            path.addCircle(f21, f21, f21, direction3);
                            path.addRect(0.0f, 0.0f, f21, f21, direction3);
                            canvas.drawPath(path, paint);
                            canvas.restore();
                            float f22 = f16 + f17;
                            rectF.set(f22, f19 - f20, f22 + f20, f19 + f20);
                            rectF.inset(-hl.L(f), -hl.L(f));
                        } else {
                            canvas.save();
                            float f23 = L;
                            canvas.translate(f17 - f23, f18);
                            float interpolation4 = overshootInterpolator.getInterpolation(mmbVar.V);
                            float f24 = f23 / 2.0f;
                            canvas.scale(interpolation4, interpolation4, f24, f24);
                            path.reset();
                            Path.Direction direction4 = Path.Direction.CCW;
                            path.addCircle(f24, f24, f24, direction4);
                            path.addRect(f24, 0.0f, f23, f24, direction4);
                            canvas.drawPath(path, paint);
                            canvas.restore();
                            float f25 = f16 + f17;
                            rectF.set(f25 - f23, f19 - f23, f25, f19 + f23);
                            rectF.inset(-hl.L(f), -hl.L(f));
                            i2++;
                        }
                    }
                }
                canvas.restore();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.f;
                arrayList.clear();
                a(rectF);
                a(rectF2);
                setSystemGestureExclusionRects(arrayList);
            }
            if (i2 != 0 && mmbVar.i) {
                if (!mmbVar.j) {
                    mmbVar.M();
                }
                mmbVar.T(mmbVar.b0);
                if (mmbVar.I != mmbVar.H || mmbVar.L != mmbVar.K) {
                    invalidate();
                }
            }
            if (!mmbVar.Q) {
                hl.r(s8bVar);
                hl.c3(s8bVar);
            }
            cl4 cl4Var = mmbVar.Y;
            if (cl4Var != null) {
                cl4Var.invalidateContentRect();
                cl4 cl4Var2 = mmbVar.Y;
                if (cl4Var2 != null) {
                    cl4Var2.c();
                }
            }
            if (mmbVar.k) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r15 != 3) goto L288;
     */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        boolean z;
        float f;
        float f2;
        int j;
        char charAt;
        char charAt2;
        mmb mmbVar = this.r;
        s8b s8bVar = mmbVar.m0;
        xlb xlbVar = mmbVar.e0;
        dj2 dj2Var = mmbVar.a0;
        boolean z2 = false;
        if (mmbVar.w()) {
            if (motionEvent.getPointerCount() > 1) {
                return mmbVar.i;
            }
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int i = mmbVar.b0 - x;
            mmbVar.b0 = x;
            int action = motionEvent.getAction();
            if (action == 0) {
                if (!mmbVar.i) {
                    float f3 = x;
                    float f4 = y;
                    if (mmbVar.S.contains(f3, f4)) {
                        mmbVar.N();
                        if (mmbVar.W != null) {
                            mmbVar.i = true;
                            mmbVar.j = true;
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            int[] A = mmbVar.A(mmbVar.u);
                            float l = mmbVar.l() / 2;
                            int[] k = mmbVar.k();
                            if (mmbVar.h0) {
                                mmbVar.f = ((A[0] + mmbVar.a) + k[0]) - x;
                            } else {
                                mmbVar.f = 0.0f;
                            }
                            mmbVar.g = (((A[1] + mmbVar.b) + k[1]) - y) - l;
                            mmbVar.t();
                            mmbVar.C.invalidate();
                            return true;
                        }
                    } else {
                        if (!mmbVar.T.contains(f3, f4)) {
                            mmbVar.i = false;
                            mmbVar.e = true;
                            return mmbVar.i;
                        }
                        mmbVar.M();
                        if (mmbVar.W != null) {
                            mmbVar.i = true;
                            mmbVar.j = false;
                            ViewParent parent3 = getParent();
                            if (parent3 != null) {
                                parent3.requestDisallowInterceptTouchEvent(true);
                            }
                            int[] A2 = mmbVar.A(mmbVar.v);
                            float l2 = mmbVar.l() / 2;
                            int[] k2 = mmbVar.k();
                            mmbVar.f = ((A2[0] + mmbVar.a) + k2[0]) - x;
                            mmbVar.g = (((A2[1] + mmbVar.b) + k2[1]) - y) - l2;
                            mmbVar.T(mmbVar.b0);
                            mmbVar.t();
                            mmbVar.C.invalidate();
                            return true;
                        }
                    }
                }
                return true;
            }
            if (action != 1) {
                if (action == 2) {
                    if (mmbVar.i) {
                        if (mmbVar.j) {
                            mmbVar.N();
                        } else {
                            mmbVar.M();
                        }
                        if (mmbVar.W == null) {
                            return mmbVar.i;
                        }
                        int i2 = (int) (x + mmbVar.f);
                        int i3 = (int) (y + mmbVar.g);
                        boolean O = mmbVar.O(i2, i3);
                        if (mmbVar.W != null) {
                            if (mmbVar.j) {
                                mmbVar.h(mmbVar.u, dj2Var, false);
                            } else {
                                mmbVar.h(mmbVar.v, dj2Var, false);
                            }
                            if (((Layout) dj2Var.d) != null) {
                                float f5 = dj2Var.b;
                                hmb hmbVar = mmbVar.W;
                                int[] k3 = mmbVar.k();
                                int i4 = i3 - k3[1];
                                int i5 = i2 - k3[0];
                                boolean z3 = mmbVar.E != null;
                                boolean z4 = z3 && y - mmbVar.m > mmbVar.F.getMeasuredHeight() - mmbVar.n() && (mmbVar.j0 || mmbVar.Z || mmbVar.W.getBottom() > mmbVar.F.getMeasuredHeight() - mmbVar.n());
                                if (z3) {
                                    if (y < mmbVar.o() + ((View) mmbVar.F.getParent()).getTop() && (mmbVar.Z || mmbVar.W.getTop() < mmbVar.o())) {
                                        z = true;
                                        if (!z4 || z) {
                                            if (!mmbVar.N) {
                                                mmbVar.N = true;
                                                hl.c3(xlbVar);
                                            }
                                            mmbVar.O = z4;
                                            if (z4) {
                                                f = -mmbVar.W.getTop();
                                                f2 = mmbVar.g;
                                            } else {
                                                f = mmbVar.F.getMeasuredHeight() - mmbVar.W.getTop();
                                                f2 = mmbVar.g;
                                            }
                                            i4 = (int) (f + f2);
                                        } else if (mmbVar.N) {
                                            mmbVar.N = false;
                                            hl.r(xlbVar);
                                        }
                                        j = mmbVar.j(i5, i4, mmbVar.a, mmbVar.b, mmbVar.W, false);
                                        if (j >= 0) {
                                            if (mmbVar.R) {
                                                if (!O) {
                                                    if (j < mmbVar.u) {
                                                        mmbVar.R = false;
                                                        mmbVar.j = true;
                                                        mmbVar.t();
                                                    } else if (j > mmbVar.v) {
                                                        mmbVar.R = false;
                                                        mmbVar.j = false;
                                                        mmbVar.t();
                                                    }
                                                }
                                            }
                                            if (mmbVar.j) {
                                                if (mmbVar.u != j && mmbVar.b(j)) {
                                                    CharSequence r = mmbVar.r(mmbVar.W, false);
                                                    mmbVar.h(j, dj2Var, false);
                                                    Layout layout = (Layout) dj2Var.d;
                                                    mmbVar.h(mmbVar.u, dj2Var, false);
                                                    Layout layout2 = (Layout) dj2Var.d;
                                                    if (layout != null && layout2 != null) {
                                                        int i6 = j;
                                                        while (true) {
                                                            int i7 = i6 - 1;
                                                            if (i7 < 0 || !mmb.x(r.charAt(i7))) {
                                                                break;
                                                            }
                                                            i6--;
                                                        }
                                                        int lineForOffset = layout2.getLineForOffset(i6);
                                                        int lineForOffset2 = layout2.getLineForOffset(mmbVar.u);
                                                        int lineForOffset3 = layout2.getLineForOffset(j);
                                                        if (O || layout != layout2 || (lineForOffset3 != layout2.getLineForOffset(mmbVar.u) && lineForOffset3 == lineForOffset)) {
                                                            mmbVar.z(j, i6, O, mmbVar.a0.b, f5, hmbVar);
                                                            hl.W3(mmbVar.C);
                                                            mmbVar.v();
                                                        } else if (-1 == layout2.getParagraphDirection(layout2.getLineForOffset(j)) || layout2.isRtlCharAt(j) || lineForOffset != lineForOffset2 || lineForOffset3 != lineForOffset) {
                                                            mmbVar.u = j;
                                                            int i8 = mmbVar.v;
                                                            if (j > i8) {
                                                                mmbVar.v = j;
                                                                mmbVar.u = i8;
                                                                mmbVar.j = false;
                                                            }
                                                            hl.W3(mmbVar.C);
                                                            mmbVar.v();
                                                        } else {
                                                            int i9 = j;
                                                            while (true) {
                                                                int i10 = i9 + 1;
                                                                if (i10 >= r.length() || !mmb.x(r.charAt(i10))) {
                                                                    break;
                                                                }
                                                                i9 = i10;
                                                            }
                                                            int abs = Math.abs(j - i6);
                                                            int abs2 = Math.abs(j - i9);
                                                            if (mmbVar.y) {
                                                                mmbVar.y = i >= 0;
                                                            }
                                                            int i11 = j - 1;
                                                            boolean z5 = i11 > 0 && mmb.x(r.charAt(i11));
                                                            if (j >= r.length()) {
                                                                j = r.length();
                                                                charAt = '\n';
                                                            } else {
                                                                charAt = r.charAt(j);
                                                            }
                                                            if (mmbVar.u >= r.length()) {
                                                                mmbVar.u = r.length();
                                                                charAt2 = '\n';
                                                            } else {
                                                                charAt2 = r.charAt(mmbVar.u);
                                                            }
                                                            int i12 = mmbVar.u;
                                                            if ((j < i12 && abs < abs2) || ((j > i12 && i < 0) || !mmb.x(charAt) || ((mmb.x(charAt2) && !mmbVar.y) || j == 0 || !z5 || charAt2 == '\n'))) {
                                                                if (!mmbVar.y || j != 1) {
                                                                    if (j >= mmbVar.u || !mmb.x(charAt) || ((mmb.x(charAt2) && !mmbVar.y) || charAt2 == '\n')) {
                                                                        mmbVar.u = j;
                                                                        i6 = j;
                                                                    } else {
                                                                        mmbVar.u = i6;
                                                                        mmbVar.y = true;
                                                                    }
                                                                    int i13 = mmbVar.v;
                                                                    if (i6 > i13) {
                                                                        mmbVar.v = i6;
                                                                        mmbVar.u = i13;
                                                                        mmbVar.j = false;
                                                                    }
                                                                    hl.W3(mmbVar.C);
                                                                    mmbVar.v();
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                mmbVar.E();
                                            } else {
                                                if (j != mmbVar.v && mmbVar.b(j)) {
                                                    CharSequence r2 = mmbVar.r(mmbVar.W, false);
                                                    int i14 = j;
                                                    while (i14 < r2.length() && mmb.x(r2.charAt(i14))) {
                                                        i14++;
                                                    }
                                                    mmbVar.h(j, dj2Var, false);
                                                    Layout layout3 = (Layout) dj2Var.d;
                                                    mmbVar.h(mmbVar.v, dj2Var, false);
                                                    Layout layout4 = (Layout) dj2Var.d;
                                                    if (layout3 != null && layout4 != null) {
                                                        if (j > r2.length()) {
                                                            j = r2.length();
                                                        }
                                                        int lineForOffset4 = layout4.getLineForOffset(i14);
                                                        int lineForOffset5 = layout4.getLineForOffset(mmbVar.v);
                                                        int lineForOffset6 = layout4.getLineForOffset(j);
                                                        if (O || layout3 != layout4 || (lineForOffset6 != layout4.getLineForOffset(mmbVar.v) && lineForOffset6 == lineForOffset4)) {
                                                            mmbVar.z(j, i14, O, mmbVar.a0.b, f5, hmbVar);
                                                            hl.W3(mmbVar.C);
                                                            mmbVar.v();
                                                        } else if (-1 == layout4.getParagraphDirection(layout4.getLineForOffset(j)) || layout4.isRtlCharAt(j) || lineForOffset5 != lineForOffset4 || lineForOffset6 != lineForOffset4) {
                                                            mmbVar.v = j;
                                                            int i15 = mmbVar.u;
                                                            if (i15 > j) {
                                                                mmbVar.v = i15;
                                                                mmbVar.u = j;
                                                                mmbVar.j = true;
                                                            }
                                                            hl.W3(mmbVar.C);
                                                            mmbVar.v();
                                                        } else {
                                                            int i16 = j;
                                                            while (true) {
                                                                int i17 = i16 - 1;
                                                                if (i17 < 0 || !mmb.x(r2.charAt(i17))) {
                                                                    break;
                                                                }
                                                                i16--;
                                                            }
                                                            int abs3 = Math.abs(j - i14);
                                                            int abs4 = Math.abs(j - i16);
                                                            int i18 = j - 1;
                                                            boolean z6 = i18 > 0 && mmb.x(r2.charAt(i18));
                                                            if (mmbVar.y) {
                                                                mmbVar.y = i <= 0;
                                                            }
                                                            int i19 = mmbVar.v;
                                                            if (i19 > 0 && mmb.x(r2.charAt(i19 - 1))) {
                                                                z2 = true;
                                                            }
                                                            int i20 = mmbVar.v;
                                                            if ((j > i20 && abs3 <= abs4) || ((j < i20 && i > 0) || !z6 || (z2 && !mmbVar.y))) {
                                                                if (j <= i20 || !z6 || (z2 && !mmbVar.y)) {
                                                                    mmbVar.v = j;
                                                                    i14 = j;
                                                                } else {
                                                                    mmbVar.v = i14;
                                                                    mmbVar.y = true;
                                                                }
                                                                int i21 = mmbVar.u;
                                                                if (i21 > i14) {
                                                                    mmbVar.v = i21;
                                                                    mmbVar.u = i14;
                                                                    mmbVar.j = true;
                                                                }
                                                                hl.W3(mmbVar.C);
                                                                mmbVar.v();
                                                            }
                                                        }
                                                    }
                                                }
                                                mmbVar.E();
                                            }
                                        }
                                        mmbVar.T(mmbVar.b0);
                                    }
                                }
                                z = false;
                                if (z4) {
                                }
                                if (!mmbVar.N) {
                                }
                                mmbVar.O = z4;
                                if (z4) {
                                }
                                i4 = (int) (f + f2);
                                j = mmbVar.j(i5, i4, mmbVar.a, mmbVar.b, mmbVar.W, false);
                                if (j >= 0) {
                                }
                                mmbVar.T(mmbVar.b0);
                            }
                        }
                        return true;
                    }
                }
                return mmbVar.i;
            }
            mmbVar.u();
            if (mmbVar.i && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            mmbVar.i = false;
            mmbVar.R = false;
            mmbVar.k = false;
            if (mmbVar.w()) {
                mmbVar.C.invalidate();
                hl.r(s8bVar);
                hl.c3(s8bVar);
                mmbVar.S();
            }
            if (mmbVar.N) {
                mmbVar.N = false;
                hl.r(xlbVar);
            }
            return mmbVar.i;
        }
        return false;
    }
}
