package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b50;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements i70, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ TLRPC.User a;
    public final /* synthetic */ TLRPC.Chat b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Activity h;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 n;
    public final /* synthetic */ org.telegram.messenger.c r;

    public /* synthetic */ e1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.messenger.c cVar) {
        this.a = user;
        this.b = chat;
        this.c = str;
        this.d = z10;
        this.e = z11;
        this.f = z12;
        this.h = activity;
        this.n = k2Var;
        this.r = cVar;
    }

    @Override // org.telegram.ui.Components.i70
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.d;
        Activity activity = this.h;
        org.telegram.messenger.c cVar = this.r;
        TLRPC.Chat chat = this.b;
        String str = this.c;
        if (z13 && z11) {
            b50.e1((LaunchActivity) activity, cVar, chat, inputPeer, z10, str);
            return;
        }
        TLRPC.User user = this.a;
        boolean z14 = this.e;
        boolean z15 = this.f;
        org.telegram.ui.ActionBar.k2 k2Var = this.n;
        if (z10 || str == null) {
            m1.b(user, chat, str, inputPeer, z10, z14, z15, z13, activity, k2Var, cVar, false, true, z12);
            return;
        }
        l1 l1Var = new l1(activity, chat, user, chat, str, inputPeer, z14, z15, z13, activity, k2Var, cVar, z12);
        if (k2Var != null) {
            k2Var.showDialog(l1Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.a;
        final TLRPC.Chat chat = this.b;
        final String str = this.c;
        final boolean z10 = this.d;
        final boolean z11 = this.e;
        final boolean z12 = this.f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.k2 k2Var = this.n;
        final org.telegram.messenger.c cVar = this.r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() { // from class: org.telegram.ui.Components.voip.g1
                @Override // java.lang.Runnable
                public final void run() {
                    m1.a = 0L;
                    m1.b(TLRPC.User.this, chat, str, null, false, z10, z11, z12, activity, k2Var, cVar, true, true, false);
                }
            });
        } else {
            m1.b(user, chat, str, null, false, z10, z11, z12, activity, k2Var, cVar, true, true, false);
        }
    }

    public /* synthetic */ e1(boolean z10, Activity activity, org.telegram.messenger.c cVar, TLRPC.Chat chat, String str, TLRPC.User user, boolean z11, boolean z12, org.telegram.ui.ActionBar.k2 k2Var) {
        this.d = z10;
        this.h = activity;
        this.r = cVar;
        this.b = chat;
        this.c = str;
        this.a = user;
        this.e = z11;
        this.f = z12;
        this.n = k2Var;
    }
}
