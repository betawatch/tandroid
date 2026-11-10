package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class x2 extends org.telegram.ui.ActionBar.w2 {
    public final fi.g1 l1;
    public final ArrayList m1;
    public boolean n1;
    public FrameLayout o1;
    public Integer p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(Context context, org.telegram.ui.ActionBar.h6 h6Var, View... viewArr) {
        super(1, context, h6Var, true);
        List asList = Arrays.asList(viewArr);
        ArrayList arrayList = new ArrayList();
        this.m1 = arrayList;
        if (asList != null) {
            arrayList.addAll(asList);
        }
        u2 u2Var = new u2(this, context);
        this.b = u2Var;
        fi.g1 g1Var = new fi.g1(8, context, this);
        this.l1 = g1Var;
        int i7 = this.t0;
        g1Var.setPadding(i7, 0, i7, org.telegram.messenger.g0.n);
        u2Var.addView(g1Var, c8.ha.e(-1, -1, qs.E1));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        return this.l1.getCurrentPosition() == 0;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean I(MotionEvent motionEvent) {
        return this.l1.getCurrentPosition() == 0;
    }

    public final void I0(w2 w2Var) {
        this.m1.add(w2Var);
        if (this.n1) {
            fi.g1 g1Var = this.l1;
            g1Var.D(false);
            g1Var.o(false);
        }
    }

    public final void J0(int i7) {
        this.p1 = Integer.valueOf(i7);
        v0(i7);
        O(i7);
        ((u2) this.b).invalidate();
    }

    public final void K0(LinearLayout linearLayout) {
        FrameLayout frameLayout = this.o1;
        if (frameLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.o1 = frameLayout2;
            frameLayout2.setClipChildren(false);
            this.o1.setClipToPadding(false);
            this.b.addView(this.o1, c8.ha.e(-1, -2, 80));
        } else {
            frameLayout.removeAllViews();
        }
        this.o1.addView(linearLayout, c8.ha.e(-1, -2, 80));
        fi.g1 g1Var = this.l1;
        int i7 = this.t0;
        g1Var.setPadding(i7, 0, i7, 0);
        ((u2) this.b).requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        fi.g1 g1Var = this.l1;
        if (g1Var.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        for (View view : g1Var.getViewPages()) {
            if (view != null) {
                org.telegram.messenger.g0.v1(view);
            }
        }
        g1Var.E(g1Var.getCurrentPosition() - 1);
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        if (!this.n1) {
            this.n1 = true;
            this.l1.setAdapter(new ii.x(this, 3));
        }
        super.show();
        Integer num = this.p1;
        if (num != null) {
            E0(num.intValue());
        }
    }
}
