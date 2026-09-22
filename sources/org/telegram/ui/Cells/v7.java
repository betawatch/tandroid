package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.rk;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.np;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class v7 extends FrameLayout {
    public r7[] a;
    public MessageObject[] b;
    public int[] c;
    public s7 d;
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

    public final void b(int i10, boolean z10) {
        r7 r7Var = this.a[i10];
        FrameLayout frameLayout = r7Var.f;
        np npVar = r7Var.e;
        if (npVar.getVisibility() != 0) {
            npVar.setVisibility(0);
        }
        npVar.a(z10, true);
        AnimatorSet animatorSet = r7Var.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            r7Var.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        r7Var.h = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_X, z10 ? 0.81f : 1.0f), ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_Y, z10 ? 0.81f : 1.0f));
        r7Var.h.setDuration(200L);
        r7Var.h.addListener(new org.telegram.ui.t4(r7Var, 11));
        r7Var.h.start();
    }

    public final void c(int i10, int i11, MessageObject messageObject) {
        r7[] r7VarArr = this.a;
        MessageObject[] messageObjectArr = this.b;
        messageObjectArr[i10] = messageObject;
        this.c[i10] = i11;
        if (messageObject != null) {
            r7VarArr[i10].setVisibility(0);
            r7VarArr[i10].setMessageObject(messageObject);
        } else {
            r7VarArr[i10].clearAnimation();
            r7VarArr[i10].setVisibility(4);
            messageObjectArr[i10] = null;
        }
    }

    public s7 getDelegate() {
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
        int B = this.r == 1 ? rk.B(2.0f, this.e - 1, View.MeasureSpec.getSize(i10)) / this.e : a(this.e);
        this.h = true;
        for (int i12 = 0; i12 < this.e; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            layoutParams.topMargin = this.f ? 0 : AndroidUtilities.dp(2.0f);
            layoutParams.leftMargin = (AndroidUtilities.dp(2.0f) + B) * i12;
            if (i12 != this.e - 1) {
                layoutParams.width = B;
            } else if (AndroidUtilities.isTablet()) {
                layoutParams.width = AndroidUtilities.dp(490.0f) - ((AndroidUtilities.dp(2.0f) + B) * (this.e - 1));
            } else {
                layoutParams.width = AndroidUtilities.displaySize.x - ((AndroidUtilities.dp(2.0f) + B) * (this.e - 1));
            }
            layoutParams.height = B;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        this.h = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((this.f ? 0 : AndroidUtilities.dp(2.0f)) + B, TLObject.FLAG_30));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }

    public void setDelegate(s7 s7Var) {
        this.d = s7Var;
    }

    public void setIsFirst(boolean z10) {
        this.f = z10;
    }

    public void setItemsCount(int i10) {
        r7[] r7VarArr = this.a;
        int i11 = 0;
        while (i11 < r7VarArr.length) {
            r7VarArr[i11].clearAnimation();
            r7VarArr[i11].setVisibility(i11 < i10 ? 0 : 4);
            i11++;
        }
        this.e = i10;
    }
}
