package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class x21 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ TLObject n;

    public /* synthetic */ x21(n31 n31Var, boolean z10, org.telegram.ui.ActionBar.f1 f1Var, y70 y70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = n31Var;
        this.b = z10;
        this.e = f1Var;
        this.f = y70Var;
        this.c = j3;
        this.h = user;
        this.n = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                final n31 n31Var = (n31) this.d;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.e;
                final y70 y70Var = (y70) this.f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.n;
                boolean z10 = this.b;
                final boolean z11 = !z10;
                f1Var.setVisibility(0);
                f1Var.setText(LocaleController.getString(!z10 ? R.string.UnbanUserMonoforum : R.string.BanUserMonoforum));
                final long j3 = this.c;
                f1Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.y21
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        n31 n31Var2 = n31.this;
                        int i10 = n31Var2.b;
                        y70Var.u();
                        boolean z12 = z11;
                        TLRPC.User user2 = user;
                        if (!z12) {
                            MessagesController.getInstance(i10).deleteParticipantFromChat(j3, user2, (TLRPC.Chat) null, false, false);
                            return;
                        }
                        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                        tL_channels_editBanned.participant = MessagesController.getInputPeer(user2);
                        tL_channels_editBanned.channel = MessagesController.getInputChannel(chat);
                        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
                        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_editBanned, new x1(n31Var2, 15));
                    }
                });
                break;
            default:
                yh.g.Z((yh.g) this.d, (TLRPC.TL_error) this.e, (TwoStepVerificationActivity) this.f, (Activity) this.h, this.b, this.c, this.n);
                break;
        }
    }

    public /* synthetic */ x21(yh.g gVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        this.d = gVar;
        this.e = tL_error;
        this.f = twoStepVerificationActivity;
        this.h = activity;
        this.b = z10;
        this.c = j3;
        this.n = tLObject;
    }
}
