package gi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.h10;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h3 extends org.telegram.ui.ActionBar.t2 {
    public final g3 j1;
    public ValueAnimator k1;
    public q1.g l1;
    public Boolean m1;
    public u10 n1;

    public h3(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, float f10) {
        super(1, context, e6Var, false);
        O(-14737633);
        g3 g3Var = new g3(h10.t0, context, new ei.b(), f10, str);
        this.j1 = g3Var;
        g3Var.H.setVisibility(8);
        g3Var.setMultipleOnClick(false);
        g3Var.setOnBackClickListener(new e3(this, 0));
        g3Var.setOnSelectListener(new ai.c(this, 28));
        qt0 qt0Var = new qt0(context, null);
        this.b = qt0Var;
        int i3 = this.u0;
        qt0Var.setPadding(i3, 0, i3, 0);
        this.b.addView(g3Var);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean G() {
        return !this.j1.x;
    }

    public final void J0(boolean z10, e3 e3Var) {
        g3 g3Var = this.j1;
        float translationY = g3Var.getTranslationY();
        float height = z10 ? 0.0f : (this.b.getHeight() - g3Var.g()) + (org.telegram.messenger.g0.n * 2.5f);
        this.m1 = Boolean.valueOf(z10);
        if (z10) {
            q1.g gVar = new q1.g(g3Var, q1.g.p, height);
            this.l1 = gVar;
            gVar.m.a(0.75f);
            this.l1.m.b(350.0f);
            this.l1.a(new f3(this, height, e3Var));
            this.l1.h();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.k1 = ofFloat;
        ofFloat.addUpdateListener(new bh.f(this, 29));
        this.k1.addListener(new bh.j(5, this, e3Var));
        this.k1.setDuration(450L);
        this.k1.setInterpolator(xq.h);
        this.k1.start();
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        J0(false, new e3(this, 1));
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.j1.g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        dismiss();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void show() {
        super.show();
        J0(true, null);
    }
}
