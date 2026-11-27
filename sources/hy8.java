// default package

import org.telegram.messenger.PushListenerController;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class hy8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;

    public /* synthetic */ hy8(String str, String str2, long j, byte b) {
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.d;
        String str = this.c;
        String str2 = this.b;
        switch (b) {
            case 0:
                PushListenerController.lambda$processRemoteMessage$6(str2, str, j);
                break;
            default:
                PushListenerController.lambda$processRemoteMessage$7(str2, str, j);
                break;
        }
    }
}
