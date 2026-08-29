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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qg0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class ActionBarPopupWindow$ActionBarPopupWindowLayout extends FrameLayout {
    public int A;
    public int B;
    public final Rect C;
    public n1 D;
    public float E;
    public final qg0 F;
    public final ScrollView G;
    public final k1 H;
    public int I;
    public Drawable J;
    public boolean K;
    public View L;
    public o1 M;
    public Rect N;
    public Path O;
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

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(Context context, c6 c6Var) {
        this(R.drawable.popup_fixed_alert2, 0, context, c6Var);
    }

    public final void a(View view, LinearLayout.LayoutParams layoutParams) {
        this.H.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        this.H.addView(view);
    }

    public final int b(View view) {
        FrameLayout.LayoutParams e10 = i7.f6.e(-2, -2, this.v ? 80 : 48);
        this.F.addView(view, e10);
        return r1.getChildCount() - 1;
    }

    public final void c() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31);
        k1 k1Var = this.H;
        k1Var.measure(makeMeasureSpec, makeMeasureSpec);
        k1Var.getMeasuredHeight();
    }

    public final void d() {
        this.H.removeAllViews();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        k1 k1Var;
        int i10;
        boolean z10;
        int i11;
        int i12;
        Rect rect;
        int i13;
        float f9;
        float f10;
        Canvas canvas2;
        boolean z11;
        boolean z12 = this.c;
        qg0 qg0Var = this.F;
        if (z12) {
            setTranslationX((1.0f - this.f) * getMeasuredWidth());
            View view = this.L;
            if (view != null) {
                view.setTranslationX((1.0f - this.f) * getMeasuredWidth());
                this.L.setAlpha(1.0f - qg0Var.b);
                float f11 = (-(this.L.getMeasuredHeight() - AndroidUtilities.dp(16.0f))) * qg0Var.b;
                this.L.setTranslationY(f11);
                setTranslationY(f11);
            }
        }
        if (this.d) {
            setTranslationY((1.0f - this.h) * getMeasuredHeight());
        }
        if (this.J != null) {
            int i14 = this.A;
            ScrollView scrollView = this.G;
            int scrollY = i14 - (scrollView == null ? 0 : scrollView.getScrollY());
            int scrollY2 = this.B - (scrollView == null ? 0 : scrollView.getScrollY());
            int i15 = 0;
            while (true) {
                k1Var = this.H;
                i10 = 1;
                if (i15 >= k1Var.getChildCount()) {
                    z10 = false;
                    break;
                } else {
                    if ((k1Var.getChildAt(i15) instanceof l1) && k1Var.getChildAt(i15).getVisibility() == 0) {
                        z10 = true;
                        break;
                    }
                    i15++;
                }
            }
            int i16 = 0;
            for (float f12 = 16.0f; i16 < 2 && (i16 != i10 || scrollY >= (-AndroidUtilities.dp(f12))); f12 = 16.0f) {
                int saveCount = canvas.getSaveCount();
                Rect rect2 = this.C;
                if (!z10 || this.r == 255) {
                    i11 = i16;
                    i12 = saveCount;
                    rect = rect2;
                    i13 = -1000000;
                    f9 = 16.0f;
                    f10 = 1.0f;
                    canvas2 = canvas;
                    if (this.A != -1000000) {
                        canvas2.save();
                        canvas2.clipRect(0, rect.top, getMeasuredWidth(), getMeasuredHeight());
                    }
                    z11 = true;
                } else {
                    i11 = i16;
                    i12 = saveCount;
                    rect = rect2;
                    i13 = -1000000;
                    f9 = 16.0f;
                    f10 = 1.0f;
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, rect2.top, getMeasuredWidth(), getMeasuredHeight(), this.r, 31);
                    z11 = false;
                }
                this.J.setAlpha(z11 ? this.r : 255);
                if (this.v) {
                    int measuredHeight = getMeasuredHeight();
                    AndroidUtilities.rectTmp2.set(0, (int) ((f10 - this.h) * measuredHeight), (int) (getMeasuredWidth() * this.f), measuredHeight);
                } else if (scrollY > (-AndroidUtilities.dp(f9))) {
                    int measuredHeight2 = (int) (getMeasuredHeight() * this.h);
                    if (i11 == 0) {
                        if (qg0Var == null || !qg0Var.L) {
                            Rect rect3 = AndroidUtilities.rectTmp2;
                            int dp = (scrollView == null ? 0 : -scrollView.getScrollY()) + (this.A != i13 ? AndroidUtilities.dp(f10) : 0);
                            int measuredWidth = (int) (getMeasuredWidth() * this.f);
                            if (this.A != i13) {
                                measuredHeight2 = Math.min(measuredHeight2, AndroidUtilities.dp(f9) + scrollY);
                            }
                            rect3.set(0, dp, measuredWidth, measuredHeight2);
                        } else {
                            Rect rect4 = AndroidUtilities.rectTmp2;
                            int measuredWidth2 = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f));
                            int dp2 = (scrollView == null ? 0 : -scrollView.getScrollY()) + (this.A != i13 ? AndroidUtilities.dp(f10) : 0);
                            int measuredWidth3 = getMeasuredWidth();
                            if (this.A != i13) {
                                measuredHeight2 = Math.min(measuredHeight2, AndroidUtilities.dp(f9) + scrollY);
                            }
                            rect4.set(measuredWidth2, dp2, measuredWidth3, measuredHeight2);
                        }
                    } else if (measuredHeight2 < scrollY2) {
                        if (this.A != i13) {
                            canvas2.restore();
                        }
                        i16 = i11 + 1;
                        i10 = 1;
                    } else if (qg0Var == null || !qg0Var.L) {
                        AndroidUtilities.rectTmp2.set(0, scrollY2, (int) (getMeasuredWidth() * this.f), measuredHeight2);
                    } else {
                        AndroidUtilities.rectTmp2.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f)), scrollY2, getMeasuredWidth(), measuredHeight2);
                    }
                } else if (qg0Var == null || !qg0Var.L) {
                    AndroidUtilities.rectTmp2.set(0, this.A < 0 ? 0 : -AndroidUtilities.dp(f9), (int) (getMeasuredWidth() * this.f), (int) (getMeasuredHeight() * this.h));
                } else {
                    AndroidUtilities.rectTmp2.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f)), this.A < 0 ? 0 : -AndroidUtilities.dp(f9), getMeasuredWidth(), (int) (getMeasuredHeight() * this.h));
                }
                if (this.E != f10) {
                    if (this.N == null) {
                        this.N = new Rect();
                    }
                    Rect rect5 = this.N;
                    Rect rect6 = AndroidUtilities.rectTmp2;
                    int i17 = rect6.right;
                    int i18 = rect6.top;
                    rect5.set(i17, i18, i17, i18);
                    AndroidUtilities.lerp(this.N, rect6, this.E, rect6);
                }
                Drawable drawable = this.J;
                Rect rect7 = AndroidUtilities.rectTmp2;
                drawable.setBounds(rect7);
                this.J.draw(canvas2);
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
                    rectF.set(this.J.getBounds());
                    rectF.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    Path path = this.O;
                    if (path == null) {
                        this.O = new Path();
                    } else {
                        path.rewind();
                    }
                    this.O.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                    canvas2.clipPath(this.O);
                    for (int i19 = 0; i19 < k1Var.getChildCount(); i19++) {
                        if ((k1Var.getChildAt(i19) instanceof l1) && k1Var.getChildAt(i19).getVisibility() == 0) {
                            canvas2.save();
                            l1 l1Var = (l1) k1Var.getChildAt(i19);
                            float f13 = 0.0f;
                            View view2 = l1Var;
                            float f14 = 0.0f;
                            while (view2 != this) {
                                f14 += view2.getX();
                                f13 += view2.getY();
                                view2 = (View) view2.getParent();
                                if (view2 == null) {
                                    break;
                                }
                            }
                            canvas2.translate(f14, (f13 * (scrollView == null ? 1.0f : scrollView.getScaleY())) - (scrollView == null ? 0 : scrollView.getScrollY()));
                            l1Var.draw(canvas2);
                            canvas2.restore();
                        }
                    }
                    canvas2.restore();
                }
                canvas2.restoreToCount(i12);
                i16 = i11 + 1;
                i10 = 1;
            }
        }
        float f15 = this.E;
        if (f15 == 1.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        Rect rect8 = AndroidUtilities.rectTmp2;
        canvas.saveLayerAlpha(rect8.left, rect8.top, rect8.right, rect8.bottom, (int) (f15 * 255.0f), 31);
        float f16 = (this.E * 0.5f) + 0.5f;
        canvas.scale(f16, f16, rect8.right, rect8.top);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        m1 m1Var = this.e;
        if (m1Var != null) {
            m1Var.o(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e(View view) {
        if (this.w) {
            AnimatorSet animatorSet = new AnimatorSet();
            int i10 = 1;
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, view.isEnabled() ? 1.0f : 0.5f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(this.v ? 6.0f : -6.0f), 0.0f));
            animatorSet.setDuration(180L);
            animatorSet.addListener(new lh.f3(this, animatorSet, view, i10));
            animatorSet.setInterpolator(o1.m);
            animatorSet.start();
            if (this.x == null) {
                this.x = new ArrayList();
            }
            this.x.add(animatorSet);
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
        return this.I;
    }

    public Drawable getBackgroundDrawable() {
        return this.J;
    }

    public int getItemsCount() {
        return this.H.getChildCount();
    }

    public Rect getPadding() {
        return this.C;
    }

    public qg0 getSwipeBack() {
        return this.F;
    }

    public int getViewsCount() {
        return this.H.getChildCount();
    }

    public int getVisibleHeight() {
        return (int) (getMeasuredHeight() * this.h);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        qg0 qg0Var = this.F;
        if (qg0Var != null) {
            qg0Var.c(!this.n);
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

    public void setBackScaleX(float f9) {
        if (this.f != f9) {
            this.f = f9;
            invalidate();
            n1 n1Var = this.D;
            if (n1Var != null) {
                n1Var.a();
            }
        }
    }

    public void setBackScaleY(float f9) {
        if (this.h != f9) {
            this.h = f9;
            if (this.w && this.a) {
                int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
                boolean z10 = this.v;
                HashMap hashMap = this.y;
                k1 k1Var = this.H;
                if (z10) {
                    for (int i10 = this.s; i10 >= 0; i10--) {
                        View childAt = k1Var.getChildAt(i10);
                        if (childAt != null && childAt.getVisibility() == 0 && !(childAt instanceof l1)) {
                            if (((Integer) hashMap.get(childAt)) != null) {
                                if (org.telegram.ui.b.u(32.0f, AndroidUtilities.dp(48.0f) * r5.intValue(), measuredHeight) > measuredHeight * f9) {
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
                                if (((Integer) hashMap.get(childAt2)) != null && measuredHeight2 - AndroidUtilities.dp(24.0f) > measuredHeight * f9) {
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
            n1 n1Var = this.D;
            if (n1Var != null) {
                n1Var.a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Drawable drawable;
        if (this.I == i10 || (drawable = this.J) == null) {
            return;
        }
        this.I = i10;
        drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        this.I = -1;
        this.J = drawable;
        if (drawable != null) {
            drawable.getPadding(this.C);
        }
    }

    public void setDispatchKeyEventListener(m1 m1Var) {
        this.e = m1Var;
    }

    public void setFitItems(boolean z10) {
        this.K = z10;
    }

    public void setOnSizeChangedListener(n1 n1Var) {
        this.D = n1Var;
    }

    public void setParentWindow(o1 o1Var) {
        this.M = o1Var;
    }

    public void setReactionsTransitionProgress(float f9) {
        this.E = f9;
        invalidate();
    }

    public void setShownFromBottom(boolean z10) {
        this.v = z10;
    }

    public void setSwipeBackForegroundColor(int i10) {
        getSwipeBack().setForegroundColor(i10);
    }

    public void setTopView(View view) {
        this.L = view;
    }

    public void setupRadialSelectors(int i10) {
        k1 k1Var = this.H;
        int childCount = k1Var.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = k1Var.getChildAt(i11);
            int i12 = 6;
            int i13 = i11 == 0 ? 6 : 0;
            if (i11 != childCount - 1) {
                i12 = 0;
            }
            childAt.setBackground(g6.Y(i10, i13, i12));
            i11++;
        }
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(int i10, int i11, Context context, c6 c6Var) {
        super(context);
        this.f = 1.0f;
        this.h = 1.0f;
        this.n = false;
        this.r = 255;
        this.s = 0;
        this.w = true;
        this.y = new HashMap();
        this.A = -1000000;
        this.B = -1000000;
        Rect rect = new Rect();
        this.C = rect;
        this.E = 1.0f;
        this.I = -1;
        if (i10 != 0) {
            this.J = getResources().getDrawable(i10).mutate();
            setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        }
        Drawable drawable = this.J;
        if (drawable != null) {
            drawable.getPadding(rect);
            setBackgroundColor(g6.v0(g6.G8, c6Var));
        }
        setWillNotDraw(false);
        if ((i11 & 2) > 0) {
            this.v = true;
        }
        if ((i11 & 1) > 0) {
            qg0 qg0Var = new qg0(context);
            qg0Var.a = new SparseIntArray();
            qg0Var.c = -1.0f;
            Paint paint = new Paint(1);
            qg0Var.n = paint;
            qg0Var.r = new Paint();
            qg0Var.s = 0;
            qg0Var.v = new Path();
            qg0Var.w = new RectF();
            qg0Var.x = new ArrayList();
            qg0Var.C = -1;
            qg0Var.D = new AnimationNotificationsLocker();
            qg0Var.F = -1;
            qg0Var.H = new Rect();
            qg0Var.E = c6Var;
            qg0Var.d = new o4.g(context, new mr(qg0Var, ViewConfiguration.get(context).getScaledTouchSlop(), 1));
            paint.setColor(-16777216);
            this.F = qg0Var;
            addView(qg0Var, i7.f6.c(-2.0f, -2));
        }
        if ((i11 & 4) == 0) {
            try {
                ScrollView scrollView = new ScrollView(context);
                this.G = scrollView;
                scrollView.getViewTreeObserver().addOnScrollChangedListener(new j1(this));
                scrollView.setVerticalScrollBarEnabled(false);
                qg0 qg0Var2 = this.F;
                if (qg0Var2 != null) {
                    qg0Var2.addView(scrollView, i7.f6.e(-2, -2, this.v ? 80 : 48));
                } else {
                    addView(scrollView, i7.f6.c(-2.0f, -2));
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        k1 k1Var = new k1(this, context);
        this.H = k1Var;
        k1Var.setOrientation(1);
        ScrollView scrollView2 = this.G;
        if (scrollView2 != null) {
            scrollView2.addView(k1Var, new FrameLayout.LayoutParams(-2, -2));
            return;
        }
        qg0 qg0Var3 = this.F;
        if (qg0Var3 != null) {
            qg0Var3.addView(k1Var, i7.f6.e(-2, -2, this.v ? 80 : 48));
        } else {
            addView(k1Var, i7.f6.c(-2.0f, -2));
        }
    }
}
