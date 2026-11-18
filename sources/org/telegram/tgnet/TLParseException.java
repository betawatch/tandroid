package org.telegram.tgnet;

import oi.a2;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public class TLParseException extends RuntimeException {
    private TLParseException(String str) {
        super(str);
    }

    public static void doThrowOrLog(InputSerializedData inputSerializedData, String str, int i7, boolean z10) {
        int i10 = 1;
        TLParseException tLParseException = new TLParseException(String.format("can't parse magic %x in %s. Source: %s", Integer.valueOf(i7), str, inputSerializedData != null ? inputSerializedData.getDataSourceType() : null));
        a8.g(tLParseException, i7 != -847714938);
        if (i7 != -847714938 && i7 != -779361553 && i7 != -212046591) {
            g0.g3(new a2(tLParseException, i10));
        }
        if (z10) {
            throw tLParseException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$doThrowOrLog$0(TLParseException tLParseException) {
        ks.e().k(ks.P5, tLParseException);
    }
}
