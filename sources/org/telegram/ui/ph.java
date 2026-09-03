package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ph implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ TLRPC.TL_error e;
    public final /* synthetic */ int f;
    public final /* synthetic */ MessageObject h;
    public final /* synthetic */ TLRPC.TL_messages_getDiscussionMessage n;
    public final /* synthetic */ TLRPC.Chat r;
    public final /* synthetic */ int s;
    public final /* synthetic */ MessageObject v;

    public /* synthetic */ ph(zn znVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.a = i13;
        this.b = znVar;
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
                zn znVar = this.b;
                znVar.h8(new ph(znVar, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.v, 1));
                break;
            default:
                zn znVar2 = this.b;
                if (this.c == znVar2.cc) {
                    znVar2.ec = -1;
                    TLObject tLObject = this.d;
                    if (tLObject == null) {
                        if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                            MessagesController.showCantOpenAlert(znVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                            znVar2.fc = 0;
                            znVar2.gc = false;
                            znVar2.u0.e1();
                            break;
                        }
                    } else {
                        znVar2.jc = (TLRPC.messages_Messages) tLObject;
                    }
                    znVar2.ya(znVar2.ic, znVar2.jc, this.f, this.h, this.n, this.r, this.s, this.v);
                    break;
                }
                break;
        }
    }
}
