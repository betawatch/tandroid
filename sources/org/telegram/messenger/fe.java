package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class fe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ fe(int i10, int i11, int i12, long j10, MessagesController messagesController, boolean z4) {
        this.a = i12;
        this.b = messagesController;
        this.c = j10;
        this.d = i10;
        this.e = i11;
        this.f = z4;
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
                int i11 = ChatActivityEnterView.j5;
                ((ChatActivityEnterView) notificationCenterDelegate).T0(this.d, this.f, this.e, false, this.c);
                break;
        }
    }

    public /* synthetic */ fe(ChatActivityEnterView chatActivityEnterView, boolean z4, int i10, int i11, long j10) {
        this.a = 2;
        this.b = chatActivityEnterView;
        this.f = z4;
        this.d = i10;
        this.e = i11;
        this.c = j10;
    }
}
