package org.telegram.messenger;
/* loaded from: classes.dex */
public final /* synthetic */ class PushListenerController$$ExternalSyntheticLambda5 implements Runnable {
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ long f$2;

    public /* synthetic */ PushListenerController$$ExternalSyntheticLambda5(String str, String str2, long j) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PushListenerController.lambda$processRemoteMessage$7(this.f$0, this.f$1, this.f$2);
    }
}
