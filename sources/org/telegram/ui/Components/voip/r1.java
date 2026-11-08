package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c40;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r1 implements r60, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ TLRPC.User a;
    public final /* synthetic */ TLRPC.Chat b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Activity h;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 n;
    public final /* synthetic */ org.telegram.messenger.c r;

    public /* synthetic */ r1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z9, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.messenger.c cVar) {
        this.a = user;
        this.b = chat;
        this.c = str;
        this.d = z9;
        this.e = z10;
        this.f = z11;
        this.h = activity;
        this.n = f2Var;
        this.r = cVar;
    }

    @Override // org.telegram.ui.Components.r60
    public void a(TLRPC.InputPeer inputPeer, boolean z9, boolean z10, boolean z11) {
        boolean z12 = this.d;
        Activity activity = this.h;
        org.telegram.messenger.c cVar = this.r;
        TLRPC.Chat chat = this.b;
        String str = this.c;
        if (z12 && z10) {
            c40.e1((LaunchActivity) activity, cVar, chat, inputPeer, z9, str);
            return;
        }
        TLRPC.User user = this.a;
        boolean z13 = this.e;
        boolean z14 = this.f;
        org.telegram.ui.ActionBar.f2 f2Var = this.n;
        if (z9 || str == null) {
            y1.b(user, chat, str, inputPeer, z9, z13, z14, z12, activity, f2Var, cVar, false, true, z11);
            return;
        }
        x1 x1Var = new x1(activity, chat, user, chat, str, inputPeer, z13, z14, z12, activity, f2Var, cVar, z11);
        if (f2Var != null) {
            f2Var.showDialog(x1Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.a;
        final TLRPC.Chat chat = this.b;
        final String str = this.c;
        final boolean z9 = this.d;
        final boolean z10 = this.e;
        final boolean z11 = this.f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.f2 f2Var = this.n;
        final org.telegram.messenger.c cVar = this.r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() { // from class: org.telegram.ui.Components.voip.t1
                @Override // java.lang.Runnable
                public final void run() {
                    y1.a = 0L;
                    y1.b(TLRPC.User.this, chat, str, null, false, z9, z10, z11, activity, f2Var, cVar, true, true, false);
                }
            });
        } else {
            y1.b(user, chat, str, null, false, z9, z10, z11, activity, f2Var, cVar, true, true, false);
        }
    }

    public /* synthetic */ r1(boolean z9, Activity activity, org.telegram.messenger.c cVar, TLRPC.Chat chat, String str, TLRPC.User user, boolean z10, boolean z11, org.telegram.ui.ActionBar.f2 f2Var) {
        this.d = z9;
        this.h = activity;
        this.r = cVar;
        this.b = chat;
        this.c = str;
        this.a = user;
        this.e = z10;
        this.f = z11;
        this.n = f2Var;
    }
}
