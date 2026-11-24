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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class k98 extends dja {
    public final Paint q0;
    public boolean r0;
    public boolean s0;
    public ArrayList t0;
    public final /* synthetic */ PhotoViewer u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k98(PhotoViewer photoViewer, Activity activity, Activity activity2) {
        super(activity, activity2);
        this.u0 = photoViewer;
        Paint paint = new Paint();
        this.q0 = paint;
        setWillNotDraw(false);
        paint.setColor(855638016);
        setLayerType(2, null);
    }

    @Override // dja, cja
    public final void R() {
        super.R();
        PhotoViewer photoViewer = this.u0;
        if (photoViewer.s1) {
            photoViewer.X0[0].e(2, getKeyboardHeight() <= gl.L(20.0f) ? 1.0f : 0.0f, true);
        }
    }

    public final void X() {
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.t0;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.t0 = arrayList;
            }
            arrayList.clear();
            PhotoViewer photoViewer = this.u0;
            if (photoViewer.u4 == 1 || photoViewer.o6 == 1) {
                int measuredHeight = getMeasuredHeight();
                int measuredWidth = getMeasuredWidth();
                this.t0.add(new Rect(0, ug8.D(200.0f, measuredHeight, 2), gl.L(100.0f), (gl.L(200.0f) + measuredHeight) / 2));
                this.t0.add(new Rect(measuredWidth - gl.L(100.0f), ug8.D(200.0f, measuredHeight, 2), measuredWidth, (gl.L(200.0f) + measuredHeight) / 2));
            }
            setSystemGestureExclusionRects(this.t0);
            invalidate();
        }
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        PhotoViewer photoViewer = this.u0;
        photoViewer.R.m(photoViewer.h0.getContext()).draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.u0;
        qib m = photoViewer.R.m(getContext());
        rib ribVar = m.r;
        if (motionEvent.getAction() == 0) {
            m.h = motionEvent.getX();
            m.n = motionEvent.getY();
            ribVar.e = ribVar.w();
        } else if (ribVar.e && Math.abs(motionEvent.getX() - m.h) < gl.e && Math.abs(motionEvent.getY() - m.n) < gl.e && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            motionEvent.getX();
            motionEvent.getY();
            if (!ribVar.i && ribVar.e) {
                ribVar.e(false);
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
        PhotoViewer photoViewer = this.u0;
        x88 x88Var = photoViewer.g0;
        if (x88Var == null || !x88Var.y) {
            return;
        }
        int measuredHeight = ((int) ((photoViewer.a6 - 1.0f) * x88Var.getWebView().getMeasuredHeight())) / 2;
        rac racVar = photoViewer.A1;
        if (racVar != null && racVar.j) {
            racVar.setBounds(photoViewer.g0.getLeft(), (photoViewer.g0.getWebView().getTop() - measuredHeight) + ((int) (photoViewer.Y5 / photoViewer.a6)), photoViewer.g0.getRight(), photoViewer.g0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.Y5 / photoViewer.a6)));
            photoViewer.A1.draw(canvas);
        }
        iv9 iv9Var = photoViewer.B1;
        if (iv9Var == null || !iv9Var.a()) {
            return;
        }
        photoViewer.B1.setBounds(photoViewer.g0.getLeft(), (int) ((photoViewer.G.getAlpha() * gl.L(90.0f)) + gl.m), photoViewer.g0.getRight(), photoViewer.g0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.Y5 / photoViewer.a6)));
        photoViewer.B1.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        PhotoViewer photoViewer = this.u0;
        if (view == photoViewer.R.m(photoViewer.h0.getContext()) || view == photoViewer.s5 || view == photoViewer.z4 || view == photoViewer.A4 || view == photoViewer.Y0) {
            return false;
        }
        FrameLayout frameLayout = photoViewer.X7;
        if (view == frameLayout && frameLayout.getTranslationY() > 0.0f && photoViewer.Q0.getTranslationY() == 0.0f) {
            canvas.save();
            canvas.clipRect(photoViewer.X7.getX(), photoViewer.X7.getY(), photoViewer.X7.getX() + photoViewer.X7.getMeasuredWidth(), photoViewer.X7.getBottom());
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        try {
            if (view == photoViewer.z2 || view == photoViewer.y4) {
                return false;
            }
            return super.drawChild(canvas, view, j);
        } catch (Throwable unused) {
            return true;
        }
    }

    @Override // cja
    public final int getBottomPadding() {
        return this.u0.Q0.getHeight();
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new s10(this, (byte) 14));
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        x10 x10Var;
        Canvas canvas2;
        Drawable[] drawableArr = PhotoViewer.f9;
        PhotoViewer photoViewer = this.u0;
        photoViewer.Y0(canvas);
        if (gl.m == 0 || (x10Var = photoViewer.G) == null) {
            return;
        }
        int alpha = (int) (x10Var.getAlpha() * 255.0f * 0.498f);
        Paint paint = this.q0;
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
            float alpha2 = (1.0f - photoViewer.G.getAlpha()) * gl.N(24.0f);
            canvas2.drawRect(0.0f, (getMeasuredHeight() - getPaddingBottom()) + alpha2, getMeasuredWidth(), getMeasuredHeight() + alpha2, paint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4  */
    @Override // dja, cja, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        y78 y78Var;
        int top;
        int L;
        int measuredHeight;
        int L2;
        PhotoViewer photoViewer = this.u0;
        if (photoViewer.u5 != null && photoViewer.x5 != null) {
            int L3 = (i3 - i) - gl.L(20.0f);
            photoViewer.x5.setTranslationY(((-L3) / 2.0f) - gl.L(47.0f));
            float f = L3 / 2.0f;
            photoViewer.u5.setTranslationY(gl.L(47.0f) + f);
            photoViewer.t5.setTranslationY(gl.L(47.0f) + f);
            photoViewer.y5.setTranslationY(f + gl.L(95.0f));
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
                int i14 = i12 & kk7.w1;
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
                        y78Var = photoViewer.V1;
                        if (childAt != y78Var.N) {
                            if (childAt == photoViewer.W1.N) {
                                i10 += photoViewer.G.getMeasuredHeight();
                            } else if (y78Var.f.l(childAt) || photoViewer.W1.f.l(childAt)) {
                                i10 = ((i4 - i2) - measuredHeight2) + ((photoViewer.s || gl.E) ? 0 : gl.n);
                            } else if (childAt == photoViewer.p1) {
                                i10 = gl.L(5.0f) + photoViewer.G.getMeasuredHeight();
                            } else {
                                float f2 = 40.0f;
                                if (childAt == photoViewer.f1 || childAt == photoViewer.g1 || childAt == photoViewer.h1) {
                                    FrameLayout frameLayout = photoViewer.X7;
                                    if (frameLayout == null || frameLayout.getVisibility() != 0) {
                                        top = photoViewer.Q0.getTop();
                                        if (childAt == photoViewer.g1) {
                                            top -= gl.L(50.0f);
                                        }
                                    } else {
                                        top = photoViewer.X7.getTop();
                                    }
                                    int i15 = photoViewer.d2;
                                    if (i15 != 4 && i15 != 5) {
                                        f2 = 15.0f;
                                    }
                                    L = gl.L(12.0f) + (top - gl.L(f2));
                                    measuredHeight = childAt.getMeasuredHeight();
                                } else {
                                    ArrayList arrayList = photoViewer.j1;
                                    if (arrayList == null || !arrayList.contains(childAt)) {
                                        ArrayList arrayList2 = photoViewer.i1;
                                        if (arrayList2 != null && arrayList2.contains(childAt)) {
                                            FrameLayout frameLayout2 = photoViewer.X7;
                                            int top2 = (frameLayout2 == null || frameLayout2.getVisibility() != 0) ? photoViewer.Q0.getTop() : photoViewer.X7.getTop();
                                            int i16 = photoViewer.d2;
                                            if (i16 != 4 && i16 != 5) {
                                                f2 = 15.0f;
                                            }
                                            L = (gl.L(12.0f) + (top2 - gl.L(f2))) - gl.L(36.0f);
                                            measuredHeight = childAt.getMeasuredHeight();
                                        } else if (childAt == photoViewer.X7) {
                                            i10 -= photoViewer.Q0.getHeight();
                                            if (photoViewer.d2 == 1) {
                                                L2 = gl.L(52.0f);
                                            } else if (photoViewer.V1.getVisibility() == 0) {
                                                L2 = gl.L(56.0f);
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
                                        } else if (childAt == photoViewer.Z7) {
                                            i10 = ug8.B(31.0f, photoViewer.Q0.getHeight(), i10);
                                        }
                                    } else {
                                        FrameLayout frameLayout3 = photoViewer.X7;
                                        int top3 = (frameLayout3 == null || frameLayout3.getVisibility() != 0) ? photoViewer.Q0.getTop() - gl.L(50.0f) : photoViewer.X7.getTop();
                                        int i17 = photoViewer.d2;
                                        if (i17 != 4 && i17 != 5) {
                                            f2 = 15.0f;
                                        }
                                        L = (gl.L(12.0f) + (top3 - gl.L(f2))) - gl.L(36.0f);
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
                    y78Var = photoViewer.V1;
                    if (childAt != y78Var.N) {
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
                y78Var = photoViewer.V1;
                if (childAt != y78Var.N) {
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
        k98 k98Var = this;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (k98Var.getLayoutParams().height > 0) {
            size2 = k98Var.getLayoutParams().height;
        }
        int i6 = size2;
        k98Var.setMeasuredDimension(size, i6);
        PhotoViewer photoViewer = k98Var.u0;
        boolean z = true;
        if (!photoViewer.s1) {
            k98Var.r0 = true;
            if (photoViewer.j2) {
                Point point = gl.q;
                int i7 = point.x > point.y ? 5 : 10;
                photoViewer.R1.getCurrentView().setMaxLines(i7);
                photoViewer.R1.getNextView().setMaxLines(i7);
            } else {
                photoViewer.R1.getCurrentView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                photoViewer.R1.getNextView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
            }
            k98Var.r0 = false;
        }
        int L = photoViewer.j0.getVisibility() != 8 ? gl.L(48.0f) : 0;
        vb5 vb5Var = photoViewer.m1;
        if (vb5Var == null || vb5Var.getVisibility() == 8) {
            i3 = i;
            i4 = 0;
        } else {
            ((ViewGroup.MarginLayoutParams) photoViewer.m1.getLayoutParams()).bottomMargin = L;
            i3 = i;
            k98Var.measureChildWithMargins(photoViewer.m1, i3, 0, i2, 0);
            int measuredHeight = photoViewer.m1.getMeasuredHeight();
            k98Var.r0 = true;
            if (gl.O1() || i6 >= size) {
                if (photoViewer.m1.getVisibility() != 0) {
                    photoViewer.m1.setVisibility(0);
                }
            } else if (photoViewer.m1.getVisibility() != 4) {
                photoViewer.m1.setVisibility(4);
            }
            k98Var.r0 = false;
            i4 = measuredHeight;
        }
        u98 u98Var = photoViewer.i3;
        if (u98Var != null) {
            u98Var.e = size;
            u98Var.f = i6;
        }
        int paddingLeft = size - (k98Var.getPaddingLeft() + k98Var.getPaddingRight());
        int paddingBottom = i6 - k98Var.getPaddingBottom();
        int childCount = k98Var.getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = k98Var.getChildAt(i8);
            if (childAt.getVisibility() != 8 && childAt != photoViewer.m1) {
                m88 m88Var = photoViewer.z2;
                if (childAt == m88Var) {
                    childAt.measure(i3, View.MeasureSpec.makeMeasureSpec(k98Var.getMeasuredHeight(), TLObject.FLAG_30));
                } else if (childAt == photoViewer.y4) {
                    if (m88Var == null || m88Var.getVisibility() != 0) {
                        q = photoViewer.C4.q();
                        o = photoViewer.C4.o();
                    } else {
                        View view = photoViewer.E2 ? photoViewer.D2 : photoViewer.C2;
                        q = view.getMeasuredWidth();
                        o = view.getMeasuredHeight();
                    }
                    if (q == 0 || o == 0) {
                        q = paddingLeft;
                        o = paddingBottom;
                    }
                    photoViewer.y4.measure(View.MeasureSpec.makeMeasureSpec(q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(o, TLObject.FLAG_30));
                } else if (photoViewer.V1.f.l(childAt) || photoViewer.W1.f.l(childAt)) {
                    if (photoViewer.s) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingBottom, TLObject.FLAG_30));
                    } else if (!gl.E) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height + gl.n, TLObject.FLAG_30));
                    } else if (gl.O1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(320.0f), paddingBottom - gl.m), TLObject.FLAG_30));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingBottom - gl.m, TLObject.FLAG_30));
                    }
                } else if (childAt == photoViewer.U1) {
                    if (photoViewer.n2) {
                        if (k98Var.s0) {
                            i5 = L + i4;
                            int currentActionBarHeight = (paddingBottom - (a.getCurrentActionBarHeight() + gl.m)) - i5;
                            ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i5;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, TLObject.FLAG_30));
                        }
                        i5 = L;
                        int currentActionBarHeight2 = (paddingBottom - (a.getCurrentActionBarHeight() + gl.m)) - i5;
                        ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i5;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight2, TLObject.FLAG_30));
                    } else if (!photoViewer.m1.c() || (!gl.O1() && paddingBottom <= paddingLeft)) {
                        k98Var.s0 = false;
                        i5 = L;
                        int currentActionBarHeight22 = (paddingBottom - (a.getCurrentActionBarHeight() + gl.m)) - i5;
                        ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i5;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight22, TLObject.FLAG_30));
                    } else {
                        i5 = L + i4;
                        k98Var.s0 = z;
                        int currentActionBarHeight222 = (paddingBottom - (a.getCurrentActionBarHeight() + gl.m)) - i5;
                        ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i5;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight222, TLObject.FLAG_30));
                    }
                } else if (childAt == photoViewer.Z1 || childAt == photoViewer.R0) {
                    childAt.measure(i3, View.MeasureSpec.makeMeasureSpec(paddingBottom - (a.getCurrentActionBarHeight() + gl.m), TLObject.FLAG_30));
                } else if (childAt == photoViewer.W1.N) {
                    childAt.measure(i3, View.MeasureSpec.makeMeasureSpec(paddingBottom - (a.getCurrentActionBarHeight() + gl.m), TLObject.FLAG_30));
                } else {
                    k98Var.measureChildWithMargins(childAt, i3, 0, i2, 0);
                }
            }
            i8++;
            z = true;
            k98Var = this;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.r0) {
            return;
        }
        super.requestLayout();
    }
}
