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
import org.telegram.ui.bc1;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public class b20 extends FrameLayout implements le.d, org.telegram.ui.ActionBar.z5 {
    public final AnimationNotificationsLocker E;
    public final ArrayList F;
    public final bc1 G;
    public a20 H;
    public int I;
    public final le.b a;
    public final le.b b;
    public final le.e c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final ImageView e;
    public final ImageView f;
    public final LinearLayout h;
    public boolean n;
    public final ci.h2 r;
    public ch.d s;
    public Drawable v;
    public boolean w;
    public boolean x;
    public Runnable y;

    public b20(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        qr qrVar = qr.h;
        this.a = new le.b(0, this, qrVar, 380L, false);
        this.b = new le.b(1, this, qrVar, 380L, true);
        this.c = new le.e(2, this, ke.a.a, 280L);
        this.E = new AnimationNotificationsLocker();
        this.F = new ArrayList();
        this.d = e6Var;
        ci.h2 h2Var = new ci.h2(this, context, 4);
        this.r = h2Var;
        h2Var.setTextSize(1, 15.0f);
        h2Var.setCursorWidth(1.5f);
        h2Var.setInputType(h2Var.getInputType() | 176);
        h2Var.setSingleLine(true);
        h2Var.setBackground(null);
        h2Var.setVerticalScrollBarEnabled(false);
        h2Var.setHorizontalScrollBarEnabled(false);
        h2Var.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        h2Var.setClipToPadding(true);
        h2Var.setImeOptions(268435459);
        h2Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        h2Var.addTextChangedListener(new ci.i2(this, 9));
        if (Build.VERSION.SDK_INT >= 35) {
            h2Var.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(h2Var, w7.y5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.outline_search_1_24);
        addView(imageView, w7.y5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.y5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 32.0f, 0.0f, 32.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.miniplayer_close);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new f0(this, 17));
        addView(imageView2, w7.y5.d(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        bc1 bc1Var = new bc1(this, getContext(), 7);
        this.G = bc1Var;
        bc1Var.setOrientation(0);
        bc1Var.setVisibility(0);
        addView(bc1Var, w7.y5.d(-2, 32.0f, (LocaleController.isRTL ? 5 : 3) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        setWillNotDraw(false);
        b();
        e();
    }

    @Override // le.d
    public final void D(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            ImageView imageView = this.f;
            y10.d(imageView, f7);
            imageView.setRotation((1.0f - f7) * 90.0f);
        } else if (i10 == 1) {
            y10.d(this.e, f7);
        } else if (i10 == 2) {
            b();
        }
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
        ci.h2 h2Var = this.r;
        rect.set(i10, 0, h2Var.getMeasuredWidth() - max, h2Var.getMeasuredHeight());
        h2Var.setClipBounds(rect);
        h2Var.setPadding(i10, 0, max, 0);
    }

    public final void c() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 >= arrayList.size()) {
                f();
                return;
            }
            if (((gg.q0) arrayList.get(i10)).h) {
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
                if (((gg.q0) arrayList.get(i10)).h) {
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
        ch.d dVar = this.s;
        if (dVar != null) {
            dVar.setBounds(getPaddingLeft() - AndroidUtilities.dp(4.0f), getPaddingTop() - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (getWidth() - getPaddingRight()), AndroidUtilities.dp(4.0f) + (getHeight() - getPaddingBottom()));
            this.s.draw(canvas);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void e() {
        int l1;
        Drawable b02;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        boolean a2 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
        if (this.w) {
            b02 = org.telegram.ui.ActionBar.j6.d0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, e6Var));
        } else {
            int dp = AndroidUtilities.dp(20.0f);
            if (this.x) {
                l1 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, e6Var);
            } else {
                l1 = org.telegram.ui.ActionBar.j6.l1(a2 ? 0.07f : 0.05f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, e6Var));
            }
            b02 = org.telegram.ui.ActionBar.j6.b0(dp, l1);
        }
        this.v = b02;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        int l12 = org.telegram.ui.ActionBar.j6.l1(0.6f, org.telegram.ui.ActionBar.j6.v0(i10, e6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.e.setColorFilter(l12, mode);
        int l13 = org.telegram.ui.ActionBar.j6.l1(0.6f, org.telegram.ui.ActionBar.j6.v0(i10, e6Var));
        ImageView imageView = this.f;
        imageView.setColorFilter(l13, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, e6Var), 1, AndroidUtilities.dp(17.0f)));
        int l14 = org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.v0(i10, e6Var));
        ci.h2 h2Var = this.r;
        h2Var.setHintTextColor(l14);
        h2Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, e6Var));
        h2Var.setCursorColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Yh, e6Var));
        ch.d dVar = this.s;
        if (dVar != null) {
            dVar.v();
        }
        LinearLayout linearLayout = this.h;
        int childCount = linearLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = linearLayout.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.ActionBar.v0) {
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) childAt;
                if (v0Var.getIconView() != null) {
                    v0Var.getIconView().setColorFilter(org.telegram.ui.ActionBar.j6.l1(0.6f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, e6Var)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, e6Var), 1, AndroidUtilities.dp(17.0f)));
            }
        }
        bc1 bc1Var = this.G;
        int childCount2 = bc1Var.getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            if (bc1Var.getChildAt(i12) instanceof org.telegram.ui.ActionBar.u0) {
                ((org.telegram.ui.ActionBar.u0) bc1Var.getChildAt(i12)).a();
            }
        }
        invalidate();
    }

    public final void f() {
        ArrayList arrayList = this.F;
        boolean isEmpty = arrayList.isEmpty();
        this.b.a(isEmpty, true);
        ArrayList arrayList2 = new ArrayList(arrayList);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.n0(1).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) qr.g);
        transitionSet.addListener((Transition.TransitionListener) new z10(this));
        bc1 bc1Var = this.G;
        TransitionManager.beginDelayedTransition(bc1Var, transitionSet);
        int i10 = 0;
        while (i10 < bc1Var.getChildCount()) {
            if (!arrayList2.remove(((org.telegram.ui.ActionBar.u0) bc1Var.getChildAt(i10)).getFilter())) {
                bc1Var.removeViewAt(i10);
                i10--;
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            gg.q0 q0Var = (gg.q0) arrayList2.get(i11);
            q0Var.getClass();
            org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(getContext(), this.d);
            u0Var.r = true;
            u0Var.a();
            u0Var.setData(q0Var);
            u0Var.setOnClickListener(new dt(4, this, u0Var));
            boolean z10 = LocaleController.isRTL;
            bc1Var.addView(u0Var, w7.y5.t(-2, -1, 0, z10 ? 6 : 0, 0, z10 ? 0 : 6, 0));
        }
        int i12 = 0;
        while (i12 < bc1Var.getChildCount()) {
            ((org.telegram.ui.ActionBar.u0) bc1Var.getChildAt(i12)).setExpanded(i12 == this.I);
            i12++;
        }
        bc1Var.setTag(!isEmpty ? 1 : null);
    }

    public final void g(gg.q0 q0Var) {
        org.telegram.ui.ey eyVar;
        if (q0Var.h) {
            this.F.remove(q0Var);
            int i10 = this.I;
            if (i10 < 0 || i10 > r0.size() - 1) {
                this.I = r0.size() - 1;
            }
            f();
            a20 a20Var = this.H;
            if (a20Var == null || (eyVar = ((org.telegram.ui.zx) a20Var).b.C0) == null) {
                return;
            }
            eyVar.R(false);
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
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
        ch.d dVar = this.s;
        boolean z11 = true;
        if (dVar == null || dVar.l == i11) {
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

    public void setSearchFiltersListener(a20 a20Var) {
        this.H = a20Var;
    }

    public void setupBlurredBackground(ch.d dVar) {
        dVar.q(AndroidUtilities.dp(20.0f));
        dVar.p(AndroidUtilities.dp(4.0f));
        this.s = dVar;
    }

    @Override // le.d
    public final /* synthetic */ void C(float f7, int i10) {
    }
}
