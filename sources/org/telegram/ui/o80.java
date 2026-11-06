package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class o80 implements org.telegram.messenger.ep {
    public final /* synthetic */ q10 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ TLRPC.ChatInvite d;
    public final /* synthetic */ LaunchActivity e;

    public o80(LaunchActivity launchActivity, q10 q10Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.a = q10Var;
        this.b = zArr;
        this.c = bundle;
        this.d = chatInvite;
    }

    @Override // org.telegram.messenger.ep
    public final void a() {
        LaunchActivity launchActivity = this.e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.v4.r0((org.telegram.ui.ActionBar.f2) jg.g.i(1, launchActivity.d0), null, org.telegram.messenger.hd.M0(2131749074, null), null);
        }
        try {
            this.a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.messenger.ep
    public final void f(boolean z9) {
        try {
            this.a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.b[0]) {
            return;
        }
        an anVar = new an(this.c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            anVar.a6 = chatInvite;
        }
        ((ActionBarLayout) this.e.M()).S(anVar);
    }
}
