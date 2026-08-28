package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;

    public /* synthetic */ d21(String str, MessageObject messageObject, long j10, int i9) {
        this.a = i9;
        this.b = messageObject;
        this.c = j10;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        String str = this.d;
        long j10 = this.c;
        MessageObject messageObject = this.b;
        switch (i9) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i10 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j10);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, messageObject, valueOf, str, bool, bool);
                break;
            default:
                i21.g(messageObject, j10, str);
                break;
        }
    }
}
