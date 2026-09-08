package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class yb implements Runnable {
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

    public /* synthetic */ yb(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f = iVar;
        this.h = iVar2;
        this.n = iVar3;
        this.r = iVar4;
        this.s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MessagesController) this.b).lambda$processUpdateArray$416((LongSparseIntArray) this.c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f, (a0.i) this.h, (a0.i) this.n, (a0.i) this.r, (a0.i) this.s, (LongSparseIntArray) this.v);
                break;
            case 1:
                ((MessagesController) this.b).lambda$processUpdateArray$417((LongSparseIntArray) this.c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f, (a0.i) this.h, (a0.i) this.n, (a0.i) this.r, (a0.i) this.s, (LongSparseIntArray) this.v);
                break;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.b, (ArrayList) this.c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f, (ArrayList) this.h, (ArrayList) this.n, (ArrayList) this.r, (Runnable) this.s);
                break;
        }
    }

    public /* synthetic */ yb(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
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
