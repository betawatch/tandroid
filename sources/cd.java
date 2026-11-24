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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class cd extends LinearLayout implements tjb {
    public boolean a;
    public final lm b;
    public final Paint c;
    public final /* synthetic */ hd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd(hd hdVar, Context context) {
        super(context);
        this.d = hdVar;
        lm lmVar = new lm();
        lmVar.f = (short) 0;
        lmVar.g = 200L;
        lmVar.h = s33.f;
        lmVar.a = this;
        lmVar.d = 0.0f;
        lmVar.c = 0.0f;
        lmVar.e = false;
        this.b = lmVar;
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
        hd hdVar = this.d;
        if (hdVar.U0) {
            if (hdVar.g0 != 3 || hdVar.r == null) {
                L = gl.L(20.0f);
                rectF = gl.P;
                rectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            } else {
                L = gl.L(18.0f);
                float scaleX = hdVar.r.getScaleX() * hdVar.r.getWidth();
                float scaleY = hdVar.r.getScaleY() * hdVar.r.getHeight();
                rectF = gl.P;
                rectF.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            }
            float e = this.b.e(false, hdVar.G0 != null ? 1.0f : 0.0f);
            Paint paint = hdVar.G0;
            if (paint != null) {
                paint.setAlpha((int) (e * 255.0f));
                canvas.drawRoundRect(rectF, L, L, hdVar.G0);
            }
            if (hdVar.H0 == null) {
                Paint paint2 = new Paint(1);
                hdVar.H0 = paint2;
                paint2.setColor(bm2.o(-16777216, (int) (hdVar.R0 * 255.0f)));
            }
            canvas.drawRoundRect(rectF, L, L, hdVar.H0);
            int i = hdVar.V0;
            Paint paint3 = this.c;
            paint3.setColor(i);
            paint3.setAlpha((int) ((((hdVar.C0 - 1.0f) * e) + 1.0f) * paint3.getAlpha()));
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
        hd hdVar = this.d;
        if (!hdVar.I) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        hdVar.p();
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        hd hdVar = this.d;
        int[] iArr = hdVar.y0;
        byte b = 0;
        if (hdVar.g0 == 3) {
            int measuredWidth = ((i3 - i) - hdVar.r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i4 - i2) - hdVar.r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = hdVar.r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, hdVar.r.getMeasuredHeight() + measuredHeight);
        } else {
            xc xcVar = hdVar.w;
            if (xcVar != null) {
                if (hdVar.y == null) {
                    hdVar.y = new bd(this, b);
                    xcVar.getViewTreeObserver().addOnScrollChangedListener(hdVar.y);
                }
                hdVar.y.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = hdVar.E0;
        if (matrix == null || hdVar.F0 == null) {
            return;
        }
        matrix.reset();
        hdVar.E0.postScale(8.0f, 8.0f);
        hdVar.E0.postTranslate(-iArr[0], -iArr[1]);
        hdVar.F0.setLocalMatrix(hdVar.E0);
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
        j26 j26Var;
        ViewGroup viewGroup;
        hd hdVar = this.d;
        byte b = hdVar.g0;
        if (b == 3) {
            hdVar.r.measure(View.MeasureSpec.makeMeasureSpec(gl.L(86.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(86.0f), TLObject.FLAG_30));
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        this.a = true;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i5 = hdVar.a;
        if (i5 > 0) {
            Rect rect = hdVar.B0;
            size = rect.right + i5 + rect.left;
        }
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int f = ug8.f(48.0f, paddingLeft, TLObject.FLAG_30);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30);
        ViewGroup viewGroup2 = hdVar.u0;
        if (viewGroup2 != null) {
            int childCount = viewGroup2.getChildCount();
            int i6 = 0;
            while (true) {
                viewGroup = hdVar.u0;
                if (i6 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i6);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setMaxWidth(gl.L(ug8.D(24.0f, paddingLeft, 2)));
                }
                i6++;
            }
            viewGroup.measure(makeMeasureSpec, i2);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) hdVar.u0.getLayoutParams();
            i3 = paddingTop - ((hdVar.u0.getMeasuredHeight() + layoutParams.bottomMargin) + layoutParams.topMargin);
        } else {
            i3 = paddingTop;
        }
        wla wlaVar = hdVar.f;
        if (wlaVar != null) {
            wlaVar.measure(f, i2);
        }
        FrameLayout frameLayout = hdVar.s;
        if (frameLayout != null) {
            frameLayout.measure(f, i2);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) hdVar.s.getLayoutParams();
            i3 -= (hdVar.s.getMeasuredHeight() + layoutParams2.bottomMargin) + layoutParams2.topMargin;
        }
        TextView textView = hdVar.h;
        if (textView != null) {
            textView.measure(f, i2);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) hdVar.h.getLayoutParams();
            i3 -= (hdVar.h.getMeasuredHeight() + layoutParams3.bottomMargin) + layoutParams3.topMargin;
        }
        ry8 ry8Var = hdVar.l0;
        if (ry8Var != null) {
            ry8Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(hdVar.b0), TLObject.FLAG_30));
            i3 -= hdVar.l0.getMeasuredHeight();
        }
        View view = hdVar.W;
        if (view != null) {
            float f2 = hdVar.P0;
            if (f2 >= 0.0f) {
                float f3 = size;
                if (f2 == 0.0f) {
                    f3 /= 936.0f;
                    f2 = 354.0f;
                }
                int i7 = (int) (f3 * f2);
                view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30));
                hdVar.W.getLayoutParams().height = i7;
            } else {
                view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i2);
            }
            i3 -= hdVar.W.getMeasuredHeight();
        }
        byte b2 = 8;
        if (b == 0) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) hdVar.w.getLayoutParams();
            if (hdVar.b != null) {
                layoutParams4.topMargin = (hdVar.f == null && hdVar.n.getVisibility() == 8 && hdVar.Q == null) ? gl.L(16.0f) : 0;
                layoutParams4.bottomMargin = hdVar.u0 == null ? gl.L(8.0f) : 0;
            } else if (hdVar.Q != null) {
                layoutParams4.topMargin = (hdVar.f == null && hdVar.n.getVisibility() == 8) ? gl.L(8.0f) : 0;
                layoutParams4.bottomMargin = gl.L(8.0f);
            } else if (hdVar.n.getVisibility() == 0) {
                layoutParams4.topMargin = hdVar.f == null ? gl.L(19.0f) : 0;
                layoutParams4.bottomMargin = gl.L(20.0f);
            }
            int i8 = i3 - (layoutParams4.bottomMargin + layoutParams4.topMargin);
            hdVar.w.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i8, TLObject.FLAG_31));
            i3 = i8 - hdVar.w.getMeasuredHeight();
        } else {
            FrameLayout frameLayout2 = hdVar.r;
            if (frameLayout2 != null) {
                frameLayout2.measure(f, View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_31));
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) hdVar.r.getLayoutParams();
                measuredHeight = hdVar.r.getMeasuredHeight() + layoutParams5.bottomMargin;
                i4 = layoutParams5.topMargin;
            } else {
                bu3 bu3Var = hdVar.n;
                if (bu3Var != null) {
                    bu3Var.measure(f, View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_31));
                    if (hdVar.n.getVisibility() != 8) {
                        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) hdVar.n.getLayoutParams();
                        measuredHeight = hdVar.n.getMeasuredHeight() + layoutParams6.bottomMargin;
                        i4 = layoutParams6.topMargin;
                    }
                }
                j26Var = hdVar.v0;
                if (j26Var != null) {
                    j26Var.measure(f, View.MeasureSpec.makeMeasureSpec(gl.L(4.0f), TLObject.FLAG_30));
                    LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) hdVar.v0.getLayoutParams();
                    int measuredHeight2 = i3 - ((hdVar.v0.getMeasuredHeight() + layoutParams7.bottomMargin) + layoutParams7.topMargin);
                    hdVar.w0.measure(f, View.MeasureSpec.makeMeasureSpec(measuredHeight2, TLObject.FLAG_31));
                    LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) hdVar.w0.getLayoutParams();
                    i3 = measuredHeight2 - ((hdVar.w0.getMeasuredHeight() + layoutParams8.bottomMargin) + layoutParams8.topMargin);
                }
            }
            i3 -= measuredHeight + i4;
            j26Var = hdVar.v0;
            if (j26Var != null) {
            }
        }
        setMeasuredDimension(size, (getPaddingBottom() + (getPaddingTop() + (paddingTop - i3))) - (hdVar.X ? gl.L(8.0f) : 0));
        this.a = false;
        if (hdVar.M != gl.q.x) {
            gl.d3(new b1(this, b2));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        hd hdVar = this.d;
        if (hdVar.I) {
            hdVar.p();
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

    @Override // tjb
    public final void updateColors() {
        int e;
        int e2;
        hd hdVar = this.d;
        try {
            hdVar.r();
            int i = hdVar.c1;
            if (i >= 0 && (e2 = hdVar.e(i)) != hdVar.V0) {
                hdVar.V0 = e2;
                Drawable drawable = hdVar.A0;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(hdVar.V0, PorterDuff.Mode.MULTIPLY));
                }
                FrameLayout frameLayout = hdVar.r;
                if (frameLayout != null && (frameLayout.getBackground() instanceof ShapeDrawable)) {
                    bkb.A1(hdVar.V0, hdVar.r.getBackground());
                }
                cd cdVar = hdVar.b1;
                if (cdVar != null) {
                    cdVar.invalidate();
                }
            }
            j26 j26Var = hdVar.v0;
            if (j26Var != null) {
                j26Var.setProgressColor(hdVar.e(bkb.E5));
                hdVar.v0.setBackColor(hdVar.e(bkb.F5));
                hdVar.v0.invalidate();
            }
            if (hdVar.w != null && (e = hdVar.e(bkb.z5)) != hdVar.e1) {
                hdVar.e1 = e;
                gl.v3(hdVar.w, e);
            }
            if (hdVar.h1) {
                return;
            }
            wla wlaVar = hdVar.f;
            if (wlaVar != null && wlaVar.getCurrentTextColor() == hdVar.f1) {
                wla wlaVar2 = hdVar.f;
                int e3 = hdVar.e(bkb.i5);
                hdVar.f1 = e3;
                wlaVar2.setTextColor(e3);
            }
            bu3 bu3Var = hdVar.n;
            if (bu3Var == null || bu3Var.getCurrentTextColor() != hdVar.g1) {
                return;
            }
            bu3 bu3Var2 = hdVar.n;
            int e4 = hdVar.e(hdVar.X ? bkb.x6 : bkb.i5);
            hdVar.g1 = e4;
            bu3Var2.setTextColor(e4);
        } catch (Exception e5) {
            fa4.g(e5, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
