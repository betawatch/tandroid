package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.i10;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class q3 extends org.telegram.ui.ActionBar.w2 {
    public final p3 m1;
    public ValueAnimator n1;
    public r1.g o1;
    public Boolean p1;
    public w10 q1;

    public q3(Context context, org.telegram.ui.ActionBar.i6 i6Var, String str, float f10) {
        super(1, context, i6Var, false);
        P(-14737633);
        p3 p3Var = new p3(i10.t0, context, new fi.b(), f10, str);
        this.m1 = p3Var;
        p3Var.H.setVisibility(8);
        p3Var.setMultipleOnClick(false);
        p3Var.setOnBackClickListener(new n3(this, 0));
        p3Var.setOnSelectListener(new bi.b(this, 27));
        cu0 cu0Var = new cu0(context, null);
        this.b = cu0Var;
        int i7 = this.u0;
        cu0Var.setPadding(i7, 0, i7, 0);
        this.b.addView(p3Var);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean F() {
        return !this.m1.x;
    }

    public final void K0(boolean z10, n3 n3Var) {
        p3 p3Var = this.m1;
        float translationY = p3Var.getTranslationY();
        float height = z10 ? 0.0f : (this.b.getHeight() - p3Var.g()) + (org.telegram.messenger.g0.n * 2.5f);
        this.p1 = Boolean.valueOf(z10);
        if (z10) {
            r1.g gVar = new r1.g(p3Var, r1.g.p, height);
            this.o1 = gVar;
            gVar.m.a(0.75f);
            this.o1.m.b(350.0f);
            this.o1.a(new o3(this, height, n3Var));
            this.o1.h();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.n1 = ofFloat;
        ofFloat.addUpdateListener(new ah.g(this, 29));
        this.n1.addListener(new ah.l(5, this, n3Var));
        this.n1.setDuration(450L);
        this.n1.setInterpolator(kr.h);
        this.n1.start();
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        K0(false, new n3(this, 1));
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.m1.g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        dismiss();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        K0(true, null);
    }
}
