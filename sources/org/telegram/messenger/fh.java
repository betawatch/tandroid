package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class fh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsController b;
    public final /* synthetic */ LongSparseIntArray c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ fh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.a = i10;
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
