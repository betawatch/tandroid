package org.telegram.tgnet;

import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class TLParseException extends RuntimeException {
    private TLParseException(String str) {
        super(str);
    }

    public static void doThrowOrLog(InputSerializedData inputSerializedData, String str, int i10, boolean z10) {
        TLParseException tLParseException = new TLParseException(String.format("can't parse magic %x in %s. Source: %s", Integer.valueOf(i10), str, inputSerializedData != null ? inputSerializedData.getDataSourceType() : null));
        f8.g(tLParseException, i10 != -847714938);
        if (i10 != -847714938 && i10 != -779361553 && i10 != -212046591) {
            i0.g3(new lg.s(tLParseException, 14));
        }
        if (z10) {
            throw tLParseException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$doThrowOrLog$0(TLParseException tLParseException) {
        zs.e().k(zs.M5, tLParseException);
    }
}
