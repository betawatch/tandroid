package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class b4 extends org.telegram.ui.ActionBar.f3 {
    public final a4 b;
    public ValueAnimator c;
    public o1.k d;
    public Boolean e;
    public Utilities.Callback f;

    public b4(Context context, org.telegram.ui.ActionBar.f6 f6Var, String str, float f7) {
        super(1, context, f6Var, false);
        fixNavigationBar(-14737633);
        a4 a4Var = new a4(UserConfig.selectedAccount, context, new bi.b(), f7, str);
        this.b = a4Var;
        a4Var.G.setVisibility(8);
        a4Var.setMultipleOnClick(false);
        a4Var.setOnBackClickListener(new y3(this, 0));
        a4Var.setOnSelectListener(new ci.u(this, 4));
        ov0 ov0Var = new ov0(context, null);
        this.containerView = ov0Var;
        int i10 = this.backgroundPaddingLeft;
        ov0Var.setPadding(i10, 0, i10, 0);
        this.containerView.addView(a4Var);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return !this.b.w;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        n(false, new y3(this, 1));
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.b.g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        dismiss();
        return true;
    }

    public final void n(boolean z10, y3 y3Var) {
        a4 a4Var = this.b;
        float translationY = a4Var.getTranslationY();
        float height = z10 ? 0.0f : (this.containerView.getHeight() - a4Var.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        this.e = Boolean.valueOf(z10);
        if (z10) {
            o1.k kVar = new o1.k(a4Var, o1.h.n, height);
            this.d = kVar;
            kVar.u.a(0.75f);
            this.d.u.b(350.0f);
            this.d.a(new z3(this, height, y3Var));
            this.d.f();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.c = ofFloat;
        ofFloat.addUpdateListener(new ah.d0(this, 19));
        this.c.addListener(new bi.t(3, this, y3Var));
        this.c.setDuration(450L);
        this.c.setInterpolator(pr.h);
        this.c.start();
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        n(true, null);
    }
}
