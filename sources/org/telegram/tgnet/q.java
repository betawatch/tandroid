package org.telegram.tgnet;

import org.telegram.messenger.d20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.json.TLJsonParser;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements d20 {
    public final /* synthetic */ int a;

    public /* synthetic */ q(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.d20
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
