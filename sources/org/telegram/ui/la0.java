package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class la0 implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ kz a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ LaunchActivity g;

    public la0(LaunchActivity launchActivity, kz kzVar, String str, org.telegram.ui.ActionBar.r2 r2Var, long j10, Integer num, Bundle bundle) {
        this.g = launchActivity;
        this.a = kzVar;
        this.b = str;
        this.c = r2Var;
        this.d = j10;
        this.e = num;
        this.f = bundle;
    }

    @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
    public final void onError() {
        LaunchActivity launchActivity = this.g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.g5.t0((org.telegram.ui.ActionBar.r2) ic.a.g(1, launchActivity.d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
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
        org.telegram.ui.ActionBar.r2 r2Var = this.c;
        if (str == null || !(r2Var instanceof wn) || ((wn) r2Var).a() != j10) {
            if (r2Var instanceof wn) {
                wn wnVar = (wn) r2Var;
                if (wnVar.a() == j10 && this.e == null) {
                    AndroidUtilities.shakeViewSpring(wnVar.x0, 5.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    jk jkVar = wnVar.Y;
                    for (int i10 = 0; i10 < jkVar.getChildCount(); i10++) {
                        AndroidUtilities.shakeViewSpring(jkVar.getChildAt(i10), 5.0f);
                    }
                    org.telegram.ui.ActionBar.k actionBar = wnVar.getActionBar();
                    for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                        AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                    }
                }
            }
            r2Var = new wn(this.f);
            ((ActionBarLayout) launchActivity.O()).R(r2Var);
        }
        AndroidUtilities.runOnUIThread(new bi.y2(this, this.b, this.d, r2Var, 22), 150L);
    }
}
