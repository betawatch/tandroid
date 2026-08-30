package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class uk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TopicsController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;

    public /* synthetic */ uk(TopicsController topicsController, long j10, ArrayList arrayList, boolean z4, long j11, int i10) {
        this.a = i10;
        this.b = topicsController;
        this.c = j10;
        this.d = arrayList;
        this.e = z4;
        this.f = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$updateTopicsWithDeletedMessages$11(this.c, this.d, this.e, this.f);
                break;
            default:
                this.b.lambda$updateTopicsWithDeletedMessages$12(this.c, this.d, this.e, this.f);
                break;
        }
    }
}
