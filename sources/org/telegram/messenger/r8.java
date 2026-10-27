package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class r8 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ BaseController h;
    public final /* synthetic */ Object n;

    public /* synthetic */ r8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f = z10;
        this.b = arrayList;
        this.d = i10;
        this.c = j10;
        this.e = i11;
        this.n = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f, this.b, this.d, this.c, this.e, (Runnable) this.n);
                break;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$22((LongSparseIntArray) this.n, this.b, this.c, this.d, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ r8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.n = longSparseIntArray;
        this.b = arrayList;
        this.c = j10;
        this.d = i10;
        this.e = i11;
        this.f = z10;
    }
}
