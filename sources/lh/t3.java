package lh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.zu0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class t3 extends org.telegram.ui.ActionBar.e3 {
    public final s3 b;
    public ValueAnimator c;
    public o1.j d;
    public Boolean e;
    public Utilities.Callback f;

    public t3(Context context, org.telegram.ui.ActionBar.c6 c6Var, String str, float f10) {
        super(context, c6Var, false, false);
        fixNavigationBar(-14737633);
        s3 s3Var = new s3(UserConfig.selectedAccount, context, new jh.b(), f10, str);
        this.b = s3Var;
        s3Var.C.setVisibility(8);
        s3Var.setMultipleOnClick(false);
        s3Var.setOnBackClickListener(new q3(this, 0));
        s3Var.setOnSelectListener(new ch.c(this, 27));
        zu0 zu0Var = new zu0(context, null);
        this.containerView = zu0Var;
        int i10 = this.backgroundPaddingLeft;
        zu0Var.setPadding(i10, 0, i10, 0);
        this.containerView.addView(s3Var);
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        return !this.b.w;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        n(false, new q3(this, 1));
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

    public final void n(boolean z10, q3 q3Var) {
        s3 s3Var = this.b;
        float translationY = s3Var.getTranslationY();
        float height = z10 ? 0.0f : (this.containerView.getHeight() - s3Var.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        this.e = Boolean.valueOf(z10);
        if (z10) {
            o1.j jVar = new o1.j(s3Var, o1.h.n, height);
            this.d = jVar;
            jVar.u.a(0.75f);
            this.d.u.b(350.0f);
            this.d.a(new r3(this, height, q3Var));
            this.d.f();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.c = ofFloat;
        ofFloat.addUpdateListener(new m2(this, 1));
        this.c.addListener(new ag.x1(7, this, q3Var));
        this.c.setDuration(450L);
        this.c.setInterpolator(er.h);
        this.c.start();
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void show() {
        super.show();
        n(true, null);
    }
}
