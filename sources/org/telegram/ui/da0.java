package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class da0 implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ z70 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ LaunchActivity g;

    public da0(LaunchActivity launchActivity, z70 z70Var, String str, org.telegram.ui.ActionBar.n2 n2Var, long j10, Integer num, Bundle bundle) {
        this.g = launchActivity;
        this.a = z70Var;
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
            org.telegram.ui.Components.f5.t0((org.telegram.ui.ActionBar.n2) i2.e.h(1, launchActivity.d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
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
        if (str == null || !(n2Var instanceof qn) || ((qn) n2Var).a() != j10) {
            if (n2Var instanceof qn) {
                qn qnVar = (qn) n2Var;
                if (qnVar.a() == j10 && this.e == null) {
                    AndroidUtilities.shakeViewSpring(qnVar.x0, 5.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    fk fkVar = qnVar.Y;
                    for (int i10 = 0; i10 < fkVar.getChildCount(); i10++) {
                        AndroidUtilities.shakeViewSpring(fkVar.getChildAt(i10), 5.0f);
                    }
                    org.telegram.ui.ActionBar.k actionBar = qnVar.getActionBar();
                    for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                        AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                    }
                }
            }
            n2Var = new qn(this.f);
            ((ActionBarLayout) launchActivity.O()).P(n2Var);
        }
        AndroidUtilities.runOnUIThread(new ai.c3(this, this.b, this.d, n2Var, 22), 150L);
    }
}
