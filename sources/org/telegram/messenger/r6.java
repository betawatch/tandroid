package org.telegram.messenger;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class r6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r6(int i10, int i11, String str) {
        this.a = 3;
        this.b = i10;
        this.c = i11;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaController.8) this.d).lambda$onStateChanged$0(this.b, this.c);
                break;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.b, this.c);
                break;
            case 2:
                ((NotificationsController) this.d).lambda$deleteNotificationChannelGlobal$44(this.b, this.c);
                break;
            default:
                PushListenerController.lambda$sendRegistrationToServer$0(this.b, this.c, (String) this.d);
                break;
        }
    }

    public /* synthetic */ r6(Object obj, int i10, int i11, int i12) {
        this.a = i12;
        this.d = obj;
        this.b = i10;
        this.c = i11;
    }
}
