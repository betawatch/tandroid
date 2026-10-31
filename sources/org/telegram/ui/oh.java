package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class oh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ TLRPC.TL_error e;
    public final /* synthetic */ int f;
    public final /* synthetic */ org.telegram.messenger.jj h;
    public final /* synthetic */ TLRPC.TL_messages_getDiscussionMessage n;
    public final /* synthetic */ TLRPC.Chat r;
    public final /* synthetic */ int s;
    public final /* synthetic */ org.telegram.messenger.jj w;

    public /* synthetic */ oh(un unVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, org.telegram.messenger.jj jjVar, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, org.telegram.messenger.jj jjVar2, int i13) {
        this.a = i13;
        this.b = unVar;
        this.c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f = i11;
        this.h = jjVar;
        this.n = tL_messages_getDiscussionMessage;
        this.r = chat;
        this.s = i12;
        this.w = jjVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                un unVar = this.b;
                unVar.p8(new oh(unVar, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w, 1));
                break;
            default:
                un unVar2 = this.b;
                if (this.c == unVar2.Ac) {
                    unVar2.Cc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject == null) {
                        if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                            org.telegram.messenger.vp.O4(org.telegram.messenger.cd.L0(2131752445, null), unVar2);
                            unVar2.Dc = 0;
                            unVar2.Ec = false;
                            unVar2.z0.g1();
                            break;
                        }
                    } else {
                        unVar2.Hc = (TLRPC.messages_Messages) tLObject;
                    }
                    unVar2.Na(unVar2.Gc, unVar2.Hc, this.f, this.h, this.n, this.r, this.s, this.w);
                    break;
                }
                break;
        }
    }
}
