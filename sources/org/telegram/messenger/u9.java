package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bp;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class u9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u9(int i10, long j10, long j11, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2) {
        this.a = 3;
        this.c = i10;
        this.b = j10;
        this.d = j11;
        this.e = g1Var;
        this.f = g1Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                ((MediaDataController) this.e).lambda$loadBotInfo$200(this.b, this.d, (Utilities.Callback) this.f, this.c);
                break;
            case 1:
                ((MessagesController) this.e).lambda$loadFullChat$66(this.b, (TLRPC.TL_messages_chatFull) this.f, this.c, this.d);
                break;
            case 2:
                ((MessagesStorage) this.e).lambda$loadPendingTasks$20(this.b, this.d, (TLMethod) this.f, this.c);
                break;
            default:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.e;
                org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) this.f;
                int i11 = this.c;
                MessagesController messagesController = MessagesController.getInstance(i11);
                long j10 = this.b;
                long j11 = this.d;
                if (messagesController.isDialogMuted(j10, j11)) {
                    g1Var.j(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
                    i10 = org.telegram.ui.ActionBar.y6.x6;
                    g1Var2.setVisibility(8);
                } else {
                    g1Var.j(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
                    int i12 = org.telegram.ui.ActionBar.y6.q7;
                    g1Var2.setVisibility(0);
                    if (MessagesController.getInstance(i11).isDialogNotificationsSoundEnabled(j10, j11)) {
                        g1Var2.j(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
                    } else {
                        g1Var2.j(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
                    }
                    i10 = i12;
                }
                bp.c(g1Var, i10);
                break;
        }
    }

    public /* synthetic */ u9(BaseController baseController, long j10, long j11, Object obj, int i10, int i11) {
        this.a = i11;
        this.e = baseController;
        this.b = j10;
        this.d = j11;
        this.f = obj;
        this.c = i10;
    }

    public /* synthetic */ u9(MessagesController messagesController, long j10, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i10, long j11) {
        this.a = 1;
        this.e = messagesController;
        this.b = j10;
        this.f = tL_messages_chatFull;
        this.c = i10;
        this.d = j11;
    }
}
