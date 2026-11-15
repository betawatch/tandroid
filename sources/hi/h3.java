package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.m10;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.st0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class h3 extends org.telegram.ui.ActionBar.u2 {
    public final g3 m1;
    public ValueAnimator n1;
    public r1.g o1;
    public Boolean p1;
    public z10 q1;

    public h3(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, float f10) {
        super(1, context, e6Var, false);
        P(-14737633);
        g3 g3Var = new g3(m10.t0, context, new fi.b(), f10, str);
        this.m1 = g3Var;
        g3Var.H.setVisibility(8);
        g3Var.setMultipleOnClick(false);
        g3Var.setOnBackClickListener(new e3(this, 0));
        g3Var.setOnSelectListener(new bi.b(this, 28));
        st0 st0Var = new st0(context, null);
        this.b = st0Var;
        int i7 = this.u0;
        st0Var.setPadding(i7, 0, i7, 0);
        this.b.addView(g3Var);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean H() {
        return !this.m1.x;
    }

    public final void J0(boolean z10, e3 e3Var) {
        g3 g3Var = this.m1;
        float translationY = g3Var.getTranslationY();
        float height = z10 ? 0.0f : (this.b.getHeight() - g3Var.g()) + (org.telegram.messenger.g0.n * 2.5f);
        this.p1 = Boolean.valueOf(z10);
        if (z10) {
            r1.g gVar = new r1.g(g3Var, r1.g.p, height);
            this.o1 = gVar;
            gVar.m.a(0.75f);
            this.o1.m.b(350.0f);
            this.o1.a(new f3(this, height, e3Var));
            this.o1.h();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.n1 = ofFloat;
        ofFloat.addUpdateListener(new ah.h(this, 29));
        this.n1.addListener(new ah.l(5, this, e3Var));
        this.n1.setDuration(450L);
        this.n1.setInterpolator(er.h);
        this.n1.start();
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        J0(false, new e3(this, 1));
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.m1.g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        dismiss();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void show() {
        super.show();
        J0(true, null);
    }
}
