package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class yg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsController b;
    public final /* synthetic */ LongSparseIntArray c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ yg(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i9) {
        this.a = i9;
        this.b = notificationsController;
        this.c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processDialogsUpdateRead$30(this.c, this.d);
                break;
            default:
                this.b.lambda$removeDeletedHisoryFromNotifications$13(this.c, this.d);
                break;
        }
    }
}
