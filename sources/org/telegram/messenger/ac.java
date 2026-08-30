package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class ac implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;
    public final /* synthetic */ Cloneable c;
    public final /* synthetic */ Cloneable d;
    public final /* synthetic */ Cloneable e;
    public final /* synthetic */ Cloneable f;
    public final /* synthetic */ Cloneable h;
    public final /* synthetic */ Cloneable n;
    public final /* synthetic */ Cloneable r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Cloneable v;

    public /* synthetic */ ac(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f = hVar;
        this.h = hVar2;
        this.n = hVar3;
        this.r = hVar4;
        this.s = hVar5;
        this.v = longSparseIntArray3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MessagesController) this.b).lambda$processUpdateArray$416((LongSparseIntArray) this.c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f, (a0.h) this.h, (a0.h) this.n, (a0.h) this.r, (a0.h) this.s, (LongSparseIntArray) this.v);
                break;
            case 1:
                ((MessagesController) this.b).lambda$processUpdateArray$417((LongSparseIntArray) this.c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f, (a0.h) this.h, (a0.h) this.n, (a0.h) this.r, (a0.h) this.s, (LongSparseIntArray) this.v);
                break;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.b, (ArrayList) this.c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f, (ArrayList) this.h, (ArrayList) this.n, (ArrayList) this.r, (Runnable) this.s);
                break;
        }
    }

    public /* synthetic */ ac(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.a = 2;
        this.b = notificationsSettingsActivity;
        this.c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f = arrayList5;
        this.h = arrayList6;
        this.n = arrayList7;
        this.r = arrayList8;
        this.s = runnable;
    }
}
