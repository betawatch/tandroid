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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class h10 extends FrameLayout implements fe.e, org.telegram.ui.ActionBar.k6 {
    public Runnable D;
    public final e2.f E;
    public final ArrayList F;
    public final org.telegram.ui.u71 G;
    public g10 H;
    public int I;
    public final fe.b a;
    public final fe.b b;
    public final fe.f c;
    public final org.telegram.ui.ActionBar.p6 d;
    public final ImageView e;
    public final ImageView f;
    public final LinearLayout h;
    public boolean n;
    public final org.telegram.ui.ActionBar.n0 r;
    public vg.f s;
    public Drawable w;
    public boolean x;
    public boolean y;

    public h10(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        gr grVar = gr.h;
        this.a = new fe.b(0, this, grVar, 380L, false);
        this.b = new fe.b(1, this, grVar, 380L, true);
        this.c = new fe.f(2, this, ee.a.a, 280L);
        this.E = new e2.f(null);
        this.F = new ArrayList();
        this.d = p6Var;
        org.telegram.ui.ActionBar.n0 n0Var = new org.telegram.ui.ActionBar.n0(this, context, 3);
        this.r = n0Var;
        n0Var.setTextSize(1, 15.0f);
        n0Var.setCursorWidth(1.5f);
        n0Var.setInputType(n0Var.getInputType() | org.telegram.messenger.zs.G2);
        n0Var.setSingleLine(true);
        n0Var.setBackground(null);
        n0Var.setVerticalScrollBarEnabled(false);
        n0Var.setHorizontalScrollBarEnabled(false);
        n0Var.setPadding(org.telegram.messenger.i0.L(48.0f), 0, org.telegram.messenger.i0.L(48.0f), 0);
        n0Var.setClipToPadding(true);
        n0Var.setImeOptions(268435459);
        n0Var.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
        int i10 = 15;
        n0Var.addTextChangedListener(new ag.a1(this, i10));
        if (Build.VERSION.SDK_INT >= 35) {
            n0Var.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(n0Var, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.outline_search_1_24);
        addView(imageView, w7.b6.d(24, 24.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.b6.d(-2, -1.0f, (org.telegram.messenger.cd.X ? 3 : 5) | 16, 32.0f, 0.0f, 32.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.miniplayer_close);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new h0(this, i10));
        addView(imageView2, w7.b6.d(24, 24.0f, (org.telegram.messenger.cd.X ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        org.telegram.ui.u71 u71Var = new org.telegram.ui.u71(this, getContext(), 8);
        this.G = u71Var;
        u71Var.setOrientation(0);
        u71Var.setVisibility(0);
        addView(u71Var, w7.b6.d(-2, 32.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        setWillNotDraw(false);
        b();
        updateColors();
    }

    public final void a(org.telegram.ui.ActionBar.t0 t0Var) {
        this.h.addView(t0Var);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Mi));
    }

    public final void b() {
        int max = Math.max(org.telegram.messenger.i0.L(6.0f) + ((int) this.c.f), org.telegram.messenger.i0.L(48.0f));
        int measuredWidth = this.h.getMeasuredWidth() + org.telegram.messenger.i0.L(48.0f);
        boolean z10 = org.telegram.messenger.cd.X;
        int i10 = z10 ? measuredWidth : max;
        if (!z10) {
            max = measuredWidth;
        }
        Rect rect = org.telegram.messenger.i0.Q;
        org.telegram.ui.ActionBar.n0 n0Var = this.r;
        rect.set(i10, 0, n0Var.getMeasuredWidth() - max, n0Var.getMeasuredHeight());
        n0Var.setClipBounds(rect);
        n0Var.setPadding(i10, 0, max, 0);
    }

    public final void c() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 >= arrayList.size()) {
                e();
                return;
            }
            if (((zf.e0) arrayList.get(i10)).h) {
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
                if (((zf.e0) arrayList.get(i10)).h) {
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
        vg.f fVar = this.s;
        if (fVar != null) {
            fVar.setBounds(getPaddingLeft() - org.telegram.messenger.i0.L(4.0f), getPaddingTop() - org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f) + (getWidth() - getPaddingRight()), org.telegram.messenger.i0.L(4.0f) + (getHeight() - getPaddingBottom()));
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
        transitionSet.addTransition(new kg.g0(2).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) gr.g);
        transitionSet.addListener((Transition.TransitionListener) new org.telegram.ui.ActionBar.k0(1, this));
        org.telegram.ui.u71 u71Var = this.G;
        TransitionManager.beginDelayedTransition(u71Var, transitionSet);
        int i10 = 0;
        while (i10 < u71Var.getChildCount()) {
            if (!arrayList2.remove(((org.telegram.ui.ActionBar.s0) u71Var.getChildAt(i10)).getFilter())) {
                u71Var.removeViewAt(i10);
                i10--;
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            zf.e0 e0Var = (zf.e0) arrayList2.get(i11);
            e0Var.getClass();
            org.telegram.ui.ActionBar.s0 s0Var = new org.telegram.ui.ActionBar.s0(getContext(), this.d);
            s0Var.r = true;
            s0Var.updateColors();
            s0Var.setData(e0Var);
            s0Var.setOnClickListener(new sr(5, this, s0Var));
            boolean z10 = org.telegram.messenger.cd.X;
            u71Var.addView(s0Var, w7.b6.t(-2, -1, 0, z10 ? 6 : 0, 0, z10 ? 0 : 6, 0));
        }
        int i12 = 0;
        while (i12 < u71Var.getChildCount()) {
            ((org.telegram.ui.ActionBar.s0) u71Var.getChildAt(i12)).setExpanded(i12 == this.I);
            i12++;
        }
        u71Var.setTag(!isEmpty ? 1 : null);
    }

    public final void f(zf.e0 e0Var) {
        org.telegram.ui.kx kxVar;
        if (e0Var.h) {
            this.F.remove(e0Var);
            int i10 = this.I;
            if (i10 < 0 || i10 > r0.size() - 1) {
                this.I = r0.size() - 1;
            }
            e();
            g10 g10Var = this.H;
            if (g10Var == null || (kxVar = ((org.telegram.ui.iw) g10Var).a.C0) == null) {
                return;
            }
            kxVar.R(false);
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
        vg.f fVar = this.s;
        boolean z11 = true;
        if (fVar == null || fVar.c == i11) {
            z10 = false;
        } else {
            fVar.setAlpha(i11);
            z10 = true;
        }
        Drawable drawable = this.w;
        if (drawable == null || drawable.getAlpha() == (i10 = 255 - i11)) {
            z11 = z10;
        } else {
            this.w.setAlpha(i10);
        }
        if (z11) {
            invalidate();
        }
    }

    public void setCloseButtonOnClickListener(Runnable runnable) {
        this.D = runnable;
    }

    public void setCloseButtonVisible(boolean z10) {
        this.n = z10;
        this.a.a(z10 || this.r.length() > 0, true);
    }

    public void setSearchFiltersListener(g10 g10Var) {
        this.H = g10Var;
    }

    public void setupBlurredBackground(vg.f fVar) {
        org.telegram.messenger.z20.u(fVar, org.telegram.messenger.i0.L(20.0f), 4.0f);
        this.s = fVar;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int r12;
        Drawable d02;
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        boolean a2 = p6Var != null ? p6Var.a() : org.telegram.ui.ActionBar.t6.I.q();
        if (this.x) {
            d02 = org.telegram.ui.ActionBar.t6.f0(org.telegram.messenger.i0.L(20.0f), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var));
        } else {
            int L = org.telegram.messenger.i0.L(20.0f);
            if (this.y) {
                r12 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var);
            } else {
                r12 = org.telegram.ui.ActionBar.t6.r1(a2 ? 0.07f : 0.05f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
            }
            d02 = org.telegram.ui.ActionBar.t6.d0(L, r12);
        }
        this.w = d02;
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        int r13 = org.telegram.ui.ActionBar.t6.r1(0.6f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.e.setColorFilter(r13, mode);
        int r14 = org.telegram.ui.ActionBar.t6.r1(0.6f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        ImageView imageView = this.f;
        imageView.setColorFilter(r14, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, p6Var), 1, org.telegram.messenger.i0.L(17.0f)));
        int r15 = org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        org.telegram.ui.ActionBar.n0 n0Var = this.r;
        n0Var.setHintTextColor(r15);
        n0Var.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        n0Var.setCursorColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Mi, p6Var));
        vg.f fVar = this.s;
        if (fVar != null) {
            fVar.updateColors();
        }
        LinearLayout linearLayout = this.h;
        int childCount = linearLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = linearLayout.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.ActionBar.t0) {
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) childAt;
                if (t0Var.getIconView() != null) {
                    t0Var.getIconView().setColorFilter(org.telegram.ui.ActionBar.t6.r1(0.6f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, p6Var), 1, org.telegram.messenger.i0.L(17.0f)));
            }
        }
        org.telegram.ui.u71 u71Var = this.G;
        int childCount2 = u71Var.getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            if (u71Var.getChildAt(i12) instanceof org.telegram.ui.ActionBar.s0) {
                ((org.telegram.ui.ActionBar.s0) u71Var.getChildAt(i12)).updateColors();
            }
        }
        invalidate();
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 0) {
            ImageView imageView = this.f;
            f10.d(imageView, f7);
            imageView.setRotation((1.0f - f7) * 90.0f);
        } else if (i10 == 1) {
            f10.d(this.e, f7);
        } else if (i10 == 2) {
            b();
        }
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
