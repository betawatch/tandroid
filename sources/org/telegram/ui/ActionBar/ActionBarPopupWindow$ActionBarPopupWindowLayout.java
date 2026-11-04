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
import b8.mf;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.Components.y00;
import org.telegram.ui.s51;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class ActionBarPopupWindow$ActionBarPopupWindowLayout extends FrameLayout {
    public final HashMap E;
    public int F;
    public int G;
    public final Rect H;
    public e1 I;
    public float J;
    public final xe0 K;
    public final ScrollView L;
    public final s51 M;
    public int N;
    public Drawable O;
    public boolean P;
    public View Q;
    public f1 R;
    public Rect S;
    public Path T;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public d1 e;
    public float f;
    public float h;
    public boolean n;
    public int r;
    public int s;
    public boolean w;
    public boolean x;
    public ArrayList y;

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(Context context, e6 e6Var) {
        this(R.drawable.popup_fixed_alert2, 0, context, e6Var);
    }

    public final void a(View view, LinearLayout.LayoutParams layoutParams) {
        this.M.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        this.M.addView(view);
    }

    public final int b(View view) {
        FrameLayout.LayoutParams e10 = mf.e(-2, -2, this.w ? 80 : 48);
        this.K.addView(view, e10);
        return r1.getChildCount() - 1;
    }

    public final void c() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31);
        s51 s51Var = this.M;
        s51Var.measure(makeMeasureSpec, makeMeasureSpec);
        s51Var.getMeasuredHeight();
    }

    public final void d() {
        this.M.removeAllViews();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        s51 s51Var;
        int i3;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        float f10;
        float f11;
        Canvas canvas2;
        int i14;
        Rect rect;
        int i15;
        int i16;
        boolean z11 = this.c;
        xe0 xe0Var = this.K;
        float f12 = 16.0f;
        float f13 = 1.0f;
        if (z11) {
            setTranslationX((1.0f - this.f) * getMeasuredWidth());
            View view = this.Q;
            if (view != null) {
                view.setTranslationX((1.0f - this.f) * getMeasuredWidth());
                this.Q.setAlpha(1.0f - xe0Var.b);
                float f14 = (-(this.Q.getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f))) * xe0Var.b;
                this.Q.setTranslationY(f14);
                setTranslationY(f14);
            }
        }
        if (this.d) {
            setTranslationY((1.0f - this.h) * getMeasuredHeight());
        }
        if (this.O != null) {
            int i17 = this.F;
            ScrollView scrollView = this.L;
            int scrollY = i17 - (scrollView == null ? 0 : scrollView.getScrollY());
            int scrollY2 = this.G - (scrollView == null ? 0 : scrollView.getScrollY());
            int i18 = 0;
            while (true) {
                s51Var = this.M;
                i3 = 1;
                if (i18 >= s51Var.getChildCount()) {
                    z10 = false;
                    break;
                } else {
                    if ((s51Var.getChildAt(i18) instanceof c1) && s51Var.getChildAt(i18).getVisibility() == 0) {
                        z10 = true;
                        break;
                    }
                    i18++;
                }
            }
            int i19 = 0;
            while (i19 < 2 && (i19 != i3 || scrollY >= (-org.telegram.messenger.g0.L(f12)))) {
                int saveCount = canvas.getSaveCount();
                Rect rect2 = this.H;
                if (!z10 || this.r == 255) {
                    i10 = i19;
                    i11 = i3;
                    i12 = 255;
                    i13 = -1000000;
                    f10 = f12;
                    f11 = f13;
                    canvas2 = canvas;
                    i14 = saveCount;
                    rect = rect2;
                    if (this.F != -1000000) {
                        canvas2.save();
                        canvas2.clipRect(0, rect.top, getMeasuredWidth(), getMeasuredHeight());
                    }
                    i15 = i11;
                } else {
                    float f15 = rect2.top;
                    float measuredWidth = getMeasuredWidth();
                    float measuredHeight = getMeasuredHeight();
                    int i20 = this.r;
                    f10 = f12;
                    i14 = saveCount;
                    f11 = f13;
                    rect = rect2;
                    i13 = -1000000;
                    i11 = 1;
                    i12 = hs.e4;
                    i10 = i19;
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, f15, measuredWidth, measuredHeight, i20, 31);
                    i15 = 0;
                }
                this.O.setAlpha(i15 != 0 ? this.r : i12);
                if (this.w) {
                    int measuredHeight2 = getMeasuredHeight();
                    i16 = 0;
                    org.telegram.messenger.g0.Q.set(0, (int) ((f11 - this.h) * measuredHeight2), (int) (getMeasuredWidth() * this.f), measuredHeight2);
                } else if (scrollY > (-org.telegram.messenger.g0.L(f10))) {
                    int measuredHeight3 = (int) (getMeasuredHeight() * this.h);
                    if (i10 == 0) {
                        if (xe0Var == null || !xe0Var.R) {
                            Rect rect3 = org.telegram.messenger.g0.Q;
                            int L = (scrollView == null ? 0 : -scrollView.getScrollY()) + (this.F != i13 ? org.telegram.messenger.g0.L(f11) : 0);
                            int measuredWidth2 = (int) (getMeasuredWidth() * this.f);
                            if (this.F != i13) {
                                measuredHeight3 = Math.min(measuredHeight3, org.telegram.messenger.g0.L(f10) + scrollY);
                            }
                            i16 = 0;
                            rect3.set(0, L, measuredWidth2, measuredHeight3);
                        } else {
                            Rect rect4 = org.telegram.messenger.g0.Q;
                            int measuredWidth3 = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f));
                            int L2 = (scrollView == null ? 0 : -scrollView.getScrollY()) + (this.F != i13 ? org.telegram.messenger.g0.L(f11) : 0);
                            int measuredWidth4 = getMeasuredWidth();
                            if (this.F != i13) {
                                measuredHeight3 = Math.min(measuredHeight3, org.telegram.messenger.g0.L(f10) + scrollY);
                            }
                            rect4.set(measuredWidth3, L2, measuredWidth4, measuredHeight3);
                            i16 = 0;
                        }
                    } else if (measuredHeight3 < scrollY2) {
                        if (this.F != i13) {
                            canvas2.restore();
                        }
                        i19 = i10 + 1;
                        i3 = i11;
                        f12 = f10;
                        f13 = f11;
                    } else if (xe0Var == null || !xe0Var.R) {
                        i16 = 0;
                        org.telegram.messenger.g0.Q.set(0, scrollY2, (int) (getMeasuredWidth() * this.f), measuredHeight3);
                    } else {
                        org.telegram.messenger.g0.Q.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f)), scrollY2, getMeasuredWidth(), measuredHeight3);
                        i16 = 0;
                    }
                } else if (xe0Var == null || !xe0Var.R) {
                    i16 = 0;
                    org.telegram.messenger.g0.Q.set(0, this.F < 0 ? 0 : -org.telegram.messenger.g0.L(f10), (int) (getMeasuredWidth() * this.f), (int) (getMeasuredHeight() * this.h));
                } else {
                    org.telegram.messenger.g0.Q.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f)), this.F < 0 ? 0 : -org.telegram.messenger.g0.L(f10), getMeasuredWidth(), (int) (getMeasuredHeight() * this.h));
                    i16 = 0;
                }
                if (this.J != f11) {
                    if (this.S == null) {
                        this.S = new Rect();
                    }
                    Rect rect5 = this.S;
                    Rect rect6 = org.telegram.messenger.g0.Q;
                    int i21 = rect6.right;
                    int i22 = rect6.top;
                    rect5.set(i21, i22, i21, i22);
                    org.telegram.messenger.g0.X1(this.S, rect6, this.J, rect6);
                }
                Drawable drawable = this.O;
                Rect rect7 = org.telegram.messenger.g0.Q;
                drawable.setBounds(rect7);
                this.O.draw(canvas2);
                if (this.b) {
                    rect7.left += rect.left;
                    rect7.top += rect.top;
                    rect7.right -= rect.right;
                    rect7.bottom -= rect.bottom;
                    canvas2.clipRect(rect7);
                }
                if (z10) {
                    canvas2.save();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(this.O.getBounds());
                    rectF.inset(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                    Path path = this.T;
                    if (path == null) {
                        this.T = new Path();
                    } else {
                        path.rewind();
                    }
                    this.T.addRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
                    canvas2.clipPath(this.T);
                    for (int i23 = i16; i23 < s51Var.getChildCount(); i23++) {
                        if ((s51Var.getChildAt(i23) instanceof c1) && s51Var.getChildAt(i23).getVisibility() == 0) {
                            canvas2.save();
                            c1 c1Var = (c1) s51Var.getChildAt(i23);
                            float f16 = 0.0f;
                            View view2 = c1Var;
                            float f17 = 0.0f;
                            while (view2 != this) {
                                f17 += view2.getX();
                                f16 += view2.getY();
                                view2 = (View) view2.getParent();
                                if (view2 == null) {
                                    break;
                                }
                            }
                            canvas2.translate(f17, (f16 * (scrollView == null ? f11 : scrollView.getScaleY())) - (scrollView == null ? i16 : scrollView.getScrollY()));
                            c1Var.draw(canvas2);
                            canvas2.restore();
                        }
                    }
                    canvas2.restore();
                }
                canvas2.restoreToCount(i14);
                i19 = i10 + 1;
                i3 = i11;
                f12 = f10;
                f13 = f11;
            }
        }
        float f18 = f13;
        float f19 = this.J;
        if (f19 == f18) {
            super.dispatchDraw(canvas);
            return;
        }
        Rect rect8 = org.telegram.messenger.g0.Q;
        canvas.saveLayerAlpha(rect8.left, rect8.top, rect8.right, rect8.bottom, (int) (f19 * 255.0f), 31);
        float f20 = (this.J * 0.5f) + 0.5f;
        canvas.scale(f20, f20, rect8.right, rect8.top);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        d1 d1Var = this.e;
        if (d1Var != null) {
            d1Var.k(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e(View view) {
        if (this.x) {
            AnimatorSet animatorSet = new AnimatorSet();
            int i3 = 1;
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, view.isEnabled() ? 1.0f : 0.5f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, org.telegram.messenger.g0.L(this.w ? 6.0f : -6.0f), 0.0f));
            animatorSet.setDuration(180L);
            animatorSet.addListener(new ei.k3(this, animatorSet, view, i3));
            animatorSet.setInterpolator(f1.m);
            animatorSet.start();
            if (this.y == null) {
                this.y = new ArrayList();
            }
            this.y.add(animatorSet);
        }
    }

    public final void f() {
        s51 s51Var = this.M;
        int childCount = s51Var.getChildCount();
        View view = null;
        View view2 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = s51Var.getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                if (view == null) {
                    view = childAt;
                }
                view2 = childAt;
            }
        }
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = s51Var.getChildAt(i10);
            if (childAt2.getVisibility() == 0) {
                Object tag = childAt2.getTag(R.id.object_tag);
                if (childAt2 instanceof y0) {
                    ((y0) childAt2).m(childAt2 == view || z10, childAt2 == view2);
                }
                z10 = tag != null;
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

    public xe0 getSwipeBack() {
        return this.K;
    }

    public int getViewsCount() {
        return this.M.getChildCount();
    }

    public int getVisibleHeight() {
        return (int) (getMeasuredHeight() * this.h);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        xe0 xe0Var = this.K;
        if (xe0Var != null) {
            xe0Var.c(!this.n);
        }
    }

    public void setAnimationEnabled(boolean z10) {
        this.x = z10;
    }

    public void setBackAlpha(int i3) {
        if (this.r != i3) {
            invalidate();
        }
        this.r = i3;
    }

    public void setBackScaleX(float f10) {
        if (this.f != f10) {
            this.f = f10;
            invalidate();
            e1 e1Var = this.I;
            if (e1Var != null) {
                e1Var.a();
            }
        }
    }

    public void setBackScaleY(float f10) {
        if (this.h != f10) {
            this.h = f10;
            if (this.x && this.a) {
                int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f);
                boolean z10 = this.w;
                HashMap hashMap = this.E;
                s51 s51Var = this.M;
                if (z10) {
                    for (int i3 = this.s; i3 >= 0; i3--) {
                        View childAt = s51Var.getChildAt(i3);
                        if (childAt != null && childAt.getVisibility() == 0 && !(childAt instanceof c1)) {
                            if (((Integer) hashMap.get(childAt)) != null) {
                                if (org.telegram.messenger.camera.q.w(32.0f, org.telegram.messenger.g0.L(48.0f) * r5.intValue(), measuredHeight) > measuredHeight * f10) {
                                    break;
                                }
                            }
                            this.s = i3 - 1;
                            e(childAt);
                        }
                    }
                } else {
                    int itemsCount = getItemsCount();
                    int i10 = 0;
                    for (int i11 = 0; i11 < itemsCount; i11++) {
                        View childAt2 = s51Var.getChildAt(i11);
                        if (childAt2.getVisibility() == 0) {
                            int measuredHeight2 = childAt2.getMeasuredHeight() + i10;
                            if (i11 >= this.s) {
                                if (((Integer) hashMap.get(childAt2)) != null && measuredHeight2 - org.telegram.messenger.g0.L(24.0f) > measuredHeight * f10) {
                                    break;
                                }
                                this.s = i11 + 1;
                                e(childAt2);
                            }
                            i10 = measuredHeight2;
                        }
                    }
                }
            }
            invalidate();
            e1 e1Var = this.I;
            if (e1Var != null) {
                e1Var.a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
        Drawable drawable;
        if (this.N == i3 || (drawable = this.O) == null) {
            return;
        }
        this.N = i3;
        drawable.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY));
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

    public void setDispatchKeyEventListener(d1 d1Var) {
        this.e = d1Var;
    }

    public void setFitItems(boolean z10) {
        this.P = z10;
    }

    public void setOnSizeChangedListener(e1 e1Var) {
        this.I = e1Var;
    }

    public void setParentWindow(f1 f1Var) {
        this.R = f1Var;
    }

    public void setReactionsTransitionProgress(float f10) {
        this.J = f10;
        invalidate();
    }

    public void setShownFromBottom(boolean z10) {
        this.w = z10;
    }

    public void setSwipeBackForegroundColor(int i3) {
        getSwipeBack().setForegroundColor(i3);
    }

    public void setTopView(View view) {
        this.Q = view;
    }

    public void setupRadialSelectors(int i3) {
        s51 s51Var = this.M;
        int childCount = s51Var.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = s51Var.getChildAt(i10);
            int i11 = 6;
            int i12 = i10 == 0 ? 6 : 0;
            if (i10 != childCount - 1) {
                i11 = 0;
            }
            childAt.setBackground(k6.a0(i3, i12, i11));
            i10++;
        }
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(int i3, int i10, Context context, e6 e6Var) {
        super(context);
        this.f = 1.0f;
        this.h = 1.0f;
        this.n = false;
        this.r = hs.e4;
        this.s = 0;
        this.x = true;
        this.E = new HashMap();
        this.F = -1000000;
        this.G = -1000000;
        Rect rect = new Rect();
        this.H = rect;
        this.J = 1.0f;
        this.N = -1;
        if (i3 != 0) {
            this.O = getResources().getDrawable(i3).mutate();
            setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        }
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.getPadding(rect);
            r6.i(k6.G8, this, e6Var);
        }
        setWillNotDraw(false);
        if ((i10 & 2) > 0) {
            this.w = true;
        }
        if ((i10 & 1) > 0) {
            xe0 xe0Var = new xe0(context);
            xe0Var.a = new SparseIntArray();
            xe0Var.c = -1.0f;
            Paint paint = new Paint(1);
            xe0Var.n = paint;
            xe0Var.r = new Paint();
            xe0Var.s = 0;
            xe0Var.w = new Path();
            xe0Var.x = new RectF();
            xe0Var.y = new ArrayList();
            xe0Var.H = -1;
            xe0Var.I = new g2.g((int[]) null);
            xe0Var.K = -1;
            xe0Var.M = new Rect();
            xe0Var.J = e6Var;
            xe0Var.d = new y00(context, new ii.a4(xe0Var, ViewConfiguration.get(context).getScaledTouchSlop(), 2));
            paint.setColor(-16777216);
            this.K = xe0Var;
            addView(xe0Var, mf.c(-2.0f, -2));
        }
        if ((i10 & 4) == 0) {
            try {
                ScrollView scrollView = new ScrollView(context);
                this.L = scrollView;
                scrollView.getViewTreeObserver().addOnScrollChangedListener(new b1(this));
                scrollView.setVerticalScrollBarEnabled(false);
                xe0 xe0Var2 = this.K;
                if (xe0Var2 != null) {
                    xe0Var2.addView(scrollView, mf.e(-2, -2, this.w ? 80 : 48));
                } else {
                    addView(scrollView, mf.c(-2.0f, -2));
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        s51 s51Var = new s51(9, context, this);
        this.M = s51Var;
        s51Var.setOrientation(1);
        ScrollView scrollView2 = this.L;
        if (scrollView2 != null) {
            scrollView2.addView(s51Var, new FrameLayout.LayoutParams(-2, -2));
            return;
        }
        xe0 xe0Var3 = this.K;
        if (xe0Var3 != null) {
            xe0Var3.addView(s51Var, mf.e(-2, -2, this.w ? 80 : 48));
        } else {
            addView(s51Var, mf.c(-2.0f, -2));
        }
    }
}
