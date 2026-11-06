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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class pq0 extends org.telegram.ui.Components.st0 {
    public final Paint j0;
    public boolean k0;
    public boolean l0;
    public ArrayList m0;
    public final /* synthetic */ PhotoViewer n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq0(PhotoViewer photoViewer, Activity activity, Activity activity2) {
        super(activity, activity2);
        this.n0 = photoViewer;
        Paint paint = new Paint();
        this.j0 = paint;
        setWillNotDraw(false);
        paint.setColor(855638016);
        setLayerType(2, null);
    }

    @Override // org.telegram.ui.Components.st0, org.telegram.ui.Components.rt0
    public final void R() {
        super.R();
        PhotoViewer photoViewer = this.n0;
        if (photoViewer.r1) {
            photoViewer.W0[0].e(2, getKeyboardHeight() <= org.telegram.messenger.g0.L(20.0f) ? 1.0f : 0.0f, true);
        }
    }

    public final void X() {
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.m0 == null) {
                this.m0 = new ArrayList();
            }
            this.m0.clear();
            PhotoViewer photoViewer = this.n0;
            if (photoViewer.t4 == 1 || photoViewer.n6 == 1) {
                int measuredHeight = getMeasuredHeight();
                int measuredWidth = getMeasuredWidth();
                this.m0.add(new Rect(0, org.telegram.messenger.camera.q.y(200.0f, measuredHeight, 2), org.telegram.messenger.g0.L(100.0f), (org.telegram.messenger.g0.L(200.0f) + measuredHeight) / 2));
                this.m0.add(new Rect(measuredWidth - org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.camera.q.y(200.0f, measuredHeight, 2), measuredWidth, (org.telegram.messenger.g0.L(200.0f) + measuredHeight) / 2));
            }
            setSystemGestureExclusionRects(this.m0);
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        PhotoViewer photoViewer = this.n0;
        photoViewer.Q.n(photoViewer.g0.getContext()).draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.n0;
        org.telegram.ui.Cells.u9 n10 = photoViewer.Q.n(getContext());
        org.telegram.ui.Cells.v9 v9Var = n10.r;
        if (motionEvent.getAction() == 0) {
            n10.h = motionEvent.getX();
            n10.n = motionEvent.getY();
            v9Var.e = v9Var.x();
        } else if (v9Var.e && Math.abs(motionEvent.getX() - n10.h) < org.telegram.messenger.g0.e && Math.abs(motionEvent.getY() - n10.n) < org.telegram.messenger.g0.e && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            motionEvent.getX();
            motionEvent.getY();
            org.telegram.ui.Cells.v9 v9Var2 = n10.r;
            if (!v9Var2.i && v9Var2.e) {
                v9Var2.f(false);
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
        cq0 cq0Var = photoViewer.f0;
        if (cq0Var == null || !cq0Var.y) {
            return;
        }
        int measuredHeight = ((int) ((photoViewer.Z5 - 1.0f) * cq0Var.getWebView().getMeasuredHeight())) / 2;
        org.telegram.ui.Components.j51 j51Var = photoViewer.z1;
        if (j51Var != null && j51Var.j) {
            j51Var.setBounds(photoViewer.f0.getLeft(), (photoViewer.f0.getWebView().getTop() - measuredHeight) + ((int) (photoViewer.X5 / photoViewer.Z5)), photoViewer.f0.getRight(), photoViewer.f0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.X5 / photoViewer.Z5)));
            photoViewer.z1.draw(canvas);
        }
        org.telegram.ui.Components.qm0 qm0Var = photoViewer.A1;
        if (qm0Var == null || !qm0Var.a()) {
            return;
        }
        photoViewer.A1.setBounds(photoViewer.f0.getLeft(), (int) ((photoViewer.F.getAlpha() * org.telegram.messenger.g0.L(90.0f)) + org.telegram.messenger.g0.m), photoViewer.f0.getRight(), photoViewer.f0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.X5 / photoViewer.Z5)));
        photoViewer.A1.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        PhotoViewer photoViewer = this.n0;
        if (view == photoViewer.Q.n(photoViewer.g0.getContext()) || view == photoViewer.r5 || view == photoViewer.y4 || view == photoViewer.z4 || view == photoViewer.X0) {
            return false;
        }
        FrameLayout frameLayout = photoViewer.Q7;
        if (view == frameLayout && frameLayout.getTranslationY() > 0.0f && photoViewer.P0.getTranslationY() == 0.0f) {
            canvas.save();
            canvas.clipRect(photoViewer.Q7.getX(), photoViewer.Q7.getY(), photoViewer.Q7.getX() + photoViewer.Q7.getMeasuredWidth(), photoViewer.Q7.getBottom());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        try {
            if (view == photoViewer.y2 || view == photoViewer.x4) {
                return false;
            }
            return super.drawChild(canvas, view, j3);
        } catch (Throwable unused) {
            return true;
        }
    }

    @Override // org.telegram.ui.Components.rt0
    public final int getBottomPadding() {
        return this.n0.P0.getHeight();
    }

    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new y8(this, 6));
    }

    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.r7 r7Var;
        Canvas canvas2;
        Drawable[] drawableArr = PhotoViewer.Y8;
        PhotoViewer photoViewer = this.n0;
        photoViewer.T1(canvas);
        if (org.telegram.messenger.g0.m == 0 || (r7Var = photoViewer.F) == null) {
            return;
        }
        int alpha = (int) (r7Var.getAlpha() * 255.0f * 0.498f);
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
            float alpha2 = (1.0f - photoViewer.F.getAlpha()) * org.telegram.messenger.g0.N(24.0f);
            canvas2.drawRect(0.0f, (getMeasuredHeight() - getPaddingBottom()) + alpha2, getMeasuredWidth(), getMeasuredHeight() + alpha2, paint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
    @Override // org.telegram.ui.Components.st0, org.telegram.ui.Components.rt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int paddingLeft;
        int paddingRight;
        int paddingBottom;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        zo0 zo0Var;
        int top;
        int L;
        int measuredHeight;
        int L2;
        PhotoViewer photoViewer = this.n0;
        if (photoViewer.t5 != null && photoViewer.w5 != null) {
            int L3 = (i11 - i7) - org.telegram.messenger.g0.L(20.0f);
            photoViewer.w5.setTranslationY(((-L3) / 2.0f) - org.telegram.messenger.g0.L(47.0f));
            float f10 = L3 / 2.0f;
            photoViewer.t5.setTranslationY(org.telegram.messenger.g0.L(47.0f) + f10);
            photoViewer.s5.setTranslationY(org.telegram.messenger.g0.L(47.0f) + f10);
            photoViewer.x5.setTranslationY(f10 + org.telegram.messenger.g0.L(95.0f));
        }
        int childCount = getChildCount();
        Q();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                if (childAt == photoViewer.y2) {
                    paddingLeft = i7;
                    paddingRight = i11;
                    paddingBottom = i12;
                } else {
                    paddingLeft = getPaddingLeft() + i7;
                    paddingRight = i11 - getPaddingRight();
                    paddingBottom = i12 - getPaddingBottom();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i20 = layoutParams.gravity;
                if (i20 == -1) {
                    i20 = 51;
                }
                int i21 = i20 & 7;
                int i22 = i20 & org.telegram.messenger.qs.x1;
                if (i21 == 1) {
                    i13 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i21 != 5) {
                    i15 = layoutParams.leftMargin;
                    if (i22 != 16) {
                        i16 = (((paddingBottom - i10) - measuredHeight2) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    } else if (i22 != 80) {
                        i18 = layoutParams.topMargin;
                        zo0Var = photoViewer.U1;
                        if (childAt != zo0Var.M) {
                            if (childAt == photoViewer.V1.M) {
                                i18 += photoViewer.F.getMeasuredHeight();
                            } else if (zo0Var.f.l(childAt) || photoViewer.V1.f.l(childAt)) {
                                i18 = ((i12 - i10) - measuredHeight2) + ((photoViewer.s || org.telegram.messenger.g0.E) ? 0 : org.telegram.messenger.g0.n);
                            } else if (childAt == photoViewer.o1) {
                                i18 = org.telegram.messenger.g0.L(5.0f) + photoViewer.F.getMeasuredHeight();
                            } else {
                                float f11 = 40.0f;
                                if (childAt == photoViewer.e1 || childAt == photoViewer.f1 || childAt == photoViewer.g1) {
                                    FrameLayout frameLayout = photoViewer.Q7;
                                    if (frameLayout == null || frameLayout.getVisibility() != 0) {
                                        top = photoViewer.P0.getTop();
                                        if (childAt == photoViewer.f1) {
                                            top -= org.telegram.messenger.g0.L(50.0f);
                                        }
                                    } else {
                                        top = photoViewer.Q7.getTop();
                                    }
                                    int i23 = photoViewer.c2;
                                    if (i23 != 4 && i23 != 5) {
                                        f11 = 15.0f;
                                    }
                                    L = org.telegram.messenger.g0.L(12.0f) + (top - org.telegram.messenger.g0.L(f11));
                                    measuredHeight = childAt.getMeasuredHeight();
                                } else {
                                    ArrayList arrayList = photoViewer.i1;
                                    if (arrayList == null || !arrayList.contains(childAt)) {
                                        ArrayList arrayList2 = photoViewer.h1;
                                        if (arrayList2 != null && arrayList2.contains(childAt)) {
                                            FrameLayout frameLayout2 = photoViewer.Q7;
                                            int top2 = (frameLayout2 == null || frameLayout2.getVisibility() != 0) ? photoViewer.P0.getTop() : photoViewer.Q7.getTop();
                                            int i24 = photoViewer.c2;
                                            if (i24 != 4 && i24 != 5) {
                                                f11 = 15.0f;
                                            }
                                            L = (org.telegram.messenger.g0.L(12.0f) + (top2 - org.telegram.messenger.g0.L(f11))) - org.telegram.messenger.g0.L(36.0f);
                                            measuredHeight = childAt.getMeasuredHeight();
                                        } else if (childAt == photoViewer.Q7) {
                                            i18 -= photoViewer.P0.getHeight();
                                            if (photoViewer.c2 == 1) {
                                                L2 = org.telegram.messenger.g0.L(52.0f);
                                            } else if (photoViewer.U1.getVisibility() == 0) {
                                                L2 = org.telegram.messenger.g0.L(56.0f);
                                            }
                                            i18 -= L2;
                                        } else if (childAt == photoViewer.X1) {
                                            L = ((paddingBottom - i10) - measuredHeight2) - layoutParams.bottomMargin;
                                            measuredHeight = photoViewer.P0.getHeight();
                                        } else if (childAt == photoViewer.Y1 || childAt == photoViewer.Q0) {
                                            i18 = photoViewer.F.getMeasuredHeight();
                                        } else if (childAt == photoViewer.R0) {
                                            L = ((paddingBottom - i10) - measuredHeight2) - layoutParams.bottomMargin;
                                            measuredHeight = photoViewer.P0.getHeight();
                                        } else if (childAt == photoViewer.S7) {
                                            i18 = org.telegram.messenger.camera.q.w(31.0f, photoViewer.P0.getHeight(), i18);
                                        }
                                    } else {
                                        FrameLayout frameLayout3 = photoViewer.Q7;
                                        int top3 = (frameLayout3 == null || frameLayout3.getVisibility() != 0) ? photoViewer.P0.getTop() - org.telegram.messenger.g0.L(50.0f) : photoViewer.Q7.getTop();
                                        int i25 = photoViewer.c2;
                                        if (i25 != 4 && i25 != 5) {
                                            f11 = 15.0f;
                                        }
                                        L = (org.telegram.messenger.g0.L(12.0f) + (top3 - org.telegram.messenger.g0.L(f11))) - org.telegram.messenger.g0.L(36.0f);
                                        measuredHeight = childAt.getMeasuredHeight();
                                    }
                                }
                                i18 = L - measuredHeight;
                            }
                        }
                        childAt.layout(i15 + paddingLeft, i18, i15 + measuredWidth + paddingLeft, measuredHeight2 + i18);
                    } else {
                        i16 = (paddingBottom - i10) - measuredHeight2;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    zo0Var = photoViewer.U1;
                    if (childAt != zo0Var.M) {
                    }
                    childAt.layout(i15 + paddingLeft, i18, i15 + measuredWidth + paddingLeft, measuredHeight2 + i18);
                } else {
                    i13 = (paddingRight - paddingLeft) - measuredWidth;
                    i14 = layoutParams.rightMargin;
                }
                i15 = i13 - i14;
                if (i22 != 16) {
                }
                i18 = i16 - i17;
                zo0Var = photoViewer.U1;
                if (childAt != zo0Var.M) {
                }
                childAt.layout(i15 + paddingLeft, i18, i15 + measuredWidth + paddingLeft, measuredHeight2 + i18);
            }
        }
        R();
        X();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int q10;
        int o4;
        pq0 pq0Var = this;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        if (pq0Var.getLayoutParams().height > 0) {
            size2 = pq0Var.getLayoutParams().height;
        }
        int i14 = size2;
        pq0Var.setMeasuredDimension(size, i14);
        PhotoViewer photoViewer = pq0Var.n0;
        boolean z9 = true;
        if (!photoViewer.r1) {
            pq0Var.k0 = true;
            if (photoViewer.i2) {
                Point point = org.telegram.messenger.g0.q;
                int i15 = point.x > point.y ? 5 : 10;
                photoViewer.Q1.getCurrentView().setMaxLines(i15);
                photoViewer.Q1.getNextView().setMaxLines(i15);
            } else {
                photoViewer.Q1.getCurrentView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                photoViewer.Q1.getNextView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
            }
            pq0Var.k0 = false;
        }
        int L = photoViewer.i0.getVisibility() != 8 ? org.telegram.messenger.g0.L(48.0f) : 0;
        org.telegram.ui.Components.l20 l20Var = photoViewer.l1;
        if (l20Var == null || l20Var.getVisibility() == 8) {
            i11 = i7;
            i12 = 0;
        } else {
            ((ViewGroup.MarginLayoutParams) photoViewer.l1.getLayoutParams()).bottomMargin = L;
            i11 = i7;
            pq0Var.measureChildWithMargins(photoViewer.l1, i11, 0, i10, 0);
            int measuredHeight = photoViewer.l1.getMeasuredHeight();
            pq0Var.k0 = true;
            if (org.telegram.messenger.g0.Q1() || i14 >= size) {
                if (photoViewer.l1.getVisibility() != 0) {
                    photoViewer.l1.setVisibility(0);
                }
            } else if (photoViewer.l1.getVisibility() != 4) {
                photoViewer.l1.setVisibility(4);
            }
            pq0Var.k0 = false;
            i12 = measuredHeight;
        }
        cr0 cr0Var = photoViewer.h3;
        if (cr0Var != null) {
            cr0Var.e = size;
            cr0Var.f = i14;
        }
        int paddingLeft = size - (pq0Var.getPaddingLeft() + pq0Var.getPaddingRight());
        int paddingBottom = i14 - pq0Var.getPaddingBottom();
        int childCount = pq0Var.getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            View childAt = pq0Var.getChildAt(i16);
            if (childAt.getVisibility() != 8 && childAt != photoViewer.l1) {
                org.telegram.ui.Components.fe0 fe0Var = photoViewer.y2;
                if (childAt == fe0Var) {
                    childAt.measure(i11, View.MeasureSpec.makeMeasureSpec(pq0Var.getMeasuredHeight(), TLObject.FLAG_30));
                } else if (childAt == photoViewer.x4) {
                    if (fe0Var == null || fe0Var.getVisibility() != 0) {
                        q10 = photoViewer.B4.q();
                        o4 = photoViewer.B4.o();
                    } else {
                        View view = photoViewer.D2 ? photoViewer.C2 : photoViewer.B2;
                        q10 = view.getMeasuredWidth();
                        o4 = view.getMeasuredHeight();
                    }
                    if (q10 == 0 || o4 == 0) {
                        q10 = paddingLeft;
                        o4 = paddingBottom;
                    }
                    photoViewer.x4.measure(View.MeasureSpec.makeMeasureSpec(q10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(o4, TLObject.FLAG_30));
                } else if (photoViewer.U1.f.l(childAt) || photoViewer.V1.f.l(childAt)) {
                    if (photoViewer.s) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingBottom, TLObject.FLAG_30));
                    } else if (!org.telegram.messenger.g0.E) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height + org.telegram.messenger.g0.n, TLObject.FLAG_30));
                    } else if (org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(320.0f), paddingBottom - org.telegram.messenger.g0.m), TLObject.FLAG_30));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingBottom - org.telegram.messenger.g0.m, TLObject.FLAG_30));
                    }
                } else if (childAt == photoViewer.T1) {
                    if (photoViewer.m2) {
                        if (pq0Var.l0) {
                            i13 = L + i12;
                            int currentActionBarHeight = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m)) - i13;
                            ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i13;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, TLObject.FLAG_30));
                        }
                        i13 = L;
                        int currentActionBarHeight2 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m)) - i13;
                        ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i13;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight2, TLObject.FLAG_30));
                    } else if (!photoViewer.l1.c() || (!org.telegram.messenger.g0.Q1() && paddingBottom <= paddingLeft)) {
                        pq0Var.l0 = false;
                        i13 = L;
                        int currentActionBarHeight22 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m)) - i13;
                        ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i13;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight22, TLObject.FLAG_30));
                    } else {
                        i13 = L + i12;
                        pq0Var.l0 = z9;
                        int currentActionBarHeight222 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m)) - i13;
                        ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i13;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight222, TLObject.FLAG_30));
                    }
                } else if (childAt == photoViewer.Y1 || childAt == photoViewer.Q0) {
                    childAt.measure(i11, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m), TLObject.FLAG_30));
                } else if (childAt == photoViewer.V1.M) {
                    childAt.measure(i11, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m), TLObject.FLAG_30));
                } else {
                    pq0Var.measureChildWithMargins(childAt, i11, 0, i10, 0);
                }
            }
            i16++;
            z9 = true;
            pq0Var = this;
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
