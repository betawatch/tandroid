package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.j10;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class i3 extends org.telegram.ui.ActionBar.x2 {
    public final h3 m1;
    public ValueAnimator n1;
    public r1.g o1;
    public Boolean p1;
    public x10 q1;

    public i3(Context context, org.telegram.ui.ActionBar.i6 i6Var, String str, float f10) {
        super(1, context, i6Var, false);
        P(-14737633);
        h3 h3Var = new h3(j10.t0, context, new fi.b(), f10, str);
        this.m1 = h3Var;
        h3Var.H.setVisibility(8);
        h3Var.setMultipleOnClick(false);
        h3Var.setOnBackClickListener(new f3(this, 0));
        h3Var.setOnSelectListener(new bi.b(this, 27));
        au0 au0Var = new au0(context, null);
        this.b = au0Var;
        int i7 = this.u0;
        au0Var.setPadding(i7, 0, i7, 0);
        this.b.addView(h3Var);
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final boolean G() {
        return !this.m1.x;
    }

    public final void K0(boolean z10, f3 f3Var) {
        h3 h3Var = this.m1;
        float translationY = h3Var.getTranslationY();
        float height = z10 ? 0.0f : (this.b.getHeight() - h3Var.g()) + (org.telegram.messenger.g0.n * 2.5f);
        this.p1 = Boolean.valueOf(z10);
        if (z10) {
            r1.g gVar = new r1.g(h3Var, r1.g.p, height);
            this.o1 = gVar;
            gVar.m.a(0.75f);
            this.o1.m.b(350.0f);
            this.o1.a(new g3(this, height, f3Var));
            this.o1.h();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.n1 = ofFloat;
        ofFloat.addUpdateListener(new ah.g(this, 29));
        this.n1.addListener(new ah.l(5, this, f3Var));
        this.n1.setDuration(450L);
        this.n1.setInterpolator(lr.h);
        this.n1.start();
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public final void dismiss() {
        K0(false, new f3(this, 1));
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.m1.g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        dismiss();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void show() {
        super.show();
        K0(true, null);
    }
}
