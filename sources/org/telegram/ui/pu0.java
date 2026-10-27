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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class pu0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout a;
    public final di.i4 b;
    public final org.telegram.ui.ActionBar.b6[] c;
    public final org.telegram.ui.Components.s6 d;
    public AnimatorSet e;
    public AnimatorSet f;
    public boolean h;
    public ValueAnimator n;
    public float r;
    public int s;

    public pu0(Activity activity) {
        super(activity);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.a = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(56.0f), 0, 0, 0);
        addView(frameLayout, org.telegram.ui.Components.kb1.i(-1, -1, 119));
        di.i4 i4Var = new di.i4(activity, 25);
        this.b = i4Var;
        i4Var.setPivotX(AndroidUtilities.dp(16.0f));
        i4Var.setPadding(AndroidUtilities.dp(16.0f), 0, 0, 0);
        i4Var.setClipToPadding(false);
        frameLayout.addView(i4Var, org.telegram.ui.Components.kb1.i(-1, -1, 119));
        this.c = new org.telegram.ui.ActionBar.b6[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.c[i10] = new org.telegram.ui.ActionBar.b6(activity);
            this.c[i10].setGravity(19);
            this.c[i10].setTextColor(-1);
            this.c[i10].setTextSize(20);
            this.c[i10].setTypeface(AndroidUtilities.bold());
            this.c[i10].setDrawablePadding(AndroidUtilities.dp(4.0f));
            this.c[i10].setScrollNonFitText(true);
            this.b.addView(this.c[i10], org.telegram.ui.Components.kb1.i(-1, -2, 19));
        }
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(activity, true, false, false);
        this.d = s6Var;
        s6Var.b(0.4f, 320L, org.telegram.ui.Components.ds.h);
        s6Var.setTextSize(AndroidUtilities.dp(14.0f));
        s6Var.setGravity(19);
        s6Var.setTextColor(-1);
        s6Var.setEllipsizeByGradient(true);
        s6Var.setImportantForAccessibility(1);
        s6Var.setAccessibilityLiveRegion(1);
        this.a.addView(s6Var, org.telegram.ui.Components.kb1.h(-1, 20.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a(CharSequence charSequence, boolean z10) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z11 = !isEmpty;
        boolean z12 = this.h;
        org.telegram.ui.Components.s6 s6Var = this.d;
        if (z11 != z12) {
            this.h = z11;
            AnimatorSet animatorSet = this.f;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            Point point = AndroidUtilities.displaySize;
            int dp = AndroidUtilities.dp((!isEmpty ? 30 : 33) - (point.x > point.y ? 6 : 0));
            di.i4 i4Var = this.b;
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(s6Var, (Property<org.telegram.ui.Components.s6, Float>) View.ALPHA, !isEmpty ? 1.0f : 0.0f));
                float[] fArr = {dp};
                Property property = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(s6Var, (Property<org.telegram.ui.Components.s6, Float>) property, fArr));
                arrayList.add(ObjectAnimator.ofFloat(i4Var, (Property<di.i4, Float>) property, isEmpty ? 0.0f : AndroidUtilities.dp(-12.0f)));
                arrayList.add(ObjectAnimator.ofFloat(i4Var, (Property<di.i4, Float>) View.SCALE_X, !isEmpty ? 0.87f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(i4Var, (Property<di.i4, Float>) View.SCALE_Y, isEmpty ? 1.0f : 0.87f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.f.setInterpolator(org.telegram.ui.Components.ds.h);
                this.f.start();
            } else {
                s6Var.setAlpha(!isEmpty ? 1.0f : 0.0f);
                s6Var.setTranslationY(dp);
                i4Var.setTranslationY(isEmpty ? 0.0f : AndroidUtilities.dp(-12.0f));
                i4Var.setScaleX(!isEmpty ? 0.87f : 1.0f);
                i4Var.setScaleY(isEmpty ? 1.0f : 0.87f);
            }
        }
        s6Var.c(charSequence, z10, true);
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = null;
        }
        s6Var.setContentDescription(charSequence);
    }

    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.b6[] b6VarArr = this.c;
        b6VarArr[0].getPaint().setShadowLayer(AndroidUtilities.dpf2(0.66f), 0.0f, 1.0f, z10 ? 1912602624 : 0);
        b6VarArr[1].getPaint().setShadowLayer(AndroidUtilities.dpf2(0.66f), 0.0f, 1.0f, z10 ? 1912602624 : 0);
        this.d.getDrawable().s(AndroidUtilities.dpf2(0.66f), 1.0f, z10 ? 1912602624 : 0);
    }

    public final void c(CharSequence charSequence) {
        org.telegram.ui.ActionBar.b6[] b6VarArr = this.c;
        b6VarArr[1].setAlpha(0.0f);
        b6VarArr[1].setVisibility(8);
        CharSequence text = b6VarArr[0].getText();
        if (text != null || charSequence != null) {
            r1 = (text == null) != (charSequence == null) ? false : TextUtils.equals(text.toString(), charSequence.toString());
        }
        if (!r1) {
            org.telegram.ui.ActionBar.b6 b6Var = b6VarArr[0];
            b6Var.R = 0.0f;
            b6Var.b();
        }
        b6VarArr[0].k(charSequence);
        b6VarArr[0].setAlpha(1.0f);
        b6VarArr[0].setTranslationX(0.0f);
        b6VarArr[0].setTranslationY(0.0f);
    }

    public final void d(CharSequence charSequence, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.b6[] b6VarArr = this.c;
        CharSequence text = b6VarArr[0].getText();
        if (text == null ? false : TextUtils.equals(text.toString(), charSequence.toString())) {
            return;
        }
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.e = null;
        }
        org.telegram.ui.ActionBar.b6 b6Var = b6VarArr[1];
        org.telegram.ui.ActionBar.b6 b6Var2 = b6VarArr[0];
        b6Var.getClass();
        b6Var.R = b6Var2.R;
        b6Var.b();
        b6VarArr[1].k(b6VarArr[0].getText());
        b6VarArr[1].setRightPadding((int) this.r);
        org.telegram.ui.ActionBar.b6 b6Var3 = b6VarArr[0];
        b6Var3.R = 0.0f;
        b6Var3.b();
        b6VarArr[0].k(charSequence);
        float dp = AndroidUtilities.dp(8.0f) * (z11 ? 1 : -1);
        b6VarArr[1].setTranslationX(0.0f);
        b6VarArr[1].setTranslationY(0.0f);
        if (z10) {
            b6VarArr[0].setTranslationX(0.0f);
            b6VarArr[0].setTranslationY(-dp);
        } else {
            b6VarArr[0].setTranslationX(-dp);
            b6VarArr[0].setTranslationY(0.0f);
        }
        b6VarArr[0].setAlpha(0.0f);
        b6VarArr[1].setAlpha(1.0f);
        b6VarArr[0].setVisibility(0);
        b6VarArr[1].setVisibility(0);
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(b6VarArr[1], (Property<org.telegram.ui.ActionBar.b6, Float>) property, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(b6VarArr[0], (Property<org.telegram.ui.ActionBar.b6, Float>) property, 1.0f));
        org.telegram.ui.ActionBar.b6 b6Var4 = b6VarArr[1];
        Property property2 = View.TRANSLATION_X;
        Property property3 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(b6Var4, (Property<org.telegram.ui.ActionBar.b6, Float>) (z10 ? property3 : property2), dp));
        org.telegram.ui.ActionBar.b6 b6Var5 = b6VarArr[0];
        if (z10) {
            property2 = property3;
        }
        arrayList.add(ObjectAnimator.ofFloat(b6Var5, (Property<org.telegram.ui.ActionBar.b6, Float>) property2, 0.0f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.e = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.e.addListener(new k50(this, 18));
        this.e.setDuration(320L);
        this.e.setInterpolator(org.telegram.ui.Components.ds.h);
        this.e.start();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.ActionBar.b6[] b6VarArr = this.c;
            b6VarArr[0].invalidate();
            b6VarArr[1].invalidate();
            this.d.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
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
