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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class lo0 extends au0 {
    public boolean g0;
    public final RectF h0;
    public boolean i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public final c6 p0;
    public final /* synthetic */ yo0 q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo0(yo0 yo0Var, Context context) {
        super(context, null);
        this.q0 = yo0Var;
        this.g0 = false;
        this.h0 = new RectF();
        this.I = new ko0(this, this);
        org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, yo0Var.J0));
        this.p0 = new c6(this, 0L, 350L, lr.h);
    }

    @Override // org.telegram.ui.Components.au0
    public final void J(Canvas canvas, ArrayList arrayList) {
        yo0 yo0Var = this.q0;
        ao0 ao0Var = yo0Var.C1;
        ck0 ck0Var = yo0Var.A1;
        ao0 ao0Var2 = yo0Var.B1;
        if (ao0Var2.getVisibility() == 0 && ao0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(ao0Var2.getX(), ao0Var2.getY());
            ao0Var2.draw(canvas);
            canvas.restore();
        }
        if (ck0Var.getVisibility() == 0 && ck0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(ck0Var.getX(), ck0Var.getY());
            ck0Var.draw(canvas);
            canvas.restore();
        }
        if (ao0Var.getVisibility() != 0 || ao0Var.getAlpha() < 0.0f) {
            return;
        }
        canvas.save();
        canvas.translate(ao0Var.getX(), ao0Var.getY());
        ao0Var.draw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.au0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float paddingTop = getPaddingTop();
        yo0 yo0Var = this.q0;
        canvas.clipRect(0.0f, paddingTop + yo0Var.p2, getMeasuredWidth(), getMeasuredHeight() + yo0Var.p2 + org.telegram.messenger.g0.L(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof ry) {
            yo0 yo0Var = this.q0;
            if (yo0Var.Q2 != null) {
                canvas.save();
                yo0Var.Q2.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(yo0Var.Q2.R.k);
                yo0Var.Q2.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.au0
    public final org.telegram.ui.ActionBar.i6 getResourceProvider() {
        return this.q0.J0;
    }

    @Override // org.telegram.ui.Components.au0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.j1 j1Var = this.I;
        j1Var.b = this;
        j1Var.c();
    }

    @Override // org.telegram.ui.Components.au0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I.d();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        canvas.save();
        yo0 yo0Var = this.q0;
        Drawable drawable = yo0Var.N1;
        FrameLayout frameLayout = yo0Var.x1;
        canvas.translate(0.0f, yo0Var.p2);
        int L = org.telegram.messenger.g0.L(6.0f) + (yo0Var.l2 - yo0Var.t0) + this.j0;
        int L2 = ((yo0Var.l2 - yo0Var.t0) - org.telegram.messenger.g0.L(13.0f)) + this.j0;
        yo0Var.T1 = L2;
        int L3 = org.telegram.messenger.g0.L(60.0f) + getMeasuredHeight();
        int i7 = yo0Var.t0;
        int i10 = L3 + i7;
        if (yo0Var.W) {
            f10 = 0.0f;
        } else {
            int i11 = yo0Var.C2.b;
            L += i11;
            f10 = this.p0.d(this.i0 && L2 + i7 < i11);
            L2 = org.telegram.messenger.g0.W1(f10, L2 + i11, -i7);
        }
        drawable.setBounds(0, L2, getMeasuredWidth(), i10);
        drawable.draw(canvas);
        float f11 = yo0Var.t0 + L2 + yo0Var.p2;
        if (yo0Var.s1 != f11) {
            yo0Var.s1 = f11;
            yo0Var.m1.invalidate();
        }
        if (frameLayout != null) {
            if (L2 > yo0Var.C2.b || frameLayout.getChildCount() <= 0) {
                frameLayout.setTranslationY(Math.max(0, ((L2 + yo0Var.t0) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
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
            org.telegram.ui.ActionBar.n6.t0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.zj, yo0Var.J0));
            org.telegram.ui.ActionBar.n6.t0.setAlpha((int) ((1.0f - f10) * r2.getAlpha()));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.n6.t0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        boolean z10 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, yo0Var.J0)) > 0.721f && ((float) 0) > ((float) yo0Var.C2.b) * 0.5f;
        if (z10 != ((systemUiVisibility & TLObject.FLAG_13) > 0)) {
            setSystemUiVisibility(z10 ? systemUiVisibility | TLObject.FLAG_13 : systemUiVisibility & (-8193));
        }
        canvas.restore();
        this.k0 = this.j0;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.i0;
        yo0 yo0Var = this.q0;
        if (z10) {
            if (motionEvent.getAction() == 0 && yo0Var.l2 != 0 && motionEvent.getY() < yo0Var.l2 - org.telegram.messenger.g0.L(30.0f)) {
                yo0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && motionEvent.getY() < this.j0 - org.telegram.messenger.g0.L(30.0f)) {
            yo0Var.dismiss();
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
    @Override // org.telegram.ui.Components.au0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        yo0 yo0Var = this.q0;
        eo0 eo0Var = yo0Var.o1;
        int max = (yo0Var.d || Q > org.telegram.messenger.g0.L(20.0f) || org.telegram.messenger.g0.E) ? 0 : Math.max(yo0Var.C2.d, eo0Var.getEmojiPadding());
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
                int i21 = i20 & org.telegram.messenger.ks.x1;
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
                        if (eo0Var != null && eo0Var.l(childAt)) {
                            if (org.telegram.messenger.g0.Q1()) {
                                measuredHeight = getMeasuredHeight() + Q;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i18 = measuredHeight - measuredHeight2;
                        }
                        if (childAt == yo0Var.t1) {
                            i18 += yo0Var.C2.d;
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
                    } else {
                        i16 = ((((i12 - max) - (this.j0 + i10)) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (eo0Var != null) {
                        if (org.telegram.messenger.g0.Q1()) {
                        }
                        i18 = measuredHeight - measuredHeight2;
                    }
                    if (childAt == yo0Var.t1) {
                    }
                    childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
                } else {
                    i13 = (((i11 - i7) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i14 = yo0Var.u0;
                }
                i15 = i13 - i14;
                if (i21 == 16) {
                }
                i18 = i16 - i17;
                if (eo0Var != null) {
                }
                if (childAt == yo0Var.t1) {
                }
                childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
            }
        }
        R();
        yo0Var.a1();
        yo0.J0(yo0Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        lo0 lo0Var = this;
        yo0 yo0Var = lo0Var.q0;
        ao0 ao0Var = yo0Var.C1;
        FrameLayout frameLayout = yo0Var.Y1;
        ao0 ao0Var2 = yo0Var.B1;
        ck0 ck0Var = yo0Var.A1;
        int size = lo0Var.getLayoutParams().height > 0 ? lo0Var.getLayoutParams().height : View.MeasureSpec.getSize(i10);
        int i12 = 0;
        yo0Var.D1.G = lo0Var.getLayoutParams().height <= 0;
        yo0Var.F1.G = lo0Var.getLayoutParams().height <= 0;
        if (!yo0Var.W) {
            lo0Var.g0 = true;
            int i13 = yo0Var.u0;
            lo0Var.setPadding(i13, yo0Var.C2.b, i13, 0);
            lo0Var.g0 = false;
        }
        int paddingTop = size - lo0Var.getPaddingTop();
        int D = org.telegram.messenger.f3.D(103.0f, Math.max(2, (int) Math.ceil(Math.max(yo0Var.I1.b(), yo0Var.G1.b() - 1) / 4.0f)), org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(103.0f)) + yo0Var.t0;
        if (ck0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.f3.D(103.0f, Math.max(2, (int) Math.ceil((yo0Var.H1.b() - 1) / 4.0f)), org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(103.0f)) + yo0Var.t0;
            if (D2 > D) {
                D = org.telegram.messenger.g0.W1(ck0Var.getAlpha(), D, D2);
            }
        }
        int i14 = D < paddingTop ? 0 : paddingTop - ((paddingTop / 5) * 3);
        int L = org.telegram.messenger.g0.L((frameLayout != null ? 48 : 0) + 100) + yo0Var.C2.d;
        if (ao0Var2.getPaddingTop() != i14 || ao0Var2.getPaddingBottom() != L) {
            lo0Var.g0 = true;
            ao0Var2.setPadding(0, i14, 0, L);
            ck0Var.setPadding(0, i14, 0, L);
            lo0Var.g0 = false;
        }
        if (yo0Var.d && lo0Var.getLayoutParams().height <= 0 && ao0Var.getPaddingTop() != i14) {
            lo0Var.g0 = true;
            ao0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L((frameLayout == null ? 0 : 48) + 60) + yo0Var.C2.d);
            lo0Var.g0 = false;
        }
        boolean z10 = D >= size;
        lo0Var.i0 = z10;
        lo0Var.j0 = z10 ? 0 : size - D;
        lo0Var.g0 = true;
        yo0Var.L0(false);
        lo0Var.g0 = false;
        lo0Var.setMeasuredDimension(View.MeasureSpec.getSize(i7), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size2 = View.MeasureSpec.getSize(i7);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        int i15 = yo0Var.u0;
        FrameLayout frameLayout2 = yo0Var.u1;
        eo0 eo0Var = yo0Var.o1;
        int i16 = size2 - (i15 * 2);
        int Q = lo0Var.Q();
        yo0Var.J2 = Q;
        if (!eo0Var.O && Q <= org.telegram.messenger.g0.L(20.0f) && !eo0Var.e && !eo0Var.P) {
            lo0Var.g0 = true;
            eo0Var.j();
            lo0Var.g0 = false;
        }
        lo0Var.g0 = true;
        if (yo0Var.J2 <= org.telegram.messenger.g0.L(20.0f)) {
            if (!org.telegram.messenger.g0.E) {
                size3 -= yo0Var.d ? 0 : eo0Var.getEmojiPadding();
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30);
            }
            int i17 = eo0Var.e ? 8 : 0;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i17);
            }
            i11 = 8;
        } else {
            if (!eo0Var.m()) {
                eo0Var.j();
            }
            i11 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i18 = makeMeasureSpec;
        int i19 = size3;
        lo0Var.g0 = false;
        int childCount = lo0Var.getChildCount();
        while (i12 < childCount) {
            View childAt = lo0Var.getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != i11) {
                if (!eo0Var.l(childAt)) {
                    lo0Var.measureChildWithMargins(childAt, i7, 0, i18, 0);
                } else if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (org.telegram.messenger.g0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(200.0f), lo0Var.getPaddingTop() + (i19 - yo0Var.C2.b)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(lo0Var.getPaddingTop() + (i19 - yo0Var.C2.b), TLObject.FLAG_30));
                }
            }
            i12++;
            lo0Var = this;
        }
        yo0Var.a1();
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
