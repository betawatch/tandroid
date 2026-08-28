package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class l8 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ BaseController h;
    public final /* synthetic */ Object n;

    public /* synthetic */ l8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i9, long j10, int i10, Runnable runnable) {
        this.h = mediaDataController;
        this.f = z10;
        this.b = arrayList;
        this.d = i9;
        this.c = j10;
        this.e = i10;
        this.n = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f, this.b, this.d, this.c, this.e, (Runnable) this.n);
                break;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.n, this.b, this.c, this.d, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ l8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i9, int i10, boolean z10) {
        this.h = notificationsController;
        this.n = longSparseIntArray;
        this.b = arrayList;
        this.c = j10;
        this.d = i9;
        this.e = i10;
        this.f = z10;
    }
}
