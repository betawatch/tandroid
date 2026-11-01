package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class jh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ si b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ String d;

    public /* synthetic */ jh(si siVar, ArrayList arrayList, String str, int i10) {
        this.a = i10;
        this.b = siVar;
        this.c = arrayList;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i0.g3(new jh(this.b, this.c, this.d, 2));
                break;
            case 1:
                ArrayList arrayList = this.c;
                this.b.c(this.d, arrayList);
                break;
            default:
                ArrayList arrayList2 = this.c;
                this.b.c(this.d, arrayList2);
                break;
        }
    }
}
