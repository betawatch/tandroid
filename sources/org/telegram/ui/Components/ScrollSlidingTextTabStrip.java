package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.hb1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class ScrollSlidingTextTabStrip extends HorizontalScrollView implements org.telegram.ui.ActionBar.a6 {
    public static final /* synthetic */ int l0 = 0;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public float F;
    public int G;
    public final GradientDrawable H;
    public int I;
    public int J;
    public final nr K;
    public final SparseIntArray L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public final SparseIntArray O;
    public float P;
    public int Q;
    public int R;
    public int S;
    public float T;
    public float U;
    public long V;
    public View W;
    public final hb1 a;
    public final tl0 a0;
    public tm0 b;
    public pg.b b0;
    public final org.telegram.ui.ActionBar.f6 c;
    public final Path c0;
    public boolean d;
    public final RectF d0;
    public boolean e;
    public final RectF e0;
    public boolean f;
    public final z5 f0;
    public final z5 g0;
    public int h;
    public final z5 h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public int n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public ScrollSlidingTextTabStrip(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.r = -1;
        this.G = -1;
        this.I = org.telegram.ui.ActionBar.j6.I8;
        this.J = org.telegram.ui.ActionBar.j6.J8;
        nr nrVar = nr.h;
        this.K = nrVar;
        this.L = new SparseIntArray(5);
        this.M = new SparseIntArray(5);
        this.N = new SparseIntArray(5);
        this.O = new SparseIntArray(5);
        this.V = 200L;
        this.a0 = new tl0(this, 1);
        this.c0 = new Path();
        this.d0 = new RectF();
        this.e0 = new RectF();
        this.f0 = new z5(this, 420L, nrVar);
        this.g0 = new z5(this, 420L, nrVar);
        this.h0 = new z5(this, 420L, nrVar);
        this.j0 = true;
        this.c = f6Var;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.H = gradientDrawable;
        float dpf2 = AndroidUtilities.dpf2(14.0f);
        gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        hb1 hb1Var = new hb1(this, context, 10);
        this.a = hb1Var;
        hb1Var.setOrientation(0);
        hb1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        hb1Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(hb1Var);
        e();
    }

    public final void a(int i10, CharSequence charSequence, SparseArray sparseArray) {
        TextView textView;
        int i11 = this.h;
        this.h = i11 + 1;
        if (i11 == 0 && this.r == -1) {
            this.r = i10;
        }
        this.L.put(i11, i10);
        this.M.put(i10, i11);
        int i12 = this.r;
        if (i12 != -1 && i12 == i10) {
            this.n = i11;
            this.x = 0;
        }
        if (sparseArray != null) {
            textView = (TextView) sparseArray.get(i10);
            sparseArray.delete(i10);
        } else {
            textView = null;
        }
        if (textView == null) {
            textView = new sm0(this, getContext(), i10);
            textView.setGravity(17);
            textView.setTextAlignment(4);
            textView.setTextSize(1, 15.0f);
            textView.setSingleLine();
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            textView.setOnClickListener(new lh.y0(this, i10, 10));
            textView.setOnLongClickListener(new qm0(this, i10, 0));
            NotificationCenter.listenEmojiLoading(textView);
        }
        textView.setText(Emoji.replaceEmoji(charSequence, textView.getPaint().getFontMetricsInt(), false));
        int dp = AndroidUtilities.dp(32.0f) + ((int) Math.ceil(ph.f3.g(r6, textView.getPaint())));
        this.a.addView(textView, k7.b6.n(0, -1));
        this.s += dp;
        this.O.put(i11, dp);
        e();
    }

    public final void b() {
        float d = this.f0.d(1.0f, false);
        float paddingLeft = getPaddingLeft();
        float measuredWidth = getMeasuredWidth() - getPaddingRight();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.e0;
        rectF.set(paddingLeft, 0.0f, measuredWidth, measuredHeight);
        rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        RectF rectF2 = this.d0;
        if (d >= 1.0f) {
            rectF2.set(rectF);
        } else {
            AndroidUtilities.lerp(rectF2, rectF, d, rectF);
        }
        float height = rectF.height() / 2.0f;
        Path path = this.c0;
        path.rewind();
        path.addRoundRect(rectF, height, height, Path.Direction.CW);
        pg.b bVar = this.b0;
        if (bVar != null) {
            bVar.setAlpha(255);
            this.b0.setBounds(((int) rectF.left) - AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f) + ((int) rectF.right), getMeasuredHeight());
            this.b0.p(height);
        }
    }

    public final void c() {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        hb1 hb1Var = this.a;
        int childCount = hb1Var.getChildCount();
        int i10 = 0;
        while (true) {
            sparseIntArray = this.N;
            sparseIntArray2 = this.O;
            if (i10 >= childCount) {
                break;
            }
            TextView textView = (TextView) hb1Var.getChildAt(i10);
            textView.setTag(Integer.valueOf(this.n == i10 ? this.I : this.J));
            textView.setTextColor(f(org.telegram.ui.ActionBar.j6.v0(this.n == i10 ? this.I : this.J, this.c)));
            if (this.e) {
                if (sparseIntArray.size() != sparseIntArray2.size() || sparseIntArray.get(i10) != sparseIntArray2.get(i10)) {
                    textView.requestLayout();
                }
            } else if (i10 == 0) {
                int i11 = textView.getLayoutParams().width;
                textView.getLayoutParams().width = childCount == 1 ? -2 : 0;
                if (i11 != textView.getLayoutParams().width) {
                    textView.requestLayout();
                }
            }
            i10++;
        }
        sparseIntArray.clear();
        for (int i12 = 0; i12 < sparseIntArray2.size(); i12++) {
            sparseIntArray.put(sparseIntArray2.keyAt(i12), sparseIntArray2.valueAt(i12));
        }
    }

    public final boolean d(int i10) {
        return this.M.get(i10, -1) != -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        if (this.b0 != null) {
            if (this.f0.d(1.0f, false) < 1.0f) {
                b();
            }
            canvas.translate(getScrollX(), 0.0f);
            this.b0.n = this.h0.e(this.j0);
            this.b0.draw(canvas);
            canvas.clipPath(this.c0);
            canvas.translate(-getScrollX(), 0.0f);
            canvas.translate(this.g0.d(0.0f, false), 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        hb1 hb1Var = this.a;
        if (view != hb1Var) {
            return super.drawChild(canvas, view, j10);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        int measuredHeight = getMeasuredHeight();
        float f10 = this.v + this.T;
        float f11 = this.w + f10 + this.U;
        View childAt = hb1Var.getChildAt(this.n);
        if (this.k0 && childAt != null) {
            f10 += childAt.getTranslationX();
            f11 += childAt.getTranslationX();
        }
        GradientDrawable gradientDrawable = this.H;
        int alpha = gradientDrawable.getAlpha();
        gradientDrawable.setAlpha((int) (hb1Var.getAlpha() * alpha));
        gradientDrawable.setBounds(AndroidUtilities.dp(4.0f) + getPaddingLeft() + ((int) f10), AndroidUtilities.dp(4.0f) + getPaddingTop(), (getPaddingLeft() + ((int) f11)) - AndroidUtilities.dp(4.0f), (measuredHeight - getPaddingBottom()) - AndroidUtilities.dp(4.0f));
        gradientDrawable.draw(canvas);
        gradientDrawable.setAlpha(alpha);
        return drawChild;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        hb1 hb1Var = this.a;
        int childCount = hb1Var.getChildCount();
        int i10 = 0;
        while (true) {
            org.telegram.ui.ActionBar.f6 f6Var = this.c;
            if (i10 >= childCount) {
                this.H.setColor(org.telegram.ui.ActionBar.j6.l1(0.15f, f(org.telegram.ui.ActionBar.j6.v0(this.I, f6Var))));
                invalidate();
                return;
            } else {
                TextView textView = (TextView) hb1Var.getChildAt(i10);
                textView.setTextColor(f(org.telegram.ui.ActionBar.j6.v0(this.n == i10 ? this.I : this.J, f6Var)));
                textView.setBackground(new InsetDrawable((Drawable) org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.15f, f(org.telegram.ui.ActionBar.j6.v0(this.I, f6Var))), 7, AndroidUtilities.dp(14.0f)), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                i10++;
            }
        }
    }

    public final SparseArray g() {
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            hb1 hb1Var = this.a;
            int childCount = hb1Var.getChildCount();
            SparseIntArray sparseIntArray = this.L;
            if (i10 >= childCount) {
                sparseIntArray.clear();
                this.M.clear();
                this.N.clear();
                this.O.clear();
                hb1Var.removeAllViews();
                this.s = 0;
                this.h = 0;
                return sparseArray;
            }
            sparseArray.put(sparseIntArray.get(i10), hb1Var.getChildAt(i10));
            i10++;
        }
    }

    public float getAnimationIdicatorProgress() {
        return this.F;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public int getCurrentPosition() {
        return this.n;
    }

    public int getCurrentTabId() {
        return this.r;
    }

    public int getFirstTabId() {
        return this.L.get(0, 0);
    }

    public Drawable getSelectorDrawable() {
        return this.H;
    }

    public ArrayList<Integer> getTabIds() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < this.a.getChildCount(); i10++) {
            arrayList.add(Integer.valueOf(this.L.get(i10)));
        }
        return arrayList;
    }

    public ViewGroup getTabsContainer() {
        return this.a;
    }

    public int getTabsCount() {
        return this.h;
    }

    public final void h(View view, int i10, int i11) {
        tm0 tm0Var;
        if (i11 >= 0) {
            if (view == null && this.E) {
                return;
            }
            int i12 = this.n;
            if (i11 == i12 && (tm0Var = this.b) != null) {
                tm0Var.C();
                return;
            }
            boolean z4 = i12 < i11;
            this.G = -1;
            this.Q = i12;
            this.n = i11;
            this.r = i10;
            boolean z10 = this.E;
            tl0 tl0Var = this.a0;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(tl0Var);
                this.E = false;
            }
            this.P = 0.0f;
            this.E = true;
            this.y = this.v;
            this.B = this.w;
            if (view != null) {
                TextView textView = (TextView) view;
                textView.getLayout();
                this.D = textView.getMeasuredWidth();
                this.C = kh.a2.d(textView.getMeasuredWidth(), this.D, 2, textView.getLeft());
            }
            setEnabled(false);
            AndroidUtilities.runOnUIThread(tl0Var, 16L);
            tm0 tm0Var2 = this.b;
            if (tm0Var2 != null) {
                tm0Var2.f(i10, z4);
            }
            i(i11, true);
        }
    }

    public final void i(int i10, boolean z4) {
        if (this.h == 0 || this.G == i10) {
            return;
        }
        this.G = i10;
        TextView textView = (TextView) this.a.getChildAt(i10);
        if (textView == null) {
            return;
        }
        int scrollX = getScrollX();
        int left = textView.getLeft();
        int measuredWidth = textView.getMeasuredWidth();
        if (left - AndroidUtilities.dp(50.0f) < scrollX) {
            if (z4) {
                smoothScrollTo(left - AndroidUtilities.dp(50.0f), 0);
                return;
            } else {
                scrollTo(left - AndroidUtilities.dp(50.0f), 0);
                return;
            }
        }
        int i11 = left + measuredWidth;
        if (AndroidUtilities.dp(21.0f) + i11 > getWidth() + scrollX) {
            if (z4) {
                smoothScrollTo(i11, 0);
            } else {
                scrollTo(i11, 0);
            }
        }
    }

    public final void j(float f10, int i10) {
        int i11;
        int i12 = this.M.get(i10, -1);
        if (i12 >= 0 && (i11 = this.n) != i12) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            } else if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            hb1 hb1Var = this.a;
            TextView textView = (TextView) hb1Var.getChildAt(i11);
            TextView textView2 = (TextView) hb1Var.getChildAt(i12);
            if (textView != null && textView2 != null) {
                textView.getLayout();
                this.B = textView.getMeasuredWidth();
                this.y = kh.a2.d(textView.getMeasuredWidth(), this.B, 2, textView.getLeft());
                textView2.getLayout();
                this.D = textView2.getMeasuredWidth();
                this.C = kh.a2.d(textView2.getMeasuredWidth(), this.D, 2, textView2.getLeft());
                k(textView2, textView, f10);
                if (f10 >= 1.0f) {
                    textView.setTag(Integer.valueOf(this.J));
                    textView2.setTag(Integer.valueOf(this.I));
                }
                i(hb1Var.indexOfChild(textView2), true);
            }
            if (f10 >= 1.0f) {
                this.n = i12;
                this.r = i10;
            }
        }
    }

    public final void k(TextView textView, TextView textView2, float f10) {
        int i10 = this.I;
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        int f11 = f(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        int f12 = f(org.telegram.ui.ActionBar.j6.v0(this.J, f6Var));
        int red = Color.red(f11);
        int green = Color.green(f11);
        int blue = Color.blue(f11);
        int alpha = Color.alpha(f11);
        int red2 = Color.red(f12);
        int green2 = Color.green(f12);
        int blue2 = Color.blue(f12);
        int alpha2 = Color.alpha(f12);
        textView2.setTextColor(Color.argb((int) (((alpha2 - alpha) * f10) + alpha), (int) (((red2 - red) * f10) + red), (int) (((green2 - green) * f10) + green), (int) (((blue2 - blue) * f10) + blue)));
        textView.setTextColor(Color.argb((int) (((alpha - alpha2) * f10) + alpha2), (int) (((red - red2) * f10) + red2), (int) (((green - green2) * f10) + green2), (int) (((blue - blue2) * f10) + blue2)));
        this.v = (int) (((this.C - r14) * f10) + this.y);
        this.w = (int) (((this.D - r14) * f10) + this.B);
        invalidate();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z4, i10, i11, i12, i13);
        int i15 = i12 - i10;
        if (this.x != i15) {
            this.x = i15;
            this.G = -1;
            if (this.E) {
                AndroidUtilities.cancelRunOnUIThread(this.a0);
                this.E = false;
                setEnabled(true);
                tm0 tm0Var = this.b;
                if (tm0Var != null) {
                    tm0Var.v0(1.0f);
                }
            }
            TextView textView = (TextView) this.a.getChildAt(this.n);
            if (textView != null) {
                textView.getLayout();
                this.w = textView.getMeasuredWidth();
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                int i16 = this.w;
                int d = kh.a2.d(measuredWidth, i16, 2, left);
                this.v = d;
                int i17 = this.R;
                if (i17 > 0 && (i14 = this.S) > 0) {
                    if (i17 != d || i14 != i16) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.addUpdateListener(new dg.g0(this, i17 - d, i14 - i16, 3));
                        ofFloat.setDuration(200L);
                        ofFloat.setInterpolator(nr.f);
                        ofFloat.start();
                    }
                    this.R = 0;
                    this.S = 0;
                }
            }
        }
        b();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(22.0f);
        hb1 hb1Var = this.a;
        int childCount = hb1Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = hb1Var.getChildAt(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            float f10 = layoutParams.weight;
            int i13 = layoutParams.width;
            boolean z4 = this.e;
            SparseIntArray sparseIntArray = this.O;
            if (z4) {
                layoutParams.weight = 0.0f;
                layoutParams.width = sparseIntArray.get(i12);
            } else {
                int i14 = this.s;
                if (i14 > size) {
                    layoutParams.weight = 0.0f;
                    layoutParams.width = -2;
                } else if (this.d) {
                    layoutParams.weight = 1.0f / childCount;
                    layoutParams.width = 0;
                } else if (i12 == 0 && childCount == 1) {
                    layoutParams.weight = 0.0f;
                    layoutParams.width = -2;
                } else {
                    layoutParams.weight = AndroidUtilities.lerp(1.0f / childCount, (1.0f / i14) * sparseIntArray.get(i12), 0.5f);
                    layoutParams.width = -2;
                }
            }
            if (Math.abs(f10 - layoutParams.weight) > 0.001f || i13 != layoutParams.width) {
                childAt.setLayoutParams(layoutParams);
                childAt.requestLayout();
            }
        }
        float weightSum = hb1Var.getWeightSum();
        if (childCount == 1 || this.s > size) {
            hb1Var.setWeightSum(0.0f);
        } else {
            hb1Var.setWeightSum(1.0f);
        }
        if (Math.abs(weightSum - hb1Var.getWeightSum()) > 0.1f) {
            hb1Var.requestLayout();
        }
        super.onMeasure(i10, i11);
        this.f = getMeasuredWidth() < View.MeasureSpec.getSize(i10);
        b();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.F = f10;
        int i10 = this.n;
        hb1 hb1Var = this.a;
        TextView textView = (TextView) hb1Var.getChildAt(i10);
        TextView textView2 = (TextView) hb1Var.getChildAt(this.Q);
        if (textView2 == null || textView == null) {
            return;
        }
        k(textView, textView2, f10);
        if (f10 >= 1.0f) {
            textView2.setTag(Integer.valueOf(this.J));
            textView.setTag(Integer.valueOf(this.I));
        }
        tm0 tm0Var = this.b;
        if (tm0Var != null) {
            tm0Var.v0(f10);
        }
    }

    public void setBlurredBackground(pg.b bVar) {
        this.b0 = bVar;
        bVar.setCallback(this);
    }

    public void setDelegate(tm0 tm0Var) {
        this.b = tm0Var;
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        hb1 hb1Var = this.a;
        int childCount = hb1Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            hb1Var.getChildAt(i10).setEnabled(z4);
        }
    }

    public void setInitialTabId(int i10) {
        this.i0 = true;
        this.r = i10;
        int i11 = this.M.get(i10);
        if (((TextView) this.a.getChildAt(i11)) != null) {
            this.n = i11;
            this.x = 0;
            c();
            requestLayout();
        }
    }

    public void setOpen(boolean z4) {
        if (z4 == this.j0) {
            return;
        }
        this.j0 = z4;
        setPadding(AndroidUtilities.dp(z4 ? 0.0f : 6.0f), getPaddingTop(), AndroidUtilities.dp(this.j0 ? 0.0f : 6.0f), getPaddingBottom());
        invalidate();
        if (!this.f) {
            this.d0.set(this.e0);
            this.f0.d(0.0f, true);
            this.g0.d(AndroidUtilities.dp(this.j0 ? 6.0f : -6.0f), true);
        }
        b();
    }

    public void setReordering(boolean z4) {
        if (this.k0 == z4) {
            return;
        }
        this.k0 = z4;
        AndroidUtilities.forEachViews(this.a, new nh.e(19));
    }

    public void setUseMinimalWidth(boolean z4) {
        this.e = z4;
        this.a.setLayoutParams(new FrameLayout.LayoutParams(this.e ? -2 : -1, -1));
    }

    public void setUseSameWidth(boolean z4) {
        this.d = z4;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b0 || super.verifyDrawable(drawable);
    }

    public int f(int i10) {
        return i10;
    }
}
