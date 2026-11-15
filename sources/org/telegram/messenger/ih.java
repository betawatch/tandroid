package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class ih implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pi b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ String d;

    public /* synthetic */ ih(pi piVar, ArrayList arrayList, String str, int i7) {
        this.a = i7;
        this.b = piVar;
        this.c = arrayList;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g0.h3(new ih(this.b, this.c, this.d, 2));
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
