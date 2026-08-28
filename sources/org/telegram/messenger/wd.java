package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class wd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ wd(int i9, int i10, int i11, long j10, MessagesController messagesController, boolean z10) {
        this.a = i11;
        this.b = messagesController;
        this.c = j10;
        this.d = i9;
        this.e = i10;
        this.f = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.b;
        switch (i9) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.c, this.d, this.e, this.f);
                break;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.c, this.d, this.e, this.f);
                break;
            default:
                int i10 = ChatActivityEnterView.i5;
                ((ChatActivityEnterView) notificationCenterDelegate).T0(this.d, this.f, this.e, false, this.c);
                break;
        }
    }

    public /* synthetic */ wd(ChatActivityEnterView chatActivityEnterView, boolean z10, int i9, int i10, long j10) {
        this.a = 2;
        this.b = chatActivityEnterView;
        this.f = z10;
        this.d = i9;
        this.e = i10;
        this.c = j10;
    }
}
