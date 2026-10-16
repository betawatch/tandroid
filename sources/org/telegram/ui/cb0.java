package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class cb0 implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ d20 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ LaunchActivity g;

    public cb0(LaunchActivity launchActivity, d20 d20Var, String str, org.telegram.ui.ActionBar.m2 m2Var, long j10, Integer num, Bundle bundle) {
        this.g = launchActivity;
        this.a = d20Var;
        this.b = str;
        this.c = m2Var;
        this.d = j10;
        this.e = num;
        this.f = bundle;
    }

    @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
    public final void onError() {
        LaunchActivity launchActivity = this.g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.g5.t0((org.telegram.ui.ActionBar.m2) i2.d.h(1, launchActivity.d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
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
        org.telegram.ui.ActionBar.m2 m2Var = this.c;
        if (str == null || !(m2Var instanceof fo) || ((fo) m2Var).a() != j10) {
            if (m2Var instanceof fo) {
                fo foVar = (fo) m2Var;
                if (foVar.a() == j10 && this.e == null) {
                    AndroidUtilities.shakeViewSpring(foVar.x0, 5.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    sk skVar = foVar.Y;
                    for (int i10 = 0; i10 < skVar.getChildCount(); i10++) {
                        AndroidUtilities.shakeViewSpring(skVar.getChildAt(i10), 5.0f);
                    }
                    org.telegram.ui.ActionBar.k actionBar = foVar.getActionBar();
                    for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                        AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                    }
                }
            }
            m2Var = new fo(this.f);
            ((ActionBarLayout) launchActivity.O()).P(m2Var);
        }
        AndroidUtilities.runOnUIThread(new bi.b8(this, this.b, this.d, m2Var, 14), 150L);
    }
}
