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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gq0 extends org.telegram.ui.Components.rt0 {
    public final Paint k0;
    public boolean l0;
    public boolean m0;
    public ArrayList n0;
    public final /* synthetic */ PhotoViewer o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq0(PhotoViewer photoViewer, Activity activity, Activity activity2) {
        super(activity, activity2);
        this.o0 = photoViewer;
        Paint paint = new Paint();
        this.k0 = paint;
        setWillNotDraw(false);
        paint.setColor(855638016);
        setLayerType(2, null);
    }

    @Override // org.telegram.ui.Components.rt0, org.telegram.ui.Components.qt0
    public final void R() {
        super.R();
        PhotoViewer photoViewer = this.o0;
        if (photoViewer.s1) {
            photoViewer.X0[0].e(2, getKeyboardHeight() <= org.telegram.messenger.g0.L(20.0f) ? 1.0f : 0.0f, true);
        }
    }

    public final void X() {
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.n0 == null) {
                this.n0 = new ArrayList();
            }
            this.n0.clear();
            PhotoViewer photoViewer = this.o0;
            if (photoViewer.v4 == 1 || photoViewer.p6 == 1) {
                int measuredHeight = getMeasuredHeight();
                int measuredWidth = getMeasuredWidth();
                this.n0.add(new Rect(0, org.telegram.messenger.camera.q.y(200.0f, measuredHeight, 2), org.telegram.messenger.g0.L(100.0f), (org.telegram.messenger.g0.L(200.0f) + measuredHeight) / 2));
                this.n0.add(new Rect(measuredWidth - org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.camera.q.y(200.0f, measuredHeight, 2), measuredWidth, (org.telegram.messenger.g0.L(200.0f) + measuredHeight) / 2));
            }
            setSystemGestureExclusionRects(this.n0);
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        PhotoViewer photoViewer = this.o0;
        photoViewer.R.n(photoViewer.h0.getContext()).draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.o0;
        org.telegram.ui.Cells.t9 n4 = photoViewer.R.n(getContext());
        org.telegram.ui.Cells.u9 u9Var = n4.r;
        if (motionEvent.getAction() == 0) {
            n4.h = motionEvent.getX();
            n4.n = motionEvent.getY();
            u9Var.e = u9Var.x();
        } else if (u9Var.e && Math.abs(motionEvent.getX() - n4.h) < org.telegram.messenger.g0.e && Math.abs(motionEvent.getY() - n4.n) < org.telegram.messenger.g0.e && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            motionEvent.getX();
            motionEvent.getY();
            org.telegram.ui.Cells.u9 u9Var2 = n4.r;
            if (!u9Var2.i && u9Var2.e) {
                u9Var2.f(false);
            }
        }
        if (!photoViewer.R.x()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        photoViewer.R.n(getContext()).onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        PhotoViewer photoViewer = this.o0;
        tp0 tp0Var = photoViewer.g0;
        if (tp0Var == null || !tp0Var.y) {
            return;
        }
        int measuredHeight = ((int) ((photoViewer.b6 - 1.0f) * tp0Var.getWebView().getMeasuredHeight())) / 2;
        org.telegram.ui.Components.d51 d51Var = photoViewer.A1;
        if (d51Var != null && d51Var.j) {
            d51Var.setBounds(photoViewer.g0.getLeft(), (photoViewer.g0.getWebView().getTop() - measuredHeight) + ((int) (photoViewer.Z5 / photoViewer.b6)), photoViewer.g0.getRight(), photoViewer.g0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.Z5 / photoViewer.b6)));
            photoViewer.A1.draw(canvas);
        }
        org.telegram.ui.Components.tm0 tm0Var = photoViewer.B1;
        if (tm0Var == null || !tm0Var.a()) {
            return;
        }
        photoViewer.B1.setBounds(photoViewer.g0.getLeft(), (int) ((photoViewer.G.getAlpha() * org.telegram.messenger.g0.L(90.0f)) + org.telegram.messenger.g0.m), photoViewer.g0.getRight(), photoViewer.g0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.Z5 / photoViewer.b6)));
        photoViewer.B1.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        PhotoViewer photoViewer = this.o0;
        if (view == photoViewer.R.n(photoViewer.h0.getContext()) || view == photoViewer.t5 || view == photoViewer.A4 || view == photoViewer.B4 || view == photoViewer.Y0) {
            return false;
        }
        FrameLayout frameLayout = photoViewer.S7;
        if (view == frameLayout && frameLayout.getTranslationY() > 0.0f && photoViewer.Q0.getTranslationY() == 0.0f) {
            canvas.save();
            canvas.clipRect(photoViewer.S7.getX(), photoViewer.S7.getY(), photoViewer.S7.getX() + photoViewer.S7.getMeasuredWidth(), photoViewer.S7.getBottom());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        try {
            if (view == photoViewer.z2 || view == photoViewer.z4) {
                return false;
            }
            return super.drawChild(canvas, view, j10);
        } catch (Throwable unused) {
            return true;
        }
    }

    @Override // org.telegram.ui.Components.qt0
    public final int getBottomPadding() {
        return this.o0.Q0.getHeight();
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new x8(this, 6));
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.p7 p7Var;
        Canvas canvas2;
        Drawable[] drawableArr = PhotoViewer.V8;
        PhotoViewer photoViewer = this.o0;
        photoViewer.Y1(canvas);
        if (org.telegram.messenger.g0.m == 0 || (p7Var = photoViewer.G) == null) {
            return;
        }
        int alpha = (int) (p7Var.getAlpha() * 255.0f * 0.498f);
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
            float alpha2 = (1.0f - photoViewer.G.getAlpha()) * org.telegram.messenger.g0.N(24.0f);
            canvas2.drawRect(0.0f, (getMeasuredHeight() - getPaddingBottom()) + alpha2, getMeasuredWidth(), getMeasuredHeight() + alpha2, paint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
    @Override // org.telegram.ui.Components.rt0, org.telegram.ui.Components.qt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int paddingLeft;
        int paddingRight;
        int paddingBottom;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        qo0 qo0Var;
        int top;
        int L;
        int measuredHeight;
        int L2;
        PhotoViewer photoViewer = this.o0;
        if (photoViewer.v5 != null && photoViewer.y5 != null) {
            int L3 = (i11 - i3) - org.telegram.messenger.g0.L(20.0f);
            photoViewer.y5.setTranslationY(((-L3) / 2.0f) - org.telegram.messenger.g0.L(47.0f));
            float f10 = L3 / 2.0f;
            photoViewer.v5.setTranslationY(org.telegram.messenger.g0.L(47.0f) + f10);
            photoViewer.u5.setTranslationY(org.telegram.messenger.g0.L(47.0f) + f10);
            photoViewer.z5.setTranslationY(f10 + org.telegram.messenger.g0.L(95.0f));
        }
        int childCount = getChildCount();
        Q();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                if (childAt == photoViewer.z2) {
                    paddingLeft = i3;
                    paddingRight = i11;
                    paddingBottom = i12;
                } else {
                    paddingLeft = getPaddingLeft() + i3;
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
                int i22 = i20 & org.telegram.messenger.hs.x1;
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
                        qo0Var = photoViewer.V1;
                        if (childAt != qo0Var.N) {
                            if (childAt == photoViewer.W1.N) {
                                i18 += photoViewer.G.getMeasuredHeight();
                            } else if (qo0Var.f.l(childAt) || photoViewer.W1.f.l(childAt)) {
                                i18 = ((i12 - i10) - measuredHeight2) + ((photoViewer.s || org.telegram.messenger.g0.E) ? 0 : org.telegram.messenger.g0.n);
                            } else if (childAt == photoViewer.p1) {
                                i18 = org.telegram.messenger.g0.L(5.0f) + photoViewer.G.getMeasuredHeight();
                            } else {
                                float f11 = 40.0f;
                                if (childAt == photoViewer.f1 || childAt == photoViewer.g1 || childAt == photoViewer.h1) {
                                    FrameLayout frameLayout = photoViewer.S7;
                                    if (frameLayout == null || frameLayout.getVisibility() != 0) {
                                        top = photoViewer.Q0.getTop();
                                        if (childAt == photoViewer.g1) {
                                            top -= org.telegram.messenger.g0.L(50.0f);
                                        }
                                    } else {
                                        top = photoViewer.S7.getTop();
                                    }
                                    int i23 = photoViewer.d2;
                                    if (i23 != 4 && i23 != 5) {
                                        f11 = 15.0f;
                                    }
                                    L = org.telegram.messenger.g0.L(12.0f) + (top - org.telegram.messenger.g0.L(f11));
                                    measuredHeight = childAt.getMeasuredHeight();
                                } else {
                                    ArrayList arrayList = photoViewer.j1;
                                    if (arrayList == null || !arrayList.contains(childAt)) {
                                        ArrayList arrayList2 = photoViewer.i1;
                                        if (arrayList2 != null && arrayList2.contains(childAt)) {
                                            FrameLayout frameLayout2 = photoViewer.S7;
                                            int top2 = (frameLayout2 == null || frameLayout2.getVisibility() != 0) ? photoViewer.Q0.getTop() : photoViewer.S7.getTop();
                                            int i24 = photoViewer.d2;
                                            if (i24 != 4 && i24 != 5) {
                                                f11 = 15.0f;
                                            }
                                            L = (org.telegram.messenger.g0.L(12.0f) + (top2 - org.telegram.messenger.g0.L(f11))) - org.telegram.messenger.g0.L(36.0f);
                                            measuredHeight = childAt.getMeasuredHeight();
                                        } else if (childAt == photoViewer.S7) {
                                            i18 -= photoViewer.Q0.getHeight();
                                            if (photoViewer.d2 == 1) {
                                                L2 = org.telegram.messenger.g0.L(52.0f);
                                            } else if (photoViewer.V1.getVisibility() == 0) {
                                                L2 = org.telegram.messenger.g0.L(56.0f);
                                            }
                                            i18 -= L2;
                                        } else if (childAt == photoViewer.Y1) {
                                            L = ((paddingBottom - i10) - measuredHeight2) - layoutParams.bottomMargin;
                                            measuredHeight = photoViewer.Q0.getHeight();
                                        } else if (childAt == photoViewer.Z1 || childAt == photoViewer.R0) {
                                            i18 = photoViewer.G.getMeasuredHeight();
                                        } else if (childAt == photoViewer.S0) {
                                            L = ((paddingBottom - i10) - measuredHeight2) - layoutParams.bottomMargin;
                                            measuredHeight = photoViewer.Q0.getHeight();
                                        } else if (childAt == photoViewer.U7) {
                                            i18 = org.telegram.messenger.camera.q.w(31.0f, photoViewer.Q0.getHeight(), i18);
                                        }
                                    } else {
                                        FrameLayout frameLayout3 = photoViewer.S7;
                                        int top3 = (frameLayout3 == null || frameLayout3.getVisibility() != 0) ? photoViewer.Q0.getTop() - org.telegram.messenger.g0.L(50.0f) : photoViewer.S7.getTop();
                                        int i25 = photoViewer.d2;
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
                    qo0Var = photoViewer.V1;
                    if (childAt != qo0Var.N) {
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
                qo0Var = photoViewer.V1;
                if (childAt != qo0Var.N) {
                }
                childAt.layout(i15 + paddingLeft, i18, i15 + measuredWidth + paddingLeft, measuredHeight2 + i18);
            }
        }
        R();
        X();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        int i13;
        int q10;
        int o10;
        gq0 gq0Var = this;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        if (gq0Var.getLayoutParams().height > 0) {
            size2 = gq0Var.getLayoutParams().height;
        }
        int i14 = size2;
        gq0Var.setMeasuredDimension(size, i14);
        PhotoViewer photoViewer = gq0Var.o0;
        boolean z10 = true;
        if (!photoViewer.s1) {
            gq0Var.l0 = true;
            if (photoViewer.j2) {
                Point point = org.telegram.messenger.g0.q;
                int i15 = point.x > point.y ? 5 : 10;
                photoViewer.R1.getCurrentView().setMaxLines(i15);
                photoViewer.R1.getNextView().setMaxLines(i15);
            } else {
                photoViewer.R1.getCurrentView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                photoViewer.R1.getNextView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
            }
            gq0Var.l0 = false;
        }
        int L = photoViewer.j0.getVisibility() != 8 ? org.telegram.messenger.g0.L(48.0f) : 0;
        org.telegram.ui.Components.h20 h20Var = photoViewer.m1;
        if (h20Var == null || h20Var.getVisibility() == 8) {
            i11 = i3;
            i12 = 0;
        } else {
            ((ViewGroup.MarginLayoutParams) photoViewer.m1.getLayoutParams()).bottomMargin = L;
            i11 = i3;
            gq0Var.measureChildWithMargins(photoViewer.m1, i11, 0, i10, 0);
            int measuredHeight = photoViewer.m1.getMeasuredHeight();
            gq0Var.l0 = true;
            if (org.telegram.messenger.g0.Q1() || i14 >= size) {
                if (photoViewer.m1.getVisibility() != 0) {
                    photoViewer.m1.setVisibility(0);
                }
            } else if (photoViewer.m1.getVisibility() != 4) {
                photoViewer.m1.setVisibility(4);
            }
            gq0Var.l0 = false;
            i12 = measuredHeight;
        }
        sq0 sq0Var = photoViewer.j3;
        if (sq0Var != null) {
            sq0Var.e = size;
            sq0Var.f = i14;
        }
        int paddingLeft = size - (gq0Var.getPaddingLeft() + gq0Var.getPaddingRight());
        int paddingBottom = i14 - gq0Var.getPaddingBottom();
        int childCount = gq0Var.getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            View childAt = gq0Var.getChildAt(i16);
            if (childAt.getVisibility() != 8 && childAt != photoViewer.m1) {
                org.telegram.ui.Components.zd0 zd0Var = photoViewer.z2;
                if (childAt == zd0Var) {
                    childAt.measure(i11, View.MeasureSpec.makeMeasureSpec(gq0Var.getMeasuredHeight(), TLObject.FLAG_30));
                } else if (childAt == photoViewer.z4) {
                    if (zd0Var == null || zd0Var.getVisibility() != 0) {
                        q10 = photoViewer.D4.q();
                        o10 = photoViewer.D4.o();
                    } else {
                        View view = photoViewer.E2 ? photoViewer.D2 : photoViewer.C2;
                        q10 = view.getMeasuredWidth();
                        o10 = view.getMeasuredHeight();
                    }
                    if (q10 == 0 || o10 == 0) {
                        q10 = paddingLeft;
                        o10 = paddingBottom;
                    }
                    photoViewer.z4.measure(View.MeasureSpec.makeMeasureSpec(q10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(o10, TLObject.FLAG_30));
                } else if (photoViewer.V1.f.l(childAt) || photoViewer.W1.f.l(childAt)) {
                    if (photoViewer.s) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingBottom, TLObject.FLAG_30));
                    } else if (!org.telegram.messenger.g0.E) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height + org.telegram.messenger.g0.n, TLObject.FLAG_30));
                    } else if (org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(320.0f), paddingBottom - org.telegram.messenger.g0.m), TLObject.FLAG_30));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingBottom - org.telegram.messenger.g0.m, TLObject.FLAG_30));
                    }
                } else if (childAt == photoViewer.U1) {
                    if (photoViewer.n2) {
                        if (gq0Var.m0) {
                            i13 = L + i12;
                            int currentActionBarHeight = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m)) - i13;
                            ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i13;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, TLObject.FLAG_30));
                        }
                        i13 = L;
                        int currentActionBarHeight2 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m)) - i13;
                        ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i13;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight2, TLObject.FLAG_30));
                    } else if (!photoViewer.m1.c() || (!org.telegram.messenger.g0.Q1() && paddingBottom <= paddingLeft)) {
                        gq0Var.m0 = false;
                        i13 = L;
                        int currentActionBarHeight22 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m)) - i13;
                        ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i13;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight22, TLObject.FLAG_30));
                    } else {
                        i13 = L + i12;
                        gq0Var.m0 = z10;
                        int currentActionBarHeight222 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m)) - i13;
                        ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i13;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight222, TLObject.FLAG_30));
                    }
                } else if (childAt == photoViewer.Z1 || childAt == photoViewer.R0) {
                    childAt.measure(i11, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m), TLObject.FLAG_30));
                } else if (childAt == photoViewer.W1.N) {
                    childAt.measure(i11, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m), TLObject.FLAG_30));
                } else {
                    gq0Var.measureChildWithMargins(childAt, i11, 0, i10, 0);
                }
            }
            i16++;
            z10 = true;
            gq0Var = this;
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
