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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.fg0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class ActionBarPopupWindow$ActionBarPopupWindowLayout extends FrameLayout {
    public int A;
    public int B;
    public final Rect C;
    public n1 D;
    public float E;
    public final fg0 F;
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

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(Context context, b6 b6Var) {
        this(R.drawable.popup_fixed_alert2, 0, context, b6Var);
    }

    public final void a(View view, LinearLayout.LayoutParams layoutParams) {
        this.H.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        this.H.addView(view);
    }

    public final int b(View view) {
        FrameLayout.LayoutParams e10 = g7.e6.e(-2, -2, this.v ? 80 : 48);
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
        int i9;
        boolean z10;
        int i10;
        int i11;
        Rect rect;
        int i12;
        float f10;
        float f11;
        Canvas canvas2;
        boolean z11;
        boolean z12 = this.c;
        fg0 fg0Var = this.F;
        if (z12) {
            setTranslationX((1.0f - this.f) * getMeasuredWidth());
            View view = this.L;
            if (view != null) {
                view.setTranslationX((1.0f - this.f) * getMeasuredWidth());
                this.L.setAlpha(1.0f - fg0Var.b);
                float f12 = (-(this.L.getMeasuredHeight() - AndroidUtilities.dp(16.0f))) * fg0Var.b;
                this.L.setTranslationY(f12);
                setTranslationY(f12);
            }
        }
        if (this.d) {
            setTranslationY((1.0f - this.h) * getMeasuredHeight());
        }
        if (this.J != null) {
            int i13 = this.A;
            ScrollView scrollView = this.G;
            int scrollY = i13 - (scrollView == null ? 0 : scrollView.getScrollY());
            int scrollY2 = this.B - (scrollView == null ? 0 : scrollView.getScrollY());
            int i14 = 0;
            while (true) {
                k1Var = this.H;
                i9 = 1;
                if (i14 >= k1Var.getChildCount()) {
                    z10 = false;
                    break;
                } else {
                    if ((k1Var.getChildAt(i14) instanceof l1) && k1Var.getChildAt(i14).getVisibility() == 0) {
                        z10 = true;
                        break;
                    }
                    i14++;
                }
            }
            int i15 = 0;
            for (float f13 = 16.0f; i15 < 2 && (i15 != i9 || scrollY >= (-AndroidUtilities.dp(f13))); f13 = 16.0f) {
                int saveCount = canvas.getSaveCount();
                Rect rect2 = this.C;
                if (!z10 || this.r == 255) {
                    i10 = i15;
                    i11 = saveCount;
                    rect = rect2;
                    i12 = -1000000;
                    f10 = 16.0f;
                    f11 = 1.0f;
                    canvas2 = canvas;
                    if (this.A != -1000000) {
                        canvas2.save();
                        canvas2.clipRect(0, rect.top, getMeasuredWidth(), getMeasuredHeight());
                    }
                    z11 = true;
                } else {
                    i10 = i15;
                    i11 = saveCount;
                    rect = rect2;
                    i12 = -1000000;
                    f10 = 16.0f;
                    f11 = 1.0f;
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, rect2.top, getMeasuredWidth(), getMeasuredHeight(), this.r, 31);
                    z11 = false;
                }
                this.J.setAlpha(z11 ? this.r : 255);
                if (this.v) {
                    int measuredHeight = getMeasuredHeight();
                    AndroidUtilities.rectTmp2.set(0, (int) ((f11 - this.h) * measuredHeight), (int) (getMeasuredWidth() * this.f), measuredHeight);
                } else if (scrollY > (-AndroidUtilities.dp(f10))) {
                    int measuredHeight2 = (int) (getMeasuredHeight() * this.h);
                    if (i10 == 0) {
                        if (fg0Var == null || !fg0Var.L) {
                            Rect rect3 = AndroidUtilities.rectTmp2;
                            int dp = (scrollView == null ? 0 : -scrollView.getScrollY()) + (this.A != i12 ? AndroidUtilities.dp(f11) : 0);
                            int measuredWidth = (int) (getMeasuredWidth() * this.f);
                            if (this.A != i12) {
                                measuredHeight2 = Math.min(measuredHeight2, AndroidUtilities.dp(f10) + scrollY);
                            }
                            rect3.set(0, dp, measuredWidth, measuredHeight2);
                        } else {
                            Rect rect4 = AndroidUtilities.rectTmp2;
                            int measuredWidth2 = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f));
                            int dp2 = (scrollView == null ? 0 : -scrollView.getScrollY()) + (this.A != i12 ? AndroidUtilities.dp(f11) : 0);
                            int measuredWidth3 = getMeasuredWidth();
                            if (this.A != i12) {
                                measuredHeight2 = Math.min(measuredHeight2, AndroidUtilities.dp(f10) + scrollY);
                            }
                            rect4.set(measuredWidth2, dp2, measuredWidth3, measuredHeight2);
                        }
                    } else if (measuredHeight2 < scrollY2) {
                        if (this.A != i12) {
                            canvas2.restore();
                        }
                        i15 = i10 + 1;
                        i9 = 1;
                    } else if (fg0Var == null || !fg0Var.L) {
                        AndroidUtilities.rectTmp2.set(0, scrollY2, (int) (getMeasuredWidth() * this.f), measuredHeight2);
                    } else {
                        AndroidUtilities.rectTmp2.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f)), scrollY2, getMeasuredWidth(), measuredHeight2);
                    }
                } else if (fg0Var == null || !fg0Var.L) {
                    AndroidUtilities.rectTmp2.set(0, this.A < 0 ? 0 : -AndroidUtilities.dp(f10), (int) (getMeasuredWidth() * this.f), (int) (getMeasuredHeight() * this.h));
                } else {
                    AndroidUtilities.rectTmp2.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f)), this.A < 0 ? 0 : -AndroidUtilities.dp(f10), getMeasuredWidth(), (int) (getMeasuredHeight() * this.h));
                }
                if (this.E != f11) {
                    if (this.N == null) {
                        this.N = new Rect();
                    }
                    Rect rect5 = this.N;
                    Rect rect6 = AndroidUtilities.rectTmp2;
                    int i16 = rect6.right;
                    int i17 = rect6.top;
                    rect5.set(i16, i17, i16, i17);
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
                    for (int i18 = 0; i18 < k1Var.getChildCount(); i18++) {
                        if ((k1Var.getChildAt(i18) instanceof l1) && k1Var.getChildAt(i18).getVisibility() == 0) {
                            canvas2.save();
                            l1 l1Var = (l1) k1Var.getChildAt(i18);
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
                            canvas2.translate(f15, (f14 * (scrollView == null ? 1.0f : scrollView.getScaleY())) - (scrollView == null ? 0 : scrollView.getScrollY()));
                            l1Var.draw(canvas2);
                            canvas2.restore();
                        }
                    }
                    canvas2.restore();
                }
                canvas2.restoreToCount(i11);
                i15 = i10 + 1;
                i9 = 1;
            }
        }
        float f16 = this.E;
        if (f16 == 1.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        Rect rect8 = AndroidUtilities.rectTmp2;
        canvas.saveLayerAlpha(rect8.left, rect8.top, rect8.right, rect8.bottom, (int) (f16 * 255.0f), 31);
        float f17 = (this.E * 0.5f) + 0.5f;
        canvas.scale(f17, f17, rect8.right, rect8.top);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        m1 m1Var = this.e;
        if (m1Var != null) {
            m1Var.k(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e(View view) {
        if (this.w) {
            AnimatorSet animatorSet = new AnimatorSet();
            int i9 = 1;
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, view.isEnabled() ? 1.0f : 0.5f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(this.v ? 6.0f : -6.0f), 0.0f));
            animatorSet.setDuration(180L);
            animatorSet.addListener(new ih.j3(this, animatorSet, view, i9));
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

    public fg0 getSwipeBack() {
        return this.F;
    }

    public int getViewsCount() {
        return this.H.getChildCount();
    }

    public int getVisibleHeight() {
        return (int) (getMeasuredHeight() * this.h);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        fg0 fg0Var = this.F;
        if (fg0Var != null) {
            fg0Var.c(!this.n);
        }
    }

    public void setAnimationEnabled(boolean z10) {
        this.w = z10;
    }

    public void setBackAlpha(int i9) {
        if (this.r != i9) {
            invalidate();
        }
        this.r = i9;
    }

    public void setBackScaleX(float f10) {
        if (this.f != f10) {
            this.f = f10;
            invalidate();
            n1 n1Var = this.D;
            if (n1Var != null) {
                n1Var.b();
            }
        }
    }

    public void setBackScaleY(float f10) {
        if (this.h != f10) {
            this.h = f10;
            if (this.w && this.a) {
                int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
                boolean z10 = this.v;
                HashMap hashMap = this.y;
                k1 k1Var = this.H;
                if (z10) {
                    for (int i9 = this.s; i9 >= 0; i9--) {
                        View childAt = k1Var.getChildAt(i9);
                        if (childAt != null && childAt.getVisibility() == 0 && !(childAt instanceof l1)) {
                            if (((Integer) hashMap.get(childAt)) != null) {
                                if (ll.w(32.0f, AndroidUtilities.dp(48.0f) * r5.intValue(), measuredHeight) > measuredHeight * f10) {
                                    break;
                                }
                            }
                            this.s = i9 - 1;
                            e(childAt);
                        }
                    }
                } else {
                    int itemsCount = getItemsCount();
                    int i10 = 0;
                    for (int i11 = 0; i11 < itemsCount; i11++) {
                        View childAt2 = k1Var.getChildAt(i11);
                        if (childAt2.getVisibility() == 0) {
                            int measuredHeight2 = childAt2.getMeasuredHeight() + i10;
                            if (i11 >= this.s) {
                                if (((Integer) hashMap.get(childAt2)) != null && measuredHeight2 - AndroidUtilities.dp(24.0f) > measuredHeight * f10) {
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
            n1 n1Var = this.D;
            if (n1Var != null) {
                n1Var.b();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i9) {
        Drawable drawable;
        if (this.I == i9 || (drawable = this.J) == null) {
            return;
        }
        this.I = i9;
        drawable.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
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

    public void setReactionsTransitionProgress(float f10) {
        this.E = f10;
        invalidate();
    }

    public void setShownFromBottom(boolean z10) {
        this.v = z10;
    }

    public void setSwipeBackForegroundColor(int i9) {
        getSwipeBack().setForegroundColor(i9);
    }

    public void setTopView(View view) {
        this.L = view;
    }

    public void setupRadialSelectors(int i9) {
        k1 k1Var = this.H;
        int childCount = k1Var.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = k1Var.getChildAt(i10);
            int i11 = 6;
            int i12 = i10 == 0 ? 6 : 0;
            if (i10 != childCount - 1) {
                i11 = 0;
            }
            childAt.setBackground(f6.Y(i9, i12, i11));
            i10++;
        }
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(int i9, int i10, Context context, b6 b6Var) {
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
        if (i9 != 0) {
            this.J = getResources().getDrawable(i9).mutate();
            setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        }
        Drawable drawable = this.J;
        if (drawable != null) {
            drawable.getPadding(rect);
            setBackgroundColor(f6.v0(f6.G8, b6Var));
        }
        setWillNotDraw(false);
        if ((i10 & 2) > 0) {
            this.v = true;
        }
        if ((i10 & 1) > 0) {
            fg0 fg0Var = new fg0(context);
            fg0Var.a = new SparseIntArray();
            fg0Var.c = -1.0f;
            Paint paint = new Paint(1);
            fg0Var.n = paint;
            fg0Var.r = new Paint();
            fg0Var.s = 0;
            fg0Var.v = new Path();
            fg0Var.w = new RectF();
            fg0Var.x = new ArrayList();
            fg0Var.C = -1;
            fg0Var.D = new AnimationNotificationsLocker();
            fg0Var.F = -1;
            fg0Var.H = new Rect();
            fg0Var.E = b6Var;
            fg0Var.d = new m5.c0(context, new mh.d4(fg0Var, ViewConfiguration.get(context).getScaledTouchSlop(), 2));
            paint.setColor(-16777216);
            this.F = fg0Var;
            addView(fg0Var, g7.e6.c(-2.0f, -2));
        }
        if ((i10 & 4) == 0) {
            try {
                ScrollView scrollView = new ScrollView(context);
                this.G = scrollView;
                scrollView.getViewTreeObserver().addOnScrollChangedListener(new j1(this));
                scrollView.setVerticalScrollBarEnabled(false);
                fg0 fg0Var2 = this.F;
                if (fg0Var2 != null) {
                    fg0Var2.addView(scrollView, g7.e6.e(-2, -2, this.v ? 80 : 48));
                } else {
                    addView(scrollView, g7.e6.c(-2.0f, -2));
                }
            } catch (Throwable th) {
                FileLog.e(th);
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
        fg0 fg0Var3 = this.F;
        if (fg0Var3 != null) {
            fg0Var3.addView(k1Var, g7.e6.e(-2, -2, this.v ? 80 : 48));
        } else {
            addView(k1Var, g7.e6.c(-2.0f, -2));
        }
    }
}
