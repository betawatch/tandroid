package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class co0 extends st0 {
    public boolean g0;
    public final RectF h0;
    public boolean i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public final u5 p0;
    public final /* synthetic */ po0 q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co0(po0 po0Var, Context context) {
        super(context, null);
        this.q0 = po0Var;
        this.g0 = false;
        this.h0 = new RectF();
        this.I = new bo0(this, this);
        org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, po0Var.J0));
        this.p0 = new u5(this, 0L, 350L, er.h);
    }

    @Override // org.telegram.ui.Components.st0
    public final void J(Canvas canvas, ArrayList arrayList) {
        po0 po0Var = this.q0;
        rn0 rn0Var = po0Var.C1;
        uj0 uj0Var = po0Var.A1;
        rn0 rn0Var2 = po0Var.B1;
        if (rn0Var2.getVisibility() == 0 && rn0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(rn0Var2.getX(), rn0Var2.getY());
            rn0Var2.draw(canvas);
            canvas.restore();
        }
        if (uj0Var.getVisibility() == 0 && uj0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(uj0Var.getX(), uj0Var.getY());
            uj0Var.draw(canvas);
            canvas.restore();
        }
        if (rn0Var.getVisibility() != 0 || rn0Var.getAlpha() < 0.0f) {
            return;
        }
        canvas.save();
        canvas.translate(rn0Var.getX(), rn0Var.getY());
        rn0Var.draw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float paddingTop = getPaddingTop();
        po0 po0Var = this.q0;
        canvas.clipRect(0.0f, paddingTop + po0Var.p2, getMeasuredWidth(), getMeasuredHeight() + po0Var.p2 + org.telegram.messenger.g0.L(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof ly) {
            po0 po0Var = this.q0;
            if (po0Var.Q2 != null) {
                canvas.save();
                po0Var.Q2.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(po0Var.Q2.R.k);
                po0Var.Q2.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.st0
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.q0.J0;
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.i1 i1Var = this.I;
        i1Var.b = this;
        i1Var.c();
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I.d();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        canvas.save();
        po0 po0Var = this.q0;
        Drawable drawable = po0Var.N1;
        FrameLayout frameLayout = po0Var.x1;
        canvas.translate(0.0f, po0Var.p2);
        int L = org.telegram.messenger.g0.L(6.0f) + (po0Var.l2 - po0Var.t0) + this.j0;
        int L2 = ((po0Var.l2 - po0Var.t0) - org.telegram.messenger.g0.L(13.0f)) + this.j0;
        po0Var.T1 = L2;
        int L3 = org.telegram.messenger.g0.L(60.0f) + getMeasuredHeight();
        int i7 = po0Var.t0;
        int i10 = L3 + i7;
        if (po0Var.W) {
            f10 = 0.0f;
        } else {
            int i11 = po0Var.C2.b;
            L += i11;
            f10 = this.p0.d(this.i0 && L2 + i7 < i11);
            L2 = org.telegram.messenger.g0.W1(f10, L2 + i11, -i7);
        }
        drawable.setBounds(0, L2, getMeasuredWidth(), i10);
        drawable.draw(canvas);
        float f11 = po0Var.t0 + L2 + po0Var.p2;
        if (po0Var.s1 != f11) {
            po0Var.s1 = f11;
            po0Var.m1.invalidate();
        }
        if (frameLayout != null) {
            if (L2 > po0Var.C2.b || frameLayout.getChildCount() <= 0) {
                frameLayout.setTranslationY(Math.max(0, ((L2 + po0Var.t0) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                xb xbVar = xb.w;
                if (xbVar != null) {
                    cb cbVar = xbVar.e;
                    if (cbVar != null) {
                        cbVar.setTop(true);
                    }
                    xbVar.b();
                }
            }
        }
        if (f10 < 1.0f) {
            int L4 = org.telegram.messenger.g0.L(36.0f);
            float measuredWidth = (getMeasuredWidth() - L4) / 2;
            float f12 = L;
            float measuredWidth2 = (getMeasuredWidth() + L4) / 2;
            float L5 = org.telegram.messenger.g0.L(4.0f) + L;
            RectF rectF = this.h0;
            rectF.set(measuredWidth, f12, measuredWidth2, L5);
            org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.zj, po0Var.J0));
            org.telegram.ui.ActionBar.j6.t0.setAlpha((int) ((1.0f - f10) * r2.getAlpha()));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.j6.t0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        boolean z10 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, po0Var.J0)) > 0.721f && ((float) 0) > ((float) po0Var.C2.b) * 0.5f;
        if (z10 != ((systemUiVisibility & TLObject.FLAG_13) > 0)) {
            setSystemUiVisibility(z10 ? systemUiVisibility | TLObject.FLAG_13 : systemUiVisibility & (-8193));
        }
        canvas.restore();
        this.k0 = this.j0;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.i0;
        po0 po0Var = this.q0;
        if (z10) {
            if (motionEvent.getAction() == 0 && po0Var.l2 != 0 && motionEvent.getY() < po0Var.l2 - org.telegram.messenger.g0.L(30.0f)) {
                po0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && motionEvent.getY() < this.j0 - org.telegram.messenger.g0.L(30.0f)) {
            po0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    @Override // org.telegram.ui.Components.st0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        int Q = Q();
        po0 po0Var = this.q0;
        vn0 vn0Var = po0Var.o1;
        int max = (po0Var.d || Q > org.telegram.messenger.g0.L(20.0f) || org.telegram.messenger.g0.E) ? 0 : Math.max(po0Var.C2.d, vn0Var.getEmojiPadding());
        setBottomClip(max);
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i20 = layoutParams.gravity;
                if (i20 == -1) {
                    i20 = 51;
                }
                int i21 = i20 & org.telegram.messenger.ns.x1;
                int i22 = i20 & 7;
                if (i22 == 1) {
                    i13 = (((i11 - i7) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i22 != 5) {
                    i15 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i21 == 16) {
                        if (i21 == 48) {
                            i18 = this.j0 + getPaddingTop() + layoutParams.topMargin;
                        } else if (i21 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = ((i12 - max) - i10) - measuredHeight3;
                            i17 = layoutParams.bottomMargin;
                        }
                        if (vn0Var != null && vn0Var.l(childAt)) {
                            if (org.telegram.messenger.g0.Q1()) {
                                measuredHeight = getMeasuredHeight() + Q;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i18 = measuredHeight - measuredHeight2;
                        }
                        if (childAt == po0Var.t1) {
                            i18 += po0Var.C2.d;
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
                    } else {
                        i16 = ((((i12 - max) - (this.j0 + i10)) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (vn0Var != null) {
                        if (org.telegram.messenger.g0.Q1()) {
                        }
                        i18 = measuredHeight - measuredHeight2;
                    }
                    if (childAt == po0Var.t1) {
                    }
                    childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
                } else {
                    i13 = (((i11 - i7) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i14 = po0Var.u0;
                }
                i15 = i13 - i14;
                if (i21 == 16) {
                }
                i18 = i16 - i17;
                if (vn0Var != null) {
                }
                if (childAt == po0Var.t1) {
                }
                childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
            }
        }
        R();
        po0Var.Z0();
        po0.I0(po0Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        co0 co0Var = this;
        po0 po0Var = co0Var.q0;
        rn0 rn0Var = po0Var.C1;
        FrameLayout frameLayout = po0Var.Y1;
        rn0 rn0Var2 = po0Var.B1;
        uj0 uj0Var = po0Var.A1;
        int size = co0Var.getLayoutParams().height > 0 ? co0Var.getLayoutParams().height : View.MeasureSpec.getSize(i10);
        int i12 = 0;
        po0Var.D1.G = co0Var.getLayoutParams().height <= 0;
        po0Var.F1.G = co0Var.getLayoutParams().height <= 0;
        if (!po0Var.W) {
            co0Var.g0 = true;
            int i13 = po0Var.u0;
            co0Var.setPadding(i13, po0Var.C2.b, i13, 0);
            co0Var.g0 = false;
        }
        int paddingTop = size - co0Var.getPaddingTop();
        int D = org.telegram.messenger.k5.D(103.0f, Math.max(2, (int) Math.ceil(Math.max(po0Var.I1.b(), po0Var.G1.b() - 1) / 4.0f)), org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(103.0f)) + po0Var.t0;
        if (uj0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.k5.D(103.0f, Math.max(2, (int) Math.ceil((po0Var.H1.b() - 1) / 4.0f)), org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(103.0f)) + po0Var.t0;
            if (D2 > D) {
                D = org.telegram.messenger.g0.W1(uj0Var.getAlpha(), D, D2);
            }
        }
        int i14 = D < paddingTop ? 0 : paddingTop - ((paddingTop / 5) * 3);
        int L = org.telegram.messenger.g0.L((frameLayout != null ? 48 : 0) + 100) + po0Var.C2.d;
        if (rn0Var2.getPaddingTop() != i14 || rn0Var2.getPaddingBottom() != L) {
            co0Var.g0 = true;
            rn0Var2.setPadding(0, i14, 0, L);
            uj0Var.setPadding(0, i14, 0, L);
            co0Var.g0 = false;
        }
        if (po0Var.d && co0Var.getLayoutParams().height <= 0 && rn0Var.getPaddingTop() != i14) {
            co0Var.g0 = true;
            rn0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L((frameLayout == null ? 0 : 48) + 60) + po0Var.C2.d);
            co0Var.g0 = false;
        }
        boolean z10 = D >= size;
        co0Var.i0 = z10;
        co0Var.j0 = z10 ? 0 : size - D;
        co0Var.g0 = true;
        po0Var.K0(false);
        co0Var.g0 = false;
        co0Var.setMeasuredDimension(View.MeasureSpec.getSize(i7), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size2 = View.MeasureSpec.getSize(i7);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        int i15 = po0Var.u0;
        FrameLayout frameLayout2 = po0Var.u1;
        vn0 vn0Var = po0Var.o1;
        int i16 = size2 - (i15 * 2);
        int Q = co0Var.Q();
        po0Var.J2 = Q;
        if (!vn0Var.O && Q <= org.telegram.messenger.g0.L(20.0f) && !vn0Var.e && !vn0Var.P) {
            co0Var.g0 = true;
            vn0Var.j();
            co0Var.g0 = false;
        }
        co0Var.g0 = true;
        if (po0Var.J2 <= org.telegram.messenger.g0.L(20.0f)) {
            if (!org.telegram.messenger.g0.E) {
                size3 -= po0Var.d ? 0 : vn0Var.getEmojiPadding();
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30);
            }
            int i17 = vn0Var.e ? 8 : 0;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i17);
            }
            i11 = 8;
        } else {
            if (!vn0Var.m()) {
                vn0Var.j();
            }
            i11 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i18 = makeMeasureSpec;
        int i19 = size3;
        co0Var.g0 = false;
        int childCount = co0Var.getChildCount();
        while (i12 < childCount) {
            View childAt = co0Var.getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != i11) {
                if (!vn0Var.l(childAt)) {
                    co0Var.measureChildWithMargins(childAt, i7, 0, i18, 0);
                } else if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (org.telegram.messenger.g0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(200.0f), co0Var.getPaddingTop() + (i19 - po0Var.C2.b)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(co0Var.getPaddingTop() + (i19 - po0Var.C2.b), TLObject.FLAG_30));
                }
            }
            i12++;
            co0Var = this;
        }
        po0Var.Z0();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.q0.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g0) {
            return;
        }
        super.requestLayout();
    }
}
