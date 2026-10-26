package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class m20 extends FrameLayout implements oe.d, org.telegram.ui.ActionBar.p6 {
    public final AnimationNotificationsLocker E;
    public final ArrayList F;
    public final org.telegram.ui.xa1 G;
    public l20 H;
    public int I;
    public final oe.b a;
    public final oe.b b;
    public final oe.e c;
    public final org.telegram.ui.ActionBar.u6 d;
    public final ImageView e;
    public final ImageView f;
    public final LinearLayout h;
    public boolean n;
    public final fi.c2 r;
    public eh.d s;
    public Drawable v;
    public boolean w;
    public boolean x;
    public Runnable y;

    public m20(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        ds dsVar = ds.h;
        this.a = new oe.b(0, this, dsVar, 380L, false);
        this.b = new oe.b(1, this, dsVar, 380L, true);
        this.c = new oe.e(2, this, ne.a.a, 280L);
        this.E = new AnimationNotificationsLocker();
        this.F = new ArrayList();
        this.d = u6Var;
        fi.c2 c2Var = new fi.c2(this, context, 5);
        this.r = c2Var;
        c2Var.setTextSize(1, 15.0f);
        c2Var.setCursorWidth(1.5f);
        c2Var.setInputType(c2Var.getInputType() | 176);
        c2Var.setSingleLine(true);
        c2Var.setBackground(null);
        c2Var.setVerticalScrollBarEnabled(false);
        c2Var.setHorizontalScrollBarEnabled(false);
        c2Var.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        c2Var.setClipToPadding(true);
        c2Var.setImeOptions(268435459);
        c2Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        c2Var.addTextChangedListener(new bi.u(this, 10));
        if (Build.VERSION.SDK_INT >= 35) {
            c2Var.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(c2Var, gb1.h(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.outline_search_1_24);
        addView(imageView, gb1.h(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, gb1.h(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 32.0f, 0.0f, 32.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.miniplayer_close);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new f0(this, 16));
        addView(imageView2, gb1.h(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        org.telegram.ui.xa1 xa1Var = new org.telegram.ui.xa1(this, getContext(), 10);
        this.G = xa1Var;
        xa1Var.setOrientation(0);
        xa1Var.setVisibility(0);
        addView(xa1Var, gb1.h(-2, 32.0f, (LocaleController.isRTL ? 5 : 3) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        setWillNotDraw(false);
        b();
        updateColors();
    }

    @Override // oe.d
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 == 0) {
            ImageView imageView = this.f;
            j20.d(imageView, f7);
            imageView.setRotation((1.0f - f7) * 90.0f);
        } else if (i10 == 1) {
            j20.d(this.e, f7);
        } else if (i10 == 2) {
            b();
        }
    }

    public final void a(org.telegram.ui.ActionBar.w0 w0Var) {
        this.h.addView(w0Var);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Yh));
    }

    public final void b() {
        int max = Math.max(AndroidUtilities.dp(6.0f) + ((int) this.c.f), AndroidUtilities.dp(48.0f));
        int measuredWidth = this.h.getMeasuredWidth() + AndroidUtilities.dp(48.0f);
        boolean z10 = LocaleController.isRTL;
        int i10 = z10 ? measuredWidth : max;
        if (!z10) {
            max = measuredWidth;
        }
        Rect rect = AndroidUtilities.rectTmp2;
        fi.c2 c2Var = this.r;
        rect.set(i10, 0, c2Var.getMeasuredWidth() - max, c2Var.getMeasuredHeight());
        c2Var.setClipBounds(rect);
        c2Var.setPadding(i10, 0, max, 0);
    }

    public final void c() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 >= arrayList.size()) {
                e();
                return;
            }
            if (((ig.p0) arrayList.get(i10)).h) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    public final boolean d() {
        ArrayList arrayList = this.F;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((ig.p0) arrayList.get(i10)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Drawable drawable = this.v;
        if (drawable != null) {
            drawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.v.draw(canvas);
        }
        eh.d dVar = this.s;
        if (dVar != null) {
            dVar.setBounds(getPaddingLeft() - AndroidUtilities.dp(4.0f), getPaddingTop() - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (getWidth() - getPaddingRight()), AndroidUtilities.dp(4.0f) + (getHeight() - getPaddingBottom()));
            this.s.draw(canvas);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e() {
        ArrayList arrayList = this.F;
        boolean isEmpty = arrayList.isEmpty();
        this.b.a(isEmpty, true);
        ArrayList arrayList2 = new ArrayList(arrayList);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.n0(1).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) ds.g);
        transitionSet.addListener((Transition.TransitionListener) new k20(this));
        org.telegram.ui.xa1 xa1Var = this.G;
        TransitionManager.beginDelayedTransition(xa1Var, transitionSet);
        int i10 = 0;
        while (i10 < xa1Var.getChildCount()) {
            if (!arrayList2.remove(((org.telegram.ui.ActionBar.v0) xa1Var.getChildAt(i10)).getFilter())) {
                xa1Var.removeViewAt(i10);
                i10--;
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ig.p0 p0Var = (ig.p0) arrayList2.get(i11);
            p0Var.getClass();
            org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(getContext(), this.d);
            v0Var.r = true;
            v0Var.updateColors();
            v0Var.setData(p0Var);
            v0Var.setOnClickListener(new ga(16, this, v0Var));
            boolean z10 = LocaleController.isRTL;
            xa1Var.addView(v0Var, gb1.x(-2, -1, 0, z10 ? 6 : 0, 0, z10 ? 0 : 6, 0));
        }
        int i12 = 0;
        while (i12 < xa1Var.getChildCount()) {
            ((org.telegram.ui.ActionBar.v0) xa1Var.getChildAt(i12)).setExpanded(i12 == this.I);
            i12++;
        }
        xa1Var.setTag(!isEmpty ? 1 : null);
    }

    public final void f(ig.p0 p0Var) {
        org.telegram.ui.jx jxVar;
        if (p0Var.h) {
            this.F.remove(p0Var);
            int i10 = this.I;
            if (i10 < 0 || i10 > r0.size() - 1) {
                this.I = r0.size() - 1;
            }
            e();
            l20 l20Var = this.H;
            if (l20Var == null || (jxVar = ((org.telegram.ui.ix) l20Var).a.C0) == null) {
                return;
            }
            jxVar.R(false);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b();
    }

    public void setBlurredBackgroundVisibility(float f7) {
        boolean z10;
        int i10;
        int i11 = (int) (f7 * 255.0f);
        eh.d dVar = this.s;
        boolean z11 = true;
        if (dVar == null || dVar.b == i11) {
            z10 = false;
        } else {
            dVar.setAlpha(i11);
            z10 = true;
        }
        Drawable drawable = this.v;
        if (drawable == null || drawable.getAlpha() == (i10 = 255 - i11)) {
            z11 = z10;
        } else {
            this.v.setAlpha(i10);
        }
        if (z11) {
            invalidate();
        }
    }

    public void setCloseButtonOnClickListener(Runnable runnable) {
        this.y = runnable;
    }

    public void setCloseButtonVisible(boolean z10) {
        this.n = z10;
        this.a.a(z10 || this.r.length() > 0, true);
    }

    public void setSearchFiltersListener(l20 l20Var) {
        this.H = l20Var;
    }

    public void setupBlurredBackground(eh.d dVar) {
        org.telegram.messenger.vh.s(dVar, AndroidUtilities.dp(20.0f), 4.0f);
        this.s = dVar;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int o12;
        Drawable c02;
        org.telegram.ui.ActionBar.u6 u6Var = this.d;
        boolean a2 = u6Var != null ? u6Var.a() : org.telegram.ui.ActionBar.y6.I.q();
        if (this.w) {
            c02 = org.telegram.ui.ActionBar.y6.e0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, u6Var));
        } else {
            int dp = AndroidUtilities.dp(20.0f);
            if (this.x) {
                o12 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, u6Var);
            } else {
                o12 = org.telegram.ui.ActionBar.y6.o1(a2 ? 0.07f : 0.05f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, u6Var));
            }
            c02 = org.telegram.ui.ActionBar.y6.c0(dp, o12);
        }
        this.v = c02;
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        int o13 = org.telegram.ui.ActionBar.y6.o1(0.6f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.e.setColorFilter(o13, mode);
        int o14 = org.telegram.ui.ActionBar.y6.o1(0.6f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        ImageView imageView = this.f;
        imageView.setColorFilter(o14, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.i6, u6Var), 1, AndroidUtilities.dp(17.0f)));
        int o15 = org.telegram.ui.ActionBar.y6.o1(0.5f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        fi.c2 c2Var = this.r;
        c2Var.setHintTextColor(o15);
        c2Var.setTextColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        c2Var.setCursorColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Yh, u6Var));
        eh.d dVar = this.s;
        if (dVar != null) {
            dVar.updateColors();
        }
        LinearLayout linearLayout = this.h;
        int childCount = linearLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = linearLayout.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.ActionBar.w0) {
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) childAt;
                if (w0Var.getIconView() != null) {
                    w0Var.getIconView().setColorFilter(org.telegram.ui.ActionBar.y6.o1(0.6f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, u6Var)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.i6, u6Var), 1, AndroidUtilities.dp(17.0f)));
            }
        }
        org.telegram.ui.xa1 xa1Var = this.G;
        int childCount2 = xa1Var.getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            if (xa1Var.getChildAt(i12) instanceof org.telegram.ui.ActionBar.v0) {
                ((org.telegram.ui.ActionBar.v0) xa1Var.getChildAt(i12)).updateColors();
            }
        }
        invalidate();
    }

    @Override // oe.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
