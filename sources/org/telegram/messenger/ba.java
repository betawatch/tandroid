package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g90;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.jc0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class ba implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ba(MessagesController messagesController, boolean z10, TLRPC.User user, long j10) {
        this.a = 0;
        this.b = messagesController;
        this.c = z10;
        this.e = user;
        this.d = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((MessagesController) this.b).lambda$deleteParticipantFromChat$315(this.c, (TLRPC.User) this.e, this.d, tLObject, tL_error);
                break;
            case 1:
                ((MessagesController) this.b).lambda$checkChatInviter$374((TLRPC.Chat) this.e, this.c, this.d, tLObject, tL_error);
                break;
            case 2:
                g90.u((g90) this.b, this.d, this.c, (TLRPC.TL_messages_importChatInvite) this.e, tLObject, tL_error);
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new bi.x2((jc0) this.b, tLObject, this.d, (String) this.e, this.c, tL_error));
                break;
            default:
                AndroidUtilities.runOnUIThread(new bi.x2((zh.g) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.c, this.d));
                break;
        }
    }

    public /* synthetic */ ba(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j10, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
        this.e = obj;
        this.c = z10;
        this.d = j10;
    }

    public /* synthetic */ ba(g90 g90Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.a = 2;
        this.b = g90Var;
        this.d = j10;
        this.c = z10;
        this.e = tL_messages_importChatInvite;
    }

    public /* synthetic */ ba(jc0 jc0Var, long j10, String str, boolean z10) {
        this.a = 3;
        this.b = jc0Var;
        this.d = j10;
        this.e = str;
        this.c = z10;
    }
}
