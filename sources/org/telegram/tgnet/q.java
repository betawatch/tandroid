package org.telegram.tgnet;

import org.telegram.messenger.a20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.json.TLJsonParser;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements a20 {
    public final /* synthetic */ int a;

    public /* synthetic */ q(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.a20
    public final Object a(Object obj) {
        TLJsonParser tLJsonParser = (TLJsonParser) obj;
        switch (this.a) {
            case 0:
                return TLRPC.TL_textWithEntities.TLJsonDeserialize(tLJsonParser);
            default:
                return TLRPC.MessageEntity.TLJsonDeserialize(tLJsonParser);
        }
    }
}
