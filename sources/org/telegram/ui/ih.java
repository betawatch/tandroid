package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ih implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ TLRPC.TL_error e;
    public final /* synthetic */ int f;
    public final /* synthetic */ MessageObject h;
    public final /* synthetic */ TLRPC.TL_messages_getDiscussionMessage n;
    public final /* synthetic */ TLRPC.Chat r;
    public final /* synthetic */ int s;
    public final /* synthetic */ MessageObject v;

    public /* synthetic */ ih(qn qnVar, int i9, TLObject tLObject, TLRPC.TL_error tL_error, int i10, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i11, MessageObject messageObject2, int i12) {
        this.a = i12;
        this.b = qnVar;
        this.c = i9;
        this.d = tLObject;
        this.e = tL_error;
        this.f = i10;
        this.h = messageObject;
        this.n = tL_messages_getDiscussionMessage;
        this.r = chat;
        this.s = i11;
        this.v = messageObject2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qn qnVar = this.b;
                qnVar.h8(new ih(qnVar, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.v, 1));
                break;
            default:
                qn qnVar2 = this.b;
                if (this.c == qnVar2.bc) {
                    qnVar2.dc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject == null) {
                        if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                            MessagesController.showCantOpenAlert(qnVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                            qnVar2.ec = 0;
                            qnVar2.fc = false;
                            qnVar2.t0.f1();
                            break;
                        }
                    } else {
                        qnVar2.ic = (TLRPC.messages_Messages) tLObject;
                    }
                    qnVar2.ya(qnVar2.hc, qnVar2.ic, this.f, this.h, this.n, this.r, this.s, this.v);
                    break;
                }
                break;
        }
    }
}
