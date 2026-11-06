package org.telegram.tgnet;

import l2.w;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public class TLParseException extends RuntimeException {
    private TLParseException(String str) {
        super(str);
    }

    public static void doThrowOrLog(InputSerializedData inputSerializedData, String str, int i7, boolean z9) {
        TLParseException tLParseException = new TLParseException(String.format("can't parse magic %x in %s. Source: %s", Integer.valueOf(i7), str, inputSerializedData != null ? inputSerializedData.getDataSourceType() : null));
        a8.g(tLParseException, i7 != -847714938);
        if (i7 != -847714938 && i7 != -779361553 && i7 != -212046591) {
            g0.h3(new w(tLParseException, 15));
        }
        if (z9) {
            throw tLParseException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$doThrowOrLog$0(TLParseException tLParseException) {
        qs.e().k(qs.M5, tLParseException);
    }
}
