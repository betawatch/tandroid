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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.sh0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class ActionBarPopupWindow$ActionBarPopupWindowLayout extends FrameLayout {
    public int E;
    public int F;
    public final Rect G;
    public n1 H;
    public float I;
    public final sh0 J;
    public final ScrollView K;
    public final k1 L;
    public int M;
    public Drawable N;
    public boolean O;
    public View P;
    public o1 Q;
    public Rect R;
    public Path S;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public m1 e;
    public float f;
    public float h;
    public boolean n;
    public int r;
    public int s;
    public boolean v;
    public boolean w;
    public ArrayList x;
    public final HashMap y;

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(Context context, u6 u6Var) {
        this(R.drawable.popup_fixed_alert2, 0, context, u6Var);
    }

    public final void a(View view, LinearLayout.LayoutParams layoutParams) {
        this.L.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        this.L.addView(view);
    }

    public final int b(View view) {
        FrameLayout.LayoutParams i10 = gb1.i(-2, -2, this.v ? 80 : 48);
        this.J.addView(view, i10);
        return r1.getChildCount() - 1;
    }

    public final void c() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31);
        k1 k1Var = this.L;
        k1Var.measure(makeMeasureSpec, makeMeasureSpec);
        k1Var.getMeasuredHeight();
    }

    public final void d() {
        this.L.removeAllViews();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        k1 k1Var;
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f7;
        float f10;
        Canvas canvas2;
        int i15;
        Rect rect;
        int i16;
        int i17;
        boolean z11 = this.c;
        sh0 sh0Var = this.J;
        float f11 = 16.0f;
        float f12 = 1.0f;
        if (z11) {
            setTranslationX((1.0f - this.f) * getMeasuredWidth());
            View view = this.P;
            if (view != null) {
                view.setTranslationX((1.0f - this.f) * getMeasuredWidth());
                this.P.setAlpha(1.0f - sh0Var.b);
                float f13 = (-(this.P.getMeasuredHeight() - AndroidUtilities.dp(16.0f))) * sh0Var.b;
                this.P.setTranslationY(f13);
                setTranslationY(f13);
            }
        }
        if (this.d) {
            setTranslationY((1.0f - this.h) * getMeasuredHeight());
        }
        if (this.N != null) {
            int i18 = this.E;
            ScrollView scrollView = this.K;
            int scrollY = i18 - (scrollView == null ? 0 : scrollView.getScrollY());
            int scrollY2 = this.F - (scrollView == null ? 0 : scrollView.getScrollY());
            int i19 = 0;
            while (true) {
                k1Var = this.L;
                i10 = 1;
                if (i19 >= k1Var.getChildCount()) {
                    z10 = false;
                    break;
                } else {
                    if ((k1Var.getChildAt(i19) instanceof l1) && k1Var.getChildAt(i19).getVisibility() == 0) {
                        z10 = true;
                        break;
                    }
                    i19++;
                }
            }
            int i20 = 0;
            while (i20 < 2 && (i20 != i10 || scrollY >= (-AndroidUtilities.dp(f11)))) {
                int saveCount = canvas.getSaveCount();
                Rect rect2 = this.G;
                if (!z10 || this.r == 255) {
                    i11 = i20;
                    i12 = i10;
                    i13 = 255;
                    i14 = -1000000;
                    f7 = f11;
                    f10 = f12;
                    canvas2 = canvas;
                    i15 = saveCount;
                    rect = rect2;
                    if (this.E != -1000000) {
                        canvas2.save();
                        canvas2.clipRect(0, rect.top, getMeasuredWidth(), getMeasuredHeight());
                    }
                    i16 = i12;
                } else {
                    f7 = f11;
                    i15 = saveCount;
                    f10 = f12;
                    rect = rect2;
                    i14 = -1000000;
                    i12 = 1;
                    i13 = 255;
                    i11 = i20;
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, rect2.top, getMeasuredWidth(), getMeasuredHeight(), this.r, 31);
                    i16 = 0;
                }
                this.N.setAlpha(i16 != 0 ? this.r : i13);
                if (this.v) {
                    int measuredHeight = getMeasuredHeight();
                    i17 = 0;
                    AndroidUtilities.rectTmp2.set(0, (int) ((f10 - this.h) * measuredHeight), (int) (getMeasuredWidth() * this.f), measuredHeight);
                } else if (scrollY > (-AndroidUtilities.dp(f7))) {
                    int measuredHeight2 = (int) (getMeasuredHeight() * this.h);
                    if (i11 == 0) {
                        if (sh0Var == null || !sh0Var.P) {
                            Rect rect3 = AndroidUtilities.rectTmp2;
                            int dp = (scrollView == null ? 0 : -scrollView.getScrollY()) + (this.E != i14 ? AndroidUtilities.dp(f10) : 0);
                            int measuredWidth = (int) (getMeasuredWidth() * this.f);
                            if (this.E != i14) {
                                measuredHeight2 = Math.min(measuredHeight2, AndroidUtilities.dp(f7) + scrollY);
                            }
                            i17 = 0;
                            rect3.set(0, dp, measuredWidth, measuredHeight2);
                        } else {
                            Rect rect4 = AndroidUtilities.rectTmp2;
                            int measuredWidth2 = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f));
                            int dp2 = (scrollView == null ? 0 : -scrollView.getScrollY()) + (this.E != i14 ? AndroidUtilities.dp(f10) : 0);
                            int measuredWidth3 = getMeasuredWidth();
                            if (this.E != i14) {
                                measuredHeight2 = Math.min(measuredHeight2, AndroidUtilities.dp(f7) + scrollY);
                            }
                            rect4.set(measuredWidth2, dp2, measuredWidth3, measuredHeight2);
                            i17 = 0;
                        }
                    } else if (measuredHeight2 < scrollY2) {
                        if (this.E != i14) {
                            canvas2.restore();
                        }
                        i20 = i11 + 1;
                        i10 = i12;
                        f11 = f7;
                        f12 = f10;
                    } else if (sh0Var == null || !sh0Var.P) {
                        i17 = 0;
                        AndroidUtilities.rectTmp2.set(0, scrollY2, (int) (getMeasuredWidth() * this.f), measuredHeight2);
                    } else {
                        AndroidUtilities.rectTmp2.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f)), scrollY2, getMeasuredWidth(), measuredHeight2);
                        i17 = 0;
                    }
                } else if (sh0Var == null || !sh0Var.P) {
                    i17 = 0;
                    AndroidUtilities.rectTmp2.set(0, this.E < 0 ? 0 : -AndroidUtilities.dp(f7), (int) (getMeasuredWidth() * this.f), (int) (getMeasuredHeight() * this.h));
                } else {
                    AndroidUtilities.rectTmp2.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f)), this.E < 0 ? 0 : -AndroidUtilities.dp(f7), getMeasuredWidth(), (int) (getMeasuredHeight() * this.h));
                    i17 = 0;
                }
                if (this.I != f10) {
                    if (this.R == null) {
                        this.R = new Rect();
                    }
                    Rect rect5 = this.R;
                    Rect rect6 = AndroidUtilities.rectTmp2;
                    int i21 = rect6.right;
                    int i22 = rect6.top;
                    rect5.set(i21, i22, i21, i22);
                    AndroidUtilities.lerp(this.R, rect6, this.I, rect6);
                }
                Drawable drawable = this.N;
                Rect rect7 = AndroidUtilities.rectTmp2;
                drawable.setBounds(rect7);
                this.N.draw(canvas2);
                if (this.b) {
                    rect7.left += rect.left;
                    rect7.top += rect.top;
                    rect7.right -= rect.right;
                    rect7.bottom -= rect.bottom;
                    canvas2.clipRect(rect7);
                }
                if (z10) {
                    canvas2.save();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(this.N.getBounds());
                    rectF.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    Path path = this.S;
                    if (path == null) {
                        this.S = new Path();
                    } else {
                        path.rewind();
                    }
                    this.S.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                    canvas2.clipPath(this.S);
                    for (int i23 = i17; i23 < k1Var.getChildCount(); i23++) {
                        if ((k1Var.getChildAt(i23) instanceof l1) && k1Var.getChildAt(i23).getVisibility() == 0) {
                            canvas2.save();
                            l1 l1Var = (l1) k1Var.getChildAt(i23);
                            float f14 = 0.0f;
                            View view2 = l1Var;
                            float f15 = 0.0f;
                            while (view2 != this) {
                                f15 += view2.getX();
                                f14 += view2.getY();
                                view2 = (View) view2.getParent();
                                if (view2 == null) {
                                    break;
                                }
                            }
                            canvas2.translate(f15, (f14 * (scrollView == null ? f10 : scrollView.getScaleY())) - (scrollView == null ? i17 : scrollView.getScrollY()));
                            l1Var.draw(canvas2);
                            canvas2.restore();
                        }
                    }
                    canvas2.restore();
                }
                canvas2.restoreToCount(i15);
                i20 = i11 + 1;
                i10 = i12;
                f11 = f7;
                f12 = f10;
            }
        }
        float f16 = f12;
        float f17 = this.I;
        if (f17 == f16) {
            super.dispatchDraw(canvas);
            return;
        }
        Rect rect8 = AndroidUtilities.rectTmp2;
        canvas.saveLayerAlpha(rect8.left, rect8.top, rect8.right, rect8.bottom, (int) (f17 * 255.0f), 31);
        float f18 = (this.I * 0.5f) + 0.5f;
        canvas.scale(f18, f18, rect8.right, rect8.top);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        m1 m1Var = this.e;
        if (m1Var != null) {
            m1Var.n(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e(View view) {
        if (this.w) {
            AnimatorSet animatorSet = new AnimatorSet();
            int i10 = 1;
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, view.isEnabled() ? 1.0f : 0.5f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(this.v ? 6.0f : -6.0f), 0.0f));
            animatorSet.setDuration(180L);
            animatorSet.addListener(new di.o3(this, animatorSet, view, i10));
            animatorSet.setInterpolator(o1.m);
            animatorSet.start();
            if (this.x == null) {
                this.x = new ArrayList();
            }
            this.x.add(animatorSet);
        }
    }

    public final void f() {
        k1 k1Var = this.L;
        int childCount = k1Var.getChildCount();
        View view = null;
        View view2 = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = k1Var.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                if (view == null) {
                    view = childAt;
                }
                view2 = childAt;
            }
        }
        boolean z10 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = k1Var.getChildAt(i11);
            if (childAt2.getVisibility() == 0) {
                Object tag = childAt2.getTag(R.id.object_tag);
                if (childAt2 instanceof g1) {
                    ((g1) childAt2).m(childAt2 == view || z10, childAt2 == view2);
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

    public sh0 getSwipeBack() {
        return this.J;
    }

    public int getViewsCount() {
        return this.L.getChildCount();
    }

    public int getVisibleHeight() {
        return (int) (getMeasuredHeight() * this.h);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        sh0 sh0Var = this.J;
        if (sh0Var != null) {
            sh0Var.c(!this.n);
        }
    }

    public void setAnimationEnabled(boolean z10) {
        this.w = z10;
    }

    public void setBackAlpha(int i10) {
        if (this.r != i10) {
            invalidate();
        }
        this.r = i10;
    }

    public void setBackScaleX(float f7) {
        if (this.f != f7) {
            this.f = f7;
            invalidate();
            n1 n1Var = this.H;
            if (n1Var != null) {
                n1Var.a();
            }
        }
    }

    public void setBackScaleY(float f7) {
        if (this.h != f7) {
            this.h = f7;
            if (this.w && this.a) {
                int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
                boolean z10 = this.v;
                HashMap hashMap = this.y;
                k1 k1Var = this.L;
                if (z10) {
                    for (int i10 = this.s; i10 >= 0; i10--) {
                        View childAt = k1Var.getChildAt(i10);
                        if (childAt != null && childAt.getVisibility() == 0 && !(childAt instanceof l1)) {
                            if (((Integer) hashMap.get(childAt)) != null) {
                                if (vh.z(32.0f, AndroidUtilities.dp(48.0f) * r5.intValue(), measuredHeight) > measuredHeight * f7) {
                                    break;
                                }
                            }
                            this.s = i10 - 1;
                            e(childAt);
                        }
                    }
                } else {
                    int itemsCount = getItemsCount();
                    int i11 = 0;
                    for (int i12 = 0; i12 < itemsCount; i12++) {
                        View childAt2 = k1Var.getChildAt(i12);
                        if (childAt2.getVisibility() == 0) {
                            int measuredHeight2 = childAt2.getMeasuredHeight() + i11;
                            if (i12 >= this.s) {
                                if (((Integer) hashMap.get(childAt2)) != null && measuredHeight2 - AndroidUtilities.dp(24.0f) > measuredHeight * f7) {
                                    break;
                                }
                                this.s = i12 + 1;
                                e(childAt2);
                            }
                            i11 = measuredHeight2;
                        }
                    }
                }
            }
            invalidate();
            n1 n1Var = this.H;
            if (n1Var != null) {
                n1Var.a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Drawable drawable;
        if (this.M == i10 || (drawable = this.N) == null) {
            return;
        }
        this.M = i10;
        drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        this.M = -1;
        this.N = drawable;
        if (drawable != null) {
            drawable.getPadding(this.G);
        }
    }

    public void setDispatchKeyEventListener(m1 m1Var) {
        this.e = m1Var;
    }

    public void setFitItems(boolean z10) {
        this.O = z10;
    }

    public void setOnSizeChangedListener(n1 n1Var) {
        this.H = n1Var;
    }

    public void setParentWindow(o1 o1Var) {
        this.Q = o1Var;
    }

    public void setReactionsTransitionProgress(float f7) {
        this.I = f7;
        invalidate();
    }

    public void setShownFromBottom(boolean z10) {
        this.v = z10;
    }

    public void setSwipeBackForegroundColor(int i10) {
        getSwipeBack().setForegroundColor(i10);
    }

    public void setTopView(View view) {
        this.P = view;
    }

    public void setupRadialSelectors(int i10) {
        k1 k1Var = this.L;
        int childCount = k1Var.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = k1Var.getChildAt(i11);
            int i12 = 6;
            int i13 = i11 == 0 ? 6 : 0;
            if (i11 != childCount - 1) {
                i12 = 0;
            }
            childAt.setBackground(y6.Z(i10, i13, i12));
            i11++;
        }
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(int i10, int i11, Context context, u6 u6Var) {
        super(context);
        this.f = 1.0f;
        this.h = 1.0f;
        this.n = false;
        this.r = 255;
        this.s = 0;
        this.w = true;
        this.y = new HashMap();
        this.E = -1000000;
        this.F = -1000000;
        Rect rect = new Rect();
        this.G = rect;
        this.I = 1.0f;
        this.M = -1;
        if (i10 != 0) {
            this.N = getResources().getDrawable(i10).mutate();
            setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        }
        Drawable drawable = this.N;
        if (drawable != null) {
            drawable.getPadding(rect);
            f7.i(y6.G8, this, u6Var);
        }
        setWillNotDraw(false);
        if ((i11 & 2) > 0) {
            this.v = true;
        }
        if ((i11 & 1) > 0) {
            sh0 sh0Var = new sh0(context);
            sh0Var.a = new SparseIntArray();
            sh0Var.c = -1.0f;
            Paint paint = new Paint(1);
            sh0Var.n = paint;
            sh0Var.r = new Paint();
            sh0Var.s = 0;
            sh0Var.v = new Path();
            sh0Var.w = new RectF();
            sh0Var.x = new ArrayList();
            sh0Var.G = -1;
            sh0Var.H = new AnimationNotificationsLocker();
            sh0Var.J = -1;
            sh0Var.L = new Rect();
            sh0Var.I = u6Var;
            sh0Var.d = new jg.s0(context, new hi.l4(sh0Var, ViewConfiguration.get(context).getScaledTouchSlop(), 2));
            paint.setColor(-16777216);
            this.J = sh0Var;
            addView(sh0Var, gb1.g(-2.0f, -2));
        }
        if ((i11 & 4) == 0) {
            try {
                ScrollView scrollView = new ScrollView(context);
                this.K = scrollView;
                scrollView.getViewTreeObserver().addOnScrollChangedListener(new j1(this));
                scrollView.setVerticalScrollBarEnabled(false);
                sh0 sh0Var2 = this.J;
                if (sh0Var2 != null) {
                    sh0Var2.addView(scrollView, gb1.i(-2, -2, this.v ? 80 : 48));
                } else {
                    addView(scrollView, gb1.g(-2.0f, -2));
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        k1 k1Var = new k1(this, context);
        this.L = k1Var;
        k1Var.setOrientation(1);
        ScrollView scrollView2 = this.K;
        if (scrollView2 != null) {
            scrollView2.addView(k1Var, new FrameLayout.LayoutParams(-2, -2));
            return;
        }
        sh0 sh0Var3 = this.J;
        if (sh0Var3 != null) {
            sh0Var3.addView(k1Var, gb1.i(-2, -2, this.v ? 80 : 48));
        } else {
            addView(k1Var, gb1.g(-2.0f, -2));
        }
    }
}
