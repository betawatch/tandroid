package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c60;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class w1 implements w70, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ TLRPC.User a;
    public final /* synthetic */ TLRPC.Chat b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Activity h;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 n;
    public final /* synthetic */ AccountInstance r;

    public /* synthetic */ w1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z4, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.p2 p2Var, AccountInstance accountInstance) {
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

    @Override // org.telegram.ui.Components.w70
    public void a(TLRPC.InputPeer inputPeer, boolean z4, boolean z10, boolean z11) {
        boolean z12 = this.d;
        Activity activity = this.h;
        AccountInstance accountInstance = this.r;
        TLRPC.Chat chat = this.b;
        String str = this.c;
        if (z12 && z10) {
            c60.c1((LaunchActivity) activity, accountInstance, chat, inputPeer, z4, str);
            return;
        }
        TLRPC.User user = this.a;
        boolean z13 = this.e;
        boolean z14 = this.f;
        org.telegram.ui.ActionBar.p2 p2Var = this.n;
        if (z4 || str == null) {
            f2.b(user, chat, str, inputPeer, z4, z13, z14, z12, activity, p2Var, accountInstance, false, true, z11);
            return;
        }
        e2 e2Var = new e2(activity, chat, user, chat, str, inputPeer, z13, z14, z12, activity, p2Var, accountInstance, z11);
        if (p2Var != null) {
            p2Var.showDialog(e2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
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
            VoIPService.getSharedInstance().hangUp(new Runnable() { // from class: org.telegram.ui.Components.voip.y1
                @Override // java.lang.Runnable
                public final void run() {
                    f2.a = 0L;
                    f2.b(TLRPC.User.this, chat, str, null, false, z4, z10, z11, activity, p2Var, accountInstance, true, true, false);
                }
            });
        } else {
            f2.b(user, chat, str, null, false, z4, z10, z11, activity, p2Var, accountInstance, true, true, false);
        }
    }

    public /* synthetic */ w1(boolean z4, Activity activity, AccountInstance accountInstance, TLRPC.Chat chat, String str, TLRPC.User user, boolean z10, boolean z11, org.telegram.ui.ActionBar.p2 p2Var) {
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
