package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class ActionBarPopupWindow$ActionBarPopupWindowLayout extends FrameLayout {
    public final HashMap E;
    public int F;
    public int G;
    public final Rect H;
    public m8 I;
    public float J;
    public final fj8 K;
    public final ScrollView L;
    public final oob M;
    public int N;
    public Drawable O;
    public boolean P;
    public View Q;
    public n8 R;
    public Rect S;
    public Path T;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public l8 e;
    public float f;
    public float h;
    public boolean n;
    public int r;
    public int s;
    public boolean w;
    public boolean x;
    public ArrayList y;

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(int i, int i2, vnb vnbVar, Context context) {
        super(context);
        this.f = 1.0f;
        this.h = 1.0f;
        this.n = false;
        this.r = jn7.d4;
        this.s = 0;
        byte b = 1;
        this.x = true;
        this.E = new HashMap();
        this.F = -1000000;
        this.G = -1000000;
        Rect rect = new Rect();
        this.H = rect;
        this.J = 1.0f;
        this.N = -1;
        if (i != 0) {
            this.O = getResources().getDrawable(i).mutate();
            setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        }
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.getPadding(rect);
            yob.h(aob.G8, vnbVar, this);
        }
        setWillNotDraw(false);
        if ((i2 & 2) > 0) {
            this.w = true;
        }
        if ((i2 & 1) > 0) {
            fj8 fj8Var = new fj8(context);
            fj8Var.a = new SparseIntArray();
            fj8Var.c = -1.0f;
            Paint paint = new Paint(1);
            fj8Var.n = paint;
            fj8Var.r = new Paint();
            fj8Var.s = 0;
            fj8Var.w = new Path();
            fj8Var.x = new RectF();
            fj8Var.y = new ArrayList();
            fj8Var.H = -1;
            fj8Var.I = new pn(null);
            fj8Var.K = -1;
            fj8Var.M = new Rect();
            fj8Var.J = vnbVar;
            fj8Var.d = new kj4(context, new g22(fj8Var, ViewConfiguration.get(context).getScaledTouchSlop(), (byte) 2));
            paint.setColor(-16777216);
            this.K = fj8Var;
            addView(fj8Var, tre.c(-2.0f, -2));
        }
        if ((i2 & 4) == 0) {
            try {
                ScrollView scrollView = new ScrollView(context);
                this.L = scrollView;
                scrollView.getViewTreeObserver().addOnScrollChangedListener(new i8(this));
                scrollView.setVerticalScrollBarEnabled(false);
                fj8 fj8Var2 = this.K;
                if (fj8Var2 != null) {
                    fj8Var2.addView(scrollView, tre.e(-2, -2, this.w ? 80 : 48));
                } else {
                    addView(scrollView, tre.c(-2.0f, -2));
                }
            } catch (Throwable th) {
                cc4.g(th, true);
            }
        }
        oob oobVar = new oob(b, context, this);
        this.M = oobVar;
        oobVar.setOrientation(1);
        ScrollView scrollView2 = this.L;
        if (scrollView2 != null) {
            scrollView2.addView(oobVar, new FrameLayout.LayoutParams(-2, -2));
            return;
        }
        fj8 fj8Var3 = this.K;
        if (fj8Var3 != null) {
            fj8Var3.addView(oobVar, tre.e(-2, -2, this.w ? 80 : 48));
        } else {
            addView(oobVar, tre.c(-2.0f, -2));
        }
    }

    public final void a(View view, LinearLayout.LayoutParams layoutParams) {
        this.M.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        this.M.addView(view);
    }

    public final int b(View view) {
        FrameLayout.LayoutParams e = tre.e(-2, -2, this.w ? 80 : 48);
        this.K.addView(view, e);
        return r2.getChildCount() - 1;
    }

    public final void c() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31);
        oob oobVar = this.M;
        oobVar.measure(makeMeasureSpec, makeMeasureSpec);
        oobVar.getMeasuredHeight();
    }

    public final void d() {
        this.M.removeAllViews();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        oob oobVar;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        float f2;
        Canvas canvas2;
        int i6;
        Rect rect;
        int i7;
        Rect rect2;
        int i8;
        boolean z2 = this.c;
        fj8 fj8Var = this.K;
        float f3 = 16.0f;
        float f4 = 1.0f;
        if (z2) {
            setTranslationX((1.0f - this.f) * getMeasuredWidth());
            View view = this.Q;
            if (view != null) {
                view.setTranslationX((1.0f - this.f) * getMeasuredWidth());
                this.Q.setAlpha(1.0f - fj8Var.b);
                float f5 = (-(this.Q.getMeasuredHeight() - hl.L(16.0f))) * fj8Var.b;
                this.Q.setTranslationY(f5);
                setTranslationY(f5);
            }
        }
        if (this.d) {
            setTranslationY((1.0f - this.h) * getMeasuredHeight());
        }
        if (this.O != null) {
            int i9 = this.F;
            ScrollView scrollView = this.L;
            int scrollY = i9 - (scrollView == null ? 0 : scrollView.getScrollY());
            int scrollY2 = this.G - (scrollView == null ? 0 : scrollView.getScrollY());
            int i10 = 0;
            while (true) {
                oobVar = this.M;
                i = 1;
                if (i10 >= oobVar.getChildCount()) {
                    z = false;
                    break;
                } else {
                    if ((oobVar.getChildAt(i10) instanceof k8) && oobVar.getChildAt(i10).getVisibility() == 0) {
                        z = true;
                        break;
                    }
                    i10++;
                }
            }
            int i11 = 0;
            while (i11 < 2 && (i11 != i || scrollY >= (-hl.L(f3)))) {
                int saveCount = canvas.getSaveCount();
                Rect rect3 = this.H;
                if (!z || this.r == 255) {
                    i2 = i11;
                    i3 = i;
                    i4 = 255;
                    i5 = -1000000;
                    f = f3;
                    f2 = f4;
                    canvas2 = canvas;
                    i6 = saveCount;
                    rect = rect3;
                    if (this.F != -1000000) {
                        canvas2.save();
                        canvas2.clipRect(0, rect.top, getMeasuredWidth(), getMeasuredHeight());
                    }
                    i7 = i3;
                } else {
                    float f6 = rect3.top;
                    float measuredWidth = getMeasuredWidth();
                    float measuredHeight = getMeasuredHeight();
                    int i12 = this.r;
                    f = f3;
                    i6 = saveCount;
                    f2 = f4;
                    rect = rect3;
                    i5 = -1000000;
                    i3 = 1;
                    i4 = jn7.d4;
                    i2 = i11;
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, f6, measuredWidth, measuredHeight, i12, 31);
                    i7 = 0;
                }
                this.O.setAlpha(i7 != 0 ? this.r : i4);
                if (this.w) {
                    int measuredHeight2 = getMeasuredHeight();
                    rect2 = hl.Q;
                    i8 = 0;
                    rect2.set(0, (int) ((f2 - this.h) * measuredHeight2), (int) (getMeasuredWidth() * this.f), measuredHeight2);
                } else {
                    if (scrollY > (-hl.L(f))) {
                        int measuredHeight3 = (int) (getMeasuredHeight() * this.h);
                        if (i2 == 0) {
                            if (fj8Var == null || !fj8Var.R) {
                                rect2 = hl.Q;
                                int L = (scrollView == null ? 0 : -scrollView.getScrollY()) + (this.F != i5 ? hl.L(f2) : 0);
                                int measuredWidth2 = (int) (getMeasuredWidth() * this.f);
                                if (this.F != i5) {
                                    measuredHeight3 = Math.min(measuredHeight3, hl.L(f) + scrollY);
                                }
                                rect2.set(0, L, measuredWidth2, measuredHeight3);
                            } else {
                                rect2 = hl.Q;
                                int measuredWidth3 = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f));
                                int L2 = (scrollView == null ? 0 : -scrollView.getScrollY()) + (this.F != i5 ? hl.L(f2) : 0);
                                int measuredWidth4 = getMeasuredWidth();
                                if (this.F != i5) {
                                    measuredHeight3 = Math.min(measuredHeight3, hl.L(f) + scrollY);
                                }
                                rect2.set(measuredWidth3, L2, measuredWidth4, measuredHeight3);
                            }
                        } else if (measuredHeight3 < scrollY2) {
                            if (this.F != i5) {
                                canvas2.restore();
                            }
                            i11 = i2 + 1;
                            i = i3;
                            f3 = f;
                            f4 = f2;
                        } else if (fj8Var == null || !fj8Var.R) {
                            rect2 = hl.Q;
                            rect2.set(0, scrollY2, (int) (getMeasuredWidth() * this.f), measuredHeight3);
                        } else {
                            rect2 = hl.Q;
                            rect2.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f)), scrollY2, getMeasuredWidth(), measuredHeight3);
                        }
                    } else if (fj8Var == null || !fj8Var.R) {
                        rect2 = hl.Q;
                        i8 = 0;
                        rect2.set(0, this.F < 0 ? 0 : -hl.L(f), (int) (getMeasuredWidth() * this.f), (int) (getMeasuredHeight() * this.h));
                    } else {
                        rect2 = hl.Q;
                        rect2.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f)), this.F < 0 ? 0 : -hl.L(f), getMeasuredWidth(), (int) (getMeasuredHeight() * this.h));
                    }
                    i8 = 0;
                }
                if (this.J != f2) {
                    Rect rect4 = this.S;
                    if (rect4 == null) {
                        rect4 = new Rect();
                        this.S = rect4;
                    }
                    int i13 = rect2.right;
                    int i14 = rect2.top;
                    rect4.set(i13, i14, i13, i14);
                    hl.V1(this.S, rect2, this.J, rect2);
                }
                this.O.setBounds(rect2);
                this.O.draw(canvas2);
                if (this.b) {
                    rect2.left += rect.left;
                    rect2.top += rect.top;
                    rect2.right -= rect.right;
                    rect2.bottom -= rect.bottom;
                    canvas2.clipRect(rect2);
                }
                if (z) {
                    canvas2.save();
                    RectF rectF = hl.P;
                    rectF.set(this.O.getBounds());
                    rectF.inset(hl.L(8.0f), hl.L(8.0f));
                    Path path = this.T;
                    if (path == null) {
                        this.T = new Path();
                    } else {
                        path.rewind();
                    }
                    this.T.addRoundRect(rectF, hl.L(12.0f), hl.L(12.0f), Path.Direction.CW);
                    canvas2.clipPath(this.T);
                    for (int i15 = i8; i15 < oobVar.getChildCount(); i15++) {
                        if ((oobVar.getChildAt(i15) instanceof k8) && oobVar.getChildAt(i15).getVisibility() == 0) {
                            canvas2.save();
                            k8 k8Var = (k8) oobVar.getChildAt(i15);
                            float f7 = 0.0f;
                            View view2 = k8Var;
                            float f8 = 0.0f;
                            while (view2 != this) {
                                f7 += view2.getX();
                                f8 += view2.getY();
                                view2 = (View) view2.getParent();
                                if (view2 == null) {
                                    break;
                                }
                            }
                            canvas2.translate(f7, (f8 * (scrollView == null ? f2 : scrollView.getScaleY())) - (scrollView == null ? i8 : scrollView.getScrollY()));
                            k8Var.draw(canvas2);
                            canvas2.restore();
                        }
                    }
                    canvas2.restore();
                }
                canvas2.restoreToCount(i6);
                i11 = i2 + 1;
                i = i3;
                f3 = f;
                f4 = f2;
            }
        }
        float f9 = f4;
        float f10 = this.J;
        if (f10 == f9) {
            super.dispatchDraw(canvas);
            return;
        }
        Rect rect5 = hl.Q;
        canvas.saveLayerAlpha(rect5.left, rect5.top, rect5.right, rect5.bottom, (int) (f10 * 255.0f), 31);
        float f11 = (this.J * 0.5f) + 0.5f;
        canvas.scale(f11, f11, rect5.right, rect5.top);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        l8 l8Var = this.e;
        if (l8Var != null) {
            l8Var.o(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e(View view) {
        if (this.x) {
            AnimatorSet animatorSet = new AnimatorSet();
            byte b = 0;
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, view.isEnabled() ? 1.0f : 0.5f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, hl.L(this.w ? 6.0f : -6.0f), 0.0f));
            animatorSet.setDuration(180L);
            animatorSet.addListener(new j8(this, animatorSet, view, b));
            animatorSet.setInterpolator(n8.m);
            animatorSet.start();
            ArrayList arrayList = this.y;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.y = arrayList;
            }
            arrayList.add(animatorSet);
        }
    }

    public final void f() {
        oob oobVar = this.M;
        int childCount = oobVar.getChildCount();
        View view = null;
        View view2 = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = oobVar.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                if (view == null) {
                    view = childAt;
                }
                view2 = childAt;
            }
        }
        boolean z = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = oobVar.getChildAt(i2);
            if (childAt2.getVisibility() == 0) {
                Object tag = childAt2.getTag(R.id.object_tag);
                if (childAt2 instanceof b8) {
                    ((b8) childAt2).m(childAt2 == view || z, childAt2 == view2);
                }
                z = tag != null;
            }
        }
    }

    public int getBackAlpha() {
        return this.r;
    }

    public float getBackScaleX() {
        return this.f;
    }

    public float getBackScaleY() {
        return this.h;
    }

    public int getBackgroundColor() {
        return this.N;
    }

    public Drawable getBackgroundDrawable() {
        return this.O;
    }

    public int getItemsCount() {
        return this.M.getChildCount();
    }

    public Rect getPadding() {
        return this.H;
    }

    public fj8 getSwipeBack() {
        return this.K;
    }

    public int getViewsCount() {
        return this.M.getChildCount();
    }

    public int getVisibleHeight() {
        return (int) (getMeasuredHeight() * this.h);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        fj8 fj8Var = this.K;
        if (fj8Var != null) {
            fj8Var.c(!this.n);
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.x = z;
    }

    public void setBackAlpha(int i) {
        if (this.r != i) {
            invalidate();
        }
        this.r = i;
    }

    public void setBackScaleX(float f) {
        if (this.f != f) {
            this.f = f;
            invalidate();
            m8 m8Var = this.I;
            if (m8Var != null) {
                m8Var.c();
            }
        }
    }

    public void setBackScaleY(float f) {
        if (this.h != f) {
            this.h = f;
            if (this.x && this.a) {
                int measuredHeight = getMeasuredHeight() - hl.L(16.0f);
                boolean z = this.w;
                HashMap hashMap = this.E;
                oob oobVar = this.M;
                if (z) {
                    for (int i = this.s; i >= 0; i--) {
                        View childAt = oobVar.getChildAt(i);
                        if (childAt != null && childAt.getVisibility() == 0 && !(childAt instanceof k8)) {
                            if (((Integer) hashMap.get(childAt)) != null) {
                                if (ik8.B(32.0f, hl.L(48.0f) * r5.intValue(), measuredHeight) > measuredHeight * f) {
                                    break;
                                }
                            }
                            this.s = i - 1;
                            e(childAt);
                        }
                    }
                } else {
                    int itemsCount = getItemsCount();
                    int i2 = 0;
                    for (int i3 = 0; i3 < itemsCount; i3++) {
                        View childAt2 = oobVar.getChildAt(i3);
                        if (childAt2.getVisibility() == 0) {
                            int measuredHeight2 = childAt2.getMeasuredHeight() + i2;
                            if (i3 >= this.s) {
                                if (((Integer) hashMap.get(childAt2)) != null && measuredHeight2 - hl.L(24.0f) > measuredHeight * f) {
                                    break;
                                }
                                this.s = i3 + 1;
                                e(childAt2);
                            }
                            i2 = measuredHeight2;
                        }
                    }
                }
            }
            invalidate();
            m8 m8Var = this.I;
            if (m8Var != null) {
                m8Var.c();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Drawable drawable;
        if (this.N == i || (drawable = this.O) == null) {
            return;
        }
        this.N = i;
        drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        this.N = -1;
        this.O = drawable;
        Rect rect = this.H;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
    }

    public void setDispatchKeyEventListener(l8 l8Var) {
        this.e = l8Var;
    }

    public void setFitItems(boolean z) {
        this.P = z;
    }

    public void setOnSizeChangedListener(m8 m8Var) {
        this.I = m8Var;
    }

    public void setParentWindow(n8 n8Var) {
        this.R = n8Var;
    }

    public void setReactionsTransitionProgress(float f) {
        this.J = f;
        invalidate();
    }

    public void setShownFromBottom(boolean z) {
        this.w = z;
    }

    public void setSwipeBackForegroundColor(int i) {
        getSwipeBack().setForegroundColor(i);
    }

    public void setTopView(View view) {
        this.Q = view;
    }

    public void setupRadialSelectors(int i) {
        oob oobVar = this.M;
        int childCount = oobVar.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = oobVar.getChildAt(i2);
            int i3 = 6;
            int i4 = i2 == 0 ? 6 : 0;
            if (i2 != childCount - 1) {
                i3 = 0;
            }
            childAt.setBackground(aob.Y(i, i4, i3));
            i2++;
        }
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(Context context, vnb vnbVar) {
        this(R.drawable.popup_fixed_alert2, 0, vnbVar, context);
    }
}
