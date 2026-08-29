package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ih implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ TLRPC.TL_error e;
    public final /* synthetic */ int f;
    public final /* synthetic */ MessageObject h;
    public final /* synthetic */ TLRPC.TL_messages_getDiscussionMessage n;
    public final /* synthetic */ TLRPC.Chat r;
    public final /* synthetic */ int s;
    public final /* synthetic */ MessageObject v;

    public /* synthetic */ ih(tn tnVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.a = i13;
        this.b = tnVar;
        this.c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f = i11;
        this.h = messageObject;
        this.n = tL_messages_getDiscussionMessage;
        this.r = chat;
        this.s = i12;
        this.v = messageObject2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tn tnVar = this.b;
                tnVar.h8(new ih(tnVar, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.v, 1));
                break;
            default:
                tn tnVar2 = this.b;
                if (this.c == tnVar2.bc) {
                    tnVar2.dc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject == null) {
                        if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                            MessagesController.showCantOpenAlert(tnVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                            tnVar2.ec = 0;
                            tnVar2.fc = false;
                            tnVar2.t0.f1();
                            break;
                        }
                    } else {
                        tnVar2.ic = (TLRPC.messages_Messages) tLObject;
                    }
                    tnVar2.ya(tnVar2.hc, tnVar2.ic, this.f, this.h, this.n, this.r, this.s, this.v);
                    break;
                }
                break;
        }
    }
}
