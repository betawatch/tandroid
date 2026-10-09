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
import org.telegram.ui.dp0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class h2 extends org.telegram.ui.ActionBar.f3 {
    public final ci.h1 b;
    public final ArrayList c;
    public boolean d;
    public FrameLayout e;
    public Integer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(Context context, org.telegram.ui.ActionBar.e6 e6Var, View... viewArr) {
        super(1, context, e6Var, true);
        List asList = Arrays.asList(viewArr);
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        if (asList != null) {
            arrayList.addAll(asList);
        }
        e2 e2Var = new e2(this, context);
        this.containerView = e2Var;
        ci.h1 h1Var = new ci.h1(this, context, 9);
        this.b = h1Var;
        int i10 = this.backgroundPaddingLeft;
        h1Var.setPadding(i10, 0, i10, AndroidUtilities.navigationBarHeight);
        e2Var.addView(h1Var, w7.x5.e(-1, -1, 119));
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
        ci.h1 h1Var = this.b;
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

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        if (!this.d) {
            this.d = true;
            this.b.setAdapter(new dp0(this, 1));
        }
        super.show();
        Integer num = this.f;
        if (num != null) {
            setOverlayNavBarColor(num.intValue());
        }
    }

    public final void t(g2 g2Var) {
        this.c.add(g2Var);
        if (this.d) {
            ci.h1 h1Var = this.b;
            h1Var.C(false);
            h1Var.o(false);
        }
    }

    public final void u(int i10) {
        this.f = Integer.valueOf(i10);
        setBackgroundColor(i10);
        fixNavigationBar(i10);
        ((e2) this.containerView).invalidate();
    }

    public final void v(LinearLayout linearLayout) {
        FrameLayout frameLayout = this.e;
        if (frameLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.e = frameLayout2;
            frameLayout2.setClipChildren(false);
            this.e.setClipToPadding(false);
            this.containerView.addView(this.e, w7.x5.e(-1, -2, 80));
        } else {
            frameLayout.removeAllViews();
        }
        this.e.addView(linearLayout, w7.x5.e(-1, -2, 80));
        ci.h1 h1Var = this.b;
        int i10 = this.backgroundPaddingLeft;
        h1Var.setPadding(i10, 0, i10, 0);
        ((e2) this.containerView).requestLayout();
    }
}
