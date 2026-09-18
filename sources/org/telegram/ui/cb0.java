package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class cb0 implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ oa0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ LaunchActivity g;

    public cb0(LaunchActivity launchActivity, oa0 oa0Var, String str, org.telegram.ui.ActionBar.o2 o2Var, long j3, Integer num, Bundle bundle) {
        this.g = launchActivity;
        this.a = oa0Var;
        this.b = str;
        this.c = o2Var;
        this.d = j3;
        this.e = num;
        this.f = bundle;
    }

    @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
    public final void onError() {
        LaunchActivity launchActivity = this.g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.c5.u0((org.telegram.ui.ActionBar.o2) hg.k0.h(1, launchActivity.d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        LaunchActivity launchActivity = this.g;
        if (launchActivity.isFinishing()) {
            return;
        }
        String str = this.b;
        long j3 = this.d;
        org.telegram.ui.ActionBar.o2 o2Var = this.c;
        if (str == null || !(o2Var instanceof bo) || ((bo) o2Var).a() != j3) {
            if (o2Var instanceof bo) {
                bo boVar = (bo) o2Var;
                if (boVar.a() == j3 && this.e == null) {
                    AndroidUtilities.shakeViewSpring(boVar.x0, 5.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    nk nkVar = boVar.Y;
                    for (int i10 = 0; i10 < nkVar.getChildCount(); i10++) {
                        AndroidUtilities.shakeViewSpring(nkVar.getChildAt(i10), 5.0f);
                    }
                    org.telegram.ui.ActionBar.k actionBar = boVar.getActionBar();
                    for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                        AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                    }
                }
            }
            o2Var = new bo(this.f);
            ((ActionBarLayout) launchActivity.O()).P(o2Var);
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k21(this, this.b, this.d, o2Var, 4), 150L);
    }
}
