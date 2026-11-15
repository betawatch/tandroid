package org.telegram.tgnet;

import kg.j1;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.ns;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public class TLParseException extends RuntimeException {
    private TLParseException(String str) {
        super(str);
    }

    public static void doThrowOrLog(InputSerializedData inputSerializedData, String str, int i7, boolean z10) {
        TLParseException tLParseException = new TLParseException(String.format("can't parse magic %x in %s. Source: %s", Integer.valueOf(i7), str, inputSerializedData != null ? inputSerializedData.getDataSourceType() : null));
        a8.g(tLParseException, i7 != -847714938);
        if (i7 != -847714938 && i7 != -779361553 && i7 != -212046591) {
            g0.h3(new j1(tLParseException, 27));
        }
        if (z10) {
            throw tLParseException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$doThrowOrLog$0(TLParseException tLParseException) {
        ns.e().k(ns.M5, tLParseException);
    }
}
