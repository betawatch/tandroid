package org.telegram.tgnet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class TLParseException extends RuntimeException {
    private TLParseException(String str) {
        super(str);
    }

    public static void doThrowOrLog(InputSerializedData inputSerializedData, String str, int i, boolean z) {
        TLParseException tLParseException = new TLParseException(String.format("can't parse magic %x in %s. Source: %s", Integer.valueOf(i), str, inputSerializedData != null ? inputSerializedData.getDataSourceType() : null));
        cc4.g(tLParseException, i != -847714938);
        if (i != -847714938 && i != -779361553 && i != -212046591) {
            hl.c3(new s8b(tLParseException, (byte) 11));
        }
        if (z) {
            throw tLParseException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$doThrowOrLog$0(TLParseException tLParseException) {
        jn7.e().k(jn7.P5, tLParseException);
    }
}
