package org.telegram.tgnet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class TLParseException extends RuntimeException {
    private TLParseException(String str) {
        super(str);
    }

    public static void doThrowOrLog(InputSerializedData inputSerializedData, String str, int i, boolean z) {
        TLParseException tLParseException = new TLParseException(String.format("can't parse magic %x in %s. Source: %s", Integer.valueOf(i), str, inputSerializedData != null ? inputSerializedData.getDataSourceType() : null));
        fa4.g(tLParseException, i != -847714938);
        if (i != -847714938 && i != -779361553 && i != -212046591) {
            gl.c3(new kya((Object) tLParseException, (byte) 24));
        }
        if (z) {
            throw tLParseException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$doThrowOrLog$0(TLParseException tLParseException) {
        kk7.e().k(kk7.O5, tLParseException);
    }
}
