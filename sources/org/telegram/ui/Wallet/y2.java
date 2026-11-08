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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class y2 extends org.telegram.ui.ActionBar.v2 {
    public final fi.g1 i1;
    public final ArrayList j1;
    public boolean k1;
    public FrameLayout l1;
    public Integer m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(Context context, org.telegram.ui.ActionBar.f6 f6Var, View... viewArr) {
        super(1, context, f6Var, true);
        List asList = Arrays.asList(viewArr);
        ArrayList arrayList = new ArrayList();
        this.j1 = arrayList;
        if (asList != null) {
            arrayList.addAll(asList);
        }
        v2 v2Var = new v2(this, context);
        this.b = v2Var;
        fi.g1 g1Var = new fi.g1(8, context, this);
        this.i1 = g1Var;
        int i7 = this.t0;
        g1Var.setPadding(i7, 0, i7, org.telegram.messenger.g0.n);
        v2Var.addView(g1Var, c8.ha.e(-1, -1, qs.E1));
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean G() {
        return this.i1.getCurrentPosition() == 0;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean I(MotionEvent motionEvent) {
        return this.i1.getCurrentPosition() == 0;
    }

    public final void I0(x2 x2Var) {
        this.j1.add(x2Var);
        if (this.k1) {
            fi.g1 g1Var = this.i1;
            g1Var.D(false);
            g1Var.o(false);
        }
    }

    public final void J0(int i7) {
        this.m1 = Integer.valueOf(i7);
        v0(i7);
        O(i7);
        ((v2) this.b).invalidate();
    }

    public final void K0(LinearLayout linearLayout) {
        FrameLayout frameLayout = this.l1;
        if (frameLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.l1 = frameLayout2;
            frameLayout2.setClipChildren(false);
            this.l1.setClipToPadding(false);
            this.b.addView(this.l1, c8.ha.e(-1, -2, 80));
        } else {
            frameLayout.removeAllViews();
        }
        this.l1.addView(linearLayout, c8.ha.e(-1, -2, 80));
        fi.g1 g1Var = this.i1;
        int i7 = this.t0;
        g1Var.setPadding(i7, 0, i7, 0);
        ((v2) this.b).requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void onBackPressed() {
        fi.g1 g1Var = this.i1;
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

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        if (!this.k1) {
            this.k1 = true;
            this.i1.setAdapter(new ii.x(this, 3));
        }
        super.show();
        Integer num = this.m1;
        if (num != null) {
            E0(num.intValue());
        }
    }
}
