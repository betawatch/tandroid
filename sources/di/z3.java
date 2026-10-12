package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.ow0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class z3 extends org.telegram.ui.ActionBar.e3 {
    public final y3 b;
    public ValueAnimator c;
    public o1.k d;
    public Boolean e;
    public Utilities.Callback f;

    public z3(Context context, org.telegram.ui.ActionBar.c6 c6Var, String str, float f7) {
        super(1, context, c6Var, false);
        fixNavigationBar(-14737633);
        y3 y3Var = new y3(UserConfig.selectedAccount, context, new bi.b(), f7, str);
        this.b = y3Var;
        y3Var.G.setVisibility(8);
        y3Var.setMultipleOnClick(false);
        y3Var.setOnBackClickListener(new w3(this, 0));
        y3Var.setOnSelectListener(new ci.u(this, 4));
        ow0 ow0Var = new ow0(context, null);
        this.containerView = ow0Var;
        int i10 = this.backgroundPaddingLeft;
        ow0Var.setPadding(i10, 0, i10, 0);
        this.containerView.addView(y3Var);
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        return !this.b.w;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        o(false, new w3(this, 1));
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.b.g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        dismiss();
        return true;
    }

    public final void o(boolean z10, w3 w3Var) {
        y3 y3Var = this.b;
        float translationY = y3Var.getTranslationY();
        float height = z10 ? 0.0f : (this.containerView.getHeight() - y3Var.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        this.e = Boolean.valueOf(z10);
        if (z10) {
            o1.k kVar = new o1.k(y3Var, o1.h.n, height);
            this.d = kVar;
            kVar.u.a(0.75f);
            this.d.u.b(350.0f);
            this.d.a(new x3(this, height, w3Var));
            this.d.h();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.c = ofFloat;
        ofFloat.addUpdateListener(new ah.c0(this, 19));
        this.c.addListener(new bi.t(3, this, w3Var));
        this.c.setDuration(450L);
        this.c.setInterpolator(es.h);
        this.c.start();
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void show() {
        super.show();
        o(true, null);
    }
}
