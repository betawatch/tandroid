package ai;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.q31;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ TLObject n;

    public /* synthetic */ j(x xVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10, TLObject tLObject) {
        this.d = xVar;
        this.e = tL_error;
        this.f = twoStepVerificationActivity;
        this.h = activity;
        this.b = z10;
        this.c = j10;
        this.n = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x.Z((x) this.d, (TLRPC.TL_error) this.e, (TwoStepVerificationActivity) this.f, (Activity) this.h, this.b, this.c, this.n);
                break;
            default:
                final q31 q31Var = (q31) this.d;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.e;
                final i80 i80Var = (i80) this.f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.n;
                boolean z10 = this.b;
                final boolean z11 = !z10;
                e1Var.setVisibility(0);
                e1Var.setText(LocaleController.getString(!z10 ? R.string.UnbanUserMonoforum : R.string.BanUserMonoforum));
                final long j10 = this.c;
                e1Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.b31
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        q31 q31Var2 = q31.this;
                        int i10 = q31Var2.b;
                        i80Var.u();
                        boolean z12 = z11;
                        TLRPC.User user2 = user;
                        if (!z12) {
                            MessagesController.getInstance(i10).deleteParticipantFromChat(j10, user2, (TLRPC.Chat) null, false, false);
                            return;
                        }
                        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                        tL_channels_editBanned.participant = MessagesController.getInputPeer(user2);
                        tL_channels_editBanned.channel = MessagesController.getInputChannel(chat);
                        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
                        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_editBanned, new y1(q31Var2, 15));
                    }
                });
                break;
        }
    }

    public /* synthetic */ j(q31 q31Var, boolean z10, org.telegram.ui.ActionBar.e1 e1Var, i80 i80Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.d = q31Var;
        this.b = z10;
        this.e = e1Var;
        this.f = i80Var;
        this.c = j10;
        this.h = user;
        this.n = chat;
    }
}
