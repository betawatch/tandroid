package org.telegram.messenger;

import androidx.collection.LongSparseArray;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final /* synthetic */ class MediaDataController$$ExternalSyntheticLambda74 implements Runnable {
    public final /* synthetic */ MediaDataController f$0;
    public final /* synthetic */ ArrayList f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ ArrayList f$3;
    public final /* synthetic */ ArrayList f$4;
    public final /* synthetic */ LongSparseArray f$5;
    public final /* synthetic */ long f$6;

    public /* synthetic */ MediaDataController$$ExternalSyntheticLambda74(MediaDataController mediaDataController, ArrayList arrayList, boolean z, ArrayList arrayList2, ArrayList arrayList3, LongSparseArray longSparseArray, long j) {
        this.f$0 = mediaDataController;
        this.f$1 = arrayList;
        this.f$2 = z;
        this.f$3 = arrayList2;
        this.f$4 = arrayList3;
        this.f$5 = longSparseArray;
        this.f$6 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.lambda$broadcastReplyMessages$141(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
    }
}
