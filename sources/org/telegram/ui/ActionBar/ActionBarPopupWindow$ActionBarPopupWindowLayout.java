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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class ActionBarPopupWindow$ActionBarPopupWindowLayout extends FrameLayout {
    public final HashMap E;
    public int F;
    public int G;
    public final Rect H;
    public l8 I;
    public float J;
    public final th8 K;
    public final ScrollView L;
    public final qmb M;
    public int N;
    public Drawable O;
    public boolean P;
    public View Q;
    public m8 R;
    public Rect S;
    public Path T;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public k8 e;
    public float f;
    public float h;
    public boolean n;
    public int r;
    public int s;
    public boolean w;
    public boolean x;
    public ArrayList y;

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(int i, int i2, ylb ylbVar, Context context) {
        super(context);
        this.f = 1.0f;
        this.h = 1.0f;
        this.n = false;
        this.r = nm7.d4;
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
            setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        }
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.getPadding(rect);
            anb.h(cmb.F8, ylbVar, this);
        }
        setWillNotDraw(false);
        if ((i2 & 2) > 0) {
            this.w = true;
        }
        if ((i2 & 1) > 0) {
            th8 th8Var = new th8(context);
            th8Var.a = new SparseIntArray();
            th8Var.c = -1.0f;
            Paint paint = new Paint(1);
            th8Var.n = paint;
            th8Var.r = new Paint();
            th8Var.s = 0;
            th8Var.w = new Path();
            th8Var.x = new RectF();
            th8Var.y = new ArrayList();
            th8Var.H = -1;
            th8Var.I = new po(null);
            th8Var.K = -1;
            th8Var.M = new Rect();
            th8Var.J = ylbVar;
            th8Var.d = new lj4(context, new b32(th8Var, ViewConfiguration.get(context).getScaledTouchSlop(), (byte) 2));
            paint.setColor(-16777216);
            this.K = th8Var;
            addView(th8Var, qoe.c(-2.0f, -2));
        }
        if ((i2 & 4) == 0) {
            try {
                ScrollView scrollView = new ScrollView(context);
                this.L = scrollView;
                scrollView.getViewTreeObserver().addOnScrollChangedListener(new h8(this));
                scrollView.setVerticalScrollBarEnabled(false);
                th8 th8Var2 = this.K;
                if (th8Var2 != null) {
                    th8Var2.addView(scrollView, qoe.e(-2, -2, this.w ? 80 : 48));
                } else {
                    addView(scrollView, qoe.c(-2.0f, -2));
                }
            } catch (Throwable th) {
                fc4.g(th, true);
            }
        }
        qmb qmbVar = new qmb(b, context, this);
        this.M = qmbVar;
        qmbVar.setOrientation(1);
        ScrollView scrollView2 = this.L;
        if (scrollView2 != null) {
            scrollView2.addView(qmbVar, new FrameLayout.LayoutParams(-2, -2));
            return;
        }
        th8 th8Var3 = this.K;
        if (th8Var3 != null) {
            th8Var3.addView(qmbVar, qoe.e(-2, -2, this.w ? 80 : 48));
        } else {
            addView(qmbVar, qoe.c(-2.0f, -2));
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
        FrameLayout.LayoutParams e = qoe.e(-2, -2, this.w ? 80 : 48);
        this.K.addView(view, e);
        return r2.getChildCount() - 1;
    }

    public final void c() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31);
        qmb qmbVar = this.M;
        qmbVar.measure(makeMeasureSpec, makeMeasureSpec);
        qmbVar.getMeasuredHeight();
    }

    public final void d() {
        this.M.removeAllViews();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        qmb qmbVar;
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
        th8 th8Var = this.K;
        float f3 = 16.0f;
        float f4 = 1.0f;
        if (z2) {
            setTranslationX((1.0f - this.f) * getMeasuredWidth());
            View view = this.Q;
            if (view != null) {
                view.setTranslationX((1.0f - this.f) * getMeasuredWidth());
                this.Q.setAlpha(1.0f - th8Var.b);
                float f5 = (-(this.Q.getMeasuredHeight() - gm.L(16.0f))) * th8Var.b;
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
                qmbVar = this.M;
                i = 1;
                if (i10 >= qmbVar.getChildCount()) {
                    z = false;
                    break;
                } else {
                    if ((qmbVar.getChildAt(i10) instanceof j8) && qmbVar.getChildAt(i10).getVisibility() == 0) {
                        z = true;
                        break;
                    }
                    i10++;
                }
            }
            int i11 = 0;
            while (i11 < 2 && (i11 != i || scrollY >= (-gm.L(f3)))) {
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
                    i4 = nm7.d4;
                    i2 = i11;
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, f6, measuredWidth, measuredHeight, i12, 31);
                    i7 = 0;
                }
                this.O.setAlpha(i7 != 0 ? this.r : i4);
                if (this.w) {
                    int measuredHeight2 = getMeasuredHeight();
                    rect2 = gm.Q;
                    i8 = 0;
                    rect2.set(0, (int) ((f2 - this.h) * measuredHeight2), (int) (getMeasuredWidth() * this.f), measuredHeight2);
                } else {
                    if (scrollY > (-gm.L(f))) {
                        int measuredHeight3 = (int) (getMeasuredHeight() * this.h);
                        if (i2 == 0) {
                            if (th8Var == null || !th8Var.R) {
                                rect2 = gm.Q;
                                int L = (scrollView == null ? 0 : -scrollView.getScrollY()) + (this.F != i5 ? gm.L(f2) : 0);
                                int measuredWidth2 = (int) (getMeasuredWidth() * this.f);
                                if (this.F != i5) {
                                    measuredHeight3 = Math.min(measuredHeight3, gm.L(f) + scrollY);
                                }
                                rect2.set(0, L, measuredWidth2, measuredHeight3);
                            } else {
                                rect2 = gm.Q;
                                int measuredWidth3 = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f));
                                int L2 = (scrollView == null ? 0 : -scrollView.getScrollY()) + (this.F != i5 ? gm.L(f2) : 0);
                                int measuredWidth4 = getMeasuredWidth();
                                if (this.F != i5) {
                                    measuredHeight3 = Math.min(measuredHeight3, gm.L(f) + scrollY);
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
                        } else if (th8Var == null || !th8Var.R) {
                            rect2 = gm.Q;
                            rect2.set(0, scrollY2, (int) (getMeasuredWidth() * this.f), measuredHeight3);
                        } else {
                            rect2 = gm.Q;
                            rect2.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f)), scrollY2, getMeasuredWidth(), measuredHeight3);
                        }
                    } else if (th8Var == null || !th8Var.R) {
                        rect2 = gm.Q;
                        i8 = 0;
                        rect2.set(0, this.F < 0 ? 0 : -gm.L(f), (int) (getMeasuredWidth() * this.f), (int) (getMeasuredHeight() * this.h));
                    } else {
                        rect2 = gm.Q;
                        rect2.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f)), this.F < 0 ? 0 : -gm.L(f), getMeasuredWidth(), (int) (getMeasuredHeight() * this.h));
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
                    gm.V1(this.S, rect2, this.J, rect2);
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
                    RectF rectF = gm.P;
                    rectF.set(this.O.getBounds());
                    rectF.inset(gm.L(8.0f), gm.L(8.0f));
                    Path path = this.T;
                    if (path == null) {
                        this.T = new Path();
                    } else {
                        path.rewind();
                    }
                    this.T.addRoundRect(rectF, gm.L(12.0f), gm.L(12.0f), Path.Direction.CW);
                    canvas2.clipPath(this.T);
                    for (int i15 = i8; i15 < qmbVar.getChildCount(); i15++) {
                        if ((qmbVar.getChildAt(i15) instanceof j8) && qmbVar.getChildAt(i15).getVisibility() == 0) {
                            canvas2.save();
                            j8 j8Var = (j8) qmbVar.getChildAt(i15);
                            float f7 = 0.0f;
                            View view2 = j8Var;
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
                            j8Var.draw(canvas2);
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
        Rect rect5 = gm.Q;
        canvas.saveLayerAlpha(rect5.left, rect5.top, rect5.right, rect5.bottom, (int) (f10 * 255.0f), 31);
        float f11 = (this.J * 0.5f) + 0.5f;
        canvas.scale(f11, f11, rect5.right, rect5.top);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        k8 k8Var = this.e;
        if (k8Var != null) {
            k8Var.q(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e(View view) {
        if (this.x) {
            AnimatorSet animatorSet = new AnimatorSet();
            byte b = 0;
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, view.isEnabled() ? 1.0f : 0.5f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, gm.L(this.w ? 6.0f : -6.0f), 0.0f));
            animatorSet.setDuration(180L);
            animatorSet.addListener(new i8(this, animatorSet, view, b));
            animatorSet.setInterpolator(m8.m);
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
        qmb qmbVar = this.M;
        int childCount = qmbVar.getChildCount();
        View view = null;
        View view2 = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = qmbVar.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                if (view == null) {
                    view = childAt;
                }
                view2 = childAt;
            }
        }
        boolean z = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = qmbVar.getChildAt(i2);
            if (childAt2.getVisibility() == 0) {
                Object tag = childAt2.getTag(R.id.object_tag);
                if (childAt2 instanceof a8) {
                    ((a8) childAt2).m(childAt2 == view || z, childAt2 == view2);
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

    public th8 getSwipeBack() {
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
        th8 th8Var = this.K;
        if (th8Var != null) {
            th8Var.c(!this.n);
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
            l8 l8Var = this.I;
            if (l8Var != null) {
                l8Var.b();
            }
        }
    }

    public void setBackScaleY(float f) {
        if (this.h != f) {
            this.h = f;
            if (this.x && this.a) {
                int measuredHeight = getMeasuredHeight() - gm.L(16.0f);
                boolean z = this.w;
                HashMap hashMap = this.E;
                qmb qmbVar = this.M;
                if (z) {
                    for (int i = this.s; i >= 0; i--) {
                        View childAt = qmbVar.getChildAt(i);
                        if (childAt != null && childAt.getVisibility() == 0 && !(childAt instanceof j8)) {
                            if (((Integer) hashMap.get(childAt)) != null) {
                                if (wi8.B(32.0f, gm.L(48.0f) * r5.intValue(), measuredHeight) > measuredHeight * f) {
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
                        View childAt2 = qmbVar.getChildAt(i3);
                        if (childAt2.getVisibility() == 0) {
                            int measuredHeight2 = childAt2.getMeasuredHeight() + i2;
                            if (i3 >= this.s) {
                                if (((Integer) hashMap.get(childAt2)) != null && measuredHeight2 - gm.L(24.0f) > measuredHeight * f) {
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
            l8 l8Var = this.I;
            if (l8Var != null) {
                l8Var.b();
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

    public void setDispatchKeyEventListener(k8 k8Var) {
        this.e = k8Var;
    }

    public void setFitItems(boolean z) {
        this.P = z;
    }

    public void setOnSizeChangedListener(l8 l8Var) {
        this.I = l8Var;
    }

    public void setParentWindow(m8 m8Var) {
        this.R = m8Var;
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
        qmb qmbVar = this.M;
        int childCount = qmbVar.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = qmbVar.getChildAt(i2);
            int i3 = 6;
            int i4 = i2 == 0 ? 6 : 0;
            if (i2 != childCount - 1) {
                i3 = 0;
            }
            childAt.setBackground(cmb.Y(i, i4, i3));
            i2++;
        }
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(Context context, ylb ylbVar) {
        this(R.drawable.popup_fixed_alert2, 0, ylbVar, context);
    }
}
