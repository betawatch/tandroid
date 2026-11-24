// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ce extends LinearLayout implements vlb {
    public boolean a;
    public final ln b;
    public final Paint c;
    public final /* synthetic */ he d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce(he heVar, Context context) {
        super(context);
        this.d = heVar;
        ln lnVar = new ln();
        lnVar.f = (short) 0;
        lnVar.g = 200L;
        lnVar.h = d53.f;
        lnVar.a = this;
        lnVar.d = 0.0f;
        lnVar.c = 0.0f;
        lnVar.e = false;
        this.b = lnVar;
        this.c = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        float L;
        RectF rectF;
        he heVar = this.d;
        if (heVar.U0) {
            if (heVar.g0 != 3 || heVar.r == null) {
                L = gm.L(20.0f);
                rectF = gm.P;
                rectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            } else {
                L = gm.L(18.0f);
                float scaleX = heVar.r.getScaleX() * heVar.r.getWidth();
                float scaleY = heVar.r.getScaleY() * heVar.r.getHeight();
                rectF = gm.P;
                rectF.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            }
            float e = this.b.e(false, heVar.G0 != null ? 1.0f : 0.0f);
            Paint paint = heVar.G0;
            if (paint != null) {
                paint.setAlpha((int) (e * 255.0f));
                canvas.drawRoundRect(rectF, L, L, heVar.G0);
            }
            if (heVar.H0 == null) {
                Paint paint2 = new Paint(1);
                heVar.H0 = paint2;
                paint2.setColor(on2.p(-16777216, (int) (heVar.R0 * 255.0f)));
            }
            canvas.drawRoundRect(rectF, L, L, heVar.H0);
            int i = heVar.V0;
            Paint paint3 = this.c;
            paint3.setColor(i);
            paint3.setAlpha((int) ((((heVar.C0 - 1.0f) * e) + 1.0f) * paint3.getAlpha()));
            canvas.drawRoundRect(rectF, L, L, paint3);
        }
        super.draw(canvas);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        he heVar = this.d;
        if (!heVar.I) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        heVar.p();
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        he heVar = this.d;
        int[] iArr = heVar.y0;
        byte b = 0;
        if (heVar.g0 == 3) {
            int measuredWidth = ((i3 - i) - heVar.r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i4 - i2) - heVar.r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = heVar.r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, heVar.r.getMeasuredHeight() + measuredHeight);
        } else {
            xd xdVar = heVar.w;
            if (xdVar != null) {
                if (heVar.y == null) {
                    heVar.y = new be(this, b);
                    xdVar.getViewTreeObserver().addOnScrollChangedListener(heVar.y);
                }
                heVar.y.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = heVar.E0;
        if (matrix == null || heVar.F0 == null) {
            return;
        }
        matrix.reset();
        heVar.E0.postScale(8.0f, 8.0f);
        heVar.E0.postTranslate(-iArr[0], -iArr[1]);
        heVar.F0.setLocalMatrix(heVar.E0);
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0216  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        int measuredHeight;
        int i4;
        k46 k46Var;
        ViewGroup viewGroup;
        he heVar = this.d;
        byte b = heVar.g0;
        if (b == 3) {
            heVar.r.measure(View.MeasureSpec.makeMeasureSpec(gm.L(86.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(86.0f), TLObject.FLAG_30));
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        this.a = true;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i5 = heVar.a;
        if (i5 > 0) {
            Rect rect = heVar.B0;
            size = rect.right + i5 + rect.left;
        }
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int f = wi8.f(48.0f, paddingLeft, TLObject.FLAG_30);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30);
        ViewGroup viewGroup2 = heVar.u0;
        if (viewGroup2 != null) {
            int childCount = viewGroup2.getChildCount();
            int i6 = 0;
            while (true) {
                viewGroup = heVar.u0;
                if (i6 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i6);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setMaxWidth(gm.L(wi8.D(24.0f, paddingLeft, 2)));
                }
                i6++;
            }
            viewGroup.measure(makeMeasureSpec, i2);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) heVar.u0.getLayoutParams();
            i3 = paddingTop - ((heVar.u0.getMeasuredHeight() + layoutParams.bottomMargin) + layoutParams.topMargin);
        } else {
            i3 = paddingTop;
        }
        xna xnaVar = heVar.f;
        if (xnaVar != null) {
            xnaVar.measure(f, i2);
        }
        FrameLayout frameLayout = heVar.s;
        if (frameLayout != null) {
            frameLayout.measure(f, i2);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) heVar.s.getLayoutParams();
            i3 -= (heVar.s.getMeasuredHeight() + layoutParams2.bottomMargin) + layoutParams2.topMargin;
        }
        TextView textView = heVar.h;
        if (textView != null) {
            textView.measure(f, i2);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) heVar.h.getLayoutParams();
            i3 -= (heVar.h.getMeasuredHeight() + layoutParams3.bottomMargin) + layoutParams3.topMargin;
        }
        s09 s09Var = heVar.l0;
        if (s09Var != null) {
            s09Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(heVar.b0), TLObject.FLAG_30));
            i3 -= heVar.l0.getMeasuredHeight();
        }
        View view = heVar.W;
        if (view != null) {
            float f2 = heVar.P0;
            if (f2 >= 0.0f) {
                float f3 = size;
                if (f2 == 0.0f) {
                    f3 /= 936.0f;
                    f2 = 354.0f;
                }
                int i7 = (int) (f3 * f2);
                view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30));
                heVar.W.getLayoutParams().height = i7;
            } else {
                view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i2);
            }
            i3 -= heVar.W.getMeasuredHeight();
        }
        if (b == 0) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) heVar.w.getLayoutParams();
            if (heVar.b != null) {
                layoutParams4.topMargin = (heVar.f == null && heVar.n.getVisibility() == 8 && heVar.Q == null) ? gm.L(16.0f) : 0;
                layoutParams4.bottomMargin = heVar.u0 == null ? gm.L(8.0f) : 0;
            } else if (heVar.Q != null) {
                layoutParams4.topMargin = (heVar.f == null && heVar.n.getVisibility() == 8) ? gm.L(8.0f) : 0;
                layoutParams4.bottomMargin = gm.L(8.0f);
            } else if (heVar.n.getVisibility() == 0) {
                layoutParams4.topMargin = heVar.f == null ? gm.L(19.0f) : 0;
                layoutParams4.bottomMargin = gm.L(20.0f);
            }
            int i8 = i3 - (layoutParams4.bottomMargin + layoutParams4.topMargin);
            heVar.w.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i8, TLObject.FLAG_31));
            i3 = i8 - heVar.w.getMeasuredHeight();
        } else {
            FrameLayout frameLayout2 = heVar.r;
            if (frameLayout2 != null) {
                frameLayout2.measure(f, View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_31));
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) heVar.r.getLayoutParams();
                measuredHeight = heVar.r.getMeasuredHeight() + layoutParams5.bottomMargin;
                i4 = layoutParams5.topMargin;
            } else {
                mv3 mv3Var = heVar.n;
                if (mv3Var != null) {
                    mv3Var.measure(f, View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_31));
                    if (heVar.n.getVisibility() != 8) {
                        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) heVar.n.getLayoutParams();
                        measuredHeight = heVar.n.getMeasuredHeight() + layoutParams6.bottomMargin;
                        i4 = layoutParams6.topMargin;
                    }
                }
                k46Var = heVar.v0;
                if (k46Var != null) {
                    k46Var.measure(f, View.MeasureSpec.makeMeasureSpec(gm.L(4.0f), TLObject.FLAG_30));
                    LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) heVar.v0.getLayoutParams();
                    int measuredHeight2 = i3 - ((heVar.v0.getMeasuredHeight() + layoutParams7.bottomMargin) + layoutParams7.topMargin);
                    heVar.w0.measure(f, View.MeasureSpec.makeMeasureSpec(measuredHeight2, TLObject.FLAG_31));
                    LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) heVar.w0.getLayoutParams();
                    i3 = measuredHeight2 - ((heVar.w0.getMeasuredHeight() + layoutParams8.bottomMargin) + layoutParams8.topMargin);
                }
            }
            i3 -= measuredHeight + i4;
            k46Var = heVar.v0;
            if (k46Var != null) {
            }
        }
        setMeasuredDimension(size, (getPaddingBottom() + (getPaddingTop() + (paddingTop - i3))) - (heVar.X ? gm.L(8.0f) : 0));
        this.a = false;
        if (heVar.M != gm.q.x) {
            gm.c3(new b1(this, (byte) 10));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        he heVar = this.d;
        if (heVar.I) {
            heVar.p();
            return false;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a) {
            return;
        }
        super.requestLayout();
    }

    @Override // vlb
    public final void updateColors() {
        int e;
        int e2;
        he heVar = this.d;
        try {
            heVar.r();
            int i = heVar.c1;
            if (i >= 0 && (e2 = heVar.e(i)) != heVar.V0) {
                heVar.V0 = e2;
                Drawable drawable = heVar.A0;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(heVar.V0, PorterDuff.Mode.MULTIPLY));
                }
                FrameLayout frameLayout = heVar.r;
                if (frameLayout != null && (frameLayout.getBackground() instanceof ShapeDrawable)) {
                    cmb.A1(heVar.V0, heVar.r.getBackground());
                }
                ce ceVar = heVar.b1;
                if (ceVar != null) {
                    ceVar.invalidate();
                }
            }
            k46 k46Var = heVar.v0;
            if (k46Var != null) {
                k46Var.setProgressColor(heVar.e(cmb.E5));
                heVar.v0.setBackColor(heVar.e(cmb.F5));
                heVar.v0.invalidate();
            }
            if (heVar.w != null && (e = heVar.e(cmb.z5)) != heVar.e1) {
                heVar.e1 = e;
                gm.u3(heVar.w, e);
            }
            if (heVar.h1) {
                return;
            }
            xna xnaVar = heVar.f;
            if (xnaVar != null && xnaVar.getCurrentTextColor() == heVar.f1) {
                xna xnaVar2 = heVar.f;
                int e3 = heVar.e(cmb.i5);
                heVar.f1 = e3;
                xnaVar2.setTextColor(e3);
            }
            mv3 mv3Var = heVar.n;
            if (mv3Var == null || mv3Var.getCurrentTextColor() != heVar.g1) {
                return;
            }
            mv3 mv3Var2 = heVar.n;
            int e4 = heVar.e(heVar.X ? cmb.x6 : cmb.i5);
            heVar.g1 = e4;
            mv3Var2.setTextColor(e4);
        } catch (Exception e5) {
            fc4.g(e5, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
