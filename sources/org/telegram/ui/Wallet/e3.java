package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class e3 extends org.telegram.ui.ActionBar.w2 {
    public final hi.q1 m1;
    public final ArrayList n1;
    public boolean o1;
    public FrameLayout p1;
    public Integer q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(Context context, org.telegram.ui.ActionBar.i6 i6Var, View... viewArr) {
        super(1, context, i6Var, true);
        List asList = Arrays.asList(viewArr);
        ArrayList arrayList = new ArrayList();
        this.n1 = arrayList;
        if (asList != null) {
            arrayList.addAll(asList);
        }
        b3 b3Var = new b3(this, context);
        this.b = b3Var;
        hi.q1 q1Var = new hi.q1(8, context, this);
        this.m1 = q1Var;
        int i7 = this.u0;
        q1Var.setPadding(i7, 0, i7, org.telegram.messenger.g0.n);
        b3Var.addView(q1Var, c8.na.e(-1, -1, ks.E1));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean F() {
        return this.m1.getCurrentPosition() == 0;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean I(MotionEvent motionEvent) {
        return this.m1.getCurrentPosition() == 0;
    }

    public final void J0(d3 d3Var) {
        this.n1.add(d3Var);
        if (this.o1) {
            hi.q1 q1Var = this.m1;
            q1Var.A(false);
            q1Var.l(false);
        }
    }

    public final void K0(int i7) {
        this.q1 = Integer.valueOf(i7);
        v0(i7);
        P(i7);
        ((b3) this.b).invalidate();
    }

    public final void L0(LinearLayout linearLayout) {
        FrameLayout frameLayout = this.p1;
        if (frameLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.p1 = frameLayout2;
            frameLayout2.setClipChildren(false);
            this.p1.setClipToPadding(false);
            this.b.addView(this.p1, c8.na.e(-1, -2, 80));
        } else {
            frameLayout.removeAllViews();
        }
        this.p1.addView(linearLayout, c8.na.e(-1, -2, 80));
        hi.q1 q1Var = this.m1;
        int i7 = this.u0;
        q1Var.setPadding(i7, 0, i7, 0);
        ((b3) this.b).requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        hi.q1 q1Var = this.m1;
        if (q1Var.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        for (View view : q1Var.getViewPages()) {
            if (view != null) {
                org.telegram.messenger.g0.v1(view);
            }
        }
        q1Var.C(q1Var.getCurrentPosition() - 1);
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        if (!this.o1) {
            this.o1 = true;
            this.m1.setAdapter(new li.w(this, 3));
        }
        super.show();
        Integer num = this.q1;
        if (num != null) {
            E0(num.intValue());
        }
    }
}
