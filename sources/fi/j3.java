package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class j3 extends org.telegram.ui.ActionBar.v2 {
    public final i3 i1;
    public ValueAnimator j1;
    public r1.g k1;
    public Boolean l1;
    public c20 m1;

    public j3(Context context, org.telegram.ui.ActionBar.g6 g6Var, String str, float f10) {
        super(1, context, g6Var, false);
        O(-14737633);
        i3 i3Var = new i3(p10.s0, context, new di.b(), f10, str);
        this.i1 = i3Var;
        i3Var.G.setVisibility(8);
        i3Var.setMultipleOnClick(false);
        i3Var.setOnBackClickListener(new g3(this, 0));
        i3Var.setOnSelectListener(new ai.e(this, 18));
        tt0 tt0Var = new tt0(context, null);
        this.b = tt0Var;
        int i7 = this.t0;
        tt0Var.setPadding(i7, 0, i7, 0);
        this.b.addView(i3Var);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean G() {
        return !this.i1.x;
    }

    public final void J0(boolean z9, g3 g3Var) {
        i3 i3Var = this.i1;
        float translationY = i3Var.getTranslationY();
        float height = z9 ? 0.0f : (this.b.getHeight() - i3Var.g()) + (org.telegram.messenger.g0.n * 2.5f);
        this.l1 = Boolean.valueOf(z9);
        if (z9) {
            r1.g gVar = new r1.g(i3Var, r1.g.p, height);
            this.k1 = gVar;
            gVar.m.a(0.75f);
            this.k1.m.b(350.0f);
            this.k1.a(new h3(this, height, g3Var));
            this.k1.h();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.j1 = ofFloat;
        ofFloat.addUpdateListener(new ah.h(this, 28));
        this.j1.addListener(new ah.l(5, this, g3Var));
        this.j1.setDuration(450L);
        this.j1.setInterpolator(xq.h);
        this.j1.start();
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        J0(false, new g3(this, 1));
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.i1.g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        dismiss();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        super.show();
        J0(true, null);
    }
}
