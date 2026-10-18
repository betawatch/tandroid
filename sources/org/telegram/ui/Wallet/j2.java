package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.oo0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class j2 extends org.telegram.ui.ActionBar.f3 {
    public final ei.h1 b;
    public final ArrayList c;
    public boolean d;
    public FrameLayout e;
    public Integer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(Context context, org.telegram.ui.ActionBar.d6 d6Var, View... viewArr) {
        super(1, context, d6Var, true);
        List asList = Arrays.asList(viewArr);
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        if (asList != null) {
            arrayList.addAll(asList);
        }
        g2 g2Var = new g2(this, context);
        this.containerView = g2Var;
        ei.h1 h1Var = new ei.h1(this, context, 9);
        this.b = h1Var;
        int i10 = this.backgroundPaddingLeft;
        h1Var.setPadding(i10, 0, i10, AndroidUtilities.navigationBarHeight);
        g2Var.addView(h1Var, w7.z5.e(-1, -1, 119));
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return this.b.getCurrentPosition() == 0;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        return this.b.getCurrentPosition() == 0;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        ei.h1 h1Var = this.b;
        if (h1Var.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        for (View view : h1Var.getViewPages()) {
            if (view != null) {
                AndroidUtilities.hideKeyboard(view);
            }
        }
        h1Var.D(h1Var.getCurrentPosition() - 1);
    }

    public final void s(i2 i2Var) {
        this.c.add(i2Var);
        if (this.d) {
            ei.h1 h1Var = this.b;
            h1Var.C(false);
            h1Var.o(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        if (!this.d) {
            this.d = true;
            this.b.setAdapter(new oo0(this, 1));
        }
        super.show();
        Integer num = this.f;
        if (num != null) {
            setOverlayNavBarColor(num.intValue());
        }
    }

    public final void t(int i10) {
        this.f = Integer.valueOf(i10);
        setBackgroundColor(i10);
        fixNavigationBar(i10);
        ((g2) this.containerView).invalidate();
    }

    public final void v(LinearLayout linearLayout) {
        FrameLayout frameLayout = this.e;
        if (frameLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.e = frameLayout2;
            frameLayout2.setClipChildren(false);
            this.e.setClipToPadding(false);
            this.containerView.addView(this.e, w7.z5.e(-1, -2, 80));
        } else {
            frameLayout.removeAllViews();
        }
        this.e.addView(linearLayout, w7.z5.e(-1, -2, 80));
        ei.h1 h1Var = this.b;
        int i10 = this.backgroundPaddingLeft;
        h1Var.setPadding(i10, 0, i10, 0);
        ((g2) this.containerView).requestLayout();
    }
}
