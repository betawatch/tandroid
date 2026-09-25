package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class a4 extends org.telegram.ui.ActionBar.e3 {
    public final z3 b;
    public ValueAnimator c;
    public o1.k d;
    public Boolean e;
    public Utilities.Callback f;

    public a4(Context context, org.telegram.ui.ActionBar.d6 d6Var, String str, float f7) {
        super(1, context, d6Var, false);
        fixNavigationBar(-14737633);
        z3 z3Var = new z3(UserConfig.selectedAccount, context, new ai.d(), f7, str);
        this.b = z3Var;
        z3Var.G.setVisibility(8);
        z3Var.setMultipleOnClick(false);
        z3Var.setOnBackClickListener(new x3(this, 0));
        z3Var.setOnSelectListener(new bi.v(this, 4));
        aw0 aw0Var = new aw0(context, null);
        this.containerView = aw0Var;
        int i10 = this.backgroundPaddingLeft;
        aw0Var.setPadding(i10, 0, i10, 0);
        this.containerView.addView(z3Var);
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        return !this.b.w;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        n(false, new x3(this, 1));
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

    public final void n(boolean z10, x3 x3Var) {
        z3 z3Var = this.b;
        float translationY = z3Var.getTranslationY();
        float height = z10 ? 0.0f : (this.containerView.getHeight() - z3Var.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        this.e = Boolean.valueOf(z10);
        if (z10) {
            o1.k kVar = new o1.k(z3Var, o1.h.n, height);
            this.d = kVar;
            kVar.u.a(0.75f);
            this.d.u.b(350.0f);
            this.d.a(new y3(this, height, x3Var));
            this.d.f();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.c = ofFloat;
        ofFloat.addUpdateListener(new ai.a(this, 18));
        this.c.addListener(new ai.z(3, this, x3Var));
        this.c.setDuration(450L);
        this.c.setInterpolator(rr.h);
        this.c.start();
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void show() {
        super.show();
        n(true, null);
    }
}
