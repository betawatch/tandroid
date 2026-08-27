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
import org.telegram.ui.ra1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class ScrollSlidingTextTabStrip extends HorizontalScrollView implements org.telegram.ui.ActionBar.x5 {
    public static final /* synthetic */ int k0 = 0;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public float E;
    public int F;
    public final GradientDrawable G;
    public int H;
    public int I;
    public final er J;
    public final SparseIntArray K;
    public final SparseIntArray L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public float O;
    public int P;
    public int Q;
    public int R;
    public float S;
    public float T;
    public long U;
    public View V;
    public final m.i3 W;
    public final ra1 a;
    public lg.d a0;
    public zl0 b;
    public final Path b0;
    public final org.telegram.ui.ActionBar.c6 c;
    public final RectF c0;
    public boolean d;
    public final RectF d0;
    public boolean e;
    public final y5 e0;
    public boolean f;
    public final y5 f0;
    public final y5 g0;
    public int h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public int n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public ScrollSlidingTextTabStrip(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.r = -1;
        this.F = -1;
        this.H = org.telegram.ui.ActionBar.g6.I8;
        this.I = org.telegram.ui.ActionBar.g6.J8;
        er erVar = er.h;
        this.J = erVar;
        this.K = new SparseIntArray(5);
        this.L = new SparseIntArray(5);
        this.M = new SparseIntArray(5);
        this.N = new SparseIntArray(5);
        this.U = 200L;
        this.W = new m.i3(this, 29);
        this.b0 = new Path();
        this.c0 = new RectF();
        this.d0 = new RectF();
        this.e0 = new y5(this, 420L, erVar);
        this.f0 = new y5(this, 420L, erVar);
        this.g0 = new y5(this, 420L, erVar);
        this.i0 = true;
        this.c = c6Var;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.G = gradientDrawable;
        float dpf2 = AndroidUtilities.dpf2(14.0f);
        gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        ra1 ra1Var = new ra1(this, context, 11);
        this.a = ra1Var;
        ra1Var.setOrientation(0);
        ra1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        ra1Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(ra1Var);
        d();
    }

    public final void a(int i10, CharSequence charSequence, SparseArray sparseArray) {
        TextView textView;
        int i11 = this.h;
        this.h = i11 + 1;
        if (i11 == 0 && this.r == -1) {
            this.r = i10;
        }
        this.K.put(i11, i10);
        this.L.put(i10, i11);
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
            textView = new yl0(this, getContext(), i10);
            textView.setGravity(17);
            textView.setTextAlignment(4);
            textView.setTextSize(1, 15.0f);
            textView.setSingleLine();
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            textView.setOnClickListener(new hh.z0(this, i10, 12));
            textView.setOnLongClickListener(new wl0(this, i10, 0));
            NotificationCenter.listenEmojiLoading(textView);
        }
        textView.setText(Emoji.replaceEmoji(charSequence, textView.getPaint().getFontMetricsInt(), false));
        int dp = AndroidUtilities.dp(32.0f) + ((int) Math.ceil(lh.w3.g(r6, textView.getPaint())));
        this.a.addView(textView, h7.z5.n(0, -1));
        this.s += dp;
        this.N.put(i11, dp);
        d();
    }

    public final void b() {
        float d = this.e0.d(1.0f, false);
        float paddingLeft = getPaddingLeft();
        float measuredWidth = getMeasuredWidth() - getPaddingRight();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.d0;
        rectF.set(paddingLeft, 0.0f, measuredWidth, measuredHeight);
        rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        RectF rectF2 = this.c0;
        if (d >= 1.0f) {
            rectF2.set(rectF);
        } else {
            AndroidUtilities.lerp(rectF2, rectF, d, rectF);
        }
        float height = rectF.height() / 2.0f;
        Path path = this.b0;
        path.rewind();
        path.addRoundRect(rectF, height, height, Path.Direction.CW);
        lg.d dVar = this.a0;
        if (dVar != null) {
            dVar.setAlpha(255);
            this.a0.setBounds(((int) rectF.left) - AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f) + ((int) rectF.right), getMeasuredHeight());
            this.a0.p(height);
        }
    }

    public final void c() {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        ra1 ra1Var = this.a;
        int childCount = ra1Var.getChildCount();
        int i10 = 0;
        while (true) {
            sparseIntArray = this.M;
            sparseIntArray2 = this.N;
            if (i10 >= childCount) {
                break;
            }
            TextView textView = (TextView) ra1Var.getChildAt(i10);
            textView.setTag(Integer.valueOf(this.n == i10 ? this.H : this.I));
            textView.setTextColor(f(org.telegram.ui.ActionBar.g6.v0(this.n == i10 ? this.H : this.I, this.c)));
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

    @Override // org.telegram.ui.ActionBar.x5
    public final void d() {
        ra1 ra1Var = this.a;
        int childCount = ra1Var.getChildCount();
        int i10 = 0;
        while (true) {
            org.telegram.ui.ActionBar.c6 c6Var = this.c;
            if (i10 >= childCount) {
                this.G.setColor(org.telegram.ui.ActionBar.g6.l1(0.15f, f(org.telegram.ui.ActionBar.g6.v0(this.H, c6Var))));
                invalidate();
                return;
            } else {
                TextView textView = (TextView) ra1Var.getChildAt(i10);
                textView.setTextColor(f(org.telegram.ui.ActionBar.g6.v0(this.n == i10 ? this.H : this.I, c6Var)));
                textView.setBackground(new InsetDrawable((Drawable) org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.l1(0.15f, f(org.telegram.ui.ActionBar.g6.v0(this.H, c6Var))), 7, AndroidUtilities.dp(14.0f)), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                i10++;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        if (this.a0 != null) {
            if (this.e0.d(1.0f, false) < 1.0f) {
                b();
            }
            canvas.translate(getScrollX(), 0.0f);
            this.a0.n = this.g0.e(this.i0);
            this.a0.draw(canvas);
            canvas.clipPath(this.b0);
            canvas.translate(-getScrollX(), 0.0f);
            canvas.translate(this.f0.d(0.0f, false), 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ra1 ra1Var = this.a;
        if (view != ra1Var) {
            return super.drawChild(canvas, view, j10);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        int measuredHeight = getMeasuredHeight();
        float f10 = this.v + this.S;
        float f11 = this.w + f10 + this.T;
        View childAt = ra1Var.getChildAt(this.n);
        if (this.j0 && childAt != null) {
            f10 += childAt.getTranslationX();
            f11 += childAt.getTranslationX();
        }
        GradientDrawable gradientDrawable = this.G;
        int alpha = gradientDrawable.getAlpha();
        gradientDrawable.setAlpha((int) (ra1Var.getAlpha() * alpha));
        gradientDrawable.setBounds(AndroidUtilities.dp(4.0f) + getPaddingLeft() + ((int) f10), AndroidUtilities.dp(4.0f) + getPaddingTop(), (getPaddingLeft() + ((int) f11)) - AndroidUtilities.dp(4.0f), (measuredHeight - getPaddingBottom()) - AndroidUtilities.dp(4.0f));
        gradientDrawable.draw(canvas);
        gradientDrawable.setAlpha(alpha);
        return drawChild;
    }

    public final boolean e(int i10) {
        return this.L.get(i10, -1) != -1;
    }

    public final SparseArray g() {
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            ra1 ra1Var = this.a;
            int childCount = ra1Var.getChildCount();
            SparseIntArray sparseIntArray = this.K;
            if (i10 >= childCount) {
                sparseIntArray.clear();
                this.L.clear();
                this.M.clear();
                this.N.clear();
                ra1Var.removeAllViews();
                this.s = 0;
                this.h = 0;
                return sparseArray;
            }
            sparseArray.put(sparseIntArray.get(i10), ra1Var.getChildAt(i10));
            i10++;
        }
    }

    public float getAnimationIdicatorProgress() {
        return this.E;
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
        return this.K.get(0, 0);
    }

    public Drawable getSelectorDrawable() {
        return this.G;
    }

    public ArrayList<Integer> getTabIds() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < this.a.getChildCount(); i10++) {
            arrayList.add(Integer.valueOf(this.K.get(i10)));
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
        zl0 zl0Var;
        if (i11 >= 0) {
            if (view == null && this.D) {
                return;
            }
            int i12 = this.n;
            if (i11 == i12 && (zl0Var = this.b) != null) {
                zl0Var.w();
                return;
            }
            boolean z10 = i12 < i11;
            this.F = -1;
            this.P = i12;
            this.n = i11;
            this.r = i10;
            boolean z11 = this.D;
            m.i3 i3Var = this.W;
            if (z11) {
                AndroidUtilities.cancelRunOnUIThread(i3Var);
                this.D = false;
            }
            this.O = 0.0f;
            this.D = true;
            this.y = this.v;
            this.A = this.w;
            if (view != null) {
                TextView textView = (TextView) view;
                textView.getLayout();
                this.C = textView.getMeasuredWidth();
                this.B = i0.a.B(textView.getMeasuredWidth(), this.C, 2, textView.getLeft());
            }
            setEnabled(false);
            AndroidUtilities.runOnUIThread(i3Var, 16L);
            zl0 zl0Var2 = this.b;
            if (zl0Var2 != null) {
                zl0Var2.b(i10, z10);
            }
            i(i11, true);
        }
    }

    public final void i(int i10, boolean z10) {
        if (this.h == 0 || this.F == i10) {
            return;
        }
        this.F = i10;
        TextView textView = (TextView) this.a.getChildAt(i10);
        if (textView == null) {
            return;
        }
        int scrollX = getScrollX();
        int left = textView.getLeft();
        int measuredWidth = textView.getMeasuredWidth();
        if (left - AndroidUtilities.dp(50.0f) < scrollX) {
            if (z10) {
                smoothScrollTo(left - AndroidUtilities.dp(50.0f), 0);
                return;
            } else {
                scrollTo(left - AndroidUtilities.dp(50.0f), 0);
                return;
            }
        }
        int i11 = left + measuredWidth;
        if (AndroidUtilities.dp(21.0f) + i11 > getWidth() + scrollX) {
            if (z10) {
                smoothScrollTo(i11, 0);
            } else {
                scrollTo(i11, 0);
            }
        }
    }

    public final void j(float f10, int i10) {
        int i11;
        int i12 = this.L.get(i10, -1);
        if (i12 >= 0 && (i11 = this.n) != i12) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            } else if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            ra1 ra1Var = this.a;
            TextView textView = (TextView) ra1Var.getChildAt(i11);
            TextView textView2 = (TextView) ra1Var.getChildAt(i12);
            if (textView != null && textView2 != null) {
                textView.getLayout();
                this.A = textView.getMeasuredWidth();
                this.y = i0.a.B(textView.getMeasuredWidth(), this.A, 2, textView.getLeft());
                textView2.getLayout();
                this.C = textView2.getMeasuredWidth();
                this.B = i0.a.B(textView2.getMeasuredWidth(), this.C, 2, textView2.getLeft());
                k(textView2, textView, f10);
                if (f10 >= 1.0f) {
                    textView.setTag(Integer.valueOf(this.I));
                    textView2.setTag(Integer.valueOf(this.H));
                }
                i(ra1Var.indexOfChild(textView2), true);
            }
            if (f10 >= 1.0f) {
                this.n = i12;
                this.r = i10;
            }
        }
    }

    public final void k(TextView textView, TextView textView2, float f10) {
        int i10 = this.H;
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        int f11 = f(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        int f12 = f(org.telegram.ui.ActionBar.g6.v0(this.I, c6Var));
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
        this.v = (int) (((this.B - r14) * f10) + this.y);
        this.w = (int) (((this.C - r14) * f10) + this.A);
        invalidate();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = i12 - i10;
        if (this.x != i15) {
            this.x = i15;
            this.F = -1;
            if (this.D) {
                AndroidUtilities.cancelRunOnUIThread(this.W);
                this.D = false;
                setEnabled(true);
                zl0 zl0Var = this.b;
                if (zl0Var != null) {
                    zl0Var.o0(1.0f);
                }
            }
            TextView textView = (TextView) this.a.getChildAt(this.n);
            if (textView != null) {
                textView.getLayout();
                this.w = textView.getMeasuredWidth();
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                int i16 = this.w;
                int B = i0.a.B(measuredWidth, i16, 2, left);
                this.v = B;
                int i17 = this.Q;
                if (i17 > 0 && (i14 = this.R) > 0) {
                    if (i17 != B || i14 != i16) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.addUpdateListener(new lh.t4(this, i17 - B, i14 - i16, 3));
                        ofFloat.setDuration(200L);
                        ofFloat.setInterpolator(er.f);
                        ofFloat.start();
                    }
                    this.Q = 0;
                    this.R = 0;
                }
            }
        }
        b();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(22.0f);
        ra1 ra1Var = this.a;
        int childCount = ra1Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = ra1Var.getChildAt(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            float f10 = layoutParams.weight;
            int i13 = layoutParams.width;
            boolean z10 = this.e;
            SparseIntArray sparseIntArray = this.N;
            if (z10) {
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
        float weightSum = ra1Var.getWeightSum();
        if (childCount == 1 || this.s > size) {
            ra1Var.setWeightSum(0.0f);
        } else {
            ra1Var.setWeightSum(1.0f);
        }
        if (Math.abs(weightSum - ra1Var.getWeightSum()) > 0.1f) {
            ra1Var.requestLayout();
        }
        super.onMeasure(i10, i11);
        this.f = getMeasuredWidth() < View.MeasureSpec.getSize(i10);
        b();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.E = f10;
        int i10 = this.n;
        ra1 ra1Var = this.a;
        TextView textView = (TextView) ra1Var.getChildAt(i10);
        TextView textView2 = (TextView) ra1Var.getChildAt(this.P);
        if (textView2 == null || textView == null) {
            return;
        }
        k(textView, textView2, f10);
        if (f10 >= 1.0f) {
            textView2.setTag(Integer.valueOf(this.I));
            textView.setTag(Integer.valueOf(this.H));
        }
        zl0 zl0Var = this.b;
        if (zl0Var != null) {
            zl0Var.o0(f10);
        }
    }

    public void setBlurredBackground(lg.d dVar) {
        this.a0 = dVar;
        dVar.setCallback(this);
    }

    public void setDelegate(zl0 zl0Var) {
        this.b = zl0Var;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ra1 ra1Var = this.a;
        int childCount = ra1Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ra1Var.getChildAt(i10).setEnabled(z10);
        }
    }

    public void setInitialTabId(int i10) {
        this.h0 = true;
        this.r = i10;
        int i11 = this.L.get(i10);
        if (((TextView) this.a.getChildAt(i11)) != null) {
            this.n = i11;
            this.x = 0;
            c();
            requestLayout();
        }
    }

    public void setOpen(boolean z10) {
        if (z10 == this.i0) {
            return;
        }
        this.i0 = z10;
        setPadding(AndroidUtilities.dp(z10 ? 0.0f : 6.0f), getPaddingTop(), AndroidUtilities.dp(this.i0 ? 0.0f : 6.0f), getPaddingBottom());
        invalidate();
        if (!this.f) {
            this.c0.set(this.d0);
            this.e0.d(0.0f, true);
            this.f0.d(AndroidUtilities.dp(this.i0 ? 6.0f : -6.0f), true);
        }
        b();
    }

    public void setReordering(boolean z10) {
        if (this.j0 == z10) {
            return;
        }
        this.j0 = z10;
        AndroidUtilities.forEachViews(this.a, new j4.w0(18));
    }

    public void setUseMinimalWidth(boolean z10) {
        this.e = z10;
        this.a.setLayoutParams(new FrameLayout.LayoutParams(this.e ? -2 : -1, -1));
    }

    public void setUseSameWidth(boolean z10) {
        this.d = z10;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a0 || super.verifyDrawable(drawable);
    }

    public int f(int i10) {
        return i10;
    }
}
