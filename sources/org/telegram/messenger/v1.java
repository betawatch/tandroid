package org.telegram.messenger;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class v1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ v1(String str, int i10) {
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
