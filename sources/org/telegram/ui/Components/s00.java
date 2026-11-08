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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class s00 extends FrameLayout implements te.b, org.telegram.ui.ActionBar.a6 {
    public Runnable D;
    public final h2.f E;
    public final ArrayList F;
    public final org.telegram.ui.c61 G;
    public r00 H;
    public int I;
    public final te.a a;
    public final te.a b;
    public final te.c c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final ImageView e;
    public final ImageView f;
    public final LinearLayout h;
    public boolean n;
    public final ah.i r;
    public fh.g s;
    public Drawable w;
    public boolean x;
    public boolean y;

    public s00(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        xq xqVar = xq.h;
        this.a = new te.a(0, this, xqVar, 380L, false);
        this.b = new te.a(1, this, xqVar, 380L, true);
        this.c = new te.c(2, this, se.a.a, 280L);
        this.E = new h2.f((int[]) null);
        this.F = new ArrayList();
        this.d = f6Var;
        ah.i iVar = new ah.i(6, context, this);
        this.r = iVar;
        iVar.setTextSize(1, 15.0f);
        iVar.setCursorWidth(1.5f);
        iVar.setInputType(iVar.getInputType() | org.telegram.messenger.qs.G2);
        iVar.setSingleLine(true);
        iVar.setBackground(null);
        iVar.setVerticalScrollBarEnabled(false);
        iVar.setHorizontalScrollBarEnabled(false);
        iVar.setPadding(org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f), 0);
        iVar.setClipToPadding(true);
        iVar.setImeOptions(268435459);
        int i7 = 16;
        iVar.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 16);
        iVar.addTextChangedListener(new ah.j(this, 20));
        if (Build.VERSION.SDK_INT >= 35) {
            iVar.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(iVar, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.outline_search_1_24);
        addView(imageView, c8.ha.d(24, 24.0f, (org.telegram.messenger.id.a0 ? 5 : 3) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.ha.d(-2, -1.0f, (org.telegram.messenger.id.a0 ? 3 : 5) | 16, 32.0f, 0.0f, 32.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.miniplayer_close);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new h0(this, i7));
        addView(imageView2, c8.ha.d(24, 24.0f, (org.telegram.messenger.id.a0 ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        org.telegram.ui.c61 c61Var = new org.telegram.ui.c61(12, getContext(), this);
        this.G = c61Var;
        c61Var.setOrientation(0);
        c61Var.setVisibility(0);
        addView(c61Var, c8.ha.d(-2, 32.0f, (org.telegram.messenger.id.a0 ? 5 : 3) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        setWillNotDraw(false);
        b();
        updateColors();
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            ImageView imageView = this.f;
            q00.d(imageView, f10);
            imageView.setRotation((1.0f - f10) * 90.0f);
        } else if (i7 == 1) {
            q00.d(this.e, f10);
        } else if (i7 == 2) {
            b();
        }
    }

    public final void a(org.telegram.ui.ActionBar.r0 r0Var) {
        this.h.addView(r0Var);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Mi));
    }

    public final void b() {
        int max = Math.max(org.telegram.messenger.g0.L(6.0f) + ((int) this.c.f), org.telegram.messenger.g0.L(48.0f));
        int measuredWidth = this.h.getMeasuredWidth() + org.telegram.messenger.g0.L(48.0f);
        boolean z9 = org.telegram.messenger.id.a0;
        int i7 = z9 ? measuredWidth : max;
        if (!z9) {
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
            ArrayList arrayList = this.F;
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
        ArrayList arrayList = this.F;
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
        ArrayList arrayList = this.F;
        boolean isEmpty = arrayList.isEmpty();
        this.b.a(isEmpty, true);
        ArrayList arrayList2 = new ArrayList(arrayList);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i0(1).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) xq.g);
        transitionSet.addListener((Transition.TransitionListener) new org.telegram.ui.ActionBar.j0(1, this));
        org.telegram.ui.c61 c61Var = this.G;
        TransitionManager.beginDelayedTransition(c61Var, transitionSet);
        int i7 = 0;
        while (i7 < c61Var.getChildCount()) {
            if (!arrayList2.remove(((org.telegram.ui.ActionBar.q0) c61Var.getChildAt(i7)).getFilter())) {
                c61Var.removeViewAt(i7);
                i7--;
            }
            i7++;
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            jg.o0 o0Var = (jg.o0) arrayList2.get(i10);
            o0Var.getClass();
            org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(getContext(), this.d);
            q0Var.r = true;
            q0Var.updateColors();
            q0Var.setData(o0Var);
            q0Var.setOnClickListener(new lk(12, this, q0Var));
            boolean z9 = org.telegram.messenger.id.a0;
            c61Var.addView(q0Var, c8.ha.t(-2, -1, 0, z9 ? 6 : 0, 0, z9 ? 0 : 6, 0));
        }
        int i11 = 0;
        while (i11 < c61Var.getChildCount()) {
            ((org.telegram.ui.ActionBar.q0) c61Var.getChildAt(i11)).setExpanded(i11 == this.I);
            i11++;
        }
        c61Var.setTag(!isEmpty ? 1 : null);
    }

    public final void f(jg.o0 o0Var) {
        org.telegram.ui.fw fwVar;
        if (o0Var.h) {
            this.F.remove(o0Var);
            int i7 = this.I;
            if (i7 < 0 || i7 > r0.size() - 1) {
                this.I = r0.size() - 1;
            }
            e();
            r00 r00Var = this.H;
            if (r00Var == null || (fwVar = ((org.telegram.ui.dv) r00Var).a.C0) == null) {
                return;
            }
            fwVar.R(false);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        b();
    }

    public void setBlurredBackgroundVisibility(float f10) {
        boolean z9;
        int i7;
        int i10 = (int) (f10 * 255.0f);
        fh.g gVar = this.s;
        boolean z10 = true;
        if (gVar == null || gVar.c == i10) {
            z9 = false;
        } else {
            gVar.setAlpha(i10);
            z9 = true;
        }
        Drawable drawable = this.w;
        if (drawable == null || drawable.getAlpha() == (i7 = 255 - i10)) {
            z10 = z9;
        } else {
            this.w.setAlpha(i7);
        }
        if (z10) {
            invalidate();
        }
    }

    public void setCloseButtonOnClickListener(Runnable runnable) {
        this.D = runnable;
    }

    public void setCloseButtonVisible(boolean z9) {
        this.n = z9;
        this.a.a(z9 || this.r.length() > 0, true);
    }

    public void setSearchFiltersListener(r00 r00Var) {
        this.H = r00Var;
    }

    public void setupBlurredBackground(fh.g gVar) {
        org.telegram.messenger.camera.q.p(gVar, org.telegram.messenger.g0.L(20.0f), 4.0f);
        this.s = gVar;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        int r12;
        Drawable d02;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        boolean a10 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.k6.I.q();
        if (this.x) {
            d02 = org.telegram.ui.ActionBar.k6.f0(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, f6Var));
        } else {
            int L = org.telegram.messenger.g0.L(20.0f);
            if (this.y) {
                r12 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, f6Var);
            } else {
                r12 = org.telegram.ui.ActionBar.k6.r1(a10 ? 0.07f : 0.05f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, f6Var));
            }
            d02 = org.telegram.ui.ActionBar.k6.d0(L, r12);
        }
        this.w = d02;
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        int r13 = org.telegram.ui.ActionBar.k6.r1(0.6f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.e.setColorFilter(r13, mode);
        int r14 = org.telegram.ui.ActionBar.k6.r1(0.6f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        ImageView imageView = this.f;
        imageView.setColorFilter(r14, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, f6Var), 1, org.telegram.messenger.g0.L(17.0f)));
        int r15 = org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        ah.i iVar = this.r;
        iVar.setHintTextColor(r15);
        iVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        iVar.setCursorColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Mi, f6Var));
        fh.g gVar = this.s;
        if (gVar != null) {
            gVar.updateColors();
        }
        LinearLayout linearLayout = this.h;
        int childCount = linearLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = linearLayout.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.ActionBar.r0) {
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) childAt;
                if (r0Var.getIconView() != null) {
                    r0Var.getIconView().setColorFilter(org.telegram.ui.ActionBar.k6.r1(0.6f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, f6Var)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, f6Var), 1, org.telegram.messenger.g0.L(17.0f)));
            }
        }
        org.telegram.ui.c61 c61Var = this.G;
        int childCount2 = c61Var.getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            if (c61Var.getChildAt(i11) instanceof org.telegram.ui.ActionBar.q0) {
                ((org.telegram.ui.ActionBar.q0) c61Var.getChildAt(i11)).updateColors();
            }
        }
        invalidate();
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
