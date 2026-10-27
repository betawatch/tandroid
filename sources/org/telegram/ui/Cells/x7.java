package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.aq;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class x7 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public t7[] a;
    public MessageObject[] b;
    public int[] c;
    public u7 d;
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

    public final void b(int i10, boolean z10, boolean z11) {
        t7 t7Var = this.a[i10];
        FrameLayout frameLayout = t7Var.f;
        aq aqVar = t7Var.e;
        if (aqVar.getVisibility() != 0) {
            aqVar.setVisibility(0);
        }
        aqVar.a(z10, true);
        AnimatorSet animatorSet = t7Var.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            t7Var.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        t7Var.h = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_X, z10 ? 0.81f : 1.0f), ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_Y, z10 ? 0.81f : 1.0f));
        t7Var.h.setDuration(200L);
        t7Var.h.addListener(new kg.e(t7Var, 18));
        t7Var.h.start();
    }

    public final void c(MessageObject messageObject, int i10, int i11) {
        t7[] t7VarArr = this.a;
        MessageObject[] messageObjectArr = this.b;
        messageObjectArr[i10] = messageObject;
        this.c[i10] = i11;
        if (messageObject != null) {
            t7VarArr[i10].setVisibility(0);
            t7VarArr[i10].setMessageObject(messageObject);
        } else {
            t7VarArr[i10].clearAnimation();
            t7VarArr[i10].setVisibility(4);
            messageObjectArr[i10] = null;
        }
    }

    public u7 getDelegate() {
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
        int C = this.r == 1 ? wh.C(2.0f, this.e - 1, View.MeasureSpec.getSize(i10)) / this.e : a(this.e);
        this.h = true;
        for (int i12 = 0; i12 < this.e; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            layoutParams.topMargin = this.f ? 0 : AndroidUtilities.dp(2.0f);
            layoutParams.leftMargin = (AndroidUtilities.dp(2.0f) + C) * i12;
            if (i12 != this.e - 1) {
                layoutParams.width = C;
            } else if (AndroidUtilities.isTablet()) {
                layoutParams.width = AndroidUtilities.dp(490.0f) - ((AndroidUtilities.dp(2.0f) + C) * (this.e - 1));
            } else {
                layoutParams.width = AndroidUtilities.displaySize.x - ((AndroidUtilities.dp(2.0f) + C) * (this.e - 1));
            }
            layoutParams.height = C;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        this.h = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((this.f ? 0 : AndroidUtilities.dp(2.0f)) + C, TLObject.FLAG_30));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }

    public void setDelegate(u7 u7Var) {
        this.d = u7Var;
    }

    public void setIsFirst(boolean z10) {
        this.f = z10;
    }

    public void setItemsCount(int i10) {
        t7[] t7VarArr = this.a;
        int i11 = 0;
        while (i11 < t7VarArr.length) {
            t7VarArr[i11].clearAnimation();
            t7VarArr[i11].setVisibility(i11 < i10 ? 0 : 4);
            i11++;
        }
        this.e = i10;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            this.n.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Lh, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
