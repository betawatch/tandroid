package org.telegram.ui;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class bu0 extends org.telegram.ui.Components.rv0 {
    public ArrayList A0;
    public final /* synthetic */ PhotoViewer B0;
    public final Paint x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu0(PhotoViewer photoViewer, Activity activity, Activity activity2) {
        super(activity, activity2);
        this.B0 = photoViewer;
        Paint paint = new Paint();
        this.x0 = paint;
        setWillNotDraw(false);
        paint.setColor(855638016);
        setLayerType(2, null);
    }

    @Override // org.telegram.ui.Components.rv0, org.telegram.ui.Components.qv0
    public final void S() {
        super.S();
        PhotoViewer photoViewer = this.B0;
        if (photoViewer.o1) {
            photoViewer.T0[0].e(2, getKeyboardHeight() <= AndroidUtilities.dp(20.0f) ? 1.0f : 0.0f, true);
        }
    }

    public final void Z() {
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.A0 == null) {
                this.A0 = new ArrayList();
            }
            this.A0.clear();
            PhotoViewer photoViewer = this.B0;
            if (photoViewer.r4 == 1 || photoViewer.l6 == 1) {
                int measuredHeight = getMeasuredHeight();
                int measuredWidth = getMeasuredWidth();
                this.A0.add(new Rect(0, b.x(200.0f, measuredHeight, 2), AndroidUtilities.dp(100.0f), (AndroidUtilities.dp(200.0f) + measuredHeight) / 2));
                this.A0.add(new Rect(measuredWidth - AndroidUtilities.dp(100.0f), b.x(200.0f, measuredHeight, 2), measuredWidth, (AndroidUtilities.dp(200.0f) + measuredHeight) / 2));
            }
            setSystemGestureExclusionRects(this.A0);
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        PhotoViewer photoViewer = this.B0;
        photoViewer.N.o(photoViewer.d0.getContext()).draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.B0;
        org.telegram.ui.Cells.y9 o10 = photoViewer.N.o(getContext());
        org.telegram.ui.Cells.z9 z9Var = o10.r;
        if (motionEvent.getAction() == 0) {
            o10.h = motionEvent.getX();
            o10.n = motionEvent.getY();
            z9Var.e = z9Var.y();
        } else if (z9Var.e && Math.abs(motionEvent.getX() - o10.h) < AndroidUtilities.touchSlop && Math.abs(motionEvent.getY() - o10.n) < AndroidUtilities.touchSlop && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            motionEvent.getX();
            motionEvent.getY();
            org.telegram.ui.Cells.z9 z9Var2 = o10.r;
            if (!z9Var2.i && z9Var2.e) {
                z9Var2.f(false);
            }
        }
        if (!photoViewer.N.y()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        photoViewer.N.o(getContext()).onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        PhotoViewer photoViewer = this.B0;
        nt0 nt0Var = photoViewer.c0;
        if (nt0Var == null || !nt0Var.x) {
            return;
        }
        int measuredHeight = ((int) ((photoViewer.X5 - 1.0f) * nt0Var.getWebView().getMeasuredHeight())) / 2;
        org.telegram.ui.Components.y61 y61Var = photoViewer.w1;
        if (y61Var != null && y61Var.j) {
            y61Var.setBounds(photoViewer.c0.getLeft(), (photoViewer.c0.getWebView().getTop() - measuredHeight) + ((int) (photoViewer.V5 / photoViewer.X5)), photoViewer.c0.getRight(), photoViewer.c0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.V5 / photoViewer.X5)));
            photoViewer.w1.draw(canvas);
        }
        org.telegram.ui.Components.oo0 oo0Var = photoViewer.x1;
        if (oo0Var == null || !oo0Var.a()) {
            return;
        }
        photoViewer.x1.setBounds(photoViewer.c0.getLeft(), (int) ((photoViewer.C.getAlpha() * AndroidUtilities.dp(90.0f)) + AndroidUtilities.statusBarHeight), photoViewer.c0.getRight(), photoViewer.c0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.V5 / photoViewer.X5)));
        photoViewer.x1.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        PhotoViewer photoViewer = this.B0;
        if (view == photoViewer.N.o(photoViewer.d0.getContext()) || view == photoViewer.p5 || view == photoViewer.w4 || view == photoViewer.x4 || view == photoViewer.U0) {
            return false;
        }
        FrameLayout frameLayout = photoViewer.N7;
        if (view == frameLayout && frameLayout.getTranslationY() > 0.0f && photoViewer.M0.getTranslationY() == 0.0f) {
            canvas.save();
            canvas.clipRect(photoViewer.N7.getX(), photoViewer.N7.getY(), photoViewer.N7.getX() + photoViewer.N7.getMeasuredWidth(), photoViewer.N7.getBottom());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        try {
            if (view == photoViewer.v2 || view == photoViewer.v4) {
                return false;
            }
            return super.drawChild(canvas, view, j10);
        } catch (Throwable unused) {
            return true;
        }
    }

    @Override // org.telegram.ui.Components.qv0
    public final int getBottomPadding() {
        return this.B0.M0.getHeight();
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.ic.a(this, new a9(this, 6));
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.ic.h(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        eg.l1 l1Var;
        Canvas canvas2;
        Drawable[] drawableArr = PhotoViewer.Q8;
        PhotoViewer photoViewer = this.B0;
        photoViewer.U1(canvas);
        if (AndroidUtilities.statusBarHeight == 0 || (l1Var = photoViewer.C) == null) {
            return;
        }
        int alpha = (int) (l1Var.getAlpha() * 255.0f * 0.498f);
        Paint paint = this.x0;
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
            float alpha2 = (1.0f - photoViewer.C.getAlpha()) * AndroidUtilities.dpf2(24.0f);
            canvas2.drawRect(0.0f, (getMeasuredHeight() - getPaddingBottom()) + alpha2, getMeasuredWidth(), getMeasuredHeight() + alpha2, paint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
    @Override // org.telegram.ui.Components.rv0, org.telegram.ui.Components.qv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int paddingLeft;
        int paddingRight;
        int paddingBottom;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        fs0 fs0Var;
        int top;
        int dp;
        int measuredHeight;
        int dp2;
        PhotoViewer photoViewer = this.B0;
        if (photoViewer.r5 != null && photoViewer.u5 != null) {
            int dp3 = (i12 - i10) - AndroidUtilities.dp(20.0f);
            photoViewer.u5.setTranslationY(((-dp3) / 2.0f) - AndroidUtilities.dp(47.0f));
            float f10 = dp3 / 2.0f;
            photoViewer.r5.setTranslationY(AndroidUtilities.dp(47.0f) + f10);
            photoViewer.q5.setTranslationY(AndroidUtilities.dp(47.0f) + f10);
            photoViewer.v5.setTranslationY(f10 + AndroidUtilities.dp(95.0f));
        }
        int childCount = getChildCount();
        R();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                if (childAt == photoViewer.v2) {
                    paddingLeft = i10;
                    paddingRight = i12;
                    paddingBottom = i13;
                } else {
                    paddingLeft = getPaddingLeft() + i10;
                    paddingRight = i12 - getPaddingRight();
                    paddingBottom = i13 - getPaddingBottom();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i21 = layoutParams.gravity;
                if (i21 == -1) {
                    i21 = 51;
                }
                int i22 = i21 & 7;
                int i23 = i21 & 112;
                if (i22 == 1) {
                    i14 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                } else if (i22 != 5) {
                    i16 = layoutParams.leftMargin;
                    if (i23 != 16) {
                        i17 = (((paddingBottom - i11) - measuredHeight2) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    } else if (i23 != 80) {
                        i19 = layoutParams.topMargin;
                        fs0Var = photoViewer.R1;
                        if (childAt != fs0Var.J) {
                            if (childAt == photoViewer.S1.J) {
                                i19 += photoViewer.C.getMeasuredHeight();
                            } else if (fs0Var.f.l(childAt) || photoViewer.S1.f.l(childAt)) {
                                i19 = ((i13 - i11) - measuredHeight2) + ((photoViewer.s || AndroidUtilities.isInMultiwindow) ? 0 : AndroidUtilities.navigationBarHeight);
                            } else if (childAt == photoViewer.l1) {
                                i19 = AndroidUtilities.dp(5.0f) + photoViewer.C.getMeasuredHeight();
                            } else {
                                float f11 = 40.0f;
                                if (childAt == photoViewer.b1 || childAt == photoViewer.c1 || childAt == photoViewer.d1) {
                                    FrameLayout frameLayout = photoViewer.N7;
                                    if (frameLayout == null || frameLayout.getVisibility() != 0) {
                                        top = photoViewer.M0.getTop();
                                        if (childAt == photoViewer.c1) {
                                            top -= AndroidUtilities.dp(50.0f);
                                        }
                                    } else {
                                        top = photoViewer.N7.getTop();
                                    }
                                    int i24 = photoViewer.Z1;
                                    if (i24 != 4 && i24 != 5) {
                                        f11 = 15.0f;
                                    }
                                    dp = AndroidUtilities.dp(12.0f) + (top - AndroidUtilities.dp(f11));
                                    measuredHeight = childAt.getMeasuredHeight();
                                } else {
                                    ArrayList arrayList = photoViewer.f1;
                                    if (arrayList == null || !arrayList.contains(childAt)) {
                                        ArrayList arrayList2 = photoViewer.e1;
                                        if (arrayList2 != null && arrayList2.contains(childAt)) {
                                            FrameLayout frameLayout2 = photoViewer.N7;
                                            int top2 = (frameLayout2 == null || frameLayout2.getVisibility() != 0) ? photoViewer.M0.getTop() : photoViewer.N7.getTop();
                                            int i25 = photoViewer.Z1;
                                            if (i25 != 4 && i25 != 5) {
                                                f11 = 15.0f;
                                            }
                                            dp = (AndroidUtilities.dp(12.0f) + (top2 - AndroidUtilities.dp(f11))) - AndroidUtilities.dp(36.0f);
                                            measuredHeight = childAt.getMeasuredHeight();
                                        } else if (childAt == photoViewer.N7) {
                                            i19 -= photoViewer.M0.getHeight();
                                            if (photoViewer.Z1 == 1) {
                                                dp2 = AndroidUtilities.dp(52.0f);
                                            } else if (photoViewer.R1.getVisibility() == 0) {
                                                dp2 = AndroidUtilities.dp(56.0f);
                                            }
                                            i19 -= dp2;
                                        } else if (childAt == photoViewer.U1) {
                                            dp = ((paddingBottom - i11) - measuredHeight2) - layoutParams.bottomMargin;
                                            measuredHeight = photoViewer.M0.getHeight();
                                        } else if (childAt == photoViewer.V1 || childAt == photoViewer.N0) {
                                            i19 = photoViewer.C.getMeasuredHeight();
                                        } else if (childAt == photoViewer.O0) {
                                            dp = ((paddingBottom - i11) - measuredHeight2) - layoutParams.bottomMargin;
                                            measuredHeight = photoViewer.M0.getHeight();
                                        } else if (childAt == photoViewer.P7) {
                                            i19 = b.t(31.0f, photoViewer.M0.getHeight(), i19);
                                        }
                                    } else {
                                        FrameLayout frameLayout3 = photoViewer.N7;
                                        int top3 = (frameLayout3 == null || frameLayout3.getVisibility() != 0) ? photoViewer.M0.getTop() - AndroidUtilities.dp(50.0f) : photoViewer.N7.getTop();
                                        int i26 = photoViewer.Z1;
                                        if (i26 != 4 && i26 != 5) {
                                            f11 = 15.0f;
                                        }
                                        dp = (AndroidUtilities.dp(12.0f) + (top3 - AndroidUtilities.dp(f11))) - AndroidUtilities.dp(36.0f);
                                        measuredHeight = childAt.getMeasuredHeight();
                                    }
                                }
                                i19 = dp - measuredHeight;
                            }
                        }
                        childAt.layout(i16 + paddingLeft, i19, i16 + measuredWidth + paddingLeft, measuredHeight2 + i19);
                    } else {
                        i17 = (paddingBottom - i11) - measuredHeight2;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    fs0Var = photoViewer.R1;
                    if (childAt != fs0Var.J) {
                    }
                    childAt.layout(i16 + paddingLeft, i19, i16 + measuredWidth + paddingLeft, measuredHeight2 + i19);
                } else {
                    i14 = (paddingRight - paddingLeft) - measuredWidth;
                    i15 = layoutParams.rightMargin;
                }
                i16 = i14 - i15;
                if (i23 != 16) {
                }
                i19 = i17 - i18;
                fs0Var = photoViewer.R1;
                if (childAt != fs0Var.J) {
                }
                childAt.layout(i16 + paddingLeft, i19, i16 + measuredWidth + paddingLeft, measuredHeight2 + i19);
            }
        }
        S();
        Z();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int bitmapWidth;
        int bitmapHeight;
        bu0 bu0Var = this;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (bu0Var.getLayoutParams().height > 0) {
            size2 = bu0Var.getLayoutParams().height;
        }
        int i15 = size2;
        bu0Var.setMeasuredDimension(size, i15);
        PhotoViewer photoViewer = bu0Var.B0;
        boolean z4 = true;
        if (!photoViewer.o1) {
            bu0Var.y0 = true;
            if (photoViewer.f2) {
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x > point.y ? 5 : 10;
                photoViewer.N1.getCurrentView().setMaxLines(i16);
                photoViewer.N1.getNextView().setMaxLines(i16);
            } else {
                photoViewer.N1.getCurrentView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                photoViewer.N1.getNextView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
            }
            bu0Var.y0 = false;
        }
        int dp = photoViewer.f0.getVisibility() != 8 ? AndroidUtilities.dp(48.0f) : 0;
        org.telegram.ui.Components.x30 x30Var = photoViewer.i1;
        if (x30Var == null || x30Var.getVisibility() == 8) {
            i12 = i10;
            i13 = 0;
        } else {
            ((ViewGroup.MarginLayoutParams) photoViewer.i1.getLayoutParams()).bottomMargin = dp;
            i12 = i10;
            bu0Var.measureChildWithMargins(photoViewer.i1, i12, 0, i11, 0);
            int measuredHeight = photoViewer.i1.getMeasuredHeight();
            bu0Var.y0 = true;
            if (AndroidUtilities.isTablet() || i15 >= size) {
                if (photoViewer.i1.getVisibility() != 0) {
                    photoViewer.i1.setVisibility(0);
                }
            } else if (photoViewer.i1.getVisibility() != 4) {
                photoViewer.i1.setVisibility(4);
            }
            bu0Var.y0 = false;
            i13 = measuredHeight;
        }
        qu0 qu0Var = photoViewer.f3;
        if (qu0Var != null) {
            qu0Var.e = size;
            qu0Var.f = i15;
        }
        int paddingLeft = size - (bu0Var.getPaddingLeft() + bu0Var.getPaddingRight());
        int paddingBottom = i15 - bu0Var.getPaddingBottom();
        int childCount = bu0Var.getChildCount();
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = bu0Var.getChildAt(i17);
            if (childAt.getVisibility() != 8 && childAt != photoViewer.i1) {
                xs0 xs0Var = photoViewer.v2;
                if (childAt == xs0Var) {
                    childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight, TLObject.FLAG_30));
                } else if (childAt == photoViewer.v4) {
                    if (xs0Var == null || xs0Var.getVisibility() != 0) {
                        bitmapWidth = photoViewer.z4.getBitmapWidth();
                        bitmapHeight = photoViewer.z4.getBitmapHeight();
                    } else {
                        View view = photoViewer.A2 ? photoViewer.z2 : photoViewer.y2;
                        bitmapWidth = view.getMeasuredWidth();
                        bitmapHeight = view.getMeasuredHeight();
                    }
                    if (bitmapWidth == 0 || bitmapHeight == 0) {
                        bitmapWidth = paddingLeft;
                        bitmapHeight = paddingBottom;
                    }
                    photoViewer.v4.measure(View.MeasureSpec.makeMeasureSpec(bitmapWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(bitmapHeight, TLObject.FLAG_30));
                } else if (photoViewer.R1.f.l(childAt) || photoViewer.S1.f.l(childAt)) {
                    if (photoViewer.s) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingBottom, TLObject.FLAG_30));
                    } else if (!AndroidUtilities.isInMultiwindow) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height + AndroidUtilities.navigationBarHeight, TLObject.FLAG_30));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(320.0f), paddingBottom - AndroidUtilities.statusBarHeight), TLObject.FLAG_30));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingBottom - AndroidUtilities.statusBarHeight, TLObject.FLAG_30));
                    }
                } else if (childAt == photoViewer.Q1) {
                    if (photoViewer.j2) {
                        if (bu0Var.z0) {
                            i14 = dp + i13;
                            int currentActionBarHeight = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i14;
                            ((ViewGroup.MarginLayoutParams) photoViewer.Q1.getLayoutParams()).bottomMargin = i14;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, TLObject.FLAG_30));
                        }
                        i14 = dp;
                        int currentActionBarHeight2 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i14;
                        ((ViewGroup.MarginLayoutParams) photoViewer.Q1.getLayoutParams()).bottomMargin = i14;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight2, TLObject.FLAG_30));
                    } else if (!photoViewer.i1.c() || (!AndroidUtilities.isTablet() && paddingBottom <= paddingLeft)) {
                        bu0Var.z0 = false;
                        i14 = dp;
                        int currentActionBarHeight22 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i14;
                        ((ViewGroup.MarginLayoutParams) photoViewer.Q1.getLayoutParams()).bottomMargin = i14;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight22, TLObject.FLAG_30));
                    } else {
                        i14 = dp + i13;
                        bu0Var.z0 = z4;
                        int currentActionBarHeight222 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i14;
                        ((ViewGroup.MarginLayoutParams) photoViewer.Q1.getLayoutParams()).bottomMargin = i14;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight222, TLObject.FLAG_30));
                    }
                } else if (childAt == photoViewer.V1 || childAt == photoViewer.N0) {
                    childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight), TLObject.FLAG_30));
                } else if (childAt == photoViewer.S1.J) {
                    childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight), TLObject.FLAG_30));
                } else {
                    bu0Var.measureChildWithMargins(childAt, i12, 0, i11, 0);
                }
            }
            i17++;
            z4 = true;
            bu0Var = this;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.y0) {
            return;
        }
        super.requestLayout();
    }
}
