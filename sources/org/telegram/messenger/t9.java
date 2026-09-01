package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class t9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t9(int i10, long j10, long j11, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2) {
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
                ((MediaDataController) this.e).lambda$loadBotInfo$199(this.b, this.d, (Utilities.Callback) this.f, this.c);
                break;
            case 1:
                ((MessagesController) this.e).lambda$loadFullChat$67(this.b, (TLRPC.TL_messages_chatFull) this.f, this.c, this.d);
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
                    g1Var.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
                    i10 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.x6, false);
                    g1Var2.setVisibility(8);
                } else {
                    g1Var.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
                    int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false);
                    g1Var2.setVisibility(0);
                    if (MessagesController.getInstance(i11).isDialogNotificationsSoundEnabled(j10, j11)) {
                        g1Var2.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
                    } else {
                        g1Var2.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
                    }
                    i10 = w02;
                }
                g1Var.c(i10, i10);
                g1Var.setSelectorColor(org.telegram.ui.ActionBar.k6.l1(0.1f, i10));
                break;
        }
    }

    public /* synthetic */ t9(BaseController baseController, long j10, long j11, Object obj, int i10, int i11) {
        this.a = i11;
        this.e = baseController;
        this.b = j10;
        this.d = j11;
        this.f = obj;
        this.c = i10;
    }

    public /* synthetic */ t9(MessagesController messagesController, long j10, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i10, long j11) {
        this.a = 1;
        this.e = messagesController;
        this.b = j10;
        this.f = tL_messages_chatFull;
        this.c = i10;
        this.d = j11;
    }
}
