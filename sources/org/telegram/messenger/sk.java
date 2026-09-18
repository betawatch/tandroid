package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final /* synthetic */ class sk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TopicsController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;

    public /* synthetic */ sk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.a = i10;
        this.b = topicsController;
        this.c = j3;
        this.d = arrayList;
        this.e = z10;
        this.f = j10;
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
