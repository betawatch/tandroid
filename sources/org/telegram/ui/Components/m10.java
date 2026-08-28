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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ta1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class m10 extends FrameLayout implements td.b, org.telegram.ui.ActionBar.w5 {
    public final AnimationNotificationsLocker A;
    public final ArrayList B;
    public final ta1 C;
    public l10 D;
    public int E;
    public final td.a a;
    public final td.a b;
    public final td.c c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final ImageView e;
    public final ImageView f;
    public final LinearLayout h;
    public boolean n;
    public final fg.g r;
    public kg.d s;
    public Drawable v;
    public boolean w;
    public boolean x;
    public Runnable y;

    public m10(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        gr grVar = gr.h;
        this.a = new td.a(0, this, grVar, 380L, false);
        this.b = new td.a(1, this, grVar, 380L, true);
        this.c = new td.c(2, this, sd.a.a, 280L);
        this.A = new AnimationNotificationsLocker();
        this.B = new ArrayList();
        this.d = b6Var;
        fg.g gVar = new fg.g(this, context, 5);
        this.r = gVar;
        gVar.setTextSize(1, 15.0f);
        gVar.setCursorWidth(1.5f);
        gVar.setInputType(gVar.getInputType() | 176);
        gVar.setSingleLine(true);
        gVar.setBackground(null);
        gVar.setVerticalScrollBarEnabled(false);
        gVar.setHorizontalScrollBarEnabled(false);
        gVar.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        gVar.setClipToPadding(true);
        gVar.setImeOptions(268435459);
        gVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        gVar.addTextChangedListener(new bh.f(this, 10));
        if (Build.VERSION.SDK_INT >= 35) {
            gVar.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(gVar, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.outline_search_1_24);
        addView(imageView, g7.e6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, g7.e6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 32.0f, 0.0f, 32.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.miniplayer_close);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new f0(this, 17));
        addView(imageView2, g7.e6.d(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ta1 ta1Var = new ta1(this, getContext(), 8);
        this.C = ta1Var;
        ta1Var.setOrientation(0);
        ta1Var.setVisibility(0);
        addView(ta1Var, g7.e6.d(-2, 32.0f, (LocaleController.isRTL ? 5 : 3) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        setWillNotDraw(false);
        b();
        d();
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 0) {
            ImageView imageView = this.f;
            j10.d(imageView, f10);
            imageView.setRotation((1.0f - f10) * 90.0f);
        } else if (i9 == 1) {
            j10.d(this.e, f10);
        } else if (i9 == 2) {
            b();
        }
    }

    public final void a(org.telegram.ui.ActionBar.w0 w0Var) {
        this.h.addView(w0Var);
    }

    public final void b() {
        int max = Math.max(AndroidUtilities.dp(6.0f) + ((int) this.c.e), AndroidUtilities.dp(48.0f));
        int measuredWidth = this.h.getMeasuredWidth() + AndroidUtilities.dp(48.0f);
        boolean z10 = LocaleController.isRTL;
        int i9 = z10 ? measuredWidth : max;
        if (!z10) {
            max = measuredWidth;
        }
        Rect rect = AndroidUtilities.rectTmp2;
        fg.g gVar = this.r;
        rect.set(i9, 0, gVar.getMeasuredWidth() - max, gVar.getMeasuredHeight());
        gVar.setClipBounds(rect);
        gVar.setPadding(i9, 0, max, 0);
    }

    public final void c() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i9 >= arrayList.size()) {
                f();
                return;
            }
            if (((of.m0) arrayList.get(i9)).h) {
                arrayList.remove(i9);
                i9--;
            }
            i9++;
        }
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        int l1;
        Drawable b02;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        boolean a2 = b6Var != null ? b6Var.a() : org.telegram.ui.ActionBar.f6.I.q();
        if (this.w) {
            b02 = org.telegram.ui.ActionBar.f6.d0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, b6Var));
        } else {
            int dp = AndroidUtilities.dp(20.0f);
            if (this.x) {
                l1 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, b6Var);
            } else {
                l1 = org.telegram.ui.ActionBar.f6.l1(a2 ? 0.07f : 0.05f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
            }
            b02 = org.telegram.ui.ActionBar.f6.b0(dp, l1);
        }
        this.v = b02;
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        int l12 = org.telegram.ui.ActionBar.f6.l1(0.6f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.e.setColorFilter(l12, mode);
        int l13 = org.telegram.ui.ActionBar.f6.l1(0.6f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        ImageView imageView = this.f;
        imageView.setColorFilter(l13, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var), 1, AndroidUtilities.dp(17.0f)));
        int l14 = org.telegram.ui.ActionBar.f6.l1(0.5f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        fg.g gVar = this.r;
        gVar.setHintTextColor(l14);
        gVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        gVar.setCursorColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Yh, b6Var));
        kg.d dVar = this.s;
        if (dVar != null) {
            dVar.u();
        }
        LinearLayout linearLayout = this.h;
        int childCount = linearLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = linearLayout.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.ActionBar.w0) {
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) childAt;
                if (w0Var.getIconView() != null) {
                    w0Var.getIconView().setColorFilter(org.telegram.ui.ActionBar.f6.l1(0.6f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var), 1, AndroidUtilities.dp(17.0f)));
            }
        }
        ta1 ta1Var = this.C;
        int childCount2 = ta1Var.getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            if (ta1Var.getChildAt(i11) instanceof org.telegram.ui.ActionBar.v0) {
                ((org.telegram.ui.ActionBar.v0) ta1Var.getChildAt(i11)).a();
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Drawable drawable = this.v;
        if (drawable != null) {
            drawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.v.draw(canvas);
        }
        kg.d dVar = this.s;
        if (dVar != null) {
            dVar.setBounds(getPaddingLeft() - AndroidUtilities.dp(4.0f), getPaddingTop() - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (getWidth() - getPaddingRight()), AndroidUtilities.dp(4.0f) + (getHeight() - getPaddingBottom()));
            this.s.draw(canvas);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final boolean e() {
        ArrayList arrayList = this.B;
        if (!arrayList.isEmpty()) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                if (((of.m0) arrayList.get(i9)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f() {
        ArrayList arrayList = this.B;
        boolean isEmpty = arrayList.isEmpty();
        this.b.a(isEmpty, true);
        ArrayList arrayList2 = new ArrayList(arrayList);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.o0(1).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) gr.g);
        transitionSet.addListener((Transition.TransitionListener) new k10(this));
        ta1 ta1Var = this.C;
        TransitionManager.beginDelayedTransition(ta1Var, transitionSet);
        int i9 = 0;
        while (i9 < ta1Var.getChildCount()) {
            if (!arrayList2.remove(((org.telegram.ui.ActionBar.v0) ta1Var.getChildAt(i9)).getFilter())) {
                ta1Var.removeViewAt(i9);
                i9--;
            }
            i9++;
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            of.m0 m0Var = (of.m0) arrayList2.get(i10);
            m0Var.getClass();
            org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(getContext(), this.d);
            v0Var.r = true;
            v0Var.a();
            v0Var.setData(m0Var);
            v0Var.setOnClickListener(new s2(21, this, v0Var));
            boolean z10 = LocaleController.isRTL;
            ta1Var.addView(v0Var, g7.e6.t(-2, -1, 0, z10 ? 6 : 0, 0, z10 ? 0 : 6, 0));
        }
        int i11 = 0;
        while (i11 < ta1Var.getChildCount()) {
            ((org.telegram.ui.ActionBar.v0) ta1Var.getChildAt(i11)).setExpanded(i11 == this.E);
            i11++;
        }
        ta1Var.setTag(!isEmpty ? 1 : null);
    }

    public final void g(of.m0 m0Var) {
        org.telegram.ui.mx mxVar;
        if (m0Var.h) {
            this.B.remove(m0Var);
            int i9 = this.E;
            if (i9 < 0 || i9 > r0.size() - 1) {
                this.E = r0.size() - 1;
            }
            f();
            l10 l10Var = this.D;
            if (l10Var == null || (mxVar = ((org.telegram.ui.ix) l10Var).b.y0) == null) {
                return;
            }
            mxVar.Q(false);
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        b();
    }

    public void setBlurredBackgroundVisibility(float f10) {
        boolean z10;
        int i9;
        int i10 = (int) (f10 * 255.0f);
        kg.d dVar = this.s;
        boolean z11 = true;
        if (dVar == null || dVar.j == i10) {
            z10 = false;
        } else {
            dVar.setAlpha(i10);
            z10 = true;
        }
        Drawable drawable = this.v;
        if (drawable == null || drawable.getAlpha() == (i9 = 255 - i10)) {
            z11 = z10;
        } else {
            this.v.setAlpha(i9);
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

    public void setSearchFiltersListener(l10 l10Var) {
        this.D = l10Var;
    }

    public void setupBlurredBackground(kg.d dVar) {
        dVar.p(AndroidUtilities.dp(20.0f));
        dVar.o(AndroidUtilities.dp(4.0f));
        this.s = dVar;
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }
}
