package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class n9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n9(int i10, long j3, long j10, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2) {
        this.a = 3;
        this.c = i10;
        this.b = j3;
        this.d = j10;
        this.e = f1Var;
        this.f = f1Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                ((MediaDataController) this.e).lambda$loadBotInfo$199(this.b, this.d, (Utilities.Callback) this.f, this.c);
                break;
            case 1:
                ((MessagesController) this.e).lambda$loadFullChat$67(this.b, (TLRPC.TL_messages_chatFull) this.f, this.c, this.d);
                break;
            case 2:
                ((MessagesStorage) this.e).lambda$loadPendingTasks$20(this.b, this.d, (TLMethod) this.f, this.c);
                break;
            default:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.e;
                org.telegram.ui.ActionBar.f1 f1Var2 = (org.telegram.ui.ActionBar.f1) this.f;
                int i11 = this.c;
                MessagesController messagesController = MessagesController.getInstance(i11);
                long j3 = this.b;
                long j10 = this.d;
                if (messagesController.isDialogMuted(j3, j10)) {
                    f1Var.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
                    i10 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.x6, false);
                    f1Var2.setVisibility(8);
                } else {
                    f1Var.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false);
                    f1Var2.setVisibility(0);
                    if (MessagesController.getInstance(i11).isDialogNotificationsSoundEnabled(j3, j10)) {
                        f1Var2.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
                    } else {
                        f1Var2.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
                    }
                    i10 = w02;
                }
                f1Var.c(i10, i10);
                f1Var.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.1f, i10));
                break;
        }
    }

    public /* synthetic */ n9(BaseController baseController, long j3, long j10, Object obj, int i10, int i11) {
        this.a = i11;
        this.e = baseController;
        this.b = j3;
        this.d = j10;
        this.f = obj;
        this.c = i10;
    }

    public /* synthetic */ n9(MessagesController messagesController, long j3, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i10, long j10) {
        this.a = 1;
        this.e = messagesController;
        this.b = j3;
        this.f = tL_messages_chatFull;
        this.c = i10;
        this.d = j10;
    }
}
