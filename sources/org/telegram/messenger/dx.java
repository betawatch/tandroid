package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class dx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rz b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ dx(rz rzVar, long j10, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = rzVar;
        this.c = j10;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getMessagesController().j3(this.d, this.c);
                break;
            case 1:
                this.b.getMessagesController().j3(this.d, this.c);
                break;
            default:
                this.b.getMessagesController().j3(this.d, this.c);
                break;
        }
    }
}
