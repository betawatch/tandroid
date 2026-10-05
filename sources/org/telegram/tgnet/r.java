package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.json.TLJsonParser;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;

    public /* synthetic */ r(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        TLJsonParser tLJsonParser = (TLJsonParser) obj;
        switch (this.a) {
            case 0:
                return TLRPC.TL_textWithEntities.TLJsonDeserialize(tLJsonParser);
            default:
                return TLRPC.MessageEntity.TLJsonDeserialize(tLJsonParser);
        }
    }
}
