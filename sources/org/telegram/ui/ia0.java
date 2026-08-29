package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ia0 implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ x60 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ LaunchActivity g;

    public ia0(LaunchActivity launchActivity, x60 x60Var, String str, org.telegram.ui.ActionBar.o2 o2Var, long j10, Integer num, Bundle bundle) {
        this.g = launchActivity;
        this.a = x60Var;
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
            org.telegram.ui.Components.c5.u0((org.telegram.ui.ActionBar.o2) j7.l1.i(1, launchActivity.Z), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
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
        if (str == null || !(o2Var instanceof tn) || ((tn) o2Var).a() != j10) {
            if (o2Var instanceof tn) {
                tn tnVar = (tn) o2Var;
                if (tnVar.a() == j10 && this.e == null) {
                    AndroidUtilities.shakeViewSpring(tnVar.t0, 5.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    dk dkVar = tnVar.U;
                    for (int i10 = 0; i10 < dkVar.getChildCount(); i10++) {
                        AndroidUtilities.shakeViewSpring(dkVar.getChildAt(i10), 5.0f);
                    }
                    org.telegram.ui.ActionBar.l actionBar = tnVar.getActionBar();
                    for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                        AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                    }
                }
            }
            o2Var = new tn(this.f);
            ((ActionBarLayout) launchActivity.O()).P(o2Var);
        }
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.sg(this, this.b, this.d, o2Var, 10), 150L);
    }
}
