package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class de implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ de(int i10, int i11, int i12, long j10, MessagesController messagesController, boolean z10) {
        this.a = i12;
        this.b = messagesController;
        this.c = j10;
        this.d = i10;
        this.e = i11;
        this.f = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.c, this.d, this.e, this.f);
                break;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.c, this.d, this.e, this.f);
                break;
            default:
                int i11 = ChatActivityEnterView.i5;
                ((ChatActivityEnterView) notificationCenterDelegate).T0(this.d, this.f, this.e, false, this.c);
                break;
        }
    }

    public /* synthetic */ de(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j10) {
        this.a = 2;
        this.b = chatActivityEnterView;
        this.f = z10;
        this.d = i10;
        this.e = i11;
        this.c = j10;
    }
}
