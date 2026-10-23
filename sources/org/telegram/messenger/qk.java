package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class qk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TopicsController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;

    public /* synthetic */ qk(TopicsController topicsController, long j10, ArrayList arrayList, boolean z10, long j11, int i10) {
        this.a = i10;
        this.b = topicsController;
        this.c = j10;
        this.d = arrayList;
        this.e = z10;
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
