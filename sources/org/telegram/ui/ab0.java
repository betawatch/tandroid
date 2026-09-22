package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ab0 implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ ma0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ LaunchActivity g;

    public ab0(LaunchActivity launchActivity, ma0 ma0Var, String str, org.telegram.ui.ActionBar.n2 n2Var, long j3, Integer num, Bundle bundle) {
        this.g = launchActivity;
        this.a = ma0Var;
        this.b = str;
        this.c = n2Var;
        this.d = j3;
        this.e = num;
        this.f = bundle;
    }

    @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
    public final void onError() {
        LaunchActivity launchActivity = this.g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.c5.u0((org.telegram.ui.ActionBar.n2) hg.c.h(1, launchActivity.d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
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
        org.telegram.ui.ActionBar.n2 n2Var = this.c;
        if (str == null || !(n2Var instanceof bo) || ((bo) n2Var).a() != j3) {
            if (n2Var instanceof bo) {
                bo boVar = (bo) n2Var;
                if (boVar.a() == j3 && this.e == null) {
                    AndroidUtilities.shakeViewSpring(boVar.x0, 5.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    mk mkVar = boVar.Y;
                    for (int i10 = 0; i10 < mkVar.getChildCount(); i10++) {
                        AndroidUtilities.shakeViewSpring(mkVar.getChildAt(i10), 5.0f);
                    }
                    org.telegram.ui.ActionBar.k actionBar = boVar.getActionBar();
                    for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                        AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                    }
                }
            }
            n2Var = new bo(this.f);
            ((ActionBarLayout) launchActivity.O()).P(n2Var);
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.j21(this, this.b, this.d, n2Var, 4), 150L);
    }
}
