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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gaa extends cja {
    public boolean m0;
    public final RectF n0;
    public boolean o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public final lm v0;
    public final /* synthetic */ taa w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gaa(taa taaVar, Context context) {
        super(context, null);
        this.w0 = taaVar;
        this.m0 = false;
        this.n0 = new RectF();
        this.I = new faa(this, this);
        gl.B(bkb.v0(bkb.g5, taaVar.J0));
        this.v0 = new lm(this, 0L, 350L, s33.h);
    }

    @Override // cja
    public final void J(Canvas canvas, ArrayList arrayList) {
        taa taaVar = this.w0;
        v9a v9aVar = taaVar.B1;
        o39 o39Var = taaVar.z1;
        v9a v9aVar2 = taaVar.A1;
        if (v9aVar2.getVisibility() == 0 && v9aVar2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(v9aVar2.getX(), v9aVar2.getY());
            v9aVar2.draw(canvas);
            canvas.restore();
        }
        if (o39Var.getVisibility() == 0 && o39Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(o39Var.getX(), o39Var.getY());
            o39Var.draw(canvas);
            canvas.restore();
        }
        if (v9aVar.getVisibility() != 0 || v9aVar.getAlpha() < 0.0f) {
            return;
        }
        canvas.save();
        canvas.translate(v9aVar.getX(), v9aVar.getY());
        v9aVar.draw(canvas);
        canvas.restore();
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float paddingTop = getPaddingTop();
        taa taaVar = this.w0;
        canvas.clipRect(0.0f, paddingTop + taaVar.o2, getMeasuredWidth(), getMeasuredHeight() + taaVar.o2 + gl.L(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        il0 il0Var = this.w0.P2;
        if (!(view instanceof t14) || il0Var == null) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        il0Var.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
        canvas.clipPath(il0Var.S.k);
        il0Var.draw(canvas);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    @Override // cja
    public final wjb getResourceProvider() {
        return this.w0.J0;
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gb gbVar = this.I;
        gbVar.b = this;
        gbVar.c();
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I.d();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        canvas.save();
        taa taaVar = this.w0;
        Drawable drawable = taaVar.M1;
        FrameLayout frameLayout = taaVar.w1;
        canvas.translate(0.0f, taaVar.o2);
        int L = gl.L(6.0f) + (taaVar.k2 - taaVar.t0) + this.p0;
        int L2 = ((taaVar.k2 - taaVar.t0) - gl.L(13.0f)) + this.p0;
        taaVar.S1 = L2;
        int L3 = gl.L(60.0f) + getMeasuredHeight();
        int i = taaVar.t0;
        int i2 = L3 + i;
        if (taaVar.W) {
            f = 0.0f;
        } else {
            int i3 = taaVar.B2.b;
            L += i3;
            f = this.v0.d(this.o0 && L2 + i < i3);
            L2 = gl.U1(f, L2 + i3, -i);
        }
        drawable.setBounds(0, L2, getMeasuredWidth(), i2);
        drawable.draw(canvas);
        float f2 = taaVar.t0 + L2 + taaVar.o2;
        if (taaVar.r1 != f2) {
            taaVar.r1 = f2;
            taaVar.l1.invalidate();
        }
        if (frameLayout != null) {
            if (L2 > taaVar.B2.b || frameLayout.getChildCount() <= 0) {
                frameLayout.setTranslationY(Math.max(0, ((L2 + taaVar.t0) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                m21 m21Var = m21.w;
                if (m21Var != null) {
                    q11 q11Var = m21Var.e;
                    if (q11Var != null) {
                        q11Var.setTop(true);
                    }
                    m21Var.b();
                }
            }
        }
        if (f < 1.0f) {
            int L4 = gl.L(36.0f);
            float measuredWidth = (getMeasuredWidth() - L4) / 2;
            float f3 = L;
            float measuredWidth2 = (getMeasuredWidth() + L4) / 2;
            float L5 = gl.L(4.0f) + L;
            RectF rectF = this.n0;
            rectF.set(measuredWidth, f3, measuredWidth2, L5);
            bkb.s0.setColor(bkb.v0(bkb.yj, taaVar.J0));
            bkb.s0.setAlpha((int) ((1.0f - f) * r2.getAlpha()));
            canvas.drawRoundRect(rectF, gl.L(2.0f), gl.L(2.0f), bkb.s0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        boolean z = gl.B(bkb.v0(bkb.g5, taaVar.J0)) > 0.721f && 0.0f > ((float) taaVar.B2.b) * 0.5f;
        if (z != ((systemUiVisibility & TLObject.FLAG_13) > 0)) {
            setSystemUiVisibility(z ? systemUiVisibility | TLObject.FLAG_13 : systemUiVisibility & (-8193));
        }
        canvas.restore();
        this.q0 = this.p0;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = this.o0;
        taa taaVar = this.w0;
        if (z) {
            if (motionEvent.getAction() == 0 && taaVar.k2 != 0 && motionEvent.getY() < taaVar.k2 - gl.L(30.0f)) {
                taaVar.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && motionEvent.getY() < this.p0 - gl.L(30.0f)) {
            taaVar.dismiss();
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
    @Override // cja, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        taa taaVar = this.w0;
        z9a z9aVar = taaVar.n1;
        int max = (taaVar.d || Q > gl.L(20.0f) || gl.E) ? 0 : Math.max(taaVar.B2.d, z9aVar.getEmojiPadding());
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
                int i13 = i12 & kk7.w1;
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
                            i8 = tb4.f(i4, max, i2, measuredHeight3);
                            i9 = layoutParams.bottomMargin;
                        }
                        if (z9aVar != null && z9aVar.l(childAt)) {
                            if (gl.O1()) {
                                measuredHeight = getMeasuredHeight() + Q;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i10 = measuredHeight - measuredHeight2;
                        }
                        if (childAt == taaVar.s1) {
                            i10 += taaVar.B2.d;
                        }
                        childAt.layout(i7, i10, measuredWidth + i7, measuredHeight3 + i10);
                    } else {
                        i8 = ((((i4 - max) - (this.p0 + i2)) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i9 = layoutParams.bottomMargin;
                    }
                    i10 = i8 - i9;
                    if (z9aVar != null) {
                        if (gl.O1()) {
                        }
                        i10 = measuredHeight - measuredHeight2;
                    }
                    if (childAt == taaVar.s1) {
                    }
                    childAt.layout(i7, i10, measuredWidth + i7, measuredHeight3 + i10);
                } else {
                    i5 = (((i3 - i) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i6 = taaVar.u0;
                }
                i7 = i5 - i6;
                if (i13 == 16) {
                }
                i10 = i8 - i9;
                if (z9aVar != null) {
                }
                if (childAt == taaVar.s1) {
                }
                childAt.layout(i7, i10, measuredWidth + i7, measuredHeight3 + i10);
            }
        }
        R();
        taaVar.T0();
        taaVar.U0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        gaa gaaVar = this;
        taa taaVar = gaaVar.w0;
        v9a v9aVar = taaVar.B1;
        FrameLayout frameLayout = taaVar.X1;
        v9a v9aVar2 = taaVar.A1;
        o39 o39Var = taaVar.z1;
        int size = gaaVar.getLayoutParams().height > 0 ? gaaVar.getLayoutParams().height : View.MeasureSpec.getSize(i2);
        int i4 = 0;
        taaVar.C1.G = gaaVar.getLayoutParams().height <= 0;
        taaVar.E1.G = gaaVar.getLayoutParams().height <= 0;
        if (!taaVar.W) {
            gaaVar.m0 = true;
            int i5 = taaVar.u0;
            gaaVar.setPadding(i5, taaVar.B2.b, i5, 0);
            gaaVar.m0 = false;
        }
        int paddingTop = size - gaaVar.getPaddingTop();
        int y = de9.y(103.0f, Math.max(2, (int) Math.ceil(Math.max(taaVar.H1.b(), taaVar.F1.b() - 1) / 4.0f)), gl.L(48.0f) + gl.L(103.0f)) + taaVar.t0;
        if (o39Var.getVisibility() != 8) {
            int y2 = de9.y(103.0f, Math.max(2, (int) Math.ceil((taaVar.G1.b() - 1) / 4.0f)), gl.L(48.0f) + gl.L(103.0f)) + taaVar.t0;
            if (y2 > y) {
                y = gl.U1(o39Var.getAlpha(), y, y2);
            }
        }
        int i6 = y < paddingTop ? 0 : paddingTop - ((paddingTop / 5) * 3);
        int L = gl.L((frameLayout != null ? 48 : 0) + 100) + taaVar.B2.d;
        if (v9aVar2.getPaddingTop() != i6 || v9aVar2.getPaddingBottom() != L) {
            gaaVar.m0 = true;
            v9aVar2.setPadding(0, i6, 0, L);
            o39Var.setPadding(0, i6, 0, L);
            gaaVar.m0 = false;
        }
        if (taaVar.d && gaaVar.getLayoutParams().height <= 0 && v9aVar.getPaddingTop() != i6) {
            gaaVar.m0 = true;
            v9aVar.setPadding(0, 0, 0, gl.L((frameLayout == null ? 0 : 48) + 60) + taaVar.B2.d);
            gaaVar.m0 = false;
        }
        boolean z = y >= size;
        gaaVar.o0 = z;
        gaaVar.p0 = z ? 0 : size - y;
        gaaVar.m0 = true;
        taaVar.D0(false);
        gaaVar.m0 = false;
        gaaVar.setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        int i7 = taaVar.u0;
        FrameLayout frameLayout2 = taaVar.t1;
        z9a z9aVar = taaVar.n1;
        int i8 = size2 - (i7 << 1);
        int Q = gaaVar.Q();
        taaVar.I2 = Q;
        if (!z9aVar.O && Q <= gl.L(20.0f) && !z9aVar.e && !z9aVar.P) {
            gaaVar.m0 = true;
            z9aVar.j();
            gaaVar.m0 = false;
        }
        gaaVar.m0 = true;
        if (taaVar.I2 <= gl.L(20.0f)) {
            if (!gl.E) {
                size3 -= taaVar.d ? 0 : z9aVar.getEmojiPadding();
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30);
            }
            int i9 = z9aVar.e ? 8 : 0;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i9);
            }
            i3 = 8;
        } else {
            if (!z9aVar.m()) {
                z9aVar.j();
            }
            i3 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i10 = makeMeasureSpec;
        int i11 = size3;
        gaaVar.m0 = false;
        int childCount = gaaVar.getChildCount();
        while (i4 < childCount) {
            View childAt = gaaVar.getChildAt(i4);
            if (childAt != null && childAt.getVisibility() != i3) {
                if (!z9aVar.l(childAt)) {
                    gaaVar.measureChildWithMargins(childAt, i, 0, i10, 0);
                } else if (!gl.E && !gl.O1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i8, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (gl.O1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i8, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(200.0f), gaaVar.getPaddingTop() + (i11 - taaVar.B2.b)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i8, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gaaVar.getPaddingTop() + (i11 - taaVar.B2.b), TLObject.FLAG_30));
                }
            }
            i4++;
            gaaVar = this;
        }
        taaVar.T0();
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
