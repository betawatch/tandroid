package ei;

import ai.ne;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ow0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class u3 extends org.telegram.ui.ActionBar.h3 {
    public final t3 b;
    public ValueAnimator c;
    public o1.k d;
    public Boolean e;
    public Utilities.Callback f;

    public u3(Context context, org.telegram.ui.ActionBar.g6 g6Var, String str, float f7) {
        super(1, context, g6Var, false);
        fixNavigationBar(-14737633);
        t3 t3Var = new t3(UserConfig.selectedAccount, context, new ci.b(), f7, str);
        this.b = t3Var;
        t3Var.G.setVisibility(8);
        t3Var.setMultipleOnClick(false);
        t3Var.setOnBackClickListener(new r3(this, 0));
        t3Var.setOnSelectListener(new ai.q(this, 15));
        ow0 ow0Var = new ow0(context, null);
        this.containerView = ow0Var;
        int i10 = this.backgroundPaddingLeft;
        ow0Var.setPadding(i10, 0, i10, 0);
        this.containerView.addView(t3Var);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return !this.b.w;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        n(false, new r3(this, 1));
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.b.g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        dismiss();
        return true;
    }

    public final void n(boolean z10, r3 r3Var) {
        t3 t3Var = this.b;
        float translationY = t3Var.getTranslationY();
        float height = z10 ? 0.0f : (this.containerView.getHeight() - t3Var.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        this.e = Boolean.valueOf(z10);
        if (z10) {
            o1.k kVar = new o1.k(t3Var, o1.h.n, height);
            this.d = kVar;
            kVar.u.a(0.75f);
            this.d.u.b(350.0f);
            this.d.a(new s3(this, height, r3Var));
            this.d.h();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.c = ofFloat;
        ofFloat.addUpdateListener(new ah.c0(this, 26));
        this.c.addListener(new ne(4, this, r3Var));
        this.c.setDuration(450L);
        this.c.setInterpolator(bs.h);
        this.c.start();
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        super.show();
        n(true, null);
    }
}
