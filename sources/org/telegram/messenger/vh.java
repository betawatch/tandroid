package org.telegram.messenger;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class vh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;

    public /* synthetic */ vh(int i10, long j10, String str, String str2) {
        this.a = i10;
        this.b = str;
        this.c = str2;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PushListenerController.lambda$processRemoteMessage$6(this.b, this.c, this.d);
                break;
            default:
                PushListenerController.lambda$processRemoteMessage$7(this.b, this.c, this.d);
                break;
        }
    }
}
