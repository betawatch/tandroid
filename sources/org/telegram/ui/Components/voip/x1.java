package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.y70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.d60;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class x1 implements y70, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ TLRPC.User a;
    public final /* synthetic */ TLRPC.Chat b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Activity h;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 n;
    public final /* synthetic */ AccountInstance r;

    public /* synthetic */ x1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z4, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.p2 p2Var, AccountInstance accountInstance) {
        this.a = user;
        this.b = chat;
        this.c = str;
        this.d = z4;
        this.e = z10;
        this.f = z11;
        this.h = activity;
        this.n = p2Var;
        this.r = accountInstance;
    }

    @Override // org.telegram.ui.Components.y70
    public void a(TLRPC.InputPeer inputPeer, boolean z4, boolean z10, boolean z11) {
        boolean z12 = this.d;
        Activity activity = this.h;
        AccountInstance accountInstance = this.r;
        TLRPC.Chat chat = this.b;
        String str = this.c;
        if (z12 && z10) {
            d60.c1((LaunchActivity) activity, accountInstance, chat, inputPeer, z4, str);
            return;
        }
        TLRPC.User user = this.a;
        boolean z13 = this.e;
        boolean z14 = this.f;
        org.telegram.ui.ActionBar.p2 p2Var = this.n;
        if (z4 || str == null) {
            g2.b(user, chat, str, inputPeer, z4, z13, z14, z12, activity, p2Var, accountInstance, false, true, z11);
            return;
        }
        f2 f2Var = new f2(activity, chat, user, chat, str, inputPeer, z13, z14, z12, activity, p2Var, accountInstance, z11);
        if (p2Var != null) {
            p2Var.showDialog(f2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.a;
        final TLRPC.Chat chat = this.b;
        final String str = this.c;
        final boolean z4 = this.d;
        final boolean z10 = this.e;
        final boolean z11 = this.f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.p2 p2Var = this.n;
        final AccountInstance accountInstance = this.r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() { // from class: org.telegram.ui.Components.voip.z1
                @Override // java.lang.Runnable
                public final void run() {
                    g2.a = 0L;
                    g2.b(TLRPC.User.this, chat, str, null, false, z4, z10, z11, activity, p2Var, accountInstance, true, true, false);
                }
            });
        } else {
            g2.b(user, chat, str, null, false, z4, z10, z11, activity, p2Var, accountInstance, true, true, false);
        }
    }

    public /* synthetic */ x1(boolean z4, Activity activity, AccountInstance accountInstance, TLRPC.Chat chat, String str, TLRPC.User user, boolean z10, boolean z11, org.telegram.ui.ActionBar.p2 p2Var) {
        this.d = z4;
        this.h = activity;
        this.r = accountInstance;
        this.b = chat;
        this.c = str;
        this.a = user;
        this.e = z10;
        this.f = z11;
        this.n = p2Var;
    }
}
