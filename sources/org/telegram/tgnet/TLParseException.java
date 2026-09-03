package org.telegram.tgnet;

import nh.n5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class TLParseException extends RuntimeException {
    private TLParseException(String str) {
        super(str);
    }

    public static void doThrowOrLog(InputSerializedData inputSerializedData, String str, int i10, boolean z4) {
        TLParseException tLParseException = new TLParseException(String.format("can't parse magic %x in %s. Source: %s", Integer.valueOf(i10), str, inputSerializedData != null ? inputSerializedData.getDataSourceType() : null));
        FileLog.e(tLParseException, i10 != -847714938);
        if (i10 != -847714938 && i10 != -779361553) {
            AndroidUtilities.runOnUIThread(new n5(tLParseException, 18));
        }
        if (z4) {
            throw tLParseException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$doThrowOrLog$0(TLParseException tLParseException) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.tlSchemeParseException, tLParseException);
    }
}
