package org.telegram.tgnet;

import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.json.TLJsonParser;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements r20 {
    public final /* synthetic */ int a;

    public /* synthetic */ r(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.messenger.r20
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
