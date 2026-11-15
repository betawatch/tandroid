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
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class v00 extends FrameLayout implements te.b, org.telegram.ui.ActionBar.z5 {
    public Runnable E;
    public final h2.f F;
    public final ArrayList G;
    public final org.telegram.ui.z51 H;
    public u00 I;
    public int J;
    public final te.a a;
    public final te.a b;
    public final te.c c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final ImageView e;
    public final ImageView f;
    public final LinearLayout h;
    public boolean n;
    public final ah.i r;
    public fh.g s;
    public Drawable w;
    public boolean x;
    public boolean y;

    public v00(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        er erVar = er.h;
        this.a = new te.a(0, this, erVar, 380L, false);
        this.b = new te.a(1, this, erVar, 380L, true);
        this.c = new te.c(2, this, se.a.a, 280L);
        this.F = new h2.f((int[]) null);
        this.G = new ArrayList();
        this.d = e6Var;
        ah.i iVar = new ah.i(6, context, this);
        this.r = iVar;
        iVar.setTextSize(1, 15.0f);
        iVar.setCursorWidth(1.5f);
        iVar.setInputType(iVar.getInputType() | org.telegram.messenger.ns.G2);
        iVar.setSingleLine(true);
        iVar.setBackground(null);
        iVar.setVerticalScrollBarEnabled(false);
        iVar.setHorizontalScrollBarEnabled(false);
        iVar.setPadding(org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f), 0);
        iVar.setClipToPadding(true);
        iVar.setImeOptions(268435459);
        iVar.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
        iVar.addTextChangedListener(new ah.j(this, 22));
        if (Build.VERSION.SDK_INT >= 35) {
            iVar.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(iVar, c8.ja.d(-1, -1.0f, org.telegram.messenger.ns.E1, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.outline_search_1_24);
        addView(imageView, c8.ja.d(24, 24.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.ja.d(-2, -1.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 16, 32.0f, 0.0f, 32.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.miniplayer_close);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new e0(this, 17));
        addView(imageView2, c8.ja.d(24, 24.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        org.telegram.ui.z51 z51Var = new org.telegram.ui.z51(14, getContext(), this);
        this.H = z51Var;
        z51Var.setOrientation(0);
        z51Var.setVisibility(0);
        addView(z51Var, c8.ja.d(-2, 32.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        setWillNotDraw(false);
        b();
        updateColors();
    }

    @Override // te.b
    public final void G(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            ImageView imageView = this.f;
            t00.d(imageView, f10);
            imageView.setRotation((1.0f - f10) * 90.0f);
        } else if (i7 == 1) {
            t00.d(this.e, f10);
        } else if (i7 == 2) {
            b();
        }
    }

    public final void a(org.telegram.ui.ActionBar.q0 q0Var) {
        this.h.addView(q0Var);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Pi));
    }

    public final void b() {
        int max = Math.max(org.telegram.messenger.g0.L(6.0f) + ((int) this.c.f), org.telegram.messenger.g0.L(48.0f));
        int measuredWidth = this.h.getMeasuredWidth() + org.telegram.messenger.g0.L(48.0f);
        boolean z10 = org.telegram.messenger.hd.a0;
        int i7 = z10 ? measuredWidth : max;
        if (!z10) {
            max = measuredWidth;
        }
        Rect rect = org.telegram.messenger.g0.Q;
        ah.i iVar = this.r;
        rect.set(i7, 0, iVar.getMeasuredWidth() - max, iVar.getMeasuredHeight());
        iVar.setClipBounds(rect);
        iVar.setPadding(i7, 0, max, 0);
    }

    public final void c() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i7 >= arrayList.size()) {
                e();
                return;
            }
            if (((jg.o0) arrayList.get(i7)).h) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
    }

    public final boolean d() {
        ArrayList arrayList = this.G;
        if (!arrayList.isEmpty()) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (((jg.o0) arrayList.get(i7)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.w.draw(canvas);
        }
        fh.g gVar = this.s;
        if (gVar != null) {
            gVar.setBounds(getPaddingLeft() - org.telegram.messenger.g0.L(4.0f), getPaddingTop() - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + (getWidth() - getPaddingRight()), org.telegram.messenger.g0.L(4.0f) + (getHeight() - getPaddingBottom()));
            this.s.draw(canvas);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e() {
        ArrayList arrayList = this.G;
        boolean isEmpty = arrayList.isEmpty();
        this.b.a(isEmpty, true);
        ArrayList arrayList2 = new ArrayList(arrayList);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i0(1).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) er.g);
        transitionSet.addListener((Transition.TransitionListener) new org.telegram.ui.ActionBar.j0(1, this));
        org.telegram.ui.z51 z51Var = this.H;
        TransitionManager.beginDelayedTransition(z51Var, transitionSet);
        int i7 = 0;
        while (i7 < z51Var.getChildCount()) {
            if (!arrayList2.remove(((org.telegram.ui.ActionBar.p0) z51Var.getChildAt(i7)).getFilter())) {
                z51Var.removeViewAt(i7);
                i7--;
            }
            i7++;
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            jg.o0 o0Var = (jg.o0) arrayList2.get(i10);
            o0Var.getClass();
            org.telegram.ui.ActionBar.p0 p0Var = new org.telegram.ui.ActionBar.p0(getContext(), this.d);
            p0Var.r = true;
            p0Var.updateColors();
            p0Var.setData(o0Var);
            p0Var.setOnClickListener(new n2(19, this, p0Var));
            boolean z10 = org.telegram.messenger.hd.a0;
            z51Var.addView(p0Var, c8.ja.t(-2, -1, 0, z10 ? 6 : 0, 0, z10 ? 0 : 6, 0));
        }
        int i11 = 0;
        while (i11 < z51Var.getChildCount()) {
            ((org.telegram.ui.ActionBar.p0) z51Var.getChildAt(i11)).setExpanded(i11 == this.J);
            i11++;
        }
        z51Var.setTag(!isEmpty ? 1 : null);
    }

    public final void f(jg.o0 o0Var) {
        org.telegram.ui.hw hwVar;
        if (o0Var.h) {
            this.G.remove(o0Var);
            int i7 = this.J;
            if (i7 < 0 || i7 > r0.size() - 1) {
                this.J = r0.size() - 1;
            }
            e();
            u00 u00Var = this.I;
            if (u00Var == null || (hwVar = ((org.telegram.ui.ev) u00Var).a.D0) == null) {
                return;
            }
            hwVar.Q(false);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        b();
    }

    public void setBlurredBackgroundVisibility(float f10) {
        boolean z10;
        int i7;
        int i10 = (int) (f10 * 255.0f);
        fh.g gVar = this.s;
        boolean z11 = true;
        if (gVar == null || gVar.c == i10) {
            z10 = false;
        } else {
            gVar.setAlpha(i10);
            z10 = true;
        }
        Drawable drawable = this.w;
        if (drawable == null || drawable.getAlpha() == (i7 = 255 - i10)) {
            z11 = z10;
        } else {
            this.w.setAlpha(i7);
        }
        if (z11) {
            invalidate();
        }
    }

    public void setCloseButtonOnClickListener(Runnable runnable) {
        this.E = runnable;
    }

    public void setCloseButtonVisible(boolean z10) {
        this.n = z10;
        this.a.a(z10 || this.r.length() > 0, true);
    }

    public void setSearchFiltersListener(u00 u00Var) {
        this.I = u00Var;
    }

    public void setupBlurredBackground(fh.g gVar) {
        org.telegram.messenger.i20.r(gVar, org.telegram.messenger.g0.L(20.0f), 4.0f);
        this.s = gVar;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int r12;
        Drawable d02;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        boolean a10 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
        if (this.x) {
            d02 = org.telegram.ui.ActionBar.j6.f0(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, e6Var));
        } else {
            int L = org.telegram.messenger.g0.L(20.0f);
            if (this.y) {
                r12 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, e6Var);
            } else {
                r12 = org.telegram.ui.ActionBar.j6.r1(a10 ? 0.07f : 0.05f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, e6Var));
            }
            d02 = org.telegram.ui.ActionBar.j6.d0(L, r12);
        }
        this.w = d02;
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        int r13 = org.telegram.ui.ActionBar.j6.r1(0.6f, org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.e.setColorFilter(r13, mode);
        int r14 = org.telegram.ui.ActionBar.j6.r1(0.6f, org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        ImageView imageView = this.f;
        imageView.setColorFilter(r14, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.i6, e6Var), 1, org.telegram.messenger.g0.L(17.0f)));
        int r15 = org.telegram.ui.ActionBar.j6.r1(0.5f, org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        ah.i iVar = this.r;
        iVar.setHintTextColor(r15);
        iVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        iVar.setCursorColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Pi, e6Var));
        fh.g gVar = this.s;
        if (gVar != null) {
            gVar.updateColors();
        }
        LinearLayout linearLayout = this.h;
        int childCount = linearLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = linearLayout.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.ActionBar.q0) {
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) childAt;
                if (q0Var.getIconView() != null) {
                    q0Var.getIconView().setColorFilter(org.telegram.ui.ActionBar.j6.r1(0.6f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, e6Var)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.i6, e6Var), 1, org.telegram.messenger.g0.L(17.0f)));
            }
        }
        org.telegram.ui.z51 z51Var = this.H;
        int childCount2 = z51Var.getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            if (z51Var.getChildAt(i11) instanceof org.telegram.ui.ActionBar.p0) {
                ((org.telegram.ui.ActionBar.p0) z51Var.getChildAt(i11)).updateColors();
            }
        }
        invalidate();
    }

    @Override // te.b
    public final /* synthetic */ void E(float f10, int i7) {
    }
}
