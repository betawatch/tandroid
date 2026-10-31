package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ds0 extends FrameLayout implements org.telegram.messenger.us {
    public final FrameLayout a;
    public final dg0 b;
    public final org.telegram.ui.ActionBar.u5[] c;
    public final org.telegram.ui.Components.f6 d;
    public AnimatorSet e;
    public AnimatorSet f;
    public boolean h;
    public ValueAnimator n;
    public float r;
    public int s;

    public ds0(Activity activity) {
        super(activity);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.a = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.i0.L(56.0f), 0, 0, 0);
        addView(frameLayout, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        dg0 dg0Var = new dg0(activity, 3);
        this.b = dg0Var;
        dg0Var.setPivotX(org.telegram.messenger.i0.L(16.0f));
        dg0Var.setPadding(org.telegram.messenger.i0.L(16.0f), 0, 0, 0);
        dg0Var.setClipToPadding(false);
        frameLayout.addView(dg0Var, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        this.c = new org.telegram.ui.ActionBar.u5[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.c[i10] = new org.telegram.ui.ActionBar.u5(activity);
            this.c[i10].setGravity(19);
            this.c[i10].setTextColor(-1);
            this.c[i10].setTextSize(20);
            this.c[i10].setTypeface(org.telegram.messenger.i0.o());
            this.c[i10].setDrawablePadding(org.telegram.messenger.i0.L(4.0f));
            this.c[i10].setScrollNonFitText(true);
            this.b.addView(this.c[i10], w7.b6.e(-1, -2, 19));
        }
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(activity, true, false, false);
        this.d = f6Var;
        f6Var.b(0.4f, 320L, org.telegram.ui.Components.gr.h);
        f6Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
        f6Var.setGravity(19);
        f6Var.setTextColor(-1);
        f6Var.setEllipsizeByGradient(true);
        f6Var.setImportantForAccessibility(1);
        f6Var.setAccessibilityLiveRegion(1);
        this.a.addView(f6Var, w7.b6.d(-1, 20.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a(CharSequence charSequence, boolean z10) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z11 = !isEmpty;
        boolean z12 = this.h;
        org.telegram.ui.Components.f6 f6Var = this.d;
        if (z11 != z12) {
            this.h = z11;
            AnimatorSet animatorSet = this.f;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            Point point = org.telegram.messenger.i0.q;
            int L = org.telegram.messenger.i0.L((!isEmpty ? 30 : 33) - (point.x > point.y ? 6 : 0));
            dg0 dg0Var = this.b;
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(f6Var, (Property<org.telegram.ui.Components.f6, Float>) View.ALPHA, !isEmpty ? 1.0f : 0.0f));
                float[] fArr = {L};
                Property property = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(f6Var, (Property<org.telegram.ui.Components.f6, Float>) property, fArr));
                arrayList.add(ObjectAnimator.ofFloat(dg0Var, (Property<dg0, Float>) property, isEmpty ? 0.0f : org.telegram.messenger.i0.L(-12.0f)));
                arrayList.add(ObjectAnimator.ofFloat(dg0Var, (Property<dg0, Float>) View.SCALE_X, !isEmpty ? 0.87f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(dg0Var, (Property<dg0, Float>) View.SCALE_Y, isEmpty ? 1.0f : 0.87f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.f.setInterpolator(org.telegram.ui.Components.gr.h);
                this.f.start();
            } else {
                f6Var.setAlpha(!isEmpty ? 1.0f : 0.0f);
                f6Var.setTranslationY(L);
                dg0Var.setTranslationY(isEmpty ? 0.0f : org.telegram.messenger.i0.L(-12.0f));
                dg0Var.setScaleX(!isEmpty ? 0.87f : 1.0f);
                dg0Var.setScaleY(isEmpty ? 1.0f : 0.87f);
            }
        }
        f6Var.c(charSequence, z10, true);
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = null;
        }
        f6Var.setContentDescription(charSequence);
    }

    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.u5[] u5VarArr = this.c;
        u5VarArr[0].getPaint().setShadowLayer(org.telegram.messenger.i0.N(0.66f), 0.0f, 1.0f, z10 ? 1912602624 : 0);
        u5VarArr[1].getPaint().setShadowLayer(org.telegram.messenger.i0.N(0.66f), 0.0f, 1.0f, z10 ? 1912602624 : 0);
        this.d.getDrawable().s(org.telegram.messenger.i0.N(0.66f), 1.0f, z10 ? 1912602624 : 0);
    }

    public final void c(CharSequence charSequence) {
        org.telegram.ui.ActionBar.u5[] u5VarArr = this.c;
        u5VarArr[1].setAlpha(0.0f);
        u5VarArr[1].setVisibility(8);
        CharSequence text = u5VarArr[0].getText();
        if (text != null || charSequence != null) {
            r1 = (text == null) != (charSequence == null) ? false : TextUtils.equals(text.toString(), charSequence.toString());
        }
        if (!r1) {
            org.telegram.ui.ActionBar.u5 u5Var = u5VarArr[0];
            u5Var.R = 0.0f;
            u5Var.b();
        }
        u5VarArr[0].k(charSequence);
        u5VarArr[0].setAlpha(1.0f);
        u5VarArr[0].setTranslationX(0.0f);
        u5VarArr[0].setTranslationY(0.0f);
    }

    public final void d(CharSequence charSequence, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.u5[] u5VarArr = this.c;
        CharSequence text = u5VarArr[0].getText();
        if (text == null ? false : TextUtils.equals(text.toString(), charSequence.toString())) {
            return;
        }
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.e = null;
        }
        org.telegram.ui.ActionBar.u5 u5Var = u5VarArr[1];
        org.telegram.ui.ActionBar.u5 u5Var2 = u5VarArr[0];
        u5Var.getClass();
        u5Var.R = u5Var2.R;
        u5Var.b();
        u5VarArr[1].k(u5VarArr[0].getText());
        u5VarArr[1].setRightPadding((int) this.r);
        org.telegram.ui.ActionBar.u5 u5Var3 = u5VarArr[0];
        u5Var3.R = 0.0f;
        u5Var3.b();
        u5VarArr[0].k(charSequence);
        float L = org.telegram.messenger.i0.L(8.0f) * (z11 ? 1 : -1);
        u5VarArr[1].setTranslationX(0.0f);
        u5VarArr[1].setTranslationY(0.0f);
        if (z10) {
            u5VarArr[0].setTranslationX(0.0f);
            u5VarArr[0].setTranslationY(-L);
        } else {
            u5VarArr[0].setTranslationX(-L);
            u5VarArr[0].setTranslationY(0.0f);
        }
        u5VarArr[0].setAlpha(0.0f);
        u5VarArr[1].setAlpha(1.0f);
        u5VarArr[0].setVisibility(0);
        u5VarArr[1].setVisibility(0);
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(u5VarArr[1], (Property<org.telegram.ui.ActionBar.u5, Float>) property, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(u5VarArr[0], (Property<org.telegram.ui.ActionBar.u5, Float>) property, 1.0f));
        org.telegram.ui.ActionBar.u5 u5Var4 = u5VarArr[1];
        Property property2 = View.TRANSLATION_X;
        Property property3 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(u5Var4, (Property<org.telegram.ui.ActionBar.u5, Float>) (z10 ? property3 : property2), L));
        org.telegram.ui.ActionBar.u5 u5Var5 = u5VarArr[0];
        if (z10) {
            property2 = property3;
        }
        arrayList.add(ObjectAnimator.ofFloat(u5Var5, (Property<org.telegram.ui.ActionBar.u5, Float>) property2, 0.0f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.e = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.e.addListener(new org.telegram.ui.Components.voip.h2(this, 29));
        this.e.setDuration(320L);
        this.e.setInterpolator(org.telegram.ui.Components.gr.h);
        this.e.start();
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.i4) {
            org.telegram.ui.ActionBar.u5[] u5VarArr = this.c;
            u5VarArr[0].invalidate();
            u5VarArr[1].invalidate();
            this.d.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.i4);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.a.layout(0, org.telegram.messenger.i0.m, i12 - i10, i13 - i11);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = org.telegram.messenger.i0.m;
        int i13 = this.s;
        int i14 = org.telegram.messenger.i0.q.y;
        if (i13 != i14) {
            this.s = i14;
            this.h = !this.h;
            a(this.d.getText(), false);
        }
        this.a.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2 - i12, TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }
}
