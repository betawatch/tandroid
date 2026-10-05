package org.telegram.messenger;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class u1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ u1(String str, int i10) {
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
