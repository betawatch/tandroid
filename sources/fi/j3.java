package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class j3 extends org.telegram.ui.ActionBar.w2 {
    public final i3 l1;
    public ValueAnimator m1;
    public r1.g n1;
    public Boolean o1;
    public c20 p1;

    public j3(Context context, org.telegram.ui.ActionBar.h6 h6Var, String str, float f10) {
        super(1, context, h6Var, false);
        O(-14737633);
        i3 i3Var = new i3(p10.s0, context, new di.b(), f10, str);
        this.l1 = i3Var;
        i3Var.G.setVisibility(8);
        i3Var.setMultipleOnClick(false);
        i3Var.setOnBackClickListener(new g3(this, 0));
        i3Var.setOnSelectListener(new ai.e(this, 18));
        st0 st0Var = new st0(context, null);
        this.b = st0Var;
        int i7 = this.t0;
        st0Var.setPadding(i7, 0, i7, 0);
        this.b.addView(i3Var);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        return !this.l1.x;
    }

    public final void J0(boolean z9, g3 g3Var) {
        i3 i3Var = this.l1;
        float translationY = i3Var.getTranslationY();
        float height = z9 ? 0.0f : (this.b.getHeight() - i3Var.g()) + (org.telegram.messenger.g0.n * 2.5f);
        this.o1 = Boolean.valueOf(z9);
        if (z9) {
            r1.g gVar = new r1.g(i3Var, r1.g.p, height);
            this.n1 = gVar;
            gVar.m.a(0.75f);
            this.n1.m.b(350.0f);
            this.n1.a(new h3(this, height, g3Var));
            this.n1.h();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.m1 = ofFloat;
        ofFloat.addUpdateListener(new ah.h(this, 28));
        this.m1.addListener(new ah.l(5, this, g3Var));
        this.m1.setDuration(450L);
        this.m1.setInterpolator(wq.h);
        this.m1.start();
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        J0(false, new g3(this, 1));
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.l1.g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        dismiss();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        J0(true, null);
    }
}
