package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import bi.ce;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ww0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class s3 extends org.telegram.ui.ActionBar.k3 {
    public final r3 b;
    public ValueAnimator c;
    public o1.j d;
    public Boolean e;
    public Utilities.Callback f;

    public s3(Context context, org.telegram.ui.ActionBar.u6 u6Var, String str, float f7) {
        super(1, context, u6Var, false);
        fixNavigationBar(-14737633);
        r3 r3Var = new r3(UserConfig.selectedAccount, context, new di.b(), f7, str);
        this.b = r3Var;
        r3Var.G.setVisibility(8);
        r3Var.setMultipleOnClick(false);
        r3Var.setOnBackClickListener(new p3(this, 0));
        r3Var.setOnSelectListener(new ai.e(this, 18));
        ww0 ww0Var = new ww0(context, null);
        this.containerView = ww0Var;
        int i10 = this.backgroundPaddingLeft;
        ww0Var.setPadding(i10, 0, i10, 0);
        this.containerView.addView(r3Var);
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean canDismissWithSwipe() {
        return !this.b.w;
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        n(false, new p3(this, 1));
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.b.g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        dismiss();
        return true;
    }

    public final void n(boolean z10, p3 p3Var) {
        r3 r3Var = this.b;
        float translationY = r3Var.getTranslationY();
        float height = z10 ? 0.0f : (this.containerView.getHeight() - r3Var.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        this.e = Boolean.valueOf(z10);
        if (z10) {
            o1.j jVar = new o1.j(r3Var, o1.h.n, height);
            this.d = jVar;
            jVar.u.a(0.75f);
            this.d.u.b(350.0f);
            this.d.a(new q3(this, height, p3Var));
            this.d.h();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.c = ofFloat;
        ofFloat.addUpdateListener(new ai.g0(this, 28));
        this.c.addListener(new ce(4, this, p3Var));
        this.c.setDuration(450L);
        this.c.setInterpolator(ds.h);
        this.c.start();
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void show() {
        super.show();
        n(true, null);
    }
}
