package org.telegram.tgnet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes3.dex */
public class TLParseException extends RuntimeException {
    private TLParseException(String str) {
        super(str);
    }

    public static void doThrowOrLog(InputSerializedData inputSerializedData, String str, int i, boolean z) {
        final TLParseException tLParseException = new TLParseException(String.format("can't parse magic %x in %s. Source: %s", Integer.valueOf(i), str, inputSerializedData != null ? inputSerializedData.getDataSourceType() : null));
        FileLog.e(tLParseException, i != -847714938);
        if (i != -847714938 && i != -779361553) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.tgnet.TLParseException$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    TLParseException.lambda$doThrowOrLog$0(TLParseException.this);
                }
            });
        }
        if (z) {
            throw tLParseException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$doThrowOrLog$0(TLParseException tLParseException) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.tlSchemeParseException, tLParseException);
    }
}
