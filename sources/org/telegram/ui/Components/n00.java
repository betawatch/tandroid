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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class n00 extends FrameLayout implements qe.b, org.telegram.ui.ActionBar.z5 {
    public Runnable E;
    public final g2.g F;
    public final ArrayList G;
    public final org.telegram.ui.s51 H;
    public m00 I;
    public int J;
    public final qe.a a;
    public final qe.a b;
    public final qe.c c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final ImageView e;
    public final ImageView f;
    public final LinearLayout h;
    public boolean n;
    public final bh.g r;
    public gh.g s;
    public Drawable w;
    public boolean x;
    public boolean y;

    public n00(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        xq xqVar = xq.h;
        this.a = new qe.a(0, this, xqVar, 380L, false);
        this.b = new qe.a(1, this, xqVar, 380L, true);
        this.c = new qe.c(2, this, pe.a.a, 280L);
        this.F = new g2.g((int[]) null);
        this.G = new ArrayList();
        this.d = e6Var;
        bh.g gVar = new bh.g(6, context, this);
        this.r = gVar;
        gVar.setTextSize(1, 15.0f);
        gVar.setCursorWidth(1.5f);
        gVar.setInputType(gVar.getInputType() | org.telegram.messenger.hs.G2);
        gVar.setSingleLine(true);
        gVar.setBackground(null);
        gVar.setVerticalScrollBarEnabled(false);
        gVar.setHorizontalScrollBarEnabled(false);
        gVar.setPadding(org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f), 0);
        gVar.setClipToPadding(true);
        gVar.setImeOptions(268435459);
        int i3 = 16;
        gVar.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
        gVar.addTextChangedListener(new bh.h(this, 20));
        if (Build.VERSION.SDK_INT >= 35) {
            gVar.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(gVar, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.outline_search_1_24);
        addView(imageView, b8.mf.d(24, 24.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, b8.mf.d(-2, -1.0f, (org.telegram.messenger.bd.a0 ? 3 : 5) | 16, 32.0f, 0.0f, 32.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.miniplayer_close);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new f0(this, i3));
        addView(imageView2, b8.mf.d(24, 24.0f, (org.telegram.messenger.bd.a0 ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        org.telegram.ui.s51 s51Var = new org.telegram.ui.s51(13, getContext(), this);
        this.H = s51Var;
        s51Var.setOrientation(0);
        s51Var.setVisibility(0);
        addView(s51Var, b8.mf.d(-2, 32.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        setWillNotDraw(false);
        b();
        updateColors();
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 0) {
            ImageView imageView = this.f;
            l00.d(imageView, f10);
            imageView.setRotation((1.0f - f10) * 90.0f);
        } else if (i3 == 1) {
            l00.d(this.e, f10);
        } else if (i3 == 2) {
            b();
        }
    }

    public final void a(org.telegram.ui.ActionBar.q0 q0Var) {
        this.h.addView(q0Var);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Mi));
    }

    public final void b() {
        int max = Math.max(org.telegram.messenger.g0.L(6.0f) + ((int) this.c.f), org.telegram.messenger.g0.L(48.0f));
        int measuredWidth = this.h.getMeasuredWidth() + org.telegram.messenger.g0.L(48.0f);
        boolean z10 = org.telegram.messenger.bd.a0;
        int i3 = z10 ? measuredWidth : max;
        if (!z10) {
            max = measuredWidth;
        }
        Rect rect = org.telegram.messenger.g0.Q;
        bh.g gVar = this.r;
        rect.set(i3, 0, gVar.getMeasuredWidth() - max, gVar.getMeasuredHeight());
        gVar.setClipBounds(rect);
        gVar.setPadding(i3, 0, max, 0);
    }

    public final void c() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i3 >= arrayList.size()) {
                e();
                return;
            }
            if (((kg.l0) arrayList.get(i3)).h) {
                arrayList.remove(i3);
                i3--;
            }
            i3++;
        }
    }

    public final boolean d() {
        ArrayList arrayList = this.G;
        if (!arrayList.isEmpty()) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (((kg.l0) arrayList.get(i3)).h) {
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
        gh.g gVar = this.s;
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
        transitionSet.addTransition(new org.telegram.ui.ActionBar.h0(1).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) xq.g);
        transitionSet.addListener((Transition.TransitionListener) new org.telegram.ui.ActionBar.i0(1, this));
        org.telegram.ui.s51 s51Var = this.H;
        TransitionManager.beginDelayedTransition(s51Var, transitionSet);
        int i3 = 0;
        while (i3 < s51Var.getChildCount()) {
            if (!arrayList2.remove(((org.telegram.ui.ActionBar.p0) s51Var.getChildAt(i3)).getFilter())) {
                s51Var.removeViewAt(i3);
                i3--;
            }
            i3++;
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            kg.l0 l0Var = (kg.l0) arrayList2.get(i10);
            l0Var.getClass();
            org.telegram.ui.ActionBar.p0 p0Var = new org.telegram.ui.ActionBar.p0(getContext(), this.d);
            p0Var.r = true;
            p0Var.updateColors();
            p0Var.setData(l0Var);
            p0Var.setOnClickListener(new q2(18, this, p0Var));
            boolean z10 = org.telegram.messenger.bd.a0;
            s51Var.addView(p0Var, b8.mf.t(-2, -1, 0, z10 ? 6 : 0, 0, z10 ? 0 : 6, 0));
        }
        int i11 = 0;
        while (i11 < s51Var.getChildCount()) {
            ((org.telegram.ui.ActionBar.p0) s51Var.getChildAt(i11)).setExpanded(i11 == this.J);
            i11++;
        }
        s51Var.setTag(!isEmpty ? 1 : null);
    }

    public final void f(kg.l0 l0Var) {
        org.telegram.ui.cw cwVar;
        if (l0Var.h) {
            this.G.remove(l0Var);
            int i3 = this.J;
            if (i3 < 0 || i3 > r0.size() - 1) {
                this.J = r0.size() - 1;
            }
            e();
            m00 m00Var = this.I;
            if (m00Var == null || (cwVar = ((org.telegram.ui.av) m00Var).a.D0) == null) {
                return;
            }
            cwVar.R(false);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        b();
    }

    public void setBlurredBackgroundVisibility(float f10) {
        boolean z10;
        int i3;
        int i10 = (int) (f10 * 255.0f);
        gh.g gVar = this.s;
        boolean z11 = true;
        if (gVar == null || gVar.c == i10) {
            z10 = false;
        } else {
            gVar.setAlpha(i10);
            z10 = true;
        }
        Drawable drawable = this.w;
        if (drawable == null || drawable.getAlpha() == (i3 = 255 - i10)) {
            z11 = z10;
        } else {
            this.w.setAlpha(i3);
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

    public void setSearchFiltersListener(m00 m00Var) {
        this.I = m00Var;
    }

    public void setupBlurredBackground(gh.g gVar) {
        org.telegram.messenger.camera.q.p(gVar, org.telegram.messenger.g0.L(20.0f), 4.0f);
        this.s = gVar;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int r12;
        Drawable d02;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        boolean a10 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.k6.I.q();
        if (this.x) {
            d02 = org.telegram.ui.ActionBar.k6.f0(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var));
        } else {
            int L = org.telegram.messenger.g0.L(20.0f);
            if (this.y) {
                r12 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var);
            } else {
                r12 = org.telegram.ui.ActionBar.k6.r1(a10 ? 0.07f : 0.05f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var));
            }
            d02 = org.telegram.ui.ActionBar.k6.d0(L, r12);
        }
        this.w = d02;
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        int r13 = org.telegram.ui.ActionBar.k6.r1(0.6f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.e.setColorFilter(r13, mode);
        int r14 = org.telegram.ui.ActionBar.k6.r1(0.6f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        ImageView imageView = this.f;
        imageView.setColorFilter(r14, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, e6Var), 1, org.telegram.messenger.g0.L(17.0f)));
        int r15 = org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        bh.g gVar = this.r;
        gVar.setHintTextColor(r15);
        gVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        gVar.setCursorColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Mi, e6Var));
        gh.g gVar2 = this.s;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        LinearLayout linearLayout = this.h;
        int childCount = linearLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = linearLayout.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.ActionBar.q0) {
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) childAt;
                if (q0Var.getIconView() != null) {
                    q0Var.getIconView().setColorFilter(org.telegram.ui.ActionBar.k6.r1(0.6f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, e6Var), 1, org.telegram.messenger.g0.L(17.0f)));
            }
        }
        org.telegram.ui.s51 s51Var = this.H;
        int childCount2 = s51Var.getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            if (s51Var.getChildAt(i11) instanceof org.telegram.ui.ActionBar.p0) {
                ((org.telegram.ui.ActionBar.p0) s51Var.getChildAt(i11)).updateColors();
            }
        }
        invalidate();
    }

    @Override // qe.b
    public final /* synthetic */ void F(float f10, int i3) {
    }
}
