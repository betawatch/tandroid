package org.telegram.messenger;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final /* synthetic */ class th implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;

    public /* synthetic */ th(int i10, long j3, String str, String str2) {
        this.a = i10;
        this.b = str;
        this.c = str2;
        this.d = j3;
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
