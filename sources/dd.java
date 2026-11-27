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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dd extends LinearLayout implements snb {
    public boolean a;
    public final mm b;
    public final Paint c;
    public final /* synthetic */ id d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd(id idVar, Context context) {
        super(context);
        this.d = idVar;
        mm mmVar = new mm();
        mmVar.f = (short) 0;
        mmVar.g = 200L;
        mmVar.h = k43.f;
        mmVar.a = this;
        mmVar.d = 0.0f;
        mmVar.c = 0.0f;
        mmVar.e = false;
        this.b = mmVar;
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
        id idVar = this.d;
        if (idVar.U0) {
            if (idVar.g0 != 3 || idVar.r == null) {
                L = hl.L(20.0f);
                rectF = hl.P;
                rectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            } else {
                L = hl.L(18.0f);
                float scaleX = idVar.r.getScaleX() * idVar.r.getWidth();
                float scaleY = idVar.r.getScaleY() * idVar.r.getHeight();
                rectF = hl.P;
                rectF.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            }
            float e = this.b.e(false, idVar.G0 != null ? 1.0f : 0.0f);
            Paint paint = idVar.G0;
            if (paint != null) {
                paint.setAlpha((int) (e * 255.0f));
                canvas.drawRoundRect(rectF, L, L, idVar.G0);
            }
            if (idVar.H0 == null) {
                Paint paint2 = new Paint(1);
                idVar.H0 = paint2;
                paint2.setColor(vm2.o(-16777216, (int) (idVar.R0 * 255.0f)));
            }
            canvas.drawRoundRect(rectF, L, L, idVar.H0);
            int i = idVar.V0;
            Paint paint3 = this.c;
            paint3.setColor(i);
            paint3.setAlpha((int) ((((idVar.C0 - 1.0f) * e) + 1.0f) * paint3.getAlpha()));
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
        id idVar = this.d;
        if (!idVar.I) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        idVar.p();
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        id idVar = this.d;
        int[] iArr = idVar.y0;
        byte b = 0;
        if (idVar.g0 == 3) {
            int measuredWidth = ((i3 - i) - idVar.r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i4 - i2) - idVar.r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = idVar.r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, idVar.r.getMeasuredHeight() + measuredHeight);
        } else {
            yc ycVar = idVar.w;
            if (ycVar != null) {
                if (idVar.y == null) {
                    idVar.y = new cd(this, b);
                    ycVar.getViewTreeObserver().addOnScrollChangedListener(idVar.y);
                }
                idVar.y.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = idVar.E0;
        if (matrix == null || idVar.F0 == null) {
            return;
        }
        matrix.reset();
        idVar.E0.postScale(8.0f, 8.0f);
        idVar.E0.postTranslate(-iArr[0], -iArr[1]);
        idVar.F0.setLocalMatrix(idVar.E0);
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
        n46 n46Var;
        ViewGroup viewGroup;
        id idVar = this.d;
        byte b = idVar.g0;
        if (b == 3) {
            idVar.r.measure(View.MeasureSpec.makeMeasureSpec(hl.L(86.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(86.0f), TLObject.FLAG_30));
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        this.a = true;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i5 = idVar.a;
        if (i5 > 0) {
            Rect rect = idVar.B0;
            size = rect.right + i5 + rect.left;
        }
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int f = ik8.f(48.0f, paddingLeft, TLObject.FLAG_30);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30);
        ViewGroup viewGroup2 = idVar.u0;
        if (viewGroup2 != null) {
            int childCount = viewGroup2.getChildCount();
            int i6 = 0;
            while (true) {
                viewGroup = idVar.u0;
                if (i6 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i6);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setMaxWidth(hl.L(ik8.D(24.0f, paddingLeft, 2)));
                }
                i6++;
            }
            viewGroup.measure(makeMeasureSpec, i2);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) idVar.u0.getLayoutParams();
            i3 = paddingTop - ((idVar.u0.getMeasuredHeight() + layoutParams.bottomMargin) + layoutParams.topMargin);
        } else {
            i3 = paddingTop;
        }
        tpa tpaVar = idVar.f;
        if (tpaVar != null) {
            tpaVar.measure(f, i2);
        }
        FrameLayout frameLayout = idVar.s;
        if (frameLayout != null) {
            frameLayout.measure(f, i2);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) idVar.s.getLayoutParams();
            i3 -= (idVar.s.getMeasuredHeight() + layoutParams2.bottomMargin) + layoutParams2.topMargin;
        }
        TextView textView = idVar.h;
        if (textView != null) {
            textView.measure(f, i2);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) idVar.h.getLayoutParams();
            i3 -= (idVar.h.getMeasuredHeight() + layoutParams3.bottomMargin) + layoutParams3.topMargin;
        }
        e29 e29Var = idVar.l0;
        if (e29Var != null) {
            e29Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(idVar.b0), TLObject.FLAG_30));
            i3 -= idVar.l0.getMeasuredHeight();
        }
        View view = idVar.W;
        if (view != null) {
            float f2 = idVar.P0;
            if (f2 >= 0.0f) {
                float f3 = size;
                if (f2 == 0.0f) {
                    f3 /= 936.0f;
                    f2 = 354.0f;
                }
                int i7 = (int) (f3 * f2);
                view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30));
                idVar.W.getLayoutParams().height = i7;
            } else {
                view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i2);
            }
            i3 -= idVar.W.getMeasuredHeight();
        }
        byte b2 = 8;
        if (b == 0) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) idVar.w.getLayoutParams();
            if (idVar.b != null) {
                layoutParams4.topMargin = (idVar.f == null && idVar.n.getVisibility() == 8 && idVar.Q == null) ? hl.L(16.0f) : 0;
                layoutParams4.bottomMargin = idVar.u0 == null ? hl.L(8.0f) : 0;
            } else if (idVar.Q != null) {
                layoutParams4.topMargin = (idVar.f == null && idVar.n.getVisibility() == 8) ? hl.L(8.0f) : 0;
                layoutParams4.bottomMargin = hl.L(8.0f);
            } else if (idVar.n.getVisibility() == 0) {
                layoutParams4.topMargin = idVar.f == null ? hl.L(19.0f) : 0;
                layoutParams4.bottomMargin = hl.L(20.0f);
            }
            int i8 = i3 - (layoutParams4.bottomMargin + layoutParams4.topMargin);
            idVar.w.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i8, TLObject.FLAG_31));
            i3 = i8 - idVar.w.getMeasuredHeight();
        } else {
            FrameLayout frameLayout2 = idVar.r;
            if (frameLayout2 != null) {
                frameLayout2.measure(f, View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_31));
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) idVar.r.getLayoutParams();
                measuredHeight = idVar.r.getMeasuredHeight() + layoutParams5.bottomMargin;
                i4 = layoutParams5.topMargin;
            } else {
                uu3 uu3Var = idVar.n;
                if (uu3Var != null) {
                    uu3Var.measure(f, View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_31));
                    if (idVar.n.getVisibility() != 8) {
                        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) idVar.n.getLayoutParams();
                        measuredHeight = idVar.n.getMeasuredHeight() + layoutParams6.bottomMargin;
                        i4 = layoutParams6.topMargin;
                    }
                }
                n46Var = idVar.v0;
                if (n46Var != null) {
                    n46Var.measure(f, View.MeasureSpec.makeMeasureSpec(hl.L(4.0f), TLObject.FLAG_30));
                    LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) idVar.v0.getLayoutParams();
                    int measuredHeight2 = i3 - ((idVar.v0.getMeasuredHeight() + layoutParams7.bottomMargin) + layoutParams7.topMargin);
                    idVar.w0.measure(f, View.MeasureSpec.makeMeasureSpec(measuredHeight2, TLObject.FLAG_31));
                    LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) idVar.w0.getLayoutParams();
                    i3 = measuredHeight2 - ((idVar.w0.getMeasuredHeight() + layoutParams8.bottomMargin) + layoutParams8.topMargin);
                }
            }
            i3 -= measuredHeight + i4;
            n46Var = idVar.v0;
            if (n46Var != null) {
            }
        }
        setMeasuredDimension(size, (getPaddingBottom() + (getPaddingTop() + (paddingTop - i3))) - (idVar.X ? hl.L(8.0f) : 0));
        this.a = false;
        if (idVar.M != hl.q.x) {
            hl.c3(new c1(this, b2));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        id idVar = this.d;
        if (idVar.I) {
            idVar.p();
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

    @Override // snb
    public final void updateColors() {
        int e;
        int e2;
        id idVar = this.d;
        try {
            idVar.r();
            int i = idVar.c1;
            if (i >= 0 && (e2 = idVar.e(i)) != idVar.V0) {
                idVar.V0 = e2;
                Drawable drawable = idVar.A0;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(idVar.V0, PorterDuff.Mode.MULTIPLY));
                }
                FrameLayout frameLayout = idVar.r;
                if (frameLayout != null && (frameLayout.getBackground() instanceof ShapeDrawable)) {
                    aob.A1(idVar.V0, idVar.r.getBackground());
                }
                dd ddVar = idVar.b1;
                if (ddVar != null) {
                    ddVar.invalidate();
                }
            }
            n46 n46Var = idVar.v0;
            if (n46Var != null) {
                n46Var.setProgressColor(idVar.e(aob.F5));
                idVar.v0.setBackColor(idVar.e(aob.G5));
                idVar.v0.invalidate();
            }
            if (idVar.w != null && (e = idVar.e(aob.A5)) != idVar.e1) {
                idVar.e1 = e;
                hl.u3(idVar.w, e);
            }
            if (idVar.h1) {
                return;
            }
            tpa tpaVar = idVar.f;
            if (tpaVar != null && tpaVar.getCurrentTextColor() == idVar.f1) {
                tpa tpaVar2 = idVar.f;
                int e3 = idVar.e(aob.j5);
                idVar.f1 = e3;
                tpaVar2.setTextColor(e3);
            }
            uu3 uu3Var = idVar.n;
            if (uu3Var == null || uu3Var.getCurrentTextColor() != idVar.g1) {
                return;
            }
            uu3 uu3Var2 = idVar.n;
            int e4 = idVar.e(idVar.X ? aob.y6 : aob.j5);
            idVar.g1 = e4;
            uu3Var2.setTextColor(e4);
        } catch (Exception e5) {
            cc4.g(e5, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
