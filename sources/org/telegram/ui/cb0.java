package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class cb0 implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ r80 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ LaunchActivity g;

    public cb0(LaunchActivity launchActivity, r80 r80Var, String str, org.telegram.ui.ActionBar.n2 n2Var, long j3, Integer num, Bundle bundle) {
        this.g = launchActivity;
        this.a = r80Var;
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
            org.telegram.ui.Components.d5.u0((org.telegram.ui.ActionBar.n2) hg.k0.g(1, launchActivity.d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
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
        if (str == null || !(n2Var instanceof zn) || ((zn) n2Var).a() != j3) {
            if (n2Var instanceof zn) {
                zn znVar = (zn) n2Var;
                if (znVar.a() == j3 && this.e == null) {
                    AndroidUtilities.shakeViewSpring(znVar.x0, 5.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    lk lkVar = znVar.Y;
                    for (int i10 = 0; i10 < lkVar.getChildCount(); i10++) {
                        AndroidUtilities.shakeViewSpring(lkVar.getChildAt(i10), 5.0f);
                    }
                    org.telegram.ui.ActionBar.k actionBar = znVar.getActionBar();
                    for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                        AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                    }
                }
            }
            n2Var = new zn(this.f);
            ((ActionBarLayout) launchActivity.O()).P(n2Var);
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.x21(this, this.b, this.d, n2Var, 4), 150L);
    }
}
