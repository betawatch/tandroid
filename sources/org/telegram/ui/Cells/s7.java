package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.lp;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class s7 extends FrameLayout {
    public o7[] a;
    public MessageObject[] b;
    public int[] c;
    public p7 d;
    public int e;
    public boolean f;
    public boolean h;
    public Paint n;
    public int r;
    public int s;

    public static int a(int i10) {
        if (AndroidUtilities.isTablet()) {
            return (AndroidUtilities.dp(490.0f) - (AndroidUtilities.dp(2.0f) * (i10 - 1))) / i10;
        }
        return (AndroidUtilities.displaySize.x - (AndroidUtilities.dp(2.0f) * (i10 - 1))) / i10;
    }

    public final void b(int i10, boolean z4) {
        o7 o7Var = this.a[i10];
        FrameLayout frameLayout = o7Var.f;
        lp lpVar = o7Var.e;
        if (lpVar.getVisibility() != 0) {
            lpVar.setVisibility(0);
        }
        lpVar.a(z4, true);
        AnimatorSet animatorSet = o7Var.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            o7Var.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        o7Var.h = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_X, z4 ? 0.81f : 1.0f), ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_Y, z4 ? 0.81f : 1.0f));
        o7Var.h.setDuration(200L);
        o7Var.h.addListener(new org.telegram.ui.s5(o7Var, 10));
        o7Var.h.start();
    }

    public final void c(int i10, int i11, MessageObject messageObject) {
        o7[] o7VarArr = this.a;
        MessageObject[] messageObjectArr = this.b;
        messageObjectArr[i10] = messageObject;
        this.c[i10] = i11;
        if (messageObject != null) {
            o7VarArr[i10].setVisibility(0);
            o7VarArr[i10].setMessageObject(messageObject);
        } else {
            o7VarArr[i10].clearAnimation();
            o7VarArr[i10].setVisibility(4);
            messageObjectArr[i10] = null;
        }
    }

    public p7 getDelegate() {
        return this.d;
    }

    @Override // android.view.View
    public final void invalidate() {
        for (int i10 = 0; i10 < 6; i10++) {
            this.a[i10].invalidate();
        }
        super.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        View[] viewArr = this.a;
        int z4 = this.r == 1 ? org.telegram.ui.b.z(2.0f, this.e - 1, View.MeasureSpec.getSize(i10)) / this.e : a(this.e);
        this.h = true;
        for (int i12 = 0; i12 < this.e; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            layoutParams.topMargin = this.f ? 0 : AndroidUtilities.dp(2.0f);
            layoutParams.leftMargin = (AndroidUtilities.dp(2.0f) + z4) * i12;
            if (i12 != this.e - 1) {
                layoutParams.width = z4;
            } else if (AndroidUtilities.isTablet()) {
                layoutParams.width = AndroidUtilities.dp(490.0f) - ((AndroidUtilities.dp(2.0f) + z4) * (this.e - 1));
            } else {
                layoutParams.width = AndroidUtilities.displaySize.x - ((AndroidUtilities.dp(2.0f) + z4) * (this.e - 1));
            }
            layoutParams.height = z4;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        this.h = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((this.f ? 0 : AndroidUtilities.dp(2.0f)) + z4, TLObject.FLAG_30));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }

    public void setDelegate(p7 p7Var) {
        this.d = p7Var;
    }

    public void setIsFirst(boolean z4) {
        this.f = z4;
    }

    public void setItemsCount(int i10) {
        o7[] o7VarArr = this.a;
        int i11 = 0;
        while (i11 < o7VarArr.length) {
            o7VarArr[i11].clearAnimation();
            o7VarArr[i11].setVisibility(i11 < i10 ? 0 : 4);
            i11++;
        }
        this.e = i10;
    }
}
