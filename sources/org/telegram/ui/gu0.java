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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class gu0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout a;
    public final dh.d b;
    public final org.telegram.ui.ActionBar.k5[] c;
    public final org.telegram.ui.Components.k6 d;
    public AnimatorSet e;
    public AnimatorSet f;
    public boolean h;
    public ValueAnimator n;
    public float r;
    public int s;

    public gu0(Activity activity) {
        super(activity);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.a = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(56.0f), 0, 0, 0);
        addView(frameLayout, k7.b6.e(-1, -1, 119));
        dh.d dVar = new dh.d(activity, 25);
        this.b = dVar;
        dVar.setPivotX(AndroidUtilities.dp(16.0f));
        dVar.setPadding(AndroidUtilities.dp(16.0f), 0, 0, 0);
        dVar.setClipToPadding(false);
        frameLayout.addView(dVar, k7.b6.e(-1, -1, 119));
        this.c = new org.telegram.ui.ActionBar.k5[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.c[i10] = new org.telegram.ui.ActionBar.k5(activity);
            this.c[i10].setGravity(19);
            this.c[i10].setTextColor(-1);
            this.c[i10].setTextSize(20);
            this.c[i10].setTypeface(AndroidUtilities.bold());
            this.c[i10].setDrawablePadding(AndroidUtilities.dp(4.0f));
            this.c[i10].setScrollNonFitText(true);
            this.b.addView(this.c[i10], k7.b6.e(-1, -2, 19));
        }
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(activity, true, false, false);
        this.d = k6Var;
        k6Var.b(0.4f, 320L, org.telegram.ui.Components.nr.h);
        k6Var.setTextSize(AndroidUtilities.dp(14.0f));
        k6Var.setGravity(19);
        k6Var.setTextColor(-1);
        k6Var.setEllipsizeByGradient(true);
        k6Var.setImportantForAccessibility(1);
        k6Var.setAccessibilityLiveRegion(1);
        this.a.addView(k6Var, k7.b6.d(-1, 20.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a(CharSequence charSequence, boolean z4) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z10 = !isEmpty;
        boolean z11 = this.h;
        org.telegram.ui.Components.k6 k6Var = this.d;
        if (z10 != z11) {
            this.h = z10;
            AnimatorSet animatorSet = this.f;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            Point point = AndroidUtilities.displaySize;
            int dp = AndroidUtilities.dp((!isEmpty ? 30 : 33) - (point.x > point.y ? 6 : 0));
            dh.d dVar = this.b;
            if (z4) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(k6Var, (Property<org.telegram.ui.Components.k6, Float>) View.ALPHA, !isEmpty ? 1.0f : 0.0f));
                float[] fArr = {dp};
                Property property = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(k6Var, (Property<org.telegram.ui.Components.k6, Float>) property, fArr));
                arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<dh.d, Float>) property, isEmpty ? 0.0f : AndroidUtilities.dp(-12.0f)));
                arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<dh.d, Float>) View.SCALE_X, !isEmpty ? 0.87f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<dh.d, Float>) View.SCALE_Y, isEmpty ? 1.0f : 0.87f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.f.setInterpolator(org.telegram.ui.Components.nr.h);
                this.f.start();
            } else {
                k6Var.setAlpha(!isEmpty ? 1.0f : 0.0f);
                k6Var.setTranslationY(dp);
                dVar.setTranslationY(isEmpty ? 0.0f : AndroidUtilities.dp(-12.0f));
                dVar.setScaleX(!isEmpty ? 0.87f : 1.0f);
                dVar.setScaleY(isEmpty ? 1.0f : 0.87f);
            }
        }
        k6Var.c(charSequence, z4, true);
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = null;
        }
        k6Var.setContentDescription(charSequence);
    }

    public final void b(boolean z4) {
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.c;
        k5VarArr[0].getPaint().setShadowLayer(AndroidUtilities.dpf2(0.66f), 0.0f, 1.0f, z4 ? 1912602624 : 0);
        k5VarArr[1].getPaint().setShadowLayer(AndroidUtilities.dpf2(0.66f), 0.0f, 1.0f, z4 ? 1912602624 : 0);
        this.d.getDrawable().p(AndroidUtilities.dpf2(0.66f), 1.0f, z4 ? 1912602624 : 0);
    }

    public final void c(CharSequence charSequence) {
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.c;
        k5VarArr[1].setAlpha(0.0f);
        k5VarArr[1].setVisibility(8);
        CharSequence text = k5VarArr[0].getText();
        if (text != null || charSequence != null) {
            r1 = (text == null) != (charSequence == null) ? false : TextUtils.equals(text.toString(), charSequence.toString());
        }
        if (!r1) {
            org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[0];
            k5Var.O = 0.0f;
            k5Var.b();
        }
        k5VarArr[0].k(charSequence);
        k5VarArr[0].setAlpha(1.0f);
        k5VarArr[0].setTranslationX(0.0f);
        k5VarArr[0].setTranslationY(0.0f);
    }

    public final void d(CharSequence charSequence, boolean z4, boolean z10) {
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.c;
        CharSequence text = k5VarArr[0].getText();
        if (text == null ? false : TextUtils.equals(text.toString(), charSequence.toString())) {
            return;
        }
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.e = null;
        }
        org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[1];
        org.telegram.ui.ActionBar.k5 k5Var2 = k5VarArr[0];
        k5Var.getClass();
        k5Var.O = k5Var2.O;
        k5Var.b();
        k5VarArr[1].k(k5VarArr[0].getText());
        k5VarArr[1].setRightPadding((int) this.r);
        org.telegram.ui.ActionBar.k5 k5Var3 = k5VarArr[0];
        k5Var3.O = 0.0f;
        k5Var3.b();
        k5VarArr[0].k(charSequence);
        float dp = AndroidUtilities.dp(8.0f) * (z10 ? 1 : -1);
        k5VarArr[1].setTranslationX(0.0f);
        k5VarArr[1].setTranslationY(0.0f);
        if (z4) {
            k5VarArr[0].setTranslationX(0.0f);
            k5VarArr[0].setTranslationY(-dp);
        } else {
            k5VarArr[0].setTranslationX(-dp);
            k5VarArr[0].setTranslationY(0.0f);
        }
        k5VarArr[0].setAlpha(0.0f);
        k5VarArr[1].setAlpha(1.0f);
        k5VarArr[0].setVisibility(0);
        k5VarArr[1].setVisibility(0);
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(k5VarArr[1], (Property<org.telegram.ui.ActionBar.k5, Float>) property, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(k5VarArr[0], (Property<org.telegram.ui.ActionBar.k5, Float>) property, 1.0f));
        org.telegram.ui.ActionBar.k5 k5Var4 = k5VarArr[1];
        Property property2 = View.TRANSLATION_X;
        Property property3 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(k5Var4, (Property<org.telegram.ui.ActionBar.k5, Float>) (z4 ? property3 : property2), dp));
        org.telegram.ui.ActionBar.k5 k5Var5 = k5VarArr[0];
        if (z4) {
            property2 = property3;
        }
        arrayList.add(ObjectAnimator.ofFloat(k5Var5, (Property<org.telegram.ui.ActionBar.k5, Float>) property2, 0.0f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.e = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.e.addListener(new ls0(this, 8));
        this.e.setDuration(320L);
        this.e.setInterpolator(org.telegram.ui.Components.nr.h);
        this.e.start();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.ActionBar.k5[] k5VarArr = this.c;
            k5VarArr[0].invalidate();
            k5VarArr[1].invalidate();
            this.d.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        this.a.layout(0, AndroidUtilities.statusBarHeight, i12 - i10, i13 - i11);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = AndroidUtilities.statusBarHeight;
        int i13 = this.s;
        int i14 = AndroidUtilities.displaySize.y;
        if (i13 != i14) {
            this.s = i14;
            this.h = !this.h;
            a(this.d.getText(), false);
        }
        this.a.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2 - i12, TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }
}
