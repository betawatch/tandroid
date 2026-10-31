package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.zs;
import org.telegram.ui.hk;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y2 extends org.telegram.ui.ActionBar.z2 {
    public final hk i1;
    public final ArrayList j1;
    public boolean k1;
    public FrameLayout l1;
    public Integer m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(Context context, org.telegram.ui.ActionBar.p6 p6Var, View... viewArr) {
        super(1, context, p6Var, true);
        List asList = Arrays.asList(viewArr);
        ArrayList arrayList = new ArrayList();
        this.j1 = arrayList;
        if (asList != null) {
            arrayList.addAll(asList);
        }
        v2 v2Var = new v2(this, context);
        this.b = v2Var;
        hk hkVar = new hk(this, context, 5);
        this.i1 = hkVar;
        int i10 = this.t0;
        hkVar.setPadding(i10, 0, i10, org.telegram.messenger.i0.n);
        v2Var.addView(hkVar, w7.b6.e(-1, -1, zs.E1));
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H() {
        return this.i1.getCurrentPosition() == 0;
    }

    public final void I0(x2 x2Var) {
        this.j1.add(x2Var);
        if (this.k1) {
            hk hkVar = this.i1;
            hkVar.D(false);
            hkVar.o(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean J(MotionEvent motionEvent) {
        return this.i1.getCurrentPosition() == 0;
    }

    public final void J0(int i10) {
        this.m1 = Integer.valueOf(i10);
        v0(i10);
        P(i10);
        ((v2) this.b).invalidate();
    }

    public final void K0(LinearLayout linearLayout) {
        FrameLayout frameLayout = this.l1;
        if (frameLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.l1 = frameLayout2;
            frameLayout2.setClipChildren(false);
            this.l1.setClipToPadding(false);
            this.b.addView(this.l1, w7.b6.e(-1, -2, 80));
        } else {
            frameLayout.removeAllViews();
        }
        this.l1.addView(linearLayout, w7.b6.e(-1, -2, 80));
        hk hkVar = this.i1;
        int i10 = this.t0;
        hkVar.setPadding(i10, 0, i10, 0);
        ((v2) this.b).requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void onBackPressed() {
        hk hkVar = this.i1;
        if (hkVar.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        for (View view : hkVar.getViewPages()) {
            if (view != null) {
                org.telegram.messenger.i0.v1(view);
            }
        }
        hkVar.E(hkVar.getCurrentPosition() - 1);
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        if (!this.k1) {
            this.k1 = true;
            this.i1.setAdapter(new ig.n(this, 3));
        }
        super.show();
        Integer num = this.m1;
        if (num != null) {
            E0(num.intValue());
        }
    }
}
