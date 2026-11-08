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
import c8.ha;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.c61;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class ActionBarPopupWindow$ActionBarPopupWindowLayout extends FrameLayout {
    public final HashMap D;
    public int E;
    public int F;
    public final Rect G;
    public f1 H;
    public float I;
    public final ve0 J;
    public final ScrollView K;
    public final c61 L;
    public int M;
    public Drawable N;
    public boolean O;
    public View P;
    public g1 Q;
    public Rect R;
    public Path S;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public e1 e;
    public float f;
    public float h;
    public boolean n;
    public int r;
    public int s;
    public boolean w;
    public boolean x;
    public ArrayList y;

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(Context context, f6 f6Var) {
        this(R.drawable.popup_fixed_alert2, 0, context, f6Var);
    }

    public final void a(View view, LinearLayout.LayoutParams layoutParams) {
        this.L.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        this.L.addView(view);
    }

    public final int b(View view) {
        FrameLayout.LayoutParams e10 = ha.e(-2, -2, this.w ? 80 : 48);
        this.J.addView(view, e10);
        return r1.getChildCount() - 1;
    }

    public final void c() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31);
        c61 c61Var = this.L;
        c61Var.measure(makeMeasureSpec, makeMeasureSpec);
        c61Var.getMeasuredHeight();
    }

    public final void d() {
        this.L.removeAllViews();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        c61 c61Var;
        int i7;
        boolean z9;
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
        boolean z10 = this.c;
        ve0 ve0Var = this.J;
        float f12 = 16.0f;
        float f13 = 1.0f;
        if (z10) {
            setTranslationX((1.0f - this.f) * getMeasuredWidth());
            View view = this.P;
            if (view != null) {
                view.setTranslationX((1.0f - this.f) * getMeasuredWidth());
                this.P.setAlpha(1.0f - ve0Var.b);
                float f14 = (-(this.P.getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f))) * ve0Var.b;
                this.P.setTranslationY(f14);
                setTranslationY(f14);
            }
        }
        if (this.d) {
            setTranslationY((1.0f - this.h) * getMeasuredHeight());
        }
        if (this.N != null) {
            int i17 = this.E;
            ScrollView scrollView = this.K;
            int scrollY = i17 - (scrollView == null ? 0 : scrollView.getScrollY());
            int scrollY2 = this.F - (scrollView == null ? 0 : scrollView.getScrollY());
            int i18 = 0;
            while (true) {
                c61Var = this.L;
                i7 = 1;
                if (i18 >= c61Var.getChildCount()) {
                    z9 = false;
                    break;
                } else {
                    if ((c61Var.getChildAt(i18) instanceof d1) && c61Var.getChildAt(i18).getVisibility() == 0) {
                        z9 = true;
                        break;
                    }
                    i18++;
                }
            }
            int i19 = 0;
            while (i19 < 2 && (i19 != i7 || scrollY >= (-org.telegram.messenger.g0.L(f12)))) {
                int saveCount = canvas.getSaveCount();
                Rect rect2 = this.G;
                if (!z9 || this.r == 255) {
                    i10 = i19;
                    i11 = i7;
                    i12 = 255;
                    i13 = -1000000;
                    f10 = f12;
                    f11 = f13;
                    canvas2 = canvas;
                    i14 = saveCount;
                    rect = rect2;
                    if (this.E != -1000000) {
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
                    i12 = qs.e4;
                    i10 = i19;
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, f15, measuredWidth, measuredHeight, i20, 31);
                    i15 = 0;
                }
                this.N.setAlpha(i15 != 0 ? this.r : i12);
                if (this.w) {
                    int measuredHeight2 = getMeasuredHeight();
                    i16 = 0;
                    org.telegram.messenger.g0.Q.set(0, (int) ((f11 - this.h) * measuredHeight2), (int) (getMeasuredWidth() * this.f), measuredHeight2);
                } else if (scrollY > (-org.telegram.messenger.g0.L(f10))) {
                    int measuredHeight3 = (int) (getMeasuredHeight() * this.h);
                    if (i10 == 0) {
                        if (ve0Var == null || !ve0Var.Q) {
                            Rect rect3 = org.telegram.messenger.g0.Q;
                            int L = (scrollView == null ? 0 : -scrollView.getScrollY()) + (this.E != i13 ? org.telegram.messenger.g0.L(f11) : 0);
                            int measuredWidth2 = (int) (getMeasuredWidth() * this.f);
                            if (this.E != i13) {
                                measuredHeight3 = Math.min(measuredHeight3, org.telegram.messenger.g0.L(f10) + scrollY);
                            }
                            i16 = 0;
                            rect3.set(0, L, measuredWidth2, measuredHeight3);
                        } else {
                            Rect rect4 = org.telegram.messenger.g0.Q;
                            int measuredWidth3 = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f));
                            int L2 = (scrollView == null ? 0 : -scrollView.getScrollY()) + (this.E != i13 ? org.telegram.messenger.g0.L(f11) : 0);
                            int measuredWidth4 = getMeasuredWidth();
                            if (this.E != i13) {
                                measuredHeight3 = Math.min(measuredHeight3, org.telegram.messenger.g0.L(f10) + scrollY);
                            }
                            rect4.set(measuredWidth3, L2, measuredWidth4, measuredHeight3);
                            i16 = 0;
                        }
                    } else if (measuredHeight3 < scrollY2) {
                        if (this.E != i13) {
                            canvas2.restore();
                        }
                        i19 = i10 + 1;
                        i7 = i11;
                        f12 = f10;
                        f13 = f11;
                    } else if (ve0Var == null || !ve0Var.Q) {
                        i16 = 0;
                        org.telegram.messenger.g0.Q.set(0, scrollY2, (int) (getMeasuredWidth() * this.f), measuredHeight3);
                    } else {
                        org.telegram.messenger.g0.Q.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f)), scrollY2, getMeasuredWidth(), measuredHeight3);
                        i16 = 0;
                    }
                } else if (ve0Var == null || !ve0Var.Q) {
                    i16 = 0;
                    org.telegram.messenger.g0.Q.set(0, this.E < 0 ? 0 : -org.telegram.messenger.g0.L(f10), (int) (getMeasuredWidth() * this.f), (int) (getMeasuredHeight() * this.h));
                } else {
                    org.telegram.messenger.g0.Q.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f)), this.E < 0 ? 0 : -org.telegram.messenger.g0.L(f10), getMeasuredWidth(), (int) (getMeasuredHeight() * this.h));
                    i16 = 0;
                }
                if (this.I != f11) {
                    if (this.R == null) {
                        this.R = new Rect();
                    }
                    Rect rect5 = this.R;
                    Rect rect6 = org.telegram.messenger.g0.Q;
                    int i21 = rect6.right;
                    int i22 = rect6.top;
                    rect5.set(i21, i22, i21, i22);
                    org.telegram.messenger.g0.X1(this.R, rect6, this.I, rect6);
                }
                Drawable drawable = this.N;
                Rect rect7 = org.telegram.messenger.g0.Q;
                drawable.setBounds(rect7);
                this.N.draw(canvas2);
                if (this.b) {
                    rect7.left += rect.left;
                    rect7.top += rect.top;
                    rect7.right -= rect.right;
                    rect7.bottom -= rect.bottom;
                    canvas2.clipRect(rect7);
                }
                if (z9) {
                    canvas2.save();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(this.N.getBounds());
                    rectF.inset(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                    Path path = this.S;
                    if (path == null) {
                        this.S = new Path();
                    } else {
                        path.rewind();
                    }
                    this.S.addRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
                    canvas2.clipPath(this.S);
                    for (int i23 = i16; i23 < c61Var.getChildCount(); i23++) {
                        if ((c61Var.getChildAt(i23) instanceof d1) && c61Var.getChildAt(i23).getVisibility() == 0) {
                            canvas2.save();
                            d1 d1Var = (d1) c61Var.getChildAt(i23);
                            float f16 = 0.0f;
                            View view2 = d1Var;
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
                            d1Var.draw(canvas2);
                            canvas2.restore();
                        }
                    }
                    canvas2.restore();
                }
                canvas2.restoreToCount(i14);
                i19 = i10 + 1;
                i7 = i11;
                f12 = f10;
                f13 = f11;
            }
        }
        float f18 = f13;
        float f19 = this.I;
        if (f19 == f18) {
            super.dispatchDraw(canvas);
            return;
        }
        Rect rect8 = org.telegram.messenger.g0.Q;
        canvas.saveLayerAlpha(rect8.left, rect8.top, rect8.right, rect8.bottom, (int) (f19 * 255.0f), 31);
        float f20 = (this.I * 0.5f) + 0.5f;
        canvas.scale(f20, f20, rect8.right, rect8.top);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        e1 e1Var = this.e;
        if (e1Var != null) {
            e1Var.j(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e(View view) {
        if (this.x) {
            AnimatorSet animatorSet = new AnimatorSet();
            int i7 = 1;
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, view.isEnabled() ? 1.0f : 0.5f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, org.telegram.messenger.g0.L(this.w ? 6.0f : -6.0f), 0.0f));
            animatorSet.setDuration(180L);
            animatorSet.addListener(new di.h3(this, animatorSet, view, i7));
            animatorSet.setInterpolator(g1.m);
            animatorSet.start();
            if (this.y == null) {
                this.y = new ArrayList();
            }
            this.y.add(animatorSet);
        }
    }

    public final void f() {
        c61 c61Var = this.L;
        int childCount = c61Var.getChildCount();
        View view = null;
        View view2 = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = c61Var.getChildAt(i7);
            if (childAt.getVisibility() == 0) {
                if (view == null) {
                    view = childAt;
                }
                view2 = childAt;
            }
        }
        boolean z9 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = c61Var.getChildAt(i10);
            if (childAt2.getVisibility() == 0) {
                Object tag = childAt2.getTag(R.id.object_tag);
                if (childAt2 instanceof z0) {
                    ((z0) childAt2).m(childAt2 == view || z9, childAt2 == view2);
                }
                z9 = tag != null;
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
        return this.M;
    }

    public Drawable getBackgroundDrawable() {
        return this.N;
    }

    public int getItemsCount() {
        return this.L.getChildCount();
    }

    public Rect getPadding() {
        return this.G;
    }

    public ve0 getSwipeBack() {
        return this.J;
    }

    public int getViewsCount() {
        return this.L.getChildCount();
    }

    public int getVisibleHeight() {
        return (int) (getMeasuredHeight() * this.h);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        ve0 ve0Var = this.J;
        if (ve0Var != null) {
            ve0Var.c(!this.n);
        }
    }

    public void setAnimationEnabled(boolean z9) {
        this.x = z9;
    }

    public void setBackAlpha(int i7) {
        if (this.r != i7) {
            invalidate();
        }
        this.r = i7;
    }

    public void setBackScaleX(float f10) {
        if (this.f != f10) {
            this.f = f10;
            invalidate();
            f1 f1Var = this.H;
            if (f1Var != null) {
                f1Var.a();
            }
        }
    }

    public void setBackScaleY(float f10) {
        if (this.h != f10) {
            this.h = f10;
            if (this.x && this.a) {
                int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f);
                boolean z9 = this.w;
                HashMap hashMap = this.D;
                c61 c61Var = this.L;
                if (z9) {
                    for (int i7 = this.s; i7 >= 0; i7--) {
                        View childAt = c61Var.getChildAt(i7);
                        if (childAt != null && childAt.getVisibility() == 0 && !(childAt instanceof d1)) {
                            if (((Integer) hashMap.get(childAt)) != null) {
                                if (org.telegram.messenger.camera.q.w(32.0f, org.telegram.messenger.g0.L(48.0f) * r5.intValue(), measuredHeight) > measuredHeight * f10) {
                                    break;
                                }
                            }
                            this.s = i7 - 1;
                            e(childAt);
                        }
                    }
                } else {
                    int itemsCount = getItemsCount();
                    int i10 = 0;
                    for (int i11 = 0; i11 < itemsCount; i11++) {
                        View childAt2 = c61Var.getChildAt(i11);
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
            f1 f1Var = this.H;
            if (f1Var != null) {
                f1Var.a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        Drawable drawable;
        if (this.M == i7 || (drawable = this.N) == null) {
            return;
        }
        this.M = i7;
        drawable.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        this.M = -1;
        this.N = drawable;
        Rect rect = this.G;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
    }

    public void setDispatchKeyEventListener(e1 e1Var) {
        this.e = e1Var;
    }

    public void setFitItems(boolean z9) {
        this.O = z9;
    }

    public void setOnSizeChangedListener(f1 f1Var) {
        this.H = f1Var;
    }

    public void setParentWindow(g1 g1Var) {
        this.Q = g1Var;
    }

    public void setReactionsTransitionProgress(float f10) {
        this.I = f10;
        invalidate();
    }

    public void setShownFromBottom(boolean z9) {
        this.w = z9;
    }

    public void setSwipeBackForegroundColor(int i7) {
        getSwipeBack().setForegroundColor(i7);
    }

    public void setTopView(View view) {
        this.P = view;
    }

    public void setupRadialSelectors(int i7) {
        c61 c61Var = this.L;
        int childCount = c61Var.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = c61Var.getChildAt(i10);
            int i11 = 6;
            int i12 = i10 == 0 ? 6 : 0;
            if (i10 != childCount - 1) {
                i11 = 0;
            }
            childAt.setBackground(k6.a0(i7, i12, i11));
            i10++;
        }
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(int i7, int i10, Context context, f6 f6Var) {
        super(context);
        this.f = 1.0f;
        this.h = 1.0f;
        this.n = false;
        this.r = qs.e4;
        this.s = 0;
        this.x = true;
        this.D = new HashMap();
        this.E = -1000000;
        this.F = -1000000;
        Rect rect = new Rect();
        this.G = rect;
        this.I = 1.0f;
        this.M = -1;
        if (i7 != 0) {
            this.N = getResources().getDrawable(i7).mutate();
            setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        }
        Drawable drawable = this.N;
        if (drawable != null) {
            drawable.getPadding(rect);
            r6.i(k6.G8, this, f6Var);
        }
        setWillNotDraw(false);
        if ((i10 & 2) > 0) {
            this.w = true;
        }
        if ((i10 & 1) > 0) {
            ve0 ve0Var = new ve0(context);
            ve0Var.a = new SparseIntArray();
            ve0Var.c = -1.0f;
            Paint paint = new Paint(1);
            ve0Var.n = paint;
            ve0Var.r = new Paint();
            ve0Var.s = 0;
            ve0Var.w = new Path();
            ve0Var.x = new RectF();
            ve0Var.y = new ArrayList();
            ve0Var.G = -1;
            ve0Var.H = new h2.f((int[]) null);
            ve0Var.J = -1;
            ve0Var.L = new Rect();
            ve0Var.I = f6Var;
            ve0Var.d = new vy(context, new hi.z3(ve0Var, ViewConfiguration.get(context).getScaledTouchSlop(), 2));
            paint.setColor(-16777216);
            this.J = ve0Var;
            addView(ve0Var, ha.c(-2.0f, -2));
        }
        if ((i10 & 4) == 0) {
            try {
                ScrollView scrollView = new ScrollView(context);
                this.K = scrollView;
                scrollView.getViewTreeObserver().addOnScrollChangedListener(new c1(this));
                scrollView.setVerticalScrollBarEnabled(false);
                ve0 ve0Var2 = this.J;
                if (ve0Var2 != null) {
                    ve0Var2.addView(scrollView, ha.e(-2, -2, this.w ? 80 : 48));
                } else {
                    addView(scrollView, ha.c(-2.0f, -2));
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        c61 c61Var = new c61(8, context, this);
        this.L = c61Var;
        c61Var.setOrientation(1);
        ScrollView scrollView2 = this.K;
        if (scrollView2 != null) {
            scrollView2.addView(c61Var, new FrameLayout.LayoutParams(-2, -2));
            return;
        }
        ve0 ve0Var3 = this.J;
        if (ve0Var3 != null) {
            ve0Var3.addView(c61Var, ha.e(-2, -2, this.w ? 80 : 48));
        } else {
            addView(c61Var, ha.c(-2.0f, -2));
        }
    }
}
