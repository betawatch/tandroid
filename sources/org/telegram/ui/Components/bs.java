package org.telegram.ui.Components;

import j$.util.function.Predicate$-CC;
import java.util.function.Predicate;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class bs implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLObject b;

    public /* synthetic */ bs(int i10, TLObject tLObject) {
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
                return MessageObject.peersEqual((TLRPC.InputPeer) this.b, ((MessageObject) obj).messageOwner.from_id);
            default:
                MessageObject messageObject = (MessageObject) obj;
                TLObject tLObject = this.b;
                return !(tLObject instanceof TLRPC.User) ? !((tLObject instanceof TLRPC.Chat) && messageObject.messageOwner.from_id.user_id == ((TLRPC.Chat) tLObject).id) : messageObject.messageOwner.from_id.user_id != ((TLRPC.User) tLObject).id;
        }
    }
}
