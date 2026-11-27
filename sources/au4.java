// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class au4 extends nx0 {
    public final zt4 l1;
    public ValueAnimator m1;
    public vpa n1;
    public Boolean o1;
    public pcc p1;

    public au4(Context context, vnb vnbVar, String str, float f) {
        super(1, vnbVar, context, false);
        K(-14737633);
        zt4 zt4Var = new zt4(yac.t0, context, new x53(), f, str);
        this.l1 = zt4Var;
        zt4Var.H.setVisibility(8);
        zt4Var.setMultipleOnClick(false);
        zt4Var.setOnBackClickListener(new xt4(this, (byte) 0));
        zt4Var.setOnSelectListener(new yt4((Object) this, (byte) 0));
        wma wmaVar = new wma(context, null);
        this.b = wmaVar;
        int i = this.u0;
        wmaVar.setPadding(i, 0, i, 0);
        this.b.addView(zt4Var);
    }

    @Override // nx0
    public final boolean D() {
        return !this.l1.x;
    }

    public final void E0(boolean z, xt4 xt4Var) {
        zt4 zt4Var = this.l1;
        float translationY = zt4Var.getTranslationY();
        float height = z ? 0.0f : (this.b.getHeight() - zt4Var.g()) + (hl.n * 2.5f);
        this.o1 = Boolean.valueOf(z);
        if (z) {
            vpa vpaVar = new vpa(zt4Var, vpa.p, height);
            this.n1 = vpaVar;
            vpaVar.m.a(0.75f);
            this.n1.m.b(350.0f);
            this.n1.a(new kk(this, height, xt4Var));
            this.n1.h();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.m1 = ofFloat;
        ofFloat.addUpdateListener(new ch4(this, (byte) 4));
        this.m1.addListener(new v5(this, xt4Var, (byte) 25));
        this.m1.setDuration(450L);
        this.m1.setInterpolator(k43.h);
        this.m1.start();
    }

    public final /* synthetic */ void F0() {
        super.dismiss();
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        E0(false, new xt4(this, (byte) 1));
        super.dismiss();
    }

    @Override // nx0, android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.l1.g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        dismiss();
        return true;
    }

    @Override // nx0, android.app.Dialog
    public final void show() {
        super.show();
        E0(true, null);
    }
}
