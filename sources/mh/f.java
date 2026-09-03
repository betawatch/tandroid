package mh;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.w21;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ TLObject n;

    public /* synthetic */ f(p pVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z4, long j10, TLObject tLObject) {
        this.d = pVar;
        this.e = tL_error;
        this.f = twoStepVerificationActivity;
        this.h = activity;
        this.b = z4;
        this.c = j10;
        this.n = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p.Z((p) this.d, (TLRPC.TL_error) this.e, (TwoStepVerificationActivity) this.f, (Activity) this.h, this.b, this.c, this.n);
                break;
            default:
                final w21 w21Var = (w21) this.d;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.e;
                final q70 q70Var = (q70) this.f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.n;
                boolean z4 = this.b;
                final boolean z10 = !z4;
                g1Var.setVisibility(0);
                g1Var.setText(LocaleController.getString(!z4 ? R.string.UnbanUserMonoforum : R.string.BanUserMonoforum));
                final long j10 = this.c;
                g1Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.i21
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        w21 w21Var2 = w21.this;
                        int i10 = w21Var2.b;
                        q70Var.u();
                        boolean z11 = z10;
                        TLRPC.User user2 = user;
                        if (!z11) {
                            MessagesController.getInstance(i10).deleteParticipantFromChat(j10, user2, (TLRPC.Chat) null, false, false);
                            return;
                        }
                        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                        tL_channels_editBanned.participant = MessagesController.getInputPeer(user2);
                        tL_channels_editBanned.channel = MessagesController.getInputChannel(chat);
                        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
                        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_editBanned, new y1(w21Var2, 15));
                    }
                });
                break;
        }
    }

    public /* synthetic */ f(w21 w21Var, boolean z4, org.telegram.ui.ActionBar.g1 g1Var, q70 q70Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.d = w21Var;
        this.b = z4;
        this.e = g1Var;
        this.f = q70Var;
        this.c = j10;
        this.h = user;
        this.n = chat;
    }
}
