// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ad8 extends xma {
    public final Paint k0;
    public boolean l0;
    public boolean m0;
    public ArrayList n0;
    public final /* synthetic */ PhotoViewer o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad8(PhotoViewer photoViewer, Activity activity, Activity activity2) {
        super(activity, activity2);
        this.o0 = photoViewer;
        Paint paint = new Paint();
        this.k0 = paint;
        setWillNotDraw(false);
        paint.setColor(855638016);
        setLayerType(2, null);
    }

    @Override // xma, wma
    public final void R() {
        super.R();
        PhotoViewer photoViewer = this.o0;
        if (photoViewer.s1) {
            photoViewer.X0[0].e(2, getKeyboardHeight() <= hl.L(20.0f) ? 1.0f : 0.0f, true);
        }
    }

    public final void X() {
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.n0;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.n0 = arrayList;
            }
            arrayList.clear();
            PhotoViewer photoViewer = this.o0;
            if (photoViewer.t4 == 1 || photoViewer.n6 == 1) {
                int measuredHeight = getMeasuredHeight();
                int measuredWidth = getMeasuredWidth();
                this.n0.add(new Rect(0, ik8.D(200.0f, measuredHeight, 2), hl.L(100.0f), (hl.L(200.0f) + measuredHeight) / 2));
                this.n0.add(new Rect(measuredWidth - hl.L(100.0f), ik8.D(200.0f, measuredHeight, 2), measuredWidth, (hl.L(200.0f) + measuredHeight) / 2));
            }
            setSystemGestureExclusionRects(this.n0);
            invalidate();
        }
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        PhotoViewer photoViewer = this.o0;
        photoViewer.R.m(photoViewer.h0.getContext()).draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.o0;
        lmb m = photoViewer.R.m(getContext());
        mmb mmbVar = m.r;
        if (motionEvent.getAction() == 0) {
            m.h = motionEvent.getX();
            m.n = motionEvent.getY();
            mmbVar.e = mmbVar.w();
        } else if (mmbVar.e && Math.abs(motionEvent.getX() - m.h) < hl.e && Math.abs(motionEvent.getY() - m.n) < hl.e && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            motionEvent.getX();
            motionEvent.getY();
            if (!mmbVar.i && mmbVar.e) {
                mmbVar.e(false);
            }
        }
        if (!photoViewer.R.w()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        photoViewer.R.m(getContext()).onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        PhotoViewer photoViewer = this.o0;
        nc8 nc8Var = photoViewer.g0;
        if (nc8Var == null || !nc8Var.y) {
            return;
        }
        int measuredHeight = ((int) ((photoViewer.Z5 - 1.0f) * nc8Var.getWebView().getMeasuredHeight())) / 2;
        rec recVar = photoViewer.A1;
        if (recVar != null && recVar.j) {
            recVar.setBounds(photoViewer.g0.getLeft(), (photoViewer.g0.getWebView().getTop() - measuredHeight) + ((int) (photoViewer.X5 / photoViewer.Z5)), photoViewer.g0.getRight(), photoViewer.g0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.X5 / photoViewer.Z5)));
            photoViewer.A1.draw(canvas);
        }
        cz9 cz9Var = photoViewer.B1;
        if (cz9Var == null || !cz9Var.a()) {
            return;
        }
        photoViewer.B1.setBounds(photoViewer.g0.getLeft(), (int) ((photoViewer.G.getAlpha() * hl.L(90.0f)) + hl.m), photoViewer.g0.getRight(), photoViewer.g0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.X5 / photoViewer.Z5)));
        photoViewer.B1.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        PhotoViewer photoViewer = this.o0;
        if (view == photoViewer.R.m(photoViewer.h0.getContext()) || view == photoViewer.r5 || view == photoViewer.y4 || view == photoViewer.z4 || view == photoViewer.Y0) {
            return false;
        }
        FrameLayout frameLayout = photoViewer.W7;
        if (view == frameLayout && frameLayout.getTranslationY() > 0.0f && photoViewer.Q0.getTranslationY() == 0.0f) {
            canvas.save();
            canvas.clipRect(photoViewer.W7.getX(), photoViewer.W7.getY(), photoViewer.W7.getX() + photoViewer.W7.getMeasuredWidth(), photoViewer.W7.getBottom());
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        try {
            if (view == photoViewer.z2 || view == photoViewer.x4) {
                return false;
            }
            return super.drawChild(canvas, view, j);
        } catch (Throwable unused) {
            return true;
        }
    }

    @Override // wma
    public final int getBottomPadding() {
        return this.o0.Q0.getHeight();
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new t10(this, (byte) 15));
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        y10 y10Var;
        Canvas canvas2;
        Drawable[] drawableArr = PhotoViewer.d9;
        PhotoViewer photoViewer = this.o0;
        photoViewer.Z0(canvas);
        if (hl.m == 0 || (y10Var = photoViewer.G) == null) {
            return;
        }
        int alpha = (int) (y10Var.getAlpha() * 255.0f * 0.498f);
        Paint paint = this.k0;
        paint.setAlpha(alpha);
        if (getPaddingRight() > 0) {
            canvas2 = canvas;
            canvas2.drawRect(getMeasuredWidth() - getPaddingRight(), 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (getPaddingLeft() > 0) {
            canvas2.drawRect(0.0f, 0.0f, getPaddingLeft(), getMeasuredHeight(), paint);
        }
        if (getPaddingBottom() > 0) {
            float alpha2 = (1.0f - photoViewer.G.getAlpha()) * hl.N(24.0f);
            canvas2.drawRect(0.0f, (getMeasuredHeight() - getPaddingBottom()) + alpha2, getMeasuredWidth(), getMeasuredHeight() + alpha2, paint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4  */
    @Override // xma, wma, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int paddingRight;
        int paddingBottom;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        pb8 pb8Var;
        int top;
        int L;
        int measuredHeight;
        int L2;
        PhotoViewer photoViewer = this.o0;
        if (photoViewer.t5 != null && photoViewer.w5 != null) {
            int L3 = (i3 - i) - hl.L(20.0f);
            photoViewer.w5.setTranslationY(((-L3) / 2.0f) - hl.L(47.0f));
            float f = L3 / 2.0f;
            photoViewer.t5.setTranslationY(hl.L(47.0f) + f);
            photoViewer.s5.setTranslationY(hl.L(47.0f) + f);
            photoViewer.x5.setTranslationY(f + hl.L(95.0f));
        }
        int childCount = getChildCount();
        Q();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                if (childAt == photoViewer.z2) {
                    paddingLeft = i;
                    paddingRight = i3;
                    paddingBottom = i4;
                } else {
                    paddingLeft = getPaddingLeft() + i;
                    paddingRight = i3 - getPaddingRight();
                    paddingBottom = i4 - getPaddingBottom();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i12 = layoutParams.gravity;
                if (i12 == -1) {
                    i12 = 51;
                }
                int i13 = i12 & 7;
                int i14 = i12 & jn7.w1;
                if (i13 == 1) {
                    i5 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i6 = layoutParams.rightMargin;
                } else if (i13 != 5) {
                    i7 = layoutParams.leftMargin;
                    if (i14 != 16) {
                        i8 = (((paddingBottom - i2) - measuredHeight2) / 2) + layoutParams.topMargin;
                        i9 = layoutParams.bottomMargin;
                    } else if (i14 != 80) {
                        i10 = layoutParams.topMargin;
                        pb8Var = photoViewer.V1;
                        if (childAt != pb8Var.N) {
                            if (childAt == photoViewer.W1.N) {
                                i10 += photoViewer.G.getMeasuredHeight();
                            } else if (pb8Var.f.l(childAt) || photoViewer.W1.f.l(childAt)) {
                                i10 = ((i4 - i2) - measuredHeight2) + ((photoViewer.s || hl.E) ? 0 : hl.n);
                            } else if (childAt == photoViewer.p1) {
                                i10 = hl.L(5.0f) + photoViewer.G.getMeasuredHeight();
                            } else {
                                float f2 = 40.0f;
                                if (childAt == photoViewer.f1 || childAt == photoViewer.g1 || childAt == photoViewer.h1) {
                                    FrameLayout frameLayout = photoViewer.W7;
                                    if (frameLayout == null || frameLayout.getVisibility() != 0) {
                                        top = photoViewer.Q0.getTop();
                                        if (childAt == photoViewer.g1) {
                                            top -= hl.L(50.0f);
                                        }
                                    } else {
                                        top = photoViewer.W7.getTop();
                                    }
                                    int i15 = photoViewer.d2;
                                    if (i15 != 4 && i15 != 5) {
                                        f2 = 15.0f;
                                    }
                                    L = hl.L(12.0f) + (top - hl.L(f2));
                                    measuredHeight = childAt.getMeasuredHeight();
                                } else {
                                    ArrayList arrayList = photoViewer.j1;
                                    if (arrayList == null || !arrayList.contains(childAt)) {
                                        ArrayList arrayList2 = photoViewer.i1;
                                        if (arrayList2 != null && arrayList2.contains(childAt)) {
                                            FrameLayout frameLayout2 = photoViewer.W7;
                                            int top2 = (frameLayout2 == null || frameLayout2.getVisibility() != 0) ? photoViewer.Q0.getTop() : photoViewer.W7.getTop();
                                            int i16 = photoViewer.d2;
                                            if (i16 != 4 && i16 != 5) {
                                                f2 = 15.0f;
                                            }
                                            L = (hl.L(12.0f) + (top2 - hl.L(f2))) - hl.L(36.0f);
                                            measuredHeight = childAt.getMeasuredHeight();
                                        } else if (childAt == photoViewer.W7) {
                                            i10 -= photoViewer.Q0.getHeight();
                                            if (photoViewer.d2 == 1) {
                                                L2 = hl.L(52.0f);
                                            } else if (photoViewer.V1.getVisibility() == 0) {
                                                L2 = hl.L(56.0f);
                                            }
                                            i10 -= L2;
                                        } else if (childAt == photoViewer.Y1) {
                                            L = ((paddingBottom - i2) - measuredHeight2) - layoutParams.bottomMargin;
                                            measuredHeight = photoViewer.Q0.getHeight();
                                        } else if (childAt == photoViewer.Z1 || childAt == photoViewer.R0) {
                                            i10 = photoViewer.G.getMeasuredHeight();
                                        } else if (childAt == photoViewer.S0) {
                                            L = ((paddingBottom - i2) - measuredHeight2) - layoutParams.bottomMargin;
                                            measuredHeight = photoViewer.Q0.getHeight();
                                        } else if (childAt == photoViewer.Y7) {
                                            i10 = ik8.B(31.0f, photoViewer.Q0.getHeight(), i10);
                                        }
                                    } else {
                                        FrameLayout frameLayout3 = photoViewer.W7;
                                        int top3 = (frameLayout3 == null || frameLayout3.getVisibility() != 0) ? photoViewer.Q0.getTop() - hl.L(50.0f) : photoViewer.W7.getTop();
                                        int i17 = photoViewer.d2;
                                        if (i17 != 4 && i17 != 5) {
                                            f2 = 15.0f;
                                        }
                                        L = (hl.L(12.0f) + (top3 - hl.L(f2))) - hl.L(36.0f);
                                        measuredHeight = childAt.getMeasuredHeight();
                                    }
                                }
                                i10 = L - measuredHeight;
                            }
                        }
                        childAt.layout(i7 + paddingLeft, i10, i7 + measuredWidth + paddingLeft, measuredHeight2 + i10);
                    } else {
                        i8 = (paddingBottom - i2) - measuredHeight2;
                        i9 = layoutParams.bottomMargin;
                    }
                    i10 = i8 - i9;
                    pb8Var = photoViewer.V1;
                    if (childAt != pb8Var.N) {
                    }
                    childAt.layout(i7 + paddingLeft, i10, i7 + measuredWidth + paddingLeft, measuredHeight2 + i10);
                } else {
                    i5 = (paddingRight - paddingLeft) - measuredWidth;
                    i6 = layoutParams.rightMargin;
                }
                i7 = i5 - i6;
                if (i14 != 16) {
                }
                i10 = i8 - i9;
                pb8Var = photoViewer.V1;
                if (childAt != pb8Var.N) {
                }
                childAt.layout(i7 + paddingLeft, i10, i7 + measuredWidth + paddingLeft, measuredHeight2 + i10);
            }
        }
        R();
        X();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int q;
        int o;
        ad8 ad8Var = this;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (ad8Var.getLayoutParams().height > 0) {
            size2 = ad8Var.getLayoutParams().height;
        }
        int i6 = size2;
        ad8Var.setMeasuredDimension(size, i6);
        PhotoViewer photoViewer = ad8Var.o0;
        boolean z = true;
        if (!photoViewer.s1) {
            ad8Var.l0 = true;
            if (photoViewer.j2) {
                Point point = hl.q;
                int i7 = point.x > point.y ? 5 : 10;
                photoViewer.R1.getCurrentView().setMaxLines(i7);
                photoViewer.R1.getNextView().setMaxLines(i7);
            } else {
                photoViewer.R1.getCurrentView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                photoViewer.R1.getNextView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
            }
            ad8Var.l0 = false;
        }
        int L = photoViewer.j0.getVisibility() != 8 ? hl.L(48.0f) : 0;
        wd5 wd5Var = photoViewer.m1;
        if (wd5Var == null || wd5Var.getVisibility() == 8) {
            i3 = i;
            i4 = 0;
        } else {
            ((ViewGroup.MarginLayoutParams) photoViewer.m1.getLayoutParams()).bottomMargin = L;
            i3 = i;
            ad8Var.measureChildWithMargins(photoViewer.m1, i3, 0, i2, 0);
            int measuredHeight = photoViewer.m1.getMeasuredHeight();
            ad8Var.l0 = true;
            if (hl.O1() || i6 >= size) {
                if (photoViewer.m1.getVisibility() != 0) {
                    photoViewer.m1.setVisibility(0);
                }
            } else if (photoViewer.m1.getVisibility() != 4) {
                photoViewer.m1.setVisibility(4);
            }
            ad8Var.l0 = false;
            i4 = measuredHeight;
        }
        kd8 kd8Var = photoViewer.i3;
        if (kd8Var != null) {
            kd8Var.e = size;
            kd8Var.f = i6;
        }
        int paddingLeft = size - (ad8Var.getPaddingLeft() + ad8Var.getPaddingRight());
        int paddingBottom = i6 - ad8Var.getPaddingBottom();
        int childCount = ad8Var.getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = ad8Var.getChildAt(i8);
            if (childAt.getVisibility() != 8 && childAt != photoViewer.m1) {
                dc8 dc8Var = photoViewer.z2;
                if (childAt == dc8Var) {
                    childAt.measure(i3, View.MeasureSpec.makeMeasureSpec(ad8Var.getMeasuredHeight(), TLObject.FLAG_30));
                } else if (childAt == photoViewer.x4) {
                    if (dc8Var == null || dc8Var.getVisibility() != 0) {
                        q = photoViewer.B4.q();
                        o = photoViewer.B4.o();
                    } else {
                        View view = photoViewer.E2 ? photoViewer.D2 : photoViewer.C2;
                        q = view.getMeasuredWidth();
                        o = view.getMeasuredHeight();
                    }
                    if (q == 0 || o == 0) {
                        q = paddingLeft;
                        o = paddingBottom;
                    }
                    photoViewer.x4.measure(View.MeasureSpec.makeMeasureSpec(q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(o, TLObject.FLAG_30));
                } else if (photoViewer.V1.f.l(childAt) || photoViewer.W1.f.l(childAt)) {
                    if (photoViewer.s) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingBottom, TLObject.FLAG_30));
                    } else if (!hl.E) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height + hl.n, TLObject.FLAG_30));
                    } else if (hl.O1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(320.0f), paddingBottom - hl.m), TLObject.FLAG_30));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingBottom - hl.m, TLObject.FLAG_30));
                    }
                } else if (childAt == photoViewer.U1) {
                    if (photoViewer.n2) {
                        if (ad8Var.m0) {
                            i5 = L + i4;
                            int currentActionBarHeight = (paddingBottom - (a.getCurrentActionBarHeight() + hl.m)) - i5;
                            ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i5;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, TLObject.FLAG_30));
                        }
                        i5 = L;
                        int currentActionBarHeight2 = (paddingBottom - (a.getCurrentActionBarHeight() + hl.m)) - i5;
                        ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i5;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight2, TLObject.FLAG_30));
                    } else if (!photoViewer.m1.c() || (!hl.O1() && paddingBottom <= paddingLeft)) {
                        ad8Var.m0 = false;
                        i5 = L;
                        int currentActionBarHeight22 = (paddingBottom - (a.getCurrentActionBarHeight() + hl.m)) - i5;
                        ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i5;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight22, TLObject.FLAG_30));
                    } else {
                        i5 = L + i4;
                        ad8Var.m0 = z;
                        int currentActionBarHeight222 = (paddingBottom - (a.getCurrentActionBarHeight() + hl.m)) - i5;
                        ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i5;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight222, TLObject.FLAG_30));
                    }
                } else if (childAt == photoViewer.Z1 || childAt == photoViewer.R0) {
                    childAt.measure(i3, View.MeasureSpec.makeMeasureSpec(paddingBottom - (a.getCurrentActionBarHeight() + hl.m), TLObject.FLAG_30));
                } else if (childAt == photoViewer.W1.N) {
                    childAt.measure(i3, View.MeasureSpec.makeMeasureSpec(paddingBottom - (a.getCurrentActionBarHeight() + hl.m), TLObject.FLAG_30));
                } else {
                    ad8Var.measureChildWithMargins(childAt, i3, 0, i2, 0);
                }
            }
            i8++;
            z = true;
            ad8Var = this;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.l0) {
            return;
        }
        super.requestLayout();
    }
}
