package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class m9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m9(int i9, long j10, long j11, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2) {
        this.a = 3;
        this.c = i9;
        this.b = j10;
        this.d = j11;
        this.e = g1Var;
        this.f = g1Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9;
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
                int i10 = this.c;
                MessagesController messagesController = MessagesController.getInstance(i10);
                long j10 = this.b;
                long j11 = this.d;
                if (messagesController.isDialogMuted(j10, j11)) {
                    g1Var.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
                    i9 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.x6, false);
                    g1Var2.setVisibility(8);
                } else {
                    g1Var.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
                    int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false);
                    g1Var2.setVisibility(0);
                    if (MessagesController.getInstance(i10).isDialogNotificationsSoundEnabled(j10, j11)) {
                        g1Var2.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
                    } else {
                        g1Var2.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
                    }
                    i9 = w02;
                }
                g1Var.c(i9, i9);
                g1Var.setSelectorColor(org.telegram.ui.ActionBar.f6.l1(0.1f, i9));
                break;
        }
    }

    public /* synthetic */ m9(BaseController baseController, long j10, long j11, Object obj, int i9, int i10) {
        this.a = i10;
        this.e = baseController;
        this.b = j10;
        this.d = j11;
        this.f = obj;
        this.c = i9;
    }

    public /* synthetic */ m9(MessagesController messagesController, long j10, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i9, long j11) {
        this.a = 1;
        this.e = messagesController;
        this.b = j10;
        this.f = tL_messages_chatFull;
        this.c = i9;
        this.d = j11;
    }
}
