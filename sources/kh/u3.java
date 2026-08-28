package kh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.xu0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class u3 extends org.telegram.ui.ActionBar.f3 {
    public final t3 b;
    public ValueAnimator c;
    public o1.j d;
    public Boolean e;
    public Utilities.Callback f;

    public u3(Context context, org.telegram.ui.ActionBar.b6 b6Var, String str, float f10) {
        super(context, b6Var, false, false);
        fixNavigationBar(-14737633);
        t3 t3Var = new t3(UserConfig.selectedAccount, context, new ih.b(), f10, str);
        this.b = t3Var;
        t3Var.C.setVisibility(8);
        t3Var.setMultipleOnClick(false);
        t3Var.setOnBackClickListener(new r3(this, 0));
        t3Var.setOnSelectListener(new bh.c(this, 27));
        xu0 xu0Var = new xu0(context, null);
        this.containerView = xu0Var;
        int i9 = this.backgroundPaddingLeft;
        xu0Var.setPadding(i9, 0, i9, 0);
        this.containerView.addView(t3Var);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return !this.b.w;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        n(false, new r3(this, 1));
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

    public final void n(boolean z10, r3 r3Var) {
        t3 t3Var = this.b;
        float translationY = t3Var.getTranslationY();
        float height = z10 ? 0.0f : (this.containerView.getHeight() - t3Var.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        this.e = Boolean.valueOf(z10);
        if (z10) {
            o1.j jVar = new o1.j(t3Var, o1.h.n, height);
            this.d = jVar;
            jVar.u.a(0.75f);
            this.d.u.b(350.0f);
            this.d.a(new s3(this, height, r3Var));
            this.d.f();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.c = ofFloat;
        ofFloat.addUpdateListener(new bg.b(this, 28));
        this.c.addListener(new fg.j(5, this, r3Var));
        this.c.setDuration(450L);
        this.c.setInterpolator(gr.h);
        this.c.start();
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        n(true, null);
    }
}
