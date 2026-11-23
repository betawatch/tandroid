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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class no0 extends du0 {
    public boolean g0;
    public final RectF h0;
    public boolean i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public final d6 p0;
    public final /* synthetic */ ap0 q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no0(ap0 ap0Var, Context context) {
        super(context, null);
        this.q0 = ap0Var;
        this.g0 = false;
        this.h0 = new RectF();
        this.I = new mo0(this, this);
        org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, ap0Var.J0));
        this.p0 = new d6(this, 0L, 350L, nr.h);
    }

    @Override // org.telegram.ui.Components.du0
    public final void J(Canvas canvas, ArrayList arrayList) {
        ap0 ap0Var = this.q0;
        co0 co0Var = ap0Var.C1;
        ek0 ek0Var = ap0Var.A1;
        co0 co0Var2 = ap0Var.B1;
        if (co0Var2.getVisibility() == 0 && co0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(co0Var2.getX(), co0Var2.getY());
            co0Var2.draw(canvas);
            canvas.restore();
        }
        if (ek0Var.getVisibility() == 0 && ek0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(ek0Var.getX(), ek0Var.getY());
            ek0Var.draw(canvas);
            canvas.restore();
        }
        if (co0Var.getVisibility() != 0 || co0Var.getAlpha() < 0.0f) {
            return;
        }
        canvas.save();
        canvas.translate(co0Var.getX(), co0Var.getY());
        co0Var.draw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.du0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float paddingTop = getPaddingTop();
        ap0 ap0Var = this.q0;
        canvas.clipRect(0.0f, paddingTop + ap0Var.p2, getMeasuredWidth(), getMeasuredHeight() + ap0Var.p2 + org.telegram.messenger.g0.L(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof ty) {
            ap0 ap0Var = this.q0;
            if (ap0Var.Q2 != null) {
                canvas.save();
                ap0Var.Q2.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(ap0Var.Q2.R.k);
                ap0Var.Q2.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.du0
    public final org.telegram.ui.ActionBar.h6 getResourceProvider() {
        return this.q0.J0;
    }

    @Override // org.telegram.ui.Components.du0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.i1 i1Var = this.I;
        i1Var.b = this;
        i1Var.c();
    }

    @Override // org.telegram.ui.Components.du0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I.d();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        canvas.save();
        ap0 ap0Var = this.q0;
        Drawable drawable = ap0Var.N1;
        FrameLayout frameLayout = ap0Var.x1;
        canvas.translate(0.0f, ap0Var.p2);
        int L = org.telegram.messenger.g0.L(6.0f) + (ap0Var.l2 - ap0Var.t0) + this.j0;
        int L2 = ((ap0Var.l2 - ap0Var.t0) - org.telegram.messenger.g0.L(13.0f)) + this.j0;
        ap0Var.T1 = L2;
        int L3 = org.telegram.messenger.g0.L(60.0f) + getMeasuredHeight();
        int i7 = ap0Var.t0;
        int i10 = L3 + i7;
        if (ap0Var.W) {
            f10 = 0.0f;
        } else {
            int i11 = ap0Var.C2.b;
            L += i11;
            f10 = this.p0.d(this.i0 && L2 + i7 < i11);
            L2 = org.telegram.messenger.g0.W1(f10, L2 + i11, -i7);
        }
        drawable.setBounds(0, L2, getMeasuredWidth(), i10);
        drawable.draw(canvas);
        float f11 = ap0Var.t0 + L2 + ap0Var.p2;
        if (ap0Var.s1 != f11) {
            ap0Var.s1 = f11;
            ap0Var.m1.invalidate();
        }
        if (frameLayout != null) {
            if (L2 > ap0Var.C2.b || frameLayout.getChildCount() <= 0) {
                frameLayout.setTranslationY(Math.max(0, ((L2 + ap0Var.t0) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                gc gcVar = gc.w;
                if (gcVar != null) {
                    lb lbVar = gcVar.e;
                    if (lbVar != null) {
                        lbVar.setTop(true);
                    }
                    gcVar.b();
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
            org.telegram.ui.ActionBar.m6.t0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.zj, ap0Var.J0));
            org.telegram.ui.ActionBar.m6.t0.setAlpha((int) ((1.0f - f10) * r2.getAlpha()));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.t0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        boolean z10 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, ap0Var.J0)) > 0.721f && ((float) 0) > ((float) ap0Var.C2.b) * 0.5f;
        if (z10 != ((systemUiVisibility & TLObject.FLAG_13) > 0)) {
            setSystemUiVisibility(z10 ? systemUiVisibility | TLObject.FLAG_13 : systemUiVisibility & (-8193));
        }
        canvas.restore();
        this.k0 = this.j0;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.i0;
        ap0 ap0Var = this.q0;
        if (z10) {
            if (motionEvent.getAction() == 0 && ap0Var.l2 != 0 && motionEvent.getY() < ap0Var.l2 - org.telegram.messenger.g0.L(30.0f)) {
                ap0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && motionEvent.getY() < this.j0 - org.telegram.messenger.g0.L(30.0f)) {
            ap0Var.dismiss();
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
    @Override // org.telegram.ui.Components.du0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        ap0 ap0Var = this.q0;
        go0 go0Var = ap0Var.o1;
        int max = (ap0Var.d || Q > org.telegram.messenger.g0.L(20.0f) || org.telegram.messenger.g0.E) ? 0 : Math.max(ap0Var.C2.d, go0Var.getEmojiPadding());
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
                int i21 = i20 & org.telegram.messenger.ls.x1;
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
                        if (go0Var != null && go0Var.l(childAt)) {
                            if (org.telegram.messenger.g0.Q1()) {
                                measuredHeight = getMeasuredHeight() + Q;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i18 = measuredHeight - measuredHeight2;
                        }
                        if (childAt == ap0Var.t1) {
                            i18 += ap0Var.C2.d;
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
                    } else {
                        i16 = ((((i12 - max) - (this.j0 + i10)) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (go0Var != null) {
                        if (org.telegram.messenger.g0.Q1()) {
                        }
                        i18 = measuredHeight - measuredHeight2;
                    }
                    if (childAt == ap0Var.t1) {
                    }
                    childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
                } else {
                    i13 = (((i11 - i7) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i14 = ap0Var.u0;
                }
                i15 = i13 - i14;
                if (i21 == 16) {
                }
                i18 = i16 - i17;
                if (go0Var != null) {
                }
                if (childAt == ap0Var.t1) {
                }
                childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
            }
        }
        R();
        ap0Var.a1();
        ap0.J0(ap0Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        no0 no0Var = this;
        ap0 ap0Var = no0Var.q0;
        co0 co0Var = ap0Var.C1;
        FrameLayout frameLayout = ap0Var.Y1;
        co0 co0Var2 = ap0Var.B1;
        ek0 ek0Var = ap0Var.A1;
        int size = no0Var.getLayoutParams().height > 0 ? no0Var.getLayoutParams().height : View.MeasureSpec.getSize(i10);
        int i12 = 0;
        ap0Var.D1.G = no0Var.getLayoutParams().height <= 0;
        ap0Var.F1.G = no0Var.getLayoutParams().height <= 0;
        if (!ap0Var.W) {
            no0Var.g0 = true;
            int i13 = ap0Var.u0;
            no0Var.setPadding(i13, ap0Var.C2.b, i13, 0);
            no0Var.g0 = false;
        }
        int paddingTop = size - no0Var.getPaddingTop();
        int D = org.telegram.messenger.f3.D(103.0f, Math.max(2, (int) Math.ceil(Math.max(ap0Var.I1.b(), ap0Var.G1.b() - 1) / 4.0f)), org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(103.0f)) + ap0Var.t0;
        if (ek0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.f3.D(103.0f, Math.max(2, (int) Math.ceil((ap0Var.H1.b() - 1) / 4.0f)), org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(103.0f)) + ap0Var.t0;
            if (D2 > D) {
                D = org.telegram.messenger.g0.W1(ek0Var.getAlpha(), D, D2);
            }
        }
        int i14 = D < paddingTop ? 0 : paddingTop - ((paddingTop / 5) * 3);
        int L = org.telegram.messenger.g0.L((frameLayout != null ? 48 : 0) + 100) + ap0Var.C2.d;
        if (co0Var2.getPaddingTop() != i14 || co0Var2.getPaddingBottom() != L) {
            no0Var.g0 = true;
            co0Var2.setPadding(0, i14, 0, L);
            ek0Var.setPadding(0, i14, 0, L);
            no0Var.g0 = false;
        }
        if (ap0Var.d && no0Var.getLayoutParams().height <= 0 && co0Var.getPaddingTop() != i14) {
            no0Var.g0 = true;
            co0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L((frameLayout == null ? 0 : 48) + 60) + ap0Var.C2.d);
            no0Var.g0 = false;
        }
        boolean z10 = D >= size;
        no0Var.i0 = z10;
        no0Var.j0 = z10 ? 0 : size - D;
        no0Var.g0 = true;
        ap0Var.L0(false);
        no0Var.g0 = false;
        no0Var.setMeasuredDimension(View.MeasureSpec.getSize(i7), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size2 = View.MeasureSpec.getSize(i7);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        int i15 = ap0Var.u0;
        FrameLayout frameLayout2 = ap0Var.u1;
        go0 go0Var = ap0Var.o1;
        int i16 = size2 - (i15 * 2);
        int Q = no0Var.Q();
        ap0Var.J2 = Q;
        if (!go0Var.O && Q <= org.telegram.messenger.g0.L(20.0f) && !go0Var.e && !go0Var.P) {
            no0Var.g0 = true;
            go0Var.j();
            no0Var.g0 = false;
        }
        no0Var.g0 = true;
        if (ap0Var.J2 <= org.telegram.messenger.g0.L(20.0f)) {
            if (!org.telegram.messenger.g0.E) {
                size3 -= ap0Var.d ? 0 : go0Var.getEmojiPadding();
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30);
            }
            int i17 = go0Var.e ? 8 : 0;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i17);
            }
            i11 = 8;
        } else {
            if (!go0Var.m()) {
                go0Var.j();
            }
            i11 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i18 = makeMeasureSpec;
        int i19 = size3;
        no0Var.g0 = false;
        int childCount = no0Var.getChildCount();
        while (i12 < childCount) {
            View childAt = no0Var.getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != i11) {
                if (!go0Var.l(childAt)) {
                    no0Var.measureChildWithMargins(childAt, i7, 0, i18, 0);
                } else if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (org.telegram.messenger.g0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(200.0f), no0Var.getPaddingTop() + (i19 - ap0Var.C2.b)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(no0Var.getPaddingTop() + (i19 - ap0Var.C2.b), TLObject.FLAG_30));
                }
            }
            i12++;
            no0Var = this;
        }
        ap0Var.a1();
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
