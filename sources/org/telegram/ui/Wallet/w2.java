package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.ns;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class w2 extends org.telegram.ui.ActionBar.u2 {
    public final hi.i1 m1;
    public final ArrayList n1;
    public boolean o1;
    public FrameLayout p1;
    public Integer q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(Context context, org.telegram.ui.ActionBar.e6 e6Var, View... viewArr) {
        super(1, context, e6Var, true);
        List asList = Arrays.asList(viewArr);
        ArrayList arrayList = new ArrayList();
        this.n1 = arrayList;
        if (asList != null) {
            arrayList.addAll(asList);
        }
        t2 t2Var = new t2(this, context);
        this.b = t2Var;
        hi.i1 i1Var = new hi.i1(8, context, this);
        this.m1 = i1Var;
        int i7 = this.u0;
        i1Var.setPadding(i7, 0, i7, org.telegram.messenger.g0.n);
        t2Var.addView(i1Var, c8.ja.e(-1, -1, ns.E1));
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean H() {
        return this.m1.getCurrentPosition() == 0;
    }

    public final void I0(v2 v2Var) {
        this.n1.add(v2Var);
        if (this.o1) {
            hi.i1 i1Var = this.m1;
            i1Var.B(false);
            i1Var.k(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean J(MotionEvent motionEvent) {
        return this.m1.getCurrentPosition() == 0;
    }

    public final void J0(int i7) {
        this.q1 = Integer.valueOf(i7);
        v0(i7);
        P(i7);
        ((t2) this.b).invalidate();
    }

    public final void K0(LinearLayout linearLayout) {
        FrameLayout frameLayout = this.p1;
        if (frameLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.p1 = frameLayout2;
            frameLayout2.setClipChildren(false);
            this.p1.setClipToPadding(false);
            this.b.addView(this.p1, c8.ja.e(-1, -2, 80));
        } else {
            frameLayout.removeAllViews();
        }
        this.p1.addView(linearLayout, c8.ja.e(-1, -2, 80));
        hi.i1 i1Var = this.m1;
        int i7 = this.u0;
        i1Var.setPadding(i7, 0, i7, 0);
        ((t2) this.b).requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void onBackPressed() {
        hi.i1 i1Var = this.m1;
        if (i1Var.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        for (View view : i1Var.getViewPages()) {
            if (view != null) {
                org.telegram.messenger.g0.v1(view);
            }
        }
        i1Var.C(i1Var.getCurrentPosition() - 1);
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void show() {
        if (!this.o1) {
            this.o1 = true;
            this.m1.setAdapter(new li.x(this, 3));
        }
        super.show();
        Integer num = this.q1;
        if (num != null) {
            E0(num.intValue());
        }
    }
}
