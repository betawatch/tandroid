package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.k10;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class h3 extends org.telegram.ui.ActionBar.w2 {
    public final g3 m1;
    public ValueAnimator n1;
    public r1.g o1;
    public Boolean p1;
    public y10 q1;

    public h3(Context context, org.telegram.ui.ActionBar.h6 h6Var, String str, float f10) {
        super(1, context, h6Var, false);
        P(-14737633);
        g3 g3Var = new g3(k10.t0, context, new fi.b(), f10, str);
        this.m1 = g3Var;
        g3Var.H.setVisibility(8);
        g3Var.setMultipleOnClick(false);
        g3Var.setOnBackClickListener(new e3(this, 0));
        g3Var.setOnSelectListener(new bi.b(this, 27));
        du0 du0Var = new du0(context, null);
        this.b = du0Var;
        int i7 = this.u0;
        du0Var.setPadding(i7, 0, i7, 0);
        this.b.addView(g3Var);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        return !this.m1.x;
    }

    public final void K0(boolean z10, e3 e3Var) {
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
        ofFloat.addUpdateListener(new ah.g(this, 29));
        this.n1.addListener(new ah.l(5, this, e3Var));
        this.n1.setDuration(450L);
        this.n1.setInterpolator(nr.h);
        this.n1.start();
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        K0(false, new e3(this, 1));
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
