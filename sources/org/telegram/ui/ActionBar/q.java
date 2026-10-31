package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ q(ActionBarLayout actionBarLayout, boolean z10, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z11, k2 k2Var, k2 k2Var2) {
        this.d = actionBarLayout;
        this.b = z10;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.c = z11;
        this.f = k2Var;
        this.h = k2Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj4;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj3;
                k2 k2Var = (k2) obj2;
                k2 k2Var2 = (k2) obj;
                if (this.b) {
                    actionBarLayout.h = true;
                    actionBarLayout.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarLayout.a0 = false;
                    actionBarLayout.s.setScaleX(1.0f);
                    actionBarLayout.s.setScaleY(1.0f);
                } else {
                    Drawable drawable = ActionBarLayout.v1;
                    actionBarLayout.V(k2Var, this.c);
                    actionBarLayout.s.setTranslationX(0.0f);
                }
                if (k2Var != null) {
                    k2Var.onTransitionAnimationEnd(false, false);
                }
                k2Var2.onTransitionAnimationEnd(true, false);
                k2Var2.onBecomeFullyVisible();
                break;
            default:
                TwoStepVerificationActivity.e0((TwoStepVerificationActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, this.b, this.c, (Runnable) obj);
                break;
        }
    }

    public /* synthetic */ q(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.e = tL_error;
        this.f = tLObject;
        this.b = z10;
        this.c = z11;
        this.h = runnable;
    }
}
