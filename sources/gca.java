// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gca extends ela {
    public boolean m0;
    public final RectF n0;
    public boolean o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public final ln v0;
    public final /* synthetic */ tca w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gca(tca tcaVar, Context context) {
        super(context, null);
        this.w0 = tcaVar;
        this.m0 = false;
        this.n0 = new RectF();
        this.I = new fca(this, this);
        gm.B(cmb.v0(cmb.g5, tcaVar.J0));
        this.v0 = new ln(this, 0L, 350L, d53.h);
    }

    @Override // ela
    public final void J(Canvas canvas, ArrayList arrayList) {
        tca tcaVar = this.w0;
        vba vbaVar = tcaVar.B1;
        r59 r59Var = tcaVar.z1;
        vba vbaVar2 = tcaVar.A1;
        if (vbaVar2.getVisibility() == 0 && vbaVar2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(vbaVar2.getX(), vbaVar2.getY());
            vbaVar2.draw(canvas);
            canvas.restore();
        }
        if (r59Var.getVisibility() == 0 && r59Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(r59Var.getX(), r59Var.getY());
            r59Var.draw(canvas);
            canvas.restore();
        }
        if (vbaVar.getVisibility() != 0 || vbaVar.getAlpha() < 0.0f) {
            return;
        }
        canvas.save();
        canvas.translate(vbaVar.getX(), vbaVar.getY());
        vbaVar.draw(canvas);
        canvas.restore();
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float paddingTop = getPaddingTop();
        tca tcaVar = this.w0;
        canvas.clipRect(0.0f, paddingTop + tcaVar.o2, getMeasuredWidth(), getMeasuredHeight() + tcaVar.o2 + gm.L(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        im0 im0Var = this.w0.P2;
        if (!(view instanceof e34) || im0Var == null) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        im0Var.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
        canvas.clipPath(im0Var.S.k);
        im0Var.draw(canvas);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    @Override // ela
    public final ylb getResourceProvider() {
        return this.w0.J0;
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gb gbVar = this.I;
        gbVar.b = this;
        gbVar.c();
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I.d();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        canvas.save();
        tca tcaVar = this.w0;
        Drawable drawable = tcaVar.M1;
        FrameLayout frameLayout = tcaVar.w1;
        canvas.translate(0.0f, tcaVar.o2);
        int L = gm.L(6.0f) + (tcaVar.k2 - tcaVar.t0) + this.p0;
        int L2 = ((tcaVar.k2 - tcaVar.t0) - gm.L(13.0f)) + this.p0;
        tcaVar.S1 = L2;
        int L3 = gm.L(60.0f) + getMeasuredHeight();
        int i = tcaVar.t0;
        int i2 = L3 + i;
        if (tcaVar.W) {
            f = 0.0f;
        } else {
            int i3 = tcaVar.B2.b;
            L += i3;
            f = this.v0.d(this.o0 && L2 + i < i3);
            L2 = gm.U1(f, L2 + i3, -i);
        }
        drawable.setBounds(0, L2, getMeasuredWidth(), i2);
        drawable.draw(canvas);
        float f2 = tcaVar.t0 + L2 + tcaVar.o2;
        if (tcaVar.r1 != f2) {
            tcaVar.r1 = f2;
            tcaVar.l1.invalidate();
        }
        if (frameLayout != null) {
            if (L2 > tcaVar.B2.b || frameLayout.getChildCount() <= 0) {
                frameLayout.setTranslationY(Math.max(0, ((L2 + tcaVar.t0) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                u31 u31Var = u31.x;
                if (u31Var != null) {
                    y21 y21Var = u31Var.e;
                    if (y21Var != null) {
                        y21Var.setTop(true);
                    }
                    u31Var.b();
                }
            }
        }
        if (f < 1.0f) {
            int L4 = gm.L(36.0f);
            float measuredWidth = (getMeasuredWidth() - L4) / 2;
            float f3 = L;
            float measuredWidth2 = (getMeasuredWidth() + L4) / 2;
            float L5 = gm.L(4.0f) + L;
            RectF rectF = this.n0;
            rectF.set(measuredWidth, f3, measuredWidth2, L5);
            cmb.s0.setColor(cmb.v0(cmb.yj, tcaVar.J0));
            cmb.s0.setAlpha((int) ((1.0f - f) * r2.getAlpha()));
            canvas.drawRoundRect(rectF, gm.L(2.0f), gm.L(2.0f), cmb.s0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        boolean z = gm.B(cmb.v0(cmb.g5, tcaVar.J0)) > 0.721f && 0.0f > ((float) tcaVar.B2.b) * 0.5f;
        if (z != ((systemUiVisibility & TLObject.FLAG_13) > 0)) {
            setSystemUiVisibility(z ? systemUiVisibility | TLObject.FLAG_13 : systemUiVisibility & (-8193));
        }
        canvas.restore();
        this.q0 = this.p0;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = this.o0;
        tca tcaVar = this.w0;
        if (z) {
            if (motionEvent.getAction() == 0 && tcaVar.k2 != 0 && motionEvent.getY() < tcaVar.k2 - gm.L(30.0f)) {
                tcaVar.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && motionEvent.getY() < this.p0 - gm.L(30.0f)) {
            tcaVar.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7  */
    @Override // ela, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        int Q = Q();
        tca tcaVar = this.w0;
        zba zbaVar = tcaVar.n1;
        int max = (tcaVar.d || Q > gm.L(20.0f) || gm.E) ? 0 : Math.max(tcaVar.B2.d, zbaVar.getEmojiPadding());
        setBottomClip(max);
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i12 = layoutParams.gravity;
                if (i12 == -1) {
                    i12 = 51;
                }
                int i13 = i12 & nm7.w1;
                int i14 = i12 & 7;
                if (i14 == 1) {
                    i5 = (((i3 - i) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i6 = layoutParams.rightMargin;
                } else if (i14 != 5) {
                    i7 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i13 == 16) {
                        if (i13 == 48) {
                            i10 = this.p0 + getPaddingTop() + layoutParams.topMargin;
                        } else if (i13 != 80) {
                            i10 = layoutParams.topMargin;
                        } else {
                            i8 = td4.f(i4, max, i2, measuredHeight3);
                            i9 = layoutParams.bottomMargin;
                        }
                        if (zbaVar != null && zbaVar.l(childAt)) {
                            if (gm.O1()) {
                                measuredHeight = getMeasuredHeight() + Q;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i10 = measuredHeight - measuredHeight2;
                        }
                        if (childAt == tcaVar.s1) {
                            i10 += tcaVar.B2.d;
                        }
                        childAt.layout(i7, i10, measuredWidth + i7, measuredHeight3 + i10);
                    } else {
                        i8 = ((((i4 - max) - (this.p0 + i2)) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i9 = layoutParams.bottomMargin;
                    }
                    i10 = i8 - i9;
                    if (zbaVar != null) {
                        if (gm.O1()) {
                        }
                        i10 = measuredHeight - measuredHeight2;
                    }
                    if (childAt == tcaVar.s1) {
                    }
                    childAt.layout(i7, i10, measuredWidth + i7, measuredHeight3 + i10);
                } else {
                    i5 = (((i3 - i) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i6 = tcaVar.u0;
                }
                i7 = i5 - i6;
                if (i13 == 16) {
                }
                i10 = i8 - i9;
                if (zbaVar != null) {
                }
                if (childAt == tcaVar.s1) {
                }
                childAt.layout(i7, i10, measuredWidth + i7, measuredHeight3 + i10);
            }
        }
        R();
        tcaVar.T0();
        tcaVar.U0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        gca gcaVar = this;
        tca tcaVar = gcaVar.w0;
        vba vbaVar = tcaVar.B1;
        FrameLayout frameLayout = tcaVar.X1;
        vba vbaVar2 = tcaVar.A1;
        r59 r59Var = tcaVar.z1;
        int size = gcaVar.getLayoutParams().height > 0 ? gcaVar.getLayoutParams().height : View.MeasureSpec.getSize(i2);
        int i4 = 0;
        tcaVar.C1.G = gcaVar.getLayoutParams().height <= 0;
        tcaVar.E1.G = gcaVar.getLayoutParams().height <= 0;
        if (!tcaVar.W) {
            gcaVar.m0 = true;
            int i5 = tcaVar.u0;
            gcaVar.setPadding(i5, tcaVar.B2.b, i5, 0);
            gcaVar.m0 = false;
        }
        int paddingTop = size - gcaVar.getPaddingTop();
        int y = hg9.y(103.0f, Math.max(2, (int) Math.ceil(Math.max(tcaVar.H1.b(), tcaVar.F1.b() - 1) / 4.0f)), gm.L(48.0f) + gm.L(103.0f)) + tcaVar.t0;
        if (r59Var.getVisibility() != 8) {
            int y2 = hg9.y(103.0f, Math.max(2, (int) Math.ceil((tcaVar.G1.b() - 1) / 4.0f)), gm.L(48.0f) + gm.L(103.0f)) + tcaVar.t0;
            if (y2 > y) {
                y = gm.U1(r59Var.getAlpha(), y, y2);
            }
        }
        int i6 = y < paddingTop ? 0 : paddingTop - ((paddingTop / 5) * 3);
        int L = gm.L((frameLayout != null ? 48 : 0) + 100) + tcaVar.B2.d;
        if (vbaVar2.getPaddingTop() != i6 || vbaVar2.getPaddingBottom() != L) {
            gcaVar.m0 = true;
            vbaVar2.setPadding(0, i6, 0, L);
            r59Var.setPadding(0, i6, 0, L);
            gcaVar.m0 = false;
        }
        if (tcaVar.d && gcaVar.getLayoutParams().height <= 0 && vbaVar.getPaddingTop() != i6) {
            gcaVar.m0 = true;
            vbaVar.setPadding(0, 0, 0, gm.L((frameLayout == null ? 0 : 48) + 60) + tcaVar.B2.d);
            gcaVar.m0 = false;
        }
        boolean z = y >= size;
        gcaVar.o0 = z;
        gcaVar.p0 = z ? 0 : size - y;
        gcaVar.m0 = true;
        tcaVar.D0(false);
        gcaVar.m0 = false;
        gcaVar.setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        int i7 = tcaVar.u0;
        FrameLayout frameLayout2 = tcaVar.t1;
        zba zbaVar = tcaVar.n1;
        int i8 = size2 - (i7 << 1);
        int Q = gcaVar.Q();
        tcaVar.I2 = Q;
        if (!zbaVar.O && Q <= gm.L(20.0f) && !zbaVar.e && !zbaVar.P) {
            gcaVar.m0 = true;
            zbaVar.j();
            gcaVar.m0 = false;
        }
        gcaVar.m0 = true;
        if (tcaVar.I2 <= gm.L(20.0f)) {
            if (!gm.E) {
                size3 -= tcaVar.d ? 0 : zbaVar.getEmojiPadding();
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30);
            }
            int i9 = zbaVar.e ? 8 : 0;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i9);
            }
            i3 = 8;
        } else {
            if (!zbaVar.m()) {
                zbaVar.j();
            }
            i3 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i10 = makeMeasureSpec;
        int i11 = size3;
        gcaVar.m0 = false;
        int childCount = gcaVar.getChildCount();
        while (i4 < childCount) {
            View childAt = gcaVar.getChildAt(i4);
            if (childAt != null && childAt.getVisibility() != i3) {
                if (!zbaVar.l(childAt)) {
                    gcaVar.measureChildWithMargins(childAt, i, 0, i10, 0);
                } else if (!gm.E && !gm.O1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i8, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (gm.O1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i8, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(200.0f), gcaVar.getPaddingTop() + (i11 - tcaVar.B2.b)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i8, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gcaVar.getPaddingTop() + (i11 - tcaVar.B2.b), TLObject.FLAG_30));
                }
            }
            i4++;
            gcaVar = this;
        }
        tcaVar.T0();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.w0.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.m0) {
            return;
        }
        super.requestLayout();
    }
}
