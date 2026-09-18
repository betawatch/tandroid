package org.telegram.messenger;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ s1(String str, int i10) {
        this.a = i10;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ContactsController.lambda$markAsContacted$49(this.b);
                break;
            case 1:
                FileLog.lambda$w$7(this.b);
                break;
            case 2:
                FileLog.lambda$e$3(this.b);
                break;
            case 3:
                FileLog.lambda$d$6(this.b);
                break;
            case 4:
                GcmPushListenerService.lambda$onNewToken$0(this.b);
                break;
            default:
                SmsReceiver.lambda$onReceive$0(this.b);
                break;
        }
    }
}
