package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fa0 implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ x20 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ LaunchActivity g;

    public fa0(LaunchActivity launchActivity, x20 x20Var, String str, org.telegram.ui.ActionBar.o2 o2Var, long j10, Integer num, Bundle bundle) {
        this.g = launchActivity;
        this.a = x20Var;
        this.b = str;
        this.c = o2Var;
        this.d = j10;
        this.e = num;
        this.f = bundle;
    }

    @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
    public final void onError() {
        LaunchActivity launchActivity = this.g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.y4.u0((org.telegram.ui.ActionBar.o2) j3.r0.j(1, launchActivity.Z), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.a.run();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.a.run();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        LaunchActivity launchActivity = this.g;
        if (launchActivity.isFinishing()) {
            return;
        }
        String str = this.b;
        long j10 = this.d;
        org.telegram.ui.ActionBar.o2 o2Var = this.c;
        if (str == null || !(o2Var instanceof qn) || ((qn) o2Var).a() != j10) {
            if (o2Var instanceof qn) {
                qn qnVar = (qn) o2Var;
                if (qnVar.a() == j10 && this.e == null) {
                    AndroidUtilities.shakeViewSpring(qnVar.t0, 5.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    ak akVar = qnVar.U;
                    for (int i9 = 0; i9 < akVar.getChildCount(); i9++) {
                        AndroidUtilities.shakeViewSpring(akVar.getChildAt(i9), 5.0f);
                    }
                    org.telegram.ui.ActionBar.k actionBar = qnVar.getActionBar();
                    for (int i10 = 0; i10 < actionBar.getChildCount(); i10++) {
                        AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i10), 5.0f);
                    }
                }
            }
            o2Var = new qn(this.f);
            ((ActionBarLayout) launchActivity.O()).P(o2Var);
        }
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.lg(this, this.b, this.d, o2Var, 10), 150L);
    }
}
