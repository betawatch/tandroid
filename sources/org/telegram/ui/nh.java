package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ TLRPC.TL_error e;
    public final /* synthetic */ int f;
    public final /* synthetic */ org.telegram.messenger.kj h;
    public final /* synthetic */ TLRPC.TL_messages_getDiscussionMessage n;
    public final /* synthetic */ TLRPC.Chat r;
    public final /* synthetic */ int s;
    public final /* synthetic */ org.telegram.messenger.kj w;

    public /* synthetic */ nh(un unVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, org.telegram.messenger.kj kjVar, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, org.telegram.messenger.kj kjVar2, int i13) {
        this.a = i13;
        this.b = unVar;
        this.c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f = i11;
        this.h = kjVar;
        this.n = tL_messages_getDiscussionMessage;
        this.r = chat;
        this.s = i12;
        this.w = kjVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                un unVar = this.b;
                unVar.t8(new nh(unVar, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w, 1));
                break;
            default:
                un unVar2 = this.b;
                if (this.c == unVar2.Bc) {
                    unVar2.Dc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject == null) {
                        if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                            org.telegram.messenger.wp.O4(org.telegram.messenger.dd.L0(2131752445, null), unVar2);
                            unVar2.Ec = 0;
                            unVar2.Fc = false;
                            unVar2.z0.g1();
                            break;
                        }
                    } else {
                        unVar2.Ic = (TLRPC.messages_Messages) tLObject;
                    }
                    unVar2.Sa(unVar2.Hc, unVar2.Ic, this.f, this.h, this.n, this.r, this.s, this.w);
                    break;
                }
                break;
        }
    }
}
