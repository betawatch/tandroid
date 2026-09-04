package org.telegram.messenger;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class q6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q6(int i10, int i11, String str) {
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
                ((NotificationsController) this.d).lambda$deleteNotificationChannelGlobal$43(this.b, this.c);
                break;
            default:
                PushListenerController.lambda$sendRegistrationToServer$0(this.b, this.c, (String) this.d);
                break;
        }
    }

    public /* synthetic */ q6(Object obj, int i10, int i11, int i12) {
        this.a = i12;
        this.d = obj;
        this.b = i10;
        this.c = i11;
    }
}
