package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.d60;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements f80, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ TLRPC.User a;
    public final /* synthetic */ TLRPC.Chat b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Activity h;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 n;
    public final /* synthetic */ AccountInstance r;

    public /* synthetic */ y1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance) {
        this.a = user;
        this.b = chat;
        this.c = str;
        this.d = z10;
        this.e = z11;
        this.f = z12;
        this.h = activity;
        this.n = m2Var;
        this.r = accountInstance;
    }

    @Override // org.telegram.ui.Components.f80
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.d;
        Activity activity = this.h;
        AccountInstance accountInstance = this.r;
        TLRPC.Chat chat = this.b;
        String str = this.c;
        if (z13 && z11) {
            d60.c1((LaunchActivity) activity, accountInstance, chat, inputPeer, z10, str);
            return;
        }
        TLRPC.User user = this.a;
        boolean z14 = this.e;
        boolean z15 = this.f;
        org.telegram.ui.ActionBar.m2 m2Var = this.n;
        if (z10 || str == null) {
            g2.b(user, chat, str, inputPeer, z10, z14, z15, z13, activity, m2Var, accountInstance, false, true, z12);
            return;
        }
        f2 f2Var = new f2(activity, chat, user, chat, str, inputPeer, z14, z15, z13, activity, m2Var, accountInstance, z12);
        if (m2Var != null) {
            m2Var.showDialog(f2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.a;
        final TLRPC.Chat chat = this.b;
        final String str = this.c;
        final boolean z10 = this.d;
        final boolean z11 = this.e;
        final boolean z12 = this.f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.m2 m2Var = this.n;
        final AccountInstance accountInstance = this.r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() { // from class: org.telegram.ui.Components.voip.a2
                @Override // java.lang.Runnable
                public final void run() {
                    g2.a = 0L;
                    g2.b(TLRPC.User.this, chat, str, null, false, z10, z11, z12, activity, m2Var, accountInstance, true, true, false);
                }
            });
        } else {
            g2.b(user, chat, str, null, false, z10, z11, z12, activity, m2Var, accountInstance, true, true, false);
        }
    }

    public /* synthetic */ y1(boolean z10, Activity activity, AccountInstance accountInstance, TLRPC.Chat chat, String str, TLRPC.User user, boolean z11, boolean z12, org.telegram.ui.ActionBar.m2 m2Var) {
        this.d = z10;
        this.h = activity;
        this.r = accountInstance;
        this.b = chat;
        this.c = str;
        this.a = user;
        this.e = z11;
        this.f = z12;
        this.n = m2Var;
    }
}
