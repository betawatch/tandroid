package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class bb0 implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ ma0 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ TLRPC.ChatInvite d;
    public final /* synthetic */ LaunchActivity e;

    public bb0(LaunchActivity launchActivity, ma0 ma0Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.a = ma0Var;
        this.b = zArr;
        this.c = bundle;
        this.d = chatInvite;
    }

    @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
    public final void onError() {
        LaunchActivity launchActivity = this.e;
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
        if (this.b[0]) {
            return;
        }
        bo boVar = new bo(this.c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            boVar.K5 = chatInvite;
        }
        ((ActionBarLayout) this.e.O()).P(boVar);
    }
}
