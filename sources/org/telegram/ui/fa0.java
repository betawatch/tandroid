package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class fa0 implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ b80 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ LaunchActivity g;

    public fa0(LaunchActivity launchActivity, b80 b80Var, String str, org.telegram.ui.ActionBar.n2 n2Var, long j10, Integer num, Bundle bundle) {
        this.g = launchActivity;
        this.a = b80Var;
        this.b = str;
        this.c = n2Var;
        this.d = j10;
        this.e = num;
        this.f = bundle;
    }

    @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
    public final void onError() {
        LaunchActivity launchActivity = this.g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.f5.t0((org.telegram.ui.ActionBar.n2) i2.d.h(1, launchActivity.d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
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
        long j10 = this.d;
        org.telegram.ui.ActionBar.n2 n2Var = this.c;
        if (str == null || !(n2Var instanceof sn) || ((sn) n2Var).a() != j10) {
            if (n2Var instanceof sn) {
                sn snVar = (sn) n2Var;
                if (snVar.a() == j10 && this.e == null) {
                    AndroidUtilities.shakeViewSpring(snVar.x0, 5.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    hk hkVar = snVar.Y;
                    for (int i10 = 0; i10 < hkVar.getChildCount(); i10++) {
                        AndroidUtilities.shakeViewSpring(hkVar.getChildAt(i10), 5.0f);
                    }
                    org.telegram.ui.ActionBar.k actionBar = snVar.getActionBar();
                    for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                        AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                    }
                }
            }
            n2Var = new sn(this.f);
            ((ActionBarLayout) launchActivity.O()).P(n2Var);
        }
        AndroidUtilities.runOnUIThread(new ai.b2(this, this.b, this.d, n2Var, 22), 150L);
    }
}
