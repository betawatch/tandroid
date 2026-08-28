package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mi implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c3.d b;
    public final /* synthetic */ qn c;
    public final /* synthetic */ qn d;

    public mi(qn qnVar, int i9, c3.d dVar, qn qnVar2) {
        this.d = qnVar;
        this.a = i9;
        this.b = dVar;
        this.c = qnVar2;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11;
        int i12 = NotificationCenter.messagesDidLoad;
        if (i9 == i12 && ((Integer) objArr[10]).intValue() == this.a) {
            this.b.run();
            AndroidUtilities.runOnUIThread(new h3.e0(this.c, i9, i10, objArr), 50L);
            i11 = ((org.telegram.ui.ActionBar.o2) this.d).currentAccount;
            NotificationCenter.getInstance(i11).removeObserver(this, i12);
        }
    }
}
