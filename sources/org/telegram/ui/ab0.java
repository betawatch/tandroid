package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ab0 implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ h90 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ LaunchActivity g;

    public ab0(LaunchActivity launchActivity, h90 h90Var, String str, org.telegram.ui.ActionBar.p2 p2Var, long j3, Integer num, Bundle bundle) {
        this.g = launchActivity;
        this.a = h90Var;
        this.b = str;
        this.c = p2Var;
        this.d = j3;
        this.e = num;
        this.f = bundle;
    }

    @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
    public final void onError() {
        LaunchActivity launchActivity = this.g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.d5.u0((org.telegram.ui.ActionBar.p2) hc.b.i(1, launchActivity.d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
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
        org.telegram.ui.ActionBar.p2 p2Var = this.c;
        if (str == null || !(p2Var instanceof eo) || ((eo) p2Var).a() != j3) {
            if (p2Var instanceof eo) {
                eo eoVar = (eo) p2Var;
                if (eoVar.a() == j3 && this.e == null) {
                    AndroidUtilities.shakeViewSpring(eoVar.x0, 5.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    ok okVar = eoVar.Y;
                    for (int i10 = 0; i10 < okVar.getChildCount(); i10++) {
                        AndroidUtilities.shakeViewSpring(okVar.getChildAt(i10), 5.0f);
                    }
                    org.telegram.ui.ActionBar.l actionBar = eoVar.getActionBar();
                    for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                        AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                    }
                }
            }
            p2Var = new eo(this.f);
            ((ActionBarLayout) launchActivity.O()).P(p2Var);
        }
        AndroidUtilities.runOnUIThread(new ya0(this, this.b, this.d, p2Var, 0), 150L);
    }
}
