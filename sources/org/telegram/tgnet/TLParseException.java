package org.telegram.tgnet;

import mh.m2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class TLParseException extends RuntimeException {
    private TLParseException(String str) {
        super(str);
    }

    public static void doThrowOrLog(InputSerializedData inputSerializedData, String str, int i9, boolean z10) {
        TLParseException tLParseException = new TLParseException(String.format("can't parse magic %x in %s. Source: %s", Integer.valueOf(i9), str, inputSerializedData != null ? inputSerializedData.getDataSourceType() : null));
        FileLog.e(tLParseException, i9 != -847714938);
        if (i9 != -847714938 && i9 != -779361553) {
            AndroidUtilities.runOnUIThread(new m2(tLParseException, 4));
        }
        if (z10) {
            throw tLParseException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$doThrowOrLog$0(TLParseException tLParseException) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.tlSchemeParseException, tLParseException);
    }
}
