package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class y21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;

    public /* synthetic */ y21(String str, MessageObject messageObject, long j3, int i10) {
        this.a = i10;
        this.b = messageObject;
        this.c = j3;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        String str = this.d;
        long j3 = this.c;
        MessageObject messageObject = this.b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j3);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, valueOf, str, bool, bool);
                break;
            default:
                d31.g(messageObject, j3, str);
                break;
        }
    }
}
