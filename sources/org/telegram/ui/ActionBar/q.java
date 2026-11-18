package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ q(ActionBarLayout actionBarLayout, boolean z10, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z11, h2 h2Var, h2 h2Var2) {
        this.d = actionBarLayout;
        this.b = z10;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.c = z11;
        this.f = h2Var;
        this.h = h2Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i7) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj4;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj3;
                h2 h2Var = (h2) obj2;
                h2 h2Var2 = (h2) obj;
                if (this.b) {
                    actionBarLayout.h = true;
                    actionBarLayout.K = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarLayout.b0 = false;
                    actionBarLayout.s.setScaleX(1.0f);
                    actionBarLayout.s.setScaleY(1.0f);
                } else {
                    Drawable drawable = ActionBarLayout.w1;
                    actionBarLayout.W(h2Var, this.c);
                    actionBarLayout.s.setTranslationX(0.0f);
                }
                if (h2Var != null) {
                    h2Var.onTransitionAnimationEnd(false, false);
                }
                h2Var2.onTransitionAnimationEnd(true, false);
                h2Var2.onBecomeFullyVisible();
                break;
            default:
                TwoStepVerificationActivity.f0((TwoStepVerificationActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, this.b, this.c, (Runnable) obj);
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
