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
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class ActionBarPopupWindow$ActionBarPopupWindowLayout extends FrameLayout {
    public int B;
    public int C;
    public final Rect D;
    public o1 E;
    public float F;
    public final ah0 G;
    public final ScrollView H;
    public final l1 I;
    public int J;
    public Drawable K;
    public boolean L;
    public View M;
    public p1 N;
    public Rect O;
    public Path P;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public n1 e;
    public float f;
    public float h;
    public boolean n;
    public int r;
    public int s;
    public boolean v;
    public boolean w;
    public ArrayList x;
    public final HashMap y;

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(Context context, f6 f6Var) {
        this(R.drawable.popup_fixed_alert2, 0, context, f6Var);
    }

    public final void a(View view, LinearLayout.LayoutParams layoutParams) {
        this.I.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        this.I.addView(view);
    }

    public final int b(View view) {
        FrameLayout.LayoutParams e = k7.b6.e(-2, -2, this.v ? 80 : 48);
        this.G.addView(view, e);
        return r1.getChildCount() - 1;
    }

    public final void c() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31);
        l1 l1Var = this.I;
        l1Var.measure(makeMeasureSpec, makeMeasureSpec);
        l1Var.getMeasuredHeight();
    }

    public final void d() {
        this.I.removeAllViews();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        l1 l1Var;
        int i10;
        boolean z4;
        int i11;
        int i12;
        Rect rect;
        int i13;
        float f10;
        float f11;
        Canvas canvas2;
        boolean z10;
        boolean z11 = this.c;
        ah0 ah0Var = this.G;
        if (z11) {
            setTranslationX((1.0f - this.f) * getMeasuredWidth());
            View view = this.M;
            if (view != null) {
                view.setTranslationX((1.0f - this.f) * getMeasuredWidth());
                this.M.setAlpha(1.0f - ah0Var.b);
                float f12 = (-(this.M.getMeasuredHeight() - AndroidUtilities.dp(16.0f))) * ah0Var.b;
                this.M.setTranslationY(f12);
                setTranslationY(f12);
            }
        }
        if (this.d) {
            setTranslationY((1.0f - this.h) * getMeasuredHeight());
        }
        if (this.K != null) {
            int i14 = this.B;
            ScrollView scrollView = this.H;
            int scrollY = i14 - (scrollView == null ? 0 : scrollView.getScrollY());
            int scrollY2 = this.C - (scrollView == null ? 0 : scrollView.getScrollY());
            int i15 = 0;
            while (true) {
                l1Var = this.I;
                i10 = 1;
                if (i15 >= l1Var.getChildCount()) {
                    z4 = false;
                    break;
                } else {
                    if ((l1Var.getChildAt(i15) instanceof m1) && l1Var.getChildAt(i15).getVisibility() == 0) {
                        z4 = true;
                        break;
                    }
                    i15++;
                }
            }
            int i16 = 0;
            for (float f13 = 16.0f; i16 < 2 && (i16 != i10 || scrollY >= (-AndroidUtilities.dp(f13))); f13 = 16.0f) {
                int saveCount = canvas.getSaveCount();
                Rect rect2 = this.D;
                if (!z4 || this.r == 255) {
                    i11 = i16;
                    i12 = saveCount;
                    rect = rect2;
                    i13 = -1000000;
                    f10 = 16.0f;
                    f11 = 1.0f;
                    canvas2 = canvas;
                    if (this.B != -1000000) {
                        canvas2.save();
                        canvas2.clipRect(0, rect.top, getMeasuredWidth(), getMeasuredHeight());
                    }
                    z10 = true;
                } else {
                    i11 = i16;
                    i12 = saveCount;
                    rect = rect2;
                    i13 = -1000000;
                    f10 = 16.0f;
                    f11 = 1.0f;
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, rect2.top, getMeasuredWidth(), getMeasuredHeight(), this.r, 31);
                    z10 = false;
                }
                this.K.setAlpha(z10 ? this.r : 255);
                if (this.v) {
                    int measuredHeight = getMeasuredHeight();
                    AndroidUtilities.rectTmp2.set(0, (int) ((f11 - this.h) * measuredHeight), (int) (getMeasuredWidth() * this.f), measuredHeight);
                } else if (scrollY > (-AndroidUtilities.dp(f10))) {
                    int measuredHeight2 = (int) (getMeasuredHeight() * this.h);
                    if (i11 == 0) {
                        if (ah0Var == null || !ah0Var.M) {
                            Rect rect3 = AndroidUtilities.rectTmp2;
                            int dp = (scrollView == null ? 0 : -scrollView.getScrollY()) + (this.B != i13 ? AndroidUtilities.dp(f11) : 0);
                            int measuredWidth = (int) (getMeasuredWidth() * this.f);
                            if (this.B != i13) {
                                measuredHeight2 = Math.min(measuredHeight2, AndroidUtilities.dp(f10) + scrollY);
                            }
                            rect3.set(0, dp, measuredWidth, measuredHeight2);
                        } else {
                            Rect rect4 = AndroidUtilities.rectTmp2;
                            int measuredWidth2 = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f));
                            int dp2 = (scrollView == null ? 0 : -scrollView.getScrollY()) + (this.B != i13 ? AndroidUtilities.dp(f11) : 0);
                            int measuredWidth3 = getMeasuredWidth();
                            if (this.B != i13) {
                                measuredHeight2 = Math.min(measuredHeight2, AndroidUtilities.dp(f10) + scrollY);
                            }
                            rect4.set(measuredWidth2, dp2, measuredWidth3, measuredHeight2);
                        }
                    } else if (measuredHeight2 < scrollY2) {
                        if (this.B != i13) {
                            canvas2.restore();
                        }
                        i16 = i11 + 1;
                        i10 = 1;
                    } else if (ah0Var == null || !ah0Var.M) {
                        AndroidUtilities.rectTmp2.set(0, scrollY2, (int) (getMeasuredWidth() * this.f), measuredHeight2);
                    } else {
                        AndroidUtilities.rectTmp2.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f)), scrollY2, getMeasuredWidth(), measuredHeight2);
                    }
                } else if (ah0Var == null || !ah0Var.M) {
                    AndroidUtilities.rectTmp2.set(0, this.B < 0 ? 0 : -AndroidUtilities.dp(f10), (int) (getMeasuredWidth() * this.f), (int) (getMeasuredHeight() * this.h));
                } else {
                    AndroidUtilities.rectTmp2.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f)), this.B < 0 ? 0 : -AndroidUtilities.dp(f10), getMeasuredWidth(), (int) (getMeasuredHeight() * this.h));
                }
                if (this.F != f11) {
                    if (this.O == null) {
                        this.O = new Rect();
                    }
                    Rect rect5 = this.O;
                    Rect rect6 = AndroidUtilities.rectTmp2;
                    int i17 = rect6.right;
                    int i18 = rect6.top;
                    rect5.set(i17, i18, i17, i18);
                    AndroidUtilities.lerp(this.O, rect6, this.F, rect6);
                }
                Drawable drawable = this.K;
                Rect rect7 = AndroidUtilities.rectTmp2;
                drawable.setBounds(rect7);
                this.K.draw(canvas2);
                if (this.b) {
                    rect7.left += rect.left;
                    rect7.top += rect.top;
                    rect7.right -= rect.right;
                    rect7.bottom -= rect.bottom;
                    canvas2.clipRect(rect7);
                }
                if (z4) {
                    canvas2.save();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(this.K.getBounds());
                    rectF.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    Path path = this.P;
                    if (path == null) {
                        this.P = new Path();
                    } else {
                        path.rewind();
                    }
                    this.P.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                    canvas2.clipPath(this.P);
                    for (int i19 = 0; i19 < l1Var.getChildCount(); i19++) {
                        if ((l1Var.getChildAt(i19) instanceof m1) && l1Var.getChildAt(i19).getVisibility() == 0) {
                            canvas2.save();
                            m1 m1Var = (m1) l1Var.getChildAt(i19);
                            float f14 = 0.0f;
                            View view2 = m1Var;
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
                            m1Var.draw(canvas2);
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
        float f16 = this.F;
        if (f16 == 1.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        Rect rect8 = AndroidUtilities.rectTmp2;
        canvas.saveLayerAlpha(rect8.left, rect8.top, rect8.right, rect8.bottom, (int) (f16 * 255.0f), 31);
        float f17 = (this.F * 0.5f) + 0.5f;
        canvas.scale(f17, f17, rect8.right, rect8.top);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        n1 n1Var = this.e;
        if (n1Var != null) {
            n1Var.n(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e(View view) {
        if (this.w) {
            AnimatorSet animatorSet = new AnimatorSet();
            int i10 = 1;
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, view.isEnabled() ? 1.0f : 0.5f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(this.v ? 6.0f : -6.0f), 0.0f));
            animatorSet.setDuration(180L);
            animatorSet.addListener(new nh.g3(this, animatorSet, view, i10));
            animatorSet.setInterpolator(p1.m);
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
        return this.J;
    }

    public Drawable getBackgroundDrawable() {
        return this.K;
    }

    public int getItemsCount() {
        return this.I.getChildCount();
    }

    public Rect getPadding() {
        return this.D;
    }

    public ah0 getSwipeBack() {
        return this.G;
    }

    public int getViewsCount() {
        return this.I.getChildCount();
    }

    public int getVisibleHeight() {
        return (int) (getMeasuredHeight() * this.h);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ah0 ah0Var = this.G;
        if (ah0Var != null) {
            ah0Var.c(!this.n);
        }
    }

    public void setAnimationEnabled(boolean z4) {
        this.w = z4;
    }

    public void setBackAlpha(int i10) {
        if (this.r != i10) {
            invalidate();
        }
        this.r = i10;
    }

    public void setBackScaleX(float f10) {
        if (this.f != f10) {
            this.f = f10;
            invalidate();
            o1 o1Var = this.E;
            if (o1Var != null) {
                o1Var.a();
            }
        }
    }

    public void setBackScaleY(float f10) {
        if (this.h != f10) {
            this.h = f10;
            if (this.w && this.a) {
                int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
                boolean z4 = this.v;
                HashMap hashMap = this.y;
                l1 l1Var = this.I;
                if (z4) {
                    for (int i10 = this.s; i10 >= 0; i10--) {
                        View childAt = l1Var.getChildAt(i10);
                        if (childAt != null && childAt.getVisibility() == 0 && !(childAt instanceof m1)) {
                            if (((Integer) hashMap.get(childAt)) != null) {
                                if (org.telegram.ui.b.t(32.0f, AndroidUtilities.dp(48.0f) * r5.intValue(), measuredHeight) > measuredHeight * f10) {
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
                        View childAt2 = l1Var.getChildAt(i12);
                        if (childAt2.getVisibility() == 0) {
                            int measuredHeight2 = childAt2.getMeasuredHeight() + i11;
                            if (i12 >= this.s) {
                                if (((Integer) hashMap.get(childAt2)) != null && measuredHeight2 - AndroidUtilities.dp(24.0f) > measuredHeight * f10) {
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
            o1 o1Var = this.E;
            if (o1Var != null) {
                o1Var.a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Drawable drawable;
        if (this.J == i10 || (drawable = this.K) == null) {
            return;
        }
        this.J = i10;
        drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        this.J = -1;
        this.K = drawable;
        if (drawable != null) {
            drawable.getPadding(this.D);
        }
    }

    public void setDispatchKeyEventListener(n1 n1Var) {
        this.e = n1Var;
    }

    public void setFitItems(boolean z4) {
        this.L = z4;
    }

    public void setOnSizeChangedListener(o1 o1Var) {
        this.E = o1Var;
    }

    public void setParentWindow(p1 p1Var) {
        this.N = p1Var;
    }

    public void setReactionsTransitionProgress(float f10) {
        this.F = f10;
        invalidate();
    }

    public void setShownFromBottom(boolean z4) {
        this.v = z4;
    }

    public void setSwipeBackForegroundColor(int i10) {
        getSwipeBack().setForegroundColor(i10);
    }

    public void setTopView(View view) {
        this.M = view;
    }

    public void setupRadialSelectors(int i10) {
        l1 l1Var = this.I;
        int childCount = l1Var.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = l1Var.getChildAt(i11);
            int i12 = 6;
            int i13 = i11 == 0 ? 6 : 0;
            if (i11 != childCount - 1) {
                i12 = 0;
            }
            childAt.setBackground(j6.Y(i10, i13, i12));
            i11++;
        }
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(int i10, int i11, Context context, f6 f6Var) {
        super(context);
        this.f = 1.0f;
        this.h = 1.0f;
        this.n = false;
        this.r = 255;
        this.s = 0;
        this.w = true;
        this.y = new HashMap();
        this.B = -1000000;
        this.C = -1000000;
        Rect rect = new Rect();
        this.D = rect;
        this.F = 1.0f;
        this.J = -1;
        if (i10 != 0) {
            this.K = getResources().getDrawable(i10).mutate();
            setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        }
        Drawable drawable = this.K;
        if (drawable != null) {
            drawable.getPadding(rect);
            setBackgroundColor(j6.v0(j6.G8, f6Var));
        }
        setWillNotDraw(false);
        if ((i11 & 2) > 0) {
            this.v = true;
        }
        if ((i11 & 1) > 0) {
            ah0 ah0Var = new ah0(context);
            ah0Var.a = new SparseIntArray();
            ah0Var.c = -1.0f;
            Paint paint = new Paint(1);
            ah0Var.n = paint;
            ah0Var.r = new Paint();
            ah0Var.s = 0;
            ah0Var.v = new Path();
            ah0Var.w = new RectF();
            ah0Var.x = new ArrayList();
            ah0Var.D = -1;
            ah0Var.E = new AnimationNotificationsLocker();
            ah0Var.G = -1;
            ah0Var.I = new Rect();
            ah0Var.F = f6Var;
            ah0Var.d = new org.telegram.ui.Cells.f1(context, new qr(ah0Var, ViewConfiguration.get(context).getScaledTouchSlop(), 1));
            paint.setColor(-16777216);
            this.G = ah0Var;
            addView(ah0Var, k7.b6.c(-2.0f, -2));
        }
        if ((i11 & 4) == 0) {
            try {
                ScrollView scrollView = new ScrollView(context);
                this.H = scrollView;
                scrollView.getViewTreeObserver().addOnScrollChangedListener(new k1(this));
                scrollView.setVerticalScrollBarEnabled(false);
                ah0 ah0Var2 = this.G;
                if (ah0Var2 != null) {
                    ah0Var2.addView(scrollView, k7.b6.e(-2, -2, this.v ? 80 : 48));
                } else {
                    addView(scrollView, k7.b6.c(-2.0f, -2));
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        l1 l1Var = new l1(this, context);
        this.I = l1Var;
        l1Var.setOrientation(1);
        ScrollView scrollView2 = this.H;
        if (scrollView2 != null) {
            scrollView2.addView(l1Var, new FrameLayout.LayoutParams(-2, -2));
            return;
        }
        ah0 ah0Var3 = this.G;
        if (ah0Var3 != null) {
            ah0Var3.addView(l1Var, k7.b6.e(-2, -2, this.v ? 80 : 48));
        } else {
            addView(l1Var, k7.b6.c(-2.0f, -2));
        }
    }
}
