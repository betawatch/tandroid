package org.telegram.tgnet;

import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class TLParseException extends RuntimeException {
    private TLParseException(String str) {
        super(str);
    }

    public static void doThrowOrLog(InputSerializedData inputSerializedData, String str, int i3, boolean z10) {
        TLParseException tLParseException = new TLParseException(String.format("can't parse magic %x in %s. Source: %s", Integer.valueOf(i3), str, inputSerializedData != null ? inputSerializedData.getDataSourceType() : null));
        a8.g(tLParseException, i3 != -847714938);
        if (i3 != -847714938 && i3 != -779361553 && i3 != -212046591) {
            g0.h3(new lg.n(tLParseException, 18));
        }
        if (z10) {
            throw tLParseException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$doThrowOrLog$0(TLParseException tLParseException) {
        hs.e().k(hs.M5, tLParseException);
    }
}
