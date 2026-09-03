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
import org.telegram.ui.Components.kp;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class r7 extends FrameLayout {
    public n7[] a;
    public MessageObject[] b;
    public int[] c;
    public o7 d;
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
        n7 n7Var = this.a[i10];
        FrameLayout frameLayout = n7Var.f;
        kp kpVar = n7Var.e;
        if (kpVar.getVisibility() != 0) {
            kpVar.setVisibility(0);
        }
        kpVar.a(z4, true);
        AnimatorSet animatorSet = n7Var.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            n7Var.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        n7Var.h = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_X, z4 ? 0.81f : 1.0f), ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_Y, z4 ? 0.81f : 1.0f));
        n7Var.h.setDuration(200L);
        n7Var.h.addListener(new org.telegram.ui.u5(n7Var, 10));
        n7Var.h.start();
    }

    public final void c(int i10, int i11, MessageObject messageObject) {
        n7[] n7VarArr = this.a;
        MessageObject[] messageObjectArr = this.b;
        messageObjectArr[i10] = messageObject;
        this.c[i10] = i11;
        if (messageObject != null) {
            n7VarArr[i10].setVisibility(0);
            n7VarArr[i10].setMessageObject(messageObject);
        } else {
            n7VarArr[i10].clearAnimation();
            n7VarArr[i10].setVisibility(4);
            messageObjectArr[i10] = null;
        }
    }

    public o7 getDelegate() {
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

    public void setDelegate(o7 o7Var) {
        this.d = o7Var;
    }

    public void setIsFirst(boolean z4) {
        this.f = z4;
    }

    public void setItemsCount(int i10) {
        n7[] n7VarArr = this.a;
        int i11 = 0;
        while (i11 < n7VarArr.length) {
            n7VarArr[i11].clearAnimation();
            n7VarArr[i11].setVisibility(i11 < i10 ? 0 : 4);
            i11++;
        }
        this.e = i10;
    }
}
