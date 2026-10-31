package org.telegram.ui.Components;

import j$.util.function.Predicate$-CC;
import java.util.function.Predicate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class rr implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLObject b;

    public /* synthetic */ rr(int i10, TLObject tLObject) {
        this.a = i10;
        this.b = tLObject;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        int i10 = this.a;
        return Predicate$-CC.$default$and(this, predicate);
    }

    public /* synthetic */ Predicate negate() {
        switch (this.a) {
        }
        return Predicate$-CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        int i10 = this.a;
        return Predicate$-CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.b;
                TLRPC.Peer peer = ((org.telegram.messenger.jj) obj).k.from_id;
                if ((inputPeer != null || peer != null) && (inputPeer == null || peer == null || (!(inputPeer instanceof TLRPC.TL_inputPeerChat) || !(peer instanceof TLRPC.TL_peerChat) ? !(inputPeer instanceof TLRPC.TL_inputPeerChannel) || !(peer instanceof TLRPC.TL_peerChannel) ? !(inputPeer instanceof TLRPC.TL_inputPeerUser) || !(peer instanceof TLRPC.TL_peerUser) || inputPeer.user_id != peer.user_id : inputPeer.channel_id != peer.channel_id : inputPeer.chat_id != peer.chat_id))) {
                }
            default:
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
                TLObject tLObject = this.b;
                if (!(tLObject instanceof TLRPC.User) ? !(tLObject instanceof TLRPC.Chat) || jjVar.k.from_id.user_id != ((TLRPC.Chat) tLObject).id : jjVar.k.from_id.user_id != ((TLRPC.User) tLObject).id) {
                }
                break;
        }
        return false;
    }
}
