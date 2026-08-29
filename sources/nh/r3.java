package nh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class r3 extends org.telegram.ui.ActionBar.f3 {
    public final q3 b;
    public ValueAnimator c;
    public o1.k d;
    public Boolean e;
    public Utilities.Callback f;

    public r3(Context context, org.telegram.ui.ActionBar.c6 c6Var, String str, float f9) {
        super(context, c6Var, false, false);
        fixNavigationBar(-14737633);
        q3 q3Var = new q3(UserConfig.selectedAccount, context, new lh.b(), f9, str);
        this.b = q3Var;
        q3Var.C.setVisibility(8);
        q3Var.setMultipleOnClick(false);
        q3Var.setOnBackClickListener(new o3(this, 0));
        q3Var.setOnSelectListener(new bg.t1(this, 28));
        hv0 hv0Var = new hv0(context, null);
        this.containerView = hv0Var;
        int i10 = this.backgroundPaddingLeft;
        hv0Var.setPadding(i10, 0, i10, 0);
        this.containerView.addView(q3Var);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return !this.b.w;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        n(false, new o3(this, 1));
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

    public final void n(boolean z10, o3 o3Var) {
        q3 q3Var = this.b;
        float translationY = q3Var.getTranslationY();
        float height = z10 ? 0.0f : (this.containerView.getHeight() - q3Var.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        this.e = Boolean.valueOf(z10);
        if (z10) {
            o1.k kVar = new o1.k(q3Var, o1.i.n, height);
            this.d = kVar;
            kVar.u.a(0.75f);
            this.d.u.b(350.0f);
            this.d.a(new p3(this, height, o3Var));
            this.d.f();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.c = ofFloat;
        ofFloat.addUpdateListener(new lh.d5(this, 7));
        this.c.addListener(new bg.c3(8, this, o3Var));
        this.c.setDuration(450L);
        this.c.setInterpolator(jr.h);
        this.c.start();
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        n(true, null);
    }
}
