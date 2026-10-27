package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class kd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ kd(MessagesController messagesController, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z10, boolean z11) {
        this.a = 0;
        this.d = messagesController;
        this.e = tL_error;
        this.f = r2Var;
        this.h = tL_channels_editAdmin;
        this.b = z10;
        this.c = z11;
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
                ((MessagesController) obj4).lambda$setUserAdminRole$100((TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.r2) obj2, (TLRPC.TL_channels_editAdmin) obj, this.b, this.c);
                break;
            case 1:
                ((NotificationsController) obj4).lambda$processNewMessages$28((ArrayList) obj3, (ArrayList) obj2, this.b, this.c, (CountDownLatch) obj);
                break;
            case 2:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj4;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj3;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj2;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) obj;
                if (this.b) {
                    actionBarLayout.h = true;
                    actionBarLayout.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarLayout.a0 = false;
                    actionBarLayout.s.setScaleX(1.0f);
                    actionBarLayout.s.setScaleY(1.0f);
                } else {
                    Drawable drawable = ActionBarLayout.v1;
                    actionBarLayout.V(r2Var, this.c);
                    actionBarLayout.s.setTranslationX(0.0f);
                }
                if (r2Var != null) {
                    r2Var.onTransitionAnimationEnd(false, false);
                }
                r2Var2.onTransitionAnimationEnd(true, false);
                r2Var2.onBecomeFullyVisible();
                break;
            default:
                TwoStepVerificationActivity.b0((TwoStepVerificationActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, this.b, this.c, (Runnable) obj);
                break;
        }
    }

    public /* synthetic */ kd(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i10) {
        this.a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f = obj2;
        this.b = z10;
        this.c = z11;
        this.h = obj3;
    }

    public /* synthetic */ kd(ActionBarLayout actionBarLayout, boolean z10, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z11, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.r2 r2Var2) {
        this.a = 2;
        this.d = actionBarLayout;
        this.b = z10;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.c = z11;
        this.f = r2Var;
        this.h = r2Var2;
    }
}
