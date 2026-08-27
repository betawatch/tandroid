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
import org.telegram.ui.ra1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class p10 extends FrameLayout implements ud.b, org.telegram.ui.ActionBar.x5 {
    public final AnimationNotificationsLocker A;
    public final ArrayList B;
    public final ra1 C;
    public o10 D;
    public int E;
    public final ud.a a;
    public final ud.a b;
    public final ud.c c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final ImageView e;
    public final ImageView f;
    public final LinearLayout h;
    public boolean n;
    public final gg.g r;
    public lg.d s;
    public Drawable v;
    public boolean w;
    public boolean x;
    public Runnable y;

    public p10(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        er erVar = er.h;
        this.a = new ud.a(0, this, erVar, 380L, false);
        this.b = new ud.a(1, this, erVar, 380L, true);
        this.c = new ud.c(2, this, td.a.a, 280L);
        this.A = new AnimationNotificationsLocker();
        this.B = new ArrayList();
        this.d = c6Var;
        gg.g gVar = new gg.g(this, context, 5);
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
        gVar.addTextChangedListener(new ch.e(this, 10));
        if (Build.VERSION.SDK_INT >= 35) {
            gVar.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(gVar, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.outline_search_1_24);
        addView(imageView, h7.z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, h7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 32.0f, 0.0f, 32.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.miniplayer_close);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new f0(this, 17));
        addView(imageView2, h7.z5.d(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ra1 ra1Var = new ra1(this, getContext(), 9);
        this.C = ra1Var;
        ra1Var.setOrientation(0);
        ra1Var.setVisibility(0);
        addView(ra1Var, h7.z5.d(-2, 32.0f, (LocaleController.isRTL ? 5 : 3) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        setWillNotDraw(false);
        b();
        d();
    }

    public final void a(org.telegram.ui.ActionBar.v0 v0Var) {
        this.h.addView(v0Var);
    }

    public final void b() {
        int max = Math.max(AndroidUtilities.dp(6.0f) + ((int) this.c.e), AndroidUtilities.dp(48.0f));
        int measuredWidth = this.h.getMeasuredWidth() + AndroidUtilities.dp(48.0f);
        boolean z10 = LocaleController.isRTL;
        int i10 = z10 ? measuredWidth : max;
        if (!z10) {
            max = measuredWidth;
        }
        Rect rect = AndroidUtilities.rectTmp2;
        gg.g gVar = this.r;
        rect.set(i10, 0, gVar.getMeasuredWidth() - max, gVar.getMeasuredHeight());
        gVar.setClipBounds(rect);
        gVar.setPadding(i10, 0, max, 0);
    }

    public final void c() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i10 >= arrayList.size()) {
                f();
                return;
            }
            if (((pf.e0) arrayList.get(i10)).h) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void d() {
        int l1;
        Drawable b02;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        boolean a2 = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
        if (this.w) {
            b02 = org.telegram.ui.ActionBar.g6.d0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var));
        } else {
            int dp = AndroidUtilities.dp(20.0f);
            if (this.x) {
                l1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var);
            } else {
                l1 = org.telegram.ui.ActionBar.g6.l1(a2 ? 0.07f : 0.05f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
            }
            b02 = org.telegram.ui.ActionBar.g6.b0(dp, l1);
        }
        this.v = b02;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        int l12 = org.telegram.ui.ActionBar.g6.l1(0.6f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.e.setColorFilter(l12, mode);
        int l13 = org.telegram.ui.ActionBar.g6.l1(0.6f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        ImageView imageView = this.f;
        imageView.setColorFilter(l13, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var), 1, AndroidUtilities.dp(17.0f)));
        int l14 = org.telegram.ui.ActionBar.g6.l1(0.5f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        gg.g gVar = this.r;
        gVar.setHintTextColor(l14);
        gVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        gVar.setCursorColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Yh, c6Var));
        lg.d dVar = this.s;
        if (dVar != null) {
            dVar.u();
        }
        LinearLayout linearLayout = this.h;
        int childCount = linearLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = linearLayout.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.ActionBar.v0) {
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) childAt;
                if (v0Var.getIconView() != null) {
                    v0Var.getIconView().setColorFilter(org.telegram.ui.ActionBar.g6.l1(0.6f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var), 1, AndroidUtilities.dp(17.0f)));
            }
        }
        ra1 ra1Var = this.C;
        int childCount2 = ra1Var.getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            if (ra1Var.getChildAt(i12) instanceof org.telegram.ui.ActionBar.u0) {
                ((org.telegram.ui.ActionBar.u0) ra1Var.getChildAt(i12)).a();
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
        lg.d dVar = this.s;
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
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((pf.e0) arrayList.get(i10)).h) {
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
        transitionSet.addTransition(new ag.u0(2).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) er.g);
        transitionSet.addListener((Transition.TransitionListener) new n10(this));
        ra1 ra1Var = this.C;
        TransitionManager.beginDelayedTransition(ra1Var, transitionSet);
        int i10 = 0;
        while (i10 < ra1Var.getChildCount()) {
            if (!arrayList2.remove(((org.telegram.ui.ActionBar.u0) ra1Var.getChildAt(i10)).getFilter())) {
                ra1Var.removeViewAt(i10);
                i10--;
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            pf.e0 e0Var = (pf.e0) arrayList2.get(i11);
            e0Var.getClass();
            org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(getContext(), this.d);
            u0Var.r = true;
            u0Var.a();
            u0Var.setData(e0Var);
            u0Var.setOnClickListener(new q2(22, this, u0Var));
            boolean z10 = LocaleController.isRTL;
            ra1Var.addView(u0Var, h7.z5.t(-2, -1, 0, z10 ? 6 : 0, 0, z10 ? 0 : 6, 0));
        }
        int i12 = 0;
        while (i12 < ra1Var.getChildCount()) {
            ((org.telegram.ui.ActionBar.u0) ra1Var.getChildAt(i12)).setExpanded(i12 == this.E);
            i12++;
        }
        ra1Var.setTag(!isEmpty ? 1 : null);
    }

    public final void g(pf.e0 e0Var) {
        org.telegram.ui.px pxVar;
        if (e0Var.h) {
            this.B.remove(e0Var);
            int i10 = this.E;
            if (i10 < 0 || i10 > r0.size() - 1) {
                this.E = r0.size() - 1;
            }
            f();
            o10 o10Var = this.D;
            if (o10Var == null || (pxVar = ((org.telegram.ui.lx) o10Var).b.y0) == null) {
                return;
            }
            pxVar.Q(false);
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // ud.b
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        if (i10 == 0) {
            ImageView imageView = this.f;
            m10.d(imageView, f10);
            imageView.setRotation((1.0f - f10) * 90.0f);
        } else if (i10 == 1) {
            m10.d(this.e, f10);
        } else if (i10 == 2) {
            b();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b();
    }

    public void setBlurredBackgroundVisibility(float f10) {
        boolean z10;
        int i10;
        int i11 = (int) (f10 * 255.0f);
        lg.d dVar = this.s;
        boolean z11 = true;
        if (dVar == null || dVar.j == i11) {
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

    public void setSearchFiltersListener(o10 o10Var) {
        this.D = o10Var;
    }

    public void setupBlurredBackground(lg.d dVar) {
        dVar.p(AndroidUtilities.dp(20.0f));
        dVar.o(AndroidUtilities.dp(4.0f));
        this.s = dVar;
    }

    @Override // ud.b
    public final /* synthetic */ void A(float f10, int i10) {
    }
}
