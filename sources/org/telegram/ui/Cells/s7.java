package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.dp;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public static int a(int i9) {
        if (AndroidUtilities.isTablet()) {
            return (AndroidUtilities.dp(490.0f) - (AndroidUtilities.dp(2.0f) * (i9 - 1))) / i9;
        }
        return (AndroidUtilities.displaySize.x - (AndroidUtilities.dp(2.0f) * (i9 - 1))) / i9;
    }

    public final void b(int i9, boolean z10) {
        o7 o7Var = this.a[i9];
        FrameLayout frameLayout = o7Var.f;
        dp dpVar = o7Var.e;
        if (dpVar.getVisibility() != 0) {
            dpVar.setVisibility(0);
        }
        dpVar.a(z10, true);
        AnimatorSet animatorSet = o7Var.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            o7Var.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        o7Var.h = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_X, z10 ? 0.81f : 1.0f), ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_Y, z10 ? 0.81f : 1.0f));
        o7Var.h.setDuration(200L);
        o7Var.h.addListener(new mh.x(o7Var, 17));
        o7Var.h.start();
    }

    public final void c(int i9, int i10, MessageObject messageObject) {
        o7[] o7VarArr = this.a;
        MessageObject[] messageObjectArr = this.b;
        messageObjectArr[i9] = messageObject;
        this.c[i9] = i10;
        if (messageObject != null) {
            o7VarArr[i9].setVisibility(0);
            o7VarArr[i9].setMessageObject(messageObject);
        } else {
            o7VarArr[i9].clearAnimation();
            o7VarArr[i9].setVisibility(4);
            messageObjectArr[i9] = null;
        }
    }

    public p7 getDelegate() {
        return this.d;
    }

    @Override // android.view.View
    public final void invalidate() {
        for (int i9 = 0; i9 < 6; i9++) {
            this.a[i9].invalidate();
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
    public final void onMeasure(int i9, int i10) {
        View[] viewArr = this.a;
        int A = this.r == 1 ? ll.A(2.0f, this.e - 1, View.MeasureSpec.getSize(i9)) / this.e : a(this.e);
        this.h = true;
        for (int i11 = 0; i11 < this.e; i11++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i11].getLayoutParams();
            layoutParams.topMargin = this.f ? 0 : AndroidUtilities.dp(2.0f);
            layoutParams.leftMargin = (AndroidUtilities.dp(2.0f) + A) * i11;
            if (i11 != this.e - 1) {
                layoutParams.width = A;
            } else if (AndroidUtilities.isTablet()) {
                layoutParams.width = AndroidUtilities.dp(490.0f) - ((AndroidUtilities.dp(2.0f) + A) * (this.e - 1));
            } else {
                layoutParams.width = AndroidUtilities.displaySize.x - ((AndroidUtilities.dp(2.0f) + A) * (this.e - 1));
            }
            layoutParams.height = A;
            layoutParams.gravity = 51;
            viewArr[i11].setLayoutParams(layoutParams);
        }
        this.h = false;
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec((this.f ? 0 : AndroidUtilities.dp(2.0f)) + A, TLObject.FLAG_30));
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

    public void setIsFirst(boolean z10) {
        this.f = z10;
    }

    public void setItemsCount(int i9) {
        o7[] o7VarArr = this.a;
        int i10 = 0;
        while (i10 < o7VarArr.length) {
            o7VarArr[i10].clearAnimation();
            o7VarArr[i10].setVisibility(i10 < i9 ? 0 : 4);
            i10++;
        }
        this.e = i9;
    }
}
