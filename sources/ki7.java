// default package

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class ki7 extends fx0 {
    public final vq1 l1;
    public final ArrayList m1;
    public boolean n1;
    public FrameLayout o1;
    public Integer p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki7(Context context, wjb wjbVar, View... viewArr) {
        super(1, wjbVar, context, true);
        List asList = Arrays.asList(viewArr);
        ArrayList arrayList = new ArrayList();
        this.m1 = arrayList;
        if (asList != null) {
            arrayList.addAll(asList);
        }
        ii7 ii7Var = new ii7(this, context);
        this.b = ii7Var;
        vq1 vq1Var = new vq1((byte) 3, context, this);
        this.l1 = vq1Var;
        int i = this.u0;
        vq1Var.setPadding(i, 0, i, gl.n);
        ii7Var.addView(vq1Var, nme.e(-1, -1, kk7.D1));
    }

    @Override // fx0
    public final boolean D() {
        return this.l1.getCurrentPosition() == 0;
    }

    public final void D0(ji7 ji7Var) {
        this.m1.add(ji7Var);
        if (this.n1) {
            vq1 vq1Var = this.l1;
            vq1Var.D(false);
            vq1Var.m(false);
        }
    }

    public final void E0(int i) {
        this.p1 = Integer.valueOf(i);
        s0(i);
        L(i);
        ((ii7) this.b).invalidate();
    }

    public final void F0(LinearLayout linearLayout) {
        FrameLayout frameLayout = this.o1;
        if (frameLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.o1 = frameLayout2;
            frameLayout2.setClipChildren(false);
            this.o1.setClipToPadding(false);
            this.b.addView(this.o1, nme.e(-1, -2, 80));
        } else {
            frameLayout.removeAllViews();
        }
        this.o1.addView(linearLayout, nme.e(-1, -2, 80));
        vq1 vq1Var = this.l1;
        int i = this.u0;
        vq1Var.setPadding(i, 0, i, 0);
        ((ii7) this.b).requestLayout();
    }

    @Override // fx0
    public final boolean G(MotionEvent motionEvent) {
        return this.l1.getCurrentPosition() == 0;
    }

    @Override // fx0, android.app.Dialog
    public final void onBackPressed() {
        vq1 vq1Var = this.l1;
        if (vq1Var.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        for (View view : vq1Var.getViewPages()) {
            if (view != null) {
                gl.t1(view);
            }
        }
        vq1Var.E(vq1Var.getCurrentPosition() - 1);
    }

    @Override // fx0, android.app.Dialog
    public final void show() {
        if (!this.n1) {
            this.n1 = true;
            this.l1.setAdapter(new sl2(this, (byte) 3));
        }
        super.show();
        Integer num = this.p1;
        if (num != null) {
            x0(num.intValue());
        }
    }
}
