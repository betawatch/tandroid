package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class sk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TopicsController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;

    public /* synthetic */ sk(TopicsController topicsController, long j10, ArrayList arrayList, boolean z10, long j11, int i10) {
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
