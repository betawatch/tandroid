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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class as0 extends org.telegram.ui.Components.vu0 {
    public final Paint j0;
    public boolean k0;
    public boolean l0;
    public ArrayList m0;
    public final /* synthetic */ PhotoViewer n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as0(PhotoViewer photoViewer, Activity activity, Activity activity2) {
        super(activity, activity2);
        this.n0 = photoViewer;
        Paint paint = new Paint();
        this.j0 = paint;
        setWillNotDraw(false);
        paint.setColor(855638016);
        setLayerType(2, null);
    }

    @Override // org.telegram.ui.Components.vu0, org.telegram.ui.Components.uu0
    public final void R() {
        super.R();
        PhotoViewer photoViewer = this.n0;
        if (photoViewer.r1) {
            photoViewer.W0[0].e(2, getKeyboardHeight() <= org.telegram.messenger.i0.L(20.0f) ? 1.0f : 0.0f, true);
        }
    }

    public final void X() {
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.m0 == null) {
                this.m0 = new ArrayList();
            }
            this.m0.clear();
            PhotoViewer photoViewer = this.n0;
            if (photoViewer.u4 == 1 || photoViewer.o6 == 1) {
                int measuredHeight = getMeasuredHeight();
                int measuredWidth = getMeasuredWidth();
                this.m0.add(new Rect(0, org.telegram.messenger.z20.y(200.0f, measuredHeight, 2), org.telegram.messenger.i0.L(100.0f), (org.telegram.messenger.i0.L(200.0f) + measuredHeight) / 2));
                this.m0.add(new Rect(measuredWidth - org.telegram.messenger.i0.L(100.0f), org.telegram.messenger.z20.y(200.0f, measuredHeight, 2), measuredWidth, (org.telegram.messenger.i0.L(200.0f) + measuredHeight) / 2));
            }
            setSystemGestureExclusionRects(this.m0);
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        PhotoViewer photoViewer = this.n0;
        photoViewer.Q.n(photoViewer.g0.getContext()).draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.n0;
        org.telegram.ui.Cells.v9 n10 = photoViewer.Q.n(getContext());
        org.telegram.ui.Cells.w9 w9Var = n10.r;
        if (motionEvent.getAction() == 0) {
            n10.h = motionEvent.getX();
            n10.n = motionEvent.getY();
            w9Var.e = w9Var.x();
        } else if (w9Var.e && Math.abs(motionEvent.getX() - n10.h) < org.telegram.messenger.i0.e && Math.abs(motionEvent.getY() - n10.n) < org.telegram.messenger.i0.e && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            motionEvent.getX();
            motionEvent.getY();
            org.telegram.ui.Cells.w9 w9Var2 = n10.r;
            if (!w9Var2.i && w9Var2.e) {
                w9Var2.f(false);
            }
        }
        if (!photoViewer.Q.x()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        photoViewer.Q.n(getContext()).onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        PhotoViewer photoViewer = this.n0;
        mr0 mr0Var = photoViewer.f0;
        if (mr0Var == null || !mr0Var.y) {
            return;
        }
        int measuredHeight = ((int) ((photoViewer.a6 - 1.0f) * mr0Var.getWebView().getMeasuredHeight())) / 2;
        org.telegram.ui.Components.m61 m61Var = photoViewer.z1;
        if (m61Var != null && m61Var.j) {
            m61Var.setBounds(photoViewer.f0.getLeft(), (photoViewer.f0.getWebView().getTop() - measuredHeight) + ((int) (photoViewer.Y5 / photoViewer.a6)), photoViewer.f0.getRight(), photoViewer.f0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.Y5 / photoViewer.a6)));
            photoViewer.z1.draw(canvas);
        }
        org.telegram.ui.Components.rn0 rn0Var = photoViewer.A1;
        if (rn0Var == null || !rn0Var.a()) {
            return;
        }
        photoViewer.A1.setBounds(photoViewer.f0.getLeft(), (int) ((photoViewer.F.getAlpha() * org.telegram.messenger.i0.L(90.0f)) + org.telegram.messenger.i0.m), photoViewer.f0.getRight(), photoViewer.f0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.Y5 / photoViewer.a6)));
        photoViewer.A1.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        PhotoViewer photoViewer = this.n0;
        if (view == photoViewer.Q.n(photoViewer.g0.getContext()) || view == photoViewer.s5 || view == photoViewer.z4 || view == photoViewer.A4 || view == photoViewer.X0) {
            return false;
        }
        FrameLayout frameLayout = photoViewer.R7;
        if (view == frameLayout && frameLayout.getTranslationY() > 0.0f && photoViewer.P0.getTranslationY() == 0.0f) {
            canvas.save();
            canvas.clipRect(photoViewer.R7.getX(), photoViewer.R7.getY(), photoViewer.R7.getX() + photoViewer.R7.getMeasuredWidth(), photoViewer.R7.getBottom());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        try {
            if (view == photoViewer.y2 || view == photoViewer.y4) {
                return false;
            }
            return super.drawChild(canvas, view, j10);
        } catch (Throwable unused) {
            return true;
        }
    }

    @Override // org.telegram.ui.Components.uu0
    public final int getBottomPadding() {
        return this.n0.P0.getHeight();
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new z8(this, 6));
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        kg.g1 g1Var;
        Canvas canvas2;
        Drawable[] drawableArr = PhotoViewer.U8;
        PhotoViewer photoViewer = this.n0;
        photoViewer.Y1(canvas);
        if (org.telegram.messenger.i0.m == 0 || (g1Var = photoViewer.F) == null) {
            return;
        }
        int alpha = (int) (g1Var.getAlpha() * 255.0f * 0.498f);
        Paint paint = this.j0;
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
            float alpha2 = (1.0f - photoViewer.F.getAlpha()) * org.telegram.messenger.i0.N(24.0f);
            canvas2.drawRect(0.0f, (getMeasuredHeight() - getPaddingBottom()) + alpha2, getMeasuredWidth(), getMeasuredHeight() + alpha2, paint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
    @Override // org.telegram.ui.Components.vu0, org.telegram.ui.Components.uu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft;
        int paddingRight;
        int paddingBottom;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        jq0 jq0Var;
        int top;
        int L;
        int measuredHeight;
        int L2;
        PhotoViewer photoViewer = this.n0;
        if (photoViewer.u5 != null && photoViewer.x5 != null) {
            int L3 = (i12 - i10) - org.telegram.messenger.i0.L(20.0f);
            photoViewer.x5.setTranslationY(((-L3) / 2.0f) - org.telegram.messenger.i0.L(47.0f));
            float f7 = L3 / 2.0f;
            photoViewer.u5.setTranslationY(org.telegram.messenger.i0.L(47.0f) + f7);
            photoViewer.t5.setTranslationY(org.telegram.messenger.i0.L(47.0f) + f7);
            photoViewer.y5.setTranslationY(f7 + org.telegram.messenger.i0.L(95.0f));
        }
        int childCount = getChildCount();
        Q();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                if (childAt == photoViewer.y2) {
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
                int i23 = i21 & org.telegram.messenger.zs.x1;
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
                        jq0Var = photoViewer.U1;
                        if (childAt != jq0Var.M) {
                            if (childAt == photoViewer.V1.M) {
                                i19 += photoViewer.F.getMeasuredHeight();
                            } else if (jq0Var.f.l(childAt) || photoViewer.V1.f.l(childAt)) {
                                i19 = ((i13 - i11) - measuredHeight2) + ((photoViewer.s || org.telegram.messenger.i0.E) ? 0 : org.telegram.messenger.i0.n);
                            } else if (childAt == photoViewer.o1) {
                                i19 = org.telegram.messenger.i0.L(5.0f) + photoViewer.F.getMeasuredHeight();
                            } else {
                                float f10 = 40.0f;
                                if (childAt == photoViewer.e1 || childAt == photoViewer.f1 || childAt == photoViewer.g1) {
                                    FrameLayout frameLayout = photoViewer.R7;
                                    if (frameLayout == null || frameLayout.getVisibility() != 0) {
                                        top = photoViewer.P0.getTop();
                                        if (childAt == photoViewer.f1) {
                                            top -= org.telegram.messenger.i0.L(50.0f);
                                        }
                                    } else {
                                        top = photoViewer.R7.getTop();
                                    }
                                    int i24 = photoViewer.c2;
                                    if (i24 != 4 && i24 != 5) {
                                        f10 = 15.0f;
                                    }
                                    L = org.telegram.messenger.i0.L(12.0f) + (top - org.telegram.messenger.i0.L(f10));
                                    measuredHeight = childAt.getMeasuredHeight();
                                } else {
                                    ArrayList arrayList = photoViewer.i1;
                                    if (arrayList == null || !arrayList.contains(childAt)) {
                                        ArrayList arrayList2 = photoViewer.h1;
                                        if (arrayList2 != null && arrayList2.contains(childAt)) {
                                            FrameLayout frameLayout2 = photoViewer.R7;
                                            int top2 = (frameLayout2 == null || frameLayout2.getVisibility() != 0) ? photoViewer.P0.getTop() : photoViewer.R7.getTop();
                                            int i25 = photoViewer.c2;
                                            if (i25 != 4 && i25 != 5) {
                                                f10 = 15.0f;
                                            }
                                            L = (org.telegram.messenger.i0.L(12.0f) + (top2 - org.telegram.messenger.i0.L(f10))) - org.telegram.messenger.i0.L(36.0f);
                                            measuredHeight = childAt.getMeasuredHeight();
                                        } else if (childAt == photoViewer.R7) {
                                            i19 -= photoViewer.P0.getHeight();
                                            if (photoViewer.c2 == 1) {
                                                L2 = org.telegram.messenger.i0.L(52.0f);
                                            } else if (photoViewer.U1.getVisibility() == 0) {
                                                L2 = org.telegram.messenger.i0.L(56.0f);
                                            }
                                            i19 -= L2;
                                        } else if (childAt == photoViewer.X1) {
                                            L = ((paddingBottom - i11) - measuredHeight2) - layoutParams.bottomMargin;
                                            measuredHeight = photoViewer.P0.getHeight();
                                        } else if (childAt == photoViewer.Y1 || childAt == photoViewer.Q0) {
                                            i19 = photoViewer.F.getMeasuredHeight();
                                        } else if (childAt == photoViewer.R0) {
                                            L = ((paddingBottom - i11) - measuredHeight2) - layoutParams.bottomMargin;
                                            measuredHeight = photoViewer.P0.getHeight();
                                        } else if (childAt == photoViewer.T7) {
                                            i19 = org.telegram.messenger.z20.w(31.0f, photoViewer.P0.getHeight(), i19);
                                        }
                                    } else {
                                        FrameLayout frameLayout3 = photoViewer.R7;
                                        int top3 = (frameLayout3 == null || frameLayout3.getVisibility() != 0) ? photoViewer.P0.getTop() - org.telegram.messenger.i0.L(50.0f) : photoViewer.R7.getTop();
                                        int i26 = photoViewer.c2;
                                        if (i26 != 4 && i26 != 5) {
                                            f10 = 15.0f;
                                        }
                                        L = (org.telegram.messenger.i0.L(12.0f) + (top3 - org.telegram.messenger.i0.L(f10))) - org.telegram.messenger.i0.L(36.0f);
                                        measuredHeight = childAt.getMeasuredHeight();
                                    }
                                }
                                i19 = L - measuredHeight;
                            }
                        }
                        childAt.layout(i16 + paddingLeft, i19, i16 + measuredWidth + paddingLeft, measuredHeight2 + i19);
                    } else {
                        i17 = (paddingBottom - i11) - measuredHeight2;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    jq0Var = photoViewer.U1;
                    if (childAt != jq0Var.M) {
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
                jq0Var = photoViewer.U1;
                if (childAt != jq0Var.M) {
                }
                childAt.layout(i16 + paddingLeft, i19, i16 + measuredWidth + paddingLeft, measuredHeight2 + i19);
            }
        }
        R();
        X();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int q6;
        int o10;
        as0 as0Var = this;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (as0Var.getLayoutParams().height > 0) {
            size2 = as0Var.getLayoutParams().height;
        }
        int i15 = size2;
        as0Var.setMeasuredDimension(size, i15);
        PhotoViewer photoViewer = as0Var.n0;
        boolean z10 = true;
        if (!photoViewer.r1) {
            as0Var.k0 = true;
            if (photoViewer.i2) {
                Point point = org.telegram.messenger.i0.q;
                int i16 = point.x > point.y ? 5 : 10;
                photoViewer.Q1.getCurrentView().setMaxLines(i16);
                photoViewer.Q1.getNextView().setMaxLines(i16);
            } else {
                photoViewer.Q1.getCurrentView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                photoViewer.Q1.getNextView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
            }
            as0Var.k0 = false;
        }
        int L = photoViewer.i0.getVisibility() != 8 ? org.telegram.messenger.i0.L(48.0f) : 0;
        org.telegram.ui.Components.d30 d30Var = photoViewer.l1;
        if (d30Var == null || d30Var.getVisibility() == 8) {
            i12 = i10;
            i13 = 0;
        } else {
            ((ViewGroup.MarginLayoutParams) photoViewer.l1.getLayoutParams()).bottomMargin = L;
            i12 = i10;
            as0Var.measureChildWithMargins(photoViewer.l1, i12, 0, i11, 0);
            int measuredHeight = photoViewer.l1.getMeasuredHeight();
            as0Var.k0 = true;
            if (org.telegram.messenger.i0.Q1() || i15 >= size) {
                if (photoViewer.l1.getVisibility() != 0) {
                    photoViewer.l1.setVisibility(0);
                }
            } else if (photoViewer.l1.getVisibility() != 4) {
                photoViewer.l1.setVisibility(4);
            }
            as0Var.k0 = false;
            i13 = measuredHeight;
        }
        ms0 ms0Var = photoViewer.i3;
        if (ms0Var != null) {
            ms0Var.e = size;
            ms0Var.f = i15;
        }
        int paddingLeft = size - (as0Var.getPaddingLeft() + as0Var.getPaddingRight());
        int paddingBottom = i15 - as0Var.getPaddingBottom();
        int childCount = as0Var.getChildCount();
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = as0Var.getChildAt(i17);
            if (childAt.getVisibility() != 8 && childAt != photoViewer.l1) {
                org.telegram.ui.Components.af0 af0Var = photoViewer.y2;
                if (childAt == af0Var) {
                    childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(as0Var.getMeasuredHeight(), TLObject.FLAG_30));
                } else if (childAt == photoViewer.y4) {
                    if (af0Var == null || af0Var.getVisibility() != 0) {
                        q6 = photoViewer.C4.q();
                        o10 = photoViewer.C4.o();
                    } else {
                        View view = photoViewer.D2 ? photoViewer.C2 : photoViewer.B2;
                        q6 = view.getMeasuredWidth();
                        o10 = view.getMeasuredHeight();
                    }
                    if (q6 == 0 || o10 == 0) {
                        q6 = paddingLeft;
                        o10 = paddingBottom;
                    }
                    photoViewer.y4.measure(View.MeasureSpec.makeMeasureSpec(q6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(o10, TLObject.FLAG_30));
                } else if (photoViewer.U1.f.l(childAt) || photoViewer.V1.f.l(childAt)) {
                    if (photoViewer.s) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingBottom, TLObject.FLAG_30));
                    } else if (!org.telegram.messenger.i0.E) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height + org.telegram.messenger.i0.n, TLObject.FLAG_30));
                    } else if (org.telegram.messenger.i0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(320.0f), paddingBottom - org.telegram.messenger.i0.m), TLObject.FLAG_30));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingBottom - org.telegram.messenger.i0.m, TLObject.FLAG_30));
                    }
                } else if (childAt == photoViewer.T1) {
                    if (photoViewer.m2) {
                        if (as0Var.l0) {
                            i14 = L + i13;
                            int currentActionBarHeight = (paddingBottom - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m)) - i14;
                            ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i14;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, TLObject.FLAG_30));
                        }
                        i14 = L;
                        int currentActionBarHeight2 = (paddingBottom - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m)) - i14;
                        ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i14;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight2, TLObject.FLAG_30));
                    } else if (!photoViewer.l1.c() || (!org.telegram.messenger.i0.Q1() && paddingBottom <= paddingLeft)) {
                        as0Var.l0 = false;
                        i14 = L;
                        int currentActionBarHeight22 = (paddingBottom - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m)) - i14;
                        ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i14;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight22, TLObject.FLAG_30));
                    } else {
                        i14 = L + i13;
                        as0Var.l0 = z10;
                        int currentActionBarHeight222 = (paddingBottom - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m)) - i14;
                        ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i14;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight222, TLObject.FLAG_30));
                    }
                } else if (childAt == photoViewer.Y1 || childAt == photoViewer.Q0) {
                    childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m), TLObject.FLAG_30));
                } else if (childAt == photoViewer.V1.M) {
                    childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m), TLObject.FLAG_30));
                } else {
                    as0Var.measureChildWithMargins(childAt, i12, 0, i11, 0);
                }
            }
            i17++;
            z10 = true;
            as0Var = this;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.k0) {
            return;
        }
        super.requestLayout();
    }
}
